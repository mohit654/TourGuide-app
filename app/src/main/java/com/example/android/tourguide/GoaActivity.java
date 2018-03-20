package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class GoaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai);

        ArrayList<Home> home = new ArrayList<Home>();
        home.add(new Home(R.drawable.goator1,"Basilica of Bom Jesus","The Basilica of Bom Jesus or Borea Jezuchi Bajilika is located in Goa, India, and is a UNESCO World Heritage Site. The basilica holds the mortal remains of St. Francis Xavier."));
        home.add(new Home(R.drawable.goator2,"Se Cathedral","The Sé Catedral de Santa Catarina, known as Se Cathedral, is the cathedral of the Latin Rite Roman Catholic Archdiocese of Goa and Daman and the seat of the Patriarch of the East Indies. It is located in Old Goa, India."));
        home.add(new Home(R.drawable.goator3,"Salim Ali Bird Sanctuary","Salim Ali Bird Sanctuary is an estuarine mangrove habitat, which is declared as a bird sanctuary, and located on western tip of the Island of Chorão along the Mandovi River, Goa, in India."));
        home.add(new Home(R.drawable.goator4,"Shanta Durga Temple","Shri Shantadurga Temple is a Private temple complex belonging to GSB community. 33 km from Panaji at the foothill of Kavalem village in Ponda Taluka, Goa, India."));
        home.add(new Home(R.drawable.goator5,"Baga Beach","Baga Beach is one of the oldest beach in Goa. It is located on the outskirts of goa. It is the most famous tourist place."));

        ImageAdapter itemsAdapter = new ImageAdapter(this,home);
        ListView listView = (ListView) findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

    }
}
