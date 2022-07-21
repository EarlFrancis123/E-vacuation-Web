<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> <%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib
prefix="sx" uri="/struts-dojo-tags" %>
<html>
  <head>
<sx:head />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>ListEvacuee</title>
  </head>
  <body>
    <s:include value="Menu.jsp" />
  <h1 style="text-align: center;">List Evacuee</h1>
    <body>
   <!--   <s:form action="displayEvacuee">
        <sx:autocompleter
          label="Choose your record"
          list="listOfFirstNames"
          name="nameInput"
        />
        <s:submit />
      </s:form>--> 
  <h3>All User Records:</h3>  
  <s:iterator  value="evacuees">  
  <fieldset>  
    <b>First Name: </b>
  <s:property value="firstName"/><br/>  
  <b>Last Name: </b>
  <s:property value="lastname"/><br/>  
  <b>Contact Number: </b>
  <s:property value="contactNumber"/><br/>  
  <b>Gender: </b>
  <s:property value="gender"/><br/>  
  <b>Address: </b>
  <s:property value="address"/><br/>  

  <b>Evacuation Name: </b>
  <s:property value="evacuationName"/><br/>  
  </fieldset>  
  </s:iterator>

  </body>
</html>