package com.example.android.bodyconditionsystem

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Details(
//    @Expose
//    @SerializedName("id")
//    var id: Integer,


    @Expose
    @SerializedName("tag_number")
    var tag_number: Integer,

    @Expose
    @SerializedName("overall_bsv")
    var overall_bsv: Integer,

    @Expose
    @SerializedName("feed")
    var feed: String
)