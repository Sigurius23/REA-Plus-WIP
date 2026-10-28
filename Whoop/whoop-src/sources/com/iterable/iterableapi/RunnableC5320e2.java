package com.iterable.iterableapi;

import a00.C0072g;
import java.util.ArrayList;
import java.util.Iterator;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: com.iterable.iterableapi.e2 */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC5320e2 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21681w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0072g f21682x;

    public RunnableC5320e2(C0072g c0072g, C5308b2 c5308b2) {
        this.f21682x = c0072g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21681w) {
            case 0:
                Iterator it = ((ArrayList) this.f21682x.f225z).iterator();
                while (it.hasNext()) {
                    ((C5316d2) it.next()).m16427c();
                }
                break;
            default:
                for (C5301a c5301a : (ArrayList) this.f21682x.f221E) {
                    c5301a.getClass();
                    AbstractC12350b.m34595p("HealthMonitor", "DB Error notified to healthMonitor");
                    c5301a.f21628a = true;
                }
                break;
        }
    }

    public RunnableC5320e2(C0072g c0072g) {
        this.f21682x = c0072g;
    }
}
