package com.practice.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;


public class MainActivity extends AppCompatActivity {

    private TabHost mTabHost;
    private GifImageView gifImageView;
    private GifImageView gifImageView1;
    private GifImageView gifImageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabHost = (TabHost)findViewById(R.id.tabHost);
        mTabHost.setup();
        gifImageView = (GifImageView) findViewById(R.id.GifImageView);
        gifImageView1 = (GifImageView) findViewById(R.id.GifImageView1);
        gifImageView2 = (GifImageView) findViewById(R.id.GifImageView2);


        TabHost.TabSpec spec = mTabHost.newTabSpec(getString(R.string.sports));
        spec.setContent(R.id.tab1);
        spec.setIndicator(getString(R.string.sports));
        gifImageView.setGifImageResource(R.drawable.giphy);
        mTabHost.addTab(spec);

        //Tab 2
        spec = mTabHost.newTabSpec(getString(R.string.food));
        spec.setContent(R.id.tab2);
        spec.setIndicator(getString(R.string.food));
        gifImageView1.setGifImageResource(R.drawable.design);
        mTabHost.addTab(spec);

        //Tab 3
        spec = mTabHost.newTabSpec(getString(R.string.design));
        spec.setContent(R.id.tab3);
        spec.setIndicator(getString(R.string.design));
        gifImageView2.setGifImageResource(R.drawable.tech);
        mTabHost.addTab(spec);
    }
}
