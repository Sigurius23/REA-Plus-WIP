package p151fn;

import java.util.Arrays;

/* JADX INFO: renamed from: fn.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C14621i {

    /* JADX INFO: renamed from: e */
    public static final byte[] f53888e = {0, 0, 1};

    /* JADX INFO: renamed from: a */
    public boolean f53889a;

    /* JADX INFO: renamed from: b */
    public int f53890b;

    /* JADX INFO: renamed from: c */
    public int f53891c;

    /* JADX INFO: renamed from: d */
    public byte[] f53892d;

    /* JADX INFO: renamed from: a */
    public final void m41822a(byte[] bArr, int i13, int i14) {
        if (this.f53889a) {
            int i15 = i14 - i13;
            byte[] bArr2 = this.f53892d;
            int length = bArr2.length;
            int i16 = this.f53890b + i15;
            if (length < i16) {
                this.f53892d = Arrays.copyOf(bArr2, i16 * 2);
            }
            System.arraycopy(bArr, i13, this.f53892d, this.f53890b, i15);
            this.f53890b += i15;
        }
    }
}
