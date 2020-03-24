package com.example.urjaaapp9.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.urjaaapp9.R;
import com.example.urjaaapp9.UrjasFeature;

public class HomeFragment extends Fragment {

       TextView tvnextactivity;

       public HomeFragment(){}


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

//         tvnextactivity =  (TextView)  root.findViewById(R.id.tv_click_next_Activity);
//         tvnextactivity.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View v) {
//                 Intent i = new Intent(getActivity(), UrjasFeature.class);
//                 startActivity(i);
//             }
//         });

        return root;
    }
}