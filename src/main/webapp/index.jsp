<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        #map{
            height:940px;
            width: 100%;
        }

    </style>
</head>
<body>

<div id="map"></div>

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
    }
</script>
<script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCAFdErN2BAGg2inePn_mSQ-sno_r4wuxY=&callback=initMap"></script>

</body>
</html>