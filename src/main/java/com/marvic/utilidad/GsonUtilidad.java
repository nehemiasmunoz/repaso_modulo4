package com.marvic.utilidad;

import com.google.gson.Gson;

public class GsonUtilidad {

    public static <T> T deserializarObjeto(String json, Class<T> clase){
        Gson gson = new Gson();
        return gson.fromJson(json, clase);
    }
}
