package com.example.dialog1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder dlg
                        =new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("다이얼로그창");
                dlg.setMessage("니가 사랑을 받고싶으면 제대로 하든가");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,
                                "확인완료 새끼야",
                                Toast.LENGTH_SHORT).show();
                    }
                });
                dlg.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,
                                "넌 그냥 취소나 해라 어휴",
                                Toast.LENGTH_SHORT).show();
                    }
                });


                dlg.show();


                /*Toast.makeText(MainActivity.this,
                        "눌렀지",
                        Toast.LENGTH_LONG).show();*/
            }
        });


    }
}