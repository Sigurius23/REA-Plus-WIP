package io.sentry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C20453p extends TimerTask {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ ArrayList f76551w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20514r f76552x;

    public C20453p(C20514r c20514r, ArrayList arrayList) {
        this.f76552x = c20514r;
        this.f76551w = arrayList;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C20514r c20514r = this.f76552x;
        if (jCurrentTimeMillis - c20514r.f76870i <= 10) {
            return;
        }
        ArrayList arrayList = this.f76551w;
        arrayList.clear();
        c20514r.f76870i = jCurrentTimeMillis;
        C20422m3 c20422m3 = new C20422m3(c20514r.f76868g.getDateProvider().now().mo56606d());
        Iterator it = c20514r.f76865d.iterator();
        while (it.hasNext()) {
            ((InterfaceC20639z0) it.next()).mo55961b(c20422m3);
        }
        for (C20506q c20506q : c20514r.f76864c.values()) {
            ArrayList arrayList2 = c20506q.f76846a;
            InterfaceC20432n1 interfaceC20432n1 = c20506q.f76847b;
            arrayList2.add(c20422m3);
            if (interfaceC20432n1 != null) {
                if (c20506q.f76849d.f76868g.getDateProvider().now().mo56606d() > TimeUnit.MILLISECONDS.toNanos(30000L) + c20506q.f76848c) {
                    arrayList.add(interfaceC20432n1);
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            c20514r.mo56619e((InterfaceC20432n1) it3.next());
        }
    }
}
