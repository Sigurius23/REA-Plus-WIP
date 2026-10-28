package mp;

import androidx.datastore.preferences.protobuf.C1209e;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: mp.t0 */
/* JADX INFO: loaded from: classes6.dex */
public class C25801t0 implements Iterable, Serializable {

    /* JADX INFO: renamed from: y */
    public static final C25801t0 f101539y = new C25801t0(AbstractC25803u0.f101544a);

    /* JADX INFO: renamed from: w */
    public int f101540w = 0;

    /* JADX INFO: renamed from: x */
    public final byte[] f101541x;

    static {
        int i13 = AbstractC25797r0.f101530a;
    }

    public C25801t0(byte[] bArr) {
        bArr.getClass();
        this.f101541x = bArr;
    }

    /* JADX INFO: renamed from: j */
    public static int m76047j(int i13, int i14, int i15) {
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

    /* JADX INFO: renamed from: l */
    public static C25801t0 m76048l(int i13, byte[] bArr) {
        m76047j(0, i13, bArr.length);
        byte[] bArr2 = new byte[i13];
        System.arraycopy(bArr, 0, bArr2, 0, i13);
        return new C25801t0(bArr2);
    }

    /* JADX INFO: renamed from: a */
    public byte mo76039a(int i13) {
        return this.f101541x[i13];
    }

    /* JADX INFO: renamed from: c */
    public byte mo76040c(int i13) {
        return this.f101541x[i13];
    }

    /* JADX INFO: renamed from: d */
    public int mo76041d() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public int mo76042e() {
        return this.f101541x.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25801t0) || mo76042e() != ((C25801t0) obj).mo76042e()) {
            return false;
        }
        if (mo76042e() == 0) {
            return true;
        }
        if (!(obj instanceof C25801t0)) {
            return obj.equals(this);
        }
        C25801t0 c25801t0 = (C25801t0) obj;
        int i13 = this.f101540w;
        int i14 = c25801t0.f101540w;
        if (i13 != 0 && i14 != 0 && i13 != i14) {
            return false;
        }
        int iMo76042e = mo76042e();
        if (iMo76042e > c25801t0.mo76042e()) {
            throw new IllegalArgumentException("Length too large: " + iMo76042e + mo76042e());
        }
        if (iMo76042e > c25801t0.mo76042e()) {
            throw new IllegalArgumentException(AbstractC2875y.m8294g(iMo76042e, c25801t0.mo76042e(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = c25801t0.f101541x;
        int iMo76041d = mo76041d() + iMo76042e;
        int iMo76041d2 = mo76041d();
        int iMo76041d3 = c25801t0.mo76041d();
        while (iMo76041d2 < iMo76041d) {
            if (this.f101541x[iMo76041d2] != bArr[iMo76041d3]) {
                return false;
            }
            iMo76041d2++;
            iMo76041d3++;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void mo76043f(int i13, byte[] bArr) {
        System.arraycopy(this.f101541x, 0, bArr, 0, i13);
    }

    /* JADX INFO: renamed from: g */
    public final ByteArrayInputStream m76049g() {
        return new ByteArrayInputStream(this.f101541x, mo76041d(), mo76042e());
    }

    public final int hashCode() {
        int i13 = this.f101540w;
        if (i13 != 0) {
            return i13;
        }
        int iMo76042e = mo76042e();
        int iMo76041d = mo76041d();
        byte[] bArr = AbstractC25803u0.f101544a;
        int i14 = iMo76042e;
        for (int i15 = iMo76041d; i15 < iMo76041d + iMo76042e; i15++) {
            i14 = (i14 * 31) + this.f101541x[i15];
        }
        if (i14 == 0) {
            i14 = 1;
        }
        this.f101540w = i14;
        return i14;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C1209e(this);
    }

    /* JADX INFO: renamed from: m */
    public final byte[] m76050m() {
        int iMo76042e = mo76042e();
        if (iMo76042e == 0) {
            return AbstractC25803u0.f101544a;
        }
        byte[] bArr = new byte[iMo76042e];
        mo76043f(iMo76042e, bArr);
        return bArr;
    }

    public final String toString() {
        C25801t0 c25799s0;
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo76042e = mo76042e();
        if (mo76042e() <= 50) {
            strConcat = AbstractC25753b.m75992d(this);
        } else {
            int iM76047j = m76047j(0, 47, mo76042e());
            if (iM76047j == 0) {
                c25799s0 = f101539y;
            } else {
                c25799s0 = new C25799s0(this.f101541x, mo76041d(), iM76047j);
            }
            strConcat = AbstractC25753b.m75992d(c25799s0).concat("...");
        }
        return AbstractC25012a.m73376i(strConcat, "\">", AbstractC11266d.m30467u(iMo76042e, "<ByteString@", hexString, " size=", " contents=\""));
    }
}
