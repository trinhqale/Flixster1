package com.example.flixster1
import com.google.gson.annotations.SerializedName
class Movie {

    @SerializedName("overview")
    var overview = ""

    @JvmField
    @SerializedName("poster_path")
    var posterUri = ""

    @SerializedName("original_title")
    var title = ""

}