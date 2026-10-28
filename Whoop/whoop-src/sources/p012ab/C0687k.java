package p012ab;

import java.util.Arrays;

/* JADX INFO: renamed from: ab.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C0687k {

    /* JADX INFO: renamed from: e */
    public static final byte[] f2465e = {0, 0, 1};

    /* JADX INFO: renamed from: a */
    public boolean f2466a;

    /* JADX INFO: renamed from: b */
    public int f2467b;

    /* JADX INFO: renamed from: c */
    public int f2468c;

    /* JADX INFO: renamed from: d */
    public byte[] f2469d;

    /* JADX INFO: renamed from: a */
    public final void m1730a(byte[] bArr, int i13, int i14) {
        if (this.f2466a) {
            int i15 = i14 - i13;
            byte[] bArr2 = this.f2469d;
            int length = bArr2.length;
            int i16 = this.f2467b + i15;
            if (length < i16) {
                this.f2469d = Arrays.copyOf(bArr2, i16 * 2);
            }
            System.arraycopy(bArr, i13, this.f2469d, this.f2467b, i15);
            this.f2467b += i15;
        }
    }
}
