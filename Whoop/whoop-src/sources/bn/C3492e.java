package bn;

import p588wm.InterfaceC37368j;

/* JADX INFO: renamed from: bn.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C3492e {

    /* JADX INFO: renamed from: d */
    public static final long[] f13845d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a */
    public final byte[] f13846a = new byte[8];

    /* JADX INFO: renamed from: b */
    public int f13847b;

    /* JADX INFO: renamed from: c */
    public int f13848c;

    /* JADX INFO: renamed from: a */
    public static long m10296a(int i13, boolean z4, byte[] bArr) {
        long j7 = ((long) bArr[0]) & 255;
        if (z4) {
            j7 &= ~f13845d[i13 - 1];
        }
        for (int i14 = 1; i14 < i13; i14++) {
            j7 = (j7 << 8) | (((long) bArr[i14]) & 255);
        }
        return j7;
    }

    /* JADX INFO: renamed from: b */
    public final long m10297b(InterfaceC37368j interfaceC37368j, boolean z4, boolean z13, int i13) {
        int i14;
        int i15 = this.f13847b;
        byte[] bArr = this.f13846a;
        if (i15 == 0) {
            if (!interfaceC37368j.mo3094f(bArr, 0, 1, z4)) {
                return -1L;
            }
            int i16 = bArr[0] & 255;
            int i17 = 0;
            while (true) {
                if (i17 >= 8) {
                    i14 = -1;
                    break;
                }
                if ((f13845d[i17] & ((long) i16)) != 0) {
                    i14 = i17 + 1;
                    break;
                }
                i17++;
            }
            this.f13848c = i14;
            if (i14 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f13847b = 1;
        }
        int i18 = this.f13848c;
        if (i18 > i13) {
            this.f13847b = 0;
            return -2L;
        }
        if (i18 != 1) {
            interfaceC37368j.readFully(bArr, 1, i18 - 1);
        }
        this.f13847b = 0;
        return m10296a(this.f13848c, z13, bArr);
    }
}
