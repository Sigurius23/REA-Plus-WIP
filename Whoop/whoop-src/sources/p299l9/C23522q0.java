package p299l9;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import e10.C12554k0;
import java.io.IOException;
import p010a9.C0580e;
import p398p9.C28987k;
import p398p9.HandlerC28984h;
import qg3.C30352d;

/* JADX INFO: renamed from: l9.q0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23522q0 implements InterfaceC23540z0 {

    /* JADX INFO: renamed from: w */
    public final int f93106w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C23526s0 f93107x;

    public C23522q0(C23526s0 c23526s0, int i13) {
        this.f93107x = c23526s0;
        this.f93106w = i13;
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: b */
    public final boolean mo36169b() {
        C23526s0 c23526s0 = this.f93107x;
        return !c23526s0.m68100F() && c23526s0.f93133T[this.f93106w].m68132o(c23526s0.f93153n0);
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: c */
    public final void mo36170c() throws IOException {
        int i13 = this.f93106w;
        C23526s0 c23526s0 = this.f93107x;
        C23538y0 c23538y0 = c23526s0.f93133T[i13];
        C12554k0 c12554k0 = c23538y0.f93225h;
        if (c12554k0 != null && c12554k0.m35220G() == 1) {
            DrmSession$DrmSessionException drmSession$DrmSessionExceptionM35217C = c23538y0.f93225h.m35217C();
            drmSession$DrmSessionExceptionM35217C.getClass();
            throw drmSession$DrmSessionExceptionM35217C;
        }
        C28987k c28987k = c23526s0.f93125L;
        int iM60616q = c23526s0.f93158z.m60616q(c23526s0.f93143d0);
        IOException iOException = c28987k.f117259y;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC28984h handlerC28984h = c28987k.f117258x;
        if (handlerC28984h != null) {
            if (iM60616q == Integer.MIN_VALUE) {
                iM60616q = handlerC28984h.f117251w;
            }
            IOException iOException2 = handlerC28984h.f117245E;
            if (iOException2 != null && handlerC28984h.f117246F > iM60616q) {
                throw iOException2;
            }
        }
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: j */
    public final int mo36171j(long j7) {
        C23526s0 c23526s0 = this.f93107x;
        if (c23526s0.m68100F()) {
            return 0;
        }
        int i13 = this.f93106w;
        c23526s0.m68095A(i13);
        C23538y0 c23538y0 = c23526s0.f93133T[i13];
        int iM68131n = c23538y0.m68131n(j7, c23526s0.f93153n0);
        c23538y0.m68139v(iM68131n);
        if (iM68131n == 0) {
            c23526s0.m68096B(i13);
        }
        return iM68131n;
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: l */
    public final int mo36172l(C30352d c30352d, C0580e c0580e, int i13) {
        C23526s0 c23526s0 = this.f93107x;
        if (c23526s0.m68100F()) {
            return -3;
        }
        int i14 = this.f93106w;
        c23526s0.m68095A(i14);
        int iM68135r = c23526s0.f93133T[i14].m68135r(c30352d, c0580e, i13, c23526s0.f93153n0);
        if (iM68135r == -3) {
            c23526s0.m68096B(i14);
        }
        return iM68135r;
    }
}
