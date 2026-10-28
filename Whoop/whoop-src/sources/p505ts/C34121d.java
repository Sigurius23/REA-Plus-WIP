package p505ts;

import ih0.AbstractC18489d0;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import p347ns.AbstractC27099t;

/* JADX INFO: renamed from: ts.d */
/* JADX INFO: loaded from: classes.dex */
public final class C34121d extends AbstractC27099t {

    /* JADX INFO: renamed from: a */
    public final int f143037a;

    public C34121d(int i13) {
        this.f143037a = i13;
    }

    /* JADX INFO: renamed from: b */
    public static C34121d m107852b(int i13) {
        if (i13 == 16 || i13 == 32) {
            return new C34121d(i13);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i13 * 8)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C34121d) && ((C34121d) obj).f143037a == this.f143037a;
    }

    public final int hashCode() {
        return Objects.hash(C34121d.class, Integer.valueOf(this.f143037a));
    }

    public final String toString() {
        return AbstractC18489d0.m53371l(new StringBuilder("AesCmac PRF Parameters ("), this.f143037a, "-byte key)");
    }
}
