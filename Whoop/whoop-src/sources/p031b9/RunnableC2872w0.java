package p031b9;

import android.util.Pair;
import p047c9.C4317h;
import p299l9.C23488c0;
import p299l9.C23537y;

/* JADX INFO: renamed from: b9.w0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC2872w0 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11415w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2876y0 f11416x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Pair f11417y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C23537y f11418z;

    public /* synthetic */ RunnableC2872w0(C2876y0 c2876y0, Pair pair, C23537y c23537y, int i13) {
        this.f11415w = i13;
        this.f11416x = c2876y0;
        this.f11417y = pair;
        this.f11418z = c23537y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11415w) {
            case 0:
                C4317h c4317h = (C4317h) this.f11416x.f11431x.f11037j;
                Pair pair = this.f11417y;
                c4317h.mo8317d(((Integer) pair.first).intValue(), (C23488c0) pair.second, this.f11418z);
                break;
            default:
                C4317h c4317h2 = (C4317h) this.f11416x.f11431x.f11037j;
                Pair pair2 = this.f11417y;
                int iIntValue = ((Integer) pair2.first).intValue();
                C23488c0 c23488c0 = (C23488c0) pair2.second;
                c23488c0.getClass();
                c4317h2.mo8318e(iIntValue, c23488c0, this.f11418z);
                break;
        }
    }
}
