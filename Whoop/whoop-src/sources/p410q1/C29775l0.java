package p410q1;

import b83.C2813i;
import m83.AbstractC25260n;
import no.nordicsemi.android.dfu.DfuBaseService;
import p098dt.AbstractC12350b;
import p329n0.C26057j;
import p390p1.C28591a;
import p390p1.C28626i2;
import p390p1.InterfaceC28599c;
import p602x1.C37822h;

/* JADX INFO: renamed from: q1.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C29775l0 extends AbstractC12350b {

    /* JADX INFO: renamed from: b */
    public int f121781b;

    /* JADX INFO: renamed from: d */
    public int f121783d;

    /* JADX INFO: renamed from: f */
    public int f121785f;

    /* JADX INFO: renamed from: a */
    public AbstractC29771j0[] f121780a = new AbstractC29771j0[16];

    /* JADX INFO: renamed from: c */
    public int[] f121782c = new int[16];

    /* JADX INFO: renamed from: e */
    public Object[] f121784e = new Object[16];

    /* JADX INFO: renamed from: c0 */
    public final void m91235c0() {
        this.f121781b = 0;
        this.f121783d = 0;
        AbstractC25260n.m74073n0(0, this.f121785f, null, this.f121784e);
        this.f121785f = 0;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m91236d0(InterfaceC28599c interfaceC28599c, C28626i2 c28626i2, C37822h c37822h, InterfaceC29773k0 interfaceC29773k0) {
        if (m91238f0()) {
            C2813i c2813i = new C2813i();
            c2813i.f11008d = this;
            C29775l0 c29775l0 = (C29775l0) c2813i.f11008d;
            while (true) {
                AbstractC29771j0 abstractC29771j0 = c29775l0.f121780a[c2813i.f11005a];
                C28591a c28591aMo91234f = abstractC29771j0.mo91234f(c2813i);
                InterfaceC28599c interfaceC28599c2 = interfaceC28599c;
                C28626i2 c28626i3 = c28626i2;
                C37822h c37822h2 = c37822h;
                InterfaceC29773k0 interfaceC29773k1 = interfaceC29773k0;
                try {
                    abstractC29771j0.mo91224d(c2813i, interfaceC28599c2, c28626i3, c37822h2, interfaceC29773k1);
                    int i13 = c2813i.f11005a;
                    int i14 = c29775l0.f121781b;
                    if (i13 < i14) {
                        AbstractC29771j0 abstractC29771j1 = c29775l0.f121780a[i13];
                        c2813i.f11006b += abstractC29771j1.f121776b;
                        c2813i.f11007c += abstractC29771j1.f121777c;
                        int i15 = i13 + 1;
                        c2813i.f11005a = i15;
                        if (i15 >= i14) {
                            break;
                        }
                        interfaceC28599c = interfaceC28599c2;
                        c28626i2 = c28626i3;
                        c37822h = c37822h2;
                        interfaceC29773k0 = interfaceC29773k1;
                    } else {
                        break;
                    }
                } catch (Throwable th3) {
                    if (interfaceC29773k1 == null) {
                        throw th3;
                    }
                    AbstractC12350b.m34576Y(th3, new C26057j(c28591aMo91234f, c28626i3, interfaceC29773k1, 20));
                    throw th3;
                }
            }
        }
        m91235c0();
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m91237e0() {
        return this.f121781b == 0;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m91238f0() {
        return this.f121781b != 0;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m91239g0(AbstractC29771j0 abstractC29771j0) {
        int i13 = this.f121781b;
        AbstractC29771j0[] abstractC29771j0Arr = this.f121780a;
        int length = abstractC29771j0Arr.length;
        int i14 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i13 == length) {
            AbstractC29771j0[] abstractC29771j0Arr2 = new AbstractC29771j0[(i13 > 1024 ? 1024 : i13) + i13];
            System.arraycopy(abstractC29771j0Arr, 0, abstractC29771j0Arr2, 0, i13);
            this.f121780a = abstractC29771j0Arr2;
        }
        int i15 = this.f121783d;
        int i16 = abstractC29771j0.f121776b;
        int i17 = abstractC29771j0.f121777c;
        int i18 = i15 + i16;
        int[] iArr = this.f121782c;
        int length2 = iArr.length;
        if (i18 > length2) {
            int i19 = (length2 > 1024 ? 1024 : length2) + length2;
            if (i19 >= i18) {
                i18 = i19;
            }
            int[] iArr2 = new int[i18];
            AbstractC25260n.m74064e0(0, 0, iArr, iArr2, length2);
            this.f121782c = iArr2;
        }
        int i24 = this.f121785f + i17;
        Object[] objArr = this.f121784e;
        int length3 = objArr.length;
        if (i24 > length3) {
            if (length3 <= 1024) {
                i14 = length3;
            }
            int i25 = i14 + length3;
            if (i25 >= i24) {
                i24 = i25;
            }
            Object[] objArr2 = new Object[i24];
            System.arraycopy(objArr, 0, objArr2, 0, length3);
            this.f121784e = objArr2;
        }
        AbstractC29771j0[] abstractC29771j0Arr3 = this.f121780a;
        int i26 = this.f121781b;
        this.f121781b = i26 + 1;
        abstractC29771j0Arr3[i26] = abstractC29771j0;
        this.f121783d += abstractC29771j0.f121776b;
        this.f121785f += i17;
    }
}
