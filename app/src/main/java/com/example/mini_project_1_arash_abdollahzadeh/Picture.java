package com.example.mini_project_1_arash_abdollahzadeh;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.Scanner;

import static android.content.Intent.getIntent;

public class Picture extends Fragment {


    final String[] Pastrys = new String[5];
    final String[] Foods = new String[5];
    final String[] Breads = new String[3];
    final String[] Sides = new String[3];



//    private OnFragmentInteractionListener mListener;

    ImageView imageView;
    public Picture() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_picture, container, false);
        imageView = view.findViewById(R.id.picture);



        return view;
    }

    void setImage(String pic_options){

        if (pic_options.equals(Pastrys[0])){
            imageView.setImageResource(R.drawable.baklava_2);
        }

    }


}






// TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }

//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }

/**
 * This interface must be implemented by activities that contain this
 * fragment to allow an interaction in this fragment to be communicated
 * to the activity and potentially other fragments contained in that
 * activity.
 * <p>
 * See the Android Training lesson <a href=
 * "http://developer.android.com/training/basics/fragments/communicating.html"
 * >Communicating with Other Fragments</a> for more information.
 */
//    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        void onFragmentInteraction(Uri uri);
//    }/**
// * A simple {@link Fragment} subclass.
// * Activities that contain this fragment must implement the
// * {@link Picture.OnFragmentInteractionListener} interface
// * to handle interaction events.
// */




//        Scanner scan_Pastry = new Scanner(getResources().openRawResource(R.raw.pastry));
//        Scanner scan_Food = new Scanner(getResources().openRawResource(R.raw.food));
//        Scanner scan_Sides = new Scanner(getResources().openRawResource(R.raw.sides));
//        Scanner scan_Bread = new Scanner(getResources().openRawResource(R.raw.bread));
//
//        int i = 0;
//        while (scan_Pastry.hasNextLine()){
//            String line=scan_Pastry.nextLine();
//            Pastrys[i] = line;
//            i++;
//        }
//        scan_Pastry.close();
//
//        i = 0;
//        while (scan_Food.hasNextLine()){
//            String line=scan_Food.nextLine();
//            Foods[i] = line;
//            i++;
//        }
//        scan_Pastry.close();
//
//        i = 0;
//        while (scan_Sides.hasNextLine()){
//            String line=scan_Sides.nextLine();
//            Sides[i] = line;
//            i++;
//        }
//        scan_Pastry.close();
//
//        i = 0;
//        while (scan_Bread.hasNextLine()){
//            String line=scan_Bread.nextLine();
//            Breads[i] = line;
//            i++;
//        }
//        scan_Pastry.close();
