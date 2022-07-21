<%@ taglib prefix="s" uri="/struts-tags" %>

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400&display=swap" rel="stylesheet">

<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">


<style> 
      body {
        font-family: 'Roboto', sans-serif;
        background-color: #fdfdfd;
      }

      .center {
        text-align: center;
      }

      nav {
        margin: -8;
      }

      nav ul {
        list-style-type: none;
        margin: 0;
        padding: 0;
        overflow: hidden;
        background-color: #727474;
      }

      nav li {
        float: left;
      }

      nav li a {
        display: block;
        color: white;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
      }

      /* Change the link color to #111 (black) on hover */
      nav li a:hover {
        background-color: #111;
      }

      footer {
        position: fixed;
        left: 0;
        bottom: 0;
        width: 100%;
        padding: 3px;
        background-color: #333;
        color: white;
        text-align: right;
      }
      li {
  border-right: 1px solid #bbb;
}

ul {
  border: 1px solid #4f5050;
  background-color: #4f5050;
}

li a {
  color: #666;
}

      footer span {
        padding-right: 16px;
      }

      main {
        margin: 30px 350px;
      }

      div p {
        padding: 0px 15px;
      }
</style>
<nav>
    <ul>
     
      <li style="align-items: center;">
        <s:url var="ListEvacuation" action="ListEvacuation" />
        <s:a href="%{ListEvacuation}">Evacuations</s:a>
      </li>
      <li style="align-items: center;">
        <s:url var="ListEvacuee" action="ListEvacuee" />
        <s:a href="%{ListEvacuee}">Evacuee</s:a>
      </li>
      <li style="align-items: center;">
        <s:url var="ListDonation" action="ListDonation" />
        <s:a href="%{ListDonation}">Donation</s:a>
      </li>
      <li style="align-items: center;">
        <s:url var="Weather" action="Weather" />
        <s:a href="%{Weather}">Weather Forcast</s:a>
      </li>
        <li style="float:right">
         
          <a href="https://weatherforcasts.hub.loginradius.com/auth.aspx?action=logout&return_url=http://localhost:8080/basic-struts/index" >Logout </a>
        </li>
      </ul>
</nav>
<footer class="container-fluid text-center">
  <a href="#myPage" title="To Top">
    <span class="glyphicon glyphicon-chevron-up" style="color: white;"></span>
  </a>
  <p>Bootstrap Theme Made By <a href="https://www.w3schools.com" title="Visit w3schools">www.w3schools.com</a></p>
</footer>