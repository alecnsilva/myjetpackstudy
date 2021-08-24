package br.com.jetpack.data.local.database.converters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lbr/com/jetpack/data/local/database/converters/SavedProductConverter;", "", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "someObjectListToString", "", "someObjects", "", "Lbr/com/jetpack/data/local/database/entity/SavedProductEntity;", "stringToSomeObjectList", "data", "app_debug"})
public final class SavedProductConverter {
    @org.jetbrains.annotations.NotNull()
    private com.google.gson.Gson gson;
    
    public SavedProductConverter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    public final void setGson(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.util.List<br.com.jetpack.data.local.database.entity.SavedProductEntity> stringToSomeObjectList(@org.jetbrains.annotations.Nullable()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String someObjectListToString(@org.jetbrains.annotations.NotNull()
    java.util.List<br.com.jetpack.data.local.database.entity.SavedProductEntity> someObjects) {
        return null;
    }
}