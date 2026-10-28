package p635y2;

import bc3.C2996c2;
import j43.C21317a;
import java.util.concurrent.CancellationException;
import p005a3.AbstractC0201g;
import p005a3.InterfaceC0263w1;
import p026b2.AbstractC2316v;
import p241j3.C21266c;
import p241j3.C21267d;
import p320m5.C25067k;
import p479s4.AbstractC32123d;
import p702ch0.C4626i;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y2.f1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C39092f1 extends AbstractC2316v implements InterfaceC0263w1 {

    /* JADX INFO: renamed from: O */
    public C4626i f168170O;

    /* JADX INFO: renamed from: P */
    public C39141w f168171P;

    /* JADX INFO: renamed from: Q */
    public C21267d f168172Q;

    /* JADX INFO: renamed from: R */
    public C2996c2 f168173R;

    /* JADX INFO: renamed from: S */
    public boolean f168174S;

    /* JADX INFO: renamed from: T */
    public boolean f168175T;

    /* JADX INFO: renamed from: U */
    public C21266c f168176U;

    /* JADX INFO: renamed from: V */
    public C21266c f168177V;

    /* JADX INFO: renamed from: W */
    public final C21317a f168178W = new C21317a(this, 22);

    public C39092f1(C39141w c39141w, C4626i c4626i) {
        this.f168170O = c4626i;
        this.f168171P = c39141w;
    }

    @Override // p005a3.InterfaceC0263w1
    /* JADX INFO: renamed from: C */
    public final void mo796C() {
        m124619Z0();
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        C21267d c21267d = this.f168172Q;
        if (c21267d != null) {
            c21267d.m59678b();
        }
        this.f168172Q = AbstractC32123d.m100028h(this, this.f168178W);
        m124619Z0();
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: Q0 */
    public final void mo286Q0() {
        C21267d c21267d = this.f168172Q;
        if (c21267d != null) {
            c21267d.m59678b();
        }
        m124618Y0();
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: R0 */
    public final void mo7159R0() {
        m124618Y0();
        C2996c2 c2996c2 = this.f168173R;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
        this.f168173R = null;
        this.f168174S = false;
        this.f168176U = null;
        if (!AbstractC22676k.m65745e(this.f168177V, null)) {
            this.f168177V = null;
            C21266c c21266c = this.f168176U;
            if (c21266c != null) {
                m124617X0(c21266c, null);
            }
        }
        this.f168175T = false;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m124617X0(C21266c c21266c, C21266c c21266c2) {
        float fM59676a;
        this.f168176U = c21266c;
        if (c21266c2 != null || this.f168171P == null) {
            if (c21266c2 != null) {
                c21266c.getClass();
                long j7 = c21266c2.f81193a;
                long j13 = c21266c2.f81194b;
                fM59676a = c21266c.m59676a((int) (j7 >> 32), (int) j7, (int) (j13 >> 32), (int) j13);
            } else {
                long j14 = c21266c.f81197e;
                fM59676a = c21266c.m59676a(0, 0, (int) (j14 >> 32), (int) j14);
            }
            boolean z4 = fM59676a > 0.0f || fM59676a == 1.0f;
            if (this.f168175T && z4 == this.f168174S) {
                return;
            }
            this.f168174S = z4;
            this.f168175T = true;
            C2996c2 c2996c2 = this.f168173R;
            if (c2996c2 != null) {
                c2996c2.cancel((CancellationException) null);
            }
            this.f168170O.invoke(Boolean.valueOf(this.f168174S));
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m124618Y0() {
        if (this.f168174S && this.f168175T) {
            C2996c2 c2996c2 = this.f168173R;
            if (c2996c2 != null) {
                c2996c2.cancel((CancellationException) null);
            }
            this.f168174S = false;
            this.f168170O.invoke(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m124619Z0() {
        if (this.f168171P != null) {
            AbstractC0201g.m512l(this, new C25067k(this, 17));
            return;
        }
        if (AbstractC22676k.m65745e(this.f168177V, null)) {
            return;
        }
        this.f168177V = null;
        C21266c c21266c = this.f168176U;
        if (c21266c != null) {
            m124617X0(c21266c, null);
        }
    }
}
