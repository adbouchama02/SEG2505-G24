package com.example.profilemanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btnMaps;
    EditText editName,editZip;
    ImageView teamImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMaps=(Button) findViewById(R.id.btnGoogleMaps);
        editZip=(EditText) findViewById(R.id.editZip);
        teamImage=(ImageView)  findViewById(R.id.logoImage);

        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOpenGoogleMaps(v);
            }
        });
        teamImage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onSetAvatarButton(v);
            }
        });


    }
    public void onOpenGoogleMaps(View view) {
        Uri gmmIntentUri=Uri.parse("https://maps.google.co.in/maps?q="+editZip.getText());
        Intent mapIntent=new Intent(Intent.ACTION_VIEW,gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
    public void onSetAvatarButton(View view) {
        Intent intent=new Intent(getApplicationContext(),ProfileActivity.class);
        startActivityForResult(intent,0);
    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(resultCode==RESULT_CANCELED) return;
        ImageView avatarImage=(ImageView) findViewById(R.id.logoImage);
        String drawableName="ic_logo_00";
        switch((data.getIntExtra("ImageID",R.id.image0))){
            case R.id.image0:
                drawableName="ic_logo_00";
                break;
            case R.id.image1:
                drawableName="ic_logo_01";
                break;
            case R.id.image2:
                drawableName="ic_logo_02";
                break;
            case R.id.image3:
                drawableName="ic_logo_03";
                break;
            case R.id.image4:
                drawableName="ic_logo_04";
                break;
            case R.id.image5:
                drawableName="ic_logo_05";
                break;
        }
        int resID=getResources().getIdentifier(drawableName,"drawable",getPackageName());
        avatarImage.setImageResource(resID);
    }

}