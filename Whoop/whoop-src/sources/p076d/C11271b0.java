package p076d;

import java.io.IOException;
import java.util.Arrays;
import p582wg.AbstractC37250c;
import ro.C31624i;
import s30.AbstractC32103e;

/* JADX INFO: renamed from: d.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11271b0 extends AbstractC11272b1 {

    /* JADX INFO: renamed from: a */
    public final byte[] f36186a;

    public C11271b0(byte[] bArr) {
        this.f36186a = bArr;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        return C31624i.m97696b(this.f36186a.length, z4);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        c31624i.m97707f(20, z4, this.f36186a);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: g */
    public final boolean mo30474g(AbstractC11272b1 abstractC11272b1) {
        if (abstractC11272b1 instanceof C11271b0) {
            return Arrays.equals(this.f36186a, ((C11271b0) abstractC11272b1).f36186a);
        }
        return false;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ boolean mo30475h() {
        return false;
    }

    @Override // p076d.AbstractC11272b1
    public final int hashCode() {
        return AbstractC32103e.m99883e(this.f36186a);
    }

    public final String toString() {
        return AbstractC37250c.m119389a(this.f36186a);
    }
}
