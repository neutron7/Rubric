package com.andromeda.rubric.fragments;

import com.andromeda.rubric.activities.R;

import butterknife.InjectView;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class AssessmentFragment extends Fragment{

    ImageView ivIcon;
    TextView tvItemName;
	
    public static final String IMAGE_RESOURCE_ID = "iconResourceID";
    public static final String ITEM_NAME = "itemName";
	
	public AssessmentFragment() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {

          View view=inflater.inflate(R.layout.assessment_fragment,container, false);

          ivIcon=(ImageView)view.findViewById(R.id.frag2_icon);
          tvItemName=(TextView)view.findViewById(R.id.frag2_text);

          tvItemName.setText(getArguments().getString(ITEM_NAME));
          ivIcon.setImageDrawable(view.getResources().getDrawable(
                      getArguments().getInt(IMAGE_RESOURCE_ID)));
          return view;
    }
	
}
