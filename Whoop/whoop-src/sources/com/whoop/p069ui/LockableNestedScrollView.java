package com.whoop.p069ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u000eR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/ui/LockableNestedScrollView;", "Landroidx/core/widget/NestedScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "value", "Ll83/a0;", "setLock", "(Z)V", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "j0", "Z", "getLocked", "()Z", "setLocked", "locked", "Landroid/view/GestureDetector;", "k0", "Landroid/view/GestureDetector;", "gestureDetector", "a", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LockableNestedScrollView extends NestedScrollView {

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    private boolean locked;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    private final GestureDetector gestureDetector;

    /* JADX INFO: renamed from: com.whoop.ui.LockableNestedScrollView$a */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lcom/whoop/ui/LockableNestedScrollView$a;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "<init>", "()V", "Landroid/view/MotionEvent;", "e1", "e2", "", "distanceX", "distanceY", "", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10448a extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e5, MotionEvent e13, float distanceX, float distanceY) {
            AbstractC22676k.m65750j(e13, "e2");
            return Math.abs(distanceY) > Math.abs(distanceX);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LockableNestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC22676k.m65750j(context, "context");
    }

    public final boolean getLocked() {
        return this.locked;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev3) {
        AbstractC22676k.m65750j(ev3, "ev");
        return (this.locked || !super.onInterceptTouchEvent(ev3) || this.gestureDetector.onTouchEvent(ev3)) ? false : true;
    }

    public final void setLock(boolean value) {
        this.locked = value;
    }

    public final void setLocked(boolean z4) {
        this.locked = z4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockableNestedScrollView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.gestureDetector = new GestureDetector(getContext(), new C10448a());
        setFadingEdgeLength(0);
    }

    public /* synthetic */ LockableNestedScrollView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
