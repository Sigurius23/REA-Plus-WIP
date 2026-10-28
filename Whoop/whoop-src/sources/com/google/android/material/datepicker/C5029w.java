package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C1751x0;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: com.google.android.material.datepicker.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C5029w extends C1751x0 {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int f20980q = 0;

    public /* synthetic */ C5029w(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.AbstractC1697j2
    /* JADX INFO: renamed from: a */
    public PointF mo5272a(int i13) {
        switch (this.f20980q) {
            case 1:
                return null;
            default:
                return super.mo5272a(i13);
        }
    }

    @Override // androidx.recyclerview.widget.C1751x0
    /* JADX INFO: renamed from: f */
    public int mo5345f(View view, int i13) {
        switch (this.f20980q) {
            case 1:
                return 0;
            default:
                return super.mo5345f(view, i13);
        }
    }

    @Override // androidx.recyclerview.widget.C1751x0
    /* JADX INFO: renamed from: g */
    public int mo5346g(View view, int i13) {
        switch (this.f20980q) {
            case 1:
                return 0;
            default:
                return super.mo5346g(view, i13);
        }
    }

    @Override // androidx.recyclerview.widget.C1751x0
    /* JADX INFO: renamed from: h */
    public float mo5229h(DisplayMetrics displayMetrics) {
        switch (this.f20980q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.mo5229h(displayMetrics);
        }
    }

    public C5029w(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
