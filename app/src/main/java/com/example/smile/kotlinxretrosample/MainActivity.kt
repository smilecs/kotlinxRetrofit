package com.example.smile.kotlinxretrosample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val textView = findViewById<TextView>(R.id.sample)

        Retrofitclient.createRetrofit().create(Api::class.java).getToDo().enqueue(object : Callback<Field> {
            override fun onFailure(call: Call<Field>, t: Throwable) {

            }

            override fun onResponse(call: Call<Field>, response: Response<Field>) {
                response.body()?.let {
                    textView.text = it.toJsonBody()
                }
            }
        })
    }

}
