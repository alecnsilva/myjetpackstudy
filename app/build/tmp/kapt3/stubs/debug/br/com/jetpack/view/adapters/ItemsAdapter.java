package br.com.jetpack.view.adapters;

import java.lang.System;

/**
 * Created by humbertokalex
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u000bH\u0016J\u001c\u0010\u0018\u001a\u00020\f2\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R,\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lbr/com/jetpack/view/adapters/ItemsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbr/com/jetpack/view/adapters/ItemsAdapter$ViewHolder;", "viewModelProduct", "Lbr/com/jetpack/viewmodel/ProductListViewModel;", "items", "", "Lbr/com/jetpack/data/local/ProductModel;", "(Lbr/com/jetpack/viewmodel/ProductListViewModel;Ljava/util/List;)V", "onEditClickListener", "Lkotlin/Function2;", "", "", "getOnEditClickListener", "()Lkotlin/jvm/functions/Function2;", "setOnEditClickListener", "(Lkotlin/jvm/functions/Function2;)V", "onStockLevelMaxListener", "Lkotlin/Function1;", "getOnStockLevelMaxListener", "()Lkotlin/jvm/functions/Function1;", "setOnStockLevelMaxListener", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ItemsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<br.com.jetpack.view.adapters.ItemsAdapter.ViewHolder> {
    private final br.com.jetpack.viewmodel.ProductListViewModel viewModelProduct = null;
    private java.util.List<br.com.jetpack.data.local.ProductModel> items;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super br.com.jetpack.data.local.ProductModel, ? super java.lang.Integer, kotlin.Unit> onEditClickListener;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onStockLevelMaxListener;
    
    public ItemsAdapter(@org.jetbrains.annotations.NotNull()
    br.com.jetpack.viewmodel.ProductListViewModel viewModelProduct, @org.jetbrains.annotations.NotNull()
    java.util.List<br.com.jetpack.data.local.ProductModel> items) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<br.com.jetpack.data.local.ProductModel, java.lang.Integer, kotlin.Unit> getOnEditClickListener() {
        return null;
    }
    
    public final void setOnEditClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super br.com.jetpack.data.local.ProductModel, ? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnStockLevelMaxListener() {
        return null;
    }
    
    public final void setOnStockLevelMaxListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.jetpack.view.adapters.ItemsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    br.com.jetpack.view.adapters.ItemsAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lbr/com/jetpack/view/adapters/ItemsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lbr/com/jetpack/databinding/ViewItemBinding;", "context", "Landroid/content/Context;", "(Lbr/com/jetpack/view/adapters/ItemsAdapter;Lbr/com/jetpack/databinding/ViewItemBinding;Landroid/content/Context;)V", "bind", "", "productModel", "Lbr/com/jetpack/data/local/ProductModel;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final br.com.jetpack.databinding.ViewItemBinding binding = null;
        private final android.content.Context context = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        br.com.jetpack.databinding.ViewItemBinding binding, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        br.com.jetpack.data.local.ProductModel productModel) {
        }
    }
}