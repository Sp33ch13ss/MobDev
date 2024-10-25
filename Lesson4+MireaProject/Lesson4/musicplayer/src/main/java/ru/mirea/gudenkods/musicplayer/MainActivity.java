package ru.mirea.gudenkods.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import ru.mirea.gudenkods.musicplayer.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mediaPlayer = MediaPlayer.create(this, R.raw.ringtone);
    }

    public void onClickPlay(View v) {
        Log.d(MainActivity.class.getSimpleName(), "play");
        mediaPlayer.start();
    }

    public void onClickPause(View v) {
        Log.d(MainActivity.class.getSimpleName(), "pause");
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }
    }

}