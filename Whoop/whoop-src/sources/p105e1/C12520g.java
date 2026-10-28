package p105e1;

import ge3.AbstractC15751g;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11894a;
import p249jc.AbstractC21598x;
import p294l3.C23242a;
import p294l3.C23285v0;
import p294l3.InterfaceC23243a0;
import p392p3.InterfaceC28770h;
import p493t3.C33491c;
import p636y3.AbstractC39170b;
import p636y3.C39169a;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: e1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C12520g {

    /* JADX INFO: renamed from: a */
    public String f42754a;

    /* JADX INFO: renamed from: b */
    public C23285v0 f42755b;

    /* JADX INFO: renamed from: c */
    public InterfaceC28770h f42756c;

    /* JADX INFO: renamed from: d */
    public int f42757d;

    /* JADX INFO: renamed from: e */
    public boolean f42758e;

    /* JADX INFO: renamed from: f */
    public int f42759f;

    /* JADX INFO: renamed from: g */
    public int f42760g;

    /* JADX INFO: renamed from: i */
    public InterfaceC39171c f42762i;

    /* JADX INFO: renamed from: j */
    public C23242a f42763j;

    /* JADX INFO: renamed from: k */
    public boolean f42764k;

    /* JADX INFO: renamed from: l */
    public long f42765l;

    /* JADX INFO: renamed from: m */
    public C12515b f42766m;

    /* JADX INFO: renamed from: n */
    public InterfaceC23243a0 f42767n;

    /* JADX INFO: renamed from: o */
    public EnumC39181m f42768o;

    /* JADX INFO: renamed from: s */
    public long f42772s;

    /* JADX INFO: renamed from: h */
    public long f42761h = AbstractC12514a.f42720a;

    /* JADX INFO: renamed from: p */
    public long f42769p = AbstractC39170b.m124776h(0, 0, 0, 0);

    /* JADX INFO: renamed from: q */
    public int f42770q = -1;

    /* JADX INFO: renamed from: r */
    public int f42771r = -1;

    public C12520g(String str, C23285v0 c23285v0, InterfaceC28770h interfaceC28770h, int i13, boolean z4, int i14, int i15) {
        this.f42754a = str;
        this.f42755b = c23285v0;
        this.f42756c = interfaceC28770h;
        this.f42757d = i13;
        this.f42758e = z4;
        this.f42759f = i14;
        this.f42760g = i15;
        long j7 = 0;
        this.f42765l = (j7 & 4294967295L) | (j7 << 32);
    }

    /* JADX INFO: renamed from: f */
    public static long m35176f(C12520g c12520g, long j7, EnumC39181m enumC39181m) {
        C23285v0 c23285v0 = c12520g.f42755b;
        C12515b c12515b = c12520g.f42766m;
        InterfaceC39171c interfaceC39171c = c12520g.f42762i;
        AbstractC22676k.m65747g(interfaceC39171c);
        C12515b c12515bM31976y = AbstractC11894a.m31976y(c12515b, enumC39181m, c23285v0, interfaceC39171c, c12520g.f42756c);
        c12520g.f42766m = c12515bM31976y;
        return c12515bM31976y.m35164a(c12520g.f42760g, j7);
    }

    /* JADX INFO: renamed from: a */
    public final int m35177a(int i13, EnumC39181m enumC39181m) {
        int i14 = this.f42770q;
        int i15 = this.f42771r;
        if (i13 == i14 && i14 != -1) {
            return i15;
        }
        long jM124769a = AbstractC39170b.m124769a(0, i13, 0, Integer.MAX_VALUE);
        if (this.f42760g > 1) {
            jM124769a = m35176f(this, jM124769a, enumC39181m);
        }
        InterfaceC23243a0 interfaceC23243a0M35181e = m35181e(enumC39181m);
        long jM44470w = AbstractC15751g.m44470w(jM124769a, this.f42757d, this.f42758e, interfaceC23243a0M35181e.mo1619c());
        boolean z4 = this.f42758e;
        int i16 = this.f42757d;
        int i17 = this.f42759f;
        int iM118989l = AbstractC37056f.m118989l(new C23242a((C33491c) interfaceC23243a0M35181e, ((z4 || !(i16 == 2 || i16 == 4 || i16 == 5)) && i17 >= 1) ? i17 : 1, i16, jM44470w).m67290b());
        int iM124766j = C39169a.m124766j(jM124769a);
        if (iM118989l < iM124766j) {
            iM118989l = iM124766j;
        }
        this.f42770q = i13;
        this.f42771r = iM118989l;
        return iM118989l;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m35178b(long j7, EnumC39181m enumC39181m) {
        InterfaceC23243a0 interfaceC23243a0;
        this.f42772s = (this.f42772s << 2) | 3;
        boolean z4 = true;
        long jM35176f = this.f42760g > 1 ? m35176f(this, j7, enumC39181m) : j7;
        C23242a c23242a = this.f42763j;
        boolean z13 = false;
        if (c23242a != null && (interfaceC23243a0 = this.f42767n) != null && !interfaceC23243a0.mo1618b() && enumC39181m == this.f42768o && (C39169a.m124759c(jM35176f, this.f42769p) || (C39169a.m124765i(jM35176f) == C39169a.m124765i(this.f42769p) && C39169a.m124767k(jM35176f) == C39169a.m124767k(this.f42769p) && C39169a.m124764h(jM35176f) >= c23242a.m67290b() && !c23242a.f92101d.f97766d))) {
            if (!C39169a.m124759c(jM35176f, this.f42769p)) {
                C23242a c23242a2 = this.f42763j;
                AbstractC22676k.m65747g(c23242a2);
                long jM124772d = AbstractC39170b.m124772d(jM35176f, (((long) AbstractC37056f.m118989l(Math.min(c23242a2.f92098a.f139827i.m73303c(), c23242a2.m67292d()))) << 32) | (((long) AbstractC37056f.m118989l(c23242a2.m67290b())) & 4294967295L));
                this.f42765l = jM124772d;
                if (this.f42757d == 3 || (((int) (jM124772d >> 32)) >= c23242a2.m67292d() && ((int) (4294967295L & jM124772d)) >= c23242a2.m67290b())) {
                    z4 = false;
                }
                this.f42764k = z4;
                this.f42769p = jM35176f;
            }
            return false;
        }
        InterfaceC23243a0 interfaceC23243a0M35181e = m35181e(enumC39181m);
        long jM44470w = AbstractC15751g.m44470w(jM35176f, this.f42757d, this.f42758e, interfaceC23243a0M35181e.mo1619c());
        boolean z14 = this.f42758e;
        int i13 = this.f42757d;
        int i14 = this.f42759f;
        C23242a c23242a3 = new C23242a((C33491c) interfaceC23243a0M35181e, ((z14 || !(i13 == 2 || i13 == 4 || i13 == 5)) && i14 >= 1) ? i14 : 1, i13, jM44470w);
        this.f42769p = jM35176f;
        long jM124772d2 = AbstractC39170b.m124772d(jM35176f, (((long) AbstractC37056f.m118989l(c23242a3.m67290b())) & 4294967295L) | (((long) AbstractC37056f.m118989l(c23242a3.m67292d())) << 32));
        this.f42765l = jM124772d2;
        if (this.f42757d != 3 && (((int) (jM124772d2 >> 32)) < c23242a3.m67292d() || ((int) (jM124772d2 & 4294967295L)) < c23242a3.m67290b())) {
            z13 = true;
        }
        this.f42764k = z13;
        this.f42763j = c23242a3;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m35179c() {
        this.f42763j = null;
        this.f42767n = null;
        this.f42768o = null;
        this.f42770q = -1;
        this.f42771r = -1;
        this.f42769p = AbstractC39170b.m124776h(0, 0, 0, 0);
        long j7 = 0;
        this.f42765l = (j7 & 4294967295L) | (j7 << 32);
        this.f42764k = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m35180d(InterfaceC39171c interfaceC39171c) {
        long jM35162a;
        InterfaceC39171c interfaceC39171c2 = this.f42762i;
        if (interfaceC39171c != null) {
            int i13 = AbstractC12514a.f42721b;
            jM35162a = AbstractC12514a.m35162a(interfaceC39171c.getDensity(), interfaceC39171c.getFontScale());
        } else {
            jM35162a = AbstractC12514a.f42720a;
        }
        if (interfaceC39171c2 == null) {
            this.f42762i = interfaceC39171c;
            this.f42761h = jM35162a;
        } else if (interfaceC39171c == null || this.f42761h != jM35162a) {
            this.f42762i = interfaceC39171c;
            this.f42761h = jM35162a;
            this.f42772s = (this.f42772s << 2) | 1;
            m35179c();
        }
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC23243a0 m35181e(EnumC39181m enumC39181m) {
        InterfaceC23243a0 c33491c = this.f42767n;
        if (c33491c == null || enumC39181m != this.f42768o || c33491c.mo1618b()) {
            this.f42768o = enumC39181m;
            String str = this.f42754a;
            C23285v0 c23285v0M60695p0 = AbstractC21598x.m60695p0(this.f42755b, enumC39181m);
            InterfaceC39171c interfaceC39171c = this.f42762i;
            AbstractC22676k.m65747g(interfaceC39171c);
            InterfaceC28770h interfaceC28770h = this.f42756c;
            C25271y c25271y = C25271y.f99162w;
            c33491c = new C33491c(str, c23285v0M60695p0, c25271y, c25271y, interfaceC28770h, interfaceC39171c);
        }
        this.f42767n = c33491c;
        return c33491c;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb4.append(this.f42763j != null ? "<paragraph>" : "null");
        sb4.append(", lastDensity=");
        sb4.append((Object) AbstractC12514a.m35163b(this.f42761h));
        sb4.append(", history=");
        return AbstractC11266d.m30457k(this.f42772s, ", constraints=$)", sb4);
    }
}
