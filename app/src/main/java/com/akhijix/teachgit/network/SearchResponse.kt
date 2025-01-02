package com.akhijix.teachgit.network

import com.google.gson.annotations.SerializedName
//generated using https://json2kt.com/
data class SearchResponse (

    @SerializedName("total_count"        ) var totalCount        : Int?             = null,
    @SerializedName("incomplete_results" ) var incompleteResults : Boolean?         = null,
    @SerializedName("items"              ) var items             : ArrayList<Items> = arrayListOf()

)