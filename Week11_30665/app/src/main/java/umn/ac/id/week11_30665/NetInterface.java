package umn.ac.id.week11_30665;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NetInterface {

    @GET("posts")
    Call<ArrayList<RetrofitModel>> getPosts();
}
