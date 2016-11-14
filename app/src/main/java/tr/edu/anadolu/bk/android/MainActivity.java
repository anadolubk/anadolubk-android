package tr.edu.anadolu.bk.android;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;
import tr.edu.anadolu.bk.android.fragment.AnnouncementFragment;
import tr.edu.anadolu.bk.android.fragment.BlogFragment;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.viewpager)
    protected ViewPager viewPager;
    @BindView(R.id.tabs)
    protected TabLayout tabLayout;
    @BindView(R.id.toolbar)
    protected Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        TabFragmentPagerAdapter adapter = new TabFragmentPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(AnnouncementFragment.newInstance(),getString(R.string.announcement_tab));
        adapter.addFragment(BlogFragment.newInstance(),getString(R.string.blog_tab));
        adapter.addFragment(BlogFragment.newInstance(),getString(R.string.club_tab));
        viewPager.setAdapter(adapter);
    }

}
