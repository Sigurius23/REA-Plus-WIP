package p027b3;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: renamed from: b3.m1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2408m1 implements InterfaceC2398k1 {

    /* JADX INFO: renamed from: a */
    public static final C2408m1 f9463a = new C2408m1();

    @Override // p027b3.InterfaceC2398k1
    /* JADX INFO: renamed from: a */
    public final Rect mo7396a(Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }
}
