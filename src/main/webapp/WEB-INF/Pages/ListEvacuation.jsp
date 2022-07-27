<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> <%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib
prefix="sx" uri="/struts-dojo-tags" %>
<html>
<style>
  #btn-back-to-top {
  position: fixed;
  bottom: 20px;
  right: 20px;
  display: none;
}
</style>
  <head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<sx:head />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>ListEvacuation</title>
  </head>
  <body style="background-color: rgb(184, 179, 179);">
    <s:include value="Menu.jsp" />
    <div class="jumbotron text-center" style="background-image: url('https://www.ready.gov/sites/default/files/2019-09/evacuation_0.jpg');">
      <h1 style="color: rgb(231, 74, 68); font-family: Fantasy;">Evacuation List</h1> 
      <p>We specialize in blablabla</p> 
      <s:form action="SearchEvacuation " style="margin-left: 22%; margin-right: 22%;">
        <div class="input-group">
             <s:textfield name="search"  class="form-control" size="50" /> 
          <div class="input-group-btn">
            <s:submit value="Search" class="btn btn-success"  style=" margin-right: 35%;"/>
          </div>
        </div>
      </s:form>
      
    
     
    </div>

    <body>
   <!--   <s:form action="displayEvacuee">
        <sx:autocompleter
          label="Choose your record"
          list="listOfFirstNames"
          name="nameInput"
        />
        <s:submit />
      </s:form>--> 

 
  <s:iterator  value="evacuations">  
  <fieldset class="jumbotron" style="margin-left: 20%; margin-right: 20%;" style="background-color: rgb(126, 124, 122);">  
    <b>Name:</b>
  <s:property value="evacuationName"/> <br/>  
  <b>Number:</b>
  <s:property value="evacuationNumber"/><br/>  
  <b>Address:</b>
  <s:property value="evacuationAddress"/><br/>  
  <b>Barangay:</b>
  <s:property value="evacuationBarangay"/><br/>  
  <b>Capacity:</b>
  <s:property value="evacuationCapacity"/><br/>  
  <b>Status:</b>
  <s:property value="evacuationStatus"/><br/>  
  <div class="input-group" style="margin-left: 80%;">
    <div class="input-group-btn"  style="margin-left: 5%;">
      <s:url var="updateEvacuee" action="UpdateEvacuee">
              <s:param name="idevacuee" value="idevacuee" />
      </s:url>      
      <div class="input-group-btn">
      <s:a href="%{deleteEvacuation}" class="btn btn-success"  onclick="return confirm('Are you sure you want to update Evacuation')"><i>Update</i></s:a> 
    </div>
    </div>
       <div class="input-group-btn"  style="margin-right: 10%;">
        <s:url var="deleteEvacuation" action="DeleteEvacuation">
                <s:param name="idevacuation" value="idevacuation" />
        </s:url>      
        <div class="input-group-btn">
        <s:a href="%{deleteEvacuation}" class="btn btn-danger"  onclick="return confirm('Are you sure you want to delete delete Evacuation')"><i>Delete</i></s:a> 
      </div>
      </div>
       </div>
       </div>
  </fieldset >  
  </s:iterator>
 
  <div class="d-flex justify-content-center">
    <button id="" class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-3 " style="margin-right: 45%; margin-left: 45%; scroll-margin-block-end: 20%;"  type="button"><a href="<s:url action='AddEvacuation' />" style="color: aliceblue;" >ADD EVACUATION</a></button>
 </div>
 
 <br>
 <br>
 <br>
 <button
 type="button"
 class="btn btn-danger btn-floating btn-lg"
 id="btn-back-to-top"
 >
<i class="fas fa-arrow-up"></i>
</button>
<br>
<br>


  </body>

</html>