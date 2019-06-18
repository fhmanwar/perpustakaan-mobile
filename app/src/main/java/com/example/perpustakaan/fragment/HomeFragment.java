package com.example.perpustakaan.fragment;


import android.Manifest;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.perpustakaan.Config;
import com.example.perpustakaan.R;
import com.example.perpustakaan.adapter.HomeAdapter;
import com.example.perpustakaan.recycle.HomeItem;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private final String URL_DATA = Config.DATA_POSTBUKU;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<HomeItem> listItems;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (ContextCompat.checkSelfPermission(getContext(), android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getContext(), android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 1);
        }
        View view = inflater.inflate(R.layout.activity_home, container, false);
        recyclerView = view.findViewById(R.id.isi);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 1));

        listItems = new ArrayList<>();

        loadData();
        return view;
    }

    // MENAMPILKAN DATA
    private void loadData() {
        final ProgressDialog progressDialog = new ProgressDialog(getContext());
        progressDialog.setMessage("Memuat Data...");
        progressDialog.show();

        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL_DATA, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                progressDialog.dismiss();
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray array = jsonObject.getJSONArray("buku");

                    for (int i = 0; i < array.length(); i++) {
                        JSONObject data = array.getJSONObject(i);
                        HomeItem item = new HomeItem(
                                data.getString("id_buku"),
                                data.getString("id_user"),
                                data.getString("id_jenis"),
                                data.getString("id_bahasa"),
                                data.getString("judul_buku"),
                                data.getString("penulis_buku"),
                                data.getString("subjek_buku"),
                                data.getString("kode_buku"),
                                data.getString("kolasi"),
                                data.getString("penerbit"),
                                data.getString("tahun_terbit"),
                                data.getString("no_seri"),
                                data.getString("status_buku"),
                                data.getString("ringkasan"),
                                data.getString("cover_buku"),
                                data.getString("jumlah_buku"),
                                data.getString("tanggal_entri"),
                                data.getString("tanggal"),
                                data.getString("nama_jenis"),
                                data.getString("kode_jenis"),
                                data.getString("nama_bahasa"),
                                data.getString("kode_bahasa"),
                                data.getString("nama")
                        );
                        listItems.add(item);
                    }
                    adapter = new HomeAdapter(listItems, getContext());
                    recyclerView.setAdapter(adapter);
                } catch (JSONException e) {
                    alertData();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                progressDialog.dismiss();
                alertData();
            }
        });

        RequestQueue antrian = Volley.newRequestQueue(requireContext());
        antrian.add(stringRequest);
    }

    private void alertData(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Peringatan!")
                .setMessage("Data Tidak Ditemukan");
        AlertDialog alert = builder.create();
        alert.show();
    }

//    @Override
//    public void onLocationChanged(Location location) {
//
//    }
//
//    @Override
//    public void onStatusChanged(String provider, int status, Bundle extras) {
//
//    }
//
//    @Override
//    public void onProviderEnabled(String provider) {
//
//    }
//
//    @Override
//    public void onProviderDisabled(String provider) {
//        Toast.makeText(getContext(), "Please Enable GPS and Internet", Toast.LENGTH_SHORT).show();
//    }

}
