package android.guide.playbackgroundaudio_service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;
//TODO 1 CREATE THE CLASS
public class MyAudioService extends Service {
    MediaPlayer AudioPlayer;
//    TODO 1.1 CALL IBinder method
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

//    TODO 1.2 override onCreate method
    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Service created", Toast.LENGTH_LONG).show();
        AudioPlayer = MediaPlayer.create(this,R.raw.song);
        AudioPlayer.setLooping(false);
    }
//    TODO 1.3 override onStart method
    @Override
    public void onStart(Intent intent, int startId) {
        Toast.makeText(this, "Service started", Toast.LENGTH_LONG).show();
        AudioPlayer.start();
    }
//    TODO 1.4 onDestroy onStart method
    @Override
    public void onDestroy() {
        Toast.makeText(this, "Service destroyed", Toast.LENGTH_LONG).show();
        AudioPlayer.stop();

    }
}
