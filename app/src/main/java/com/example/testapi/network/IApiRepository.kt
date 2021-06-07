package com.example.testapi.network

import com.example.testapi.network.model.Root
import okhttp3.ResponseBody

interface IApiRepository {
    suspend fun getListPhoto(): List<Root>?
    suspend fun getPhoto(url: String): ResponseBody
}