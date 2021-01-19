package pro.gr.ams.stigoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;
import android.media.AudioManager;

public class stihymn001 extends AppCompatActivity {

    MediaPlayer stihymn001;

    public Button gotohome001;

    public void stihymngotohome001(){
        gotohome001= (Button) findViewById(R.id.gotohome001);
        gotohome001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent stihymngotohome001 = new Intent(stihymn001.this,refresh001.class);
                startActivity(stihymngotohome001);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_stihymn001);

        overridePendingTransition(R.anim.alpha_enter001, R.anim.alpha_exit001);
        stihymngotohome001();

        stihymn001 = MediaPlayer.create(this, R.raw.stihymn002);
        stihymn001.setAudioStreamType
                (AudioManager.STREAM_MUSIC);
        stihymn001.setLooping(false);
        stihymn001.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        stihymn001.release();
    }
}
