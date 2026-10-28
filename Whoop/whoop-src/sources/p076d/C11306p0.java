package p076d;

import java.util.Arrays;
import s30.AbstractC32103e;

/* JADX INFO: renamed from: d.p0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11306p0 {

    /* JADX INFO: renamed from: a */
    public final int f36236a;

    /* JADX INFO: renamed from: b */
    public final byte[] f36237b;

    public C11306p0(byte[] bArr) {
        this.f36236a = AbstractC32103e.m99883e(bArr);
        this.f36237b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11306p0)) {
            return false;
        }
        return Arrays.equals(this.f36237b, ((C11306p0) obj).f36237b);
    }

    public final int hashCode() {
        return this.f36236a;
    }
}
