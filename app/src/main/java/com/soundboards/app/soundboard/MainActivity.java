package com.soundboards.app.soundboard;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.media.MediaPlayer;
import android.media.AudioManager;
import java.util.Random;

import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity implements Tab1.OnFragmentInteractionListener, Tab2.OnFragmentInteractionListener, Tab3.OnFragmentInteractionListener, Tab4.OnFragmentInteractionListener {

    private MediaPlayer mediaPlayer = null;
    private AdView mAdView;
    private int adCount;

    private int[] all_sounds = {
            com.soundboards.app.soundboard.R.raw.bases,
            com.soundboards.app.soundboard.R.raw.benghazi,
            com.soundboards.app.soundboard.R.raw.bill_cosby,
            com.soundboards.app.soundboard.R.raw.bird_up,
            com.soundboards.app.soundboard.R.raw.cameras,
            com.soundboards.app.soundboard.R.raw.cherokee_beer,
            com.soundboards.app.soundboard.R.raw.hoky_poky,
            com.soundboards.app.soundboard.R.raw.i_am_the_octopus,
            com.soundboards.app.soundboard.R.raw.legalize_ranch,
            com.soundboards.app.soundboard.R.raw.lsd,
            com.soundboards.app.soundboard.R.raw.mein_kampf,
            com.soundboards.app.soundboard.R.raw.mom_and_dad,
            com.soundboards.app.soundboard.R.raw.monkeys,
            com.soundboards.app.soundboard.R.raw.narcoleptic,
            com.soundboards.app.soundboard.R.raw.octomom,
            com.soundboards.app.soundboard.R.raw.on_wet,
            com.soundboards.app.soundboard.R.raw.oriental_background,
            com.soundboards.app.soundboard.R.raw.ranch_it_up,
            com.soundboards.app.soundboard.R.raw.societies_lies,
            com.soundboards.app.soundboard.R.raw.sup_mello,
            com.soundboards.app.soundboard.R.raw.taxes,
            com.soundboards.app.soundboard.R.raw.vacuum,
            com.soundboards.app.soundboard.R.raw.vert_horiz_mull,
            com.soundboards.app.soundboard.R.raw.john_wayne,
            com.soundboards.app.soundboard.R.raw.arabic,
            com.soundboards.app.soundboard.R.raw.l_ron_hubbard,
            com.soundboards.app.soundboard.R.raw.pizza_ball,
            com.soundboards.app.soundboard.R.raw.schindlers_list,
            com.soundboards.app.soundboard.R.raw.well_be_right_back,
            com.soundboards.app.soundboard.R.raw.yahboobay_short,
            com.soundboards.app.soundboard.R.raw.yahboobay_long,
            com.soundboards.app.soundboard.R.raw.yes_guy
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
        setContentView(com.soundboards.app.soundboard.R.layout.activity_main);

        TabLayout tabLayout = (TabLayout)findViewById(com.soundboards.app.soundboard.R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("category"));
        tabLayout.addTab(tabLayout.newTab().setText("category2"));
        tabLayout.addTab(tabLayout.newTab().setIcon(com.soundboards.app.soundboard.R.drawable.ic_settings_white_24dp));
        tabLayout.addTab(tabLayout.newTab().setText("Record"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        setVolumeControlStream(AudioManager.STREAM_MUSIC);

        final ViewPager viewPager = (ViewPager)findViewById(com.soundboards.app.soundboard.R.id.pager);
        final PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void playSoundEffect(View view) {

        if (adCount == 5) {
            adCount = 0;
            // Play add and return
        } else {
            adCount++;
        }

        // Needed to prevent memory errors
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            mediaPlayer.release();
        }

        switch (view.getId()) {
            case com.soundboards.app.soundboard.R.id.button_benghazi:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.benghazi);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_bird_up:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.bird_up);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_cherokee_chicks:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.cherokee_beer);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_legalize_ranch:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.legalize_ranch);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_ranch_it_up:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.ranch_it_up);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_bases:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.bases);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_bill_cosby:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.bill_cosby);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_cameras:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.cameras);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_hoky_poky:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.hoky_poky);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_octopus:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.i_am_the_octopus);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_lsd:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.lsd);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_mein_kampf:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.mein_kampf);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_mom_and_dad:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.mom_and_dad);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_monkeys:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.monkeys);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_narcoleptic:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.narcoleptic);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_octomom:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.octomom);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_on_wet:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.on_wet);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_oriental:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.oriental_background);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_societys_lies:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.societies_lies);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_sup_mello:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.sup_mello);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_taxes:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.taxes);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_vacuum:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.vacuum);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_vertical:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.vert_horiz_mull);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_john_wayne:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.john_wayne);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_arabic:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.arabic);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_l_ron_hubbard:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.l_ron_hubbard);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_pizza_ball:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.pizza_ball);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_schindlers_list:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.schindlers_list);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_well_be_right_back:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.well_be_right_back);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_yahboobay_short:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.yahboobay_short);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_yahboobay_long:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.yahboobay_long);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.button_yes_guy:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), com.soundboards.app.soundboard.R.raw.yes_guy);
                mediaPlayer.start();
                break;
            case com.soundboards.app.soundboard.R.id.randomSoundButton:
                int max = all_sounds.length;
                int random = new Random().nextInt(max);
                mediaPlayer = MediaPlayer.create(getApplicationContext(), all_sounds[random]);
                mediaPlayer.start();
        }
    }

    /*@Override
    protected void onStop() {
        super.onStop();

        // Release the MediaPlayer
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            mediaPlayer.release();
        }
    }

    @Override
    public void onResume() {
        super.onResume();


    }*/

    public void suggestNewSound(View view) {
        Uri uri = Uri.parse("http://deecee.tk");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void shareApp(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String shareBody = "Download het soundboard";
        shareBody = shareBody + "\n" + "http://deecee.tk";
        String shareSubject = "Soundboard";
        intent.putExtra(Intent.EXTRA_SUBJECT, shareSubject);
        intent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(intent, "Delen met..."));
    }
}
