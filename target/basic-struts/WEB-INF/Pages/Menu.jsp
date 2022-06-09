<%@ taglib prefix="s" uri="/struts-tags" %>

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400&display=swap" rel="stylesheet">

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
          <s:url var="homePage" value="/" />
          <s:a href="%{homePage}">Home</s:a>
        </li>
        <li style="align-items: center;">
          <s:url var="aboutPage" action="About" />
          <s:a href="%{aboutPage}">About</s:a>
        </li>
        <li style="align-items: center;">
          <s:url var="OurServices" action="OurServices" />
          <s:a href="%{OurServices}">Our Service</s:a>
        </li>
    
        <li style="align-items: center;">
          <s:url var="ContactUs" action="ContactUs" />
          <s:a href="%{ContactUs}">Contact Us</s:a>
        </li>
        <li style="float:right">
          <s:url var="loginPage" action="LoginA" />
          <s:a href="%{loginPage}">Login</s:a>
        </li>
        <li style="float:right">
          <s:url var="Register" action="Register" />
          <s:a href="%{Register}">Register</s:a>
        </li>
      </ul>
</nav>
<footer>
  <span>2022</span>
</footer>