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
   <!-- Section: Design Block -->
<section class="">
  <!-- Jumbotron -->
  <div class="px-4 py-5 px-md-5 text-center text-lg-start" style="background-color: hsl(0, 0%, 96%)">
    <div class="container">
      <div class="row gx-lg-5 align-items-center">
        <div class="col-lg-6 mb-5 mb-lg-0">
          <h1 class="my-5 display-3 fw-bold ls-tight">
            E - Vacuation <br />
            <span class="text-primary">Register Form</span>
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
              <h2 class="text-uppercase text-center mb-5">Sign Up</h2>

              <s:form action="addtodatabase" >
                <!-- 2 column grid layout with text inputs for the first and last names -->
                <div class="row">
                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                      <s:textfield name="personBean.firstName"    class="form-control" required="true" />
                      <label class="form-label" for="form3Example1">First name</label>
                    </div>
                  </div>
                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                      <s:textfield name="personBean.lastName"   class="form-control" required="true" />
                      <label class="form-label" for="form3Example2">Last name</label>
                    </div>
                  </div>
                </div>
                <div class="form-outline mb-4">
                  <s:textfield name="personBean.age"  class="form-control" required="true"/>
                  <label class="form-label" for="form3Example3">Age</label>
                </div>
                <!-- Email input -->
                <div class="form-outline mb-4">
                  <s:textfield name="personBean.email"   class="form-control" required="true"/>
                  <label class="form-label" for="form3Example3">Email address</label>
                </div>

                <!-- Password input -->
                <div class="form-outline mb-4">
                  <s:textfield name="personBean.password"  class="form-control" required="true"/>
                  <label class="form-label" for="form3Example4">Password</label>
                </div>

                <!-- Submit button -->
                <s:submit value="Sign Up" class="btn btn-primary btn-block mb-4" />

                <p class="mb-5 pb-lg-2" style="color: #393f81;">Already have an account? <a href="http://localhost:8080/basic-struts/LoginA.xhtml"
                  style="color: #393f81;">Sign In here</a></p>
              </s:form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- Jumbotron -->
</section>
<!-- Section: Design Block -->
  
  </body>
</html>