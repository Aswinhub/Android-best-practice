package com.aswin.androidbestpractice.base

import com.aswin.androidbestpractice.api.ApiResult
import retrofit2.Response

open class BaseRepository {
    inline fun <T> makeRequest(request: () -> Response<T>): ApiResult<T> {
        return try {
            val response = request.invoke().body()
            ApiResult.Success(response)
        } catch (e: Exception) {
            ApiResult.Error(e.hashCode(), e.message, e)
        }
    }
}