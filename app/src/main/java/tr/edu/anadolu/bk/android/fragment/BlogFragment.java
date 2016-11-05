package tr.edu.anadolu.bk.android.fragment;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import tr.edu.anadolu.bk.android.AnnouncementAdapter;
import tr.edu.anadolu.bk.android.R;
import tr.edu.anadolu.bk.android.viewmodel.Announcement;


public class BlogFragment extends Fragment {

    @BindView(R.id.recycler_view)
    protected RecyclerView recyclerView;

    private Unbinder unbinder;

    protected List<Announcement> announcementList = new ArrayList<>();
    private static final String ARG_PAGE = "ARG_PAGE";
    AnnouncementAdapter anAdapter;
    private int page;

    public static android.support.v4.app.Fragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt(ARG_PAGE);
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);
        unbinder = ButterKnife.bind(this, view);

        anAdapter = new AnnouncementAdapter();
        recyclerView.setVisibility(View.INVISIBLE);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        if (page == 2) {
            recyclerView.setAdapter(anAdapter);
            recyclerView.setVisibility(View.VISIBLE);
        }
        prepareAnnouncementData();
        return view;
    }

    private void prepareAnnouncementData() {

        Announcement announcement = new Announcement("DevFest Eskişehir 2016", "genre & genre", R.drawable.deneme);
        announcementList.add(announcement);

        announcement = new Announcement("evFest Eskişehir 2016", "genre2 & genre", R.drawable.deneme);
        announcementList.add(announcement);

        announcement = new Announcement("evFest Eskişehir 2016", "genre3 & genre", R.drawable.images);
        announcementList.add(announcement);

        anAdapter.setList(announcementList);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

}
