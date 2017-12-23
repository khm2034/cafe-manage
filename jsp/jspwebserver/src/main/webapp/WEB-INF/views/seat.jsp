<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
      <meta charset = "UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="description" content="">
      <meta name="author" content="">
      <title>OTO CAFE</title>
      <link rel="stylesheet" href="css/bootstrap.css">
      <link rel="stylesheet" href="css/dashboard.css">
      <link rel="stylesheet" type="text/css"href="css/custom.css">
    </head>
    <body style="padding-top:20px !important; background-color:mintcream">
            
        <div class="form-subject">
                좌석예약
        </div>
        <hr class="form-hr" style="border-color:pink !important;">
    
        <div class="table-responsive"style="border-color:none;">
            <table class="table table-striped">
            <thead class="form-thead">
                <tr>
                <td class="counter" style="width:50%; padding-left:5px !important; padding-right:5px !important;">
                    <button class="btn btn-default userBtn" disabled="true">카운터</button>
                </td>
                </tr>
            </thead>
            <tbody>
                <tr style="background-color:mintcream;">
                <td class="seat">
                    <div class="col-xs-3" style="padding-left:0px; padding-right:0px; width:22.5%;">
                        <button type="button" id="1" name="1" value="1" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">1</button>
                        <button type="button" id="2" name="2" value="2" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">2</button>
                    </div>
                    <div class="col-xs-1" style="padding-left:0px; padding-right:0px; width:3%;" ></div>
                    <div class="col-xs-3" style="padding-left:0px; padding-right:0px; width:22.5%;">
                        <button type="button" id="3" name="3" value="3" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">3</button>
                        <button type="button" id="4" name="4" value="4" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">4</button>
                    </div>
                    <div class="col-xs-1" style="padding-left:0px; padding-right:0px; width:3%;" ></div>
                    <div class="col-xs-3" style="padding-left:0px; padding-right:0px; width:22.5%;">
                        <button type="button" id="5" name="5" value="5" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">5</button>
                        <button type="button" id="6" name="6" value="6" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">6</button>
                    </div>
                    <div class="col-xs-1" style="padding-left:0px; padding-right:0px; width:3%;" ></div>
                    <div class="col-xs-3" style="padding-left:0px; padding-right:0px; width:22.5%;">
                        <button type="button" id="7" name="7" value="7" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">7</button>
                        <button type="button" id="8" name="8" value="8" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">8</button>
                    </div>
                </td>
                </tr>
                <tr>
                <td class="seat">
                    <div class="col-xs-3" style="padding-left:0px; padding-right:0px; width:22.5%;">
                        <button type="button" id="9" name="9" value="9" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">9</button>
                        <button type="button" id="10" name="10" value="10" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">10</button>
                    </div>
                    <div class="col-xs-1" style="padding-left:0px; padding-right:0px; width:3%;" ></div>
                    <div class="col-xs-3" style="padding-left:0px; padding-right:0px; width:22.5%;">
                        <button type="button" id="11" name="11" value="11" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">11</button>
                        <button type="button" id="12" name="12" value="12" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">12</button>
                    </div>
                    <div class="col-xs-1" style="padding-left:0px; padding-right:0px; width:3%;" ></div>
                    <div class="col-xs-3" style="padding-left:0px; padding-right:0px; width:22.5%;">
                        <button type="button" id="13" name="13" value="13" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">13</button>
                        <button type="button" id="14" name="14" value="14" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">14</button>
                    </div>
                    <div class="col-xs-1" style="padding-left:0px; padding-right:0px; width:3%;" ></div>
                    <div class="col-xs-3" style="padding-left:0px; padding-right:0px; width:22.5%;">
                        <button type="button" id="15" name="15" value="15" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">15</button>
                        <button type="button" id="16" name="16" value="16" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">16</button>
                    </div>
                </td>
                </tr>
                <tr style="background-color:mintcream;">
                <td class="seat">
                    <div class="col-xs-3" style="padding-left:0px; padding-right:0px; width:22.5%;">
                        <button type="button" id="17" name="17" value="17" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">17</button>
                        <button type="button" id="18" name="18" value="18" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">18</button>
                    </div>
                    <div class="col-xs-1" style="padding-left:0px; padding-right:0px; width:3%;" ></div>
                    <div class="col-xs-3" style="padding-left:0px; padding-right:0px; width:22.5%;">
                        <button type="button" id="19" name="19" value="19" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">19</button>
                        <button type="button" id="20" name="20" value="20" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">20</button>
                    </div>
                    <div class="col-xs-1" style="padding-left:0px; padding-right:0px; width:3%;" ></div>
                    <div class="col-xs-3" style="padding-left:0px; padding-right:0px; width:22.5%;">
                        <button type="button" id="21" name="21" value="21" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">21</button>
                        <button type="button" id="22" name="22" value="22" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">22</button>
                    </div>
                    <div class="col-xs-1" style="padding-left:0px; padding-right:0px; width:3%;" ></div>
                    <div class="col-xs-3" style="padding-left:0px; padding-right:0px; width:22.5%;">
                        <button type="button" id="23" name="23" value="23" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">23</button>
                        <button type="button" id="24" name="24" value="24" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">24</button>
                    </div>
                </tr>
                <tr>
                <td class="seat">
                    <div class="col-xs-3" style="padding-left:0px; padding-right:0px; width:22.5%;">
                        <button type="button" id="25" name="25" value="25" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">25</button>
                        <button type="button" id="26" name="26" value="26" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">26</button>
                    </div>
                    <div class="col-xs-1" style="padding-left:0px; padding-right:0px; width:3%;" ></div>
                    <div class="col-xs-3" style="padding-left:0px; padding-right:0px; width:22.5%;">
                        <button type="button" id="27" name="27" value="27" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">27</button>
                        <button type="button" id="28" name="28" value="28" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">28</button>
                    </div>
                    <div class="col-xs-1" style="padding-left:0px; padding-right:0px; width:3%;" ></div>
                    <div class="col-xs-3" style="padding-left:0px; padding-right:0px; width:22.5%;">
                        <button type="button" id="29" name="29" value="29" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">29</button>
                        <button type="button" id="30" name="30" value="30" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">30</button>
                    </div>
                    <div class="col-xs-1" style="padding-left:0px; padding-right:0px; width:3%;" ></div>
                    <div class="col-xs-3" style="padding-left:0px; padding-right:0px; width:22.5%;">
                        <button type="button" id="31" name="31" value="31" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">31</button>
                        <button type="button" id="32" name="32" value="32" class="btn btn-default" style="width:45%; height:50px;" onclick="seatClick(this);">32</button>
                    </div>
                    </td>
                </tr>
            </tbody>
            <tfoot>
                <tr>
                    <td>
                        <div style="text-align:center;">
                        	<div style="display:inline-block;">
                                <button type="button" class="col-xs-1" style="background-color:chartreuse; height:30px;" disabled="true"></button>
                                <label class="col-xs-2" style="font-size:20px;">예약한 좌석</label>
                            </div>
                            <div style="display:inline-block;">
                                <button type="button" class="col-xs-1" style="background-color: coral; height:30px;" disabled="true"></button>
                                <label class="col-xs-2" style="font-size:20px;">선택</label>
                            </div>
                            <div style="display:inline-block;">
                                <button type="button" class="col-xs-1" style="background-color:aqua; height:30px;" disabled="true"></button>
                                <label class="col-xs-2" style="font-size:20px;">사용 중</label>
                            </div>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td style="border-top:0px; padding-top:0px;">
                        <div style="text-align:center;">
                            <button type="button" class="btn btn-default" style="width:50%; font-size:20px;" onclick="booking();">확인</button>
                        </div>
                    </td>
                </tr>
            </tfoot>
            </table>
        </div>

        <script src= "https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.js"></script>
        <script>
        	var userNum = null;
        	var selectedSeatNum = 0;

	        $(document).ready(function(){
				init();
			});
			
			function init(){
				<c:forEach var="row" items="${list}">
					var tmp = "#" + '${row.seatNum}';
				
					if('${row.userNum}' == userNum){
						$(tmp).css("background-color", "chartreuse");
					}else{
						$(tmp).css("background-color", "aqua");
					}
					$(tmp).attr('disabled', true);
				
				</c:forEach>
			}
			
			function setUserNum(num){
				userNum = num;
				init();
			}
			
			function seatClick(elm){
				if(selectedSeatNum == 0){
					$(elm).css("background-color","coral");
					selectedSeatNum = $(elm).val();
				}
				if($(elm).val() != selectedSeatNum){
					$('#' + selectedSeatNum).css("background-color","#fff");
					$(elm).css("background-color","coral");
					selectedSeatNum = $(elm).val();
				}
			}
			
			function booking(){
				var query = {seatNum: selectedSeatNum, userNum: userNum};
			
				$.ajax({
					url : "seat/insert",
					type : "post",
					data : query,
					success : function(data) {
						if(data == 0){
							//document.location.reload();
							//window.open('http://52.79.219.34:8080/jspweb/seat', '_self', false);
							$('#' + selectedSeatNum).css("background-color", "chartreuse");
							$('#' + selectedSeatNum).attr('disabled', true);
							selectedSeatNum = 0;
							
							alert("예약하셨습니다.");
							//window.location.reload();
						}
						else if(data != 0){
							$('#' + data).css("background-color","#fff");
							$('#' + data).attr('disabled', false);
							$('#' + selectedSeatNum).css("background-color", "chartreuse");
							$('#' + selectedSeatNum).attr('disabled', true);
							selectedSeatNum=0;
							alert("자리를 변경하셨습니다.");
						}
					}
				});
			}
		</script>
    </body>
</html>