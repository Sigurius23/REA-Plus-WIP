package p105e1;

import aa3.C0627i1;
import d13.AbstractC11478a;
import ge3.AbstractC15751g;
import java.util.List;
import m83.C25271y;
import p088dc.AbstractC11894a;
import p249jc.AbstractC21598x;
import p294l3.C23254g;
import p294l3.C23275q0;
import p294l3.C23277r0;
import p294l3.C23285v0;
import p294l3.C23286w;
import p392p3.InterfaceC28770h;
import p510u0.C34311e;
import p510u0.InterfaceC34372z0;
import p636y3.AbstractC39170b;
import p636y3.C39169a;
import p636y3.C39183o;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: e1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C12518e {

    /* JADX INFO: renamed from: a */
    public C23254g f42734a;

    /* JADX INFO: renamed from: b */
    public InterfaceC28770h f42735b;

    /* JADX INFO: renamed from: c */
    public int f42736c;

    /* JADX INFO: renamed from: d */
    public boolean f42737d;

    /* JADX INFO: renamed from: e */
    public int f42738e;

    /* JADX INFO: renamed from: f */
    public int f42739f;

    /* JADX INFO: renamed from: g */
    public List f42740g;

    /* JADX INFO: renamed from: h */
    public InterfaceC34372z0 f42741h;

    /* JADX INFO: renamed from: i */
    public C12515b f42742i;

    /* JADX INFO: renamed from: k */
    public InterfaceC39171c f42744k;

    /* JADX INFO: renamed from: l */
    public C23285v0 f42745l;

    /* JADX INFO: renamed from: m */
    public C0627i1 f42746m;

    /* JADX INFO: renamed from: n */
    public EnumC39181m f42747n;

    /* JADX INFO: renamed from: o */
    public C23277r0 f42748o;

    /* JADX INFO: renamed from: r */
    public C12517d f42751r;

    /* JADX INFO: renamed from: s */
    public long f42752s;

    /* JADX INFO: renamed from: j */
    public long f42743j = AbstractC12514a.f42720a;

    /* JADX INFO: renamed from: p */
    public int f42749p = -1;

    /* JADX INFO: renamed from: q */
    public int f42750q = -1;

    public C12518e(C23254g c23254g, C23285v0 c23285v0, InterfaceC28770h interfaceC28770h, int i13, boolean z4, int i14, int i15, List list, InterfaceC34372z0 interfaceC34372z0) {
        this.f42734a = c23254g;
        this.f42735b = interfaceC28770h;
        this.f42736c = i13;
        this.f42737d = z4;
        this.f42738e = i14;
        this.f42739f = i15;
        this.f42740g = list;
        this.f42741h = interfaceC34372z0;
        this.f42745l = c23285v0;
    }

    /* JADX INFO: renamed from: a */
    public final int m35167a(int i13, EnumC39181m enumC39181m) {
        int i14 = this.f42749p;
        int i15 = this.f42750q;
        if (i13 == i14 && i14 != -1) {
            return i15;
        }
        long jM124769a = AbstractC39170b.m124769a(0, i13, 0, Integer.MAX_VALUE);
        if (this.f42739f > 1) {
            jM124769a = m35174h(jM124769a, enumC39181m);
        }
        int iM118989l = AbstractC37056f.m118989l(m35168b(jM124769a, enumC39181m).f92262e);
        int iM124766j = C39169a.m124766j(jM124769a);
        if (iM118989l < iM124766j) {
            iM118989l = iM124766j;
        }
        this.f42749p = i13;
        this.f42750q = iM118989l;
        return iM118989l;
    }

    /* JADX INFO: renamed from: b */
    public final C23286w m35168b(long j7, EnumC39181m enumC39181m) {
        C0627i1 c0627i1M35171e = m35171e(enumC39181m);
        long jM44470w = AbstractC15751g.m44470w(j7, this.f42736c, this.f42737d, c0627i1M35171e.mo1619c());
        boolean z4 = this.f42737d;
        int i13 = this.f42736c;
        int i14 = this.f42738e;
        return new C23286w(c0627i1M35171e, jM44470w, ((z4 || !(i13 == 2 || i13 == 4 || i13 == 5)) && i14 >= 1) ? i14 : 1, i13);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m35169c(long j7, EnumC39181m enumC39181m) {
        this.f42752s = (this.f42752s << 2) | 3;
        long jM35174h = this.f42739f > 1 ? m35174h(j7, enumC39181m) : j7;
        C23277r0 c23277r0 = this.f42748o;
        if (c23277r0 != null) {
            C23286w c23286w = c23277r0.f92228b;
            C23275q0 c23275q0 = c23277r0.f92227a;
            if (!c23286w.f92258a.mo1618b()) {
                EnumC39181m enumC39181m2 = c23275q0.f92223h;
                long j13 = c23275q0.f92225j;
                if (enumC39181m == enumC39181m2 && (C39169a.m124759c(jM35174h, j13) || (C39169a.m124765i(jM35174h) == C39169a.m124765i(j13) && C39169a.m124767k(jM35174h) == C39169a.m124767k(j13) && C39169a.m124764h(jM35174h) >= c23286w.f92262e && !c23286w.f92260c))) {
                    C23277r0 c23277r1 = this.f42748o;
                    AbstractC22676k.m65747g(c23277r1);
                    if (C39169a.m124759c(jM35174h, c23277r1.f92227a.f92225j)) {
                        return false;
                    }
                    C23277r0 c23277r2 = this.f42748o;
                    AbstractC22676k.m65747g(c23277r2);
                    this.f42748o = m35173g(enumC39181m, jM35174h, c23277r2.f92228b);
                    return true;
                }
            }
        }
        InterfaceC34372z0 interfaceC34372z0 = this.f42741h;
        if (interfaceC34372z0 != null) {
            this.f42747n = enumC39181m;
            long j14 = this.f42745l.f92255a.f92192b;
            if (this.f42751r == null) {
                this.f42751r = new C12517d(this);
            }
            C12517d c12517d = this.f42751r;
            AbstractC22676k.m65747g(c12517d);
            long jM108615b = ((C34311e) interfaceC34372z0).m108615b(c12517d, j7, this.f42734a);
            if (C39183o.m124806d(jM108615b)) {
                jM108615b = AbstractC12519f.m35175a(j14, jM108615b);
            }
            long j15 = jM108615b;
            if (this.f42751r == null) {
                this.f42751r = new C12517d(this);
            }
            C12517d c12517d2 = this.f42751r;
            AbstractC22676k.m65747g(c12517d2);
            C23277r0 c23277r0M35165a = c12517d2.m35165a();
            if (c23277r0M35165a != null) {
                C23275q0 c23275q1 = c23277r0M35165a.f92227a;
                if (C39183o.m124803a(j15, c23275q1.f92217b.f92255a.f92192b) && c23275q1.f92221f == this.f42736c) {
                    this.f42748o = c23277r0M35165a;
                    return true;
                }
            }
            m35172f(C23285v0.m67364b(this.f42745l, 0L, j15, null, null, 0L, 0, 0L, null, null, 16777213));
        }
        this.f42748o = m35173g(enumC39181m, jM35174h, m35168b(jM35174h, enumC39181m));
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m35170d(InterfaceC39171c interfaceC39171c) {
        long jM35162a;
        InterfaceC39171c interfaceC39171c2 = this.f42744k;
        if (interfaceC39171c != null) {
            int i13 = AbstractC12514a.f42721b;
            jM35162a = AbstractC12514a.m35162a(interfaceC39171c.getDensity(), interfaceC39171c.getFontScale());
        } else {
            jM35162a = AbstractC12514a.f42720a;
        }
        if (interfaceC39171c2 == null) {
            this.f42744k = interfaceC39171c;
            this.f42743j = jM35162a;
            return;
        }
        if (interfaceC39171c == null || this.f42743j != jM35162a) {
            this.f42744k = interfaceC39171c;
            this.f42743j = jM35162a;
            this.f42752s = (this.f42752s << 2) | 1;
            this.f42746m = null;
            this.f42748o = null;
            this.f42750q = -1;
            this.f42749p = -1;
            this.f42751r = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final C0627i1 m35171e(EnumC39181m enumC39181m) {
        C0627i1 c0627i1 = this.f42746m;
        if (c0627i1 == null || enumC39181m != this.f42747n || c0627i1.mo1618b()) {
            this.f42747n = enumC39181m;
            C23254g c23254g = this.f42734a;
            C23285v0 c23285v0M60695p0 = AbstractC21598x.m60695p0(this.f42745l, enumC39181m);
            InterfaceC39171c interfaceC39171c = this.f42744k;
            AbstractC22676k.m65747g(interfaceC39171c);
            InterfaceC28770h interfaceC28770h = this.f42735b;
            List list = this.f42740g;
            if (list == null) {
                list = C25271y.f99162w;
            }
            c0627i1 = new C0627i1(c23254g, c23285v0M60695p0, list, interfaceC39171c, interfaceC28770h);
        }
        this.f42746m = c0627i1;
        return c0627i1;
    }

    /* JADX INFO: renamed from: f */
    public final void m35172f(C23285v0 c23285v0) {
        boolean zM67367d = c23285v0.m67367d(this.f42745l);
        this.f42745l = c23285v0;
        if (zM67367d) {
            return;
        }
        this.f42752s <<= 2;
        this.f42746m = null;
        this.f42748o = null;
        this.f42750q = -1;
        this.f42749p = -1;
    }

    /* JADX INFO: renamed from: g */
    public final C23277r0 m35173g(EnumC39181m enumC39181m, long j7, C23286w c23286w) {
        float fMin = Math.min(c23286w.f92258a.mo1619c(), c23286w.f92261d);
        C23254g c23254g = this.f42734a;
        C23285v0 c23285v0 = this.f42745l;
        List list = this.f42740g;
        if (list == null) {
            list = C25271y.f99162w;
        }
        int i13 = this.f42738e;
        boolean z4 = this.f42737d;
        int i14 = this.f42736c;
        InterfaceC39171c interfaceC39171c = this.f42744k;
        AbstractC22676k.m65747g(interfaceC39171c);
        return new C23277r0(new C23275q0(c23254g, c23285v0, list, i13, z4, i14, interfaceC39171c, enumC39181m, this.f42735b, j7), c23286w, AbstractC39170b.m124772d(j7, (((long) AbstractC37056f.m118989l(fMin)) << 32) | (((long) AbstractC37056f.m118989l(c23286w.f92262e)) & 4294967295L)));
    }

    /* JADX INFO: renamed from: h */
    public final long m35174h(long j7, EnumC39181m enumC39181m) {
        C12515b c12515b = this.f42742i;
        C23285v0 c23285v0 = this.f42745l;
        InterfaceC39171c interfaceC39171c = this.f42744k;
        AbstractC22676k.m65747g(interfaceC39171c);
        C12515b c12515bM31976y = AbstractC11894a.m31976y(c12515b, enumC39181m, c23285v0, interfaceC39171c, this.f42735b);
        this.f42742i = c12515bM31976y;
        return c12515bM31976y.m35164a(this.f42739f, j7);
    }

    public final String toString() {
        C23275q0 c23275q0;
        StringBuilder sb4 = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object c39169a = "null";
        sb4.append(this.f42748o != null ? "<TextLayoutResult>" : "null");
        sb4.append(", lastDensity=");
        sb4.append((Object) AbstractC12514a.m35163b(this.f42743j));
        sb4.append(", history=");
        sb4.append(this.f42752s);
        sb4.append(", constraints=");
        C23277r0 c23277r0 = this.f42748o;
        if (c23277r0 != null && (c23275q0 = c23277r0.f92227a) != null) {
            c39169a = new C39169a(c23275q0.f92225j);
        }
        return AbstractC11478a.m30860l(sb4, c39169a, ')');
    }
}
