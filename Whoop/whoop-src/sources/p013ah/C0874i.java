package p013ah;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: renamed from: ah.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C0874i extends AbstractC0869d {

    /* JADX INFO: renamed from: c */
    public final BigInteger f3167c;

    public C0874i(int i13, BigInteger bigInteger) {
        super(i13);
        Objects.requireNonNull(bigInteger);
        this.f3167c = bigInteger;
    }

    @Override // p013ah.AbstractC0869d
    public final boolean equals(Object obj) {
        if (obj instanceof C0874i) {
            C0874i c0874i = (C0874i) obj;
            if (super.equals(obj) && this.f3167c.equals(c0874i.f3167c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p013ah.AbstractC0869d
    public final int hashCode() {
        return super.hashCode() ^ this.f3167c.hashCode();
    }

    public final String toString() {
        return this.f3167c.toString();
    }
}
