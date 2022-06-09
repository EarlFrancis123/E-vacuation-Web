<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
  <head>
    <meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto'>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Profile</title>
    <style>
      html,body,h1,h2,h3,h4,h5,h6 {font-family: "Roboto", sans-serif}
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

      #userImage {
        width: 100px;
        height: 100px;
        padding: 0px 15px;
      }

      #adminView {
        background-color: #DEDEDE;
        border-radius: 20px;
        padding: 20px 0px;
      }

      #adminView > h2 {
        margin-top: 0px;
      }
      ul {
          list-style-type: none;
          margin: 0;
          padding: 0;
          overflow: hidden;
          background-color: #333;
        }
        
        li {
          float: left;
        }
        
        li a {
          display: block;
          color: white;
          text-align: center;
          padding: 14px 16px;
          text-decoration: none;
        }
        
        li a:hover {
          background-color: #111;
        }
        h1{
          text-align: center;
        }
        input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
    </style>
  </head>
  <body>
    <s:include value="Menu.jsp" /> 
    
    <main>
      <header class="center">
        <h2>User Details</h2>
      </header>
      <div class="w3-content w3-margin-top" style="max-width:1400px;">

        <!-- The Grid -->
        <div class="w3-row-padding">
        
          <!-- Left Column -->
          <div class="w3-third">
          
            <div class="w3-white w3-text-grey w3-card-4">
              <div class="w3-display-container">
                <img src="https://www.w3schools.com/w3images/avatar_hat.jpg" style="width:100%" alt="Avatar">
                <div class="w3-display-bottomleft w3-container w3-text-black">
                  <h2>Jane Doe</h2>
                </div>
              </div>
              <div class="w3-container">
                <p><i class="fa fa-briefcase fa-fw w3-margin-right w3-large w3-text-teal"></i>Designer</p>
                <p><i class="fa fa-home fa-fw w3-margin-right w3-large w3-text-teal"></i>London, UK</p>
                <p><i class="fa fa-envelope fa-fw w3-margin-right w3-large w3-text-teal"></i>ex@mail.com</p>
                <p><i class="fa fa-phone fa-fw w3-margin-right w3-large w3-text-teal"></i>1224435534</p>
                <hr>
      
                <p class="w3-large"><b><i class="fa fa-asterisk fa-fw w3-margin-right w3-text-teal"></i>Skills</b></p>
                <p>Adobe Photoshop</p>
                <div class="w3-light-grey w3-round-xlarge w3-small">
                  <div class="w3-container w3-center w3-round-xlarge w3-teal" style="width:90%">90%</div>
                </div>
                <p>Illustrator</p>
                <div class="w3-light-grey w3-round-xlarge w3-small">
                  <div class="w3-container w3-center w3-round-xlarge w3-teal" style="width:75%">75%</div>
                </div>
                <p>Media</p>
                <div class="w3-light-grey w3-round-xlarge w3-small">
                  <div class="w3-container w3-center w3-round-xlarge w3-teal" style="width:50%">50%</div>
                </div>
                <br>
      
                <p class="w3-large w3-text-theme"><b><i class="fa fa-globe fa-fw w3-margin-right w3-text-teal"></i>Languages</b></p>
                <p>English</p>
                <div class="w3-light-grey w3-round-xlarge">
                  <div class="w3-round-xlarge w3-teal" style="height:24px;width:100%"></div>
                </div>
                <p>Spanish</p>
                <div class="w3-light-grey w3-round-xlarge">
                  <div class="w3-round-xlarge w3-teal" style="height:24px;width:55%"></div>
                </div>
                <p>German</p>
                <div class="w3-light-grey w3-round-xlarge">
                  <div class="w3-round-xlarge w3-teal" style="height:24px;width:25%"></div>
                </div>
                <br>
              </div>
            </div><br>
      
          <!-- End Left Column -->
          </div>
      
          <!-- Right Column -->
          <div class="w3-twothird">
          
            <div class="w3-container w3-card w3-white w3-margin-bottom">
              <h2 class="w3-text-grey w3-padding-16"><i class="fa fa-suitcase fa-fw w3-margin-right w3-xxlarge w3-text-teal"></i>Work Experience</h2>
              <div class="w3-container">
                <h5 class="w3-opacity"><b>Front End Developer / w3schools.com</b></h5>
                <h6 class="w3-text-teal"><i class="fa fa-calendar fa-fw w3-margin-right"></i>Jan 2015 - <span class="w3-tag w3-teal w3-round">Current</span></h6>
                <p>Lorem ipsum dolor sit amet. Praesentium magnam consectetur vel in deserunt aspernatur est reprehenderit sunt hic. Nulla tempora soluta ea et odio, unde doloremque repellendus iure, iste.</p>
                <hr>
              </div>
              <div class="w3-container">
                <h5 class="w3-opacity"><b>Web Developer / something.com</b></h5>
                <h6 class="w3-text-teal"><i class="fa fa-calendar fa-fw w3-margin-right"></i>Mar 2012 - Dec 2014</h6>
                <p>Consectetur adipisicing elit. Praesentium magnam consectetur vel in deserunt aspernatur est reprehenderit sunt hic. Nulla tempora soluta ea et odio, unde doloremque repellendus iure, iste.</p>
                <hr>
              </div>
              <div class="w3-container">
                <h5 class="w3-opacity"><b>Graphic Designer / designsomething.com</b></h5>
                <h6 class="w3-text-teal"><i class="fa fa-calendar fa-fw w3-margin-right"></i>Jun 2010 - Mar 2012</h6>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. </p><br>
              </div>
            </div>
      
            <div class="w3-container w3-card w3-white">
              <h2 class="w3-text-grey w3-padding-16"><i class="fa fa-certificate fa-fw w3-margin-right w3-xxlarge w3-text-teal"></i>Education</h2>
              <div class="w3-container">
                <h5 class="w3-opacity"><b>W3Schools.com</b></h5>
                <h6 class="w3-text-teal"><i class="fa fa-calendar fa-fw w3-margin-right"></i>Forever</h6>
                <p>Web Development! All I need to know in one place</p>
                <hr>
              </div>
              <div class="w3-container">
                <h5 class="w3-opacity"><b>London Business School</b></h5>
                <h6 class="w3-text-teal"><i class="fa fa-calendar fa-fw w3-margin-right"></i>2013 - 2015</h6>
                <p>Master Degree</p>
                <hr>
              </div>
              <div class="w3-container">
                <h5 class="w3-opacity"><b>School of Coding</b></h5>
                <h6 class="w3-text-teal"><i class="fa fa-calendar fa-fw w3-margin-right"></i>2010 - 2013</h6>
                <p>Bachelor Degree</p><br>
              </div>
            </div>
      
          <!-- End Right Column -->
          </div>
          
        <!-- End Grid -->
        </div>
        
        <!-- End Page Container -->
      </div>
  </body>
</html>