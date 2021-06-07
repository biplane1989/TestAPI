package com.example.testapi

import ApiService
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.example.testapi.network.ApiHelper
import com.example.testapi.utils.Constance
import com.google.gson.GsonBuilder
import com.google.gson.JsonParser
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create Retrofit
        val retrofit = Retrofit.Builder()
            .baseUrl(Constance.BASE_URL)
            .build()

        // Create Service
        val service = retrofit.create(ApiService::class.java)

        CoroutineScope(Dispatchers.IO).launch {
//            Log.d("giangtd", "item : 001")
//            val list = ApiHelper.getListPhoto()
//            Log.d("giangtd", "item :  list size : ${list?.size}")
//            for (item in list!!){
//                Log.d("giangtd", "item :  ${item.id}")
//            }

            val response = service.getPhotos()

            withContext(Dispatchers.Main) {
                if (response.isSuccessful) {

                    // Convert raw JSON to pretty JSON using GSON library
                    val gson = GsonBuilder().setPrettyPrinting().create()
                    val prettyJson = gson.toJson(
                        JsonParser.parseString(
                            response.body()
                                ?.string() // About this thread blocking annotation : https://github.com/square/retrofit/issues/3255
                        )
                    )
                    Log.d("Pretty Printed JSON :", prettyJson)


                } else {

                    Log.e("RETROFIT_ERROR", response.code().toString())

                }
            }
        }
    }
}