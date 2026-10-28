package ce3;

import java.io.IOException;
import java.util.ArrayList;
import m83.AbstractC25260n;
import ne3.AbstractC26604b;
import ne3.C26616h;
import ne3.C26621j0;
import ne3.C26624l;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37172f;

/* JADX INFO: renamed from: ce3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C4502d {

    /* JADX INFO: renamed from: c */
    public final C26621j0 f18137c;

    /* JADX INFO: renamed from: f */
    public int f18140f;

    /* JADX INFO: renamed from: g */
    public int f18141g;

    /* JADX INFO: renamed from: a */
    public int f18135a = 4096;

    /* JADX INFO: renamed from: b */
    public final ArrayList f18136b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public C4500c[] f18138d = new C4500c[8];

    /* JADX INFO: renamed from: e */
    public int f18139e = 7;

    public C4502d(C4519t c4519t) {
        this.f18137c = AbstractC26604b.m79158c(c4519t);
    }

    /* JADX INFO: renamed from: a */
    public final int m14113a(int i13) {
        int i14;
        int i15 = 0;
        if (i13 > 0) {
            int length = this.f18138d.length;
            while (true) {
                length--;
                i14 = this.f18139e;
                if (length < i14 || i13 <= 0) {
                    break;
                }
                C4500c c4500c = this.f18138d[length];
                AbstractC22676k.m65747g(c4500c);
                int i16 = c4500c.f18133c;
                i13 -= i16;
                this.f18141g -= i16;
                this.f18140f--;
                i15++;
            }
            C4500c[] c4500cArr = this.f18138d;
            System.arraycopy(c4500cArr, i14 + 1, c4500cArr, i14 + 1 + i15, this.f18140f);
            this.f18139e += i15;
        }
        return i15;
    }

    /* JADX INFO: renamed from: b */
    public final C26624l m14114b(int i13) throws IOException {
        if (i13 >= 0) {
            C4500c[] c4500cArr = AbstractC4505f.f18152a;
            if (i13 <= c4500cArr.length - 1) {
                return c4500cArr[i13].f18131a;
            }
        }
        int length = this.f18139e + 1 + (i13 - AbstractC4505f.f18152a.length);
        if (length >= 0) {
            C4500c[] c4500cArr2 = this.f18138d;
            if (length < c4500cArr2.length) {
                C4500c c4500c = c4500cArr2[length];
                AbstractC22676k.m65747g(c4500c);
                return c4500c.f18131a;
            }
        }
        throw new IOException("Header index too large " + (i13 + 1));
    }

    /* JADX INFO: renamed from: c */
    public final void m14115c(C4500c c4500c) {
        this.f18136b.add(c4500c);
        int i13 = c4500c.f18133c;
        int i14 = this.f18135a;
        if (i13 > i14) {
            C4500c[] c4500cArr = this.f18138d;
            AbstractC25260n.m74073n0(0, c4500cArr.length, null, c4500cArr);
            this.f18139e = this.f18138d.length - 1;
            this.f18140f = 0;
            this.f18141g = 0;
            return;
        }
        m14113a((this.f18141g + i13) - i14);
        int i15 = this.f18140f + 1;
        C4500c[] c4500cArr2 = this.f18138d;
        if (i15 > c4500cArr2.length) {
            C4500c[] c4500cArr3 = new C4500c[c4500cArr2.length * 2];
            System.arraycopy(c4500cArr2, 0, c4500cArr3, c4500cArr2.length, c4500cArr2.length);
            this.f18139e = this.f18138d.length - 1;
            this.f18138d = c4500cArr3;
        }
        int i16 = this.f18139e;
        this.f18139e = i16 - 1;
        this.f18138d[i16] = c4500c;
        this.f18140f++;
        this.f18141g += i13;
    }

    /* JADX INFO: renamed from: d */
    public final C26624l m14116d() {
        C26621j0 source = this.f18137c;
        byte b = source.readByte();
        byte[] bArr = AbstractC37172f.f158958a;
        int i13 = b & 255;
        int i14 = 0;
        boolean z4 = (b & 128) == 128;
        long jM14117e = m14117e(i13, 127);
        if (!z4) {
            return source.mo79218m0(jM14117e);
        }
        C26616h c26616h = new C26616h();
        int[] iArr = AbstractC4499b0.f18122a;
        AbstractC22676k.m65750j(source, "source");
        C4497a0 c4497a0 = AbstractC4499b0.f18124c;
        C4497a0 c4497a1 = c4497a0;
        int i15 = 0;
        for (long j7 = 0; j7 < jM14117e; j7++) {
            byte b6 = source.readByte();
            byte[] bArr2 = AbstractC37172f.f158958a;
            i14 = (i14 << 8) | (b6 & 255);
            i15 += 8;
            while (i15 >= 8) {
                C4497a0[] c4497a0Arr = (C4497a0[]) c4497a1.f18120y;
                AbstractC22676k.m65747g(c4497a0Arr);
                c4497a1 = c4497a0Arr[(i14 >>> (i15 - 8)) & 255];
                AbstractC22676k.m65747g(c4497a1);
                if (((C4497a0[]) c4497a1.f18120y) == null) {
                    c26616h.m79219m1(c4497a1.f18118w);
                    i15 -= c4497a1.f18119x;
                    c4497a1 = c4497a0;
                } else {
                    i15 -= 8;
                }
            }
        }
        while (i15 > 0) {
            C4497a0[] c4497a0Arr2 = (C4497a0[]) c4497a1.f18120y;
            AbstractC22676k.m65747g(c4497a0Arr2);
            C4497a0 c4497a2 = c4497a0Arr2[(i14 << (8 - i15)) & 255];
            AbstractC22676k.m65747g(c4497a2);
            int i16 = c4497a2.f18119x;
            if (((C4497a0[]) c4497a2.f18120y) != null || i16 > i15) {
                break;
            }
            c26616h.m79219m1(c4497a2.f18118w);
            i15 -= i16;
            c4497a1 = c4497a0;
        }
        return c26616h.mo79218m0(c26616h.f105866x);
    }

    /* JADX INFO: renamed from: e */
    public final int m14117e(int i13, int i14) {
        int i15 = i13 & i14;
        if (i15 < i14) {
            return i15;
        }
        int i16 = 0;
        while (true) {
            byte b = this.f18137c.readByte();
            byte[] bArr = AbstractC37172f.f158958a;
            int i17 = b & 255;
            if ((b & 128) == 0) {
                return i14 + (i17 << i16);
            }
            i14 += (b & 127) << i16;
            i16 += 7;
        }
    }
}
