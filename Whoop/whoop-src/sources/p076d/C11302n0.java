package p076d;

import java.io.IOException;
import ro.C31624i;
import s30.AbstractC32103e;

/* JADX INFO: renamed from: d.n0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11302n0 extends AbstractC11272b1 {

    /* JADX INFO: renamed from: a */
    public final C11284f1 f36230a;

    public C11302n0(C11284f1 c11284f1) {
        this.f36230a = c11284f1;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        return this.f36230a.mo30479c(z4);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        c31624i.m97709n(7, z4);
        c31624i.m97707f(25, false, this.f36230a.f36204a);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: g */
    public final boolean mo30474g(AbstractC11272b1 abstractC11272b1) {
        if (abstractC11272b1 instanceof C11302n0) {
            return this.f36230a.mo30474g(((C11302n0) abstractC11272b1).f36230a);
        }
        return false;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: h */
    public final boolean mo30475h() {
        return false;
    }

    @Override // p076d.AbstractC11272b1
    public final int hashCode() {
        return ~AbstractC32103e.m99883e(this.f36230a.f36204a);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: j */
    public final AbstractC11272b1 mo30476j() {
        this.f36230a.getClass();
        return this;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: k */
    public final AbstractC11272b1 mo30477k() {
        this.f36230a.getClass();
        return this;
    }
}
