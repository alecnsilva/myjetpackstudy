package br.com.jetpack.view;

import java.lang.System;

/**
 * Created by humbertokalex
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lbr/com/jetpack/view/ProductListViewCommand;", "", "()V", "Error", "GoToDetail", "GoToSavedProduct", "LoadingProducts", "OnBack", "ProductRemoved", "ProductSaved", "ProductsLoaded", "Lbr/com/jetpack/view/ProductListViewCommand$LoadingProducts;", "Lbr/com/jetpack/view/ProductListViewCommand$ProductSaved;", "Lbr/com/jetpack/view/ProductListViewCommand$ProductRemoved;", "Lbr/com/jetpack/view/ProductListViewCommand$OnBack;", "Lbr/com/jetpack/view/ProductListViewCommand$GoToDetail;", "Lbr/com/jetpack/view/ProductListViewCommand$GoToSavedProduct;", "Lbr/com/jetpack/view/ProductListViewCommand$ProductsLoaded;", "Lbr/com/jetpack/view/ProductListViewCommand$Error;", "app_debug"})
public abstract class ProductListViewCommand {
    
    private ProductListViewCommand() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbr/com/jetpack/view/ProductListViewCommand$LoadingProducts;", "Lbr/com/jetpack/view/ProductListViewCommand;", "()V", "app_debug"})
    public static final class LoadingProducts extends br.com.jetpack.view.ProductListViewCommand {
        @org.jetbrains.annotations.NotNull()
        public static final br.com.jetpack.view.ProductListViewCommand.LoadingProducts INSTANCE = null;
        
        private LoadingProducts() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbr/com/jetpack/view/ProductListViewCommand$ProductSaved;", "Lbr/com/jetpack/view/ProductListViewCommand;", "()V", "app_debug"})
    public static final class ProductSaved extends br.com.jetpack.view.ProductListViewCommand {
        @org.jetbrains.annotations.NotNull()
        public static final br.com.jetpack.view.ProductListViewCommand.ProductSaved INSTANCE = null;
        
        private ProductSaved() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbr/com/jetpack/view/ProductListViewCommand$ProductRemoved;", "Lbr/com/jetpack/view/ProductListViewCommand;", "()V", "app_debug"})
    public static final class ProductRemoved extends br.com.jetpack.view.ProductListViewCommand {
        @org.jetbrains.annotations.NotNull()
        public static final br.com.jetpack.view.ProductListViewCommand.ProductRemoved INSTANCE = null;
        
        private ProductRemoved() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbr/com/jetpack/view/ProductListViewCommand$OnBack;", "Lbr/com/jetpack/view/ProductListViewCommand;", "()V", "app_debug"})
    public static final class OnBack extends br.com.jetpack.view.ProductListViewCommand {
        @org.jetbrains.annotations.NotNull()
        public static final br.com.jetpack.view.ProductListViewCommand.OnBack INSTANCE = null;
        
        private OnBack() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbr/com/jetpack/view/ProductListViewCommand$GoToDetail;", "Lbr/com/jetpack/view/ProductListViewCommand;", "()V", "app_debug"})
    public static final class GoToDetail extends br.com.jetpack.view.ProductListViewCommand {
        @org.jetbrains.annotations.NotNull()
        public static final br.com.jetpack.view.ProductListViewCommand.GoToDetail INSTANCE = null;
        
        private GoToDetail() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbr/com/jetpack/view/ProductListViewCommand$GoToSavedProduct;", "Lbr/com/jetpack/view/ProductListViewCommand;", "()V", "app_debug"})
    public static final class GoToSavedProduct extends br.com.jetpack.view.ProductListViewCommand {
        @org.jetbrains.annotations.NotNull()
        public static final br.com.jetpack.view.ProductListViewCommand.GoToSavedProduct INSTANCE = null;
        
        private GoToSavedProduct() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lbr/com/jetpack/view/ProductListViewCommand$ProductsLoaded;", "Lbr/com/jetpack/view/ProductListViewCommand;", "products", "", "Lbr/com/jetpack/data/local/ProductModel;", "(Ljava/util/List;)V", "getProducts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class ProductsLoaded extends br.com.jetpack.view.ProductListViewCommand {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<br.com.jetpack.data.local.ProductModel> products = null;
        
        @org.jetbrains.annotations.NotNull()
        public final br.com.jetpack.view.ProductListViewCommand.ProductsLoaded copy(@org.jetbrains.annotations.NotNull()
        java.util.List<br.com.jetpack.data.local.ProductModel> products) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ProductsLoaded(@org.jetbrains.annotations.NotNull()
        java.util.List<br.com.jetpack.data.local.ProductModel> products) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<br.com.jetpack.data.local.ProductModel> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<br.com.jetpack.data.local.ProductModel> getProducts() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lbr/com/jetpack/view/ProductListViewCommand$Error;", "Lbr/com/jetpack/view/ProductListViewCommand;", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Error extends br.com.jetpack.view.ProductListViewCommand {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String error = null;
        
        @org.jetbrains.annotations.NotNull()
        public final br.com.jetpack.view.ProductListViewCommand.Error copy(@org.jetbrains.annotations.Nullable()
        java.lang.String error) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.Nullable()
        java.lang.String error) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getError() {
            return null;
        }
    }
}