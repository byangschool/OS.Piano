package com.example.ospiano;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.VibrationEffect;
import android.view.View;
import android.widget.Button;
import android.os.Vibrator;

public class MainActivity extends AppCompatActivity {
    MediaPlayer buttonA, buttonB, buttonC, buttonD, buttonE, buttonF, buttonG, mp;
    Context context = this;
    Handler handler = new Handler();
    boolean play = false;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void playmetro(){
        final Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        final VibrationEffect metroamp = VibrationEffect.createOneShot(15, 50);
        mp = MediaPlayer.create(context, R.raw.metro);
        int delay = 1000;
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                if (isFinishing()){
                    return;
                }
                mp.start();
                if (play) {
                    playmetro();
                    vibrator.vibrate(metroamp);
                }
            }
        }, delay);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Forces the app to run in landscape mode
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //Initializing mediaplayer
        buttonA = MediaPlayer.create(context, R.raw.a);
        buttonB = MediaPlayer.create(context, R.raw.b);
        buttonC = MediaPlayer.create(context, R.raw.c);
        buttonD = MediaPlayer.create(context, R.raw.d);
        buttonE = MediaPlayer.create(context, R.raw.e);
        buttonF = MediaPlayer.create(context, R.raw.f);
        buttonG = MediaPlayer.create(context, R.raw.g);

        //Initializing the buttons
        final Button A = findViewById((R.id.buttonA));
        final Button B = findViewById((R.id.buttonB));
        final Button C = findViewById((R.id.buttonC));
        final Button D = findViewById((R.id.buttonD));
        final Button E = findViewById((R.id.buttonE));
        final Button F = findViewById((R.id.buttonF));
        final Button G = findViewById((R.id.buttonG));
        final Button metro = findViewById((R.id.metronome));

        //Vibration Amplitudes
        final long[] vibrationPattern = new long[]{400,300,200,300};

        //Vibration Timings
        final int[] amplitudes = new int[]{13, 10, 7, 5};

        //Set on click listeners
        A.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view){
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                VibrationEffect effect = VibrationEffect.createWaveform(vibrationPattern, amplitudes, -1);
                try{
                    if(buttonA.isPlaying()){
                        buttonA.stop();
                        buttonA.release();
                        buttonA = MediaPlayer.create(context, R.raw.a);
                    } buttonA.start();
                    vibrator.vibrate(effect);
                } catch(Exception e) {e.printStackTrace();}
            }
        });

        B.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view){
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                VibrationEffect effect = VibrationEffect.createWaveform(vibrationPattern, amplitudes, -1);
                try{
                    if(buttonB.isPlaying()){
                        buttonB.stop();
                        buttonB.release();
                        buttonB = MediaPlayer.create(context, R.raw.b);
                    } buttonB.start();
                    vibrator.vibrate(effect);
                } catch(Exception e) {e.printStackTrace();}
            }
        });

        C.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view){
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                VibrationEffect effect = VibrationEffect.createWaveform(vibrationPattern, amplitudes, -1);
                try{
                    if(buttonC.isPlaying()){
                        buttonC.stop();
                        buttonC.release();
                        buttonC = MediaPlayer.create(context, R.raw.c);
                    } buttonC.start();
                    vibrator.vibrate(effect);
                } catch(Exception e) {e.printStackTrace();}
            }
        });

        D.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view){
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                VibrationEffect effect = VibrationEffect.createWaveform(vibrationPattern, amplitudes, -1);
                try{
                    if(buttonD.isPlaying()){
                        buttonD.stop();
                        buttonD.release();
                        buttonD = MediaPlayer.create(context, R.raw.d);
                    } buttonD.start();
                    vibrator.vibrate(effect);
                } catch(Exception e) {e.printStackTrace();}
            }
        });

        E.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view){
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                VibrationEffect effect = VibrationEffect.createWaveform(vibrationPattern, amplitudes, -1);
                try{
                    if(buttonE.isPlaying()){
                        buttonE.stop();
                        buttonE.release();
                        buttonE = MediaPlayer.create(context, R.raw.e);
                    } buttonE.start();
                    vibrator.vibrate(effect);
                } catch(Exception e) {e.printStackTrace();}
            }
        });

        F.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view){
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                VibrationEffect effect = VibrationEffect.createWaveform(vibrationPattern, amplitudes, -1);
                try{
                    if(buttonF.isPlaying()){
                        buttonF.stop();
                        buttonF.release();
                        buttonF = MediaPlayer.create(context, R.raw.f);
                    } buttonF.start();
                    vibrator.vibrate(effect);
                } catch(Exception e) {e.printStackTrace();}
            }
        });

        G.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view){
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                VibrationEffect effect = VibrationEffect.createWaveform(vibrationPattern, amplitudes, -1);
                try{
                    if(buttonG.isPlaying()){
                        buttonG.stop();
                        buttonG.release();
                        buttonG = MediaPlayer.create(context, R.raw.g);
                    } buttonG.start();
                    vibrator.vibrate(effect);
                } catch(Exception e) {e.printStackTrace();}
            }
        });

        metro.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                playmetro();
                if (play == false) {
                    play = true;
                } else if (play == true){
                    play = false;
                }
            }
        });
    }
}
