package com.example.pengalatdite.jovet.Fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.pengalatdite.jovet.Adapter.AnimalsAdapter;
import com.example.pengalatdite.jovet.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AnimalsFragment extends Fragment {

    private static final String TAG = "AnimalsFragment";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<Integer> mImages = new ArrayList<Integer>();
    private Context mContext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: started");

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animals, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstance){
        super.onViewCreated(view, savedInstance);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyler_view);
        AnimalsAdapter adapter = new AnimalsAdapter(mNames, mImages, mContext);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        recyclerView.setAdapter(adapter);

        animalsData();
    }

    private void animalsData(){
        Log.d(TAG, "animalsData: preparing data");
//        animalsArrayList = new ArrayList<>();
//        animalsArrayList.add(new Animals("Kucing Persia", "ini kucing", R.drawable.foto_kucing_persiamedium));
//        animalsArrayList.add(new Animals("Kucing Anggora", "ini juga kucing", R.drawable.kucing_persia_asli));
//        animalsArrayList.add(new Animals("Kucing Kampung", "ini bukan jenis kucing", R.drawable.kucing_persia_asli));
//        animalsArrayList.add(new Animals("Doberman", "kalo ini anjing", R.drawable.doberman2));
//        animalsArrayList.add(new Animals("Retriver", "sama anjing juga", R.drawable.retriver));
//        animalsArrayList.add(new Animals("German Sheepherd", "ini juga anjing", R.drawable.german_shepherd));

        mImages.add(R.drawable.foto_kucing_persiamedium);
        mNames.add("Kucing Persia");

        mImages.add(R.drawable.kucing_persia_asli);
        mNames.add("Kucing Anggora");

        mImages.add(R.drawable.kucing_persia_asli);
        mNames.add("Kucing Kampung");

        mImages.add(R.drawable.doberman2);
        mNames.add("Anjing Doberman");

        mImages.add(R.drawable.retriver);
        mNames.add("Anjing Retriver");

        mImages.add(R.drawable.german_shepherd);
        mNames.add("Anjing Shepherd");

    }

    public void onAttach (Context mContext){
        super.onAttach(mContext);
        this.mContext = mContext;
    }
}
