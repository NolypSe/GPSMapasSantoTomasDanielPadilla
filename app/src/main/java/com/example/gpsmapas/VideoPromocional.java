package com.example.gpsmapas;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoPromocional extends AppCompatActivity {


    private VideoView videoPromocional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_promocional);

        videoPromocional = findViewById(R.id.videoPromocional);

        String videoUrl = "https://drive.google.com/uc?export=download&id=1O2L59IMCM2ePokV1kp29w1QWo8WL9M7l";

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoPromocional);
        videoPromocional.setMediaController(mediaController);

        videoPromocional.setVideoURI(Uri.parse(videoUrl));

        videoPromocional.start();
    }

}