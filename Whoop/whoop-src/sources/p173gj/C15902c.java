package p173gj;

import p282kk.C22533b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gj.c */
/* JADX INFO: loaded from: classes.dex */
public final class C15902c extends Thread {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f60126w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f60127x;

    public /* synthetic */ C15902c(Object obj, int i13) {
        this.f60126w = i13;
        this.f60127x = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f60126w) {
            case 0:
                C15912m c15912m = ((C15903d) this.f60127x).f60134g;
                AbstractC22676k.m65748h(c15912m, "null cannot be cast to non-null type com.amplitude.android.Timeline");
                c15912m.f60198y.cancel(null);
                break;
            default:
                C22533b c22533b = (C22533b) this.f60127x;
                c22533b.f88565h.cancel(null);
                c22533b.f88564g.cancel(null);
                c22533b.f88566i = false;
                break;
        }
    }
}
