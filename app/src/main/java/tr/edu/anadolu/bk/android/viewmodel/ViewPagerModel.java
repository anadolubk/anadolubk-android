package tr.edu.anadolu.bk.android.viewmodel;

import tr.edu.anadolu.bk.android.R;

public enum ViewPagerModel {
    FIRST(R.string.announcement_tab),
    SECOND(R.string.second_tab),
    THIRD(R.string.third_tab);

    private int titleResId;

    ViewPagerModel(int titleResId) {
        this.titleResId = titleResId;
    }

    public int getTitleResId() {
        return titleResId;
    }
}
