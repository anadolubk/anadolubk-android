package tr.edu.anadolu.bk.android.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
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
    public static BlogFragment newInstance() {
        return new BlogFragment();
    }

    @BindView(R.id.recycler_view)
    protected RecyclerView recyclerView;

    private Unbinder unbinder;

    protected List<Announcement> announcementList = new ArrayList<>();
    AnnouncementAdapter anAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);
        unbinder = ButterKnife.bind(this, view);

        anAdapter = new AnnouncementAdapter();
        recyclerView.setAdapter(anAdapter);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        prepareAnnouncementData();
        return view;
    }

    private void prepareAnnouncementData() {

        Announcement announcement = new Announcement("Deneme", "Deneme" , R.drawable.images);
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