package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX INFO: renamed from: androidx.fragment.app.e2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1290e2 extends Transition.EpicenterCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5594a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Rect f5595b;

    public /* synthetic */ C1290e2(int i13, Rect rect) {
        this.f5594a = i13;
        this.f5595b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        switch (this.f5594a) {
            case 0:
                return this.f5595b;
            default:
                Rect rect = this.f5595b;
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
