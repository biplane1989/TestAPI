package com.example.testapi.network

import com.example.testapi.network.model.Root
import okhttp3.ResponseBody

object ApiHelper {
    val apiRespository = ApiRespository()
    suspend fun getListPhoto(): List<Root>? {
        return apiRespository.getListPhoto()
    }

    suspend fun getPhoto(url: String): ResponseBody {
        return apiRespository.getPhoto(url)
    }
}