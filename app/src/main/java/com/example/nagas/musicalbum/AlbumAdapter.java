package com.example.nagas.musicalbum;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.ViewInfo>
{
    Context context;
    int img[];
    String titles[];

    public AlbumAdapter(Context context, int[] img, String[] titles) {
        this.context = context;
        this.img = img;
        this.titles = titles;
    }

    @NonNull
    @Override
    public AlbumAdapter.ViewInfo onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v= LayoutInflater.from(context).inflate(R.layout.row,parent,false);

        return new ViewInfo(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumAdapter.ViewInfo holder, final int position)
    {
        holder.imageView.setImageResource(img[position]);
        holder.title.setText(titles[position]);

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog=new Dialog(context);
                dialog.setContentView(R.layout.display);
                ImageView dpimg=dialog.findViewById(R.id.dp);
                dpimg.setImageResource(img[position]);
                dialog.show();

                }
        });
    }

    @Override
    public int getItemCount()
    {
        return img.length;
    }

    public class ViewInfo extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView title;
        public ViewInfo(View itemView)
        {
            super(itemView);

            imageView=itemView.findViewById(R.id.image_view);
            title=itemView.findViewById(R.id.movie_title);

        }
    }
}
