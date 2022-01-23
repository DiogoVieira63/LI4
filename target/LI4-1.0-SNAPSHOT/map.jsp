<%--@elvariable id="Locais" type="java.lang.String"--%>
<%@ page import="Model.GuideMeTo" %>
<%@ page import="java.util.Map" %>
<%@ page import="Model.Localizacao" %>
<%@ page import="java.sql.SQLException" %>
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

        body {
            font-family: "Lato", sans-serif;
        }

        .sidenav {
            height: 100%;
            width: 300px;
            position: fixed;
            z-index: 1;
            top: 0;
            left: 0;
            background-color: #111;
            overflow-x: hidden;
            padding-top: 20px;
        }

        .sidenav a {
            padding: 6px 8px 6px 16px;
            text-decoration: none;
            font-size: 25px;
            color: #818181;
            display: block;
        }

        .sidenav h1 {
            padding: 6px 8px 6px 16px;
            text-decoration: none;
            font-size: 35px;
            color: #E6A018;
            display: block;
            text-align: center;
        }

        .sidenav h2 {
            text-decoration: none;
            font-size: 20px;
            color: #C1C2C2;
            text-align: center;
            vertical-align: middle;
        }

        .sidenav p {
            text-decoration: none;
            font-size: 15px;
            color: #C1C2C2;
            text-align: center;
            vertical-align: middle;
        }


        .sidenav img {
            border-radius: 10px;
            padding: 5px 5px 5px 5px;
            width: 90%;
        }

        .sidenav a:hover {
            color: #f1f1f1;
        }

        .sidenav {
            text-align: center;
        }

        .main {
            margin-left: 160px;
            /* Same as the width of the sidenav */
            font-size: 28px;
            /* Increased text to enable scrolling */
            padding: 0px 10px;
        }

        @media screen and (max-height: 450px) {
            .sidenav {
                padding-top: 15px;
            }

            .sidenav a {
                font-size: 18px;
            }
        }

    </style>
</head>
<body>



<%
    String email = (String) request.getServletContext().getAttribute("Email");
    GuideMeTo gtm = (GuideMeTo) request.getServletContext().getAttribute("GTM");
%>



<div class="sidenav">
    <div style="align-self: center;">
        <img src="https://i.ibb.co/n6BX6gB/logo.png">
    </div>
    <table style="width:100%">
        <tr>
            <td style="width: 10%;"><img src="https://i.ibb.co/v3yBNZG/user.png" style="width: 25px;background-color: #cccccc;"></td>
            <td>
                <h2>${Nome}</h2>
            </td>
        </tr>
        <tr>
            <td><img src="https://i.ibb.co/qsh415P/email.png" style="width: 20px;background-color: #cccccc;"></td>
            <td>
                <h2>${Email}</h2>
            </td>
        </tr>
    </table>
    <img id="centroFoto">
    <div class="centro">
        <h2 id="centroNome"></h2>
        <p id="centroLocal"></p>
        <a id="centroWeb"></a>
        <h3></h3>
    </div>
</div>

<div id="map"></div>

<h1><%//System.out.println(email);%></h1>




<script>
    function initMap() {
        var location = {lat: 41.559, lng: -8.427};
        var map= new google.maps.Map(document.getElementById("map"), {
            zoom: 13,
            center: location
        });
        var customStyled = [
            {
                "featureType": "administrative",
                "elementType": "geometry",
                "stylers": [
                    {
                        "visibility": "off"
                    }
                ]
            },
            {
                "featureType": "poi",
                "stylers": [
                    {
                        "visibility": "off"
                    }
                ]
            },
            {
                "featureType": "road",
                "elementType": "labels.icon",
                "stylers": [
                    {
                        "visibility": "off"
                    }
                ]
            },
            {
                "featureType": "transit",
                "stylers": [
                    {
                        "visibility": "off"
                    }
                ]
            }
        ];
        map.set('styles',customStyled);
        var mapLocais = new Map(Object.entries(JSON.parse('${Locais}')))
        for (let [key,value] of mapLocais) {
            let marker = new google.maps.Marker({
                position: new google.maps.LatLng(value["latitude"],value["longitude"]),
                content:key //STORE PLACE ID HERE
            });
            marker.setMap(map);
            
            marker.addListener("click", function (){
                map.setCenter(marker.getPosition());
                window.location.replace("map?key=" + marker.content);
            });
        }
        if ('${Centro}' != null){
            var centro = new Map(Object.entries(JSON.parse('${Centro}')));
            document.getElementById("centroNome").innerHTML = centro.get("descricao");
            document.getElementById("centroLocal").innerHTML = centro.get("rua");
            var site = document.getElementById("centroWeb");
            site.href=centro.get("site");
            site.innerHTML = "Website";
            const request = {
                placeId:centro.get("nome"),
                fields: ["photo_reference"]
            };

            service = new google.maps.places.PlacesService(map);
            service.getDetails(request, callback);

            function callback(place, status) {
                console.log(status);
                if (status === new google.maps.places.PlacesServiceStatus.OK) {
                    var photo = document.getElementById("centroFoto");
                    console.log(photo);
                    photo.src = "https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&key=AIzaSyCAFdErN2BAGg2inePn_mSQ-sno_r4wuxYphotoreference=" + photo;
                }
            }
        }
        
    }


</script>
<script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCAFdErN2BAGg2inePn_mSQ-sno_r4wuxY=&callback=initMap"></script>

</body>
</html>
1