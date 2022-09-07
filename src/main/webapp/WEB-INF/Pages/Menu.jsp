<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<header role="banner">
  <nav class="navbar navbar-expand-md navbar-dark bg-dark">
  <div class="container">
    <s:url var="LandingPage" action="LandingPage" />
  <s:a class="navbar-brand" href="%{LandingPage}">E-Vacuation</s:a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample05" aria-controls="navbarsExample05" aria-expanded="false" aria-label="Toggle navigation">
  <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarsExample05">
  <ul class="navbar-nav ml-auto pl-lg-5 pl-0">
  <li class="nav-item">
  <s:a class="nav-link active" href="%{LandingPage}">Home</s:a>
  </li>
  <li class="nav-item">
    <s:url var="ListEvacuation" action="ListEvacuation" />
    <s:a href="%{ListEvacuation}" class="nav-link">Evacuations</s:a>
  </li>
  <li class="nav-item">
    <s:url var="ListEvacuee" action="ListEvacuee" />
    <s:a href="%{ListEvacuee}" class="nav-link">Evacuee</s:a>
  </li>
  <li class="nav-item">
    <s:url var="ListDonation" action="ListDonation" />
    <s:a href="%{ListDonation}" class="nav-link">Donation</s:a>
  </li>
  <li class="nav-item">
    <s:url var="Weather" action="Weather" />
    <s:a href="%{Weather}" class="nav-link">Weather Forcast</s:a>
  </li>
  </ul>
  <ul class="navbar-nav ml-auto">
  <li class="nav-item cta-btn">
    <a href="https://weatherforcasts.hub.loginradius.com/auth.aspx?action=logout&return_url=http://localhost:8080/basic-struts/index"class="nav-link" >Logout </a>
  </li>
  </ul>
  </div>
  </div>
  </nav>
  </header>