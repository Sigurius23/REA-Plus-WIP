package p027b3;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import p208i2.AbstractC17918w0;

/* JADX INFO: renamed from: b3.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2423p1 implements InterfaceC2418o1 {

    /* JADX INFO: renamed from: w */
    public final Matrix f9509w = new Matrix();

    /* JADX INFO: renamed from: x */
    public final int[] f9510x = new int[2];

    @Override // p027b3.InterfaceC2418o1
    /* JADX INFO: renamed from: h */
    public void mo7425h(View view, float[] fArr) {
        Matrix matrix = this.f9509w;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f9510x;
        view.getLocationOnScreen(iArr);
        int i13 = iArr[0];
        int i14 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i13, iArr[1] - i14);
        AbstractC17918w0.m51500B(matrix, fArr);
    }
}
