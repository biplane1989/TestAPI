package com.example.testapi.network

import android.util.Log
import com.example.testapi.network.model.Root
import okhttp3.ResponseBody

class ApiRespository : IApiRepository {
    val TAG = "giangtd"
    override suspend fun getListPhoto(): List<Root>? {
        return try {
//            Log.d(TAG, "Exception: 00-1")
//            val response = RetrofitBuilder.apiService.getPhotos()
//            Log.d(TAG, "Exception: 000")
//            if (response.isSuccessful) {
//                val listUnsplashPhoto = response.body()
//                if (listUnsplashPhoto != null) {
//                    listUnsplashPhoto
//                } else {
//                    Log.d(TAG, "Exception: 001")
//                    null
//                }
//            } else {
//                Log.d(TAG, "Exception: 002")
//                null
//            }
            null
        } catch (e: Exception) {
            Log.d(TAG, "Exception: ${e.toString()}")
            null
        }
    }

    override suspend fun getPhoto(url: String): ResponseBody {
        val newUrl = "$url&w=1080&dpi=1"
        return RetrofitBuilder.apiService.downloadPhoto(newUrl)
    }
}