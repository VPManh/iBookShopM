package com.ibookshop.data;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.ibookshop.R;


public class BookHomeViewHolder extends RecyclerView.ViewHolder {
    public TextView txtenSach,txtacGia,Gia,SoTrang,ngoNgu,ngayPhatHanh,theLoai,moTa;
    public ImageView imgHinh;
    public BookHomeViewHolder(@NonNull View itemView) {

        super(itemView);
        txtenSach = itemView.findViewById(R.id.TenSach);
        txtacGia = itemView.findViewById(R.id.TenTacGia);
        imgHinh = itemView.findViewById(R.id.imgSach);
        Gia = itemView.findViewById(R.id.mGia);
        SoTrang = itemView.findViewById(R.id.mSoTrang);
        ngayPhatHanh =itemView.findViewById(R.id.mngayPhatHanh);
        ngoNgu = itemView.findViewById(R.id.mngonNgu);
        theLoai=itemView.findViewById(R.id.mtheLoai);
        moTa = itemView.findViewById(R.id.mmoTa);


    }
    public void setItemClickListener(View.OnClickListener listener) {
        itemView.setOnClickListener(listener);
    }
}
