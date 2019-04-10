package com.example.newsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.ab.http.AbHttpClient;
import com.ab.http.AbHttpUtil;
import com.ab.http.AbRequestParams;
import com.ab.http.AbStringHttpResponseListener;
import com.ab.network.StringRequest;
import com.ab.util.AbToastUtil;
import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.AVQuery;
import com.avos.avoscloud.FindCallback;
import com.avos.avoscloud.SaveCallback;
import com.example.newsapp.Adapter.NewsAdapter;
import com.example.newsapp.model.News;
import com.example.newsapp.model.Test111;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.show.api.ShowapiRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
private TextView textView;
private ListView lvNews;
private ArrayList<News> listNews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        // 测试 SDK 是否正常工作的代码
//        AVObject testObject = new AVObject("TestObject");
//        testObject.put("words","Hello World!");
//        testObject.saveInBackground(new SaveCallback() {
//            @Override
//            public void done(AVException e) {
//                if(e == null){
//                    Log.d("saved","success!");
//                }
//            }
//        });
        textView=findViewById(R.id.tv_1);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbToastUtil.showToast(MainActivity.this,"点击了咨询按钮");
            }
        });
        AVQuery<AVObject> query = new AVQuery<>("TestObject");
        query.whereEqualTo("words", "Hello World!");
        query.findInBackground(new FindCallback<AVObject>() {
                                   @Override
                                   public void done(List<AVObject> avObjects, AVException avException) {
                                       if (avObjects != null) {
//                                         textView.setText(avObjects.toString());

                                       }
                                   }
                               }
        );


    }

    private void init() {

        listNews=new ArrayList<>();
        lvNews=findViewById(R.id.lv_news);
        getNewsData();
        NewsAdapter newsAdapter=new NewsAdapter(listNews,this);
        lvNews.setAdapter(newsAdapter);


    }

    private void getNewsData() {

        String url=MyLeanCloudApp.HTTPNET;
        AbHttpUtil.getInstance(this).get(url, new AbStringHttpResponseListener() {
            @Override
            public void onSuccess(int i, String s) {
                try {
                    JSONObject jsonObject=new JSONObject(s);
                    String status=jsonObject.getString("list");


                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void onStart() {

            }

            @Override
            public void onFinish() {

            }

            @Override
            public void onFailure(int i, String s, Throwable throwable) {

            }
        });
    }


}
