package com.example.mini_project_1_arash_abdollahzadeh;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Items.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Items extends Fragment {

//    private OnFragmentInteractionListener mListener;

    public Items() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_items, container, false);

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event

}
