package com.ninjeng.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ninjeng.fragments.Fragments.FirstFragment;
import com.ninjeng.fragments.Fragments.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button btnLoader;
private boolean status=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLoader=findViewById(R.id.btnfragmentloader);
        btnLoader.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if(status){
            FirstFragment firstFragment = new FirstFragment();
            fragmentTransaction.replace(R.id.fragmentId,firstFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            btnLoader.setText("Open second fragment");
            status= false;

        }
        else
        {

            SecondFragment secondFragment = new SecondFragment();
            fragmentTransaction.replace(R.id.fragmentId,secondFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            btnLoader.setText("Open first fragment");
            status= true;
        }
    }
}
