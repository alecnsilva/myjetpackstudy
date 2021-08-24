package br.com.jetpack.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lbr/com/jetpack/data/repository/ProductRepository;", "", "getProducts", "", "Lbr/com/jetpack/data/local/database/entity/ProductEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedProducts", "Lbr/com/jetpack/data/local/database/entity/SavedProductEntity;", "removeProduct", "", "savedProductEntity", "(Lbr/com/jetpack/data/local/database/entity/SavedProductEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMockProduct", "productEntity", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveProduct", "app_debug"})
public abstract interface ProductRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<br.com.jetpack.data.local.database.entity.ProductEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSavedProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<br.com.jetpack.data.local.database.entity.SavedProductEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveProduct(@org.jetbrains.annotations.NotNull()
    br.com.jetpack.data.local.database.entity.SavedProductEntity savedProductEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object removeProduct(@org.jetbrains.annotations.NotNull()
    br.com.jetpack.data.local.database.entity.SavedProductEntity savedProductEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveMockProduct(@org.jetbrains.annotations.NotNull()
    java.util.List<br.com.jetpack.data.local.database.entity.ProductEntity> productEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}