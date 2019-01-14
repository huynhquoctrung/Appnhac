package com.hqt.quoctrung.appnhac.Service;

public class APIService {
    private static String base_url = "https://huynhquoctrung1997.000webhostapp.com/Server/";

    public static Dataservice getService(){
        return APIRetrofitClient.getClient(base_url).create(Dataservice.class);
    }


}
