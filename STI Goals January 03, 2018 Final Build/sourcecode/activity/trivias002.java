package pro.gr.ams.stigoals;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.support.v4.view.ViewPager;
import android.support.annotation.NonNull;
import android.widget.ImageView;
import android.support.v4.view.PagerAdapter;

public class trivias002 extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    public Integer [] images = {R.raw.trivias_trivia001,R.raw.trivias_trivia002,R.raw.trivias_trivia003};

    public trivias002(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.style_trivias002, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}

