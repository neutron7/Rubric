package com.andromeda.rubric.activities;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

import com.andromeda.rubric.fragments.AssessmentFragment;
import com.andromeda.rubric.fragments.NetworkFragment;
import com.andromeda.rubric.fragments.ResultsFragment;
import com.andromeda.rubric.fragments.SupportFragment;
import com.andromeda.rubric.utilities.DrawerAdapter;
import com.andromeda.rubric.utilities.DrawerItem;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.res.Configuration;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	
	@InjectView(R.id.drawer_layout) DrawerLayout mDrawerLayout;
    @InjectView(R.id.left_drawer) ListView mDrawerList;

    
    private ActionBarDrawerToggle mDrawerToggle;

    private CharSequence mDrawerTitle;
    private CharSequence mTitle;
    DrawerAdapter adapter;

    List<DrawerItem> dataList;
	
 
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.inject(this);
		
		
		dataList = new ArrayList<DrawerItem>();
        mTitle = mDrawerTitle = getTitle();


        mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
                    GravityCompat.START);
        

        
        
        dataList.add(new DrawerItem("Setup Network", R.drawable.network));
        dataList.add(new DrawerItem("Assessment", R.drawable.task));
        dataList.add(new DrawerItem("Send Results", R.drawable.share));
        dataList.add(new DrawerItem("Help & Support", R.drawable.help));
        
        adapter = new DrawerAdapter(this, R.layout.custom_drawer_item,
                dataList);

        mDrawerList.setAdapter(adapter);

        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
        
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                    R.drawable.ic_drawer, R.string.drawer_open,
                    R.string.drawer_close) {
              public void onDrawerClosed(View view) {
                    getActionBar().setTitle(mTitle);
                    invalidateOptionsMenu(); // creates call to
                                                              // onPrepareOptionsMenu()
              }

              public void onDrawerOpened(View drawerView) {
                    getActionBar().setTitle(mDrawerTitle);
                    invalidateOptionsMenu(); // creates call to
                                                              // onPrepareOptionsMenu()
              }
        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        if (savedInstanceState == null) {
              SelectItem(0);
        }
		
	}
	
	public void SelectItem(int possition) {
		 
        Fragment fragment = null;
        Bundle args = new Bundle();
        switch (possition) {
        case 0:
              fragment = new NetworkFragment();
              args.putString(NetworkFragment.ITEM_NAME, dataList.get(possition)
                          .getItemName());
              args.putInt(NetworkFragment.IMAGE_RESOURCE_ID, dataList.get(possition)
                          .getImgResID());
              break;
        case 1:
              fragment = new AssessmentFragment();
              args.putString(AssessmentFragment.ITEM_NAME, dataList.get(possition)
                          .getItemName());
              args.putInt(AssessmentFragment.IMAGE_RESOURCE_ID, dataList.get(possition)
                          .getImgResID());
              break;
        case 2:
              fragment = new ResultsFragment();
              args.putString(ResultsFragment.ITEM_NAME, dataList.get(possition)
                          .getItemName());
              args.putInt(ResultsFragment.IMAGE_RESOURCE_ID, dataList.get(possition)
                          .getImgResID());
              break;
        case 3:
              fragment = new SupportFragment();
              args.putString(SupportFragment.ITEM_NAME, dataList.get(possition)
                          .getItemName());
              args.putInt(SupportFragment.IMAGE_RESOURCE_ID, dataList.get(possition)
                          .getImgResID());
              break;

        default:
              break;
        }

        fragment.setArguments(args);
        FragmentManager frgManager = getFragmentManager();
        frgManager.beginTransaction().replace(R.id.content_frame, fragment)
                    .commit();

        mDrawerList.setItemChecked(possition, true);
        setTitle(dataList.get(possition).getItemName());
        mDrawerLayout.closeDrawer(mDrawerList);

  }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	 @Override
     public void setTitle(CharSequence title) {
           mTitle = title;
           getActionBar().setTitle(mTitle);
     }

     @Override
     protected void onPostCreate(Bundle savedInstanceState) {
           super.onPostCreate(savedInstanceState);
           // Sync the toggle state after onRestoreInstanceState has occurred.
           mDrawerToggle.syncState();
     }

     @Override
     public void onConfigurationChanged(Configuration newConfig) {
           super.onConfigurationChanged(newConfig);
           // Pass any configuration change to the drawer toggles
           mDrawerToggle.onConfigurationChanged(newConfig);
     }

     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
           // The action bar home/up action should open or close the drawer.
           // ActionBarDrawerToggle will take care of this.
           if (mDrawerToggle.onOptionsItemSelected(item)) {
                 return true;
           }

           return false;
     }

       private class DrawerItemClickListener implements
                 ListView.OnItemClickListener {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position,
                       long id) {
                 SelectItem(position);

           }
     }

}
