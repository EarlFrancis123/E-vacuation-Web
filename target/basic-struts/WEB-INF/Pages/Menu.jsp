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
        <s:url var="AddEvacuation" action="AddEvacuation" />
        <s:a href="%{AddEvacuation}">Add Evacuations</s:a>
      </li>
      <li style="align-items: center;">
        <s:url var="Evacuee" action="Evacuee" />
        <s:a href="%{Evacuee}">Add Evacuee</s:a>
      </li>
      <li style="align-items: center;">
        <s:url var="AddDonation" action="AddDonation" />
        <s:a href="%{AddDonation}">Add Donation</s:a>
      </li>
      <li style="align-items: center;">
        <s:url var="ListEvacuation" action="ListEvacuation" />
        <s:a href="%{ListEvacuation}">Evacuations List</s:a>
      </li>
      <li style="align-items: center;">
        <s:url var="ListEvacuee" action="ListEvacuee" />
        <s:a href="%{ListEvacuee}">Evacuee List</s:a>
      </li>
      <li style="align-items: center;">
        <s:url var="ListDonation" action="ListDonation" />
        <s:a href="%{ListDonation}">Donation List</s:a>
      </li>
      <li style="align-items: center;">
        <s:url var="Weather" action="Weather" />
        <s:a href="%{Weather}">Weather Forcast</s:a>
      </li>
        <li style="float:right">
          <s:url var="Logout" action="Logout" />
          <s:a href="%{Logout}">Logout</s:a>
        </li>
      </ul>
</nav>
<footer>
  <span>2022</span>
</footer>