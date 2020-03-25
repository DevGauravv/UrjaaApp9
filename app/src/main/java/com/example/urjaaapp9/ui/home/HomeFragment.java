package com.example.urjaaapp9.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.urjaaapp9.R;
import com.example.urjaaapp9.ui.UrjasFeature.UrjasFeatureFragment;

public class HomeFragment extends Fragment {

       TextView tvnextactivity;
    Bundle bundle = new Bundle();


       public HomeFragment(){}


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

       //  Use getActivity() in intent context to call Activity from fragment

         tvnextactivity =  (TextView)  root.findViewById(R.id.tv_click_next_Activity);
         tvnextactivity.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

//                 Intent i = new Intent(getActivity(), UrjasFeature.class);
//                 startActivity(i);

                 UrjasFeatureFragment urjasFeatureFragment = new UrjasFeatureFragment();
                 FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                 fragmentTransaction.replace(R.id.drawer_layout, urjasFeatureFragment);
               fragmentTransaction.addToBackStack(null);
                 fragmentTransaction.commit();




             }
         });

        return root;
    }
}