<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
      </head>
  <body>
    <s:include value="Menu.jsp" />
    <section class="vh-100 bg-image"
>
    <div class="mask d-flex align-items-center h-100 gradient-custom-3">
      <div class="container h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
          <div class="col-12 col-md-9 col-lg-7 col-xl-6">
            <div class="card" style="border-radius: 15px;">
              <div class="card-body p-5">
                <h2 class="text-uppercase text-center mb-5">UPDATE EVACUATION </h2>
  
                <div class="input-group-btn"  style="margin-left: 5%;">
                  
                  <s:form action="UpdateE2" style="margin-right: 10px; margin-left: 20px;" >
  
                  <div class="form-outline mb-4">
                    <label class="form-label" for="form2Example28">Evacuation Name</label>
                    <s:textfield name="evacuationBean.evacuationName"  id="form2Example28"   class="form-control form-control-lg" required="true"/>
                  </div>
  
                  <div class="form-outline mb-4">
                    <label class="form-label" for="EvacuationNumber">Contact Number</label>
                    <s:textfield name="evacuationBean.evacuationNumber"  id="EvacuationNumber"   class="form-control form-control-lg" required="true" style="margin-top: 30px" />
                  </div>

  
                  <div class="form-outline mb-4">
                    <label class="form-label" for="EvacuationAddress">Evacuation Address</label>
                    <s:textfield name="evacuationBean.evacuationAddress"  id="Evacuation Address"   class="form-control form-control-lg" required="true" style="margin-top: 30px" />
                  </div>

                  <div class="form-outline mb-4">
                    <label class="form-label" for="Barangay">Barangay</label>
                    <s:textfield name="evacuationBean.evacuationBarangay"  id="Barangay"   class="form-control form-control-lg" required="true" style="margin-top: 30px" />
                  </div>

                  <div class="form-outline mb-4">
                    <label class="form-label" for="TotalCapacity">TotalCapacity</label>
                    <s:textfield name="evacuationBean.evacuationCapacity"  id="Total Capacity"   class="form-control form-control-lg" required="true" style="margin-top: 30px" />
                  </div>

                  <div class="d-flex justify-content-center">
                      <s:submit value="UPDATE" class="btn btn-success btn-block btn-lg gradient-custom-4 text-body" style="margin-top: 20px;" />
                  </div>
  
                </s:form>
  
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>


  </body>
</html>