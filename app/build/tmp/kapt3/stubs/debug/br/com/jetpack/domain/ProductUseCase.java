package br.com.jetpack.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lbr/com/jetpack/domain/ProductUseCase;", "", "getProducts", "", "Lbr/com/jetpack/data/local/ProductModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedProducts", "initMock", "", "removeProduct", "productModel", "(Lbr/com/jetpack/data/local/ProductModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveProduct", "app_debug"})
public abstract interface ProductUseCase {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<br.com.jetpack.data.local.ProductModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSavedProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<br.com.jetpack.data.local.ProductModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveProduct(@org.jetbrains.annotations.NotNull()
    br.com.jetpack.data.local.ProductModel productModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object removeProduct(@org.jetbrains.annotations.NotNull()
    br.com.jetpack.data.local.ProductModel productModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object initMock(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}