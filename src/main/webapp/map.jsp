<%@ page import="Model.GuideMeTo" %>
<%@ page import="java.util.Map" %>
<%@ page import="Model.Localizacao" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>GuideMeTo</title>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        #map{
            height:935px;
            width: 100%;
        }

    </style>
</head>
<body>



<%
    //String email = (String) request.getServletContext().getAttribute("email");
    //GuideMeTo gtm = (GuideMeTo) request.getServletContext().getAttribute("GTM");

%>


<div id="map"></div>

<h1><%//System.out.println(email);%></h1>


<script>
    function initMap() {
        var location = {lat: 41.559, lng: -8.427};
        var map= new google.maps.Map(document.getElementById("map"), {
            zoom: 12,
            center: location
        });
        var customStyled = [
            {
                featureType: "all",
                elementType: "labels",
                stylers: [
                    { visibility: "off" }
                ]
            }
        ];
        map.set('styles',customStyled);
        //var Locais = JSON.parse('${gson}')

        //<<h1>Locais</h1>



    }
</script>
<script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCAFdErN2BAGg2inePn_mSQ-sno_r4wuxY=&callback=initMap"></script>

</body>
</html>