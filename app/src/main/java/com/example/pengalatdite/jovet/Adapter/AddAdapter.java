package com.example.pengalatdite.jovet.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.pengalatdite.jovet.Add;
import com.example.pengalatdite.jovet.R;

import java.util.ArrayList;

public class AddAdapter extends RecyclerView.Adapter<AddAdapter.AddViewHolder> {

    private static final String TAG = "AddRecyclerViewAdapter";
    private ArrayList<String> dateList;
    private ArrayList<String> timeList;
    Context mContext;

    public AddAdapter(ArrayList<String> dateList, ArrayList<String> timeList, Context mContext) {
        this.dateList = dateList;
        this.timeList = timeList;
        this.mContext = mContext;

    }

//    public ArrayList<Add> getList() {
//        return dateList;
//    }
//
//    public void setBookingList(ArrayList<Add> bookingList) {
//        this.dateList = bookingList;
//    }

    @NonNull
    @Override
    public AddViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.booking_history, parent, false);
        AddViewHolder holder = new AddViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AddViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called");

        holder.date.setText(dateList.get(position));
        holder.time.setText(timeList.get(position));
    }

    @Override
    public int getItemCount() {
        return dateList.size();
    }

    public class AddViewHolder extends RecyclerView.ViewHolder {
        TextView date, time;
        ImageButton deleteButton;
        FrameLayout addListBooking;

        public AddViewHolder(View itemView) {
            super(itemView);

            date = itemView.findViewById(R.id.text_view_hari_bulan);
            time = itemView.findViewById(R.id.waktu);
            addListBooking = itemView.findViewById(R.id.rv_booking_history);

            deleteButton = (ImageButton) itemView.findViewById(R.id.delete_jadwal_booking);
            deleteButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dateList.remove(getAdapterPosition());
//                    timeList.remove(getAdapterPosition());
                    notifyItemRemoved(getAdapterPosition());
                }
            });
        }
    }
}