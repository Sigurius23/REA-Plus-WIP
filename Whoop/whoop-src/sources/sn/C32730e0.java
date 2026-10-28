package sn;

import io.InterfaceC20035o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import ng3.C26701n;
import p309lo.AbstractC24543a;
import p465rm.C31537h1;
import q30.C29934u0;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: sn.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32730e0 implements InterfaceC32757s, InterfaceC32755r {

    /* JADX INFO: renamed from: F */
    public InterfaceC32755r f136066F;

    /* JADX INFO: renamed from: G */
    public C32768x0 f136067G;

    /* JADX INFO: renamed from: H */
    public InterfaceC32757s[] f136068H;

    /* JADX INFO: renamed from: I */
    public C29934u0 f136069I;

    /* JADX INFO: renamed from: w */
    public final InterfaceC32757s[] f136070w;

    /* JADX INFO: renamed from: x */
    public final IdentityHashMap f136071x;

    /* JADX INFO: renamed from: y */
    public final C26701n f136072y;

    /* JADX INFO: renamed from: z */
    public final ArrayList f136073z = new ArrayList();

    /* JADX INFO: renamed from: E */
    public final HashMap f136065E = new HashMap();

    public C32730e0(C26701n c26701n, long[] jArr, InterfaceC32757s... interfaceC32757sArr) {
        this.f136072y = c26701n;
        this.f136070w = interfaceC32757sArr;
        c26701n.getClass();
        this.f136069I = new C29934u0(new InterfaceC32760t0[0], 17);
        this.f136071x = new IdentityHashMap();
        this.f136068H = new InterfaceC32757s[0];
        for (int i13 = 0; i13 < interfaceC32757sArr.length; i13++) {
            long j7 = jArr[i13];
            if (j7 != 0) {
                this.f136070w[i13] = new C32726c0(interfaceC32757sArr[i13], j7);
            }
        }
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: a */
    public final boolean mo91531a() {
        return this.f136069I.mo91531a();
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: b */
    public final void mo102699b(InterfaceC32755r interfaceC32755r, long j7) {
        this.f136066F = interfaceC32755r;
        ArrayList arrayList = this.f136073z;
        InterfaceC32757s[] interfaceC32757sArr = this.f136070w;
        Collections.addAll(arrayList, interfaceC32757sArr);
        for (InterfaceC32757s interfaceC32757s : interfaceC32757sArr) {
            interfaceC32757s.mo102699b(this, j7);
        }
    }

    @Override // sn.InterfaceC32758s0
    /* JADX INFO: renamed from: c */
    public final void mo97274c(InterfaceC32760t0 interfaceC32760t0) {
        InterfaceC32755r interfaceC32755r = this.f136066F;
        interfaceC32755r.getClass();
        interfaceC32755r.mo97274c(this);
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: d */
    public final long mo91532d() {
        return this.f136069I.mo91532d();
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: e */
    public final long mo102700e(long j7) {
        long jMo102700e = this.f136068H[0].mo102700e(j7);
        int i13 = 1;
        while (true) {
            InterfaceC32757s[] interfaceC32757sArr = this.f136068H;
            if (i13 >= interfaceC32757sArr.length) {
                return jMo102700e;
            }
            if (interfaceC32757sArr[i13].mo102700e(jMo102700e) != jMo102700e) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i13++;
        }
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: f */
    public final long mo102701f() {
        long j7 = -9223372036854775807L;
        for (InterfaceC32757s interfaceC32757s : this.f136068H) {
            long jMo102701f = interfaceC32757s.mo102701f();
            if (jMo102701f == -9223372036854775807L) {
                if (j7 != -9223372036854775807L && interfaceC32757s.mo102700e(j7) != j7) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j7 == -9223372036854775807L) {
                for (InterfaceC32757s interfaceC32757s2 : this.f136068H) {
                    if (interfaceC32757s2 == interfaceC32757s) {
                        break;
                    }
                    if (interfaceC32757s2.mo102700e(jMo102701f) != jMo102701f) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j7 = jMo102701f;
            } else if (jMo102701f != j7) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j7;
    }

    @Override // sn.InterfaceC32755r
    /* JADX INFO: renamed from: g */
    public final void mo97282g(InterfaceC32757s interfaceC32757s) {
        ArrayList arrayList = this.f136073z;
        arrayList.remove(interfaceC32757s);
        if (arrayList.isEmpty()) {
            InterfaceC32757s[] interfaceC32757sArr = this.f136070w;
            int i13 = 0;
            for (InterfaceC32757s interfaceC32757s2 : interfaceC32757sArr) {
                i13 += interfaceC32757s2.mo102705k().f136270w;
            }
            C32766w0[] c32766w0Arr = new C32766w0[i13];
            int i14 = 0;
            for (int i15 = 0; i15 < interfaceC32757sArr.length; i15++) {
                C32768x0 c32768x0Mo102705k = interfaceC32757sArr[i15].mo102705k();
                int i16 = c32768x0Mo102705k.f136270w;
                int i17 = 0;
                while (i17 < i16) {
                    C32766w0 c32766w0M102758a = c32768x0Mo102705k.m102758a(i17);
                    String str = c32766w0M102758a.f136261x;
                    StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(12, str));
                    sb4.append(i15);
                    sb4.append(":");
                    sb4.append(str);
                    C32766w0 c32766w0 = new C32766w0(sb4.toString(), c32766w0M102758a.f136262y);
                    this.f136065E.put(c32766w0, c32766w0M102758a);
                    c32766w0Arr[i14] = c32766w0;
                    i17++;
                    i14++;
                }
            }
            this.f136067G = new C32768x0(c32766w0Arr);
            InterfaceC32755r interfaceC32755r = this.f136066F;
            interfaceC32755r.getClass();
            interfaceC32755r.mo97282g(this);
        }
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: h */
    public final void mo102702h() {
        for (InterfaceC32757s interfaceC32757s : this.f136070w) {
            interfaceC32757s.mo102702h();
        }
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: i */
    public final void mo102703i(long j7) {
        for (InterfaceC32757s interfaceC32757s : this.f136068H) {
            interfaceC32757s.mo102703i(j7);
        }
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: j */
    public final long mo102704j(InterfaceC20035o[] interfaceC20035oArr, boolean[] zArr, InterfaceC32756r0[] interfaceC32756r0Arr, boolean[] zArr2, long j7) {
        HashMap map;
        IdentityHashMap identityHashMap;
        InterfaceC32757s[] interfaceC32757sArr;
        int[] iArr = new int[interfaceC20035oArr.length];
        int[] iArr2 = new int[interfaceC20035oArr.length];
        int i13 = 0;
        while (true) {
            int length = interfaceC20035oArr.length;
            map = this.f136065E;
            identityHashMap = this.f136071x;
            interfaceC32757sArr = this.f136070w;
            if (i13 >= length) {
                break;
            }
            InterfaceC32756r0 interfaceC32756r0 = interfaceC32756r0Arr[i13];
            Integer num = interfaceC32756r0 == null ? null : (Integer) identityHashMap.get(interfaceC32756r0);
            iArr[i13] = num == null ? -1 : num.intValue();
            iArr2[i13] = -1;
            InterfaceC20035o interfaceC20035o = interfaceC20035oArr[i13];
            if (interfaceC20035o != null) {
                C32766w0 c32766w0 = (C32766w0) map.get(interfaceC20035o.mo54502j());
                c32766w0.getClass();
                for (int i14 = 0; i14 < interfaceC32757sArr.length; i14++) {
                    int iIndexOf = interfaceC32757sArr[i14].mo102705k().f136271x.indexOf(c32766w0);
                    if (iIndexOf < 0) {
                        iIndexOf = -1;
                    }
                    if (iIndexOf != -1) {
                        iArr2[i13] = i14;
                        break;
                    }
                }
            }
            i13++;
        }
        identityHashMap.clear();
        int length2 = interfaceC20035oArr.length;
        InterfaceC32756r0[] interfaceC32756r0Arr2 = new InterfaceC32756r0[length2];
        InterfaceC32756r0[] interfaceC32756r0Arr3 = new InterfaceC32756r0[interfaceC20035oArr.length];
        InterfaceC20035o[] interfaceC20035oArr2 = new InterfaceC20035o[interfaceC20035oArr.length];
        ArrayList arrayList = new ArrayList(interfaceC32757sArr.length);
        long j13 = j7;
        int i15 = 0;
        while (i15 < interfaceC32757sArr.length) {
            int i16 = 0;
            while (i16 < interfaceC20035oArr.length) {
                interfaceC32756r0Arr3[i16] = iArr[i16] == i15 ? interfaceC32756r0Arr[i16] : null;
                if (iArr2[i16] == i15) {
                    InterfaceC20035o interfaceC20035o2 = interfaceC20035oArr[i16];
                    interfaceC20035o2.getClass();
                    C32766w0 c32766w1 = (C32766w0) map.get(interfaceC20035o2.mo54502j());
                    c32766w1.getClass();
                    interfaceC20035oArr2[i16] = new C32724b0(interfaceC20035o2, c32766w1);
                } else {
                    interfaceC20035oArr2[i16] = null;
                }
                i16++;
                iArr = iArr;
                iArr2 = iArr2;
            }
            int[] iArr3 = iArr;
            int[] iArr4 = iArr2;
            ArrayList arrayList2 = arrayList;
            InterfaceC32756r0[] interfaceC32756r0Arr4 = interfaceC32756r0Arr3;
            int i17 = i15;
            long jMo102704j = interfaceC32757sArr[i15].mo102704j(interfaceC20035oArr2, zArr, interfaceC32756r0Arr4, zArr2, j13);
            if (i17 == 0) {
                j13 = jMo102704j;
            } else if (jMo102704j != j13) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z4 = false;
            for (int i18 = 0; i18 < interfaceC20035oArr.length; i18++) {
                if (iArr4[i18] == i17) {
                    InterfaceC32756r0 interfaceC32756r1 = interfaceC32756r0Arr4[i18];
                    interfaceC32756r1.getClass();
                    interfaceC32756r0Arr2[i18] = interfaceC32756r0Arr4[i18];
                    identityHashMap.put(interfaceC32756r1, Integer.valueOf(i17));
                    z4 = true;
                } else if (iArr3[i18] == i17) {
                    AbstractC24543a.m71573i(interfaceC32756r0Arr4[i18] == null);
                }
            }
            if (z4) {
                arrayList2.add(interfaceC32757sArr[i17]);
            }
            i15 = i17 + 1;
            arrayList = arrayList2;
            interfaceC32756r0Arr3 = interfaceC32756r0Arr4;
            iArr = iArr3;
            iArr2 = iArr4;
        }
        System.arraycopy(interfaceC32756r0Arr2, 0, interfaceC32756r0Arr, 0, length2);
        InterfaceC32757s[] interfaceC32757sArr2 = (InterfaceC32757s[]) arrayList.toArray(new InterfaceC32757s[0]);
        this.f136068H = interfaceC32757sArr2;
        this.f136072y.getClass();
        this.f136069I = new C29934u0(interfaceC32757sArr2, 17);
        return j13;
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: k */
    public final C32768x0 mo102705k() {
        C32768x0 c32768x0 = this.f136067G;
        c32768x0.getClass();
        return c32768x0;
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: m */
    public final long mo91533m() {
        return this.f136069I.mo91533m();
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: n */
    public final void mo91534n(long j7) {
        this.f136069I.mo91534n(j7);
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: u */
    public final boolean mo91536u(long j7) {
        ArrayList arrayList = this.f136073z;
        if (arrayList.isEmpty()) {
            return this.f136069I.mo91536u(j7);
        }
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((InterfaceC32757s) arrayList.get(i13)).mo91536u(j7);
        }
        return false;
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: v */
    public final long mo102707v(long j7, C31537h1 c31537h1) {
        InterfaceC32757s[] interfaceC32757sArr = this.f136068H;
        return (interfaceC32757sArr.length > 0 ? interfaceC32757sArr[0] : this.f136070w[0]).mo102707v(j7, c31537h1);
    }
}
