// Generated code from Butter Knife. Do not modify!
package com.andromeda.rubric.activities;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainActivity$$ViewInjector {
  public static void inject(Finder finder, final com.andromeda.rubric.activities.MainActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131230722);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131230722' for field 'mDrawerList' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mDrawerList = (android.widget.ListView) view;
    view = finder.findById(source, 2131230720);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131230720' for field 'mDrawerLayout' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mDrawerLayout = (android.support.v4.widget.DrawerLayout) view;
  }

  public static void reset(com.andromeda.rubric.activities.MainActivity target) {
    target.mDrawerList = null;
    target.mDrawerLayout = null;
  }
}
