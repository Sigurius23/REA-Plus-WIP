package p031b9;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p299l9.C23489c1;
import p516u8.AbstractC34609o0;
import p516u8.C34605m0;
import p516u8.C34607n0;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: b9.h1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2837h1 extends AbstractC34609o0 {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f11189k = 0;

    /* JADX INFO: renamed from: b */
    public final int f11190b;

    /* JADX INFO: renamed from: c */
    public final C23489c1 f11191c;

    /* JADX INFO: renamed from: d */
    public final int f11192d;

    /* JADX INFO: renamed from: e */
    public final int f11193e;

    /* JADX INFO: renamed from: f */
    public final int[] f11194f;

    /* JADX INFO: renamed from: g */
    public final int[] f11195g;

    /* JADX INFO: renamed from: h */
    public final AbstractC34609o0[] f11196h;

    /* JADX INFO: renamed from: i */
    public final Object[] f11197i;

    /* JADX INFO: renamed from: j */
    public final HashMap f11198j;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2837h1(ArrayList arrayList, C23489c1 c23489c1) {
        AbstractC34609o0[] abstractC34609o0Arr = new AbstractC34609o0[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i13 = 0;
        int i14 = 0;
        while (it.hasNext()) {
            abstractC34609o0Arr[i14] = ((InterfaceC2866t0) it.next()).mo7999b();
            i14++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            objArr[i13] = ((InterfaceC2866t0) it3.next()).mo7998a();
            i13++;
        }
        this(abstractC34609o0Arr, objArr, c23489c1);
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: a */
    public final int mo8131a(boolean z4) {
        if (this.f11190b != 0) {
            int iM8140q = 0;
            if (z4) {
                int[] iArr = this.f11191c.f92982b;
                iM8140q = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                AbstractC34609o0[] abstractC34609o0Arr = this.f11196h;
                if (!abstractC34609o0Arr[iM8140q].m109408p()) {
                    return abstractC34609o0Arr[iM8140q].mo8131a(z4) + this.f11195g[iM8140q];
                }
                iM8140q = m8140q(iM8140q, z4);
            } while (iM8140q != -1);
        }
        return -1;
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: b */
    public final int mo8132b(Object obj) {
        int iMo8132b;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f11198j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iMo8132b = this.f11196h[iIntValue].mo8132b(obj3)) != -1) {
                return this.f11194f[iIntValue] + iMo8132b;
            }
        }
        return -1;
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: c */
    public final int mo8133c(boolean z4) {
        int iM8141r;
        int i13 = this.f11190b;
        if (i13 != 0) {
            if (z4) {
                int[] iArr = this.f11191c.f92982b;
                iM8141r = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iM8141r = i13 - 1;
            }
            do {
                AbstractC34609o0[] abstractC34609o0Arr = this.f11196h;
                if (!abstractC34609o0Arr[iM8141r].m109408p()) {
                    return abstractC34609o0Arr[iM8141r].mo8133c(z4) + this.f11195g[iM8141r];
                }
                iM8141r = m8141r(iM8141r, z4);
            } while (iM8141r != -1);
        }
        return -1;
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: e */
    public final int mo8134e(int i13, int i14, boolean z4) {
        int[] iArr = this.f11195g;
        int iM121910c = AbstractC38065t.m121910c(iArr, i13 + 1, false, false);
        int i15 = iArr[iM121910c];
        AbstractC34609o0[] abstractC34609o0Arr = this.f11196h;
        int iMo8134e = abstractC34609o0Arr[iM121910c].mo8134e(i13 - i15, i14 != 2 ? i14 : 0, z4);
        if (iMo8134e != -1) {
            return i15 + iMo8134e;
        }
        int iM8140q = m8140q(iM121910c, z4);
        while (iM8140q != -1 && abstractC34609o0Arr[iM8140q].m109408p()) {
            iM8140q = m8140q(iM8140q, z4);
        }
        if (iM8140q != -1) {
            return abstractC34609o0Arr[iM8140q].mo8131a(z4) + iArr[iM8140q];
        }
        if (i14 == 2) {
            return mo8131a(z4);
        }
        return -1;
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: f */
    public final C34605m0 mo8128f(int i13, C34605m0 c34605m0, boolean z4) {
        int[] iArr = this.f11194f;
        int iM121910c = AbstractC38065t.m121910c(iArr, i13 + 1, false, false);
        int i14 = this.f11195g[iM121910c];
        this.f11196h[iM121910c].mo8128f(i13 - iArr[iM121910c], c34605m0, z4);
        c34605m0.f145693c += i14;
        if (z4) {
            Object obj = this.f11197i[iM121910c];
            Object obj2 = c34605m0.f145692b;
            obj2.getClass();
            c34605m0.f145692b = Pair.create(obj, obj2);
        }
        return c34605m0;
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: g */
    public final C34605m0 mo8135g(Object obj, C34605m0 c34605m0) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f11198j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i13 = this.f11195g[iIntValue];
        this.f11196h[iIntValue].mo8135g(obj3, c34605m0);
        c34605m0.f145693c += i13;
        c34605m0.f145692b = obj;
        return c34605m0;
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: h */
    public final int mo8136h() {
        return this.f11193e;
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: k */
    public final int mo8137k(int i13, int i14, boolean z4) {
        int[] iArr = this.f11195g;
        int iM121910c = AbstractC38065t.m121910c(iArr, i13 + 1, false, false);
        int i15 = iArr[iM121910c];
        AbstractC34609o0[] abstractC34609o0Arr = this.f11196h;
        int iMo8137k = abstractC34609o0Arr[iM121910c].mo8137k(i13 - i15, i14 != 2 ? i14 : 0, z4);
        if (iMo8137k != -1) {
            return i15 + iMo8137k;
        }
        int iM8141r = m8141r(iM121910c, z4);
        while (iM8141r != -1 && abstractC34609o0Arr[iM8141r].m109408p()) {
            iM8141r = m8141r(iM8141r, z4);
        }
        if (iM8141r != -1) {
            return abstractC34609o0Arr[iM8141r].mo8133c(z4) + iArr[iM8141r];
        }
        if (i14 == 2) {
            return mo8133c(z4);
        }
        return -1;
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: l */
    public final Object mo8138l(int i13) {
        int[] iArr = this.f11194f;
        int iM121910c = AbstractC38065t.m121910c(iArr, i13 + 1, false, false);
        return Pair.create(this.f11197i[iM121910c], this.f11196h[iM121910c].mo8138l(i13 - iArr[iM121910c]));
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: m */
    public final C34607n0 mo8129m(int i13, C34607n0 c34607n0, long j7) {
        int[] iArr = this.f11195g;
        int iM121910c = AbstractC38065t.m121910c(iArr, i13 + 1, false, false);
        int i14 = iArr[iM121910c];
        int i15 = this.f11194f[iM121910c];
        this.f11196h[iM121910c].mo8129m(i13 - i14, c34607n0, j7);
        Object objCreate = this.f11197i[iM121910c];
        if (!C34607n0.f145699q.equals(c34607n0.f145701a)) {
            objCreate = Pair.create(objCreate, c34607n0.f145701a);
        }
        c34607n0.f145701a = objCreate;
        c34607n0.f145714n += i15;
        c34607n0.f145715o += i15;
        return c34607n0;
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: o */
    public final int mo8139o() {
        return this.f11192d;
    }

    /* JADX INFO: renamed from: q */
    public final int m8140q(int i13, boolean z4) {
        if (!z4) {
            if (i13 < this.f11190b - 1) {
                return i13 + 1;
            }
            return -1;
        }
        C23489c1 c23489c1 = this.f11191c;
        int i14 = c23489c1.f92983c[i13] + 1;
        int[] iArr = c23489c1.f92982b;
        if (i14 < iArr.length) {
            return iArr[i14];
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public final int m8141r(int i13, boolean z4) {
        if (!z4) {
            if (i13 > 0) {
                return i13 - 1;
            }
            return -1;
        }
        C23489c1 c23489c1 = this.f11191c;
        int i14 = c23489c1.f92983c[i13] - 1;
        if (i14 >= 0) {
            return c23489c1.f92982b[i14];
        }
        return -1;
    }

    public C2837h1(AbstractC34609o0[] abstractC34609o0Arr, Object[] objArr, C23489c1 c23489c1) {
        this.f11191c = c23489c1;
        this.f11190b = c23489c1.f92982b.length;
        int length = abstractC34609o0Arr.length;
        this.f11196h = abstractC34609o0Arr;
        this.f11194f = new int[length];
        this.f11195g = new int[length];
        this.f11197i = objArr;
        this.f11198j = new HashMap();
        int length2 = abstractC34609o0Arr.length;
        int i13 = 0;
        int iMo8139o = 0;
        int iMo8136h = 0;
        int i14 = 0;
        while (i13 < length2) {
            AbstractC34609o0 abstractC34609o0 = abstractC34609o0Arr[i13];
            this.f11196h[i14] = abstractC34609o0;
            this.f11195g[i14] = iMo8139o;
            this.f11194f[i14] = iMo8136h;
            iMo8139o += abstractC34609o0.mo8139o();
            iMo8136h += this.f11196h[i14].mo8136h();
            this.f11198j.put(objArr[i14], Integer.valueOf(i14));
            i13++;
            i14++;
        }
        this.f11192d = iMo8139o;
        this.f11193e = iMo8136h;
    }
}
