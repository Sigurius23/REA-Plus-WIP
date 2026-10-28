package p032bc;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import p048ce.AbstractC4482w;

/* JADX INFO: renamed from: bc.l0 */
/* JADX INFO: loaded from: classes5.dex */
public class C2960l0 extends AbstractC4482w {

    /* JADX INFO: renamed from: F */
    public static boolean f11869F = true;

    /* JADX INFO: renamed from: G */
    public static boolean f11870G = true;

    /* JADX INFO: renamed from: H */
    public static boolean f11871H = true;

    /* JADX INFO: renamed from: I */
    public static boolean f11872I = true;

    @Override // p048ce.AbstractC4482w
    /* JADX INFO: renamed from: f0 */
    public void mo8629f0(View view, int i13) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo8629f0(view, i13);
        } else if (f11872I) {
            try {
                AbstractC2958k0.m8628a(view, i13);
            } catch (NoSuchMethodError unused) {
                f11872I = false;
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void mo8630o0(View view, int i13, int i14, int i15, int i16) {
        if (f11871H) {
            try {
                AbstractC2956j0.m8627a(view, i13, i14, i15, i16);
            } catch (NoSuchMethodError unused) {
                f11871H = false;
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void mo8631p0(View view, Matrix matrix) {
        if (f11869F) {
            try {
                AbstractC2954i0.m8625b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f11869F = false;
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void mo8632q0(View view, Matrix matrix) {
        if (f11870G) {
            try {
                AbstractC2954i0.m8626c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f11870G = false;
            }
        }
    }
}
