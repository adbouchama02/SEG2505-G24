package com.example.profilemanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {
    ImageView i0,i1,i2,i3,i4,i5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        i0=(ImageView)findViewById(R.id.image0);
        i1=(ImageView)findViewById(R.id.image1);
        i2=(ImageView)findViewById(R.id.image2);
        i3=(ImageView)findViewById(R.id.image3);
        i4=(ImageView)findViewById(R.id.image4);
        i5=(ImageView)findViewById(R.id.image5);

        i0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SetTeamIcon(v);
            }
        });
        i1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SetTeamIcon(v);
            }
        });
        i2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SetTeamIcon(v);
            }
        });
        i3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SetTeamIcon(v);
            }
        });
        i4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SetTeamIcon(v);
            }
        });
        i5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SetTeamIcon(v);
            }
        });
    }
    public void SetTeamIcon(View view){
        Intent returnIntent=new Intent();
        ImageView selectedImage=(ImageView) view;
        returnIntent.putExtra("ImageID",selectedImage.getId());
        setResult(RESULT_OK,returnIntent);
        finish();
    }
}