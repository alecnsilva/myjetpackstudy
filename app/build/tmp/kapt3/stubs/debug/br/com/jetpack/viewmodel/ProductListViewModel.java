package br.com.jetpack.viewmodel;

import java.lang.System;

/**
 * Created by humbertokalex
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001c\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u0015J\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0017J\f\u0010 \u001a\u00020\u0015*\u00020\tH\u0002R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00060\u000fR\u00020\u0000X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\""}, d2 = {"Lbr/com/jetpack/viewmodel/ProductListViewModel;", "Landroidx/lifecycle/ViewModel;", "useCase", "Lbr/com/jetpack/domain/ProductUseCase;", "dispatcher", "Lkotlin/coroutines/CoroutineContext;", "(Lbr/com/jetpack/domain/ProductUseCase;Lkotlin/coroutines/CoroutineContext;)V", "command", "Landroidx/lifecycle/LiveData;", "Lbr/com/jetpack/view/ProductListViewCommand;", "getCommand", "()Landroidx/lifecycle/LiveData;", "mutableCommand", "Landroidx/lifecycle/MutableLiveData;", "viewLiveData", "Lbr/com/jetpack/viewmodel/ProductListViewModel$ViewLiveData;", "getViewLiveData", "()Lbr/com/jetpack/viewmodel/ProductListViewModel$ViewLiveData;", "setViewLiveData", "(Lbr/com/jetpack/viewmodel/ProductListViewModel$ViewLiveData;)V", "goToDetail", "", "productModel", "Lbr/com/jetpack/data/local/ProductModel;", "goToSavedProducts", "initMock", "Lkotlinx/coroutines/Job;", "loadProducts", "loadSavedProducts", "onBack", "removeProduct", "saveProduct", "run", "ViewLiveData", "app_debug"})
public final class ProductListViewModel extends androidx.lifecycle.ViewModel {
    private final br.com.jetpack.domain.ProductUseCase useCase = null;
    private final kotlin.coroutines.CoroutineContext dispatcher = null;
    private final androidx.lifecycle.MutableLiveData<br.com.jetpack.view.ProductListViewCommand> mutableCommand = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<br.com.jetpack.view.ProductListViewCommand> command = null;
    @org.jetbrains.annotations.NotNull()
    private br.com.jetpack.viewmodel.ProductListViewModel.ViewLiveData viewLiveData;
    
    public ProductListViewModel(@org.jetbrains.annotations.NotNull()
    br.com.jetpack.domain.ProductUseCase useCase, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext dispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<br.com.jetpack.view.ProductListViewCommand> getCommand() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.jetpack.viewmodel.ProductListViewModel.ViewLiveData getViewLiveData() {
        return null;
    }
    
    public final void setViewLiveData(@org.jetbrains.annotations.NotNull()
    br.com.jetpack.viewmodel.ProductListViewModel.ViewLiveData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job initMock() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job loadProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job loadSavedProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveProduct(@org.jetbrains.annotations.NotNull()
    br.com.jetpack.data.local.ProductModel productModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job removeProduct(@org.jetbrains.annotations.NotNull()
    br.com.jetpack.data.local.ProductModel productModel) {
        return null;
    }
    
    public final void goToDetail(@org.jetbrains.annotations.NotNull()
    br.com.jetpack.data.local.ProductModel productModel) {
    }
    
    public final void goToSavedProducts() {
    }
    
    public final void onBack() {
    }
    
    private final void run(br.com.jetpack.view.ProductListViewCommand $this$run) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lbr/com/jetpack/viewmodel/ProductListViewModel$ViewLiveData;", "", "(Lbr/com/jetpack/viewmodel/ProductListViewModel;)V", "productDetailModel", "Landroidx/lifecycle/MutableLiveData;", "Lbr/com/jetpack/data/local/ProductModel;", "getProductDetailModel", "()Landroidx/lifecycle/MutableLiveData;", "app_debug"})
    public final class ViewLiveData {
        @org.jetbrains.annotations.NotNull()
        private final androidx.lifecycle.MutableLiveData<br.com.jetpack.data.local.ProductModel> productDetailModel = null;
        
        public ViewLiveData() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.MutableLiveData<br.com.jetpack.data.local.ProductModel> getProductDetailModel() {
            return null;
        }
    }
}