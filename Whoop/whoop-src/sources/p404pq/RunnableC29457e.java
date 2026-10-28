package p404pq;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e73.C12803b;
import p573w5.C36833d;

/* JADX INFO: renamed from: pq.e */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC29457e implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C12803b f119624w;

    public RunnableC29457e(C12803b c12803b) {
        this.f119624w = c12803b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C12803b c12803b = this.f119624w;
        c12803b.f43824b = false;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c12803b.f43825c;
        C36833d c36833d = bottomSheetBehavior.f20785M;
        if (c36833d != null && c36833d.m118076f()) {
            c12803b.m35866i(c12803b.f43826d);
        } else if (bottomSheetBehavior.f20784L == 2) {
            bottomSheetBehavior.m15702X(c12803b.f43826d);
        }
    }
}
