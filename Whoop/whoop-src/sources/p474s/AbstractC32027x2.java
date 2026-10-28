package p474s;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: s.x2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32027x2 {
    /* JADX INFO: renamed from: a */
    public static void m99582a(View view, Rect rect, Rect rect2) {
        Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
        rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
    }
}
