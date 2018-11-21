package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

// This activity will display a custom Android image composed of three body parts: head, body, and
// legs
public class AndroidMeActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_android_me);

    if (savedInstanceState == null) {
      FragmentManager fragmentManager = getSupportFragmentManager();

      BodyPartFragment headFragment = new BodyPartFragment();
      headFragment.setImageIds(AndroidImageAssets.getHeads());
      fragmentManager.beginTransaction().add(R.id.head_container, headFragment).commit();

      BodyPartFragment bodyFragment = new BodyPartFragment();
      bodyFragment.setImageIds(AndroidImageAssets.getBodies());
      fragmentManager.beginTransaction().add(R.id.body_container, bodyFragment).commit();

      BodyPartFragment legFragment = new BodyPartFragment();
      legFragment.setImageIds(AndroidImageAssets.getLegs());
      fragmentManager.beginTransaction().add(R.id.leg_container, legFragment).commit();
    }
  }
}
