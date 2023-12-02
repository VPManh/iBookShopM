package com.ibookshop.fragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.ibookshop.R;
import com.ibookshop.activities.MainActivity;
import com.ibookshop.data.Book;
import com.squareup.picasso.Picasso;

public class activity_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent = getIntent();
//        if (intent != null && intent.hasExtra("Books")) {
//             Lấy dữ liệu từ Intent
            String tenSach = intent.getStringExtra("tenSach");
            String tenTacGia = intent.getStringExtra("tenTacGia");
            String urlImage = intent.getStringExtra("urlImage");
            String Gia = intent.getStringExtra("Gia");
            String SoTrang = intent.getStringExtra("SoTrang");
            String ngayPhatHanh = intent.getStringExtra("ngayPhatHanh");
            String ngonNgu = intent.getStringExtra("ngonNgu");
            String theLoai = intent.getStringExtra("theLoai");
            String moTa = intent.getStringExtra("moTa");

            // Hiển thị dữ liệu trên giao diện
            TextView txtTenSach = findViewById(R.id.dtenSach);
            TextView txtTacGia = findViewById(R.id.dtacgia);
            ImageView imgHinh = findViewById(R.id.dhinh);
            TextView   txGia = findViewById(R.id.dGia);
            TextView txSoTrang =findViewById(R.id.dsoTrang);
            TextView  txngayPhatHanh =findViewById(R.id.dngayPhatHanh);
            TextView  txngoNgu = findViewById(R.id.dngoNgu);
            TextView  txtheLoai=findViewById(R.id.dtheLoai);
            TextView  txmoTa = findViewById(R.id.dmoTa);

            txtTenSach.setText(tenSach);
            txtTacGia.setText(tenTacGia);
            Picasso.get().load(urlImage).into(imgHinh);
            txGia.setText(Gia);
            txSoTrang.setText(SoTrang);
            txngayPhatHanh.setText(ngayPhatHanh);
            txngoNgu.setText(ngonNgu);
            txtheLoai.setText(theLoai);
            txmoTa.setText(moTa);

//
//        } else {
//            // Hiển thị một thông báo hoặc thực hiện xử lý khác nếu không có dữ liệu
//            Toast.makeText(this, "Không có dữ liệu", Toast.LENGTH_SHORT).show();
//            // Hoặc kết thúc Activity nếu không có dữ liệu
//            finish();
//        }


    }
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }
}