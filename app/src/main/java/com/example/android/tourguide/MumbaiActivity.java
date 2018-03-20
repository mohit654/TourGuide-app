package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MumbaiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai);

        ArrayList<Home> home = new ArrayList<Home>();
        home.add(new Home(R.drawable.mumtor1,"Gateway Of India","The Gateway of India is a monument built during the 20th century in Mumbai City of Maharashtra state in Western India. It is located on the waterfront in the Apollo Bunder area in South Mumbai and overlooks the Arabian Sea."));
        home.add(new Home(R.drawable.mumtor2,"Siddhivinayak Temple","The Shree Siddhivinayak Ganapati Mandir is a Hindu temple dedicated to Lord Shri Ganesh. It is located in Prabhadevi, Mumbai, Maharashtra."));
        home.add(new Home(R.drawable.mumtor3,"Kanheri Caves","The Kanheri Caves are a group of caves and rock-cut monuments formed from a massive basalt outcrop in the forests of the Sanjay Gandhi National Park, on the western outskirts of Mumbai, India."));
        home.add(new Home(R.drawable.mumtor4,"Mahalakshmi Temple","Mahalaxmi Temple is one of the most famous temples of Mumbai situated on Bhulabhai Desai Road in Mahalaxmi area. It is dedicated to Mahalakshmi the central deity of Devi Mahatmyam. The temple was built in 1831 by Dhakji Dadaji, a Hindu merchant."));
        home.add(new Home(R.drawable.mumtor5,"Rajabai Clock Tower","The Rajabai Clock Tower is a clock tower in South Mumbai India. It is located in the confines of the Fort campus of the University of Mumbai. The tower stands at a height of 85 m."));

        ImageAdapter itemsAdapter = new ImageAdapter(this,home);
        ListView listView = (ListView) findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);
    }
}
