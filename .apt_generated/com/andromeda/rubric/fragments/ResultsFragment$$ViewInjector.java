// Generated code from Butter Knife. Do not modify!
package com.andromeda.rubric.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class ResultsFragment$$ViewInjector {
  public static void inject(Finder finder, final com.andromeda.rubric.fragments.ResultsFragment target, Object source) {
    View view;
    view = finder.findById(source, 2131230731);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131230731' for field 'tvItemName' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.tvItemName = (android.widget.TextView) view;
    view = finder.findById(source, 2131230730);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131230730' for field 'ivIcon' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.ivIcon = (android.widget.ImageView) view;
  }

  public static void reset(com.andromeda.rubric.fragments.ResultsFragment target) {
    target.tvItemName = null;
    target.ivIcon = null;
  }
}
