package p163g1;

import p127ev.AbstractC13673n;
import p208i2.C17919x;
import p390p1.C28633k1;
import p390p1.C28676v0;

/* JADX INFO: renamed from: g1.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C14970c1 {

    /* JADX INFO: renamed from: a */
    public final C28633k1 f55893a;

    /* JADX INFO: renamed from: b */
    public final C28633k1 f55894b;

    /* JADX INFO: renamed from: c */
    public final C28633k1 f55895c;

    /* JADX INFO: renamed from: d */
    public final C28633k1 f55896d;

    /* JADX INFO: renamed from: e */
    public final C28633k1 f55897e;

    /* JADX INFO: renamed from: f */
    public final C28633k1 f55898f;

    /* JADX INFO: renamed from: g */
    public final C28633k1 f55899g;

    /* JADX INFO: renamed from: h */
    public final C28633k1 f55900h;

    /* JADX INFO: renamed from: i */
    public final C28633k1 f55901i;

    /* JADX INFO: renamed from: j */
    public final C28633k1 f55902j;

    /* JADX INFO: renamed from: k */
    public final C28633k1 f55903k;

    /* JADX INFO: renamed from: l */
    public final C28633k1 f55904l;

    /* JADX INFO: renamed from: m */
    public final C28633k1 f55905m;

    public C14970c1(long j7, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, boolean z4) {
        C17919x c17919x = new C17919x(j7);
        C28676v0 c28676v0 = C28676v0.f115974F;
        this.f55893a = new C28633k1(c17919x, c28676v0);
        this.f55894b = new C28633k1(new C17919x(j13), c28676v0);
        this.f55895c = new C28633k1(new C17919x(j14), c28676v0);
        this.f55896d = new C28633k1(new C17919x(j15), c28676v0);
        this.f55897e = new C28633k1(new C17919x(j16), c28676v0);
        this.f55898f = new C28633k1(new C17919x(j17), c28676v0);
        this.f55899g = new C28633k1(new C17919x(j18), c28676v0);
        this.f55900h = new C28633k1(new C17919x(j19), c28676v0);
        this.f55901i = new C28633k1(new C17919x(j24), c28676v0);
        this.f55902j = new C28633k1(new C17919x(j25), c28676v0);
        this.f55903k = new C28633k1(new C17919x(j26), c28676v0);
        this.f55904l = new C28633k1(new C17919x(j27), c28676v0);
        this.f55905m = new C28633k1(Boolean.valueOf(z4), c28676v0);
    }

    /* JADX INFO: renamed from: a */
    public static C14970c1 m43086a(C14970c1 c14970c1, long j7, long j13, long j14, int i13) {
        long jM43091f = (i13 & 1) != 0 ? c14970c1.m43091f() : j7;
        long j15 = ((C17919x) c14970c1.f55894b.getValue()).f69639a;
        long jM43092g = c14970c1.m43092g();
        long j16 = ((C17919x) c14970c1.f55896d.getValue()).f69639a;
        long jM43087b = c14970c1.m43087b();
        long jM43093h = (i13 & 32) != 0 ? c14970c1.m43093h() : j13;
        long jM43088c = (i13 & 64) != 0 ? c14970c1.m43088c() : j14;
        long jM43089d = c14970c1.m43089d();
        long j17 = ((C17919x) c14970c1.f55901i.getValue()).f69639a;
        long j18 = ((C17919x) c14970c1.f55902j.getValue()).f69639a;
        long jM43090e = c14970c1.m43090e();
        long j19 = ((C17919x) c14970c1.f55904l.getValue()).f69639a;
        boolean zM43094i = c14970c1.m43094i();
        c14970c1.getClass();
        return new C14970c1(jM43091f, j15, jM43092g, j16, jM43087b, jM43093h, jM43088c, jM43089d, j17, j18, jM43090e, j19, zM43094i);
    }

    /* JADX INFO: renamed from: b */
    public final long m43087b() {
        return ((C17919x) this.f55897e.getValue()).f69639a;
    }

    /* JADX INFO: renamed from: c */
    public final long m43088c() {
        return ((C17919x) this.f55899g.getValue()).f69639a;
    }

    /* JADX INFO: renamed from: d */
    public final long m43089d() {
        return ((C17919x) this.f55900h.getValue()).f69639a;
    }

    /* JADX INFO: renamed from: e */
    public final long m43090e() {
        return ((C17919x) this.f55903k.getValue()).f69639a;
    }

    /* JADX INFO: renamed from: f */
    public final long m43091f() {
        return ((C17919x) this.f55893a.getValue()).f69639a;
    }

    /* JADX INFO: renamed from: g */
    public final long m43092g() {
        return ((C17919x) this.f55895c.getValue()).f69639a;
    }

    /* JADX INFO: renamed from: h */
    public final long m43093h() {
        return ((C17919x) this.f55898f.getValue()).f69639a;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m43094i() {
        return ((Boolean) this.f55905m.getValue()).booleanValue();
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Colors(primary=");
        sb4.append((Object) C17919x.m51548j(m43091f()));
        sb4.append(", primaryVariant=");
        sb4.append((Object) C17919x.m51548j(((C17919x) this.f55894b.getValue()).f69639a));
        sb4.append(", secondary=");
        sb4.append((Object) C17919x.m51548j(m43092g()));
        sb4.append(", secondaryVariant=");
        sb4.append((Object) C17919x.m51548j(((C17919x) this.f55896d.getValue()).f69639a));
        sb4.append(", background=");
        sb4.append((Object) C17919x.m51548j(m43087b()));
        sb4.append(", surface=");
        sb4.append((Object) C17919x.m51548j(m43093h()));
        sb4.append(", error=");
        sb4.append((Object) C17919x.m51548j(m43088c()));
        sb4.append(", onPrimary=");
        sb4.append((Object) C17919x.m51548j(m43089d()));
        sb4.append(", onSecondary=");
        AbstractC13673n.m38574u(((C17919x) this.f55901i.getValue()).f69639a, ", onBackground=", sb4);
        sb4.append((Object) C17919x.m51548j(((C17919x) this.f55902j.getValue()).f69639a));
        sb4.append(", onSurface=");
        sb4.append((Object) C17919x.m51548j(m43090e()));
        sb4.append(", onError=");
        sb4.append((Object) C17919x.m51548j(((C17919x) this.f55904l.getValue()).f69639a));
        sb4.append(", isLight=");
        sb4.append(m43094i());
        sb4.append(')');
        return sb4.toString();
    }
}
