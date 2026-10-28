package androidx.room;

import androidx.lifecycle.C1578e1;
import bc3.AbstractC3006f0;
import bc3.C3033m;
import q83.C30058e;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: androidx.room.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1764a1 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C3033m f6951w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC1848z0 f6952x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1768b1 f6953y;

    public RunnableC1764a1(C3033m c3033m, AbstractC1848z0 abstractC1848z0, C1768b1 c1768b1) {
        this.f6951w = c3033m;
        this.f6952x = abstractC1848z0;
        this.f6953y = c1768b1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3033m c3033m = this.f6951w;
        try {
            AbstractC3006f0.m8699E(c3033m.f12054E.minusKey(C30058e.f122675w), new C1578e1(this.f6952x, c3033m, this.f6953y, (InterfaceC30057d) null, 1));
        } catch (Throwable th3) {
            c3033m.cancel(th3);
        }
    }
}
