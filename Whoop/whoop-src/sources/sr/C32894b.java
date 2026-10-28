package sr;

import com.google.android.gms.tasks.Task;
import p073cq.C11040i;
import p078d1.C11457j;
import p623xr.C38606b;
import p623xr.C38626v;

/* JADX INFO: renamed from: sr.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C32894b {

    /* JADX INFO: renamed from: a */
    public final C32900h f137095a;

    /* JADX INFO: renamed from: b */
    public final C32904l f137096b;

    public C32894b(C32900h c32900h, C32904l c32904l) {
        this.f137095a = c32900h;
        this.f137096b = c32904l;
    }

    /* JADX INFO: renamed from: a */
    public final Task m103288a(C32906n c32906n) {
        long j7 = c32906n.f137126a;
        Object[] objArr = {Long.valueOf(j7)};
        C32900h c32900h = this.f137095a;
        c32900h.f137114a.m123818b("warmUpIntegrityToken(%s)", objArr);
        C11040i c11040i = new C11040i();
        C32896d c32896d = new C32896d(c32900h, c11040i, j7, c11040i);
        C38606b c38606b = c32900h.f137118e;
        c38606b.getClass();
        c38606b.m123803a().post(new C38626v(c38606b, c11040i, c11040i, c32896d));
        return c11040i.f34644a.onSuccessTask(new C11457j(29, this, c32906n));
    }
}
