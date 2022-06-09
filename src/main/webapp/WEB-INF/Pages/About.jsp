<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet" type="text/css">

  <head>
    <title>About</title>
    <style>
      body {font-family: "Raleway", Arial, sans-serif}
.w3-row img {margin-bottom: -8px}
      .column {
        float: left;
        width: 50%;
      }

      /* Clear floats after the columns */
      .row:after {
        content: "";
        display: table;
        clear: both;
      }

      #aboutMeImg {
        width: 100%;
        height: auto;
      }
    </style>
  </head>
  <body>
    <s:include value="Menu.jsp" /> 
    
 <!-- Project Section -->
 <div class="w3-container w3-padding-32" id="projects">
  <h3 class="w3-border-bottom w3-border-light-grey w3-padding-16">About Us</h3>
</div>

<div class="w3-row-padding">
  <div class="w3-col l3 m6 w3-margin-bottom">
    <div class="w3-display-container">
      <div class="w3-display-topleft w3-black w3-padding">Summer House</div>
      <img src="https://www.w3schools.com/w3images/house2.jpg" alt="House" style="width:100%">
    </div>
  </div>
  <div class="w3-col l3 m6 w3-margin-bottom">
    <div class="w3-display-container">
      <div class="w3-display-topleft w3-black w3-padding">Brick House</div>
      <img src="https://www.w3schools.com/w3images/house5.jpg" alt="House" style="width:100%">
    </div>
  </div>
  <div class="w3-col l3 m6 w3-margin-bottom">
    <div class="w3-display-container">
      <div class="w3-display-topleft w3-black w3-padding">Renovated</div>
      <img src="https://www.w3schools.com/w3images/house4.jpg" alt="House" style="width:100%">
    </div>
  </div>
  <div class="w3-col l3 m6 w3-margin-bottom">
    <div class="w3-display-container">
      <div class="w3-display-topleft w3-black w3-padding">Barn House</div>
      <img src="https://www.w3schools.com/w3images/house3.jpg" alt="House" style="width:100%">
    </div>
  </div>
</div>

<div class="w3-row-padding">
  <div class="w3-col l3 m6 w3-margin-bottom">
    <div class="w3-display-container">
      <div class="w3-display-topleft w3-black w3-padding">Summer House</div>
      <img src="https://www.w3schools.com/w3images/house5.jpg" alt="House" style="width:99%">
    </div>
  </div>
  <div class="w3-col l3 m6 w3-margin-bottom">
    <div class="w3-display-container">
      <div class="w3-display-topleft w3-black w3-padding">Brick House</div>
      <img src="https://www.w3schools.com/w3images/house2.jpg" alt="House" style="width:99%">
    </div>
  </div>
  <div class="w3-col l3 m6 w3-margin-bottom">
    <div class="w3-display-container">
      <div class="w3-display-topleft w3-black w3-padding">Renovated</div>
      <img src="https://www.w3schools.com/w3images/house3.jpg" alt="House" style="width:99%">
    </div>
  </div>
  <div class="w3-col l3 m6 w3-margin-bottom">
    <div class="w3-display-container">
      <div class="w3-display-topleft w3-black w3-padding">Barn House</div>
      <img src="https://www.w3schools.com/w3images/house4.jpg" alt="House" style="width:99%">
    </div>
  </div>
</div>

<!-- About Section -->
<div class="w3-container w3-padding-32" id="about">
  <h3 class="w3-border-bottom w3-border-light-grey w3-padding-16">About</h3>
  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Excepteur sint
    occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco
    laboris nisi ut aliquip ex ea commodo consequat.
  </p>
</div>

<div class="w3-row-padding w3-grayscale">
  <div class="w3-col l3 m6 w3-margin-bottom">
    <img src="https://www.w3schools.com/w3images/team2.jpg" alt="John" style="width:100%">
    <h3>John Doe</h3>
    <p class="w3-opacity">CEO & Founder</p>
    <p>Phasellus eget enim eu lectus faucibus vestibulum. Suspendisse sodales pellentesque elementum.</p>
    <p><button class="w3-button w3-light-grey w3-block">Contact</button></p>
  </div>
  <div class="w3-col l3 m6 w3-margin-bottom">
    <img src="https://www.w3schools.com/w3images/team1.jpg" alt="Jane" style="width:100%">
    <h3>Jane Doe</h3>
    <p class="w3-opacity">Architect</p>
    <p>Phasellus eget enim eu lectus faucibus vestibulum. Suspendisse sodales pellentesque elementum.</p>
    <p><button class="w3-button w3-light-grey w3-block">Contact</button></p>
  </div>
  <div class="w3-col l3 m6 w3-margin-bottom">
    <img src="https://www.w3schools.com/w3images/team3.jpg" alt="Mike" style="width:100%">
    <h3>Mike Ross</h3>
    <p class="w3-opacity">Architect</p>
    <p>Phasellus eget enim eu lectus faucibus vestibulum. Suspendisse sodales pellentesque elementum.</p>
    <p><button class="w3-button w3-light-grey w3-block">Contact</button></p>
  </div>
  <div class="w3-col l3 m6 w3-margin-bottom">
    <img src="https://www.w3schools.com/w3images/team4.jpg" alt="Dan" style="width:100%">
    <h3>Dan Star</h3>
    <p class="w3-opacity">Architect</p>
    <p>Phasellus eget enim eu lectus faucibus vestibulum. Suspendisse sodales pellentesque elementum.</p>
    <p><button class="w3-button w3-light-grey w3-block">Contact</button></p>
  </div>
</div>


   
  </body>
</html>