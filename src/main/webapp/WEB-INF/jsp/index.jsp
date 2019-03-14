<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="itcast" uri="http://itcast.cn/common/"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet">
</head>
<style>
	#picture { 
			clear:both;
			margin: 0 auto;
			width:1000px;
			height:300px;
			background-image:url(${pageContext.request.contextPath }/img/123.jpg);
			 background-repeat: no-repeat;
    background-size: 100% 100%;
    -moz-background-size: 100% 100%;
		
		} 
	#context { 
			clear:both;
			margin: 0 auto;
			width:1000px;
			height:300px;  
		}
		.give-back-background {
								border: 0 solid #fff;
								border-top-width: 0;
								border-bottom-width: 0;
								height: 50%;
								width: 100%;
								padding-top: 3.0em;
								padding-bottom: 3.1em;
								background-color:#fafafa;
								margin:10px;
							}
		.main td{ height:350px;  border:#CCCCCC 0px solid;}
 img {
    width: 100%;
    height: 100%;
}
.td-div{
	width:170px;
	height:170px; 
	background-color:green;
}
button{
	border-color:white;
	color:white;
}
	</style>
	
	<script>
	 function previous(num){
			if(num==0){
				document.getElementById("bistinguishBetween").value=0;
			}else{
				document.getElementById("bistinguishBetween").value=1;
			}
		}
	
	</script>
<body>
  
  <body>
         <form action=""   method="POST">
			<div  class="give-back-background">
					<div id="picture"></div>
			</div>
		 
			<%--产品开始 --%>
				
			
			<div  class="give-back-background">
				<div id="context">
				  <table width="100%" border="0" cellspacing="0" cellpadding="0" class="main">
					<tr>
					<c:forEach var="item" items="${page.rows }">
						<td>
						 
							<div class="td-div">
						    <img src="/img/${item.productImagePath }"/> 
							 <span style="margin-top:1px;"><a href="${pageContext.request.contextPath }/product/detils.do?productDetailsId=${item.productDetailsId}" target="_blank">${item.productName }</a></span>
							</div> 
						</td>
						</c:forEach> 
					</tr>
					 
				 
				</table> 
				</div>	
				<div class="col-md-12 text-right">
							<itcast:page url="${pageContext.request.contextPath }/product/productAll.do" />
			    </div>			
			</div> 
		 </form>
			  <%--产品结束 --%>
	  <!--    <span style="margin-left:35%;">---------------------------------我是有底线的-----------------------</span> -->
</body>
</html>
