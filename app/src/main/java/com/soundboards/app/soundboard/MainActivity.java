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

    private int[] all_sounds = new int[]{

            //weapons, ...
            R.raw.o_bouncing_on_tires,
            R.raw.o_bus,
            R.raw.o_chest_opened,
            R.raw.o_chest_unopened,
            R.raw.o_chug_jug,
            R.raw.o_close_glider,
            R.raw.o_goal,
            R.raw.o_incoming_storm,
            R.raw.o_inside_the_storm,
            R.raw.o_jump_out_the_bus,
            R.raw.o_launchpad,
            R.raw.o_open_glider,
            R.raw.o_out_of_the_storm,
            R.raw.o_theme_song,

            R.raw.w_assault_rifle_burst,
            R.raw.w_electrical_trap,
            R.raw.w_grenade,
            R.raw.w_grenade_launcher,
            R.raw.w_m16,
            R.raw.w_ocket_launcher,
            R.raw.w_pickaxe_attack,
            R.raw.w_picking_guns,
            R.raw.w_pistol,
            R.raw.w_pumpkin_rocket_launcher,
            R.raw.w_scar,
            R.raw.w_shotgun,
            R.raw.w_silenced_smg,
            R.raw.w_smoke_grenade,
            R.raw.w_sniper_shot,
            R.raw.w_switch_weapons,

            //dance
            R.raw.d_best_mates,
            R.raw.d_dance_move_2,
            R.raw.d_dance_moves_3,
            R.raw.d_dance_moves,
            R.raw.d_electro_shuffle,
            R.raw.d_flapper,
            R.raw.d_floss,
            R.raw.d_fresh,
            R.raw.d_ride_the_pony,
            R.raw.d_slow_clap,
            R.raw.d_take_the_l,
            R.raw.d_the_robot,
            R.raw.d_the_worm
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
        setContentView(com.soundboards.app.soundboard.R.layout.activity_main);

        TabLayout tabLayout = (TabLayout)findViewById(com.soundboards.app.soundboard.R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Positief"));
        tabLayout.addTab(tabLayout.newTab().setText("Dance"));
        tabLayout.addTab(tabLayout.newTab().setIcon(com.soundboards.app.soundboard.R.drawable.ic_settings_white_24dp));
        tabLayout.addTab(tabLayout.newTab().setText("New"));

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
                //weapons, ...
            case R.id.button_bouncing_on_tires:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.o_bouncing_on_tires);
                mediaPlayer.start();
                break;

            case R.id.button_bus:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.o_bus);
                mediaPlayer.start();
                break;

            case R.id.button_chest_opened:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.o_chest_opened);
                mediaPlayer.start();
                break;

            case R.id.button_chest_unopened:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.o_chest_unopened);
                mediaPlayer.start();
                break;

            case R.id.button_chug_jug:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.o_chug_jug);
                mediaPlayer.start();
                break;

            case R.id.button_close_glider:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.o_close_glider);
                mediaPlayer.start();
                break;

            case R.id.button_goal:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.o_goal);
                mediaPlayer.start();
                break;

            case R.id.button_incoming_storm:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.o_incoming_storm);
                mediaPlayer.start();
                break;

            case R.id.button_inside_the_storm:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.o_inside_the_storm);
                mediaPlayer.start();
                break;

            case R.id.button_jump_out_the_bus:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.o_jump_out_the_bus);
                mediaPlayer.start();
                break;

            case R.id.button_launchpad:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.o_launchpad);
                mediaPlayer.start();
                break;

            case R.id.button_open_glider:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.o_open_glider);
                mediaPlayer.start();

            case R.id.button_out_of_the_storm:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.o_out_of_the_storm);
                mediaPlayer.start();
                break;

            case R.id.button_theme_song:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.o_theme_song);
                mediaPlayer.start();
                break;


            case R.id.button_assault_rifle_burst:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.w_assault_rifle_burst);
                mediaPlayer.start();
                break;
            case R.id.button_electrical_trap:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.w_electrical_trap);
                mediaPlayer.start();
                break;
            case R.id.button_grenade:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.w_grenade);
                mediaPlayer.start();
                break;
            case R.id.button_grenade_launcher:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.w_grenade_launcher);
                mediaPlayer.start();
                break;
            case R.id.button_m16:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.w_m16);
                mediaPlayer.start();
                break;
            case R.id.button_ocket_launcher:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.w_ocket_launcher);
                mediaPlayer.start();
                break;
            case R.id.button_pickaxe_attack:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.w_pickaxe_attack);
                mediaPlayer.start();
                break;
            case R.id.button_picking_guns:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.w_picking_guns);
                mediaPlayer.start();
                break;
            case R.id.button_pistol:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.w_pistol);
                mediaPlayer.start();
                break;
            case R.id.button_pumpkin_rocket_launcher:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.w_pumpkin_rocket_launcher);
                mediaPlayer.start();
                break;
            case R.id.button_scar:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.w_scar);
                mediaPlayer.start();
                break;
            case R.id.button_shotgun:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.w_shotgun);
                mediaPlayer.start();
                break;
            case R.id.button_silenced_smg:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.w_silenced_smg);
                mediaPlayer.start();
                break;
            case R.id.button_smoke_grenade:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.w_smoke_grenade);
                mediaPlayer.start();
                break;
            case R.id.button_sniper_shot:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.w_sniper_shot);
                mediaPlayer.start();
                break;
            case R.id.button_switch_weapons:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.w_switch_weapons);
                mediaPlayer.start();
                break;

                //Dance
            case R.id.button_best_mates:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.d_best_mates);
                mediaPlayer.start();
                break;
            case R.id.button_dance_moves:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.d_dance_moves);
                mediaPlayer.start();
                break;
            case R.id.button_dance_move_2:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.d_dance_move_2);
                mediaPlayer.start();
                break;
            case R.id.button_dance_move_3:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.d_dance_moves_3);
                mediaPlayer.start();
                break;
            case R.id.button_electro_shuffle:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.d_electro_shuffle);
                mediaPlayer.start();
                break;
            case R.id.button_flapper:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.d_flapper);
                mediaPlayer.start();
                break;
            case R.id.button_floss:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.d_floss);
                mediaPlayer.start();
                break;
            case R.id.button_fresh:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.d_fresh);
                mediaPlayer.start();
                break;
            case R.id.button_ride_the_pony:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.d_ride_the_pony);
                mediaPlayer.start();
                break;
            case R.id.button_slow_clap:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.d_slow_clap);
                mediaPlayer.start();
                break;
            case R.id.button_take_the_l:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.d_take_the_l);
                mediaPlayer.start();
                break;
            case R.id.button_the_robot:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.d_the_robot);
                mediaPlayer.start();
                break;
            case R.id.button_the_worm:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.d_the_worm);
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
