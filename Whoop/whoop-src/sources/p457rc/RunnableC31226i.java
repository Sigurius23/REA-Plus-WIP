package p457rc;

import java.util.Set;
import p218ic.C18389w;
import p249jc.C21577g;
import p249jc.C21582i0;
import p249jc.C21586l;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rc.i */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC31226i implements Runnable {

    /* JADX INFO: renamed from: w */
    public final C21577g f128602w;

    /* JADX INFO: renamed from: x */
    public final C21586l f128603x;

    /* JADX INFO: renamed from: y */
    public final boolean f128604y;

    /* JADX INFO: renamed from: z */
    public final int f128605z;

    public RunnableC31226i(C21577g processor, C21586l token, boolean z4, int i13) {
        AbstractC22676k.m65750j(processor, "processor");
        AbstractC22676k.m65750j(token, "token");
        this.f128602w = processor;
        this.f128603x = token;
        this.f128604y = z4;
        this.f128605z = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM60618d;
        C21582i0 c21582i0M60620b;
        if (this.f128604y) {
            C21577g c21577g = this.f128602w;
            C21586l c21586l = this.f128603x;
            int i13 = this.f128605z;
            c21577g.getClass();
            String str = c21586l.f82778a.f123603a;
            synchronized (c21577g.f82749k) {
                c21582i0M60620b = c21577g.m60620b(str);
            }
            zM60618d = C21577g.m60618d(str, c21582i0M60620b, i13);
        } else {
            C21577g c21577g2 = this.f128602w;
            C21586l c21586l2 = this.f128603x;
            int i14 = this.f128605z;
            c21577g2.getClass();
            String str2 = c21586l2.f82778a.f123603a;
            synchronized (c21577g2.f82749k) {
                try {
                    if (c21577g2.f82744f.get(str2) != null) {
                        C18389w.m52886d().m52888a(C21577g.f82738l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) c21577g2.f82746h.get(str2);
                        if (set != null && set.contains(c21586l2)) {
                            zM60618d = C21577g.m60618d(str2, c21577g2.m60620b(str2), i14);
                        }
                    }
                    zM60618d = false;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        C18389w.m52886d().m52888a(C18389w.m52887f("StopWorkRunnable"), "StopWorkRunnable for " + this.f128603x.f82778a.f123603a + "; Processor.stopWork = " + zM60618d);
    }
}
