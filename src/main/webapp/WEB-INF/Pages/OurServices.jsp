<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
  <head>
    <meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <title>OurServices</title>
    <style>
      body,h1 {font-family: "Montserrat", sans-serif}
img {margin-bottom: -7px}
.w3-row-padding img {margin-bottom: 12px}
      .column {
        float: left;
        width: 33.33%;
      }

      /* Clear floats after the columns */
      .row:after {
        content: "";
        display: table;
        clear: both;
      }

      #verticalList {
        padding: 0px 50px;
      }

      #verticalList li {
        background-color: #eee;
        color: black;
        display: block;
        float: left;
        width: 100%;
        margin: 0px 0px 10px 0px;
        padding: 10px 0px;
      }

      #verticalList li span {
        padding: 10px;
      }
      
    </style>
  </head>
  <body>
    <s:include value="Menu.jsp" />
    <!-- Header -->
<div class="w3-opacity">
  <div class="w3-clear"></div>
  <header class="w3-center w3-margin-bottom">
    <h1><b>Our Services</b></h1>
    <p><b>Services We Do</b></p>
    <p class="w3-padding-16"><button class="w3-button w3-black" onclick="myFunction()">Toggle Grid Padding</button></p>
  </header>
  </div>
  
  <!-- Photo Grid -->
  <div class="w3-row" id="myGrid" style="margin-bottom:128px">
    <div class="w3-third">
      <img src="https://www.w3schools.com/w3images/rocks.jpg" style="width:100%">
      <img src="https://www.w3schools.com/w3images/sound.jpg" style="width:100%">
      <img src="https://www.w3schools.com/w3images/woods.jpg" style="width:100%">
      <img src="https://www.w3schools.com/w3images/rock.jpg" style="width:100%">
      <img src="https://www.w3schools.com/w3images/nature.jpg" style="width:100%">
      <img src="https://www.w3schools.com/w3images/mist.jpg" style="width:100%">
    </div>
  
    <div class="w3-third">
      <img src="https://www.w3schools.com/w3images/coffee.jpg" style="width:100%">
      <img src="https://www.w3schools.com/w3images/bridge.jpg" style="width:100%">
      <img src="https://www.w3schools.com/w3images/notebook.jpg" style="width:100%">
      <img src="https://www.w3schools.com/w3images/london.jpg" style="width:100%">
      <img src="https://www.w3schools.com/w3images/rocks.jpg" style="width:100%">
      <img src="https://www.w3schools.com/w3images/avatar_g.jpg" style="width:100%">
    </div>
  
    <div class="w3-third">
      <img src="https://www.w3schools.com/w3images/mist.jpg" style="width:100%">
      <img src="https://www.w3schools.com/w3images/workbench.jpg" style="width:100%">
      <img src="https://www.w3schools.com/w3images/gondol.jpg" style="width:100%">
      <img src="https://www.w3schools.com/w3images/skies.jpg" style="width:100%">
      <img src="https://www.w3schools.com/w3images/lights.jpg" style="width:100%">
      <img src="https://www.w3schools.com/w3images/workshop.jpg" style="width:100%">
    </div>
  </div>
  
  
  </body>
</html>