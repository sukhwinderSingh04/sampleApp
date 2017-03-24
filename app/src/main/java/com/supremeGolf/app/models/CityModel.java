package com.supremeGolf.app.models;

import com.google.gson.annotations.SerializedName;

public class CityModel {

    @SerializedName("id")
    public Integer id;

    @SerializedName("slug")
    public String slug;

    @SerializedName("name")
    public String name;

    @SerializedName("full_name")
    public String fullName;

    @SerializedName("city_url")
    public String cityUrl;

    @SerializedName("latitude")
    public Float latitude;

    @SerializedName("longitude")
    public Float longitude;

    @SerializedName("time_zone")
    public String timeZone;

    @SerializedName("avg_rate")
    public String avgRate;

    @SerializedName("avg_regular_rate")
    public String avgRegularRate;

    @SerializedName("min_rate")
    public String minRate;

    @SerializedName("min_regular_rate")
    public String minRegularRate;

    @SerializedName("max_rate")
    public String maxRate;

    @SerializedName("max_regular_rate")
    public String maxRegularRate;

    @SerializedName("state")
    public State state;

    @SerializedName("country")
    public Country country;

    @Override
    public String toString() {
        return "CityModel{" +
                "id=" + id +
                ", slug='" + slug + '\'' +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", cityUrl='" + cityUrl + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", timeZone='" + timeZone + '\'' +
                ", avgRate='" + avgRate + '\'' +
                ", avgRegularRate='" + avgRegularRate + '\'' +
                ", minRate='" + minRate + '\'' +
                ", minRegularRate='" + minRegularRate + '\'' +
                ", maxRate='" + maxRate + '\'' +
                ", maxRegularRate='" + maxRegularRate + '\'' +
                ", state=" + state +
                ", country=" + country +
                '}';
    }

    public static class Country {
        @SerializedName("id")
        public Integer id;

        @SerializedName("name")
        public String name;

        @SerializedName("iso2")
        public String iso2;

        @SerializedName("iso3")
        public String iso3;

        @Override
        public String toString() {
            return "Country{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", iso2='" + iso2 + '\'' +
                    ", iso3='" + iso3 + '\'' +
                    '}';
        }
    }

    public class State {

        @SerializedName("id")
        public Integer id;

        @SerializedName("name")
        public String name;

        @SerializedName("abbr")
        public String abbr;

        @Override
        public String toString() {
            return "State{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", abbr='" + abbr + '\'' +
                    '}';
        }
    }
}
