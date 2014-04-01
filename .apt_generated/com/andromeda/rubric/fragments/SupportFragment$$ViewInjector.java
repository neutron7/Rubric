// Generated code from Butter Knife. Do not modify!
package com.andromeda.rubric.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class SupportFragment$$ViewInjector {
  public static void inject(Finder finder, final com.andromeda.rubric.fragments.SupportFragment target, Object source) {
    View view;
    view = finder.findById(source, 2131230733);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131230733' for field 'tvItemName' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.tvItemName = (android.widget.TextView) view;
    view = finder.findById(source, 2131230732);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131230732' for field 'ivIcon' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.ivIcon = (android.widget.ImageView) view;
  }

  public static void reset(com.andromeda.rubric.fragments.SupportFragment target) {
    target.tvItemName = null;
    target.ivIcon = null;
  }
}
