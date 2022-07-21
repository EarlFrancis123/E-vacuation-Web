<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> <%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib
prefix="sx" uri="/struts-dojo-tags" %>
<html>
  <head>
<sx:head />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>ListEvacuation</title>
  </head>
  <body>
    <s:include value="Menu.jsp" />
  <h1 style="text-align: center;">List Evacuations</h1>
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
  <s:iterator  value="evacuations">  
  <fieldset>  
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

  </fieldset>  
  </s:iterator>

  </body>
</html>