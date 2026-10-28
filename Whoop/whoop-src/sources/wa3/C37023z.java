package wa3;

import af3.C0845u;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: wa3.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C37023z extends AbstractC36990e {

    /* JADX INFO: renamed from: H */
    public static final int[] f158392H;

    /* JADX INFO: renamed from: E */
    public final int f158393E;

    /* JADX INFO: renamed from: F */
    public final int f158394F;

    /* JADX INFO: renamed from: G */
    public int f158395G = 0;

    /* JADX INFO: renamed from: x */
    public final int f158396x;

    /* JADX INFO: renamed from: y */
    public final AbstractC36990e f158397y;

    /* JADX INFO: renamed from: z */
    public final AbstractC36990e f158398z;

    static {
        ArrayList arrayList = new ArrayList();
        int i13 = 1;
        int i14 = 1;
        while (i13 > 0) {
            arrayList.add(Integer.valueOf(i13));
            int i15 = i14 + i13;
            i14 = i13;
            i13 = i15;
        }
        arrayList.add(Integer.MAX_VALUE);
        f158392H = new int[arrayList.size()];
        int i16 = 0;
        while (true) {
            int[] iArr = f158392H;
            if (i16 >= iArr.length) {
                return;
            }
            iArr[i16] = ((Integer) arrayList.get(i16)).intValue();
            i16++;
        }
    }

    public C37023z(AbstractC36990e abstractC36990e, AbstractC36990e abstractC36990e2) {
        this.f158397y = abstractC36990e;
        this.f158398z = abstractC36990e2;
        int size = abstractC36990e.size();
        this.f158393E = size;
        this.f158396x = abstractC36990e2.size() + size;
        this.f158394F = Math.max(abstractC36990e.mo118746f(), abstractC36990e2.mo118746f()) + 1;
    }

    @Override // wa3.AbstractC36990e
    /* JADX INFO: renamed from: e */
    public final void mo118745e(int i13, int i14, int i15, byte[] bArr) {
        int i16 = i13 + i15;
        AbstractC36990e abstractC36990e = this.f158397y;
        int i17 = this.f158393E;
        if (i16 <= i17) {
            abstractC36990e.mo118745e(i13, i14, i15, bArr);
            return;
        }
        AbstractC36990e abstractC36990e2 = this.f158398z;
        if (i13 >= i17) {
            abstractC36990e2.mo118745e(i13 - i17, i14, i15, bArr);
            return;
        }
        int i18 = i17 - i13;
        abstractC36990e.mo118745e(i13, i14, i18, bArr);
        abstractC36990e2.mo118745e(0, i14 + i18, i15 - i18, bArr);
    }

    public final boolean equals(Object obj) {
        int iMo118751o;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC36990e) {
            AbstractC36990e abstractC36990e = (AbstractC36990e) obj;
            int size = abstractC36990e.size();
            int i13 = this.f158396x;
            if (i13 == size) {
                if (i13 == 0) {
                    return true;
                }
                if (this.f158395G == 0 || (iMo118751o = abstractC36990e.mo118751o()) == 0 || this.f158395G == iMo118751o) {
                    C0845u c0845u = new C0845u(this);
                    C37018u c37018u = (C37018u) c0845u.next();
                    C0845u c0845u2 = new C0845u(abstractC36990e);
                    C37018u c37018u2 = (C37018u) c0845u2.next();
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    while (true) {
                        int length = c37018u.f158387x.length - i14;
                        int length2 = c37018u2.f158387x.length - i15;
                        int iMin = Math.min(length, length2);
                        if (!(i14 == 0 ? c37018u.m118831t(c37018u2, i15, iMin) : c37018u2.m118831t(c37018u, i14, iMin))) {
                            break;
                        }
                        i16 += iMin;
                        if (i16 >= i13) {
                            if (i16 == i13) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == length) {
                            c37018u = (C37018u) c0845u.next();
                            i14 = 0;
                        } else {
                            i14 += iMin;
                        }
                        if (iMin == length2) {
                            c37018u2 = (C37018u) c0845u2.next();
                            i15 = 0;
                        } else {
                            i15 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // wa3.AbstractC36990e
    /* JADX INFO: renamed from: f */
    public final int mo118746f() {
        return this.f158394F;
    }

    @Override // wa3.AbstractC36990e
    /* JADX INFO: renamed from: g */
    public final boolean mo118747g() {
        return this.f158396x >= f158392H[this.f158394F];
    }

    public final int hashCode() {
        int iMo118749m = this.f158395G;
        if (iMo118749m == 0) {
            int i13 = this.f158396x;
            iMo118749m = mo118749m(i13, 0, i13);
            if (iMo118749m == 0) {
                iMo118749m = 1;
            }
            this.f158395G = iMo118749m;
        }
        return iMo118749m;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C37022y(this);
    }

    @Override // wa3.AbstractC36990e
    /* JADX INFO: renamed from: j */
    public final boolean mo118748j() {
        int iMo118750n = this.f158397y.mo118750n(0, 0, this.f158393E);
        AbstractC36990e abstractC36990e = this.f158398z;
        return abstractC36990e.mo118750n(iMo118750n, 0, abstractC36990e.size()) == 0;
    }

    @Override // wa3.AbstractC36990e
    /* JADX INFO: renamed from: m */
    public final int mo118749m(int i13, int i14, int i15) {
        int i16 = i14 + i15;
        AbstractC36990e abstractC36990e = this.f158397y;
        int i17 = this.f158393E;
        if (i16 <= i17) {
            return abstractC36990e.mo118749m(i13, i14, i15);
        }
        AbstractC36990e abstractC36990e2 = this.f158398z;
        if (i14 >= i17) {
            return abstractC36990e2.mo118749m(i13, i14 - i17, i15);
        }
        int i18 = i17 - i14;
        return abstractC36990e2.mo118749m(abstractC36990e.mo118749m(i13, i14, i18), 0, i15 - i18);
    }

    @Override // wa3.AbstractC36990e
    /* JADX INFO: renamed from: n */
    public final int mo118750n(int i13, int i14, int i15) {
        int i16 = i14 + i15;
        AbstractC36990e abstractC36990e = this.f158397y;
        int i17 = this.f158393E;
        if (i16 <= i17) {
            return abstractC36990e.mo118750n(i13, i14, i15);
        }
        AbstractC36990e abstractC36990e2 = this.f158398z;
        if (i14 >= i17) {
            return abstractC36990e2.mo118750n(i13, i14 - i17, i15);
        }
        int i18 = i17 - i14;
        return abstractC36990e2.mo118750n(abstractC36990e.mo118750n(i13, i14, i18), 0, i15 - i18);
    }

    @Override // wa3.AbstractC36990e
    /* JADX INFO: renamed from: o */
    public final int mo118751o() {
        return this.f158395G;
    }

    @Override // wa3.AbstractC36990e
    /* JADX INFO: renamed from: p */
    public final String mo118752p() {
        byte[] bArr;
        int i13 = this.f158396x;
        if (i13 == 0) {
            bArr = AbstractC37015r.f158384a;
        } else {
            byte[] bArr2 = new byte[i13];
            mo118745e(0, 0, i13, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // wa3.AbstractC36990e
    /* JADX INFO: renamed from: r */
    public final void mo118754r(OutputStream outputStream, int i13, int i14) {
        int i15 = i13 + i14;
        AbstractC36990e abstractC36990e = this.f158397y;
        int i16 = this.f158393E;
        if (i15 <= i16) {
            abstractC36990e.mo118754r(outputStream, i13, i14);
            return;
        }
        AbstractC36990e abstractC36990e2 = this.f158398z;
        if (i13 >= i16) {
            abstractC36990e2.mo118754r(outputStream, i13 - i16, i14);
            return;
        }
        int i17 = i16 - i13;
        abstractC36990e.mo118754r(outputStream, i13, i17);
        abstractC36990e2.mo118754r(outputStream, 0, i14 - i17);
    }

    @Override // wa3.AbstractC36990e
    public final int size() {
        return this.f158396x;
    }
}
