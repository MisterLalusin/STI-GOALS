package pro.gr.ams.stigoals;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home001 extends AppCompatActivity {

    public Button gotoaboutdevelopers001;
    public Button gotointroduction001;
    public Button gototrivias001;
    public Button gotostihymn001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_home001);

        overridePendingTransition(R.anim.alpha_enter001, R.anim.alpha_exit001);

        homegotoaboutdevelopers001();
        homegotointroduction001();
        homegototrivias001();
        homegotostihymn001();

    }

    public void homegotoaboutdevelopers001(){
        gotoaboutdevelopers001= (Button) findViewById(R.id.gotoaboutdevelopers001);
        gotoaboutdevelopers001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent homegotoaboutdevelopers001 = new Intent(home001.this,aboutdevelopers001.class);
                startActivity(homegotoaboutdevelopers001);

            }
        });
    }

    public void homegotointroduction001(){
        gotointroduction001= (Button) findViewById(R.id.gotointroduction001);
        gotointroduction001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent homegotointroduction001 = new Intent(home001.this,introduction001.class);
                startActivity(homegotointroduction001);

            }
        });
    }

    public void homegototrivias001(){
        gototrivias001= (Button) findViewById(R.id.gototrivias001);
        gototrivias001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent homegototrivias001 = new Intent(home001.this,trivias001.class);
                startActivity(homegototrivias001);

            }
        });
    }

    public void homegotostihymn001(){
        gotostihymn001= (Button) findViewById(R.id.gotostihymn001);
        gotostihymn001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent homegotostihymn001 = new Intent(home001.this,stihymn001.class);
                startActivity(homegotostihymn001);

            }
        });
    }

    public void gotoexit001(View v){
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}