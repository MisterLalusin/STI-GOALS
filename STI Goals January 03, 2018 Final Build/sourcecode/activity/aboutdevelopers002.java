package pro.gr.ams.stigoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class aboutdevelopers002 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_aboutdevelopers002);

        overridePendingTransition(R.anim.alpha_enter001, R.anim.alpha_exit001);

        Thread thread=new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1*1800);
                    Intent i=new Intent(getApplicationContext(),aboutdevelopers003.class);
                    startActivity(i);
                }
                catch (Exception ex)
                {}
            }
        };
        thread.start();
    }
}

