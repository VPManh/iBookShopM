package com.ibookshop.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.ibookshop.R;
import com.ibookshop.activity_details;
import com.ibookshop.data.BookHome;
import com.ibookshop.data.BookHomeViewHolder;
import com.squareup.picasso.Picasso;

public class mainPageFragment extends Fragment {

    private FirebaseRecyclerOptions<BookHome> options;
    private FirebaseRecyclerAdapter<BookHome, BookHomeViewHolder> adapter;
    private RecyclerView recyclerView;
    DatabaseReference database;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.rcv_category);
        database = FirebaseDatabase.getInstance().getReference().child("Books");
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        options = new FirebaseRecyclerOptions.Builder<BookHome>()
                .setQuery(database, BookHome.class)
                .build();

        adapter = new FirebaseRecyclerAdapter<BookHome, BookHomeViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull BookHomeViewHolder holder, int position, @NonNull BookHome model) {
                holder.txtenSach.setText(model.getTenSach());
                holder.txtacGia.setText(model.getTenTacGia());
                Picasso.get().load(model.getUrlImage()).into(holder.imgHinh);

                holder.Gia.setText(model.getGia());
                holder.SoTrang.setText(model.getSoTrang());
                holder.ngayPhatHanh.setText(model.getNgayPhatHanh());
                holder.ngoNgu.setText(model.getNgonNgu());
                holder.theLoai.setText(model.getTheLoai());
                holder.moTa.setText(model.getMoTa());

                holder.setItemClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getActivity(), activity_details.class);
                        intent.putExtra("tenSach", model.getTenSach());
                        intent.putExtra("tenTacGia", model.getTenTacGia());
                        intent.putExtra("urlImage", model.getUrlImage());
                        intent.putExtra("Gia", model.getGia());
                        intent.putExtra("SoTrang", model.getSoTrang());
                        intent.putExtra("ngayPhatHanh", model.getNgayPhatHanh());
                        intent.putExtra("ngonNgu", model.getNgonNgu());
                        intent.putExtra("theLoai", model.getTheLoai());
                        intent.putExtra("moTa", model.getMoTa());

                        startActivity(intent);
                    }
                });

            }

            @NonNull
            @Override
            public BookHomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sach,parent,false);
                return new BookHomeViewHolder(view);
            }
        };
        adapter.startListening();
        recyclerView.setAdapter(adapter);

        return view;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("mainPageFragment", "onCreate");
    }
    @Override
    public void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}
//        recyclerView = view.findViewById(R.id.rcv_category);
//        database = FirebaseDatabase.getInstance().getReference().child("hocVien");
//        recyclerView.setHasFixedSize(true);
//
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);
//        recyclerView.setLayoutManager(linearLayoutManager);
//
//
//        options = new FirebaseRecyclerOptions.Builder<BookHome>()
//                .setQuery(database, BookHome.class)
//                .build();
//
//        adapter = new FirebaseRecyclerAdapter<BookHome, BookHomeViewHolder>(options) {
//            @Override
//            protected void onBindViewHolder(@NonNull BookHomeViewHolder holder, int position, @NonNull BookHome model) {
//                holder.txtenSach.setText(model.getTenSach());
//                holder.txtacGia.setText(model.getTenTacGia());
//                Picasso.get().load(model.getUrlImage()).into(holder.imgHinh);
////                // Set ItemClickListener
////                holder.setItemClickListener(new View.OnClickListener() {
////                    @Override
////                    public void onClick(View view) {
////                        Intent intent = new Intent(getActivity(), activity_details.class);
////                        intent.putExtra("tenSach", model.getTenSach());
////                        intent.putExtra("tenTacGia", model.getTenTacGia());
////                        intent.putExtra("urlImage", model.getUrlImage());
////                        startActivity(intent);
////                    }
////                });
//            }
//
//            @NonNull
//            @Override
//            public BookHomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sach, parent, false);
//                return new BookHomeViewHolder(view);
//            }
//        };
//        adapter.startListening();
//        recyclerView.setAdapter(adapter);
//
//
//        return view;
//    }
//
//    @Override
//    public void onStart() {
//        super.onStart();
//        adapter.startListening();
//    }
//
//    @Override
//    public void onStop() {
//        super.onStop();
//        adapter.stopListening();
//    }
//}