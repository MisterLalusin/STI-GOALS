package pro.gr.ams.stigoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class refresh001 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_refresh001);//ui team para icopy yung layout ng home, pag kinapy yung xml tanggalin lahat ng onclick

        overridePendingTransition(R.anim.alpha_enter001, R.anim.alpha_exit001);

        Thread thread=new Thread() {
            @Override
            public void run() {
                try {
                    sleep(100);
                    Intent i=new Intent(getApplicationContext(),refresh002.class);
                    startActivity(i);
                }
                catch (Exception ex)
                {}
            }
        };
        thread.start();
    }
}
