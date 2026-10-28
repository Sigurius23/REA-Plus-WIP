package p465rm;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p309lo.AbstractC24567y;
import sn.C32762u0;

/* JADX INFO: renamed from: rm.e1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31528e1 extends AbstractC31558o1 {

    /* JADX INFO: renamed from: E */
    public final int f130130E;

    /* JADX INFO: renamed from: F */
    public final int[] f130131F;

    /* JADX INFO: renamed from: G */
    public final int[] f130132G;

    /* JADX INFO: renamed from: H */
    public final AbstractC31558o1[] f130133H;

    /* JADX INFO: renamed from: I */
    public final Object[] f130134I;

    /* JADX INFO: renamed from: J */
    public final HashMap f130135J;

    /* JADX INFO: renamed from: x */
    public final int f130136x;

    /* JADX INFO: renamed from: y */
    public final C32762u0 f130137y;

    /* JADX INFO: renamed from: z */
    public final int f130138z;

    public C31528e1(ArrayList arrayList, C32762u0 c32762u0) {
        this.f130137y = c32762u0;
        this.f130136x = c32762u0.f136244b.length;
        int size = arrayList.size();
        this.f130131F = new int[size];
        this.f130132G = new int[size];
        this.f130133H = new AbstractC31558o1[size];
        this.f130134I = new Object[size];
        this.f130135J = new HashMap();
        Iterator it = arrayList.iterator();
        int iMo97137o = 0;
        int iMo97133h = 0;
        int i13 = 0;
        while (it.hasNext()) {
            InterfaceC31563q0 interfaceC31563q0 = (InterfaceC31563q0) it.next();
            this.f130133H[i13] = interfaceC31563q0.mo97192b();
            this.f130132G[i13] = iMo97137o;
            this.f130131F[i13] = iMo97133h;
            iMo97137o += this.f130133H[i13].mo97137o();
            iMo97133h += this.f130133H[i13].mo97133h();
            this.f130134I[i13] = interfaceC31563q0.mo97191a();
            this.f130135J.put(this.f130134I[i13], Integer.valueOf(i13));
            i13++;
        }
        this.f130138z = iMo97137o;
        this.f130130E = iMo97133h;
    }

    @Override // p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: a */
    public final int mo97127a(boolean z4) {
        if (this.f130136x != 0) {
            int iM97138q = 0;
            if (z4) {
                int[] iArr = this.f130137y.f136244b;
                iM97138q = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                AbstractC31558o1[] abstractC31558o1Arr = this.f130133H;
                if (!abstractC31558o1Arr[iM97138q].m97175p()) {
                    return abstractC31558o1Arr[iM97138q].mo97127a(z4) + this.f130132G[iM97138q];
                }
                iM97138q = m97138q(iM97138q, z4);
            } while (iM97138q != -1);
        }
        return -1;
    }

    @Override // p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: b */
    public final int mo97128b(Object obj) {
        int iMo97128b;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f130135J.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iMo97128b = this.f130133H[iIntValue].mo97128b(obj3)) != -1) {
                return this.f130131F[iIntValue] + iMo97128b;
            }
        }
        return -1;
    }

    @Override // p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: c */
    public final int mo97129c(boolean z4) {
        int iM97139r;
        int i13 = this.f130136x;
        if (i13 != 0) {
            if (z4) {
                int[] iArr = this.f130137y.f136244b;
                iM97139r = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iM97139r = i13 - 1;
            }
            do {
                AbstractC31558o1[] abstractC31558o1Arr = this.f130133H;
                if (!abstractC31558o1Arr[iM97139r].m97175p()) {
                    return abstractC31558o1Arr[iM97139r].mo97129c(z4) + this.f130132G[iM97139r];
                }
                iM97139r = m97139r(iM97139r, z4);
            } while (iM97139r != -1);
        }
        return -1;
    }

    @Override // p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: e */
    public final int mo97130e(int i13, int i14, boolean z4) {
        int[] iArr = this.f130132G;
        int iM71673d = AbstractC24567y.m71673d(iArr, i13 + 1);
        int i15 = iArr[iM71673d];
        AbstractC31558o1[] abstractC31558o1Arr = this.f130133H;
        int iMo97130e = abstractC31558o1Arr[iM71673d].mo97130e(i13 - i15, i14 == 2 ? 0 : i14, z4);
        if (iMo97130e != -1) {
            return i15 + iMo97130e;
        }
        int iM97138q = m97138q(iM71673d, z4);
        while (iM97138q != -1 && abstractC31558o1Arr[iM97138q].m97175p()) {
            iM97138q = m97138q(iM97138q, z4);
        }
        if (iM97138q != -1) {
            return abstractC31558o1Arr[iM97138q].mo97127a(z4) + iArr[iM97138q];
        }
        if (i14 == 2) {
            return mo97127a(z4);
        }
        return -1;
    }

    @Override // p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: f */
    public final C31552m1 mo97131f(int i13, C31552m1 c31552m1, boolean z4) {
        int[] iArr = this.f130131F;
        int iM71673d = AbstractC24567y.m71673d(iArr, i13 + 1);
        int i14 = this.f130132G[iM71673d];
        this.f130133H[iM71673d].mo97131f(i13 - iArr[iM71673d], c31552m1, z4);
        c31552m1.f130286y += i14;
        if (z4) {
            Object obj = this.f130134I[iM71673d];
            Object obj2 = c31552m1.f130285x;
            obj2.getClass();
            c31552m1.f130285x = Pair.create(obj, obj2);
        }
        return c31552m1;
    }

    @Override // p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: g */
    public final C31552m1 mo97132g(Object obj, C31552m1 c31552m1) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f130135J.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i13 = this.f130132G[iIntValue];
        this.f130133H[iIntValue].mo97132g(obj3, c31552m1);
        c31552m1.f130286y += i13;
        c31552m1.f130285x = obj;
        return c31552m1;
    }

    @Override // p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: h */
    public final int mo97133h() {
        return this.f130130E;
    }

    @Override // p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: k */
    public final int mo97134k(int i13, int i14, boolean z4) {
        int[] iArr = this.f130132G;
        int iM71673d = AbstractC24567y.m71673d(iArr, i13 + 1);
        int i15 = iArr[iM71673d];
        AbstractC31558o1[] abstractC31558o1Arr = this.f130133H;
        int iMo97134k = abstractC31558o1Arr[iM71673d].mo97134k(i13 - i15, i14 == 2 ? 0 : i14, z4);
        if (iMo97134k != -1) {
            return i15 + iMo97134k;
        }
        int iM97139r = m97139r(iM71673d, z4);
        while (iM97139r != -1 && abstractC31558o1Arr[iM97139r].m97175p()) {
            iM97139r = m97139r(iM97139r, z4);
        }
        if (iM97139r != -1) {
            return abstractC31558o1Arr[iM97139r].mo97129c(z4) + iArr[iM97139r];
        }
        if (i14 == 2) {
            return mo97129c(z4);
        }
        return -1;
    }

    @Override // p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: l */
    public final Object mo97135l(int i13) {
        int[] iArr = this.f130131F;
        int iM71673d = AbstractC24567y.m71673d(iArr, i13 + 1);
        return Pair.create(this.f130134I[iM71673d], this.f130133H[iM71673d].mo97135l(i13 - iArr[iM71673d]));
    }

    @Override // p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: m */
    public final C31555n1 mo97136m(int i13, C31555n1 c31555n1, long j7) {
        int[] iArr = this.f130132G;
        int iM71673d = AbstractC24567y.m71673d(iArr, i13 + 1);
        int i14 = iArr[iM71673d];
        int i15 = this.f130131F[iM71673d];
        this.f130133H[iM71673d].mo97136m(i13 - i14, c31555n1, j7);
        Object objCreate = this.f130134I[iM71673d];
        if (!C31555n1.f130306R.equals(c31555n1.f130322w)) {
            objCreate = Pair.create(objCreate, c31555n1.f130322w);
        }
        c31555n1.f130322w = objCreate;
        c31555n1.f130319O += i15;
        c31555n1.f130320P += i15;
        return c31555n1;
    }

    @Override // p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: o */
    public final int mo97137o() {
        return this.f130138z;
    }

    /* JADX INFO: renamed from: q */
    public final int m97138q(int i13, boolean z4) {
        if (!z4) {
            if (i13 < this.f130136x - 1) {
                return i13 + 1;
            }
            return -1;
        }
        C32762u0 c32762u0 = this.f130137y;
        int i14 = c32762u0.f136245c[i13] + 1;
        int[] iArr = c32762u0.f136244b;
        if (i14 < iArr.length) {
            return iArr[i14];
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public final int m97139r(int i13, boolean z4) {
        if (!z4) {
            if (i13 > 0) {
                return i13 - 1;
            }
            return -1;
        }
        C32762u0 c32762u0 = this.f130137y;
        int i14 = c32762u0.f136245c[i13] - 1;
        if (i14 >= 0) {
            return c32762u0.f136244b[i14];
        }
        return -1;
    }
}
