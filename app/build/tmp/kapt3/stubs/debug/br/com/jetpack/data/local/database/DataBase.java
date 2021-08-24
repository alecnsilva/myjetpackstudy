package br.com.jetpack.data.local.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {br.com.jetpack.data.local.database.converters.ProductConverter.class, br.com.jetpack.data.local.database.converters.SavedProductConverter.class})
@androidx.room.Database(entities = {br.com.jetpack.data.local.database.entity.ProductEntity.class, br.com.jetpack.data.local.database.entity.SavedProductEntity.class}, version = 3, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lbr/com/jetpack/data/local/database/DataBase;", "Landroidx/room/RoomDatabase;", "()V", "productDao", "Lbr/com/jetpack/data/local/database/dao/ProductDao;", "app_debug"})
public abstract class DataBase extends androidx.room.RoomDatabase {
    
    public DataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.com.jetpack.data.local.database.dao.ProductDao productDao();
}