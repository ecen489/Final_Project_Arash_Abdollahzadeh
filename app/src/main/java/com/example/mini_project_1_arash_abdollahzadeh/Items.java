package com.example.mini_project_1_arash_abdollahzadeh;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Scanner;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Items.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Items extends Fragment {

//    private OnFragmentInteractionListener mListener;

    TextView text;

    final String[] Pastrys = new String[5];
    final String[] Foods = new String[5];
    final String[] Breads = new String[3];
    final String[] Sides = new String[3];

    public Items() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_items, container, false);

        Scanner scan_Pastry = new Scanner(getResources().openRawResource(R.raw.pastry_ings));
        Scanner scan_Food = new Scanner(getResources().openRawResource(R.raw.food_ings));
        Scanner scan_Sides = new Scanner(getResources().openRawResource(R.raw.sides_ings));
        Scanner scan_Bread = new Scanner(getResources().openRawResource(R.raw.bread_ings));

        text = view.findViewById(R.id.Text);

        int i = 0;
        while (scan_Pastry.hasNextLine()){
            String line=scan_Pastry.nextLine();
            Pastrys[i] = line;
            i++;
        }
        scan_Pastry.close();

        i = 0;
        while (scan_Food.hasNextLine()){
            String line=scan_Food.nextLine();
            Foods[i] = line;
            i++;
        }
        scan_Pastry.close();

        i = 0;
        while (scan_Sides.hasNextLine()){
            String line=scan_Sides.nextLine();
            Sides[i] = line;
            i++;
        }
        scan_Pastry.close();

        i = 0;
        while (scan_Bread.hasNextLine()){
            String line=scan_Bread.nextLine();
            Breads[i] = line;
            i++;
        }
        scan_Pastry.close();



        return view;
    }


}
