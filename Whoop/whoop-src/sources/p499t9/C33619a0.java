package p499t9;

import p309lo.C24553k;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: t9.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C33619a0 implements InterfaceC33627e0 {

    /* JADX INFO: renamed from: a */
    public final C24553k f140327a;

    /* JADX INFO: renamed from: b */
    public final C24553k f140328b;

    /* JADX INFO: renamed from: c */
    public long f140329c;

    public C33619a0(long j7, long[] jArr, long[] jArr2) {
        AbstractC35849g.m113802d(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f140327a = new C24553k(length);
            this.f140328b = new C24553k(length);
        } else {
            int i13 = length + 1;
            C24553k c24553k = new C24553k(i13);
            this.f140327a = c24553k;
            C24553k c24553k2 = new C24553k(i13);
            this.f140328b = c24553k2;
            c24553k.m71597a(0L);
            c24553k2.m71597a(0L);
        }
        this.f140327a.m71598b(jArr);
        this.f140328b.m71598b(jArr2);
        this.f140329c = j7;
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: c */
    public final C33625d0 mo8456c(long j7) {
        C24553k c24553k = this.f140328b;
        if (c24553k.f95825b == 0) {
            C33629f0 c33629f0 = C33629f0.f140370c;
            return new C33625d0(c33629f0, c33629f0);
        }
        int iM121909b = AbstractC38065t.m121909b(c24553k, j7);
        long jM71601e = c24553k.m71601e(iM121909b);
        C24553k c24553k2 = this.f140327a;
        C33629f0 c33629f1 = new C33629f0(jM71601e, c24553k2.m71601e(iM121909b));
        if (jM71601e == j7 || iM121909b == c24553k.f95825b - 1) {
            return new C33625d0(c33629f1, c33629f1);
        }
        int i13 = iM121909b + 1;
        return new C33625d0(c33629f1, new C33629f0(c24553k.m71601e(i13), c24553k2.m71601e(i13)));
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: e */
    public final boolean mo8509e() {
        return this.f140328b.f95825b > 0;
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: f */
    public final long mo8510f() {
        return this.f140329c;
    }
}
