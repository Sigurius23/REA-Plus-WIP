package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.AbstractC1724q1;
import androidx.recyclerview.widget.C1701k2;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.google.android.material.datepicker.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C5015i extends AbstractC1724q1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5019m f20911a;

    public C5015i(C5019m c5019m) {
        this.f20911a = c5019m;
        AbstractC5031y.m15762c(null);
        AbstractC5031y.m15762c(null);
    }

    @Override // androidx.recyclerview.widget.AbstractC1724q1
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C1701k2 c1701k2) {
        if ((recyclerView.getAdapter() instanceof C5007a0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f20911a.getClass();
            throw null;
        }
    }
}
