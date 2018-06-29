package com.mzw.myokhttpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


/**
 * OkHttp 不能在主线程种使用。
 */
public class MainActivity extends AppCompatActivity {

    OkHttpClient client = new OkHttpClient();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void btn(View view) throws IOException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Log.i("-----","" + get("http://www.baidu.com/"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }



    // GET 请求
    String get(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    // POST 请求
    String post(String url) throws IOException {
        RequestBody requestBodyPost = new FormBody.Builder()
                .add("code", "0")
                .add("msg", "哈哈")
                .add("time", "1530256032")
                .build();

        Request request = new Request.Builder()
                .url(url)
                .post(requestBodyPost)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}
