package kr;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: renamed from: kr.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C22799r extends AbstractC22800s {

    /* JADX INFO: renamed from: b */
    public float f89804b;

    /* JADX INFO: renamed from: c */
    public float f89805c;

    @Override // kr.AbstractC22800s
    /* JADX INFO: renamed from: a */
    public final void mo66034a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f89806a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f89804b, this.f89805c);
        path.transform(matrix);
    }
}
