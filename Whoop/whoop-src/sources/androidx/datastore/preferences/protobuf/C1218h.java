package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import kr.C22786e;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p048ce.AbstractC4482w;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h */
/* JADX INFO: loaded from: classes.dex */
public class C1218h implements Iterable, Serializable {

    /* JADX INFO: renamed from: y */
    public static final C1218h f5398y = new C1218h(AbstractC1204c0.f5363b);

    /* JADX INFO: renamed from: z */
    public static final InterfaceC1215g f5399z;

    /* JADX INFO: renamed from: w */
    public int f5400w = 0;

    /* JADX INFO: renamed from: x */
    public final byte[] f5401x;

    static {
        f5399z = AbstractC1203c.m3787a() ? new C1221i() : new C22786e(6);
    }

    public C1218h(byte[] bArr) {
        bArr.getClass();
        this.f5401x = bArr;
    }

    /* JADX INFO: renamed from: c */
    public static int m3807c(int i13, int i14, int i15) {
        int i16 = i14 - i13;
        if ((i13 | i14 | i16 | (i15 - i14)) >= 0) {
            return i16;
        }
        if (i13 < 0) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8296i(i13, "Beginning index: ", " < 0"));
        }
        if (i14 < i13) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i14, i15, "End index: ", " >= "));
    }

    /* JADX INFO: renamed from: d */
    public static C1218h m3808d(byte[] bArr, int i13, int i14) {
        m3807c(i13, i13 + i14, bArr.length);
        return new C1218h(f5399z.mo3806a(bArr, i13, i14));
    }

    /* JADX INFO: renamed from: a */
    public byte mo3797a(int i13) {
        return this.f5401x[i13];
    }

    /* JADX INFO: renamed from: e */
    public void mo3798e(int i13, byte[] bArr) {
        System.arraycopy(this.f5401x, 0, bArr, 0, i13);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1218h) || size() != ((C1218h) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C1218h)) {
            return obj.equals(this);
        }
        C1218h c1218h = (C1218h) obj;
        int i13 = this.f5400w;
        int i14 = c1218h.f5400w;
        if (i13 != 0 && i14 != 0 && i13 != i14) {
            return false;
        }
        int size = size();
        if (size > c1218h.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c1218h.size()) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(size, "Ran off end of other: 0, ", ", ");
            sbM30466t.append(c1218h.size());
            throw new IllegalArgumentException(sbM30466t.toString());
        }
        byte[] bArr = c1218h.f5401x;
        int iMo3799f = mo3799f() + size;
        int iMo3799f2 = mo3799f();
        int iMo3799f3 = c1218h.mo3799f();
        while (iMo3799f2 < iMo3799f) {
            if (this.f5401x[iMo3799f2] != bArr[iMo3799f3]) {
                return false;
            }
            iMo3799f2++;
            iMo3799f3++;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public int mo3799f() {
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public byte mo3800g(int i13) {
        return this.f5401x[i13];
    }

    public final int hashCode() {
        int i13 = this.f5400w;
        if (i13 != 0) {
            return i13;
        }
        int size = size();
        int iMo3799f = mo3799f();
        int i14 = size;
        for (int i15 = iMo3799f; i15 < iMo3799f + size; i15++) {
            i14 = (i14 * 31) + this.f5401x[i15];
        }
        if (i14 == 0) {
            i14 = 1;
        }
        this.f5400w = i14;
        return i14;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1209e(this);
    }

    public int size() {
        return this.f5401x.length;
    }

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = AbstractC4482w.m13972H(this);
        } else {
            StringBuilder sb4 = new StringBuilder();
            int iM3807c = m3807c(0, 47, size());
            sb4.append(AbstractC4482w.m13972H(iM3807c == 0 ? f5398y : new C1212f(this.f5401x, mo3799f(), iM3807c)));
            sb4.append("...");
            string = sb4.toString();
        }
        return AbstractC25012a.m73376i(string, "\">", AbstractC11266d.m30467u(size, "<ByteString@", hexString, " size=", " contents=\""));
    }
}
