package p690zr;

import java.util.Objects;

/* JADX INFO: renamed from: zr.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41029i0 extends AbstractC41005a0 {
    @Override // p690zr.AbstractC41005a0
    /* JADX INFO: renamed from: b */
    public final AbstractC41005a0 mo133223b(Object obj) {
        obj.getClass();
        m133222a(obj);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC41032j0 m133261f() {
        int i13 = this.f176952b;
        if (i13 == 0) {
            int i14 = AbstractC41032j0.f177006y;
            return C41012c1.f176973J;
        }
        if (i13 != 1) {
            AbstractC41032j0 abstractC41032j0M133263l = AbstractC41032j0.m133263l(i13, this.f176951a);
            this.f176952b = abstractC41032j0M133263l.size();
            this.f176953c = true;
            return abstractC41032j0M133263l;
        }
        Object obj = this.f176951a[0];
        Objects.requireNonNull(obj);
        int i15 = AbstractC41032j0.f177006y;
        return new C41030i1(obj);
    }
}
