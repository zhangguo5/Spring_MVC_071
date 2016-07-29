<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新闻焦点</title>
</head>
<body>
    <div id="container">
	<h2>新闻焦点</h2>
	<#setting number_format="#">
	<ul>
	    <#list articles as article>
	    <li>
	        <a href="news/${article.id}.html">${article.title}</a>
	    </li>
	    </#list>
	</ul>
	</div>
	<style>
	   #container{
	      font-family:"microsoft yahei";
	      width:800px;
	      margin:0 auto;
	   }
	   a{
	     color:#333;
	     text-decoration:none;
	   }
	   li{
	     height:26px;
	     line-height:26px;
	   }
	</style>
</body>
</html>