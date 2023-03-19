package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PizzaDetailFragment extends Fragment {

    int position = 0;
    TextView titleTextView;
    TextView detailsTextView;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            if(getArguments() != null){
                position = getArguments().getInt("position", 0);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pizza_detail, parent, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        titleTextView = (TextView) view.findViewById(R.id.titleText);
        detailsTextView = (TextView) view.findViewById(R.id.detailsText);

        titleTextView.setText(Pizza.pizzaMenu[position]);
        detailsTextView.setText(Pizza.pizzaDetails[position]);
    }

    public void updateView(int position){
        titleTextView.setText(Pizza.pizzaMenu[position]);
        detailsTextView.setText(Pizza.pizzaDetails[position]);
    }
}