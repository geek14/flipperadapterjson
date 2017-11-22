package com.example.pratikjson;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by geek14 on 22-11-2017.
 */

public interface APIService {


    @GET("/json_data.json")
    Call<Contacts> getContacts();

}
