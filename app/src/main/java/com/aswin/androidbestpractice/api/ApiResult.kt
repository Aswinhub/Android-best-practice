package com.aswin.androidbestpractice.api

sealed class ApiResult<out T> {
    data class Success<out T>(val data: T?) : ApiResult<T>()
    data class Error(val code: Int, val msg: String?, val exception: Exception) :
        ApiResult<Nothing>()
}
