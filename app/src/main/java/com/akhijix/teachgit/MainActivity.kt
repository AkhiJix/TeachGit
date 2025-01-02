package com.akhijix.teachgit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.akhijix.teachgit.databinding.ActivityMainBinding
import com.akhijix.teachgit.network.SearchRequest
import com.akhijix.teachgit.network.SearchResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

//    private lateinit var apiClient: ApiClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

//        apiClient = ApiClient()



//        apiClient.getApiService().search(SearchRequest("hey"))
//            .enqueue(object : Callback<SearchResponse> {
//                override fun onFailure(call : Call<SearchResponse>, t : Throwable){
//                    //ERROR
//                }
//
//                override fun onResponse(call: Call<SearchResponse>,response: Response<SearchResponse>
//                ) {
//                    val searchResponse = response.body()
//
//                    if(searchResponse?.incompleteResults != false && searchResponse?.totalCount!=0){
//
//                    }
//                }
//            }
    }
}