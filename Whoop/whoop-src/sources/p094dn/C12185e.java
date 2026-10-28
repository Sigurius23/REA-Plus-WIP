package p094dn;

import com.google.android.material.textfield.C5057p;
import ed3.C13117a;
import j93.AbstractC21478l0;
import java.util.NoSuchElementException;
import na.InterfaceC26489b;
import p000.AbstractC11266d;
import p002a0.C0028i;
import p031b9.AbstractC2875y;
import p294l3.C23254g;
import p294l3.C23283u0;
import p448r3.AbstractC30895a;
import p550vd.AbstractC35902e;
import p607x8.C38059n;
import p641y8.C39309d;

/* JADX INFO: renamed from: dn.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C12185e implements InterfaceC12184d, InterfaceC26489b {

    /* JADX INFO: renamed from: E */
    public int f40621E;

    /* JADX INFO: renamed from: F */
    public Object f40622F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40623w;

    /* JADX INFO: renamed from: x */
    public int f40624x;

    /* JADX INFO: renamed from: y */
    public int f40625y;

    /* JADX INFO: renamed from: z */
    public int f40626z;

    public C12185e(C23254g c23254g, long j7) {
        this.f40623w = 3;
        String str = c23254g.f92135x;
        C5057p c5057p = new C5057p();
        c5057p.f21239d = str;
        c5057p.f21237b = -1;
        c5057p.f21238c = -1;
        this.f40622F = c5057p;
        this.f40624x = C23283u0.m67360f(j7);
        this.f40625y = C23283u0.m67359e(j7);
        this.f40626z = -1;
        this.f40621E = -1;
        int iM67360f = C23283u0.m67360f(j7);
        int iM67359e = C23283u0.m67359e(j7);
        if (iM67360f < 0 || iM67360f > str.length()) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(iM67360f, "start (", ") offset is outside of text region ");
            sbM30466t.append(str.length());
            throw new IndexOutOfBoundsException(sbM30466t.toString());
        }
        if (iM67359e < 0 || iM67359e > str.length()) {
            StringBuilder sbM30466t2 = AbstractC11266d.m30466t(iM67359e, "end (", ") offset is outside of text region ");
            sbM30466t2.append(str.length());
            throw new IndexOutOfBoundsException(sbM30466t2.toString());
        }
        if (iM67360f > iM67359e) {
            throw new IllegalArgumentException(AbstractC2875y.m8294g(iM67360f, iM67359e, "Do not set reversed range: ", " > "));
        }
    }

    @Override // p094dn.InterfaceC12184d, na.InterfaceC26489b
    /* JADX INFO: renamed from: a */
    public int mo15739a() {
        switch (this.f40623w) {
            case 0:
                C13117a c13117a = (C13117a) this.f40622F;
                int i13 = this.f40625y;
                if (i13 == 8) {
                    return c13117a.m36715y();
                }
                if (i13 == 16) {
                    return c13117a.m36682D();
                }
                int i14 = this.f40626z;
                this.f40626z = i14 + 1;
                if (i14 % 2 != 0) {
                    return this.f40621E & 15;
                }
                int iM36715y = c13117a.m36715y();
                this.f40621E = iM36715y;
                return (iM36715y & 240) >> 4;
            default:
                C38059n c38059n = (C38059n) this.f40622F;
                int i15 = this.f40625y;
                if (i15 == 8) {
                    return c38059n.m121867t();
                }
                if (i15 == 16) {
                    return c38059n.m121873z();
                }
                int i16 = this.f40626z;
                this.f40626z = i16 + 1;
                if (i16 % 2 != 0) {
                    return this.f40621E & 15;
                }
                int iM121867t = c38059n.m121867t();
                this.f40621E = iM121867t;
                return (iM121867t & 240) >> 4;
        }
    }

    @Override // p094dn.InterfaceC12184d, na.InterfaceC26489b
    /* JADX INFO: renamed from: b */
    public int mo15740b() {
        switch (this.f40623w) {
        }
        return -1;
    }

    @Override // p094dn.InterfaceC12184d, na.InterfaceC26489b
    /* JADX INFO: renamed from: c */
    public int mo15741c() {
        switch (this.f40623w) {
            case 0:
                break;
        }
        return this.f40624x;
    }

    /* JADX INFO: renamed from: d */
    public void m33785d(int i13) {
        int i14 = this.f40626z;
        int[] iArr = (int[]) this.f40622F;
        if (i14 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i15 = this.f40624x;
            int i16 = length2 - i15;
            System.arraycopy(iArr, i15, iArr2, 0, i16);
            System.arraycopy((int[]) this.f40622F, 0, iArr2, i16, i15);
            this.f40624x = 0;
            this.f40625y = this.f40626z - 1;
            this.f40622F = iArr2;
            this.f40621E = length - 1;
        }
        int i17 = (this.f40625y + 1) & this.f40621E;
        this.f40625y = i17;
        ((int[]) this.f40622F)[i17] = i13;
        this.f40626z++;
    }

    /* JADX INFO: renamed from: e */
    public void m33786e(int i13, int i14) {
        long jM60431f = AbstractC21478l0.m60431f(i13, i14);
        ((C5057p) this.f40622F).m15869l(i13, i14, "");
        long jM113971l0 = AbstractC35902e.m113971l0(AbstractC21478l0.m60431f(this.f40624x, this.f40625y), jM60431f);
        m33794m(C23283u0.m67360f(jM113971l0));
        m33793l(C23283u0.m67359e(jM113971l0));
        int i15 = this.f40626z;
        if (i15 != -1) {
            long jM113971l1 = AbstractC35902e.m113971l0(AbstractC21478l0.m60431f(i15, this.f40621E), jM60431f);
            if (C23283u0.m67357c(jM113971l1)) {
                this.f40626z = -1;
                this.f40621E = -1;
            } else {
                this.f40626z = C23283u0.m67360f(jM113971l1);
                this.f40621E = C23283u0.m67359e(jM113971l1);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public char m33787f(int i13) {
        C5057p c5057p = (C5057p) this.f40622F;
        C0028i c0028i = (C0028i) c5057p.f21240e;
        if (c0028i != null && i13 >= c5057p.f21237b) {
            int iM69c = c0028i.f70b - c0028i.m69c();
            int i14 = c5057p.f21237b;
            if (i13 >= iM69c + i14) {
                return ((String) c5057p.f21239d).charAt(i13 - ((iM69c - c5057p.f21238c) + i14));
            }
            int i15 = i13 - i14;
            int i16 = c0028i.f71c;
            return i15 < i16 ? ((char[]) c0028i.f73e)[i15] : ((char[]) c0028i.f73e)[(i15 - i16) + c0028i.f72d];
        }
        return ((String) c5057p.f21239d).charAt(i13);
    }

    /* JADX INFO: renamed from: g */
    public C23283u0 m33788g() {
        int i13 = this.f40626z;
        if (i13 != -1) {
            return new C23283u0(AbstractC21478l0.m60431f(i13, this.f40621E));
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public int m33789h() {
        int i13 = this.f40626z;
        if (i13 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = (int[]) this.f40622F;
        int i14 = this.f40624x;
        int i15 = iArr[i14];
        this.f40624x = (i14 + 1) & this.f40621E;
        this.f40626z = i13 - 1;
        return i15;
    }

    /* JADX INFO: renamed from: i */
    public void m33790i(int i13, int i14, String str) {
        C5057p c5057p = (C5057p) this.f40622F;
        if (i13 < 0 || i13 > c5057p.m15860c()) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "start (", ") offset is outside of text region ");
            sbM30466t.append(c5057p.m15860c());
            throw new IndexOutOfBoundsException(sbM30466t.toString());
        }
        if (i14 < 0 || i14 > c5057p.m15860c()) {
            StringBuilder sbM30466t2 = AbstractC11266d.m30466t(i14, "end (", ") offset is outside of text region ");
            sbM30466t2.append(c5057p.m15860c());
            throw new IndexOutOfBoundsException(sbM30466t2.toString());
        }
        if (i13 > i14) {
            throw new IllegalArgumentException(AbstractC2875y.m8294g(i13, i14, "Do not set reversed range: ", " > "));
        }
        c5057p.m15869l(i13, i14, str);
        m33794m(str.length() + i13);
        m33793l(str.length() + i13);
        this.f40626z = -1;
        this.f40621E = -1;
    }

    /* JADX INFO: renamed from: j */
    public void m33791j(int i13, int i14) {
        C5057p c5057p = (C5057p) this.f40622F;
        if (i13 < 0 || i13 > c5057p.m15860c()) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "start (", ") offset is outside of text region ");
            sbM30466t.append(c5057p.m15860c());
            throw new IndexOutOfBoundsException(sbM30466t.toString());
        }
        if (i14 < 0 || i14 > c5057p.m15860c()) {
            StringBuilder sbM30466t2 = AbstractC11266d.m30466t(i14, "end (", ") offset is outside of text region ");
            sbM30466t2.append(c5057p.m15860c());
            throw new IndexOutOfBoundsException(sbM30466t2.toString());
        }
        if (i13 >= i14) {
            throw new IllegalArgumentException(AbstractC2875y.m8294g(i13, i14, "Do not set reversed or empty range: ", " > "));
        }
        this.f40626z = i13;
        this.f40621E = i14;
    }

    /* JADX INFO: renamed from: k */
    public void m33792k(int i13, int i14) {
        C5057p c5057p = (C5057p) this.f40622F;
        if (i13 < 0 || i13 > c5057p.m15860c()) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "start (", ") offset is outside of text region ");
            sbM30466t.append(c5057p.m15860c());
            throw new IndexOutOfBoundsException(sbM30466t.toString());
        }
        if (i14 < 0 || i14 > c5057p.m15860c()) {
            StringBuilder sbM30466t2 = AbstractC11266d.m30466t(i14, "end (", ") offset is outside of text region ");
            sbM30466t2.append(c5057p.m15860c());
            throw new IndexOutOfBoundsException(sbM30466t2.toString());
        }
        if (i13 > i14) {
            throw new IllegalArgumentException(AbstractC2875y.m8294g(i13, i14, "Do not set reversed range: ", " > "));
        }
        m33794m(i13);
        m33793l(i14);
    }

    /* JADX INFO: renamed from: l */
    public void m33793l(int i13) {
        if (!(i13 >= 0)) {
            AbstractC30895a.m95015a("Cannot set selectionEnd to a negative value: " + i13);
        }
        this.f40625y = i13;
    }

    /* JADX INFO: renamed from: m */
    public void m33794m(int i13) {
        if (!(i13 >= 0)) {
            AbstractC30895a.m95015a("Cannot set selectionStart to a negative value: " + i13);
        }
        this.f40624x = i13;
    }

    public String toString() {
        switch (this.f40623w) {
            case 3:
                return ((C5057p) this.f40622F).toString();
            default:
                return super.toString();
        }
    }

    public C12185e() {
        this.f40623w = 1;
        this.f40624x = 0;
        this.f40625y = -1;
        this.f40626z = 0;
        int[] iArr = new int[16];
        this.f40622F = iArr;
        this.f40621E = iArr.length - 1;
    }

    public C12185e(C12182b c12182b) {
        this.f40623w = 0;
        C13117a c13117a = c12182b.f40610y;
        this.f40622F = c13117a;
        c13117a.m36689K(12);
        this.f40625y = c13117a.m36680B() & 255;
        this.f40624x = c13117a.m36680B();
    }

    public C12185e(C39309d c39309d) {
        this.f40623w = 2;
        C38059n c38059n = c39309d.f169113y;
        this.f40622F = c38059n;
        c38059n.m121846F(12);
        this.f40625y = c38059n.m121871x() & 255;
        this.f40624x = c38059n.m121871x();
    }
}
