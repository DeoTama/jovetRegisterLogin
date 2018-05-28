package com.example.pengalatdite.jovet.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.pengalatdite.jovet.Animals;
import com.example.pengalatdite.jovet.DescriptionAnimals;
import com.example.pengalatdite.jovet.Fragment.AnimalsFragment;
import com.example.pengalatdite.jovet.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.content.ContentValues.TAG;

public class AnimalsAdapter extends RecyclerView.Adapter<AnimalsAdapter.AnimalsViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";
    private ArrayList<String> mTxtJenis = new ArrayList<>();
    private ArrayList<Integer> mIcon = new ArrayList<>();
    Context mContext;

    public AnimalsAdapter(ArrayList<String> mTxtJenis, ArrayList<Integer> mIcon, Context mContext) {
        this.mTxtJenis = mTxtJenis;
        this.mIcon = mIcon;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public AnimalsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_animals, parent, false);
        AnimalsViewHolder holder = new AnimalsViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalsViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(mIcon.get(position))
                .into(holder.icon);

        holder.txtJenis.setText(mTxtJenis.get(position));

        holder.listAnimalsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on: " + mTxtJenis.get(position));

                Toast.makeText(mContext, mTxtJenis.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, DescriptionAnimals.class);
                intent.putExtra("image_url", mIcon.get(position));
                intent.putExtra("image_name", mTxtJenis.get(position));
                mContext.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return mTxtJenis.size();
    }


    public class AnimalsViewHolder extends RecyclerView.ViewHolder {
        TextView txtJenis;
        CircleImageView icon;
        FrameLayout listAnimalsLayout;

        public AnimalsViewHolder(View itemView) {
            super(itemView);
            txtJenis = itemView.findViewById(R.id.jenis_hewan);
            icon = itemView.findViewById(R.id.imageView2);
            listAnimalsLayout = itemView.findViewById(R.id.list_animals_layout);
        }
    }
}
