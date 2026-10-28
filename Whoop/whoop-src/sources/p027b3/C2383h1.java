package p027b3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import p005a3.C0230n0;
import p028b4.AbstractC2701l;
import p603x2.AbstractC37831a;

/* JADX INFO: renamed from: b3.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2383h1 extends ViewGroup {

    /* JADX INFO: renamed from: w */
    public final HashMap f9431w;

    /* JADX INFO: renamed from: x */
    public final HashMap f9432x;

    public C2383h1(Context context) {
        super(context);
        setClipChildren(false);
        this.f9431w = new HashMap();
        this.f9432x = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AbstractC2701l, C0230n0> getHolderToLayoutNode() {
        return this.f9431w;
    }

    public final HashMap<C0230n0, AbstractC2701l> getLayoutNodeToHolder() {
        return this.f9432x;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        for (AbstractC2701l abstractC2701l : this.f9431w.keySet()) {
            abstractC2701l.layout(abstractC2701l.getLeft(), abstractC2701l.getTop(), abstractC2701l.getRight(), abstractC2701l.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        if (!(View.MeasureSpec.getMode(i13) == 1073741824)) {
            AbstractC37831a.m121373a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i14) == 1073741824)) {
            AbstractC37831a.m121373a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i13), View.MeasureSpec.getSize(i14));
        for (AbstractC2701l abstractC2701l : this.f9431w.keySet()) {
            int i16 = abstractC2701l.f10637U;
            if (i16 != Integer.MIN_VALUE && (i15 = abstractC2701l.f10638V) != Integer.MIN_VALUE) {
                abstractC2701l.measure(i16, i15);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            C0230n0 c0230n0 = (C0230n0) this.f9431w.get(childAt);
            if (childAt.isLayoutRequested() && c0230n0 != null) {
                C0230n0.m575v0(c0230n0, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
