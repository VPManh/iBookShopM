package com.ibookshop;

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
import com.ibookshop.data.Book;
import com.squareup.picasso.Picasso;

public class activity_details extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("tenSach")) {
            // Lấy dữ liệu từ Intent
            String tenSach = intent.getStringExtra("tenSach");
            String tenTacGia = intent.getStringExtra("tenTacGia");
            String urlImage = intent.getStringExtra("urlImage");

            // Hiển thị dữ liệu trên giao diện
            TextView txtTenSach = findViewById(R.id.tv_name_category);
            TextView txtTacGia = findViewById(R.id.tacgia);
            ImageView imgHinh = findViewById(R.id.hinh);

            txtTenSach.setText(tenSach);
            txtTacGia.setText(tenTacGia);
            Picasso.get().load(urlImage).into(imgHinh);
        } else {
            // Hiển thị một thông báo hoặc thực hiện xử lý khác nếu không có dữ liệu
            Toast.makeText(this, "Không có dữ liệu", Toast.LENGTH_SHORT).show();
            // Hoặc kết thúc Activity nếu không có dữ liệu
            finish();
        }
    }
}