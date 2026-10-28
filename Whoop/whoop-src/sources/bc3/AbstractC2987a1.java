package bc3;

import hc3.AbstractC17167b;
import hc3.C17185r;
import m83.C25258m;

/* JADX INFO: renamed from: bc3.a1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2987a1 extends AbstractC3076z {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f11991z = 0;

    /* JADX INFO: renamed from: w */
    public long f11992w;

    /* JADX INFO: renamed from: x */
    public boolean f11993x;

    /* JADX INFO: renamed from: y */
    public C25258m f11994y;

    /* JADX INFO: renamed from: T */
    public final void m8678T(AbstractC3042o0 abstractC3042o0) {
        C25258m c25258m = this.f11994y;
        if (c25258m == null) {
            c25258m = new C25258m();
            this.f11994y = c25258m;
        }
        c25258m.addLast(abstractC3042o0);
    }

    /* JADX INFO: renamed from: a0 */
    public abstract Thread mo8679a0();

    /* JADX INFO: renamed from: b0 */
    public final void m8680b0(boolean z4) {
        this.f11992w = (z4 ? 4294967296L : 1L) + this.f11992w;
        if (z4) {
            return;
        }
        this.f11993x = true;
    }

    @Override // bc3.AbstractC3076z
    public final AbstractC3076z limitedParallelism(int i13, String str) {
        AbstractC17167b.m48475a(i13);
        return str != null ? new C17185r(this, str) : this;
    }

    /* JADX INFO: renamed from: o0 */
    public abstract long mo8681o0();

    /* JADX INFO: renamed from: p0 */
    public final boolean m8682p0() {
        AbstractC3042o0 abstractC3042o0;
        C25258m c25258m = this.f11994y;
        if (c25258m == null || (abstractC3042o0 = (AbstractC3042o0) c25258m.m74024q()) == null) {
            return false;
        }
        abstractC3042o0.run();
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final void m8683s(boolean z4) {
        long j7 = this.f11992w - (z4 ? 4294967296L : 1L);
        this.f11992w = j7;
        if (j7 <= 0 && this.f11993x) {
            shutdown();
        }
    }

    public abstract void shutdown();

    /* JADX INFO: renamed from: x0 */
    public void mo8684x0(long j7, AbstractRunnableC3071x0 abstractRunnableC3071x0) {
        RunnableC3010g0.f12027H.m8833T0(j7, abstractRunnableC3071x0);
    }
}
