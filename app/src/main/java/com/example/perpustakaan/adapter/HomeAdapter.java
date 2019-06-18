package com.example.perpustakaan.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.perpustakaan.Home;
import com.example.perpustakaan.R;
import com.example.perpustakaan.recycle.HomeItem;

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
        viewHolder.postId.setText(listItem.getId_buku());
        viewHolder.postImage.setText(listItem.getCover_buku());
        viewHolder.postJudul.setText(listItem.getJudul_buku());
        viewHolder.postPenulis.setText(listItem.getPenulis_buku());


        viewHolder.postJudul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context.getApplicationContext(), Home.class);
                pindah.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                pindah.putExtra("Id", listItem.getId_buku());
                pindah.putExtra("Judul", listItem.getJudul_buku());
                context.startActivity(pindah);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView postId;
        private TextView postImage;
        private TextView postJudul;
        private TextView postPenulis;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View v) {

        }

    }
}
