package sr;

import p073cq.C11040i;
import p073cq.C11052u;
import p623xr.C38606b;
import p623xr.C38626v;

/* JADX INFO: renamed from: sr.k */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C32903k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32904l f137121a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f137122b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f137123c;

    public /* synthetic */ C32903k(C32904l c32904l, long j7, long j13) {
        this.f137121a = c32904l;
        this.f137122b = j7;
        this.f137123c = j13;
    }

    /* JADX INFO: renamed from: a */
    public final C11052u m103299a(C32907o c32907o) {
        C32900h c32900h = this.f137121a.f137124a;
        long j7 = this.f137123c;
        c32900h.f137114a.m123818b("requestExpressIntegrityToken(%s)", Long.valueOf(j7));
        C11040i c11040i = new C11040i();
        C32897e c32897e = new C32897e(c32900h, c11040i, c32907o, this.f137122b, j7, c11040i);
        C38606b c38606b = c32900h.f137118e;
        c38606b.getClass();
        c38606b.m123803a().post(new C38626v(c38606b, c11040i, c11040i, c32897e));
        return c11040i.f34644a;
    }
}
