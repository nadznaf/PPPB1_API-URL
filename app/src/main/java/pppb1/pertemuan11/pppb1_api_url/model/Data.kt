package pppb1.pertemuan11.pppb1_api_url.model

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("id")
    val id: Int,

    @SerializedName("email")
    val email: String,

    @SerializedName("first_name")
    val first_name: String,

    @SerializedName("last_name")
    val last_name: String,

    @SerializedName("avatar")
    val avatar: String
)
{
    val fullName: String
        get() = "$first_name $last_name"
}