<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'detailsProdect.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
 <link rel="stylesheet" href="${pageContext.request.contextPath }/css/index.css">
    <style>
      body{
        background-color: #fafafa; 
      }
      ul{
        padding: 0;
        margin: 0;
      }
      li{ 
        list-style: none;
      }
       
	  
		#introduce{
			 margin-left: 300px;
			 clear: both;
		     display: block;
			 border: 1px solid #ffffff; 
			 width:1300px;
			 height:1900px;
		}
			*{
              margin: 0;
              padding: 0;
           }
 
         #big{
         
            width: 510px;
            height: 360px;
            background:url(/img/${detail.picturesShowOne }) top center;  
            margin-top: 20px;
			background-repeat:no-repeat; 
        }
      .box{
          width: 510px;
          height: 100px;
          margin-left:5px; 
 
       }
 
      ul{
          list-style: none;
      }
 
      li{
            float: left;
           
      }
     
      ul img {
        cursor: pointer;
      }	  
	  
	  #introduction{
		  
		   width: 510px;
           height: 360px; 
		   margin-top: 20px;
		   margin-left: 600px;
	  }
	  
	  #leftDiv{
		 float: left; 
	  }
	  
	  #peripheral{
		border: 1px solid #ffffff; 
		margin-left: 300px;
		width:1300px;
		height:500px;
	    margin-top: 20px;
	  }
	  
	  .main td{ height:110px;  border:#CCCCCC 0px solid;  }
	   a{
	      border:1px solid #000;
		  width:110px;
	 cursor: pointer;
            height: 35px;

            /*将内联元素转换为块元素*/
			text-align: center;
            display: inline-block;  
		} 
		hr{
			background-color:#ffffff;
			border:none;
			height:1px;
		}
		
		.showTheFigure1{
			background-image:url(img/${detail.pd.pdImgOne });
			 background-repeat: no-repeat;
			width: 600px;
             height: 400px; 
		   
		}
		.showTheFigure2{
			background-image:url(img/${detail.pd.pdImgTwo });
			 background-repeat: no-repeat;
			width: 600px;
             height: 400px; 
		   
		}
		.showTheFigure3{
			background-image:url(img/${detail.pd.pdImgThree });
			 background-repeat: no-repeat;
			width: 600px;
             height: 400px; 
		   
		}
		.showTheFigure4{
			background-image:url(img/${detail.pd.pdImgFour });
			 background-repeat: no-repeat;
			width: 600px;
             height: 400px; 
		   
		}
    </style>
    <script>
	   
  window.onload = function(){
        var imgbig = document.getElementById("big"); 
        var pic1 = document.getElementById("pic1");
        var pic2 = document.getElementById("pic2");
        var pic3 = document.getElementById("pic3");
        var pic4 = document.getElementById("pic4");
         
         pic1.onmouseover = function(){
            imgbig.style.backgroundImage = "url(/img/${detail.picturesShowOne })"
        }
         pic2.onmouseover = function(){
            imgbig.style.backgroundImage = "url(/img/${detail.picturesShowTwo })"
        }
         pic3.onmouseover = function(){
            imgbig.style.backgroundImage = "url(/img/${detail.picturesShowThree })"
        }
         pic4.onmouseover = function(){
            imgbig.style.backgroundImage = "url(/img/${detail.picturesShowfour })"
        }
       }
      function addShppingCart(detailsId){
      		$.ajax({
      		type:"GET",
      		url:"${pageContext.request.contextPath }/product/addShoppingCart.do?detailsId="+detailsId,
      		async:true,
      		dataType:"json",
      		success:function(result){ 
			$("#btn1-add").html(result.count);
			}
		});
      }
      
    
    </script>
  </head>
  
  <body>
   <div  class="wrapper">
  <div id="peripheral">
  <div id="leftDiv">
    <div id="big" ></div>
    <div class="box">
         <ul class="box01">
		  <li> 
			  <video width="100" height="80" controls autoplay  >
			  <!-- 
				 <source src="movie.mp4" type="video/mp4">
				<source src="movie.webm" type="video/webm">
				 <object data="movie.mp4" width="320" height="240">
				<embed width="320" height="240" src="movie.swf">
			  </object>
			  --> 
			  <source src="/img/${detail.picturesShowFive }" type="video/ogg">   
			</video>
		  </li> 
           <li><img src="/img/${detail.picturesShowOne }" alt="连接失败" id="pic1" width="100" height="80"></li> 
           <li><img src="/img/${detail.picturesShowTwo }" alt="连接失败" id="pic2" width="100" height="80"></li>
           <li><img src="/img/${detail.picturesShowThree }" alt="连接失败" id="pic3" width="100" height="80"></li>
           <li><img src="/img/${detail.picturesShowfour }" alt="连接失败" id="pic4" width="100" height="80"></li>
          
      </ul> 
    </div>
	</div>
	<div id="introduction"> 
	<table width="100%" border="0" cellspacing="0" cellpadding="0"   class="main">
		<tr>
			<td colspan="3"> 
				<h5>${detail.detailsName }<h5>
			</td> 
		</tr>
		<tr>
			<td>
			 价格：
			</td>
			<td></td>
			<td>
			 ${detail.detailsPrice }(RMB)
			</td>
		</tr>
		<tr>
			<td>
			 库存：
			</td>
			<td></td>
			<td>
				${detail.inventory }件
			</td>
		</tr>
		<tr>
			<td style="	text-align: right;">
			 
			</td>
			<td style="	text-align: right;"><img src="${pageContext.request.contextPath }/img/购物车.png"  width="30" height="30" ></td>
			<td>
			  <a style="background-color:#af272b;border:1px solid #af272b; color:#fff " class="btn1"  onclick="addShppingCart(${detail.detailsId})" >加入购物车</a> <a href="${pageContext.request.contextPath }/product/myShoppingCart.do" style="background-color:#f40;  border:1px solid #f40; color :  #fff;" target="_blank">立即购买</a>
			</td>
		</tr>
	</table>
	
	
	</div>
	</div>
  <br><br><br>
  <div id="introduce">
	<hr>
    <h2>商品介绍</h2>
     ${detail.detailsDescribe }
	<hr>
	-----------------------------------------------------------------------------------------产品细节-----------------------------------------------------------------------------------------
	<div class="showTheFigure1">
	</div>
	<div class="showTheFigure2">
	</div>
	<div class="showTheFigure3">
	</div>
	<div class="showTheFigure4">
	</div>
	 </div>
	 
	  <div class="rightBox">
            <ul class="rightBox-ul">
                <li class="fir" >
                    <a href="javascript:void(0)"></a>
                    <div class="fir-leftBox"></div>
                </li>
                <li class="sec">
                    <a href="${pageContext.request.contextPath }/product/myShoppingCart.do" target="_blank">
                        <i></i>
						<br /> 
						<div class="con">购物车</div>
                        <span id="btn1-add">0</span>
                    </a>
                    <div class="leftBox">我的购物车</div>
                </li> 
            </ul>
        </div>
	  <span style="  margin-left:35%;">----------------------------------联系我们：18392562599 &nbsp;&nbsp;&nbsp;&nbsp;  QQ：2356665464---------------------------------- </span>
</div>  
  <script src='${pageContext.request.contextPath }/js/jquery.js'></script>
    <script src='${pageContext.request.contextPath }/js/index.js'></script> 
  <script> 
  	   $(document).ready(function(){
           	$.ajax({
      		type:"GET",
      		url:"${pageContext.request.contextPath }/product/addShoppingCart.do?detailsId=detailsId",
      		async:true,
      		dataType:"json",
      		success:function(result){
			$("#btn1-add").html(result.count);
			}
		 });
        })
  </script>
  </body>
</html>
