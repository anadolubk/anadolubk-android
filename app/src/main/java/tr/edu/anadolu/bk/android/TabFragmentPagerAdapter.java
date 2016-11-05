package tr.edu.anadolu.bk.android;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import tr.edu.anadolu.bk.android.fragment.PageFragment;
import tr.edu.anadolu.bk.android.viewmodel.ViewPagerModel;

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public TabFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }
    @Override
    public int getCount() {
        return ViewPagerModel.values().length;
    }

    @Override
    public Fragment getItem(int position) {
            return PageFragment.newInstance(position + 1);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return context.getString(ViewPagerModel.values()[position].getTitleResId());
    }


}
