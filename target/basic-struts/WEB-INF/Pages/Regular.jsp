<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
  <head>
    <title>Regular View</title>
    <style>
    </style>
  </head>
  <body>
    <s:include value="Menu.jsp" /> 
    
    <main>
      <header class="center">
        <h2>Regular</h2>

      </header>
      <s:form action="profileinput">
      <s:textfield name="personBean.firstName" label="First name" />
      <s:textfield name="personBean.lastName" label="Last name" />
      <s:textfield name="personBean.email"  label ="Email"/>  
      <s:textfield name="personBean.age"  label="Age"  />
      <s:submit/>
    </s:form>
    </main>
  </body>
</html>