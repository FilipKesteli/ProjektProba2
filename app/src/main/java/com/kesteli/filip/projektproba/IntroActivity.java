package com.kesteli.filip.projektproba;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class IntroActivity extends AppIntro2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Note here that we DO NOT use setContentView();

        setupFirebase();
        setFadeAnimation();
//        setSlideOverAnimation();
//        setFlowAnimation();
//        setDepthAnimation();
//        setZoomAnimation();


        // Instead of fragments, you can also use our default slide
        // Just set a title, description, background and image. AppIntro will do the rest.
        addSlide(AppIntroFragment.newInstance("DETECTIO", "The best and cheapest reliable lie detector", R.drawable.ic_launcher_background, getResources().getColor(R.color.red_300)));
        addSlide(AppIntroFragment.newInstance("Become a Professional Investigator", "Help the world to become a better place and find liers among us - every investigation - Investigator point", R.drawable.ic_launcher_background, getResources().getColor(R.color.red_300)));
        addSlide(AppIntroFragment.newInstance("Become a Detectio ambasador", "Give us a feedback trough our forum - every publication - Ambasador point", R.drawable.ic_launcher_background, getResources().getColor(R.color.red_300)));
        addSlide(AppIntroFragment.newInstance("Become a Hero", "Help your society to become a better place - Become an ambassador of the better world. Motivate people to stop lieing - every person one Hero point", R.drawable.ic_launcher_background, getResources().getColor(R.color.red_300)));

        // OPTIONAL METHODS
        // Override bar/separator color.
        /*setBarColor(Color.parseColor("#3F51B5"));
        setSeparatorColor(Color.parseColor("#2196F3"));*/

        // Hide Skip/Done button.
//        showSkipButton(true);
        setProgressButtonEnabled(true);


        // Turn vibration on and set intensity.
        // NOTE: you will probably need to ask VIBRATE permission in Manifest.
        setVibrate(true);
        setVibrateIntensity(30);
    }

    private void setupFirebase() {
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }


}


