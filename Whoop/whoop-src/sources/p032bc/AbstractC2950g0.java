package p032bc;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: bc.g0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2950g0 {

    /* JADX INFO: renamed from: a */
    public static final C2960l0 f11854a;

    /* JADX INFO: renamed from: b */
    public static final C2939b f11855b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f11854a = new C2962m0();
        } else {
            f11854a = new C2960l0();
        }
        f11855b = new C2939b(Float.class, "translationAlpha", 5);
        new C2939b(Rect.class, "clipBounds", 6);
    }

    /* JADX INFO: renamed from: a */
    public static void m8609a(View view, int i13, int i14, int i15, int i16) {
        f11854a.mo8630o0(view, i13, i14, i15, i16);
    }

    /* JADX INFO: renamed from: b */
    public static void m8610b(View view, int i13) {
        f11854a.mo8629f0(view, i13);
    }
}
