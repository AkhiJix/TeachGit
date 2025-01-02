package com.akhijix.teachgit.network

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {

    @POST("repositories")
    @FormUrlEncoded
    fun search(@Body q : SearchRequest) : Call<SearchResponse>
}