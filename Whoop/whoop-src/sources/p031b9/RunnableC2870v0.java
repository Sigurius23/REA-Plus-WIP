package p031b9;

import android.util.Pair;
import p047c9.C4317h;
import p299l9.C23488c0;
import p299l9.C23527t;
import p299l9.C23537y;

/* JADX INFO: renamed from: b9.v0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC2870v0 implements Runnable {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C23537y f11408E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11409w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2876y0 f11410x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Pair f11411y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C23527t f11412z;

    public /* synthetic */ RunnableC2870v0(C2876y0 c2876y0, Pair pair, C23527t c23527t, C23537y c23537y, int i13) {
        this.f11409w = i13;
        this.f11410x = c2876y0;
        this.f11411y = pair;
        this.f11412z = c23527t;
        this.f11408E = c23537y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11409w) {
            case 0:
                C4317h c4317h = (C4317h) this.f11410x.f11431x.f11037j;
                Pair pair = this.f11411y;
                c4317h.mo8316c(((Integer) pair.first).intValue(), (C23488c0) pair.second, this.f11412z, this.f11408E);
                break;
            default:
                C4317h c4317h2 = (C4317h) this.f11410x.f11431x.f11037j;
                Pair pair2 = this.f11411y;
                c4317h2.mo8314a(((Integer) pair2.first).intValue(), (C23488c0) pair2.second, this.f11412z, this.f11408E);
                break;
        }
    }
}
