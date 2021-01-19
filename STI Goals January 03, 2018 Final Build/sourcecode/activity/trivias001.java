package pro.gr.ams.stigoals;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class trivias001 extends AppCompatActivity {

    ViewPager viewPager;

    public Button gotohome001;

    public void triviasgotohome001(){
        gotohome001= (Button) findViewById(R.id.gotohome001);
        gotohome001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent triviasgotohome001 = new Intent(trivias001.this,refresh001.class);
                startActivity(triviasgotohome001);

            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_trivias001);

        overridePendingTransition(R.anim.alpha_enter001, R.anim.alpha_exit001);
        triviasgotohome001();

        viewPager = (ViewPager)
                findViewById(R.id.viewPager);

        trivias002 viewPagerAdapter
                = new trivias002(this);

        viewPager.setAdapter(viewPagerAdapter);
    }
}


