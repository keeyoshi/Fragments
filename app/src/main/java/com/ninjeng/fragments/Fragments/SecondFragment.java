package com.ninjeng.fragments.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ninjeng.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener{
    EditText etRadius;
    Button btnArea;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view   = inflater.inflate(R.layout.fragment_second, container, false);
        etRadius=view.findViewById(R.id.radius);
        btnArea = view.findViewById(R.id.AreaofCircle);
        btnArea.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int radius = Integer.parseInt(etRadius.getText().toString());
        float result = 3.14f*radius*radius;
        Toast.makeText(getContext(), result+"", Toast.LENGTH_SHORT).show();

    }
}
