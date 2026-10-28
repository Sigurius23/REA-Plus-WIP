package io.sentry.transport;

import java.util.Iterator;
import java.util.TimerTask;

/* JADX INFO: renamed from: io.sentry.transport.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C20565o extends TimerTask {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C20567q f77041w;

    public C20565o(C20567q c20567q) {
        this.f77041w = c20567q;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C20567q c20567q = this.f77041w;
        Iterator it = c20567q.f77047z.iterator();
        while (it.hasNext()) {
            ((InterfaceC20566p) it.next()).mo55955k(c20567q);
        }
    }
}
