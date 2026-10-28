package ce3;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import m83.AbstractC25260n;
import ne3.C26616h;
import ne3.C26624l;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37172f;

/* JADX INFO: renamed from: ce3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C4504e {

    /* JADX INFO: renamed from: a */
    public final C26616h f18144a;

    /* JADX INFO: renamed from: c */
    public boolean f18146c;

    /* JADX INFO: renamed from: g */
    public int f18150g;

    /* JADX INFO: renamed from: h */
    public int f18151h;

    /* JADX INFO: renamed from: b */
    public int f18145b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public int f18147d = 4096;

    /* JADX INFO: renamed from: e */
    public C4500c[] f18148e = new C4500c[8];

    /* JADX INFO: renamed from: f */
    public int f18149f = 7;

    public C4504e(C26616h c26616h) {
        this.f18144a = c26616h;
    }

    /* JADX INFO: renamed from: a */
    public final void m14121a(int i13) {
        int i14;
        if (i13 > 0) {
            int length = this.f18148e.length - 1;
            int i15 = 0;
            while (true) {
                i14 = this.f18149f;
                if (length < i14 || i13 <= 0) {
                    break;
                }
                C4500c c4500c = this.f18148e[length];
                AbstractC22676k.m65747g(c4500c);
                i13 -= c4500c.f18133c;
                int i16 = this.f18151h;
                C4500c c4500c2 = this.f18148e[length];
                AbstractC22676k.m65747g(c4500c2);
                this.f18151h = i16 - c4500c2.f18133c;
                this.f18150g--;
                i15++;
                length--;
            }
            C4500c[] c4500cArr = this.f18148e;
            int i17 = i14 + 1;
            System.arraycopy(c4500cArr, i17, c4500cArr, i17 + i15, this.f18150g);
            C4500c[] c4500cArr2 = this.f18148e;
            int i18 = this.f18149f + 1;
            Arrays.fill(c4500cArr2, i18, i18 + i15, (Object) null);
            this.f18149f += i15;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14122b(C4500c c4500c) {
        int i13 = c4500c.f18133c;
        int i14 = this.f18147d;
        if (i13 > i14) {
            C4500c[] c4500cArr = this.f18148e;
            AbstractC25260n.m74073n0(0, c4500cArr.length, null, c4500cArr);
            this.f18149f = this.f18148e.length - 1;
            this.f18150g = 0;
            this.f18151h = 0;
            return;
        }
        m14121a((this.f18151h + i13) - i14);
        int i15 = this.f18150g + 1;
        C4500c[] c4500cArr2 = this.f18148e;
        if (i15 > c4500cArr2.length) {
            C4500c[] c4500cArr3 = new C4500c[c4500cArr2.length * 2];
            System.arraycopy(c4500cArr2, 0, c4500cArr3, c4500cArr2.length, c4500cArr2.length);
            this.f18149f = this.f18148e.length - 1;
            this.f18148e = c4500cArr3;
        }
        int i16 = this.f18149f;
        this.f18149f = i16 - 1;
        this.f18148e[i16] = c4500c;
        this.f18150g++;
        this.f18151h += i13;
    }

    /* JADX INFO: renamed from: c */
    public final void m14123c(C26624l data) throws EOFException {
        AbstractC22676k.m65750j(data, "data");
        int[] iArr = AbstractC4499b0.f18122a;
        int iMo79253d = data.mo79253d();
        long j7 = 0;
        long j13 = 0;
        for (int i13 = 0; i13 < iMo79253d; i13++) {
            byte bMo79257i = data.mo79257i(i13);
            byte[] bArr = AbstractC37172f.f158958a;
            j13 += (long) AbstractC4499b0.f18123b[bMo79257i & 255];
        }
        int i14 = (int) ((j13 + ((long) 7)) >> 3);
        int iMo79253d2 = data.mo79253d();
        C26616h c26616h = this.f18144a;
        if (i14 >= iMo79253d2) {
            m14125e(data.mo79253d(), 127, 0);
            c26616h.m79217l1(data);
            return;
        }
        C26616h c26616h2 = new C26616h();
        int[] iArr2 = AbstractC4499b0.f18122a;
        int iMo79253d3 = data.mo79253d();
        int i15 = 0;
        for (int i16 = 0; i16 < iMo79253d3; i16++) {
            byte bMo79257i2 = data.mo79257i(i16);
            byte[] bArr2 = AbstractC37172f.f158958a;
            int i17 = bMo79257i2 & 255;
            int i18 = AbstractC4499b0.f18122a[i17];
            byte b = AbstractC4499b0.f18123b[i17];
            j7 = (j7 << b) | ((long) i18);
            i15 += b;
            while (i15 >= 8) {
                i15 -= 8;
                c26616h2.m79219m1((int) (j7 >> i15));
            }
        }
        if (i15 > 0) {
            c26616h2.m79219m1((int) ((j7 << (8 - i15)) | (255 >>> i15)));
        }
        C26624l c26624lMo79218m0 = c26616h2.mo79218m0(c26616h2.f105866x);
        m14125e(c26624lMo79218m0.mo79253d(), 127, 128);
        c26616h.m79217l1(c26624lMo79218m0);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX INFO: renamed from: d */
    public final void m14124d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.f18146c) {
            int i13 = this.f18145b;
            if (i13 < this.f18147d) {
                m14125e(i13, 31, 32);
            }
            this.f18146c = false;
            this.f18145b = Integer.MAX_VALUE;
            m14125e(this.f18147d, 31, 32);
        }
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            C4500c c4500c = (C4500c) arrayList.get(i14);
            C26624l c26624lMo79263q = c4500c.f18131a.mo79263q();
            C26624l c26624l = c4500c.f18132b;
            Integer num = (Integer) AbstractC4505f.f18153b.get(c26624lMo79263q);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    C4500c[] c4500cArr = AbstractC4505f.f18152a;
                    if (AbstractC22676k.m65745e(c4500cArr[iIntValue].f18132b, c26624l)) {
                        length = length2;
                    } else if (AbstractC22676k.m65745e(c4500cArr[length2].f18132b, c26624l)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.f18148e.length;
                for (int i15 = this.f18149f + 1; i15 < length3; i15++) {
                    C4500c c4500c2 = this.f18148e[i15];
                    AbstractC22676k.m65747g(c4500c2);
                    if (AbstractC22676k.m65745e(c4500c2.f18131a, c26624lMo79263q)) {
                        C4500c c4500c3 = this.f18148e[i15];
                        AbstractC22676k.m65747g(c4500c3);
                        if (AbstractC22676k.m65745e(c4500c3.f18132b, c26624l)) {
                            length2 = AbstractC4505f.f18152a.length + (i15 - this.f18149f);
                            break;
                        } else if (length == -1) {
                            length = (i15 - this.f18149f) + AbstractC4505f.f18152a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                m14125e(length2, 127, 128);
            } else if (length == -1) {
                this.f18144a.m79219m1(64);
                m14123c(c26624lMo79263q);
                m14123c(c26624l);
                m14122b(c4500c);
            } else {
                C26624l prefix = C4500c.f18125d;
                c26624lMo79263q.getClass();
                AbstractC22676k.m65750j(prefix, "prefix");
                if (!c26624lMo79263q.mo79260m(0, prefix.mo79253d(), prefix) || AbstractC22676k.m65745e(C4500c.f18130i, c26624lMo79263q)) {
                    m14125e(length, 63, 64);
                    m14123c(c26624l);
                    m14122b(c4500c);
                } else {
                    m14125e(length, 15, 0);
                    m14123c(c26624l);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m14125e(int i13, int i14, int i15) {
        C26616h c26616h = this.f18144a;
        if (i13 < i14) {
            c26616h.m79219m1(i13 | i15);
            return;
        }
        c26616h.m79219m1(i15 | i14);
        int i16 = i13 - i14;
        while (i16 >= 128) {
            c26616h.m79219m1(128 | (i16 & 127));
            i16 >>>= 7;
        }
        c26616h.m79219m1(i16);
    }
}
