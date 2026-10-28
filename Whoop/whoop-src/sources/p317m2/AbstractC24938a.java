package p317m2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import p208i2.AbstractC17876d;
import p208i2.InterfaceC17915v;

/* JADX INFO: renamed from: m2.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC24938a extends ViewGroup {
    /* JADX INFO: renamed from: a */
    public final void m73091a(InterfaceC17915v interfaceC17915v, View view, long j7) {
        super.drawChild(AbstractC17876d.m51433a(interfaceC17915v), view, j7);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
