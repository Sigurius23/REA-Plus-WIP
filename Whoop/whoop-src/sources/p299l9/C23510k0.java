package p299l9;

import g73.C15553a;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import p031b9.C2846k1;
import p031b9.C2856o0;
import p213i7.C18194g;
import p361o9.InterfaceC27679s;
import p516u8.C34608o;
import p516u8.C34610p;
import p516u8.C34611p0;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import p690zr.C41017e0;
import p690zr.C41060w0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: l9.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23510k0 implements InterfaceC23482a0, InterfaceC23539z {

    /* JADX INFO: renamed from: E */
    public final ArrayList f93047E = new ArrayList();

    /* JADX INFO: renamed from: F */
    public final HashMap f93048F = new HashMap();

    /* JADX INFO: renamed from: G */
    public InterfaceC23539z f93049G;

    /* JADX INFO: renamed from: H */
    public C23501g1 f93050H;

    /* JADX INFO: renamed from: I */
    public InterfaceC23482a0[] f93051I;

    /* JADX INFO: renamed from: J */
    public C23511l f93052J;

    /* JADX INFO: renamed from: w */
    public final InterfaceC23482a0[] f93053w;

    /* JADX INFO: renamed from: x */
    public final boolean[] f93054x;

    /* JADX INFO: renamed from: y */
    public final IdentityHashMap f93055y;

    /* JADX INFO: renamed from: z */
    public final C15553a f93056z;

    public C23510k0(C15553a c15553a, long[] jArr, InterfaceC23482a0... interfaceC23482a0Arr) {
        this.f93056z = c15553a;
        this.f93053w = interfaceC23482a0Arr;
        c15553a.getClass();
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        C41060w0 c41060w0 = C41060w0.f177067E;
        this.f93052J = new C23511l(c41060w0, c41060w0);
        this.f93055y = new IdentityHashMap();
        this.f93051I = new InterfaceC23482a0[0];
        this.f93054x = new boolean[interfaceC23482a0Arr.length];
        for (int i13 = 0; i13 < interfaceC23482a0Arr.length; i13++) {
            long j7 = jArr[i13];
            if (j7 != 0) {
                this.f93054x[i13] = true;
                this.f93053w[i13] = new C23498f1(interfaceC23482a0Arr[i13], j7);
            }
        }
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: a */
    public final boolean mo36121a() {
        return this.f93052J.mo36121a();
    }

    @Override // p299l9.InterfaceC23483a1
    /* JADX INFO: renamed from: b */
    public final void mo8198b(InterfaceC23486b1 interfaceC23486b1) {
        InterfaceC23539z interfaceC23539z = this.f93049G;
        interfaceC23539z.getClass();
        interfaceC23539z.mo8198b(this);
    }

    @Override // p299l9.InterfaceC23539z
    /* JADX INFO: renamed from: c */
    public final void mo8200c(InterfaceC23482a0 interfaceC23482a0) {
        ArrayList arrayList = this.f93047E;
        arrayList.remove(interfaceC23482a0);
        if (arrayList.isEmpty()) {
            InterfaceC23482a0[] interfaceC23482a0Arr = this.f93053w;
            int i13 = 0;
            for (InterfaceC23482a0 interfaceC23482a1 : interfaceC23482a0Arr) {
                i13 += interfaceC23482a1.mo36128k().f93027a;
            }
            C34611p0[] c34611p0Arr = new C34611p0[i13];
            int i14 = 0;
            for (int i15 = 0; i15 < interfaceC23482a0Arr.length; i15++) {
                C23501g1 c23501g1Mo36128k = interfaceC23482a0Arr[i15].mo36128k();
                int i16 = c23501g1Mo36128k.f93027a;
                int i17 = 0;
                while (i17 < i16) {
                    C34611p0 c34611p0M68058a = c23501g1Mo36128k.m68058a(i17);
                    int i18 = c34611p0M68058a.f145796a;
                    C34610p[] c34610pArr = new C34610p[i18];
                    for (int i19 = 0; i19 < i18; i19++) {
                        C34610p c34610p = c34611p0M68058a.f145799d[i19];
                        C34608o c34608oM109410a = c34610p.m109410a();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i15);
                        sb4.append(":");
                        String str = c34610p.f145770a;
                        if (str == null) {
                            str = "";
                        }
                        sb4.append(str);
                        c34608oM109410a.f145729a = sb4.toString();
                        c34610pArr[i19] = new C34610p(c34608oM109410a);
                    }
                    C34611p0 c34611p0 = new C34611p0(i15 + ":" + c34611p0M68058a.f145797b, c34610pArr);
                    this.f93048F.put(c34611p0, c34611p0M68058a);
                    c34611p0Arr[i14] = c34611p0;
                    i17++;
                    i14++;
                }
            }
            this.f93050H = new C23501g1(c34611p0Arr);
            InterfaceC23539z interfaceC23539z = this.f93049G;
            interfaceC23539z.getClass();
            interfaceC23539z.mo8200c(this);
        }
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: d */
    public final long mo36122d() {
        return this.f93052J.mo36122d();
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: e */
    public final long mo36123e(long j7) {
        long jMo36123e = this.f93051I[0].mo36123e(j7);
        int i13 = 1;
        while (true) {
            InterfaceC23482a0[] interfaceC23482a0Arr = this.f93051I;
            if (i13 >= interfaceC23482a0Arr.length) {
                return jMo36123e;
            }
            if (interfaceC23482a0Arr[i13].mo36123e(jMo36123e) != jMo36123e) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i13++;
        }
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: f */
    public final long mo36124f() {
        long j7 = -9223372036854775807L;
        for (InterfaceC23482a0 interfaceC23482a0 : this.f93051I) {
            long jMo36124f = interfaceC23482a0.mo36124f();
            if (jMo36124f == -9223372036854775807L) {
                if (j7 != -9223372036854775807L && interfaceC23482a0.mo36123e(j7) != j7) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j7 == -9223372036854775807L) {
                for (InterfaceC23482a0 interfaceC23482a1 : this.f93051I) {
                    if (interfaceC23482a1 == interfaceC23482a0) {
                        break;
                    }
                    if (interfaceC23482a1.mo36123e(jMo36124f) != jMo36124f) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j7 = jMo36124f;
            } else if (jMo36124f != j7) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j7;
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: h */
    public final void mo36125h() {
        for (InterfaceC23482a0 interfaceC23482a0 : this.f93053w) {
            interfaceC23482a0.mo36125h();
        }
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: i */
    public final void mo36126i(long j7) {
        for (InterfaceC23482a0 interfaceC23482a0 : this.f93051I) {
            interfaceC23482a0.mo36126i(j7);
        }
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: k */
    public final C23501g1 mo36128k() {
        C23501g1 c23501g1 = this.f93050H;
        c23501g1.getClass();
        return c23501g1;
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: m */
    public final long mo36129m() {
        return this.f93052J.mo36129m();
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: n */
    public final void mo36130n(long j7) {
        this.f93052J.mo36130n(j7);
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: s */
    public final long mo36131s(long j7, C2846k1 c2846k1) {
        InterfaceC23482a0[] interfaceC23482a0Arr = this.f93051I;
        return (interfaceC23482a0Arr.length > 0 ? interfaceC23482a0Arr[0] : this.f93053w[0]).mo36131s(j7, c2846k1);
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: t */
    public final void mo36132t(InterfaceC23539z interfaceC23539z, long j7) {
        this.f93049G = interfaceC23539z;
        ArrayList arrayList = this.f93047E;
        InterfaceC23482a0[] interfaceC23482a0Arr = this.f93053w;
        Collections.addAll(arrayList, interfaceC23482a0Arr);
        for (InterfaceC23482a0 interfaceC23482a0 : interfaceC23482a0Arr) {
            interfaceC23482a0.mo36132t(this, j7);
        }
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: u */
    public final long mo36133u(InterfaceC27679s[] interfaceC27679sArr, boolean[] zArr, InterfaceC23540z0[] interfaceC23540z0Arr, boolean[] zArr2, long j7) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[interfaceC27679sArr.length];
        int[] iArr2 = new int[interfaceC27679sArr.length];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int length = interfaceC27679sArr.length;
            identityHashMap = this.f93055y;
            if (i14 >= length) {
                break;
            }
            InterfaceC23540z0 interfaceC23540z0 = interfaceC23540z0Arr[i14];
            Integer num = interfaceC23540z0 == null ? null : (Integer) identityHashMap.get(interfaceC23540z0);
            iArr[i14] = num == null ? -1 : num.intValue();
            InterfaceC27679s interfaceC27679s = interfaceC27679sArr[i14];
            if (interfaceC27679s != null) {
                String str = interfaceC27679s.mo68078j().f145797b;
                iArr2[i14] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i14] = -1;
            }
            i14++;
        }
        identityHashMap.clear();
        int length2 = interfaceC27679sArr.length;
        InterfaceC23540z0[] interfaceC23540z0Arr2 = new InterfaceC23540z0[length2];
        InterfaceC23540z0[] interfaceC23540z0Arr3 = new InterfaceC23540z0[interfaceC27679sArr.length];
        InterfaceC27679s[] interfaceC27679sArr2 = new InterfaceC27679s[interfaceC27679sArr.length];
        InterfaceC23482a0[] interfaceC23482a0Arr = this.f93053w;
        ArrayList arrayList = new ArrayList(interfaceC23482a0Arr.length);
        long j13 = j7;
        int i15 = 0;
        while (i15 < interfaceC23482a0Arr.length) {
            int i16 = i13;
            while (i16 < interfaceC27679sArr.length) {
                interfaceC23540z0Arr3[i16] = iArr[i16] == i15 ? interfaceC23540z0Arr[i16] : null;
                if (iArr2[i16] == i15) {
                    InterfaceC27679s interfaceC27679s2 = interfaceC27679sArr[i16];
                    interfaceC27679s2.getClass();
                    C34611p0 c34611p0 = (C34611p0) this.f93048F.get(interfaceC27679s2.mo68078j());
                    c34611p0.getClass();
                    interfaceC27679sArr2[i16] = new C23508j0(interfaceC27679s2, c34611p0);
                } else {
                    interfaceC27679sArr2[i16] = null;
                }
                i16++;
                iArr = iArr;
            }
            int[] iArr3 = iArr;
            InterfaceC23482a0[] interfaceC23482a0Arr2 = interfaceC23482a0Arr;
            int i17 = i15;
            long jMo36133u = interfaceC23482a0Arr2[i15].mo36133u(interfaceC27679sArr2, zArr, interfaceC23540z0Arr3, zArr2, j13);
            if (i17 == 0) {
                j13 = jMo36133u;
            } else if (jMo36133u != j13) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z4 = false;
            for (int i18 = 0; i18 < interfaceC27679sArr.length; i18++) {
                if (iArr2[i18] == i17) {
                    InterfaceC23540z0 interfaceC23540z1 = interfaceC23540z0Arr3[i18];
                    interfaceC23540z1.getClass();
                    interfaceC23540z0Arr2[i18] = interfaceC23540z0Arr3[i18];
                    identityHashMap.put(interfaceC23540z1, Integer.valueOf(i17));
                    z4 = true;
                } else if (iArr3[i18] == i17) {
                    AbstractC35849g.m113807i(interfaceC23540z0Arr3[i18] == null);
                }
            }
            if (z4) {
                arrayList.add(interfaceC23482a0Arr2[i17]);
            }
            i15 = i17 + 1;
            interfaceC23482a0Arr = interfaceC23482a0Arr2;
            iArr = iArr3;
            i13 = 0;
        }
        int i19 = i13;
        System.arraycopy(interfaceC23540z0Arr2, i19, interfaceC23540z0Arr, i19, length2);
        this.f93051I = (InterfaceC23482a0[]) arrayList.toArray(new InterfaceC23482a0[i19]);
        AbstractList abstractListM133290t = AbstractC41047q.m133290t(arrayList, new C18194g(27));
        this.f93056z.getClass();
        this.f93052J = new C23511l(arrayList, abstractListM133290t);
        return j13;
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: x */
    public final boolean mo36134x(C2856o0 c2856o0) {
        ArrayList arrayList = this.f93047E;
        if (arrayList.isEmpty()) {
            return this.f93052J.mo36134x(c2856o0);
        }
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((InterfaceC23482a0) arrayList.get(i13)).mo36134x(c2856o0);
        }
        return false;
    }
}
