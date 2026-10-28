package io.sentry.android.replay.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import io.sentry.android.replay.viewhierarchy.AbstractC20252g;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import l83.EnumC23463i;
import m83.C25271y;
import p021av.C2088b;
import p043c4.C3967k;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: io.sentry.android.replay.util.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20235c implements Closeable {

    /* JADX INFO: renamed from: w */
    public final Object f76019w;

    /* JADX INFO: renamed from: x */
    public final Object f76020x;

    /* JADX INFO: renamed from: y */
    public final Object f76021y;

    public C20235c() {
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.f76019w = AbstractC30060g.m92087G(enumC23463i, C20234b.f76016x);
        this.f76020x = AbstractC30060g.m92087G(enumC23463i, new C2088b(this, 26));
        this.f76021y = AbstractC30060g.m92087G(enumC23463i, C20234b.f76017y);
    }

    /* JADX INFO: renamed from: b */
    public final List m56153b(Bitmap bitmap, AbstractC20252g abstractC20252g, Matrix matrix) {
        AbstractC22676k.m65750j(bitmap, "bitmap");
        if (bitmap.isRecycled()) {
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        Canvas canvas = new Canvas(bitmap);
        if (matrix != null) {
            canvas.setMatrix(matrix);
        }
        abstractC20252g.m56178a(new C3967k(this, bitmap, matrix, arrayList, canvas, 2));
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l83.h] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ?? r10 = this.f76019w;
        if (!r10.mo5046b() || ((Bitmap) r10.getValue()).isRecycled()) {
            return;
        }
        ((Bitmap) r10.getValue()).recycle();
    }
}
