package br.com.jetpack.domain;

import java.lang.System;

/**
 * Created by humbertokalex
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lbr/com/jetpack/domain/ProductUseCaseImpl;", "Lbr/com/jetpack/domain/ProductUseCase;", "repository", "Lbr/com/jetpack/data/repository/ProductRepository;", "(Lbr/com/jetpack/data/repository/ProductRepository;)V", "getProducts", "", "Lbr/com/jetpack/data/local/ProductModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedProducts", "initMock", "", "removeProduct", "productModel", "(Lbr/com/jetpack/data/local/ProductModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveProduct", "app_debug"})
public final class ProductUseCaseImpl implements br.com.jetpack.domain.ProductUseCase {
    private final br.com.jetpack.data.repository.ProductRepository repository = null;
    
    public ProductUseCaseImpl(@org.jetbrains.annotations.NotNull()
    br.com.jetpack.data.repository.ProductRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<br.com.jetpack.data.local.ProductModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSavedProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<br.com.jetpack.data.local.ProductModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveProduct(@org.jetbrains.annotations.NotNull()
    br.com.jetpack.data.local.ProductModel productModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removeProduct(@org.jetbrains.annotations.NotNull()
    br.com.jetpack.data.local.ProductModel productModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object initMock(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}