package com.example.emptyviewsactivity

// api/ApiService.kt

import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.*

data class User(
    @SerializedName("Id") val id: Int,
    @SerializedName("Name") val name: String,
    @SerializedName("Email") val email: String
)

interface ApiService {
    @GET("users")
    fun getUsers(): Call<List<User>>

    @POST("users")
    @FormUrlEncoded
    fun addUser(
        @Field("Id") id: Int,
        @Field("Name") name: String,
        @Field("Email") email: String
    ): Call<User>
}
