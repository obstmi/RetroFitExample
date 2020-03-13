package de.obsti.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    // Retrofit implementiert die Methoden, um per GET auf die Ressource "posts" zuzugreifen
    @GET("posts")
    Call<List<Post>> getPosts();
}
