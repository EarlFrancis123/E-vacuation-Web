<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> <%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib
prefix="sx" uri="/struts-dojo-tags" %>
<html>
  
  <head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<sx:head />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>ListDonation</title>
  </head>
  <body style="background-color: rgb(184, 179, 179);">
    <s:include value="Menu.jsp" />
    
    <div class="jumbotron text-center" style="background-image: url('https://www.ready.gov/sites/default/files/2019-09/Build%20a%20Kit_0.jpg');">
      <h1 style="color: rgb(231, 74, 68); font-family: Fantasy;">Donation List</h1> 
      <p style="color: rgb(0, 0, 0);">We specialize in blablabla</p> 
      <s:form action="SearchDonation " style="margin-left: 22%; margin-right: 22%;">
        <div class="input-group" >
             <s:textfield name="search"  class="form-control" size="50" /> 
          <div class="input-group-btn">
            <s:submit value="Search" class="btn btn-success"  style=" margin-right: 35%;"/>
          </div>
        </div>
      </s:form>
      <br>
      <br>
    
     
    </div>
    <s:form action="SortbyDonation" style="margin-left: 56%;">
      <sx:autocompleter
        label="Sort By Evacuation"
        list="evacuations"
        name="evacuationInput"
      />
      <s:submit value="Sort" />
    </s:form>

    <body>
   <!--   <s:form action="displayEvacuee">
        <sx:autocompleter
          label="Choose your record"
          list="listOfFirstNames"
          name="nameInput"
        />
        <s:submit />
      </s:form>--> 

 
  <s:iterator  value="donations">  
  <fieldset class="jumbotron" style="margin-left: 20%; margin-right: 20%;" style="background-color: rgb(126, 124, 122);">  
    <b>Sponsor:</b>
  <s:property value="Sponsor"/> <br/>  
  <b>Evacuation Name:</b>
  <s:property value="EvacuationName"/><br/>  
  <b>Food:</b>
  <s:property value="Food"/><br/>  
  <b>Water:</b>
  <s:property value="Water"/><br/>  
  <b>Clothes:</b>
  <s:property value="Clothes"/><br/>  
  <b>Medicine:</b>  
  <s:property value="Medicine"/><br/>  
  <div class="input-group" style="margin-left: 80%;">
    <div class="input-group-btn"  style="margin-left: 5%;">
      <s:url var="updateDonation" action="UpdateDonation">
                          <s:param name="iddonations" value="iddonations" />
                      </s:url>
                      
 <div class="input-group-btn">
      <s:a href="%{updateDonation}" class="btn btn-success"  onclick="return confirm('Are you sure you want to delete this Donation')"><i >Update</i></s:a> 
    </div>
    </div>
     
       <div class="input-group-btn"  style="margin-right: 10%;">
        <s:url var="deleteDonation" action="DeleteDonation">
                            <s:param name="iddonations" value="iddonations" />
                        </s:url>
                        
   <div class="input-group-btn">
        <s:a href="%{deleteDonation}" class="btn btn-danger"  onclick="return confirm('Are you sure you want to delete this Donation')"><i >Delete</i></s:a> 
      </div>
      </div>
       </div>
       </div>
  </fieldset >  
  </s:iterator>
 
  <div class="d-flex justify-content-center">
    <button class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-3 " style="margin-right: 45%; margin-left: 45%; scroll-margin-block-end: 20%;"  type="button"><a href="<s:url action='AddDonation' />" style="color: aliceblue;" >ADD DONATION</a></button>
 </div>
 <br>
 <br>
 <br>

  </body>
  <s:include value="Footer.jsp" />
</html>