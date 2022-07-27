<%@ taglib prefix="s" uri="/struts-tags" %>

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<header role="banner">
  <nav class="navbar navbar-expand-md navbar-dark bg-dark">
  <div class="container">
  <a class="navbar-brand" href="http://localhost:8080/basic-struts/index.jsp">E-Vacuation</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample05" aria-controls="navbarsExample05" aria-expanded="false" aria-label="Toggle navigation">
  <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarsExample05">
  <ul class="navbar-nav ml-auto pl-lg-5 pl-0">
  <li class="nav-item">
  <a class="nav-link active" href="index.jsp">Home</a>
  </li>
  <li class="nav-item">
    <s:url var="ListEvacuation2" action="ListEvacuation2" />
    <s:a href="%{ListEvacuation2}" class="nav-link">Evacuations</s:a>
  </li>
  <li class="nav-item">
    <s:url var="ListEvacuee2" action="ListEvacuee2" />
    <s:a href="%{ListEvacuee2}" class="nav-link">Evacuees</s:a>
  </li>
  <li class="nav-item">
    <s:url var="Weather2" action="Weather2" />
    <s:a href="%{Weather2}" class="nav-link">Weather Forcast</s:a>
  </li>

  </ul>
  <ul class="navbar-nav ml-auto">
  <li class="nav-item cta-btn">
    <s:url var="loginPage" action="LoginA" />
    <s:a href="%{loginPage}" class="nav-link">Login</s:a>
  </li>
  </ul>
  </div>
  </div>
  </nav>
  </header>