package kookmin.ac.kr.m2_implicit_intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt_1;
    Button bt_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_1 = (Button)findViewById(R.id.bt_naver);
        bt_2 = (Button)findViewById(R.id.bt_daum);



        bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW);
                Uri u1 = Uri.parse("http://www.naver.com/");
                i1.setData(u1);
                startActivity(i1);
            }
        });

        bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Intent.ACTION_VIEW);
                Uri u2 = Uri.parse("http://www.daum.com/");
                i2.setData(u2);
                startActivity(i2);
            }
        });
    }
}
