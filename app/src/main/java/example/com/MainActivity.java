package example.com;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//NIM : 10116027 | Nama : Putri R. Amelia | Kelas : IF-1

public class MainActivity extends AppCompatActivity {
    private int waktu_loading=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent Welcome =new Intent(MainActivity.this, Welcome.class);
                startActivity(Welcome);
                finish();

            }
        },waktu_loading);
    }
}
