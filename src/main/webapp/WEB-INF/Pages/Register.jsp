<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
  <head>
    <title>OurServices</title>
  
      <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<style>


</style>
  </head>
  <body>
    <s:include value="Menu2.jsp" />
    <section class="">
      <!-- Jumbotron -->
      <div class="px-4 py-5 px-md-5 text-center text-lg-start" style="background-color: hsl(0, 0%, 96%)">
        <div class="container">
          <div class="row gx-lg-5 align-items-center">
            <div class="col-lg-6 mb-5 mb-lg-0">
              <h1 class="my-5 display-3 fw-bold ls-tight">
                The best offer <br />
                <span class="text-primary">for your business</span>
              </h1>
              <p style="color: hsl(217, 10%, 50.8%)">
                Lorem ipsum dolor sit amet consectetur adipisicing elit.
                Eveniet, itaque accusantium odio, soluta, corrupti aliquam
                quibusdam tempora at cupiditate quis eum maiores libero
                veritatis? Dicta facilis sint aliquid ipsum atque?
              </p>
            </div>
    
            <div class="col-lg-6 mb-5 mb-lg-0">
              <div class="card">
                <div class="card-body py-5 px-md-5">
                  <s:form action="addtodatabase" style="margin-left: 40px;">
                  
                      <h1>SIGN UP</h1>
                    <!-- First Name input -->
                    <div class="form-outline mb-4" >
                      <s:textfield name="personBean.firstName" label="First name"   class="form-control" required="true" />
                    </div>
    
                    <!-- Last Name input -->
                    <div class="form-outline mb-4">
                      <s:textfield name="personBean.lastName" label="Last name"  class="form-control" required="true" />
                    </div>
                     <!-- Age input -->
                     <div class="form-outline mb-4">
                      <s:textfield name="personBean.age"  label="Age"   class="form-control" required="true"/>
                    </div>
                     <!-- Email input -->
                     <div class="form-outline mb-4">
                      <s:textfield name="personBean.email"  label ="Email"   class="form-control" required="true"/>
                    </div>
                     <!-- Password input -->
                    <div class="form-outline mb-4">
                      <s:textfield name="personBean.password"  label="Password"  class="form-control" required="true"/>
                    </div>
    
                  
                    
                    <!-- Submit button -->
                
                    <s:submit value="Sign in" class="btn btn-primary btn-block mb-4" />
                     
               
                  
                    </s:form>
                    <p>Have already an account? <a href="http://localhost:8080/basic-struts/LoginA.xhtml">Click Here</a></p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- Jumbotron -->
    </section>
  
  </body>
</html>