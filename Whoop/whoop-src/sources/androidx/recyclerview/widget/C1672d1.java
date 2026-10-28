package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.d1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1672d1 extends C1751x0 {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C1676e1 f6634q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1672d1(C1676e1 c1676e1, Context context) {
        super(context);
        this.f6634q = c1676e1;
    }

    @Override // androidx.recyclerview.widget.C1751x0, androidx.recyclerview.widget.AbstractC1697j2
    /* JADX INFO: renamed from: c */
    public final void mo5228c(View view, C1689h2 c1689h2) {
        C1676e1 c1676e1 = this.f6634q;
        int[] iArrM5236b = c1676e1.m5236b(c1676e1.f6640a.getLayoutManager(), view);
        int i13 = iArrM5236b[0];
        int i14 = iArrM5236b[1];
        int iCeil = (int) Math.ceil(((double) mo5230i(Math.max(Math.abs(i13), Math.abs(i14)))) / 0.3356d);
        if (iCeil > 0) {
            c1689h2.f6673a = i13;
            c1689h2.f6674b = i14;
            c1689h2.f6675c = iCeil;
            c1689h2.f6677e = this.f6924j;
            c1689h2.f6678f = true;
        }
    }

    @Override // androidx.recyclerview.widget.C1751x0
    /* JADX INFO: renamed from: h */
    public final float mo5229h(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.C1751x0
    /* JADX INFO: renamed from: i */
    public final int mo5230i(int i13) {
        return Math.min(100, super.mo5230i(i13));
    }
}
