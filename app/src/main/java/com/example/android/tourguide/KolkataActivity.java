package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class KolkataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai);

        ArrayList<Home> home = new ArrayList<Home>();
        home.add(new Home(R.drawable.koltor1,"Victoria Memorial, Kolkata","The Victoria Memorial is a large marble building in Kolkata, West Bengal, India, which was built between 1906 and 1921."));
        home.add(new Home(R.drawable.koltor2,"Dakshineswar Kali Temple","Dakshineswar Kali Temple is a Hindu temple located in Dakshineswar near Kolkata. Situated on the eastern bank of the Hooghly River, the presiding deity of the temple is Bhavatarini, an aspect of Kali,"));
        home.add(new Home(R.drawable.koltor3,"Howrah Bridge","Howrah Bridge is a propped cantilever bridge with a suspended span over the Hooghly River in West Bengal, India."));
        home.add(new Home(R.drawable.koltor4,"Indian Museum","The Indian Museum is the largest and oldest museum in India and has rare collections of antiques, armour and ornaments, fossils, skeletons, mummies, and Mughal paintings. It was founded by the Asiatic Society of Bengal in Kolkata, India, in 1814."));
        home.add(new Home(R.drawable.koltor5,"Eden Gardens","Eden Gardens is a cricket ground in Kolkata, India established in 1864. It is the home venue of the Bengal cricket team and the Kolkata Knight Riders in the IPL, and is also a venue for Test, ODI and T20I matches."));

        ImageAdapter itemsAdapter = new ImageAdapter(this,home);
        ListView listView = (ListView) findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);
    }
}
