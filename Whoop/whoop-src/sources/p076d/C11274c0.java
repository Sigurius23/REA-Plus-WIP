package p076d;

import java.io.IOException;
import java.util.Arrays;
import ro.C31624i;
import s30.AbstractC32103e;

/* JADX INFO: renamed from: d.c0 */
/* JADX INFO: loaded from: classes5.dex */
public class C11274c0 extends AbstractC11272b1 {

    /* JADX INFO: renamed from: a */
    public final byte[] f36190a;

    public C11274c0(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("GeneralizedTime string too short");
        }
        this.f36190a = bArr;
        if (!m30485l(0) || !m30485l(1) || !m30485l(2) || !m30485l(3)) {
            throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
        }
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public int mo30479c(boolean z4) {
        return C31624i.m97696b(this.f36190a.length, z4);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        c31624i.m97707f(24, z4, this.f36190a);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: g */
    public final boolean mo30474g(AbstractC11272b1 abstractC11272b1) {
        if (!(abstractC11272b1 instanceof C11274c0)) {
            return false;
        }
        return Arrays.equals(this.f36190a, ((C11274c0) abstractC11272b1).f36190a);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: h */
    public final boolean mo30475h() {
        return false;
    }

    @Override // p076d.AbstractC11272b1
    public final int hashCode() {
        return AbstractC32103e.m99883e(this.f36190a);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: j */
    public AbstractC11272b1 mo30476j() {
        return new C11281e1(this.f36190a);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m30485l(int i13) {
        byte b;
        byte[] bArr = this.f36190a;
        return bArr.length > i13 && (b = bArr[i13]) >= 48 && b <= 57;
    }
}
