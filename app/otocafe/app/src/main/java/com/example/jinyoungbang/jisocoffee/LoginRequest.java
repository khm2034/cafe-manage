package com.example.jinyoungbang.jisocoffee;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JinyoungBang on 2017-09-03.
 */

public class LoginRequest extends StringRequest{
    final static private String URL = "http://52.79.219.34/UserLogin2.php";


    private Map<String,String> parameters;

    public LoginRequest(String userID, String userPassword, Response.Listener<String> listener){
        super(Request.Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID",userID);
        parameters.put("userPassword",userPassword);
    }

    @Override
    public Map<String,String> getParams() {
        return parameters;
    }
}

