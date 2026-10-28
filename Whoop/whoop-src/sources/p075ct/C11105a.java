package p075ct;

import java.util.Arrays;
import se.AbstractC32410a;

/* JADX INFO: renamed from: ct.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11105a {

    /* JADX INFO: renamed from: a */
    public final byte[] f35302a;

    public C11105a(byte[] bArr, int i13) {
        byte[] bArr2 = new byte[i13];
        this.f35302a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i13);
    }

    /* JADX INFO: renamed from: a */
    public static C11105a m30034a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (length > bArr.length) {
            length = bArr.length;
        }
        return new C11105a(bArr, length);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m30035b() {
        byte[] bArr = this.f35302a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11105a) {
            return Arrays.equals(((C11105a) obj).f35302a, this.f35302a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f35302a);
    }

    public final String toString() {
        return "Bytes(" + AbstractC32410a.m101003K(this.f35302a) + ")";
    }
}
