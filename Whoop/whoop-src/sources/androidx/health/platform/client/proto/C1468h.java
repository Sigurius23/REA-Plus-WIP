package androidx.health.platform.client.proto;

import androidx.datastore.preferences.protobuf.C1209e;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.h */
/* JADX INFO: loaded from: classes5.dex */
public class C1468h implements Iterable, Serializable {

    /* JADX INFO: renamed from: y */
    public static final C1468h f6044y = new C1468h(AbstractC1549x0.f6151b);

    /* JADX INFO: renamed from: z */
    public static final C1458f f6045z;

    /* JADX INFO: renamed from: w */
    public int f6046w = 0;

    /* JADX INFO: renamed from: x */
    public final byte[] f6047x;

    static {
        f6045z = AbstractC1443c.m4578a() ? new C1458f(1) : new C1458f(0);
    }

    public C1468h(byte[] bArr) {
        bArr.getClass();
        this.f6047x = bArr;
    }

    /* JADX INFO: renamed from: c */
    public static int m4630c(int i13, int i14, int i15) {
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
    public static C1468h m4631d(byte[] bArr, int i13, int i14) {
        byte[] bArrCopyOfRange;
        m4630c(i13, i13 + i14, bArr.length);
        switch (f6045z.f6037a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14 + i13);
                break;
            default:
                bArrCopyOfRange = new byte[i14];
                System.arraycopy(bArr, i13, bArrCopyOfRange, 0, i14);
                break;
        }
        return new C1468h(bArrCopyOfRange);
    }

    /* JADX INFO: renamed from: a */
    public byte mo4609a(int i13) {
        return this.f6047x[i13];
    }

    /* JADX INFO: renamed from: e */
    public int mo4610e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1468h) || size() != ((C1468h) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C1468h)) {
            return obj.equals(this);
        }
        C1468h c1468h = (C1468h) obj;
        int i13 = this.f6046w;
        int i14 = c1468h.f6046w;
        if (i13 != 0 && i14 != 0 && i13 != i14) {
            return false;
        }
        int size = size();
        if (size > c1468h.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c1468h.size()) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(size, "Ran off end of other: 0, ", ", ");
            sbM30466t.append(c1468h.size());
            throw new IllegalArgumentException(sbM30466t.toString());
        }
        byte[] bArr = c1468h.f6047x;
        int iMo4610e = mo4610e() + size;
        int iMo4610e2 = mo4610e();
        int iMo4610e3 = c1468h.mo4610e();
        while (iMo4610e2 < iMo4610e) {
            if (this.f6047x[iMo4610e2] != bArr[iMo4610e3]) {
                return false;
            }
            iMo4610e2++;
            iMo4610e3++;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public byte mo4611f(int i13) {
        return this.f6047x[i13];
    }

    public final int hashCode() {
        int i13 = this.f6046w;
        if (i13 != 0) {
            return i13;
        }
        int size = size();
        int iMo4610e = mo4610e();
        int i14 = size;
        for (int i15 = iMo4610e; i15 < iMo4610e + size; i15++) {
            i14 = (i14 * 31) + this.f6047x[i15];
        }
        if (i14 == 0) {
            i14 = 1;
        }
        this.f6046w = i14;
        return i14;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1209e(this);
    }

    public int size() {
        return this.f6047x.length;
    }

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = AbstractC1559z2.m4963p(this);
        } else {
            StringBuilder sb4 = new StringBuilder();
            int iM4630c = m4630c(0, 47, size());
            sb4.append(AbstractC1559z2.m4963p(iM4630c == 0 ? f6044y : new C1463g(this.f6047x, mo4610e(), iM4630c)));
            sb4.append("...");
            string = sb4.toString();
        }
        return AbstractC25012a.m73376i(string, "\">", AbstractC11266d.m30467u(size, "<ByteString@", hexString, " size=", " contents=\""));
    }
}
