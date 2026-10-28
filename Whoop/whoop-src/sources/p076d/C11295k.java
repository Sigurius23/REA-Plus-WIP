package p076d;

import java.io.IOException;
import java.util.Arrays;
import p582wg.AbstractC37250c;
import ro.C31624i;
import s30.AbstractC32103e;

/* JADX INFO: renamed from: d.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C11295k extends AbstractC11272b1 {

    /* JADX INFO: renamed from: a */
    public final byte[] f36223a;

    public C11295k(byte[] bArr) {
        byte b;
        byte b6;
        if (bArr.length < 2) {
            throw new IllegalArgumentException("UTCTime string too short");
        }
        this.f36223a = bArr;
        if (bArr.length <= 0 || (b = bArr[0]) < 48 || b > 57 || bArr.length <= 1 || (b6 = bArr[1]) < 48 || b6 > 57) {
            throw new IllegalArgumentException("illegal characters in UTCTime string");
        }
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        return C31624i.m97696b(this.f36223a.length, z4);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        c31624i.m97707f(23, z4, this.f36223a);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: g */
    public final boolean mo30474g(AbstractC11272b1 abstractC11272b1) {
        if (!(abstractC11272b1 instanceof C11295k)) {
            return false;
        }
        return Arrays.equals(this.f36223a, ((C11295k) abstractC11272b1).f36223a);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: h */
    public final boolean mo30475h() {
        return false;
    }

    @Override // p076d.AbstractC11272b1
    public final int hashCode() {
        return AbstractC32103e.m99883e(this.f36223a);
    }

    public final String toString() {
        return AbstractC37250c.m119389a(this.f36223a);
    }
}
