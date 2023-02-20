package com.example.hf_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView tvCar;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCar=itemView.findViewById(R.id.rv_car);
    }
    void bind (String car ){
        tvCar.setText(car);
    }
}
