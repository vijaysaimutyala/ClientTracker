package com.studioemvs.clienttracker;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by vijsu on 30-03-2017.
 */

public class Constants {

    private Constants() {
    }

    public static final String PACKAGE_NAME = "com.google.android.gms.location.Geofence";

    public static final String SHARED_PREFERENCES_NAME = PACKAGE_NAME + ".SHARED_PREFERENCES_NAME";

    public static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    public static final long GEOFENCE_EXPIRATION_IN_HOURS = 12;

    /**
     * For this sample, geofences expire after twelve hours.
     */
    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    public static final float GEOFENCE_RADIUS_IN_METERS =100 ; // 1 mile, 1.6 km

    /**
     * Map for storing information about airports in the San Francisco bay area.
     */
    public static final HashMap<String, LatLng> INFY_LANDMARKS = new HashMap<String, LatLng>();
    static {
        //myLocation
        INFY_LANDMARKS.put("my Location",new LatLng(17.441269, 78.649272));
        // Infy main gate
        INFY_LANDMARKS.put("Infy Main Gate", new LatLng(17.444973, 78.640227));

        // infy Bus bay.
        INFY_LANDMARKS.put("Infy Bus Bay", new LatLng(17.444600, 78.637849));
        //infy turnstile
        INFY_LANDMARKS.put("Infy Turnstile", new LatLng(17.445845, 78.634887));
        //Foodcourt 9
        INFY_LANDMARKS.put("FoodCourt 9", new LatLng(17.447999, 78.634969));
        //B12B14
        INFY_LANDMARKS.put("B12 B14", new LatLng(17.448571, 78.634969));
        //B10B11
        INFY_LANDMARKS.put("B10 B11", new LatLng(17.448505, 78.636748));
        //Foodcourt8
        INFY_LANDMARKS.put("FoodCourt 8", new LatLng(17.447323, 78.636632));
        //B2B3
        INFY_LANDMARKS.put("B2 B3", new LatLng(17.447065, 78.635728));
        //CoffeeDay
        INFY_LANDMARKS.put("Coffee Day", new LatLng(17.446952, 78.634808));
        //OmniHospital
/*        INFY_LANDMARKS.put("OmniHospital", new LatLng(17.368476, 78.538722));
        INFY_LANDMARKS.put("MahalaxmiTheater", new LatLng(17.369457, 78.539835));
        INFY_LANDMARKS.put("ChinaBazar", new LatLng(17.370841, 78.540574));
        INFY_LANDMARKS.put("Mohan Nagar", new LatLng(17.373738, 78.549656));
        INFY_LANDMARKS.put("NagoleXroads", new LatLng(17.376287, 78.557124));
        INFY_LANDMARKS.put("Nagole Busstop", new LatLng(17.376287, 78.557124));
        INFY_LANDMARKS.put("Uppal Metro", new LatLng(17.399967, 78.560170));
        INFY_LANDMARKS.put("Uppal X roads bus stop", new LatLng(17.400904, 78.560096));
        INFY_LANDMARKS.put("Uppal Gandhi Statue", new LatLng(17.401495, 78.565305));
        INFY_LANDMARKS.put("Uppal Bus stop", new LatLng(17.401382, 78.568515));
        INFY_LANDMARKS.put("Peerzadiguda", new LatLng(17.401393, 78.581510));
        INFY_LANDMARKS.put("Boduppal kaman", new LatLng(17.404789, 78.586811));
        INFY_LANDMARKS.put("Medipally", new LatLng(17.410190, 78.603229));
        INFY_LANDMARKS.put("McD", new LatLng(17.419380, 78.635472));
        INFY_LANDMARKS.put("Zenpact", new LatLng(17.443170, 78.649576));
        INFY_LANDMARKS.put("Infy Main Gate", new LatLng(17.444976, 78.640206));*/

    }
}
