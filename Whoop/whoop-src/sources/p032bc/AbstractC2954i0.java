package p032bc;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: bc.i0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2954i0 {
    /* JADX INFO: renamed from: a */
    public static void m8624a(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    /* JADX INFO: renamed from: b */
    public static void m8625b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* JADX INFO: renamed from: c */
    public static void m8626c(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
