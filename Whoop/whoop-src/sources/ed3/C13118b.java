package ed3;

import m83.AbstractC25260n;

/* JADX INFO: renamed from: ed3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C13118b {

    /* JADX INFO: renamed from: c */
    public static final int[] f45384c;

    /* JADX INFO: renamed from: a */
    public byte[] f45385a = new byte[32];

    /* JADX INFO: renamed from: b */
    public int f45386b;

    static {
        int[] iArr = new int[65];
        for (int i13 = 0; i13 < 65; i13++) {
            iArr[i13] = (63 - i13) / 7;
        }
        f45384c = iArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m36717a(int i13, long j7) {
        for (int i14 = 0; i14 < i13; i14++) {
            this.f45385a[this.f45386b + i14] = (byte) ((127 & j7) | 128);
            j7 >>>= 7;
        }
        byte[] bArr = this.f45385a;
        int i15 = this.f45386b;
        bArr[i15 + i13] = (byte) j7;
        this.f45386b = i13 + 1 + i15;
    }

    /* JADX INFO: renamed from: b */
    public final void m36718b(int i13) {
        int i14 = this.f45386b + i13;
        if (i14 <= this.f45385a.length) {
            return;
        }
        byte[] bArr = new byte[Integer.highestOneBit(i14) << 1];
        AbstractC25260n.m74067h0(0, 0, 14, this.f45385a, bArr);
        this.f45385a = bArr;
    }

    /* JADX INFO: renamed from: c */
    public final void m36719c(int i13) {
        m36718b(4);
        for (int i14 = 3; -1 < i14; i14--) {
            byte[] bArr = this.f45385a;
            int i15 = this.f45386b;
            this.f45386b = i15 + 1;
            bArr[i15] = (byte) (i13 >> (i14 * 8));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m36720d(long j7) {
        m36718b(8);
        for (int i13 = 7; -1 < i13; i13--) {
            byte[] bArr = this.f45385a;
            int i14 = this.f45386b;
            this.f45386b = i14 + 1;
            bArr[i14] = (byte) (j7 >> (i13 * 8));
        }
    }
}
