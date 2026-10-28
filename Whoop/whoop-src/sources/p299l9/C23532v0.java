package p299l9;

import android.net.Uri;
import android.os.Looper;
import com.whoop.data.repositories.C6656c;
import e10.C12554k0;
import gm.C15990r;
import p047c9.C4323n;
import p171g9.C15587d;
import p171g9.InterfaceC15591h;
import p249jc.C21567b;
import p284ko.C22631o;
import p499t9.InterfaceC33627e0;
import p499t9.InterfaceC33649r;
import p516u8.AbstractC34609o0;
import p516u8.C34610p;
import p516u8.C34620u;
import p516u8.C34626x;
import p607x8.AbstractC38065t;
import p674z8.InterfaceC40169e;
import p674z8.InterfaceC40170f;
import p674z8.InterfaceC40178n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: l9.v0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23532v0 extends AbstractC23481a {

    /* JADX INFO: renamed from: h */
    public final InterfaceC40169e f93175h;

    /* JADX INFO: renamed from: i */
    public final C6656c f93176i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC15591h f93177j;

    /* JADX INFO: renamed from: k */
    public final C21567b f93178k;

    /* JADX INFO: renamed from: l */
    public final int f93179l;

    /* JADX INFO: renamed from: m */
    public final C34610p f93180m;

    /* JADX INFO: renamed from: n */
    public boolean f93181n = true;

    /* JADX INFO: renamed from: o */
    public long f93182o = -9223372036854775807L;

    /* JADX INFO: renamed from: p */
    public boolean f93183p;

    /* JADX INFO: renamed from: q */
    public boolean f93184q;

    /* JADX INFO: renamed from: r */
    public InterfaceC40178n f93185r;

    /* JADX INFO: renamed from: s */
    public C34626x f93186s;

    public C23532v0(C34626x c34626x, InterfaceC40169e interfaceC40169e, C6656c c6656c, InterfaceC15591h interfaceC15591h, C21567b c21567b, int i13, C34610p c34610p) {
        this.f93186s = c34626x;
        this.f93175h = interfaceC40169e;
        this.f93176i = c6656c;
        this.f93177j = interfaceC15591h;
        this.f93178k = c21567b;
        this.f93179l = i13;
        this.f93180m = c34610p;
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: a */
    public final InterfaceC23482a0 mo36144a(C23488c0 c23488c0, C22631o c22631o, long j7) {
        InterfaceC40170f interfaceC40170fCreateDataSource = this.f93175h.createDataSource();
        InterfaceC40178n interfaceC40178n = this.f93185r;
        if (interfaceC40178n != null) {
            interfaceC40170fCreateDataSource.addTransferListener(interfaceC40178n);
        }
        C34620u c34620u = mo36145g().f145867b;
        c34620u.getClass();
        Uri uri = c34620u.f145852a;
        AbstractC35849g.m113808j(this.f92965g);
        int i13 = 0;
        return new C23526s0(uri, interfaceC40170fCreateDataSource, new C15990r((InterfaceC33649r) this.f93176i.f25446x), this.f93177j, new C15587d(this.f92962d.f58539c, i13, c23488c0), this.f93178k, new C15587d(this.f92961c.f58539c, i13, c23488c0), this, c22631o, this.f93179l, this.f93180m, AbstractC38065t.m121896J(c34620u.f145856e), null);
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: g */
    public final synchronized C34626x mo36145g() {
        return this.f93186s;
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: i */
    public final void mo36146i() {
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: k */
    public final void mo36147k(InterfaceC40178n interfaceC40178n) {
        this.f93185r = interfaceC40178n;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C4323n c4323n = this.f92965g;
        AbstractC35849g.m113808j(c4323n);
        InterfaceC15591h interfaceC15591h = this.f93177j;
        interfaceC15591h.mo43890b(looperMyLooper, c4323n);
        interfaceC15591h.prepare();
        m68108s();
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: m */
    public final void mo36148m(InterfaceC23482a0 interfaceC23482a0) {
        C23526s0 c23526s0 = (C23526s0) interfaceC23482a0;
        if (c23526s0.f93136W) {
            for (C23538y0 c23538y0 : c23526s0.f93133T) {
                c23538y0.m68124g();
                C12554k0 c12554k0 = c23538y0.f93225h;
                if (c12554k0 != null) {
                    c12554k0.m35222K(c23538y0.f93222e);
                    c23538y0.f93225h = null;
                    c23538y0.f93224g = null;
                }
            }
        }
        c23526s0.f93125L.m88008b(c23526s0);
        c23526s0.f93130Q.removeCallbacksAndMessages(null);
        c23526s0.f93131R = null;
        c23526s0.f93154o0 = true;
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: o */
    public final void mo36149o() {
        this.f93177j.release();
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: r */
    public final synchronized void mo36150r(C34626x c34626x) {
        this.f93186s = c34626x;
    }

    /* JADX INFO: renamed from: s */
    public final void m68108s() {
        AbstractC34609o0 c23492d1 = new C23492d1(this.f93182o, this.f93183p, this.f93184q, mo36145g());
        if (this.f93181n) {
            c23492d1 = new C23528t0(c23492d1);
        }
        m68048l(c23492d1);
    }

    /* JADX INFO: renamed from: t */
    public final void m68109t(long j7, InterfaceC33627e0 interfaceC33627e0, boolean z4) {
        if (j7 == -9223372036854775807L) {
            j7 = this.f93182o;
        }
        boolean zMo8509e = interfaceC33627e0.mo8509e();
        if (!this.f93181n && this.f93182o == j7 && this.f93183p == zMo8509e && this.f93184q == z4) {
            return;
        }
        this.f93182o = j7;
        this.f93183p = zMo8509e;
        this.f93184q = z4;
        this.f93181n = false;
        m68108s();
    }
}
