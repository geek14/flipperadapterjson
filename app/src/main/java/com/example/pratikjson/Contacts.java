package com.example.pratikjson;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by geek14 on 22-11-2017.
 */

public class Contacts {
    @SerializedName("contacts")
    private ArrayList<Data> contacts;

    public Contacts(){

    }

    public ArrayList<Data> getContacts(){
        return contacts;
    }
}
