package cr;

import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: renamed from: cr.r */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11080r {
    /* JADX INFO: renamed from: a */
    public static Rect m29876a(WindowManager windowManager) {
        return windowManager.getCurrentWindowMetrics().getBounds();
    }
}
