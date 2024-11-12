package pppb1.pertemuan11.pppb1_api_url.network

import pppb1.pertemuan11.pppb1_api_url.model.Profile
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("users?page=2")
    fun getAllUsers(): Call<Profile>
}