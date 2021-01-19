package pro.gr.ams.stigoals;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class loading001 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_loading001);

        overridePendingTransition(R.anim.alpha_enter001, R.anim.alpha_exit001);


        Thread thread=new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3*1000);
                    Intent i=new Intent(getApplicationContext(),refresh001.class);
                    startActivity(i);
                }
                catch (Exception ex)
                {}
            }
        };
        thread.start();
    }
}