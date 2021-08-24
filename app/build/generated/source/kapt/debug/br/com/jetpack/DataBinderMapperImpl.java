package br.com.jetpack;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import br.com.jetpack.databinding.ActivityMainBindingImpl;
import br.com.jetpack.databinding.FragmentDetailBindingImpl;
import br.com.jetpack.databinding.FragmentProductListBindingImpl;
import br.com.jetpack.databinding.ViewItemBindingImpl;
import br.com.jetpack.databinding.ViewSavedItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTDETAIL = 2;

  private static final int LAYOUT_FRAGMENTPRODUCTLIST = 3;

  private static final int LAYOUT_VIEWITEM = 4;

  private static final int LAYOUT_VIEWSAVEDITEM = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(br.com.jetpack.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(br.com.jetpack.R.layout.fragment_detail, LAYOUT_FRAGMENTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(br.com.jetpack.R.layout.fragment_product_list, LAYOUT_FRAGMENTPRODUCTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(br.com.jetpack.R.layout.view_item, LAYOUT_VIEWITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(br.com.jetpack.R.layout.view_saved_item, LAYOUT_VIEWSAVEDITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAIL: {
          if ("layout/fragment_detail_0".equals(tag)) {
            return new FragmentDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRODUCTLIST: {
          if ("layout/fragment_product_list_0".equals(tag)) {
            return new FragmentProductListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_product_list is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWITEM: {
          if ("layout/view_item_0".equals(tag)) {
            return new ViewItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_item is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWSAVEDITEM: {
          if ("layout/view_saved_item_0".equals(tag)) {
            return new ViewSavedItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_saved_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "productModel");
      sKeys.put(2, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_main_0", br.com.jetpack.R.layout.activity_main);
      sKeys.put("layout/fragment_detail_0", br.com.jetpack.R.layout.fragment_detail);
      sKeys.put("layout/fragment_product_list_0", br.com.jetpack.R.layout.fragment_product_list);
      sKeys.put("layout/view_item_0", br.com.jetpack.R.layout.view_item);
      sKeys.put("layout/view_saved_item_0", br.com.jetpack.R.layout.view_saved_item);
    }
  }
}
