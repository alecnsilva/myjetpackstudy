package br.com.jetpack.databinding;
import br.com.jetpack.R;
import br.com.jetpack.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewSavedItemBindingImpl extends ViewSavedItemBinding implements br.com.jetpack.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.price, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewSavedItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ViewSavedItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatButton) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            );
        this.description.setTag(null);
        this.imageProduct.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.removeButton.setTag(null);
        this.subTitle.setTag(null);
        this.title.setTag(null);
        this.units.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new br.com.jetpack.generated.callback.OnClickListener(this, 2);
        mCallback4 = new br.com.jetpack.generated.callback.OnClickListener(this, 3);
        mCallback2 = new br.com.jetpack.generated.callback.OnClickListener(this, 1);
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
        if (BR.productModel == variableId) {
            setProductModel((br.com.jetpack.data.local.ProductModel) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((br.com.jetpack.viewmodel.ProductListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProductModel(@Nullable br.com.jetpack.data.local.ProductModel ProductModel) {
        this.mProductModel = ProductModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.productModel);
        super.requestRebind();
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
        java.lang.String productModelSubTitle = null;
        java.lang.String productModelDescription = null;
        java.lang.String productModelTitle = null;
        br.com.jetpack.data.local.ProductModel productModel = mProductModel;
        int productModelSavedUnits = 0;
        java.lang.String stringValueOfProductModelSavedUnits = null;
        br.com.jetpack.viewmodel.ProductListViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x5L) != 0) {



                if (productModel != null) {
                    // read productModel.subTitle
                    productModelSubTitle = productModel.getSubTitle();
                    // read productModel.description
                    productModelDescription = productModel.getDescription();
                    // read productModel.title
                    productModelTitle = productModel.getTitle();
                    // read productModel.savedUnits
                    productModelSavedUnits = productModel.getSavedUnits();
                }


                // read String.valueOf(productModel.savedUnits)
                stringValueOfProductModelSavedUnits = java.lang.String.valueOf(productModelSavedUnits);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.description, productModelDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subTitle, productModelSubTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, productModelTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.units, stringValueOfProductModelSavedUnits);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.imageProduct.setOnClickListener(mCallback2);
            this.removeButton.setOnClickListener(mCallback4);
            this.title.setOnClickListener(mCallback3);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // productModel
                br.com.jetpack.data.local.ProductModel productModel = mProductModel;
                // viewModel
                br.com.jetpack.viewmodel.ProductListViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.goToDetail(productModel);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // productModel
                br.com.jetpack.data.local.ProductModel productModel = mProductModel;
                // viewModel
                br.com.jetpack.viewmodel.ProductListViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.removeProduct(productModel)
                kotlinx.coroutines.Job viewModelRemoveProductProductModel = null;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModelRemoveProductProductModel = viewModel.removeProduct(productModel);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // productModel
                br.com.jetpack.data.local.ProductModel productModel = mProductModel;
                // viewModel
                br.com.jetpack.viewmodel.ProductListViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.goToDetail(productModel);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): productModel
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}