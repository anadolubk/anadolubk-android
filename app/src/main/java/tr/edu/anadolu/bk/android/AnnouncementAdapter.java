package tr.edu.anadolu.bk.android;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import tr.edu.anadolu.bk.android.viewmodel.Announcement;
import tr.edu.anadolu.bk.android.viewmodel.Blog;

public class AnnouncementAdapter extends RecyclerView.Adapter<AnnouncementAdapter.MyViewHolder> {

    private List<Announcement> announcementList;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.announcement_list_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Announcement announcement = announcementList.get(position);
        holder.title.setText(announcement.getTitle());
        holder.genre.setText(announcement.getGenre());
        holder.imageView.setImageResource(announcement.getBackground());


    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.title)
        TextView title;

        @BindView(R.id.genre)
        TextView genre;

        @BindView(R.id.background)
        ImageView imageView;



        public MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    public void setList(List<Announcement> announcements) {
        this.announcementList = announcements;

    }

    @Override
    public int getItemCount() {
        return announcementList.size();
    }



}