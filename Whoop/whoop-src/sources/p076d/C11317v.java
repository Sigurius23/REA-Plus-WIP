package p076d;

import java.io.IOException;
import java.util.Arrays;
import ro.C31624i;
import s30.AbstractC32103e;

/* JADX INFO: renamed from: d.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C11317v extends AbstractC11272b1 {

    /* JADX INFO: renamed from: b */
    public static final C11317v[] f36264b = new C11317v[12];

    /* JADX INFO: renamed from: a */
    public final byte[] f36265a;

    public C11317v(byte[] bArr) {
        if (C11294j0.m30509l(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        int i13 = 0;
        if ((bArr[0] & 128) != 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.f36265a = (byte[]) bArr.clone();
        int length = bArr.length - 1;
        while (i13 < length) {
            byte b = bArr[i13];
            i13++;
            if (b != (bArr[i13] >> 7)) {
                return;
            }
        }
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        return C31624i.m97696b(this.f36265a.length, z4);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        c31624i.m97707f(10, z4, this.f36265a);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: g */
    public final boolean mo30474g(AbstractC11272b1 abstractC11272b1) {
        if (abstractC11272b1 instanceof C11317v) {
            return Arrays.equals(this.f36265a, ((C11317v) abstractC11272b1).f36265a);
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
        return AbstractC32103e.m99883e(this.f36265a);
    }
}
