package com.andromeda.rubric.fragments;

import com.andromeda.rubric.activities.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultsFragment extends Fragment {
	
	@InjectView(R.id.frag3_icon) ImageView ivIcon;
	@InjectView(R.id.frag3_text) TextView tvItemName;
	
    public static final String IMAGE_RESOURCE_ID = "iconResourceID";
    public static final String ITEM_NAME = "itemName";
	
	public ResultsFragment() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
		

          View view = inflater.inflate(R.layout.results_fragment, container,
                      false);
          ButterKnife.inject(this, view);



          tvItemName.setText(getArguments().getString(ITEM_NAME));
          ivIcon.setImageDrawable(view.getResources().getDrawable(
                      getArguments().getInt(IMAGE_RESOURCE_ID)));
          return view;
    }

}
