<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
  <head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Weather View</title>
    <style>
        body {
    color: #fff;
    overflow-x: hidden;
    height: 100%;
    background-color: #CFD8DC;
    background-repeat: no-repeat;
}

.card {
    background-image: url("https://i.imgur.com/dpqZJV5.jpg");
    background-size: cover;
    width: 600px;
    height: 350px;
    border-radius: 20px;
    box-shadow: 0px 8px 16px 4px #9E9E9E;
    margin-top: 50px;
    margin-bottom: 50px;
}

.time-font {
    font-size: 50px;
}

.sm-font {
    font-size: 18px;
}

.med-font {
    font-size: 28px;
}

.large-font {
    font-size: 60px;
}
    </style>
  </head>
  <body>
    <s:include value="Menu2.jsp" /> 
    <main>
        <div class="container-fluid px-1 px-md-4 py-5 mx-auto">
            <div class="row d-flex justify-content-center px-3">
                <div class="card">
                    <h2 class="ml-auto mr-4 mt-3 mb-0">    <s:property value="weatherResponse.request.query"/><br/></h2>
                    <p class="ml-auto mr-4 mb-0 med-font">Wind Speed: <s:property value="weatherResponse.current.wind_speed"/></p>
                    <h1 class="ml-auto mr-4 large-font"> <s:property value="weatherResponse.current.temperature"/>C&#176;</h1>
                    <p class="time-font mb-0 ml-4 mt-auto"><s:property value="weatherResponse.location.localtime"/></p>
                    <p class="ml-4 mb-4">Observation Time: <s:property value="weatherResponse.current.observation_time"/></p>
                </div>
        </div>
 
    </main>
  </body>
</html>