package com.makuta.jokes.net

import com.makuta.jokes.model.Joke
import com.makuta.jokes.model.JokeEndpoint
import com.makuta.jokes.model.JokeFlagList
import com.makuta.jokes.model.JokeFormats
import com.makuta.jokes.model.JokeLang
import com.makuta.jokes.model.JokeLangs
import com.makuta.jokes.model.JokeList
import com.makuta.jokes.model.JokeNew
import com.makuta.jokes.model.JokePing
import com.makuta.jokes.model.JokesCategories
import com.makuta.jokes.model.JokesInfo
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface JokeBackend {

    @GET("joke/{list}")
    suspend fun getJokes(
        @Path("list")               list            : String,
        @Query("amount")            size            : Int,
        @Query("blacklistFlags")    blacklistFlags  : String? = null,
        @Query("lang")              lang            : String? = null,
        @Query("idRange")           idRange         : String? = null,
        @Query("contains")          contains        : String? = null,
        @Query("type")              type            : String? = null
    ) : Response<JokeList>

    @GET("joke/{list}")
    suspend fun getJoke(
        @Path("list")               list            : String,
        @Query("blacklistFlags")    blacklistFlags  : String? = null,
        @Query("lang")              lang            : String? = null,
        @Query("idRange")           idRange         : String? = null,
        @Query("contains")          contains        : String? = null,
        @Query("type")              type            : String? = null
    ) : Response<Joke>

    @GET("info")
    suspend fun info(
        @Query("lang") lang : String? = null
    ) : Response<JokesInfo>

    @GET("categories")
    suspend fun categories(
        @Query("lang") lang : String? = null
    ) : Response<JokesCategories>

    @GET("langcode/{lang}")
    suspend fun langcode(
        @Path("lang")   langp   : String,
        @Query("lang")  lang    : String? = null
    ) : Response<JokeLang>

    @GET("languages")
    suspend fun languages(
        @Query("lang")  lang    : String? = null
    ) : Response<JokeLangs>

    @GET("flags")
    suspend fun flags(
        @Query("lang")  lang    : String? = null
    ) : Response<JokeFlagList>

    @GET("formats")
    suspend fun formats(
        @Query("lang")  lang    : String? = null
    ) : Response<JokeFormats>

    @GET("ping")
    suspend fun ping(
        @Query("lang")  lang    : String? = null
    ) : Response<JokePing>

    @GET("endpoints")
    suspend fun endpoints() : Response<List<JokeEndpoint>>

    @POST("submit")
    suspend fun submit(@Body joke : JokeNew) : Response<List<JokeEndpoint>>

}