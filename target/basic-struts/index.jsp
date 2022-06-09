<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
  <head>
    <meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Home</title>

    <style>
      
      header{
          align-content: center;

      }
      body {
  background-image: url('https://images8.alphacoders.com/425/425698.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
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
      span{
     
      }
    </style>
  </head>
  <body>
    <s:include value="/WEB-INF/Pages/Menu.jsp"/>

    <main>
  

          <div class="w3-display-left w3-text-white" style="padding:48px">
            <span class="w3-jumbo w3-hide-small">Start something that matters</span><br>
            <span class="w3-xxlarge w3-hide-large w3-hide-medium">Start something that matters</span><br>
            <span class="w3-large">Stop wasting valuable time with projects that just isn't you.</span>
            <p><a href="#about" class="w3-button w3-white w3-padding-large w3-large w3-margin-top w3-opacity w3-hover-opacity-off">Learn more and start today</a></p>
          </div> 
          <div class="w3-display-bottomleft w3-text-grey w3-large" style="padding:24px 48px">
            <i class="fa fa-facebook-official w3-hover-opacity"></i>
            <i class="fa fa-instagram w3-hover-opacity"></i>
            <i class="fa fa-snapchat w3-hover-opacity"></i>
            <i class="fa fa-pinterest-p w3-hover-opacity"></i>
            <i class="fa fa-twitter w3-hover-opacity"></i>
            <i class="fa fa-linkedin w3-hover-opacity"></i>
          </div>


 
    </main>
  </body>
</html>