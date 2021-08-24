package br.com.jetpack.data;

import java.lang.System;

/**
 * Created by humbertokalex
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lbr/com/jetpack/data/SafeResponse;", "T", "", "()V", "GenericError", "NetworkError", "Success", "Lbr/com/jetpack/data/SafeResponse$Success;", "Lbr/com/jetpack/data/SafeResponse$GenericError;", "Lbr/com/jetpack/data/SafeResponse$NetworkError;", "app_debug"})
public abstract class SafeResponse<T extends java.lang.Object> {
    
    private SafeResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lbr/com/jetpack/data/SafeResponse$Success;", "T", "Lbr/com/jetpack/data/SafeResponse;", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lbr/com/jetpack/data/SafeResponse$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends br.com.jetpack.data.SafeResponse<T> {
        private final T value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final br.com.jetpack.data.SafeResponse.Success<T> copy(T value) {
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
        
        public Success(T value) {
            super();
        }
        
        public final T component1() {
            return null;
        }
        
        public final T getValue() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u00c6\u0003J*\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lbr/com/jetpack/data/SafeResponse$GenericError;", "Lbr/com/jetpack/data/SafeResponse;", "", "code", "", "error", "Lretrofit2/Response;", "(Ljava/lang/Integer;Lretrofit2/Response;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getError", "()Lretrofit2/Response;", "component1", "component2", "copy", "(Ljava/lang/Integer;Lretrofit2/Response;)Lbr/com/jetpack/data/SafeResponse$GenericError;", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class GenericError extends br.com.jetpack.data.SafeResponse {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer code = null;
        @org.jetbrains.annotations.Nullable()
        private final retrofit2.Response<?> error = null;
        
        @org.jetbrains.annotations.NotNull()
        public final br.com.jetpack.data.SafeResponse.GenericError copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer code, @org.jetbrains.annotations.Nullable()
        retrofit2.Response<?> error) {
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
        
        public GenericError() {
            super();
        }
        
        public GenericError(@org.jetbrains.annotations.Nullable()
        java.lang.Integer code, @org.jetbrains.annotations.Nullable()
        retrofit2.Response<?> error) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCode() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final retrofit2.Response<?> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final retrofit2.Response<?> getError() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lbr/com/jetpack/data/SafeResponse$NetworkError;", "Lbr/com/jetpack/data/SafeResponse;", "", "()V", "app_debug"})
    public static final class NetworkError extends br.com.jetpack.data.SafeResponse {
        @org.jetbrains.annotations.NotNull()
        public static final br.com.jetpack.data.SafeResponse.NetworkError INSTANCE = null;
        
        private NetworkError() {
            super();
        }
    }
}