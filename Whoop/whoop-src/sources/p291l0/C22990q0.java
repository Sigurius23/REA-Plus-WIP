package p291l0;

import java.util.List;
import java.util.NoSuchElementException;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25271y;
import m83.C25272z;
import p000.AbstractC11266d;
import p002a0.C0046q;
import p127ev.AbstractC13673n;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39126r;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p635y2.InterfaceC39151z0;
import p636y3.AbstractC39170b;
import p636y3.C39174f;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: l0.q0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22990q0 implements InterfaceC39151z0, InterfaceC22982n1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC22965i f90695a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC22974l f90696b;

    /* JADX INFO: renamed from: c */
    public final float f90697c;

    /* JADX INFO: renamed from: d */
    public final C22946d0 f90698d;

    /* JADX INFO: renamed from: e */
    public final float f90699e;

    /* JADX INFO: renamed from: f */
    public final int f90700f;

    /* JADX INFO: renamed from: g */
    public final C22984o0 f90701g;

    public C22990q0(InterfaceC22965i interfaceC22965i, InterfaceC22974l interfaceC22974l, float f13, C22946d0 c22946d0, float f14, int i13, C22984o0 c22984o0) {
        this.f90695a = interfaceC22965i;
        this.f90696b = interfaceC22974l;
        this.f90697c = f13;
        this.f90698d = c22946d0;
        this.f90699e = f14;
        this.f90700f = i13;
        this.f90701g = c22984o0;
    }

    /* JADX INFO: renamed from: k */
    public static int m66765k(List list, int i13, int i14, int i15, int i16, C22984o0 c22984o0) {
        long jM97a = C0046q.m97a(0, 0);
        if (!list.isEmpty()) {
            int i17 = Integer.MAX_VALUE;
            C22975l0 c22975l0 = new C22975l0(i16, c22984o0, AbstractC39170b.m124769a(0, i13, 0, Integer.MAX_VALUE), i14, i15);
            InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) AbstractC25265s.m74102I0(0, list);
            int iMo438C = interfaceC39124q0 != null ? interfaceC39124q0.mo438C(i13) : 0;
            int iMo446O = interfaceC39124q0 != null ? interfaceC39124q0.mo446O(iMo438C) : 0;
            int i18 = 0;
            if (c22975l0.m66737b(list.size() > 1, 0, C0046q.m97a(i13, Integer.MAX_VALUE), interfaceC39124q0 == null ? null : new C0046q(C0046q.m97a(iMo446O, iMo438C)), 0, 0, 0, false, false).f90640b) {
                c22984o0.getClass();
                EnumC22981n0 enumC22981n0 = EnumC22981n0.f90670w;
                jM97a = jM97a;
            } else {
                int size = list.size();
                int i19 = i13;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                while (i26 < size) {
                    int i29 = i19 - iMo446O;
                    i26++;
                    int iMax = Math.max(i25, iMo438C);
                    InterfaceC39124q0 interfaceC39124q1 = (InterfaceC39124q0) AbstractC25265s.m74102I0(i26, list);
                    iMo438C = interfaceC39124q1 != null ? interfaceC39124q1.mo438C(i13) : 0;
                    int iMo446O2 = interfaceC39124q1 != null ? interfaceC39124q1.mo446O(iMo438C) + i14 : 0;
                    int i34 = i26 - i28;
                    int i35 = i24;
                    int i36 = iMo446O2;
                    C22972k0 c22972k0M66737b = c22975l0.m66737b(i26 + 2 < list.size(), i34, C0046q.m97a(i29, i17), interfaceC39124q1 == null ? null : new C0046q(C0046q.m97a(iMo446O2, iMo438C)), i35, i18, iMax, false, false);
                    if (c22972k0M66737b.f90639a) {
                        int i37 = iMax + i15 + i18;
                        c22975l0.m66736a(c22972k0M66737b, interfaceC39124q1 != null, i35, i37, i29, i34);
                        int i38 = i36 - i14;
                        i24 = i35 + 1;
                        if (c22972k0M66737b.f90640b) {
                            i27 = i26;
                            i18 = i37;
                            break;
                        }
                        i19 = i13;
                        i28 = i26;
                        iMo446O = i38;
                        i18 = i37;
                        i25 = 0;
                    } else {
                        iMo446O = i36;
                        i19 = i29;
                        i24 = i35;
                        i25 = iMax;
                    }
                    i27 = i26;
                    i17 = Integer.MAX_VALUE;
                }
                jM97a = C0046q.m97a(i18 - i15, i27);
            }
        }
        return (int) (jM97a >> 32);
    }

    /* JADX WARN: Failed to calculate best type for var: r34v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r34v0 ??, new type: l0.l0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r34v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r34v0 ??, new type: l0.l0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r36v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r36v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r36v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r36v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r36v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r36v3 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r36v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r36v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r36v2 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // p635y2.InterfaceC39151z0
    /* JADX INFO: renamed from: a */
    public final p635y2.InterfaceC39130s0 mo43536a(p635y2.InterfaceC39133t0 r54, java.util.List r55, long r56) {
        /*
            Method dump skipped, instruction units count: 1201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p291l0.C22990q0.mo43536a(y2.t0, java.util.List, long):y2.s0");
    }

    @Override // p635y2.InterfaceC39151z0
    /* JADX INFO: renamed from: b */
    public final int mo66766b(InterfaceC39126r interfaceC39126r, List list, int i13) {
        List list2 = (List) AbstractC25265s.m74102I0(1, list);
        InterfaceC39124q0 interfaceC39124q0 = list2 != null ? (InterfaceC39124q0) AbstractC25265s.m74100H0(list2) : null;
        List list3 = (List) AbstractC25265s.m74102I0(2, list);
        this.f90701g.m66758a(interfaceC39124q0, list3 != null ? (InterfaceC39124q0) AbstractC25265s.m74100H0(list3) : null, AbstractC39170b.m124770b(i13, 0, 13));
        List list4 = (List) AbstractC25265s.m74100H0(list);
        if (list4 == null) {
            list4 = C25271y.f99162w;
        }
        return m66765k(list4, i13, interfaceC39126r.mo724F(this.f90697c), interfaceC39126r.mo724F(this.f90699e), this.f90700f, this.f90701g);
    }

    @Override // p635y2.InterfaceC39151z0
    /* JADX INFO: renamed from: c */
    public final int mo66767c(InterfaceC39126r interfaceC39126r, List list, int i13) {
        List list2 = (List) AbstractC25265s.m74102I0(1, list);
        InterfaceC39124q0 interfaceC39124q0 = list2 != null ? (InterfaceC39124q0) AbstractC25265s.m74100H0(list2) : null;
        List list3 = (List) AbstractC25265s.m74102I0(2, list);
        this.f90701g.m66758a(interfaceC39124q0, list3 != null ? (InterfaceC39124q0) AbstractC25265s.m74100H0(list3) : null, AbstractC39170b.m124770b(0, i13, 7));
        List list4 = (List) AbstractC25265s.m74100H0(list);
        if (list4 == null) {
            list4 = C25271y.f99162w;
        }
        int iMo724F = interfaceC39126r.mo724F(this.f90697c);
        int size = list4.size();
        int i14 = 0;
        int iMax = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < size) {
            int iMo447Q = ((InterfaceC39124q0) list4.get(i14)).mo447Q(i13) + iMo724F;
            int i17 = i14 + 1;
            if (i17 - i15 == this.f90700f || i17 == list4.size()) {
                iMax = Math.max(iMax, (i16 + iMo447Q) - iMo724F);
                i15 = i14;
                i16 = 0;
            } else {
                i16 += iMo447Q;
            }
            i14 = i17;
        }
        return iMax;
    }

    @Override // p635y2.InterfaceC39151z0
    /* JADX INFO: renamed from: d */
    public final int mo66768d(InterfaceC39126r interfaceC39126r, List list, int i13) {
        List list2 = (List) AbstractC25265s.m74102I0(1, list);
        InterfaceC39124q0 interfaceC39124q0 = list2 != null ? (InterfaceC39124q0) AbstractC25265s.m74100H0(list2) : null;
        List list3 = (List) AbstractC25265s.m74102I0(2, list);
        this.f90701g.m66758a(interfaceC39124q0, list3 != null ? (InterfaceC39124q0) AbstractC25265s.m74100H0(list3) : null, AbstractC39170b.m124770b(i13, 0, 13));
        List list4 = (List) AbstractC25265s.m74100H0(list);
        if (list4 == null) {
            list4 = C25271y.f99162w;
        }
        return m66765k(list4, i13, interfaceC39126r.mo724F(this.f90697c), interfaceC39126r.mo724F(this.f90699e), this.f90700f, this.f90701g);
    }

    @Override // p635y2.InterfaceC39151z0
    /* JADX INFO: renamed from: e */
    public final int mo66769e(InterfaceC39126r interfaceC39126r, List list, int i13) {
        int[] iArr;
        List list2;
        long jM97a;
        C22990q0 c22990q0 = this;
        int i14 = i13;
        List list3 = (List) AbstractC25265s.m74102I0(1, list);
        InterfaceC39124q0 interfaceC39124q0 = list3 != null ? (InterfaceC39124q0) AbstractC25265s.m74100H0(list3) : null;
        List list4 = (List) AbstractC25265s.m74102I0(2, list);
        c22990q0.f90701g.m66758a(interfaceC39124q0, list4 != null ? (InterfaceC39124q0) AbstractC25265s.m74100H0(list4) : null, AbstractC39170b.m124770b(0, i14, 7));
        List list5 = (List) AbstractC25265s.m74100H0(list);
        if (list5 == null) {
            list5 = C25271y.f99162w;
        }
        int iMo724F = interfaceC39126r.mo724F(c22990q0.f90697c);
        int iMo724F2 = interfaceC39126r.mo724F(c22990q0.f90699e);
        long jM97a2 = C0046q.m97a(0, 0);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        List list6 = list5;
        int size3 = list6.size();
        for (int i15 = 0; i15 < size3; i15++) {
            InterfaceC39124q0 interfaceC39124q1 = (InterfaceC39124q0) list5.get(i15);
            int iMo446O = interfaceC39124q1.mo446O(i14);
            iArr2[i15] = iMo446O;
            iArr3[i15] = interfaceC39124q1.mo438C(iMo446O);
        }
        int size4 = list5.size();
        C22984o0 c22984o0 = c22990q0.f90701g;
        if (Integer.MAX_VALUE < size4) {
            c22984o0.getClass();
            EnumC22981n0 enumC22981n0 = EnumC22981n0.f90670w;
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            c22984o0.getClass();
            EnumC22981n0 enumC22981n1 = EnumC22981n0.f90670w;
        }
        int iMin = Math.min(Integer.MAX_VALUE, list5.size());
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            i16 += iArr2[i17];
        }
        int size5 = ((list5.size() - 1) * iMo724F) + i16;
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i18 = iArr3[0];
        int i19 = size2 - 1;
        int i24 = 0;
        if (1 <= i19) {
            int i25 = i18;
            int i26 = 1;
            while (true) {
                int i27 = iArr3[i26];
                if (i25 < i27) {
                    i25 = i27;
                }
                if (i26 == i19) {
                    break;
                }
                i26++;
            }
            i18 = i25;
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i28 = iArr2[0];
        int i29 = size - 1;
        if (1 <= i29) {
            int i34 = 1;
            while (true) {
                int i35 = iArr2[i34];
                if (i28 < i35) {
                    i28 = i35;
                }
                if (i34 == i29) {
                    break;
                }
                i34++;
            }
        }
        int i36 = size5;
        int i37 = i18;
        while (i28 <= i36 && i37 != i14) {
            int i38 = (i28 + i36) / 2;
            if (list5.isEmpty()) {
                list2 = list5;
                iArr2 = iArr2;
                jM97a = jM97a2;
                iArr = iArr3;
            } else {
                int i39 = i24;
                iArr = iArr3;
                C22975l0 c22975l0 = new C22975l0(c22990q0.f90700f, c22984o0, AbstractC39170b.m124769a(i39, i38, i39, Integer.MAX_VALUE), iMo724F, iMo724F2);
                InterfaceC39124q0 interfaceC39124q2 = (InterfaceC39124q0) AbstractC25265s.m74102I0(i39, list5);
                int i44 = interfaceC39124q2 != null ? iArr[i39] : i39;
                int i45 = interfaceC39124q2 != null ? iArr2[i39] : i39;
                int i46 = 0;
                int i47 = 0;
                if (c22975l0.m66737b(list5.size() > 1, 0, C0046q.m97a(i38, Integer.MAX_VALUE), interfaceC39124q2 == null ? null : new C0046q(C0046q.m97a(i45, i44)), 0, 0, 0, false, false).f90640b) {
                    c22984o0.getClass();
                    EnumC22981n0 enumC22981n2 = EnumC22981n0.f90670w;
                    list2 = list5;
                    jM97a = jM97a2;
                } else {
                    int size6 = list6.size();
                    int i48 = i38;
                    int i49 = i44;
                    int i54 = i45;
                    int i55 = 0;
                    int i56 = 0;
                    int i57 = 0;
                    int i58 = 0;
                    while (true) {
                        if (i56 >= size6) {
                            list2 = list5;
                            break;
                        }
                        int i59 = i48 - i54;
                        int i64 = size6;
                        int i65 = i56 + 1;
                        int iMax = Math.max(i55, i49);
                        InterfaceC39124q0 interfaceC39124q3 = (InterfaceC39124q0) AbstractC25265s.m74102I0(i65, list5);
                        i49 = interfaceC39124q3 != null ? iArr[i65] : 0;
                        int i66 = interfaceC39124q3 != null ? iArr2[i65] + iMo724F : 0;
                        list2 = list5;
                        int i67 = i65 - i57;
                        C22972k0 c22972k0M66737b = c22975l0.m66737b(i56 + 2 < list2.size(), i67, C0046q.m97a(i59, Integer.MAX_VALUE), interfaceC39124q3 == 0 ? null : new C0046q(C0046q.m97a(i66, i49)), i46, i47, iMax, false, false);
                        if (c22972k0M66737b.f90639a) {
                            int i68 = iMax + iMo724F2 + i47;
                            int i69 = i46;
                            c22975l0.m66736a(c22972k0M66737b, interfaceC39124q3 != null, i69, i68, i59, i67);
                            int i74 = i66 - iMo724F;
                            i46 = i69 + 1;
                            if (c22972k0M66737b.f90640b) {
                                i58 = i65;
                                i47 = i68;
                                break;
                            }
                            i54 = i74;
                            i57 = i65;
                            i48 = i38;
                            i47 = i68;
                            i55 = 0;
                        } else {
                            i54 = i66;
                            i48 = i59;
                            i55 = iMax;
                        }
                        i56 = i65;
                        i58 = i56;
                        list5 = list2;
                        size6 = i64;
                    }
                    jM97a = C0046q.m97a(i47 - iMo724F2, i58);
                }
            }
            int i75 = (int) (jM97a >> 32);
            int i76 = (int) (jM97a & 4294967295L);
            i14 = i13;
            if (i75 > i14 || i76 < iMin) {
                i28 = i38 + 1;
                if (i28 > i36) {
                    return i28;
                }
            } else {
                if (i75 >= i14) {
                    return i38;
                }
                i36 = i38 - 1;
            }
            size5 = i38;
            iArr2 = iArr2;
            iArr3 = iArr;
            list5 = list2;
            i24 = 0;
            i37 = i75;
            c22990q0 = this;
        }
        return size5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22990q0)) {
            return false;
        }
        C22990q0 c22990q0 = (C22990q0) obj;
        return this.f90695a.equals(c22990q0.f90695a) && this.f90696b.equals(c22990q0.f90696b) && C39174f.m124782b(this.f90697c, c22990q0.f90697c) && this.f90698d.equals(c22990q0.f90698d) && C39174f.m124782b(this.f90699e, c22990q0.f90699e) && this.f90700f == c22990q0.f90700f && AbstractC22676k.m65745e(this.f90701g, c22990q0.f90701g);
    }

    @Override // p291l0.InterfaceC22982n1
    /* JADX INFO: renamed from: f */
    public final int mo66753f(AbstractC39104j1 abstractC39104j1) {
        return abstractC39104j1.mo451g0();
    }

    @Override // p291l0.InterfaceC22982n1
    /* JADX INFO: renamed from: g */
    public final long mo66754g(int i13, int i14, int i15, boolean z4) {
        C22994r1 c22994r1 = AbstractC22988p1.f90690a;
        return !z4 ? AbstractC39170b.m124769a(i13, i14, 0, i15) : AbstractC35854l.m113834n(i13, i14, 0, i15);
    }

    @Override // p291l0.InterfaceC22982n1
    /* JADX INFO: renamed from: h */
    public final int mo66755h(AbstractC39104j1 abstractC39104j1) {
        return abstractC39104j1.mo452j0();
    }

    public final int hashCode() {
        return this.f90701g.hashCode() + AbstractC11266d.m30448b(Integer.MAX_VALUE, AbstractC11266d.m30448b(this.f90700f, AbstractC11266d.m30447a(this.f90699e, (this.f90698d.hashCode() + AbstractC11266d.m30447a(this.f90697c, (this.f90696b.hashCode() + ((this.f90695a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    @Override // p291l0.InterfaceC22982n1
    /* JADX INFO: renamed from: i */
    public final InterfaceC39130s0 mo66756i(final AbstractC39104j1[] abstractC39104j1Arr, InterfaceC39133t0 interfaceC39133t0, final int i13, final int[] iArr, int i14, final int i15, final int[] iArr2, final int i16, final int i17, final int i18) {
        final EnumC39181m enumC39181m = EnumC39181m.f168423w;
        return interfaceC39133t0.mo86822W(i14, i15, C25272z.f99163w, new Function1() { // from class: l0.p0
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AbstractC22953f abstractC22953f;
                AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
                int[] iArr3 = iArr2;
                int i19 = iArr3 != null ? iArr3[i16] : 0;
                int i24 = i17;
                for (int i25 = i24; i25 < i18; i25++) {
                    AbstractC39104j1 abstractC39104j1 = abstractC39104j1Arr[i25];
                    AbstractC22676k.m65747g(abstractC39104j1);
                    Object objMo454p = abstractC39104j1.mo454p();
                    C22985o1 c22985o1 = objMo454p instanceof C22985o1 ? (C22985o1) objMo454p : null;
                    if (c22985o1 == null || (abstractC22953f = c22985o1.f90676c) == null) {
                        abstractC22953f = this.f90698d;
                    }
                    abstractC39101i1.m124632f(abstractC39104j1, iArr[i25 - i24], abstractC22953f.mo66707d(i15 - abstractC39104j1.mo451g0(), enumC39181m, abstractC39104j1, i13) + i19, 0.0f);
                }
                return C23454a0.f92919a;
            }
        });
    }

    @Override // p291l0.InterfaceC22982n1
    /* JADX INFO: renamed from: j */
    public final void mo66757j(int i13, int[] iArr, int[] iArr2, InterfaceC39133t0 interfaceC39133t0) {
        this.f90695a.mo66713c(interfaceC39133t0, i13, iArr, interfaceC39133t0.getLayoutDirection(), iArr2);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=");
        sb4.append(this.f90695a);
        sb4.append(", verticalArrangement=");
        sb4.append(this.f90696b);
        sb4.append(", mainAxisSpacing=");
        AbstractC13673n.m38572s(this.f90697c, ", crossAxisAlignment=", sb4);
        sb4.append(this.f90698d);
        sb4.append(", crossAxisArrangementSpacing=");
        AbstractC13673n.m38572s(this.f90699e, ", maxItemsInMainAxis=", sb4);
        sb4.append(this.f90700f);
        sb4.append(", maxLines=2147483647, overflow=");
        sb4.append(this.f90701g);
        sb4.append(')');
        return sb4.toString();
    }
}
