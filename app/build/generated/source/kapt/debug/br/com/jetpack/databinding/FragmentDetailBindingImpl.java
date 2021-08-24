package br.com.jetpack.databinding;
import br.com.jetpack.R;
import br.com.jetpack.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailBindingImpl extends FragmentDetailBinding implements br.com.jetpack.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageProductDetail, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            );
        this.addButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.titleDetail.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new br.com.jetpack.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((br.com.jetpack.viewmodel.ProductListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable br.com.jetpack.viewmodel.ProductListViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelViewLiveDataProductDetailModel((androidx.lifecycle.MutableLiveData<br.com.jetpack.data.local.ProductModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelViewLiveDataProductDetailModel(androidx.lifecycle.MutableLiveData<br.com.jetpack.data.local.ProductModel> ViewModelViewLiveDataProductDetailModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelViewLiveDataProductDetailModelTitle = null;
        androidx.lifecycle.MutableLiveData<br.com.jetpack.data.local.ProductModel> viewModelViewLiveDataProductDetailModel = null;
        br.com.jetpack.data.local.ProductModel viewModelViewLiveDataProductDetailModelGetValue = null;
        br.com.jetpack.viewmodel.ProductListViewModel viewModel = mViewModel;
        br.com.jetpack.viewmodel.ProductListViewModel.ViewLiveData viewModelViewLiveData = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.viewLiveData
                    viewModelViewLiveData = viewModel.getViewLiveData();
                }


                if (viewModelViewLiveData != null) {
                    // read viewModel.viewLiveData.productDetailModel
                    viewModelViewLiveDataProductDetailModel = viewModelViewLiveData.getProductDetailModel();
                }
                updateLiveDataRegistration(0, viewModelViewLiveDataProductDetailModel);


                if (viewModelViewLiveDataProductDetailModel != null) {
                    // read viewModel.viewLiveData.productDetailModel.getValue()
                    viewModelViewLiveDataProductDetailModelGetValue = viewModelViewLiveDataProductDetailModel.getValue();
                }


                if (viewModelViewLiveDataProductDetailModelGetValue != null) {
                    // read viewModel.viewLiveData.productDetailModel.getValue().title
                    viewModelViewLiveDataProductDetailModelTitle = viewModelViewLiveDataProductDetailModelGetValue.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.addButton.setOnClickListener(mCallback8);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleDetail, viewModelViewLiveDataProductDetailModelTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        br.com.jetpack.viewmodel.ProductListViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onBack();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.viewLiveData.productDetailModel
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}