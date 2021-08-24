package br.com.jetpack.view.component;

import java.lang.System;

/**
 * Created by humbertokalex
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\tJ\b\u0010\u001a\u001a\u00020\rH\u0002R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lbr/com/jetpack/view/component/ItemAmountButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onAmountChangeListener", "Lkotlin/Function1;", "", "getOnAmountChangeListener", "()Lkotlin/jvm/functions/Function1;", "setOnAmountChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "onStockLevelMaxListener", "Lkotlin/Function0;", "getOnStockLevelMaxListener", "()Lkotlin/jvm/functions/Function0;", "setOnStockLevelMaxListener", "(Lkotlin/jvm/functions/Function0;)V", "stockLevel", "setStockLevel", "setupClicks", "Companion", "app_debug"})
public final class ItemAmountButton extends androidx.constraintlayout.widget.ConstraintLayout {
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onAmountChangeListener;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onStockLevelMaxListener;
    private int stockLevel = 0;
    @org.jetbrains.annotations.NotNull()
    private static final br.com.jetpack.view.component.ItemAmountButton.Companion Companion = null;
    @java.lang.Deprecated()
    private static final int MIN_VALUE = 1;
    @java.lang.Deprecated()
    private static final int INCREASE_AMOUNT = 1;
    private java.util.HashMap _$_findViewCache;
    
    public ItemAmountButton(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public ItemAmountButton(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ItemAmountButton(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnAmountChangeListener() {
        return null;
    }
    
    public final void setOnAmountChangeListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnStockLevelMaxListener() {
        return null;
    }
    
    public final void setOnStockLevelMaxListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    private final void setupClicks() {
    }
    
    public final void setStockLevel(int stockLevel) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lbr/com/jetpack/view/component/ItemAmountButton$Companion;", "", "()V", "INCREASE_AMOUNT", "", "MIN_VALUE", "app_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}