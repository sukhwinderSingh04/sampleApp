package com.supremeGolf.app.models;

import com.google.gson.annotations.SerializedName;

public class AutoCompleteModel {

    private static final String TYPE_CITY = "City";
    private static final String TYPE_ZIPCODE = "Zipcode";

    @SerializedName("id")
    public Integer id;

    @SerializedName("slug")
    public String slug;

    @SerializedName("label")
    public String label;

    @SerializedName("type")
    public String type;

    @SerializedName("latitude")
    public Double latitude;

    @SerializedName("longitude")
    public Double longitude;

    public boolean isTypeCity() {
        return TYPE_CITY.equals(type);
    }

    public boolean isTypeZipcode() {
        return TYPE_ZIPCODE.equals(type);
    }

    @Override
    public String toString() {
        return "AutoCompleteModel{" +
                "id=" + id +
                ", slug='" + slug + '\'' +
                ", label='" + label + '\'' +
                ", type='" + type + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
