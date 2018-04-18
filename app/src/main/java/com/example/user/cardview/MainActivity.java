package com.example.user.cardview;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomething(View view) {
        final AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setTitle("Confirm");
        myAlert.setMessage("Telah ditambahkan");
        myAlert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        myAlert.setCancelable(true);
        myAlert.show();
    }

    public void doUnhas(View view) {
        final AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setTitle("Universitas Hasanuddin");
        myAlert.setMessage("Kunjungi Laman?");
        myAlert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Uri uri = Uri.parse("http://www.unhas.ac.id");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

//                String url = "http://www.unhas.ac.id";
//                Intent intent = new Intent(MainActivity.this, WebsiteActivity.class);
//                intent.putExtra("website", url);
//                startActivity(intent);
            }
        });
        myAlert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        myAlert.setCancelable(true);
        myAlert.show();
    }

    public void doUnm(View view) {
        final AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setTitle("Universitas Negeri Makassar");
        myAlert.setMessage("Kunjungi Laman?");
        myAlert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Uri uri = Uri.parse("http://www.unm.ac.id");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        myAlert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        myAlert.setCancelable(true);
        myAlert.show();
    }

    public void doUin(View view) {
        final AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setTitle("Universitas Islam Negeri Alauddin");
        myAlert.setMessage("Kunjungi Laman?");
        myAlert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Uri uri = Uri.parse("http://www.uin-alauddin.ac.id");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        myAlert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        myAlert.setCancelable(true);
        myAlert.show();
    }

}
