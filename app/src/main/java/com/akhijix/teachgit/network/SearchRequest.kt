package com.akhijix.teachgit.network

import com.google.gson.annotations.SerializedName
//generated using https://json2kt.com/
data class SearchRequest (
    @SerializedName("q") var query : String? = null,
    @SerializedName("limit" ) var limit : Int? = null,
)