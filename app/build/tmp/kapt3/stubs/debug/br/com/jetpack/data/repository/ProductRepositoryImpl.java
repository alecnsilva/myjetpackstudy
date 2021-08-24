package br.com.jetpack.data.repository;

import java.lang.System;

/**
 * Created by humbertokalex
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lbr/com/jetpack/data/repository/ProductRepositoryImpl;", "Lbr/com/jetpack/data/repository/ProductRepository;", "dataBase", "Lbr/com/jetpack/data/local/database/DataBase;", "(Lbr/com/jetpack/data/local/database/DataBase;)V", "getProducts", "", "Lbr/com/jetpack/data/local/database/entity/ProductEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedProducts", "Lbr/com/jetpack/data/local/database/entity/SavedProductEntity;", "removeProduct", "", "savedProductEntity", "(Lbr/com/jetpack/data/local/database/entity/SavedProductEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMockProduct", "productEntity", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveProduct", "app_debug"})
public final class ProductRepositoryImpl implements br.com.jetpack.data.repository.ProductRepository {
    private final br.com.jetpack.data.local.database.DataBase dataBase = null;
    
    public ProductRepositoryImpl(@org.jetbrains.annotations.NotNull()
    br.com.jetpack.data.local.database.DataBase dataBase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<br.com.jetpack.data.local.database.entity.ProductEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSavedProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<br.com.jetpack.data.local.database.entity.SavedProductEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveProduct(@org.jetbrains.annotations.NotNull()
    br.com.jetpack.data.local.database.entity.SavedProductEntity savedProductEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removeProduct(@org.jetbrains.annotations.NotNull()
    br.com.jetpack.data.local.database.entity.SavedProductEntity savedProductEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveMockProduct(@org.jetbrains.annotations.NotNull()
    java.util.List<br.com.jetpack.data.local.database.entity.ProductEntity> productEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}