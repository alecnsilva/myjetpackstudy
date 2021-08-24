package br.com.jetpack.view.adapters;

import java.lang.System;

/**
 * Created by humbertokalex
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lbr/com/jetpack/view/adapters/SavedItemsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbr/com/jetpack/view/adapters/SavedItemsAdapter$ViewHolder;", "viewModelProduct", "Lbr/com/jetpack/viewmodel/ProductListViewModel;", "items", "", "Lbr/com/jetpack/data/local/ProductModel;", "(Lbr/com/jetpack/viewmodel/ProductListViewModel;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class SavedItemsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<br.com.jetpack.view.adapters.SavedItemsAdapter.ViewHolder> {
    private final br.com.jetpack.viewmodel.ProductListViewModel viewModelProduct = null;
    private java.util.List<br.com.jetpack.data.local.ProductModel> items;
    
    public SavedItemsAdapter(@org.jetbrains.annotations.NotNull()
    br.com.jetpack.viewmodel.ProductListViewModel viewModelProduct, @org.jetbrains.annotations.NotNull()
    java.util.List<br.com.jetpack.data.local.ProductModel> items) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.jetpack.view.adapters.SavedItemsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    br.com.jetpack.view.adapters.SavedItemsAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lbr/com/jetpack/view/adapters/SavedItemsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lbr/com/jetpack/databinding/ViewSavedItemBinding;", "context", "Landroid/content/Context;", "(Lbr/com/jetpack/view/adapters/SavedItemsAdapter;Lbr/com/jetpack/databinding/ViewSavedItemBinding;Landroid/content/Context;)V", "bind", "", "productModel", "Lbr/com/jetpack/data/local/ProductModel;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final br.com.jetpack.databinding.ViewSavedItemBinding binding = null;
        private final android.content.Context context = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        br.com.jetpack.databinding.ViewSavedItemBinding binding, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        br.com.jetpack.data.local.ProductModel productModel) {
        }
    }
}