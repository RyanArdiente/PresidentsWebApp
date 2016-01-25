<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Talking Point 9 -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Presidents</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<header id="header1">
	<div id="inspirational">America The Beautiful</div>
	<div id="capitol">
		<img id="mainImage" src="images/capitolAndUSAflag.jpg">
	</div>
	</header>
	<!-- Talking Point 10 -->
	<section id="outer"> <section id="topcenter">
	<h1>USA President Information</h1>
	<form action="PresidentServlet" method="POST">
		Enter term number: <input type="text" name="tn" /><br />
		<br /> <input type="submit" id="sbutton" value="SUBMIT" name="submit" />
	</form>
	</section> <section id="bottomcenter"> <section id="center2">
	<!-- Talking Point 11 --> <img id="ppic"
		src="${presidents.presList[rotationNumber].location}">
	<h2 id="name">${presidents.presList[rotationNumber].fullName}</h2>
	<h2>${presidents.presList[rotationNumber].termYears}</h2>
	<h3>${presidents.presList[rotationNumber].party}</h3>
	<h3>Term Number:
		${presidents.presList[rotationNumber].presidentNumber}</h3>
	</section> </section> </section>
	<section class="side"> <!-- Talking Point 12 -->
	<form action="PresidentServlet" method="POST">
		<input id="left" type="image" src="images/left.png" alt="Submit"
			name="previous" value="submit" /> <input id="right" type="image"
			src="images/right.png" alt="Submit" name="next" value="submit" />
	</form>
	</section>
</body>
</html>
<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Presidents</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<header id="header1">
	<div id="inspirational">America The Beautiful</div>
	<div id="capitol">
		<img id="mainImage" src="images/capitolAndUSAflag.jpg" />
	</div>
	</header>
	<section id="outer"> <section id="topcenter">
	<h1>USA President Information</h1>
	<form action="PresidentServlet" method="POST">
		Enter term number: <input type="text" name="tn" /><br />
		<br /> <input type="submit" value="Submit" name="submit" />
	</form>
	</section> <section id="bottomcenter"> <section id="center2">
	<h2 id="name">${presidents.presList[rotationNumber].fullName}</h2>
	<h2>${presidents.presList[rotationNumber].termYears}</h2>
	<h3>${presidents.presList[rotationNumber].party}</h3>
	<h3>Term Number: ${presidents.presList[rotationNumber].presidentNumber}</h3>
	
	</section> </section> 
	<section class="side">
		<form action="PresidentServlet" method="POST">
		<input id="left" type="submit" value="Previous" name="previous" /> 
		<input id="right" type="submit" value="Next" name="next" />
		</form>
	</section> </section>
	
	
	<!-- 		<footer>
			<img id="capitol" src="images.capitolAndUSAflag.jpg"	/>
			
		</footer> -->



			<c:if test="${! empty(sessionScope.presList)}">
			<c:forEach var="president" items="${sessionScope.presList}">
					${presList.name}
			</c:forEach>
	</c:if>

</body>
</html> --%>