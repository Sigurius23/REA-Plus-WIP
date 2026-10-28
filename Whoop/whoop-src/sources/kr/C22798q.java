package kr;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: kr.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C22798q extends AbstractC22800s {

    /* JADX INFO: renamed from: h */
    public static final RectF f89797h = new RectF();

    /* JADX INFO: renamed from: b */
    public final float f89798b;

    /* JADX INFO: renamed from: c */
    public final float f89799c;

    /* JADX INFO: renamed from: d */
    public final float f89800d;

    /* JADX INFO: renamed from: e */
    public final float f89801e;

    /* JADX INFO: renamed from: f */
    public float f89802f;

    /* JADX INFO: renamed from: g */
    public float f89803g;

    public C22798q(float f13, float f14, float f15, float f16) {
        this.f89798b = f13;
        this.f89799c = f14;
        this.f89800d = f15;
        this.f89801e = f16;
    }

    @Override // kr.AbstractC22800s
    /* JADX INFO: renamed from: a */
    public final void mo66034a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f89806a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f13 = this.f89800d;
        float f14 = this.f89801e;
        RectF rectF = f89797h;
        rectF.set(this.f89798b, this.f89799c, f13, f14);
        path.arcTo(rectF, this.f89802f, this.f89803g, false);
        path.transform(matrix);
    }
}
