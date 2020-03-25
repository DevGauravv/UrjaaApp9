package com.example.urjaaapp9.ui.UrjasFeature;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.urjaaapp9.R;

/**
 * A simple {@link Fragment} subclass.
 *
 *
 */


public class UrjasFeatureFragment extends Fragment {

    FragmentManager fragmentManager;

    public UrjasFeatureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_urjas_feature, container, false);



    }
}
