package com.example.mini_project_1_arash_abdollahzadeh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    final String[] Pastrys = new String[5];
    final String[] Foods = new String[5];
    final String[] Breads = new String[3];
    final String[] Sides = new String[3];

    String option;
    String new_option;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final String[] Pastrys = new String[5];
//        final String[] Foods = new String[5];
//        final String[] Breads = new String[3];
//        final String[] Sides = new String[3];

        Scanner scan_Pastry = new Scanner(getResources().openRawResource(R.raw.pastry));
        Scanner scan_Food = new Scanner(getResources().openRawResource(R.raw.food));
        Scanner scan_Sides = new Scanner(getResources().openRawResource(R.raw.sides));
        Scanner scan_Bread = new Scanner(getResources().openRawResource(R.raw.bread));

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
        scan_Food.close();

        i = 0;
        while (scan_Sides.hasNextLine()){
            String line=scan_Sides.nextLine();
            Sides[i] = line;
            i++;
        }
        scan_Sides.close();

        i = 0;
        while (scan_Bread.hasNextLine()){
            String line=scan_Bread.nextLine();
            Breads[i] = line;
            i++;
        }
        scan_Bread.close();

        ListView list = (ListView) findViewById(R.id.List_of_Items);

        ArrayAdapter<String> myAdapter_Pastrys = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Pastrys);
//        ArrayAdapter<String> myAdapter_Foods = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Foods);

        // Getting the buttons
        list.setAdapter(myAdapter_Pastrys);


        // For interaction
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                option = parent.getItemAtPosition(position).toString();

                Picture pic_frag = (Picture) getSupportFragmentManager().findFragmentById(R.id.pictures);

                Items item_frag = (Items) getSupportFragmentManager().findFragmentById(R.id.items);


                // Options for clicking Pastry
                if (option.equals(Pastrys[0])){
                    pic_frag.imageView.setImageResource(R.drawable.baklava_1);
                    item_frag.text.setText(item_frag.Pastrys[0]);
                }
                else if (option.equals(Pastrys[1])){
                    pic_frag.imageView.setImageResource(R.drawable.loz_1);
                    item_frag.text.setText(item_frag.Pastrys[1]);
                }
                else if (option.equals(Pastrys[2])){
                    pic_frag.imageView.setImageResource(R.drawable.rice_cookie);
                    item_frag.text.setText(item_frag.Pastrys[2]);
                }
                else if (option.equals(Pastrys[3])){
                    pic_frag.imageView.setImageResource(R.drawable.nan);
                    item_frag.text.setText(item_frag.Pastrys[3]);
                }
                else if (option.equals(Pastrys[4])){
                    pic_frag.imageView.setImageResource(R.drawable.ghotab_1);
                    item_frag.text.setText(item_frag.Pastrys[4]);
                }

                // For Foods
                else if (option.equals(Foods[0])){
                    pic_frag.imageView.setImageResource(R.drawable.ghorme_1);
                    item_frag.text.setText(item_frag.Foods[0]);
                }
                else if (option.equals(Foods[1])){
                    pic_frag.imageView.setImageResource(R.drawable.kebab_1);
                    item_frag.text.setText(item_frag.Foods[1]);
                }
                else if (option.equals(Foods[2])){
                    pic_frag.imageView.setImageResource(R.drawable.fesenjoon_1);
                    item_frag.text.setText(item_frag.Foods[2]);
                }
                else if (option.equals(Foods[3])){
                    pic_frag.imageView.setImageResource(R.drawable.jooje_1);
                    item_frag.text.setText(item_frag.Foods[3]);
                }
                else if (option.equals(Foods[4])){
                    pic_frag.imageView.setImageResource(R.drawable.dolme_1);
                    item_frag.text.setText(item_frag.Foods[4]);
                }

                // For Breads
                else if (option.equals(Breads[0])){
                    pic_frag.imageView.setImageResource(R.drawable.barbari_1);
                    item_frag.text.setText(item_frag.Breads[0]);
                }
                else if (option.equals(Breads[1])){
                    pic_frag.imageView.setImageResource(R.drawable.sangak_1);
                    item_frag.text.setText(item_frag.Breads[1]);
                }
                else if (option.equals(Breads[2])){
                    pic_frag.imageView.setImageResource(R.drawable.shirmal_1);
                    item_frag.text.setText(item_frag.Breads[2]);
                }

                // For Sides
                else if (option.equals(Sides[0])){
                    pic_frag.imageView.setImageResource(R.drawable.mast_1);
                    item_frag.text.setText(item_frag.Sides[0]);
                }
                else if (option.equals(Sides[1])){
                    pic_frag.imageView.setImageResource(R.drawable.shirazi_1);
                    item_frag.text.setText(item_frag.Sides[1]);
                }
                else if (option.equals(Sides[2])){
                    pic_frag.imageView.setImageResource(R.drawable.pickels_1);
                    item_frag.text.setText(item_frag.Sides[2]);
                }

            }
        });


    }
    public void Pastry_clicked(View view){
        ArrayAdapter<String> myAdapter_Pastrys = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Pastrys);
        ListView list = (ListView) findViewById(R.id.List_of_Items);
        list.setAdapter(myAdapter_Pastrys);
    }
    public void Bread_clicked(View view){
        ArrayAdapter<String> myAdapter_Breads = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Breads);
        ListView list = (ListView) findViewById(R.id.List_of_Items);
        list.setAdapter(myAdapter_Breads);
    }
    public void Food_clicked(View view){
        ArrayAdapter<String> myAdapter_Foods = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Foods);
        ListView list = (ListView) findViewById(R.id.List_of_Items);
        list.setAdapter(myAdapter_Foods);
    }
    public void Sides_clicked(View view){
        ArrayAdapter<String> myAdapter_Sides = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Sides);
        ListView list = (ListView) findViewById(R.id.List_of_Items);
        list.setAdapter(myAdapter_Sides);
    }
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        outState.putString("option", option);
    }

    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);
        Picture pic_frag = (Picture) getSupportFragmentManager().findFragmentById(R.id.pictures);

        Items item_frag = (Items) getSupportFragmentManager().findFragmentById(R.id.items);

        new_option = inState.getString("option", "default");
        pic_frag.setImage(new_option);

    }
}
