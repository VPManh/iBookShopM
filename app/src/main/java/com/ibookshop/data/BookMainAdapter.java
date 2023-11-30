//package com.ibookshop.data;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.firebase.ui.database.FirebaseRecyclerAdapter;
//import com.firebase.ui.database.FirebaseRecyclerOptions;
//import com.ibookshop.R;
//import com.squareup.picasso.Picasso;
//
//public class BookMainAdapter extends FirebaseRecyclerAdapter<BookMain, BookMainAdapter.BookMainViewHolder> {
//
//    public BookMainAdapter(@NonNull FirebaseRecyclerOptions<BookMain> options) {
//        super(options);
//    }
//
//    @Override
//    protected void onBindViewHolder(@NonNull BookMainViewHolder holder, int position, @NonNull BookMain model) {
//        holder.txtenSach.setText(model.getTenSach());
//        holder.txtacGia.setText(model.getTenTacGia());
//        Picasso.get().load(model.getUrlImage()).into(holder.imgHinh);
//
//    }
//
//    @NonNull
//    @Override
//    public BookMainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sach,parent,false);
//        return new BookMainViewHolder(view);
//    }
//
//    public class BookMainViewHolder extends RecyclerView.ViewHolder{
//        private TextView txtenSach, txtacGia;
//        private ImageView imgHinh;
//        public BookMainViewHolder(@NonNull View itemView) {
//            super(itemView);
//            txtenSach = itemView.findViewById(R.id.TenSach);
//            txtacGia = itemView.findViewById(R.id.TenTacGia);
//            imgHinh = itemView.findViewById(R.id.imgSach);
//        }
//    }
//}
