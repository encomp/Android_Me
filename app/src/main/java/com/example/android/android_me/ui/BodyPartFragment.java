package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;

import java.util.List;

public class BodyPartFragment extends Fragment {

  private static final String TAG = "BodyPartFragment";
  private List<Integer> imageIds;
  private int listIndex;

  /** Mandatory empty constructor for the fragment manager to instantiate the fragment */
  public BodyPartFragment() {}

  /** Inflates the fragment layout file and sets the correct resource for the image to display */
  @Override
  public View onCreateView(
      LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

    // Inflate the Android-Me fragment layout
    View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

    // Get a reference to the ImageView in the fragment layout
    ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);

    // Otherwise, create a Log statement that indicates that the list was not found
    if (imageIds != null && imageIds.size() > 0 && listIndex > -1 && listIndex < imageIds.size()) {
      imageView.setImageResource(imageIds.get(listIndex));
    } else {
      Log.v(TAG, "Missing listIndex.");
    }

    // Return the rootView
    return rootView;
  }

  public List<Integer> getImageIds() {
    return imageIds;
  }

  public void setImageIds(List<Integer> imageIds) {
    this.imageIds = imageIds;
  }

  public int getListIndex() {
    return listIndex;
  }

  public void setListIndex(int listIndex) {
    this.listIndex = listIndex;
  }
}
