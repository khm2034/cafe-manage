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
        <link rel="stylesheet" href="css/custom.css">
    </head>
    <body>
    	<nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">OTO CAFE</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="manOrder">주문목록</a></li>
            <li><a href="manList">상품리스트</a></li>
            <li><a href="manSeat">좌석관리</a></li>
            <li><a href="manUser">회원관리</a></li>
            <li><a href="manStock">재고관리</a></li>
            <li><a href="manProfit">판매실적</a></li>
            <li><a href="/jspweb/">로그아웃</a></li>
          </ul>
        </div>
      </div>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar form-left-nav">
            <li><a href="manOrder">주문목록</a></li>
            <li><a href="manList">상품리스트</a></li>
            <li class="active"><a href="manSeat">좌석관리<span class="sr-only">(current)</span></a></li>
            <li><a href="manUser">회원관리</a></li>
            <li><a href="manStock">재고관리</a></li>
            <li><a href="manProfit">판매실적</a></li>
          </ul>
        </div>
        
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <image class="img-responsive center-block img-rounded" src = "images/main_banner.jpg">
            <div class="form-subject">
               	좌석관리
            </div>
            <hr class="form-hr">
          
          <div class="table-responsive">
            <table class="table table-striped">
              <thead class="form-thead">
                <tr>
                  <td class="counter">
                    <button class="btn btn-default manBtn" disabled="true">카운터</button>
                  </td>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td class="seat">
                    <button type="button" id="1" name="1" value="1" class="btn btn-default" onclick="seatClick(this);">1</button>
                    <button type="button" id="2" name="2" value="2" class="btn btn-default" onclick="seatClick(this);">2</button>
                    <div class="seat-interval"></div>
                    <button type="button" id="3" name="3" value="3" class="btn btn-default" onclick="seatClick(this);">3</button>
                    <button type="button" id="4" name="4" value="4" class="btn btn-default" onclick="seatClick(this);">4</button>
                    <div class="seat-interval"></div>
                    <button type="button" id="5" name="5" value="5" class="btn btn-default" onclick="seatClick(this);">5</button>
                    <button type="button" id="6" name="6" value="6" class="btn btn-default" onclick="seatClick(this);">6</button>
                    <div class="seat-interval"></div>
                    <button type="button" id="7" name="7" value="7" class="btn btn-default" onclick="seatClick(this);">7</button>
                    <button type="button" id="8" name="8" value="8" class="btn btn-default" onclick="seatClick(this);">8</button>
                  </td>
                </tr>
                <tr>
                  <td class="seat">
                      <button type="button" id="9" name="9" value="9" class="btn btn-default" onclick="seatClick(this);">9</button>
                      <button type="button" id="10" name="10" value="10" class="btn btn-default" onclick="seatClick(this);">10</button>
                      <div class="seat-interval"></div>
                      <button type="button" id="11" name="11" value="11" class="btn btn-default" onclick="seatClick(this);">11</button>
                      <button type="button" id="12" name="12" value="12" class="btn btn-default" onclick="seatClick(this);">12</button>
                      <div class="seat-interval"></div>
                      <button type="button" id="13" name="13" value="13" class="btn btn-default" onclick="seatClick(this);">13</button>
                      <button type="button" id="14" name="14" value="14" class="btn btn-default" onclick="seatClick(this);">14</button>
                      <div class="seat-interval"></div>
                      <button type="button" id="15" name="15" value="15" class="btn btn-default" onclick="seatClick(this);">15</button>
                      <button type="button" id="16" name="16" value="16" class="btn btn-default" onclick="seatClick(this);">16</button>
                  </td>
                </tr>
                <tr>
                  <td class="seat">
                      <button type="button" id="17" name="17" value="17" class="btn btn-default" onclick="seatClick(this);">17</button>
                      <button type="button" id="18" name="18" value="18" class="btn btn-default" onclick="seatClick(this);">18</button>
                      <div class="seat-interval"></div>
                      <button type="button" id="19" name="19" value="19" class="btn btn-default" onclick="seatClick(this);">19</button>
                      <button type="button" id="20" name="20" value="20" class="btn btn-default" onclick="seatClick(this);">20</button>
                      <div class="seat-interval"></div>
                      <button type="button" id="21" name="21" value="21" class="btn btn-default" onclick="seatClick(this);">21</button>
                      <button type="button" id="22" name="22" value="22" class="btn btn-default" onclick="seatClick(this);">22</button>
                      <div class="seat-interval"></div>
                      <button type="button" id="23" name="23" value="23" class="btn btn-default" onclick="seatClick(this);">23</button>
                      <button type="button" id="24" name="24" value="24" class="btn btn-default" onclick="seatClick(this);">24</button>
                    </td>
                </tr>
                <tr>
                  <td class="seat">
                      <button type="button" id="25" name="25" value="25" class="btn btn-default" onclick="seatClick(this);">25</button>
                      <button type="button" id="26" name="26" value="26" class="btn btn-default" onclick="seatClick(this);">26</button>
                      <div class="seat-interval"></div>
                      <button type="button" id="27" name="27" value="27" class="btn btn-default" onclick="seatClick(this);">27</button>
                      <button type="button" id="28" name="28" value="28" class="btn btn-default" onclick="seatClick(this);">28</button>
                      <div class="seat-interval"></div>
                      <button type="button" id="29" name="29" value="29" class="btn btn-default" onclick="seatClick(this);">29</button>
                      <button type="button" id="30" name="30" value="30" class="btn btn-default" onclick="seatClick(this);">30</button>
                      <div class="seat-interval"></div>
                      <button type="button" id="31" name="31" value="31" class="btn btn-default" onclick="seatClick(this);">31</button>
                      <button type="button" id="32" name="32" value="32" class="btn btn-default" onclick="seatClick(this);">32</button>
                    </td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
    
    <div class="modal fade bs-example-modal-sm" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	  <div class="modal-dialog modal-sm">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">좌석 취소</h4>
	      </div>
	      <div class="modal-body">
	        	선택하신 좌석을 취소하겠습니까?
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
	        <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="deleteSeat();">확인</button>
	        <input type="text" id="tmpElm" style="display:none;" value="">
	      </div>
	    </div>
	  </div>
	</div>
    
        <script src= "https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.js"></script>

        <script>
        	var seatCount = parseInt('${seatCount}');
        
			$(document).ready(function(){
				<c:forEach var="row" items="${list}">
				var tmp = "#" + '${row.seatNum}';
			
				$(tmp).attr('onclick', "");
				$(tmp).attr('onclick', "deleteSeatClick(this)")
				$(tmp).css("background-color", "#ddd");
				$(tmp).attr('disabled', false);
				</c:forEach>
				
				setInterval(checkInsert, 1000);
			});
			
			function seatClick(elm){
				console.log(elm);
				var query = {num:$(elm).val()};
				
				$.ajax({
					url : "manSeat/insert",
					type : "post",
					data : query,
					success : function(data) {
						if(data == 0){
							$(elm).css("background-color", "#ddd");
							$(elm).attr('onclick', "");//.click(deleteSeatClick(elm));
							$(elm).attr('onclick', "deleteSeatClick(this)");
						}
					}
				});
			}
				
			function deleteSeatClick(elm){
				
				modalInit($(elm).attr('id'));
				
				$('#myModal').modal('show');
				
			}
			
			function modalInit(id){
				$("#tmpElm").val(id);
			}
			
			function deleteSeat(){
				var id = $("#tmpElm").val();
				console.log(id);
				var query = {num:$("#"+id).val()};
				
				$.ajax({
					url : "manSeat/delete",
					type : "post",
					data : query,
					success : function(data) {
						if(data == 0){
							$("#"+id).css("background-color", "#fff");
							$("#"+id).attr('onclick', "");//.click(seatClick(elm));
							$("#"+id).attr('onclick', "seatClick(this)");
						}
					}
				});	
			}
			
			function checkInsert(){
        		$.ajax({
					url : "manSeat/checkCount",
					success : function(data) {
						if(seatCount != data)
							location.reload();
					}
				});	
        	}
       
        </script>
    </body>
</html>