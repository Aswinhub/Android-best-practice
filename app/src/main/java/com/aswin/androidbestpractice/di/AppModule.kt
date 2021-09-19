package com.aswin.androidbestpractice.di

import com.aswin.androidbestpractice.api.RetrofitBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun retrofitProvider(): Retrofit {
        return RetrofitBuilder.getRetrofit()
    }
}