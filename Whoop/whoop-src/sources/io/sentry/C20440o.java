package io.sentry;

import io.sentry.android.core.C20160u0;
import java.util.Iterator;
import java.util.TimerTask;

/* JADX INFO: renamed from: io.sentry.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C20440o extends TimerTask {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f76523w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f76524x;

    public /* synthetic */ C20440o(Object obj, int i13) {
        this.f76523w = i13;
        this.f76524x = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f76523w) {
            case 0:
                Iterator it = ((C20514r) this.f76524x).f76865d.iterator();
                while (it.hasNext()) {
                    ((InterfaceC20639z0) it.next()).mo55960a();
                }
                break;
            case 1:
                C20160u0 c20160u0 = (C20160u0) this.f76524x;
                C20371i4 c20371i4 = c20160u0.f75746F;
                if (c20160u0.f75747G) {
                    c20371i4.mo56435o();
                }
                c20371i4.mo56432l().getReplayController().stop();
                c20371i4.mo56432l().getContinuousProfiler().mo55947a(false);
                break;
            default:
                ((Runnable) this.f76524x).run();
                break;
        }
    }
}
