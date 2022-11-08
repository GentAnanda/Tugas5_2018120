package com.example.bab5_2018120;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class minumanAdapter extends RecyclerView.Adapter<com.example.bab5_2018120.minumanAdapter.ZaloraViewHolder> {
    String data1[], data2[], data3[];
    int images[];
    Context context;
    public minumanAdapter(Context ct, String s1[], String s2[], String s3[], int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        data3 = s3;
        images = img;
    }
    @NonNull
    @Override
    public com.example.bab5_2018120.minumanAdapter.ZaloraViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_minuman,
                parent, false);
        return new ZaloraViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull com.example.bab5_2018120.minumanAdapter.ZaloraViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.star.setText(data3[position]);
        holder.myImage.setImageResource(images[position]);
    }
    @Override
    public int getItemCount() {
        return images.length;
    }
    public class ZaloraViewHolder extends RecyclerView.ViewHolder {
        TextView myText1, myText2, star;
        ImageView myImage;
        ConstraintLayout mainLayout;
        public ZaloraViewHolder(View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.myText1);
            myText2 = itemView.findViewById(R.id.myText2);
            star = itemView.findViewById(R.id.star);
            myImage = itemView.findViewById(R.id.myImages);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
