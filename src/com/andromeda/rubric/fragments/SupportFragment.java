package com.andromeda.rubric.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;

import com.andromeda.rubric.activities.R;

public class SupportFragment extends Fragment {
	
	

	
    public static final String IMAGE_RESOURCE_ID = "iconResourceID";
    public static final String ITEM_NAME = "itemName";
	
	public SupportFragment() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
		

          View view = inflater.inflate(R.layout.support_fragment, container,
                      false);
 
          return view;
    }

}
