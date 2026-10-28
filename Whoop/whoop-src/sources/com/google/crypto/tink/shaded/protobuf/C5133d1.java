package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import p522uf.AbstractC34870c0;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5133d1 {

    /* JADX INFO: renamed from: f */
    public static final C5133d1 f21499f = new C5133d1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f21500a;

    /* JADX INFO: renamed from: b */
    public int[] f21501b;

    /* JADX INFO: renamed from: c */
    public Object[] f21502c;

    /* JADX INFO: renamed from: d */
    public int f21503d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f21504e;

    public C5133d1(int i13, int[] iArr, Object[] objArr, boolean z4) {
        this.f21500a = i13;
        this.f21501b = iArr;
        this.f21502c = objArr;
        this.f21504e = z4;
    }

    /* JADX INFO: renamed from: c */
    public static C5133d1 m16158c() {
        return new C5133d1(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final void m16159a(int i13) {
        int[] iArr = this.f21501b;
        if (i13 > iArr.length) {
            int i14 = this.f21500a;
            int i15 = (i14 / 2) + i14;
            if (i15 >= i13) {
                i13 = i15;
            }
            if (i13 < 8) {
                i13 = 8;
            }
            this.f21501b = Arrays.copyOf(iArr, i13);
            this.f21502c = Arrays.copyOf(this.f21502c, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m16160b() {
        int iM16261o0;
        int i13 = this.f21503d;
        if (i13 != -1) {
            return i13;
        }
        int iM16160b = 0;
        for (int i14 = 0; i14 < this.f21500a; i14++) {
            int i15 = this.f21501b[i14];
            int iM109986V = AbstractC34870c0.m109986V(i15);
            int iM109987W = AbstractC34870c0.m109987W(i15);
            if (iM109987W == 0) {
                iM16261o0 = C5158m.m16261o0(iM109986V, ((Long) this.f21502c[i14]).longValue());
            } else if (iM109987W == 1) {
                ((Long) this.f21502c[i14]).getClass();
                iM16261o0 = C5158m.m16256j0(iM109986V);
            } else if (iM109987W != 2) {
                if (iM109987W == 3) {
                    iM16160b = ((C5133d1) this.f21502c[i14]).m16160b() + (C5158m.m16259m0(iM109986V) * 2) + iM16160b;
                } else {
                    if (iM109987W != 5) {
                        int i16 = InvalidProtocolBufferException.f21476x;
                        throw new IllegalStateException(new InvalidProtocolBufferException.InvalidWireTypeException());
                    }
                    ((Integer) this.f21502c[i14]).getClass();
                    iM16261o0 = C5158m.m16255i0(iM109986V);
                }
            } else {
                iM16261o0 = C5158m.m16254h0(iM109986V, (AbstractC5146i) this.f21502c[i14]);
            }
            iM16160b = iM16261o0 + iM16160b;
        }
        this.f21503d = iM16160b;
        return iM16160b;
    }

    /* JADX INFO: renamed from: d */
    public final void m16161d(int i13, Object obj) {
        if (!this.f21504e) {
            throw new UnsupportedOperationException();
        }
        m16159a(this.f21500a + 1);
        int[] iArr = this.f21501b;
        int i14 = this.f21500a;
        iArr[i14] = i13;
        this.f21502c[i14] = obj;
        this.f21500a = i14 + 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m16162e(C5153k0 c5153k0) {
        if (this.f21500a == 0) {
            return;
        }
        c5153k0.getClass();
        for (int i13 = 0; i13 < this.f21500a; i13++) {
            int i14 = this.f21501b[i13];
            Object obj = this.f21502c[i13];
            int iM109986V = AbstractC34870c0.m109986V(i14);
            int iM109987W = AbstractC34870c0.m109987W(i14);
            if (iM109987W == 0) {
                c5153k0.m16213g(iM109986V, ((Long) obj).longValue());
            } else if (iM109987W == 1) {
                c5153k0.m16211e(iM109986V, ((Long) obj).longValue());
            } else if (iM109987W == 2) {
                c5153k0.m16208b(iM109986V, (AbstractC5146i) obj);
            } else if (iM109987W == 3) {
                c5153k0.m16215i(iM109986V);
                ((C5133d1) obj).m16162e(c5153k0);
                c5153k0.m16209c(iM109986V);
            } else {
                if (iM109987W != 5) {
                    int i15 = InvalidProtocolBufferException.f21476x;
                    throw new RuntimeException(new InvalidProtocolBufferException.InvalidWireTypeException());
                }
                c5153k0.m16210d(iM109986V, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5133d1)) {
            return false;
        }
        C5133d1 c5133d1 = (C5133d1) obj;
        int i13 = this.f21500a;
        if (i13 == c5133d1.f21500a) {
            int[] iArr = this.f21501b;
            int[] iArr2 = c5133d1.f21501b;
            for (int i14 = 0; i14 < i13; i14++) {
                if (iArr[i14] == iArr2[i14]) {
                }
            }
            Object[] objArr = this.f21502c;
            Object[] objArr2 = c5133d1.f21502c;
            int i15 = this.f21500a;
            for (int i16 = 0; i16 < i15; i16++) {
                if (objArr[i16].equals(objArr2[i16])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i13 = this.f21500a;
        int i14 = (527 + i13) * 31;
        int[] iArr = this.f21501b;
        int iHashCode = 17;
        int i15 = 17;
        for (int i16 = 0; i16 < i13; i16++) {
            i15 = (i15 * 31) + iArr[i16];
        }
        int i17 = (i14 + i15) * 31;
        Object[] objArr = this.f21502c;
        int i18 = this.f21500a;
        for (int i19 = 0; i19 < i18; i19++) {
            iHashCode = (iHashCode * 31) + objArr[i19].hashCode();
        }
        return i17 + iHashCode;
    }
}
