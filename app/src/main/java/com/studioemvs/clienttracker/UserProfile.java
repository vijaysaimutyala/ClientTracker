package com.studioemvs.clienttracker;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vijsu on 17-03-2017.
 */

public class UserProfile {
    String name;
    Long latitude;
    Long longitude;
    String client;
    String id;

    public UserProfile() {
    }

    public UserProfile(String name, Long latitude, Long longitude, String client, String id) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.client = client;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Long getLatitude() {
        return latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public String getClient() {
        return client;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Exclude
    public Map<String,Object> toMap(){
        HashMap<String,Object> result = new HashMap<>();
        result.put("name",name);
        result.put("id",id);
        result.put("client",client);
        result.put("latitude",latitude);
        result.put("longitude",longitude);

        return result;
    }

}
