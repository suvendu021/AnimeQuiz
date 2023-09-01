package com.example.animequiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button yes,no;
    TextView textView2;
    private String[] Questions={"Naruto is hero of leaf village ?","light yagami is not kira ?","shinigami belogs to earth ?","sakura loves naruto ?","Hinata loves Naruto ?"};
    private boolean[] answer={true,false,false,false,true};
    private int index=0;
    private int result=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
        }

        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        textView2=findViewById(R.id.textView2);
        textView2.setText(Questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<= Questions.length-1){
                    if(answer[index]==true){
                        result++;
                    }
                    index++;
                    if(index<= Questions.length-1){
                        textView2.setText(Questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "your score is "+result+"/"+Questions.length, Toast.LENGTH_SHORT).show();
                    }

                }
                else {
                    Toast.makeText(MainActivity.this, "Restart app for playing again it", Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<= Questions.length-1){
                    if(answer[index]==false){
                        result++;
                    }
                    index++;
                    if(index<= Questions.length-1){
                        textView2.setText(Questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "your score is "+result+"/"+Questions.length, Toast.LENGTH_SHORT).show();
                    }

                }
                else {
                    Toast.makeText(MainActivity.this, "Restart app for playing again it", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}