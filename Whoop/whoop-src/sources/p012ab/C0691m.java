package p012ab;

import java.util.Arrays;

/* JADX INFO: renamed from: ab.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C0691m {

    /* JADX INFO: renamed from: f */
    public static final byte[] f2496f = {0, 0, 1};

    /* JADX INFO: renamed from: a */
    public boolean f2497a;

    /* JADX INFO: renamed from: b */
    public int f2498b;

    /* JADX INFO: renamed from: c */
    public int f2499c;

    /* JADX INFO: renamed from: d */
    public int f2500d;

    /* JADX INFO: renamed from: e */
    public byte[] f2501e;

    /* JADX INFO: renamed from: a */
    public final void m1746a(byte[] bArr, int i13, int i14) {
        if (this.f2497a) {
            int i15 = i14 - i13;
            byte[] bArr2 = this.f2501e;
            int length = bArr2.length;
            int i16 = this.f2499c + i15;
            if (length < i16) {
                this.f2501e = Arrays.copyOf(bArr2, i16 * 2);
            }
            System.arraycopy(bArr, i13, this.f2501e, this.f2499c, i15);
            this.f2499c += i15;
        }
    }
}
