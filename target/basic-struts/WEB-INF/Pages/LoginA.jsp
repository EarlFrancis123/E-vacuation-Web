<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
    <head>
      <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<style>
s:textfield{
  align-items: center;
}

</style>
 
</head>
  <body>
    <s:include value="Menu2.jsp" />

    <section class="vh-100" style="background-color: #9A616D;">
      <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
          <div class="col col-xl-10">
            <div class="card" style="border-radius: 1rem;">
              <div class="row g-0">
                <div class="col-md-6 col-lg-5 d-none d-md-block">
                  <img src="https://static.vecteezy.com/system/resources/previews/002/737/795/non_2x/online-registration-form-and-sign-in-button-concept-illustration-login-illustration-online-registration-illustrations-free-vector.jpg"
                    alt="login form" class="img-fluid" style="border-radius: 1rem 0 0 1rem; margin-top: 40%; margin-left: 15%;"  />
                </div>
                <div class="col-md-6 col-lg-7 d-flex align-items-center">
                  <div class="card-body p-4 p-lg-5 text-black">
    
                    <s:form action="LoginB" class="form" style="margin-left: 40px;">
    
                      <div class="d-flex align-items-center mb-3 pb-1">
                        <i class="fas fa-cubes fa-2x me-3" style="color: #ff6219;"></i>
                        <span class="h1 fw-bold mb-0">E - Vacuation</span>
                      </div>
    
                      <h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Sign into your account</h5>
    
                      <div class="form-outline mb-4">
                        <s:textfield name="personBean.email"  label ="Email" id="form2Example17" class="form-control form-control-lg" required="true" />  
                        <label class="form-label" for="form2Example17">Email address</label>
                      </div>
    
                      <div class="form-outline mb-4">
                        <s:textfield name="personBean.password"  label="Password"  id="form2Example27" class="form-control form-control-lg"   required="true"/>
                        <label class="form-label" for="form2Example27">Password</label>
                      </div>
    
                      <div class="pt-1 mb-4">

                        <s:submit value="Sign in" class="btn btn-dark btn-lg btn-block" type="button"/>
                      </div>
    
                      <a class="small text-muted" href="#!">Forgot password?</a>
                      <p class="mb-5 pb-lg-2" style="color: #393f81;">Don't have an account? <a href="http://localhost:8080/basic-struts/Register.xhtml"
                          style="color: #393f81;">Register here</a></p>
                      <a href="#!" class="small text-muted">Terms of use.</a>
                      <a href="#!" class="small text-muted">Privacy policy</a>
                    </s:form>
    
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    
  </body>
</html>