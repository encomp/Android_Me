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

    // Create a new head BodyPartFragment
    BodyPartFragment headFragment = new BodyPartFragment();
    headFragment.setImageIds(AndroidImageAssets.getHeads());
    headFragment.setListIndex(1);

    // Add the fragment to its container using a FragmentManager and a Transaction
    FragmentManager fragmentManager = getSupportFragmentManager();

    fragmentManager.beginTransaction().add(R.id.head_container, headFragment).commit();
  }
}
