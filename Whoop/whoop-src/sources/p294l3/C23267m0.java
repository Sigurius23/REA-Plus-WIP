package p294l3;

import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17922y0;
import p208i2.C17875c1;
import p208i2.C17919x;
import p208i2.C17924z0;
import p270k2.AbstractC22132f;
import p392p3.AbstractC28771i;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p478s3.AbstractC32098d;
import p478s3.C32096b;
import p571w3.C36765a;
import p571w3.C36766b;
import p571w3.C36767c;
import p571w3.C36776l;
import p571w3.C36778n;
import p571w3.C36780p;
import p571w3.InterfaceC36779o;
import p636y3.C39183o;
import p636y3.C39184p;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l3.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23267m0 implements InterfaceC23244b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC36779o f92191a;

    /* JADX INFO: renamed from: b */
    public final long f92192b;

    /* JADX INFO: renamed from: c */
    public final C28780r f92193c;

    /* JADX INFO: renamed from: d */
    public final C28776n f92194d;

    /* JADX INFO: renamed from: e */
    public final C28777o f92195e;

    /* JADX INFO: renamed from: f */
    public final AbstractC28771i f92196f;

    /* JADX INFO: renamed from: g */
    public final String f92197g;

    /* JADX INFO: renamed from: h */
    public final long f92198h;

    /* JADX INFO: renamed from: i */
    public final C36765a f92199i;

    /* JADX INFO: renamed from: j */
    public final C36780p f92200j;

    /* JADX INFO: renamed from: k */
    public final C32096b f92201k;

    /* JADX INFO: renamed from: l */
    public final long f92202l;

    /* JADX INFO: renamed from: m */
    public final C36776l f92203m;

    /* JADX INFO: renamed from: n */
    public final C17924z0 f92204n;

    /* JADX INFO: renamed from: o */
    public final C23253f0 f92205o;

    /* JADX INFO: renamed from: p */
    public final AbstractC22132f f92206p;

    public C23267m0(long j7, long j13, C28780r c28780r, C28776n c28776n, C28777o c28777o, AbstractC28771i abstractC28771i, String str, long j14, C36765a c36765a, C36780p c36780p, C32096b c32096b, long j15, C36776l c36776l, C17924z0 c17924z0, C23253f0 c23253f0) {
        this(j7 != 16 ? new C36767c(j7) : C36778n.f157356a, j13, c28780r, c28776n, c28777o, abstractC28771i, str, j14, c36765a, c36780p, c32096b, j15, c36776l, c17924z0, c23253f0, null);
    }

    /* JADX INFO: renamed from: a */
    public static C23267m0 m67325a(C23267m0 c23267m0, long j7, C28780r c28780r, int i13) {
        long jMo117875b = (i13 & 1) != 0 ? c23267m0.f92191a.mo117875b() : j7;
        long j13 = c23267m0.f92192b;
        C28780r c28780r2 = (i13 & 4) != 0 ? c23267m0.f92193c : c28780r;
        C28776n c28776n = c23267m0.f92194d;
        C28777o c28777o = c23267m0.f92195e;
        AbstractC28771i abstractC28771i = (i13 & 32) != 0 ? c23267m0.f92196f : null;
        String str = c23267m0.f92197g;
        long j14 = c23267m0.f92198h;
        C36765a c36765a = c23267m0.f92199i;
        C36780p c36780p = c23267m0.f92200j;
        C32096b c32096b = c23267m0.f92201k;
        long j15 = c23267m0.f92202l;
        C36776l c36776l = c23267m0.f92203m;
        C17924z0 c17924z0 = c23267m0.f92204n;
        C23253f0 c23253f0 = c23267m0.f92205o;
        AbstractC22132f abstractC22132f = c23267m0.f92206p;
        InterfaceC36779o c36767c = c23267m0.f92191a;
        if (!C17919x.m51542d(jMo117875b, c36767c.mo117875b())) {
            c36767c = jMo117875b != 16 ? new C36767c(jMo117875b) : C36778n.f157356a;
        }
        return new C23267m0(c36767c, j13, c28780r2, c28776n, c28777o, abstractC28771i, str, j14, c36765a, c36780p, c32096b, j15, c36776l, c17924z0, c23253f0, abstractC22132f);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m67326b(C23267m0 c23267m0) {
        if (this == c23267m0) {
            return true;
        }
        return C39183o.m124803a(this.f92192b, c23267m0.f92192b) && AbstractC22676k.m65745e(this.f92193c, c23267m0.f92193c) && AbstractC22676k.m65745e(this.f92194d, c23267m0.f92194d) && AbstractC22676k.m65745e(this.f92195e, c23267m0.f92195e) && AbstractC22676k.m65745e(this.f92196f, c23267m0.f92196f) && AbstractC22676k.m65745e(this.f92197g, c23267m0.f92197g) && C39183o.m124803a(this.f92198h, c23267m0.f92198h) && AbstractC22676k.m65745e(this.f92199i, c23267m0.f92199i) && AbstractC22676k.m65745e(this.f92200j, c23267m0.f92200j) && AbstractC22676k.m65745e(this.f92201k, c23267m0.f92201k) && C17919x.m51542d(this.f92202l, c23267m0.f92202l) && AbstractC22676k.m65745e(this.f92205o, c23267m0.f92205o);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m67327c(C23267m0 c23267m0) {
        return AbstractC22676k.m65745e(this.f92191a, c23267m0.f92191a) && AbstractC22676k.m65745e(this.f92203m, c23267m0.f92203m) && AbstractC22676k.m65745e(this.f92204n, c23267m0.f92204n) && AbstractC22676k.m65745e(this.f92206p, c23267m0.f92206p);
    }

    /* JADX INFO: renamed from: d */
    public final C23267m0 m67328d(C23267m0 c23267m0) {
        if (c23267m0 == null) {
            return this;
        }
        InterfaceC36779o interfaceC36779o = c23267m0.f92191a;
        return AbstractC23269n0.m67329a(this, interfaceC36779o.mo117875b(), interfaceC36779o.mo117876c(), interfaceC36779o.mo117874a(), c23267m0.f92192b, c23267m0.f92193c, c23267m0.f92194d, c23267m0.f92195e, c23267m0.f92196f, c23267m0.f92197g, c23267m0.f92198h, c23267m0.f92199i, c23267m0.f92200j, c23267m0.f92201k, c23267m0.f92202l, c23267m0.f92203m, c23267m0.f92204n, c23267m0.f92205o, c23267m0.f92206p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23267m0)) {
            return false;
        }
        C23267m0 c23267m0 = (C23267m0) obj;
        return m67326b(c23267m0) && m67327c(c23267m0);
    }

    public final int hashCode() {
        InterfaceC36779o interfaceC36779o = this.f92191a;
        long jMo117875b = interfaceC36779o.mo117875b();
        int i13 = C17919x.f69638o;
        int iHashCode = Long.hashCode(jMo117875b) * 31;
        AbstractC17911t abstractC17911tMo117876c = interfaceC36779o.mo117876c();
        int iHashCode2 = (Float.hashCode(interfaceC36779o.mo117874a()) + ((iHashCode + (abstractC17911tMo117876c != null ? abstractC17911tMo117876c.hashCode() : 0)) * 31)) * 31;
        C39184p[] c39184pArr = C39183o.f168427b;
        int iM30451e = AbstractC11266d.m30451e(iHashCode2, this.f92192b, 31);
        C28780r c28780r = this.f92193c;
        int i14 = (iM30451e + (c28780r != null ? c28780r.f116547w : 0)) * 31;
        C28776n c28776n = this.f92194d;
        int iHashCode3 = (i14 + (c28776n != null ? Integer.hashCode(c28776n.f116535a) : 0)) * 31;
        C28777o c28777o = this.f92195e;
        int iHashCode4 = (iHashCode3 + (c28777o != null ? Integer.hashCode(c28777o.f116536a) : 0)) * 31;
        AbstractC28771i abstractC28771i = this.f92196f;
        int iHashCode5 = (iHashCode4 + (abstractC28771i != null ? abstractC28771i.hashCode() : 0)) * 31;
        String str = this.f92197g;
        int iM30451e2 = AbstractC11266d.m30451e((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, this.f92198h, 31);
        C36765a c36765a = this.f92199i;
        int iHashCode6 = (iM30451e2 + (c36765a != null ? Float.hashCode(c36765a.f157332a) : 0)) * 31;
        C36780p c36780p = this.f92200j;
        int iHashCode7 = (iHashCode6 + (c36780p != null ? c36780p.hashCode() : 0)) * 31;
        C32096b c32096b = this.f92201k;
        int iM30451e3 = AbstractC11266d.m30451e((iHashCode7 + (c32096b != null ? c32096b.f133099w.hashCode() : 0)) * 31, this.f92202l, 31);
        C36776l c36776l = this.f92203m;
        int i15 = (iM30451e3 + (c36776l != null ? c36776l.f157354a : 0)) * 31;
        C17924z0 c17924z0 = this.f92204n;
        int iHashCode8 = (i15 + (c17924z0 != null ? c17924z0.hashCode() : 0)) * 31;
        C23253f0 c23253f0 = this.f92205o;
        int iHashCode9 = (iHashCode8 + (c23253f0 != null ? c23253f0.hashCode() : 0)) * 31;
        AbstractC22132f abstractC22132f = this.f92206p;
        return iHashCode9 + (abstractC22132f != null ? abstractC22132f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SpanStyle(color=");
        InterfaceC36779o interfaceC36779o = this.f92191a;
        sb4.append((Object) C17919x.m51548j(interfaceC36779o.mo117875b()));
        sb4.append(", brush=");
        sb4.append(interfaceC36779o.mo117876c());
        sb4.append(", alpha=");
        sb4.append(interfaceC36779o.mo117874a());
        sb4.append(", fontSize=");
        sb4.append((Object) C39183o.m124807e(this.f92192b));
        sb4.append(", fontWeight=");
        sb4.append(this.f92193c);
        sb4.append(", fontStyle=");
        sb4.append(this.f92194d);
        sb4.append(", fontSynthesis=");
        sb4.append(this.f92195e);
        sb4.append(", fontFamily=");
        sb4.append(this.f92196f);
        sb4.append(", fontFeatureSettings=");
        sb4.append(this.f92197g);
        sb4.append(", letterSpacing=");
        sb4.append((Object) C39183o.m124807e(this.f92198h));
        sb4.append(", baselineShift=");
        sb4.append(this.f92199i);
        sb4.append(", textGeometricTransform=");
        sb4.append(this.f92200j);
        sb4.append(", localeList=");
        sb4.append(this.f92201k);
        sb4.append(", background=");
        AbstractC13673n.m38574u(this.f92202l, ", textDecoration=", sb4);
        sb4.append(this.f92203m);
        sb4.append(", shadow=");
        sb4.append(this.f92204n);
        sb4.append(", platformStyle=");
        sb4.append(this.f92205o);
        sb4.append(", drawStyle=");
        sb4.append(this.f92206p);
        sb4.append(')');
        return sb4.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C23267m0(AbstractC17911t abstractC17911t, float f13, long j7, C28780r c28780r, C28776n c28776n, C28777o c28777o, AbstractC28771i abstractC28771i, String str, long j13, C36765a c36765a, C36780p c36780p, C32096b c32096b, long j14, C36776l c36776l, C17924z0 c17924z0, C23253f0 c23253f0, AbstractC22132f abstractC22132f) {
        InterfaceC36779o c36766b = C36778n.f157356a;
        if (abstractC17911t != null) {
            if (abstractC17911t instanceof C17875c1) {
                long jM99849p = AbstractC32098d.m99849p(f13, ((C17875c1) abstractC17911t).f69559c);
                if (jM99849p != 16) {
                    c36766b = new C36767c(jM99849p);
                }
            } else {
                if (!(abstractC17911t instanceof AbstractC17922y0)) {
                    throw new NoWhenBranchMatchedException();
                }
                c36766b = new C36766b((AbstractC17922y0) abstractC17911t, f13);
            }
        }
        this(c36766b, j7, c28780r, c28776n, c28777o, abstractC28771i, str, j13, c36765a, c36780p, c32096b, j14, c36776l, c17924z0, c23253f0, abstractC22132f);
    }

    public C23267m0(InterfaceC36779o interfaceC36779o, long j7, C28780r c28780r, C28776n c28776n, C28777o c28777o, AbstractC28771i abstractC28771i, String str, long j13, C36765a c36765a, C36780p c36780p, C32096b c32096b, long j14, C36776l c36776l, C17924z0 c17924z0, C23253f0 c23253f0, AbstractC22132f abstractC22132f) {
        this.f92191a = interfaceC36779o;
        this.f92192b = j7;
        this.f92193c = c28780r;
        this.f92194d = c28776n;
        this.f92195e = c28777o;
        this.f92196f = abstractC28771i;
        this.f92197g = str;
        this.f92198h = j13;
        this.f92199i = c36765a;
        this.f92200j = c36780p;
        this.f92201k = c32096b;
        this.f92202l = j14;
        this.f92203m = c36776l;
        this.f92204n = c17924z0;
        this.f92205o = c23253f0;
        this.f92206p = abstractC22132f;
    }

    public C23267m0(long j7, long j13, C28780r c28780r, C28776n c28776n, C28777o c28777o, AbstractC28771i abstractC28771i, String str, long j14, C36765a c36765a, C36780p c36780p, C32096b c32096b, long j15, C36776l c36776l, C17924z0 c17924z0, int i13) {
        this((i13 & 1) != 0 ? C17919x.f69637n : j7, (i13 & 2) != 0 ? C39183o.f168428c : j13, (i13 & 4) != 0 ? null : c28780r, (i13 & 8) != 0 ? null : c28776n, (i13 & 16) != 0 ? null : c28777o, (i13 & 32) != 0 ? null : abstractC28771i, (i13 & 64) != 0 ? null : str, (i13 & 128) != 0 ? C39183o.f168428c : j14, (i13 & 256) != 0 ? null : c36765a, (i13 & 512) != 0 ? null : c36780p, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c32096b, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? C17919x.f69637n : j15, (i13 & 4096) != 0 ? null : c36776l, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : c17924z0, (C23253f0) null);
    }
}
