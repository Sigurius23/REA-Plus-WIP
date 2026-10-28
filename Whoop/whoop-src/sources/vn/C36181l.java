package vn;

import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import g73.C15556d;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ng3.C26701n;
import p284ko.C22611c0;
import p284ko.C22615e0;
import p284ko.C22631o;
import p284ko.HandlerC22642z;
import p284ko.InterfaceC22625j0;
import p284ko.InterfaceC22626k;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p465rm.AbstractC31515a0;
import p465rm.C31536h0;
import p465rm.C31539i0;
import p465rm.C31545k0;
import p508ty.C34249c;
import p556vm.InterfaceC36141h;
import p589wn.C37394b;
import p589wn.C37395c;
import p589wn.C37396d;
import p589wn.C37397e;
import p589wn.C37399g;
import p589wn.C37401i;
import p589wn.C37402j;
import p589wn.C37405m;
import p690zr.AbstractC41023g0;
import sm.C32713f;
import sn.AbstractC32721a;
import sn.C32745m;
import sn.C32763v;
import sn.C32764v0;
import sn.C32770z;
import sn.InterfaceC32757s;

/* JADX INFO: renamed from: vn.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C36181l extends AbstractC32721a {

    /* JADX INFO: renamed from: h */
    public final InterfaceC36178i f154833h;

    /* JADX INFO: renamed from: i */
    public final C31539i0 f154834i;

    /* JADX INFO: renamed from: j */
    public final C34249c f154835j;

    /* JADX INFO: renamed from: k */
    public final C26701n f154836k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC36141h f154837l;

    /* JADX INFO: renamed from: m */
    public final C15556d f154838m;

    /* JADX INFO: renamed from: n */
    public final boolean f154839n;

    /* JADX INFO: renamed from: o */
    public final int f154840o;

    /* JADX INFO: renamed from: p */
    public final C37395c f154841p;

    /* JADX INFO: renamed from: q */
    public final long f154842q;

    /* JADX INFO: renamed from: r */
    public final C31545k0 f154843r;

    /* JADX INFO: renamed from: s */
    public C31536h0 f154844s;

    /* JADX INFO: renamed from: t */
    public InterfaceC22625j0 f154845t;

    static {
        AbstractC31515a0.m97109a("goog.exo.hls");
    }

    public C36181l(C31545k0 c31545k0, C34249c c34249c, C36172c c36172c, C26701n c26701n, InterfaceC36141h interfaceC36141h, C15556d c15556d, C37395c c37395c, long j7, boolean z4, int i13) {
        C31539i0 c31539i0 = c31545k0.f130206x;
        c31539i0.getClass();
        this.f154834i = c31539i0;
        this.f154843r = c31545k0;
        this.f154844s = c31545k0.f130207y;
        this.f154835j = c34249c;
        this.f154833h = c36172c;
        this.f154836k = c26701n;
        this.f154837l = interfaceC36141h;
        this.f154838m = c15556d;
        this.f154841p = c37395c;
        this.f154842q = j7;
        this.f154839n = z4;
        this.f154840o = i13;
    }

    /* JADX INFO: renamed from: p */
    public static C37397e m115127p(long j7, List list) {
        C37397e c37397e = null;
        for (int i13 = 0; i13 < list.size(); i13++) {
            C37397e c37397e2 = (C37397e) list.get(i13);
            long j13 = c37397e2.f160012E;
            if (j13 > j7 || !c37397e2.f160005L) {
                if (j13 > j7) {
                    break;
                }
            } else {
                c37397e = c37397e2;
            }
        }
        return c37397e;
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: a */
    public final InterfaceC32757s mo102684a(C32763v c32763v, C22631o c22631o, long j7) {
        C32770z c32770z = new C32770z(this.f136027c.f136277c, 0, c32763v);
        C32770z c32770z2 = new C32770z(this.f136028d.f136277c, 0, c32763v);
        InterfaceC22625j0 interfaceC22625j0 = this.f154845t;
        C32713f c32713f = this.f136031g;
        AbstractC24543a.m71574j(c32713f);
        return new C36180k(this.f154833h, this.f154841p, this.f154835j, interfaceC22625j0, this.f154837l, c32770z2, this.f154838m, c32770z, c22631o, this.f154836k, this.f154839n, this.f154840o, c32713f);
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: f */
    public final C31545k0 mo102689f() {
        return this.f154843r;
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: g */
    public final void mo102690g() throws IOException {
        C37395c c37395c = this.f154841p;
        C22611c0 c22611c0 = c37395c.f159993G;
        if (c22611c0 != null) {
            IOException iOException = c22611c0.f88959c;
            if (iOException != null) {
                throw iOException;
            }
            HandlerC22642z handlerC22642z = c22611c0.f88958b;
            if (handlerC22642z != null) {
                int i13 = handlerC22642z.f89089w;
                IOException iOException2 = handlerC22642z.f89092z;
                if (iOException2 != null && handlerC22642z.f89084E > i13) {
                    throw iOException2;
                }
            }
        }
        Uri uri = c37395c.f159997K;
        if (uri != null) {
            C37394b c37394b = (C37394b) c37395c.f160004z.get(uri);
            C22611c0 c22611c1 = c37394b.f159987x;
            IOException iOException3 = c22611c1.f88959c;
            if (iOException3 != null) {
                throw iOException3;
            }
            HandlerC22642z handlerC22642z2 = c22611c1.f88958b;
            if (handlerC22642z2 != null) {
                int i14 = handlerC22642z2.f89089w;
                IOException iOException4 = handlerC22642z2.f89092z;
                if (iOException4 != null && handlerC22642z2.f89084E > i14) {
                    throw iOException4;
                }
            }
            IOException iOException5 = c37394b.f159984J;
            if (iOException5 != null) {
                throw iOException5;
            }
        }
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: i */
    public final void mo102692i(InterfaceC22625j0 interfaceC22625j0) {
        this.f154845t = interfaceC22625j0;
        InterfaceC36141h interfaceC36141h = this.f154837l;
        interfaceC36141h.prepare();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C32713f c32713f = this.f136031g;
        AbstractC24543a.m71574j(c32713f);
        interfaceC36141h.mo114966c(looperMyLooper, c32713f);
        C32770z c32770z = new C32770z(this.f136027c.f136277c, 0, null);
        Uri uri = this.f154834i.f130173a;
        C37395c c37395c = this.f154841p;
        c37395c.getClass();
        c37395c.f159994H = AbstractC24567y.m71680k(null);
        c37395c.f159992F = c32770z;
        c37395c.f159995I = this;
        C22615e0 c22615e0 = new C22615e0(((InterfaceC22626k) c37395c.f160001w.f143660x).createDataSource(), uri, c37395c.f160002x.mo106243c());
        AbstractC24543a.m71573i(c37395c.f159993G == null);
        C22611c0 c22611c0 = new C22611c0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        c37395c.f159993G = c22611c0;
        C15556d c15556d = c37395c.f160003y;
        int i13 = c22615e0.f88963c;
        c22611c0.m65556d(c22615e0, c37395c, c15556d.m43809h(i13));
        c32770z.m102767i(new C32745m(c22615e0.f88962b), i13, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: k */
    public final void mo102694k(InterfaceC32757s interfaceC32757s) {
        C36180k c36180k = (C36180k) interfaceC32757s;
        c36180k.f154830x.f159991E.remove(c36180k);
        for (C36186q c36186q : c36180k.f154825S) {
            if (c36186q.f154886d0) {
                for (C36185p c36185p : c36186q.f154878V) {
                    c36185p.m102736g();
                    C34249c c34249c = c36185p.f136219h;
                    if (c34249c != null) {
                        c34249c.m108304u(c36185p.f136216e);
                        c36185p.f136219h = null;
                        c36185p.f136218g = null;
                    }
                }
            }
            c36186q.f154866J.m65555c(c36186q);
            c36186q.f154874R.removeCallbacksAndMessages(null);
            c36186q.f154890h0 = true;
            c36186q.f154875S.clear();
        }
        c36180k.f154822P = null;
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: m */
    public final void mo102696m() {
        C37395c c37395c = this.f154841p;
        c37395c.f159997K = null;
        c37395c.f159998L = null;
        c37395c.f159996J = null;
        c37395c.f160000N = -9223372036854775807L;
        c37395c.f159993G.m65555c(null);
        c37395c.f159993G = null;
        HashMap map = c37395c.f160004z;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C37394b) it.next()).f159987x.m65555c(null);
        }
        c37395c.f159994H.removeCallbacksAndMessages(null);
        c37395c.f159994H = null;
        map.clear();
        this.f154837l.release();
    }

    /* JADX INFO: renamed from: q */
    public final void m115128q(C37402j c37402j) {
        long j7;
        C32764v0 c32764v0;
        long jM71695z;
        long j13;
        long jM71695z2;
        long j14;
        boolean z4 = c37402j.f160040p;
        boolean z13 = c37402j.f160031g;
        AbstractC41023g0 abstractC41023g0 = c37402j.f160042r;
        long j15 = c37402j.f160045u;
        long jM71695z3 = c37402j.f160029e;
        int i13 = c37402j.f160028d;
        long j16 = c37402j.f160032h;
        long jM71669G = z4 ? AbstractC24567y.m71669G(j16) : -9223372036854775807L;
        long j17 = (i13 == 2 || i13 == 1) ? jM71669G : -9223372036854775807L;
        C37395c c37395c = this.f154841p;
        C37405m c37405m = c37395c.f159996J;
        c37405m.getClass();
        C36172c c36172c = new C36172c();
        new C37396d(c37405m.f160067a, c37405m.f160068b, c37405m.f160058e, c37405m.f160059f, c37405m.f160060g, c37405m.f160061h, c37405m.f160062i, c37405m.f160063j, c37405m.f160064k, c37405m.f160069c, c37405m.f160065l, c37405m.f160066m);
        if (c37395c.f159999M) {
            C37401i c37401i = c37402j.f160046v;
            long j18 = j16 - c37395c.f160000N;
            boolean z14 = c37402j.f160039o;
            long j19 = z14 ? j18 + j15 : -9223372036854775807L;
            if (c37402j.f160040p) {
                int i14 = AbstractC24567y.f95875a;
                long j24 = this.f154842q;
                jM71695z = AbstractC24567y.m71695z(j24 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j24) - (j16 + j15);
            } else {
                jM71695z = 0;
            }
            long j25 = this.f154844s.f130163w;
            if (j25 != -9223372036854775807L) {
                jM71695z2 = AbstractC24567y.m71695z(j25);
            } else {
                if (jM71695z3 != -9223372036854775807L) {
                    j13 = j15 - jM71695z3;
                } else {
                    j13 = c37401i.f160026d;
                    if (j13 == -9223372036854775807L || c37402j.f160038n == -9223372036854775807L) {
                        j13 = c37401i.f160025c;
                        if (j13 == -9223372036854775807L) {
                            j13 = 3 * c37402j.f160037m;
                        }
                    }
                }
                jM71695z2 = j13 + jM71695z;
            }
            long j26 = j15 + jM71695z;
            long jM71678i = AbstractC24567y.m71678i(jM71695z2, jM71695z, j26);
            C31536h0 c31536h0 = this.f154843r.f130207y;
            boolean z15 = c31536h0.f130166z == -3.4028235E38f && c31536h0.f130162E == -3.4028235E38f && c37401i.f160025c == -9223372036854775807L && c37401i.f160026d == -9223372036854775807L;
            long jM71669G2 = AbstractC24567y.m71669G(jM71678i);
            this.f154844s = new C31536h0(jM71669G2, -9223372036854775807L, -9223372036854775807L, z15 ? 1.0f : this.f154844s.f130166z, z15 ? 1.0f : this.f154844s.f130162E);
            if (jM71695z3 == -9223372036854775807L) {
                jM71695z3 = j26 - AbstractC24567y.m71695z(jM71669G2);
            }
            if (z13) {
                j14 = jM71695z3;
            } else {
                C37397e c37397eM115127p = m115127p(jM71695z3, c37402j.f160043s);
                if (c37397eM115127p != null) {
                    j14 = c37397eM115127p.f160012E;
                } else if (abstractC41023g0.isEmpty()) {
                    j14 = 0;
                } else {
                    C37399g c37399g = (C37399g) abstractC41023g0.get(AbstractC24567y.m71672c(abstractC41023g0, Long.valueOf(jM71695z3), true));
                    C37397e c37397eM115127p2 = m115127p(jM71695z3, c37399g.f160011M);
                    j14 = c37397eM115127p2 != null ? c37397eM115127p2.f160012E : c37399g.f160012E;
                }
            }
            c32764v0 = new C32764v0(j17, jM71669G, j19, c37402j.f160045u, j18, j14, true, !z14, i13 == 2 && c37402j.f160030f, c36172c, this.f154843r, this.f154844s);
        } else {
            if (jM71695z3 == -9223372036854775807L || abstractC41023g0.isEmpty()) {
                j7 = 0;
            } else {
                if (!z13 && jM71695z3 != j15) {
                    jM71695z3 = ((C37399g) abstractC41023g0.get(AbstractC24567y.m71672c(abstractC41023g0, Long.valueOf(jM71695z3), true))).f160012E;
                }
                j7 = jM71695z3;
            }
            long j27 = c37402j.f160045u;
            c32764v0 = new C32764v0(j17, jM71669G, j27, j27, 0L, j7, true, false, true, c36172c, this.f154843r, null);
        }
        m102693j(c32764v0);
    }
}
