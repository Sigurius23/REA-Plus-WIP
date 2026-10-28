package p668z1;

import p602x1.C37815a;

/* JADX INFO: renamed from: z1.a0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC39948a0 implements InterfaceC39977z {

    /* JADX INFO: renamed from: w */
    public final C37815a f172408w = new C37815a(0);

    /* JADX INFO: renamed from: k */
    public final boolean m128128k(int i13) {
        return (i13 & this.f172408w.get()) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final void m128129s(int i13) {
        C37815a c37815a;
        int i14;
        do {
            c37815a = this.f172408w;
            i14 = c37815a.get();
            if ((i14 & i13) != 0) {
                return;
            }
        } while (!c37815a.compareAndSet(i14, i14 | i13));
    }
}
