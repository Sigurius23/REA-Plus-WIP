package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import io.sentry.C20535s;
import io.sentry.EnumC20431n0;
import io.sentry.InterfaceC20441o0;
import java.util.Iterator;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.a */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC20100a implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75506w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20102c f75507x;

    public /* synthetic */ RunnableC20100a(C20102c c20102c, int i13) {
        this.f75506w = i13;
        this.f75507x = c20102c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f75506w) {
            case 0:
                this.f75507x.m55991h();
                return;
            case 1:
                this.f75507x.m55989a0(false);
                return;
            default:
                C20102c c20102c = this.f75507x;
                c20102c.m55990b0(null);
                EnumC20431n0 enumC20431n0M55993m = c20102c.m55993m();
                if (enumC20431n0M55993m == EnumC20431n0.DISCONNECTED) {
                    c20102c.f75522K.set(false);
                    C20535s c20535sM56711a = C20102c.f75512N.m56711a();
                    try {
                        Iterator it = C20102c.f75513O.iterator();
                        while (it.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it.next()).onLost(null);
                        }
                        c20535sM56711a.close();
                    } catch (Throwable th3) {
                        try {
                            c20535sM56711a.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                C20535s c20535sM56711a2 = c20102c.f75517F.m56711a();
                try {
                    Iterator it3 = c20102c.f75516E.iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC20441o0) it3.next()).mo55903b(enumC20431n0M55993m);
                    }
                    c20535sM56711a2.close();
                    c20102c.m55991h();
                    return;
                } catch (Throwable th5) {
                    try {
                        c20535sM56711a2.close();
                        break;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
        }
    }
}
