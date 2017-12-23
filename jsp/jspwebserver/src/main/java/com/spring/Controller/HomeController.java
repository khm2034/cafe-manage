package com.spring.Controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.io.File;
import java.sql.Date;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;

import com.spring.DAO.ManagerDAOImpl;
import com.spring.Model.ManagerVO;
import com.spring.Model.ProductVO;
import com.spring.Model.ProfitInfoVO;
import com.spring.Model.ProfitItemVO;
import com.spring.Model.ProfitVO;
import com.spring.Model.SeatVO;
import com.spring.Model.OrderVO;
import com.spring.Model.StockVO;
import com.spring.Model.UserVO;
import com.spring.Model.OrderItemVO;
import com.spring.Util.FunctionUtil;
import com.spring.Util.ProfitUtil;
import com.spring.Util.OrderInfo;
import com.spring.Util.SecuritySHA256Util;
import com.spring.service.ManagerService;
import com.spring.service.UserService;
import com.spring.service.ProductService;

/**
 * Handles requests for the application home page.
 */

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private ManagerVO loginUser;
	
	@Resource(name="uploadPath")
    String uploadPath;
	
	@Inject
	UserService userService;
	
	@Inject
	ManagerService managerService;
	
	@Inject
	ProductService productService;
	
	FunctionUtil functionUtil = new FunctionUtil();
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		return "home";
	}
	
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String join() {
		//logger.info("Welcome home! The client locale is {}.", locale);
		
		return "join";
	}
	
	@RequestMapping(value = "managerInsert", method=RequestMethod.POST)
	public String managerInsert(HttpServletRequest request)
	{
		Random ran = new Random();
		int managerNum;
		while(true){
			managerNum  = ran.nextInt(999999999) + 1;
			if(managerService.checkNum(managerNum))
				break;
		}
		SecuritySHA256Util securityUtil = new SecuritySHA256Util();
		ManagerVO vo = new ManagerVO();
		vo.setManagerNum(managerNum);
		vo.setManagerId((String)request.getParameter("id"));
		vo.setManagerPw(securityUtil.encryptSHA256((String)request.getParameter("pw")));
		vo.setManagerName((String)request.getParameter("name"));
		vo.setManagerEmail((String)request.getParameter("email"));
		vo.setManagerPhone((String)request.getParameter("phone"));
		vo.setManagerBirth(Date.valueOf(request.getParameter("birth")));
		vo.setManagerGender((String)request.getParameter("gender"));
		
		Calendar cal = Calendar.getInstance();
		String regDate = String.valueOf(cal.get(Calendar.YEAR)) +"-"
				+ String.valueOf(cal.get(Calendar.MONTH)+1)+"-"
				+ String.valueOf(cal.get(Calendar.DATE));
		vo.setManagerRegDate(Date.valueOf(regDate));
		
		managerService.insertManager(vo);
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "managerLogin", method=RequestMethod.POST)
	public String managerLogin(HttpServletRequest request)
	{
		ManagerVO vo = new ManagerVO();
		SecuritySHA256Util securityUtil = new SecuritySHA256Util();
		vo.setManagerId((String)request.getParameter("id"));
		vo.setManagerPw(securityUtil.encryptSHA256((String)request.getParameter("pw")));
		System.out.println(vo.toString());
		loginUser =  managerService.loginManager(vo);
		
		if(loginUser != null) {
			System.out.println(loginUser.toString());
			return "main";
		}
		else
			return "redirect:/";
	}
	
	@RequestMapping(value = "join/idCheck", method=RequestMethod.POST)
	@ResponseBody
	public int managerDuplication(HttpServletRequest request){
		
		String id = request.getParameter("id");
		System.out.println(id);
		List<ManagerVO> list = managerService.duplication(id);
		System.out.println(list.toString());
		
		if(list.size() == 0){
			System.out.println(list.size() + "z");
			return -1;
		} else {
			System.out.println(list.size() + "zz");
			return 1;
		}
	}
	
	@RequestMapping(value = "main")
	public String main() {
		//logger.info("Welcome home! The client locale is {}.", locale);
		
		return "main";
	}
	
	@RequestMapping(value = "manOrder")
	public String manOrder(Model model) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		List<OrderInfo> list = new ArrayList<OrderInfo>() ;
		List<OrderVO> orderList = userService.getOrderList(0);
		
		for(int i=0; i<orderList.size(); i++){
			int orderNum = orderList.get(i).getOrderNum();
			List<OrderItemVO> coffee = userService.getOrderItemList(orderNum, 1);
			List<OrderItemVO> beverage = userService.getOrderItemList(orderNum, 2);
			List<OrderItemVO> dessert = userService.getOrderItemList(orderNum, 3);
			
			OrderInfo tmp = new OrderInfo();
			tmp.setDate(orderList.get(i).getOrderDate());
			tmp.setOrderNum(orderNum);
			tmp.setId(userService.searchUserId(orderList.get(i).getUserNum()));
			tmp.setInfo(coffee);
			tmp.setInfo(beverage);
			tmp.setInfo(dessert);
			list.add(tmp);
		}
		
		model.addAttribute("list", list);
		
		model.addAttribute("itemLength", list.size());
		return "manOrder";
	}
	
	@RequestMapping(value = "manOrder/checkCount")
	@ResponseBody
	public int checkCount() {
		List<OrderVO> list = userService.getOrderList(0);
		
		return list.size();
	}
	
	@RequestMapping(value = "manOrder/submit")
	@ResponseBody
	public int manOrderSubmit(HttpServletRequest request) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		OrderVO vo = new OrderVO();
		//vo.setDate(Date.valueOf((String)request.getParameter("date")));
		int orderNum = Integer.parseInt(request.getParameter("orderNum"));
		vo.setOrderNum(orderNum);
		//System.out.println(vo.getDate());
		System.out.println(vo.getOrderNum());
		System.out.println(request.getParameter("type"));
		if(request.getParameter("type").equals("complete")) {
			vo.setComplete(1);
			userService.updateOrder(vo);
			OrderVO tmpOrderVo = userService.searchOrder(orderNum);
			UserVO tmpUserVo = userService.searchUser(tmpOrderVo.getUserNum());
			
			ProfitVO profitVo = new ProfitVO();
			
			int profitId = managerService.getNextProfitId();
			profitVo.setId(profitId);
			profitVo.setDate(tmpOrderVo.getOrderDate());
			profitVo.setGender(tmpUserVo.getUserGender());
			
			Calendar cal = Calendar.getInstance();
			int year = cal.get(Calendar.YEAR);
			String[] arrUserBirt = tmpUserVo.getUserBirth().split("-");
			//int userBirth = Integer.parseInt(tmpUserVo.getUserBirth());
			int age = year - Integer.parseInt(arrUserBirt[0]) +1;
			profitVo.setAge(age);
			
//			profitVo.setMenu(tmpOrderVo.getMenu());
			profitVo.setPrice(tmpOrderVo.getTotalPrice());
			
			List<OrderItemVO> coffee = userService.getOrderItemList(orderNum, 1);
			List<OrderItemVO> beverage = userService.getOrderItemList(orderNum, 2);
			List<OrderItemVO> dessert = userService.getOrderItemList(orderNum, 3);
			
			List<ProfitItemVO> profitItemList = new ArrayList<ProfitItemVO>(); 
			
			profitItemList.addAll(functionUtil.getProfitItem(coffee, profitId));
			profitItemList.addAll(functionUtil.getProfitItem(beverage, profitId));
			profitItemList.addAll(functionUtil.getProfitItem(dessert, profitId));

			managerService.insertProfit(profitVo);
			
			for(int i = 0; i<profitItemList.size(); i++) {
				managerService.insertProfitItem(profitItemList.get(i));
			}
			
		} else if(request.getParameter("type").equals("cancle")) {
			vo.setComplete(2);
			userService.updateOrder(vo);
		}
		
		return 1;					
	}
	
	@RequestMapping(value = "manList")
	public String manList(Model model) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		List<ProductVO> cList = functionUtil.settingNum(productService.productList(1));
		List<ProductVO> bList = functionUtil.settingNum(productService.productList(2));
		List<ProductVO> dList = functionUtil.settingNum(productService.productList(3));
		
		model.addAttribute("cList", cList);
		model.addAttribute("bList", bList);
		model.addAttribute("dList", dList);
		return "manList";
	}
	
	/*@RequestMapping(value = "manList", method=RequestMethod.POST, params = {"name"})
	public void manList(Model model, @RequestParam("name")String name) {
		ProductVO tmp = new ProductVO();
		tmp.setName(name);
		ProductVO vo = productService.searchProduct(tmp);
		System.out.println(vo.toString());
		model.addAttribute("vo", vo);
	}*/
	
	@RequestMapping(value="manList/productInsert", method=RequestMethod.GET, headers = ("content-type=multipart/*"))
    public void productInsert(){
        // upload/uploadForm.jsp(업로드 페이지)로 포워딩
    }
	
	@RequestMapping(value = "manList/productInsert", method=RequestMethod.POST, headers = ("content-type=multipart/*"))
	public String productInsert(HttpServletRequest request, @RequestParam("file")MultipartFile file,
			@RequestParam("sPrice")String sPirce, @RequestParam("rPrice")String rPirce,
			@RequestParam("lPrice")String lPirce, @RequestParam("name")String name,
			@RequestParam("uuid")String id, @RequestParam("kinds")String kinds,
			@RequestParam("radioVal")String type) throws Exception
	{
		ProductVO vo = new ProductVO();
		//boolean isNew = Boolean.parseBoolean(isNewS);
		//System.out.println(file);
		if(id.equals("blank")) {
			System.out.println("1");
			UUID uuid = UUID.randomUUID();
			//id
			vo.setId(uuid.toString());
			String originalFileName = file.getOriginalFilename();
			//oringinalname
			//vo.setOriginalName(originalFileName);
			
			String saveFileName = uuid.toString() + "_img." 
					+ originalFileName.substring(originalFileName.lastIndexOf(".") +1, originalFileName.length());
			//savefilename
			vo.setSaveFileName(saveFileName);
			
			File target = new File(request.getSession().getServletContext().getRealPath("/") + uploadPath, saveFileName);
			
			FileCopyUtils.copy(file.getBytes(), target);
			//absoluteURL
			System.out.println(target.getPath());
			vo.setAbsoluteURL(target.getPath());
			//imageURL
			vo.setImageURL("images/upload/" + saveFileName);
			
			vo.setName(name); 
			vo.setsPrice(Integer.parseInt(sPirce));
			vo.setrPrice(Integer.parseInt(rPirce));
			vo.setlPrice(Integer.parseInt(lPirce));
			vo.setKinds(Integer.parseInt(kinds));
			vo.setType(type);
			productService.insertProduct(vo);
		}
		else {
			System.out.println("2");
			vo.setId(id);
			//String originalFileName = file.getOriginalFilename();
			//oringinalname
			//vo.setOriginalName(originalFileName);
			
			if(!file.isEmpty()) {
				String originalFileName = file.getOriginalFilename();
				String saveFileName = id.toString() + "_img." 
						+ originalFileName.substring(originalFileName.lastIndexOf(".") +1, originalFileName.length());;
				//savefilename
				vo.setSaveFileName(saveFileName);
				
				File target = new File(request.getSession().getServletContext().getRealPath("/") + uploadPath, saveFileName);
				
				FileCopyUtils.copy(file.getBytes(), target);
				//absoluteURL
				vo.setAbsoluteURL(target.getPath());
				//imageURL
				vo.setImageURL("images/upload/" + saveFileName);
			}
			else {
				vo.setImageURL(null);
			}
			vo.setName(name);
			vo.setsPrice(Integer.parseInt(sPirce));
			vo.setrPrice(Integer.parseInt(rPirce));
			vo.setlPrice(Integer.parseInt(lPirce));
			vo.setKinds(Integer.parseInt(kinds));
			vo.setType(type);
			productService.updateProduct(vo);
			
		}
			
			
		return "redirect:/manList";
	}
	
	@RequestMapping(value = "manList/delete", method=RequestMethod.POST)
	public String productDelete(@RequestParam("delId")String id, @RequestParam("delkinds")String kinds) {
		
		System.out.println(id);
		ProductVO vo = new ProductVO();
		
		vo.setId(id);
		vo.setKinds(Integer.parseInt(kinds));
		
		productService.deleteProduct(vo);
		
		return "redirect:/manList";
	}
	
	@RequestMapping(value = "manUser")
	public String manUser(Model model) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		List<UserVO> list = userService.userList();
		
		model.addAttribute("list", list);
		return "manUser";
	}
	
	@RequestMapping(value = "manStock")
	public String manStock(Model model) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		List<StockVO> list = productService.stockList();
		
		for(int i = 0; i < list.size(); i++)
			list.get(i).setNum(i+1);
		
		model.addAttribute("list", list);
		return "manStock";
	}
	
	@RequestMapping(value = "insertStock")
	public String stockInsert(HttpServletRequest request) {
		
		StockVO vo = new StockVO();
		System.out.println(request.getParameter("id"));
		if(request.getParameter("id").equals("blank")) {
			System.out.println("insert");
			UUID uuid = UUID.randomUUID();
			uuid.getLeastSignificantBits();
			
			vo.setId(uuid.toString());
			vo.setDate(Date.valueOf((String)request.getParameter("date")));
			vo.setName((String)request.getParameter("name"));
			vo.setUnitPrice(Integer.parseInt(request.getParameter("unitPrice")));
			vo.setAmount(Integer.parseInt(request.getParameter("amount")));
			
			productService.insertStock(vo);
		}
		else {
			System.out.println("update");
			vo.setId(request.getParameter("id"));
			vo.setDate(Date.valueOf((String)request.getParameter("date")));
			vo.setName((String)request.getParameter("name"));
			vo.setUnitPrice(Integer.parseInt(request.getParameter("unitPrice")));
			vo.setAmount(Integer.parseInt(request.getParameter("amount")));
			
			productService.updateStock(vo);
		}
		
		return "redirect:/manStock";
	}

	@RequestMapping(value = "manStock/delete", method=RequestMethod.POST)
	public String stockDelete(@RequestParam("delId")String id) {
		
		StockVO vo = new StockVO();
		vo.setId(id);
		
		productService.deleteStock(vo);
		
		return "redirect:/manStock";
	}
	
	@RequestMapping(value = "manSeat")
	public String manSeat(Model model) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		List<SeatVO> list = managerService.seatList();
		
		model.addAttribute("list", list);
		model.addAttribute("seatCount", list.size());
		return "manSeat";
	}
	
	@RequestMapping(value = "manSeat/checkCount")
	@ResponseBody
	public int checkSeatCount() {
		List<SeatVO> list = managerService.seatList();
		
		return list.size();
	}
	
	@RequestMapping(value = "manSeat/insert", method=RequestMethod.POST)
	@ResponseBody
	public int seatInsert(HttpServletRequest request) {
		
		int seatNum = Integer.parseInt(request.getParameter("num"));
		SeatVO vo = new SeatVO();
		
		vo.setSeatNum(seatNum);
		vo.setUserId("guest");
		vo.setUserNum(0);
		System.out.println(vo.getSeatNum() + ", " + vo.getUserId());
		System.out.println("insertSeat!!");
		managerService.insertSeat(vo);
		
		return 0;
	}
	
	@RequestMapping(value = "manSeat/delete", method=RequestMethod.POST)
	@ResponseBody
	public int seatDelete(HttpServletRequest request) {
		
		int seatNum = Integer.parseInt(request.getParameter("num"));
		SeatVO vo = new SeatVO();
		
		vo.setSeatNum(seatNum);
		//vo.setId("guest");
		//System.out.println(vo.getSeatNum() + ", " + vo.getId());
		System.out.println("deleteSeat!!");
		managerService.deleteSeat(vo);
		
		return 0;
	}
	
	@RequestMapping(value = "order")
	public String order(Model model) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		List<ProductVO> cList[] = functionUtil.divideList(productService.productList(1));
		List<ProductVO> cListHot = cList[0];
		List<ProductVO> cListIce = cList[1];
		List<ProductVO> bList[] = functionUtil.divideList(productService.productList(2));
		List<ProductVO> bListHot = bList[0];
		List<ProductVO> bListIce = bList[1];
		List<ProductVO> dList = functionUtil.settingNum(productService.productList(3));
		//System.out.println(list.);
		model.addAttribute("cListHot", cListHot);
		model.addAttribute("cListIce", cListIce);
		model.addAttribute("bListHot", bListHot);
		model.addAttribute("bListIce", bListIce);
		model.addAttribute("dList", dList);
		return "order";
	}

	@RequestMapping(value = "order/insert", method=RequestMethod.POST)
	@ResponseBody
	public int orderInsert(HttpServletRequest request) {
		
		int userNum = Integer.parseInt(request.getParameter("userNum"));
		String total = request.getParameter("total");
		
		String[] arrMenu = request.getParameter("menu").split(",");
		String[] arrFullMenu = request.getParameter("fullMenu").split(",");
		String[] arrCount = request.getParameter("count").split(",");
		String[] arrSize = request.getParameter("size").split(",");
		String[] arrType = request.getParameter("typeByItem").split(",");
		String[] arrTotalByItem = request.getParameter("totalByItem").split(",");
		String[] arrKind = request.getParameter("kind").split(",");
		
		//System.out.println(userNum + ", " + Arrays.toString(arrMenu) + ", " + Arrays.toString(arrFullMenu) + ", " + Arrays.toString(arrCount) + ", " + Arrays.toString(arrSize) + ", " + total + ", " + Arrays.toString(arrType));
		
		OrderVO vo = new OrderVO();
		vo.setUserNum(userNum);
		vo.setTotalPrice(Integer.parseInt(total));
		vo.setComplete(0);
		
		Calendar cal = Calendar.getInstance();
		String regDate = String.valueOf(cal.get(Calendar.YEAR)) +"-"
				+ String.valueOf(cal.get(Calendar.MONTH)+1)+"-"
				+ String.valueOf(cal.get(Calendar.DATE));
		vo.setOrderDate(Date.valueOf(regDate));
		
		System.out.println("date : " + vo.getOrderDate());
		int orderNum = userService.getNextOrderId();
		vo.setOrderNum(orderNum);
		userService.insertOrder(vo);
		System.out.println(orderNum);
		System.out.println(vo.getOrderNum());
		for(int i=0; i<arrMenu.length; i++) {
			
			OrderItemVO ivo = new OrderItemVO();
			System.out.println(arrKind[i]);
			ivo.setKind(Integer.parseInt(arrKind[i]));
			ivo.setOrderNum(vo.getOrderNum());
			ivo.setMenuId(productService.searchProductId(arrMenu[i],ivo.getKind()));
			ivo.setType(arrType[i]);
			System.out.println(ivo.getType());
			ivo.setPrice(Integer.parseInt(arrTotalByItem[i]));
			ivo.setSize(arrSize[i]);
			ivo.setCount(Integer.parseInt(arrCount[i]));
			
			userService.insertOrderItem(ivo);
		}
		
		return 1;
	}

	@RequestMapping(value = "seat")
	public String userSeat(Model model) {
		
		List<SeatVO> list = managerService.seatList();
		model.addAttribute("list", list);
		
		return "seat";
	}
	
	@RequestMapping(value = "seat/insert", method=RequestMethod.POST)
	@ResponseBody
	public int userSeatInsert(HttpServletRequest request) {
		
		int seatNum = Integer.parseInt(request.getParameter("seatNum"));
		int userNum = Integer.parseInt(request.getParameter("userNum"));
		int result = 0;
		
		SeatVO searchVO = userService.searchSeat(userNum);
		
		if(searchVO != null) {
			managerService.deleteSeat(searchVO);
			result = searchVO.getSeatNum();
		}
		
		//String userId = userService.searchUser(userNum).getUserID();
		
		SeatVO vo = new SeatVO();
		vo.setSeatNum(seatNum);
		vo.setUserNum(userNum);
		//vo.setUserId(userId);
		//System.out.println(vo.getSeatNum() + ", " + vo.getId());
		System.out.println("insertSeat!!");
		managerService.insertSeat(vo);
		
		return result;
	}
	
	@RequestMapping(value = "manProfit")
	public String manProfit(Model model) {
		
		List<ProfitVO> profitList = managerService.profitList();
		List<ProfitItemVO> profitItemList = managerService.profitItemList();
		List<ProductVO> coffeeList = productService.productList(1);
		List<ProductVO> beverageList = productService.productList(2);
		List<ProductVO> dessertList = productService.productList(3);
		
		ProfitUtil profitUtil = new ProfitUtil();
	
		//월별 수익
		int[] totalProfit = new int[12];
		for(int i=0; i<profitList.size(); i++) {
			String[] monthString = profitList.get(i).getDate().toString().split("-");
			int month = Integer.parseInt(monthString[1]);
			totalProfit[month-1] += profitList.get(i).getPrice();
		}
		model.addAttribute("totalProfit", totalProfit);
	
		//메뉴별 선호도
		HashMap<String, Integer> coffeeMap = new HashMap<String, Integer>();
		HashMap<String, Integer> beverageMap = new HashMap<String, Integer>();
		HashMap<String, Integer> dessertMap = new HashMap<String, Integer>();
		
		for(int i=0; i<coffeeList.size(); i++) {
			coffeeMap.put(coffeeList.get(i).getName(), 0);
		}
		for(int i=0; i<beverageList.size(); i++) {
			beverageMap.put(beverageList.get(i).getName(), 0);
		}
		for(int i=0; i<dessertList.size(); i++) {
			dessertMap.put(dessertList.get(i).getName(), 0);
		}
		
		for(int i=0; i<profitItemList.size(); i++) {
			
			String tmpMenuName = profitItemList.get(i).getMenuName();
			int count = profitItemList.get(i).getCount();
			
			if(coffeeMap.containsKey(tmpMenuName)) {
				coffeeMap.put(tmpMenuName, coffeeMap.get(tmpMenuName)+count);
			}else if(beverageMap.containsKey(tmpMenuName)) {
				beverageMap.put(tmpMenuName, beverageMap.get(tmpMenuName)+count);
			}else if(dessertMap.containsKey(tmpMenuName)) {
				dessertMap.put(tmpMenuName, dessertMap.get(tmpMenuName)+count);
			}
		}
		
		coffeeMap = profitUtil.sortMap(coffeeMap);
		beverageMap = profitUtil.sortMap(beverageMap);
		dessertMap = profitUtil.sortMap(dessertMap);
		
				
		HashMap<String, Integer> resultCoffeeMap = profitUtil.manufacturMap(coffeeMap);
		HashMap<String, Integer> resultBeverageMap = profitUtil.manufacturMap(beverageMap);
		HashMap<String, Integer> resultDessertMap = profitUtil.manufacturMap(dessertMap);
				
		model.addAttribute("coffeeMap", resultCoffeeMap);
		model.addAttribute("beverageMap", resultBeverageMap);
		model.addAttribute("dessertMap", resultDessertMap);
		
//		// 연령별 선호도
		HashMap<String, Integer> age10Map = profitUtil.getInfo(managerService.profitAgeInfo(10, 19));
		HashMap<String, Integer> age20Map = profitUtil.getInfo(managerService.profitAgeInfo(20, 29));
		HashMap<String, Integer> age30Map = profitUtil.getInfo(managerService.profitAgeInfo(30, 39));
		HashMap<String, Integer> age40Map = profitUtil.getInfo(managerService.profitAgeInfo(40, 49));
		HashMap<String, Integer> ageEtcMap = profitUtil.getInfo(managerService.profitAgeInfo(50, 100));
		

		age10Map = profitUtil.sortMap(age10Map);
		age20Map = profitUtil.sortMap(age20Map);
		age30Map = profitUtil.sortMap(age30Map);
		age40Map = profitUtil.sortMap(age40Map);
		ageEtcMap = profitUtil.sortMap(ageEtcMap);
		
		HashMap<String, Integer> resultAge10Map = profitUtil.manufacturMap(age10Map);
		HashMap<String, Integer> resultAge20Map = profitUtil.manufacturMap(age20Map);
		HashMap<String, Integer> resultAge30Map = profitUtil.manufacturMap(age30Map);
		HashMap<String, Integer> resultAge40Map = profitUtil.manufacturMap(age40Map);
		HashMap<String, Integer> resultAgeEtcMap = profitUtil.manufacturMap(ageEtcMap);
		
		model.addAttribute("age10Map", resultAge10Map);
		model.addAttribute("age20Map", resultAge20Map);
		model.addAttribute("age30Map", resultAge30Map);
		model.addAttribute("age40Map", resultAge40Map);
		model.addAttribute("ageEtcMap", resultAgeEtcMap);
		
//		//성별 선호도
		HashMap<String, Integer> maleMap = profitUtil.getInfo(managerService.profitGenderInfo("남자"));
		HashMap<String, Integer> femaleMap = profitUtil.getInfo(managerService.profitGenderInfo("여자"));
		
		maleMap = profitUtil.sortMap(maleMap);
		femaleMap = profitUtil.sortMap(femaleMap);
		
		HashMap<String, Integer> resultMaleMap = profitUtil.manufacturMap(maleMap);
		HashMap<String, Integer> resultFemaleMap = profitUtil.manufacturMap(femaleMap);
		
		model.addAttribute("maleMap", resultMaleMap);
		model.addAttribute("femaleMap", resultFemaleMap);

		return "manProfit";
	}

	
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "makeData")
	public void makeData() {

		Random r = new Random();
		
		for(int n=0; n<100; n++) {
			int id = managerService.getNextProfitId();
			int year = 2017;
			int month = r.nextInt(12)+1;
			int day;
			if(month == 2)
				day = r.nextInt(28)+1;
			else if(month == 1 || month == 3 || month == 5 || month == 1 || month == 7 ||
					month == 8 || month == 10 || month == 12) {
				day = r.nextInt(31)+1;
			}
			else
				day = r.nextInt(30)+1;
			
			//String date = String.valueOf(year) + "-" + String.valueOf(month) + "-" + String.valueOf(day);
			
			int genderInt = r.nextInt(2);
			String gender;
			if(genderInt == 1)
				gender = "남자";
			else
				gender = "여자";
			
			int age = r.nextInt(50) + 15;
			
			int price = 0; 
			
			List<ProductVO> coffeeList = productService.productList(1);
			List<ProductVO> beverageList = productService.productList(2);
			List<ProductVO> dessertList = productService.productList(3);
			List<ProductVO> list = new ArrayList<ProductVO>();
			List<ProfitItemVO> itemList = new ArrayList<ProfitItemVO>();
			
			list.addAll(coffeeList);
			list.addAll(beverageList);
			list.addAll(dessertList);
			
			int menuCount;
			if(list.size() >= 7)
				menuCount = r.nextInt(7)+1;
			else
				menuCount = r.nextInt(list.size())+1;
			List<Integer> ranNum = new ArrayList<Integer>();
			for(int i=0; i<list.size(); i++) {
				ranNum.add(i);
			}
			Collections.shuffle(ranNum);
			for(int i=0; i<menuCount; i++) {
				int tmp = ranNum.get(i);
				ProfitItemVO item = new ProfitItemVO();
				item.setProfitId(id);
				item.setMenuName(list.get(tmp).getName());
				int tmpCount = r.nextInt(5)+1;
				item.setCount(tmpCount);
				price += list.get(tmp).getrPrice() * tmpCount;
				
				itemList.add(item);
			}
			
			ProfitVO vo = new ProfitVO();
			vo.setId(id);
			vo.setDate(new Date(year, month-1, day));
			vo.setAge(age);
			vo.setGender(gender);
			vo.setPrice(price);
			
			managerService.insertProfit(vo);
			
			for(int i=0 ; i<itemList.size(); i++) {
				managerService.insertProfitItem(itemList.get(i));
			}

		}
	}
}
