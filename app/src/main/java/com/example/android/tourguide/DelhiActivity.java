package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class DelhiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai);
        ArrayList<Home> home = new ArrayList<Home>();
        home.add(new Home(R.drawable.deltor1,"The Red Fort","The Red Fort is a historical fort in the city of Delhi in India. It was the main residence of the emperors of the Mughal dynasty for nearly 200 years, until 1857. It is located in the center of Delhi and houses a number of museums."));
        home.add(new Home(R.drawable.deltor2,"Humayun's Tomb","Humayun's tomb (Maqbara e Humayun) is the tomb of the Mughal Emperor Humayun in Delhi, India. The tomb was commissioned by Humayun's first wife and chief consort, "));
        home.add(new Home(R.drawable.deltor3,"Qutb Minar","Qutub Minar is a minaret that forms part of the Qutb complex, a UNESCO World Heritage Site in the Mehrauli area of Delhi, India. Its design is thought to have been based on the Minaret of Jam, in western Afghanistan."));
        home.add(new Home(R.drawable.deltor4,"Lotus Temple","The Lotus Temple, located in Delhi, India, is a Bahá'í House of Worship completed in 1986. Notable for its flowerlike shape, it has become a prominent attraction in the city."));
        home.add(new Home(R.drawable.deltor5,"India Gate","The India Gate, is a war memorial located astride the Rajpath, on the eastern edge of the ‘ceremonial axis’ of New Delhi, India, formerly called Kingsway."));

        ImageAdapter itemsAdapter = new ImageAdapter(this,home);
        ListView listView = (ListView) findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);
    }
}
