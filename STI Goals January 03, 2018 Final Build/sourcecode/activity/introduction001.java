package pro.gr.ams.stigoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class introduction001 extends AppCompatActivity {

    TextView tv;

    public Button gotohome001;

    public void introductiongotohome001(){
        gotohome001= (Button) findViewById(R.id.gotohome001);
        gotohome001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent introductiongotohome001 = new Intent(introduction001.this,refresh001.class);
                startActivity(introductiongotohome001);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_introduction001);

        overridePendingTransition(R.anim.alpha_enter001, R.anim.alpha_exit001);
        introductiongotohome001();

        tv = (TextView) findViewById(R.id.text_view);

        loadText();
    }

    private void loadText() {
        String s = "\n" +
                "From its humble beginnings on August 21, 1983 as a computer training center with only two campuses, STI now has campuses all over the Philippines and has diversified into ICT-enhanced programs in Information Technology, Business and Management, Tourism and Hospitality Management, Engineering, and Arts and Sciences.\n" +
                "It all started when four visionaries conceptualized setting up a training center to fill very specific manpower needs.\n" +
                "\n" +
                "It was in the early ‘80s when Augusto C. Lagman, Herman T. Gamboa, Benjamin A. Santos, and Edgar H. Sarte — four entrepreneurs came together to set up Systems Technology Institute (STI), a training center that delivers basic programming education to professionals and students who want to learn this new skill.\n" +
                "\n" +
                "Systems Technology Institute’s name came from countless brainstorming sessions among the founders, perhaps from Sarte’s penchant for three-letter acronyms from the companies he managed at the time.\n" +
                "\n" +
                "The first two schools were inaugurated in August 21, 1983 in Buendia, Makati and in España, Manila, and offered basic computer programming courses. With a unique and superior product on their hands, it was not difficult to expand the franchise through the founders’ business contacts. A year after the first two schools opened, the franchise grew to include STI Binondo, Cubao, and Taft.\n" +
                "\n" +
                "A unique value proposition spelled the difference for the STI brand then: “First We’ll Teach You, Then We’ll Hire You.” Through its unique Guaranteed Hire Program (GHP), all qualified graduates were offered jobs by one of the founders’ companies, or through their contacts in the industry.\n" +
                "\n" +
                "The schools’ 1st batch of graduates, all 11 of them, were hired by Systems Resources Incorporated. And through GHP, more qualified STI graduates found themselves working in their field of interest straight out of school.\n" +
                "\n" +
                "No one among the four founders imagined that the Systems Technology Institute would become a college, or would grow to have over 100 schools across the country. But it did, all because of its unique value proposition, the synergy between the founders and their personnel, and the management’s faithfulness to quality.\n" +
                "\n" +
                "A long way since its birth, STI’s thrust has permeated right into the core of the globally competitive market — it has transcended beyond ICT and beyond education, addressing the need for job-ready graduates. \n" +
                "\n" +
                "↴" + "\n" + "\n" +
                "STI Vission:" + "\n" + "\n" + "To be the leader in innovative and relevant education that nurtures individuals to become competent and responsible members of society." + "\n" +
                "\n" +
                "↴" + "\n" + "\n" +
                "STI Mission:" + "\n" + "\n" + "We are an institution committed to provide knowledge through the development and delivery of superior learning systems." + "\n" + "\n" +
                "We strive to provide optimum value to all our stakeholders – our students, our faculty members, our employees, our partners, our shareholders, and our community." + "\n" + "\n" +
                "We will pursue this mission with utmost integrity, dedication, transparency, and creativity." + "\n";

        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(s);
    }
}
