<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
      <meta charset="utf-8" />
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
      <meta name="description" content="" />
      <meta name="author" content="" />
      <title>Home</title>
      <!-- Favicon-->
      <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
      <!-- Bootstrap icons-->
      <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet" />
      <!-- Core theme CSS (includes Bootstrap)-->
      <link href="css/styles.css" rel="stylesheet" />
  </head>



  <body>
    <s:include value="/WEB-INF/Pages/Menu.jsp"/>
    <!-- Header-->
    <header class="bg-dark py-5">
        <div class="container px-5">
            <div class="row gx-5 justify-content-center">
                <div class="col-lg-6">
                    <div class="text-center my-5">
                        <h1 class="display-5 fw-bolder text-white mb-2">E-vacuation</h1>
                        <p class="lead text-white-50 mb-4">Evacuation means exiting a facility as directly and safely as possible. Evacuation is appropriate when conditions inside a structure pose a threat to the health and safety of building occupants and leaving the facility is safer than remaining inside of it. Evacuation should occur through the closest exit way, but depending on the circumstances, an alternate or secondary evacuation route may need to be used.</p>
                        <div class="d-grid gap-3 d-sm-flex justify-content-sm-center">
                            <a class="btn btn-primary btn-lg px-4 me-sm-3" href="">WELCOME</a>
                     
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>
    <!-- Features section-->
    <section class="py-5 border-bottom" id="features">
        <div class="container px-5 my-5">
            <div class="row gx-5">
                <div class="col-lg-4 mb-5 mb-lg-0">
                    <div class="feature bg-primary bg-gradient text-white rounded-3 mb-3"><i class="bi bi-collection"></i></div>
                    <h2 class="h4 fw-bolder">Evacuation</h2>
                    <p><b>Plan to Evacuate</b>Many kinds of emergencies can cause you to have to evacuate. In some cases, you may have a day or two to prepare while other situations might call for an immediate evacuation. Planning is vital to making sure that you can evacuate quickly and safely no matter what the circumstances.</p>
                    <s:a class="text-decoration-none" href="%{ListEvacuation}">
                      Evacuation List
                        <i class="bi bi-arrow-right"></i>
                    </s:a>
                </div>
                <div class="col-lg-4 mb-5 mb-lg-0">
                    <div class="feature bg-primary bg-gradient text-white rounded-3 mb-3"><i class="bi bi-building"></i></div>
                    <h2 class="h4 fw-bolder">Evacuee</h2>
                    <p>After an emergency, you may need to survive on your own for several days. Being prepared means having your own food, water and other supplies to last for several days. A disaster supplies kit is a collection of basic items your household may need in the event of an emergency..</p>
                    <s:a class="text-decoration-none" href="%{ListEvacuee}">
                      Evacuee List
                        <i class="bi bi-arrow-right"></i>
                    </s:a>
                </div>
                <div class="col-lg-4">
                    <div class="feature bg-primary bg-gradient text-white rounded-3 mb-3"><i class="bi bi-toggles2"></i></div>
                    <h2 class="h4 fw-bolder">Donation</h2>
                    <p></p>
                    <s:a class="text-decoration-none" href="%{Weather}">
                        Weather Forcast
                        <i class="bi bi-arrow-right"></i>
                    </s:a>
                </div>
            </div>
        </div>
    </section>
    
   
   
    <!-- Footer-->
    <s:include value="Footer.jsp" />
    <!-- Bootstrap core JS-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Core theme JS-->
    <script src="js/scripts.js"></script>
    <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
    <!-- * *                               SB Forms JS                               * *-->
    <!-- * * Activate your form at https://startbootstrap.com/solution/contact-forms * *-->
    <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
    <script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
</body>
</html>