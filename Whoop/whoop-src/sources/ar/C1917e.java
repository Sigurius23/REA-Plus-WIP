package ar;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: ar.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C1917e implements TypeEvaluator {

    /* JADX INFO: renamed from: a */
    public final float[] f7585a = new float[9];

    /* JADX INFO: renamed from: b */
    public final float[] f7586b = new float[9];

    /* JADX INFO: renamed from: c */
    public final Matrix f7587c = new Matrix();

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC1923k f7588d;

    public C1917e(AbstractC1923k abstractC1923k) {
        this.f7588d = abstractC1923k;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f13, Object obj, Object obj2) {
        this.f7588d.f7632p = f13;
        float[] fArr = this.f7585a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f7586b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i13 = 0; i13 < 9; i13++) {
            float f14 = fArr2[i13];
            float f15 = fArr[i13];
            fArr2[i13] = AbstractC2875y.m8288a(f14, f15, f13, f15);
        }
        Matrix matrix = this.f7587c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
