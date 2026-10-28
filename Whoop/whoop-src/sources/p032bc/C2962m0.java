package p032bc;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: bc.m0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2962m0 extends C2960l0 {
    @Override // p048ce.AbstractC4482w
    /* JADX INFO: renamed from: S */
    public final float mo8633S(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p048ce.AbstractC4482w
    /* JADX INFO: renamed from: e0 */
    public final void mo8634e0(View view, float f13) {
        view.setTransitionAlpha(f13);
    }

    @Override // p032bc.C2960l0, p048ce.AbstractC4482w
    /* JADX INFO: renamed from: f0 */
    public final void mo8629f0(View view, int i13) {
        view.setTransitionVisibility(i13);
    }

    @Override // p032bc.C2960l0
    /* JADX INFO: renamed from: o0 */
    public final void mo8630o0(View view, int i13, int i14, int i15, int i16) {
        view.setLeftTopRightBottom(i13, i14, i15, i16);
    }

    @Override // p032bc.C2960l0
    /* JADX INFO: renamed from: p0 */
    public final void mo8631p0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p032bc.C2960l0
    /* JADX INFO: renamed from: q0 */
    public final void mo8632q0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
