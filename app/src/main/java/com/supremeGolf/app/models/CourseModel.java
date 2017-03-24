package com.supremeGolf.app.models;

import com.google.gson.annotations.SerializedName;

public class CourseModel {

    @SerializedName("id")
    public Integer id;

    @SerializedName("slug")
    public String slug;

    @SerializedName("name")
    public String name;

    @SerializedName("address_1")
    public String address1;

    @SerializedName("address_city")
    public String addressCity;

    @SerializedName("address_state")
    public String addressState;

    @SerializedName("address_zipcode")
    public String addressZipCode;

    @SerializedName("address_country")
    public String addressCountry;

    @SerializedName("phone")
    public String phone;

    @SerializedName("latitude")
    public float latitude;

    @SerializedName("longitude")
    public float longitude;

    @SerializedName("rating")
    public float rating;

    @SerializedName("rounded_rating")
    public float roundedRating;

    @SerializedName("rating_count")
    public int ratingCount;

    @SerializedName("course_url")
    public String courseUrl;

    @SerializedName("photo_thumb_url")
    public String photoThumbUrl;

    @SerializedName("stats")
    public CourseStatsModel stats;

    @Override
    public String toString() {
        return "CourseModel{" +
                "id=" + id +
                ", slug='" + slug + '\'' +
                ", name='" + name + '\'' +
                ", address1='" + address1 + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", addressState='" + addressState + '\'' +
                ", addressZipCode='" + addressZipCode + '\'' +
                ", addressCountry='" + addressCountry + '\'' +
                ", phone='" + phone + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", rating=" + rating +
                ", roundedRating=" + roundedRating +
                ", ratingCount=" + ratingCount +
                ", courseUrl='" + courseUrl + '\'' +
                ", photoThumbUrl='" + photoThumbUrl + '\'' +
                ", stats=" + stats +
                '}';
    }

    public class CourseStatsModel {
        @SerializedName("tee_times_count")
        public Integer teeTimesCount;

        @SerializedName("min_rate")
        public float minRate;

        @Override
        public String toString() {
            return "CourseStats{" +
                    "teeTimesCount=" + teeTimesCount +
                    ", minRate=" + minRate +
                    '}';
        }
    }

}
