package bg;

import androidx.room.AbstractC1772c1;
import b72.C2783a;
import java.util.Arrays;
import m83.AbstractC25260n;

/* JADX INFO: renamed from: bg.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C3213h extends AbstractC1772c1 {

    /* JADX INFO: renamed from: b */
    public static final C3213h f12570b = new C3213h((byte) 127, (byte) 0, (byte) 0, (byte) 1);

    /* JADX INFO: renamed from: a */
    public final byte[] f12571a;

    static {
        new C3213h((byte) 0, (byte) 0, (byte) 0, (byte) 0);
    }

    public C3213h(byte[] bArr) {
        this.f12571a = bArr;
        if (bArr.length == 4) {
            return;
        }
        throw new IllegalArgumentException(("Invalid IPv4 repr: " + bArr + "; expected 4 bytes").toString());
    }

    @Override // androidx.room.AbstractC1772c1
    /* JADX INFO: renamed from: C */
    public final boolean mo5409C() {
        return this.f12571a[0] == 127;
    }

    /* JADX INFO: renamed from: U */
    public final C3216k m9255U() {
        byte[] bArr = new byte[16];
        bArr[10] = -1;
        bArr[11] = -1;
        byte[] bArr2 = this.f12571a;
        bArr[12] = bArr2[0];
        bArr[13] = bArr2[1];
        bArr[14] = bArr2[2];
        bArr[15] = bArr2[3];
        return new C3216k(null, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C3213h.class == obj.getClass() && Arrays.equals(this.f12571a, ((C3213h) obj).f12571a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12571a);
    }

    public final String toString() {
        return AbstractC25260n.m74027C0(this.f12571a, ".", new C2783a(12), 30);
    }

    @Override // androidx.room.AbstractC1772c1
    /* JADX INFO: renamed from: y */
    public final byte[] mo5412y() {
        return this.f12571a;
    }

    public C3213h(byte b, byte b6, byte b8, byte b14) {
        this(new byte[]{b, b6, b8, b14});
    }
}
