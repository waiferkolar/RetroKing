package coder.test.retroking.services

import coder.test.retroking.models.Photo
import coder.test.retroking.models.Post
import retrofit2.Call
import retrofit2.http.*

interface WebService {

    @GET("/posts")
    fun getAllPost(): Call<List<Post>>

    @GET("/photos")
    fun getAllPhoto():Call<List<Photo>>

    @FormUrlEncoded
    @POST("/posts")
    fun createPost(
        @Field("userId") userId : Int,
        @Field("id") id : Int,
        @Field("title") title: String,
        @Field("body") body : String
        ) : Call<Post>

    @GET("/posts/{id}")
    fun getSinglePost(
        @Path("id") id : Int
    ):Call<Post>
    // Query
    // @Header
    // @Part file: MultipartBody.Part
}