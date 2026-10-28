package p151fn;

import java.util.Arrays;

/* JADX INFO: renamed from: fn.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C14623k {

    /* JADX INFO: renamed from: f */
    public static final byte[] f53910f = {0, 0, 1};

    /* JADX INFO: renamed from: a */
    public boolean f53911a;

    /* JADX INFO: renamed from: b */
    public int f53912b;

    /* JADX INFO: renamed from: c */
    public int f53913c;

    /* JADX INFO: renamed from: d */
    public int f53914d;

    /* JADX INFO: renamed from: e */
    public byte[] f53915e;

    /* JADX INFO: renamed from: a */
    public final void m41823a(byte[] bArr, int i13, int i14) {
        if (this.f53911a) {
            int i15 = i14 - i13;
            byte[] bArr2 = this.f53915e;
            int length = bArr2.length;
            int i16 = this.f53913c + i15;
            if (length < i16) {
                this.f53915e = Arrays.copyOf(bArr2, i16 * 2);
            }
            System.arraycopy(bArr, i13, this.f53915e, this.f53913c, i15);
            this.f53913c += i15;
        }
    }
}
