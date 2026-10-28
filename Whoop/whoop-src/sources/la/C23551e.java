package la;

import p499t9.InterfaceC33646o;

/* JADX INFO: renamed from: la.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C23551e {

    /* JADX INFO: renamed from: d */
    public static final long[] f93397d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a */
    public final byte[] f93398a = new byte[8];

    /* JADX INFO: renamed from: b */
    public int f93399b;

    /* JADX INFO: renamed from: c */
    public int f93400c;

    /* JADX INFO: renamed from: a */
    public static long m68198a(int i13, boolean z4, byte[] bArr) {
        long j7 = ((long) bArr[0]) & 255;
        if (z4) {
            j7 &= ~f93397d[i13 - 1];
        }
        for (int i14 = 1; i14 < i13; i14++) {
            j7 = (j7 << 8) | (((long) bArr[i14]) & 255);
        }
        return j7;
    }

    /* JADX INFO: renamed from: b */
    public final long m68199b(InterfaceC33646o interfaceC33646o, boolean z4, boolean z13, int i13) {
        int i14;
        int i15 = this.f93399b;
        byte[] bArr = this.f93398a;
        if (i15 == 0) {
            if (!interfaceC33646o.mo3094f(bArr, 0, 1, z4)) {
                return -1L;
            }
            int i16 = bArr[0] & 255;
            int i17 = 0;
            while (true) {
                if (i17 >= 8) {
                    i14 = -1;
                    break;
                }
                if ((f93397d[i17] & ((long) i16)) != 0) {
                    i14 = i17 + 1;
                    break;
                }
                i17++;
            }
            this.f93400c = i14;
            if (i14 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f93399b = 1;
        }
        int i18 = this.f93400c;
        if (i18 > i13) {
            this.f93399b = 0;
            return -2L;
        }
        if (i18 != 1) {
            interfaceC33646o.readFully(bArr, 1, i18 - 1);
        }
        this.f93399b = 0;
        return m68198a(this.f93400c, z13, bArr);
    }
}
