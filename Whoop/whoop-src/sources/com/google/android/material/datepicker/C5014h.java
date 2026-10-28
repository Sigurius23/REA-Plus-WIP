package com.google.android.material.datepicker;

import androidx.recyclerview.widget.C1701k2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.google.android.material.datepicker.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C5014h extends LinearLayoutManager {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20909a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5019m f20910b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5014h(C5019m c5019m, int i13, int i14) {
        super(i13);
        this.f20910b = c5019m;
        this.f20909a = i14;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(C1701k2 c1701k2, int[] iArr) {
        int i13 = this.f20909a;
        C5019m c5019m = this.f20910b;
        if (i13 == 0) {
            iArr[0] = c5019m.f20922H.getWidth();
            iArr[1] = c5019m.f20922H.getWidth();
        } else {
            iArr[0] = c5019m.f20922H.getHeight();
            iArr[1] = c5019m.f20922H.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1740u1
    public final void smoothScrollToPosition(RecyclerView recyclerView, C1701k2 c1701k2, int i13) {
        C5029w c5029w = new C5029w(recyclerView.getContext());
        c5029w.f6707a = i13;
        startSmoothScroll(c5029w);
    }
}
