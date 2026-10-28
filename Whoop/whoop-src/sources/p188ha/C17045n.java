package p188ha;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: ha.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C17045n extends AbstractC17041j {

    /* JADX INFO: renamed from: b */
    public final String f65538b;

    /* JADX INFO: renamed from: c */
    public final byte[] f65539c;

    public C17045n(String str, byte[] bArr) {
        super("PRIV");
        this.f65538b = str;
        this.f65539c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17045n.class == obj.getClass()) {
            C17045n c17045n = (C17045n) obj;
            if (Objects.equals(this.f65538b, c17045n.f65538b) && Arrays.equals(this.f65539c, c17045n.f65539c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f65538b;
        return Arrays.hashCode(this.f65539c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p188ha.AbstractC17041j
    public final String toString() {
        return this.f65528a + ": owner=" + this.f65538b;
    }
}
