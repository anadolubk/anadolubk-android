package tr.edu.anadolu.bk.android;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import tr.edu.anadolu.bk.android.viewmodel.Announcement;

public class MainActivity extends AppCompatActivity {
    private List<Announcement> announcementList = new ArrayList<>();
    private RecyclerView recyclerView;
    private AnnouncementAdapter anAdapter;

    @BindView(R.id.viewpager)
    protected ViewPager viewPager;
    @BindView(R.id.tabs)
    protected TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        viewPager.setAdapter(new TabFragmentPagerAdapter(getSupportFragmentManager(), MainActivity.this));
        viewPager.setOffscreenPageLimit(3);
        tabLayout.setupWithViewPager(viewPager);
    }

}
