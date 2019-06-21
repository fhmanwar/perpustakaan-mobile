package com.example.perpustakaan.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.perpustakaan.Home;
import com.example.perpustakaan.R;
import com.example.perpustakaan.recycle.HomeItem;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private List<HomeItem> listItems;
    private Context context;

    public HomeAdapter(List<HomeItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_home, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final HomeItem listItem = listItems.get(i);
//        viewHolder.postId.setText(listItem.getId_buku());
        viewHolder.postJudul.setText(listItem.getJudul_buku());
        viewHolder.postPenulis.setText(listItem.getPenulis_buku());
        Picasso.get().load(listItem.getCover_buku()).into(viewHolder.postImage);
        viewHolder.postPenerbit.setText(listItem.getPenerbit());
        viewHolder.postThnterbit.setText(listItem.getTahun_terbit());
        viewHolder.postJmlbuku.setText(listItem.getJumlah_buku());

        viewHolder.postJudul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent pindah = new Intent(context.getApplicationContext(), Home.class);
//                pindah.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                pindah.putExtra("Id", listItem.getId_buku());
//                pindah.putExtra("Judul", listItem.getJudul_buku());
//                context.startActivity(pindah);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

//        private TextView postId;
        private TextView postJudul;
        private TextView postPenulis;
        private TextView postPenerbit;
        private TextView postThnterbit;
        private ImageView postImage;
        private TextView postJmlbuku;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            postJudul = (TextView)itemView.findViewById(R.id.postJudul);
            postPenulis = (TextView)itemView.findViewById(R.id.postPenulis);
            postImage = (ImageView)itemView.findViewById(R.id.postImage);
            postPenerbit = (TextView)itemView.findViewById(R.id.postPenerbit);
            postThnterbit = (TextView)itemView.findViewById(R.id.postThn);
            postJmlbuku = (TextView)itemView.findViewById(R.id.postJmlbuku);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }

    }
}
