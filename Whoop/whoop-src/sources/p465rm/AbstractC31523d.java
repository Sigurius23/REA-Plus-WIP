package p465rm;

import com.google.android.exoplayer2.ExoPlaybackException;
import p309lo.AbstractC24543a;
import p309lo.InterfaceC24554l;
import p527um.C35073c;
import p619xl.C38445a;
import sm.C32713f;
import sn.InterfaceC32756r0;

/* JADX INFO: renamed from: rm.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC31523d implements InterfaceC31522c1 {

    /* JADX INFO: renamed from: E */
    public C32713f f130102E;

    /* JADX INFO: renamed from: F */
    public int f130103F;

    /* JADX INFO: renamed from: G */
    public InterfaceC32756r0 f130104G;

    /* JADX INFO: renamed from: H */
    public C31521c0[] f130105H;

    /* JADX INFO: renamed from: I */
    public long f130106I;

    /* JADX INFO: renamed from: K */
    public boolean f130108K;

    /* JADX INFO: renamed from: L */
    public boolean f130109L;

    /* JADX INFO: renamed from: w */
    public final int f130110w;

    /* JADX INFO: renamed from: y */
    public C31534g1 f130112y;

    /* JADX INFO: renamed from: z */
    public int f130113z;

    /* JADX INFO: renamed from: x */
    public final C38445a f130111x = new C38445a(29, false);

    /* JADX INFO: renamed from: J */
    public long f130107J = Long.MIN_VALUE;

    public AbstractC31523d(int i13) {
        this.f130110w = i13;
    }

    /* JADX INFO: renamed from: d */
    public static int m97116d(int i13, int i14, int i15) {
        return i13 | i14 | i15 | 128;
    }

    @Override // p465rm.InterfaceC31522c1
    /* JADX INFO: renamed from: a */
    public void mo75855a(int i13, Object obj) {
    }

    /* JADX INFO: renamed from: e */
    public final ExoPlaybackException m97117e(Exception exc, C31521c0 c31521c0, boolean z4, int i13) {
        int iMo49746x;
        if (c31521c0 == null || this.f130109L) {
            iMo49746x = 4;
        } else {
            this.f130109L = true;
            try {
                iMo49746x = mo49746x(c31521c0) & 7;
                this.f130109L = false;
            } catch (ExoPlaybackException unused) {
                this.f130109L = false;
                iMo49746x = 4;
            } catch (Throwable th3) {
                this.f130109L = false;
                throw th3;
            }
        }
        return new ExoPlaybackException(1, exc, i13, mo54420h(), this.f130113z, c31521c0, c31521c0 == null ? 4 : iMo49746x, z4);
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC24554l mo97118g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public abstract String mo54420h();

    /* JADX INFO: renamed from: i */
    public final boolean m97119i() {
        return this.f130107J == Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo49735j();

    /* JADX INFO: renamed from: k */
    public abstract boolean mo49737k();

    /* JADX INFO: renamed from: l */
    public abstract void mo54421l();

    /* JADX INFO: renamed from: m */
    public void mo75856m(boolean z4, boolean z13) {
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo49741n(long j7, boolean z4);

    /* JADX INFO: renamed from: o */
    public void mo75857o() {
    }

    /* JADX INFO: renamed from: p */
    public void mo75859p() {
    }

    /* JADX INFO: renamed from: q */
    public void mo75860q() {
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo49743r(C31521c0[] c31521c0Arr, long j7, long j13);

    /* JADX INFO: renamed from: s */
    public final int m97120s(C38445a c38445a, C35073c c35073c, int i13) {
        InterfaceC32756r0 interfaceC32756r0 = this.f130104G;
        interfaceC32756r0.getClass();
        int iMo79415e = interfaceC32756r0.mo79415e(c38445a, c35073c, i13);
        if (iMo79415e == -4) {
            if (c35073c.m1496f(4)) {
                this.f130107J = Long.MIN_VALUE;
                return this.f130108K ? -4 : -3;
            }
            long j7 = c35073c.f148797F + this.f130106I;
            c35073c.f148797F = j7;
            this.f130107J = Math.max(this.f130107J, j7);
            return iMo79415e;
        }
        if (iMo79415e == -5) {
            C31521c0 c31521c0 = (C31521c0) c38445a.f164637y;
            c31521c0.getClass();
            long j13 = c31521c0.f130081P;
            if (j13 != Long.MAX_VALUE) {
                C31518b0 c31518b0M97113a = c31521c0.m97113a();
                c31518b0M97113a.f130051o = j13 + this.f130106I;
                c38445a.f164637y = new C31521c0(c31518b0M97113a);
            }
        }
        return iMo79415e;
    }

    /* JADX INFO: renamed from: t */
    public abstract void mo49744t(long j7, long j13);

    /* JADX INFO: renamed from: u */
    public final void m97121u(C31521c0[] c31521c0Arr, InterfaceC32756r0 interfaceC32756r0, long j7, long j13) {
        AbstractC24543a.m71573i(!this.f130108K);
        this.f130104G = interfaceC32756r0;
        if (this.f130107J == Long.MIN_VALUE) {
            this.f130107J = j7;
        }
        this.f130105H = c31521c0Arr;
        this.f130106I = j13;
        mo49743r(c31521c0Arr, j7, j13);
    }

    /* JADX INFO: renamed from: v */
    public final void m97122v() {
        AbstractC24543a.m71573i(this.f130103F == 0);
        this.f130111x.m123175j();
        mo75857o();
    }

    /* JADX INFO: renamed from: w */
    public void mo49745w(float f13, float f14) {
    }

    /* JADX INFO: renamed from: x */
    public abstract int mo49746x(C31521c0 c31521c0);

    /* JADX INFO: renamed from: y */
    public int mo49747y() {
        return 0;
    }
}
