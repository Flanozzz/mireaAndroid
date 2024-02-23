package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.myapp.databinding.ActivityMainBinding;
import com.example.myapp.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySecondBinding binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.closeButton.setOnClickListener(view -> {
            Log.d(Utils.MY_TAG, "click on close button");
            Intent resultIntent = new Intent();
            Log.d(Utils.MY_TAG, binding.editText.getText().toString());
            resultIntent.putExtra(Utils.RESULT_KIY, binding.editText.getText().toString());
            setResult(Activity.RESULT_OK, resultIntent);
            finish();
        });

        binding.imageView1.setImageDrawable(getDrawable(R.drawable.image1));
        binding.imageView2.setImageDrawable(getDrawable(R.drawable.image2));
    }


}