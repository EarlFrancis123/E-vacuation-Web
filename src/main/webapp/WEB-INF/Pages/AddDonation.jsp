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
    style="background-image: url('https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.webp');">
    <div class="mask d-flex align-items-center h-100 gradient-custom-3">
      <div class="container h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
          <div class="col-12 col-md-9 col-lg-7 col-xl-6">
            <div class="card" style="border-radius: 15px;">
              <div class="card-body p-5">
                <h2 class="text-uppercase text-center mb-5">ADD Donation</h2>
  
                <s:form action="adddonation" style="margin-right: 10px; margin-left: 20px;" >
  
                  <div class="form-outline mb-4">
                    <label class="form-label" for="form2Example27">Water</label>
                    <s:textfield name="donationBean.Water"  id="form2Example27"   class="form-control form-control-lg" required="true"/>
          
                  </div>
  
                  <div class="form-outline mb-4">
                    <label class="form-label" for="form2Example28">Food</label>
                    <s:textfield name="donationBean.Food"  id="form2Example28"   class="form-control form-control-lg" required="true" style="margin-top: 30px" />
                  
                  </div>

  
                  <div class="form-outline mb-4">
                    <label class="form-label" for="form2Example29">Medicine</label>
                <s:textfield name="donationBean.Medicine"  id="form2Example29" class="form-control form-control-lg" required="true" style="margin-top: 30px "/>
          
                  </div>

                  <div class="form-outline mb-4">
                    <label class="form-label" for="form2Example30">Clothes</label>
                    <s:textfield name="donationBean.Clothes" id="form2Example30"   class="form-control form-control-lg" required="true" style="margin-top: 30px" />
      
                  </div>

                  <div class="form-outline mb-4">
                    <label class="form-label" for="form2Example30">Sponsor</label>
                    <s:textfield name="donationBean.Sponsor"  id="form2Example31"  class="form-control form-control-lg" required="true" style="margin-top: 30px" />
         
                  </div>
                  <label class="form-label" for="form2Example31">Evacuation Name</label>
                  
               
                  
          
                  <s:select label="Evacuation Name" 
                  headerKey="-1" headerValue="Select Evacuation"
                  list="evacuations" 
                  name="evacueeBean.evacuationName" 
                  value="defaultSearchEngine" 
                  id="form2Example31"/>
              
  
                  <div class="d-flex justify-content-center">
                      <s:submit value="Add Evacuations" class="btn btn-success btn-block btn-lg gradient-custom-4 text-body" style="margin-top: 20px;" />
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