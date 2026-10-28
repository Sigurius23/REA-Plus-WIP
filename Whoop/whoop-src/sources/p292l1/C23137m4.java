package p292l1;

import androidx.compose.p018ui.layout.AbstractC1131a;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import java.util.List;
import kf0.C22437l;
import l83.C23454a0;
import m83.C25272z;
import p006a4.AbstractC0355b;
import p026b2.C2305k;
import p088dc.AbstractC11895b;
import p291l0.InterfaceC22973k1;
import p316m1.AbstractC24899e0;
import p316m1.AbstractC24913l0;
import p316m1.C24911k0;
import p354o1.AbstractC27376o;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39126r;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.C39169a;
import p636y3.EnumC39181m;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: l1.m4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23137m4 implements InterfaceC39127r0 {

    /* JADX INFO: renamed from: a */
    public final boolean f91489a;

    /* JADX INFO: renamed from: b */
    public final C23125k4 f91490b;

    /* JADX INFO: renamed from: c */
    public final C24911k0 f91491c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC22973k1 f91492d;

    /* JADX INFO: renamed from: e */
    public final float f91493e;

    public C23137m4(boolean z4, C23125k4 c23125k4, C24911k0 c24911k0, InterfaceC22973k1 interfaceC22973k1, float f13) {
        this.f91489a = z4;
        this.f91490b = c23125k4;
        this.f91491c = c24911k0;
        this.f91492d = interfaceC22973k1;
        this.f91493e = f13;
    }

    /* JADX INFO: renamed from: h */
    public static int m67111h(List list, int i13, InterfaceC4351m interfaceC4351m) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        List list2 = list;
        int size = list2.size();
        for (int i14 = 0; i14 < size; i14++) {
            Object obj7 = list.get(i14);
            if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj7), "TextField")) {
                int iIntValue = ((Number) interfaceC4351m.invoke(obj7, Integer.valueOf(i13))).intValue();
                int size2 = list2.size();
                int i15 = 0;
                while (true) {
                    obj = null;
                    if (i15 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i15);
                    if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj2), "Label")) {
                        break;
                    }
                    i15++;
                }
                InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) obj2;
                int iIntValue2 = interfaceC39124q0 != null ? ((Number) interfaceC4351m.invoke(interfaceC39124q0, Integer.valueOf(i13))).intValue() : 0;
                int size3 = list2.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i16);
                    if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj3), "Trailing")) {
                        break;
                    }
                    i16++;
                }
                InterfaceC39124q0 interfaceC39124q1 = (InterfaceC39124q0) obj3;
                int iIntValue3 = interfaceC39124q1 != null ? ((Number) interfaceC4351m.invoke(interfaceC39124q1, Integer.valueOf(i13))).intValue() : 0;
                int size4 = list2.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i17);
                    if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj4), "Prefix")) {
                        break;
                    }
                    i17++;
                }
                InterfaceC39124q0 interfaceC39124q2 = (InterfaceC39124q0) obj4;
                int iIntValue4 = interfaceC39124q2 != null ? ((Number) interfaceC4351m.invoke(interfaceC39124q2, Integer.valueOf(i13))).intValue() : 0;
                int size5 = list2.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i18);
                    if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj5), "Suffix")) {
                        break;
                    }
                    i18++;
                }
                InterfaceC39124q0 interfaceC39124q3 = (InterfaceC39124q0) obj5;
                int iIntValue5 = interfaceC39124q3 != null ? ((Number) interfaceC4351m.invoke(interfaceC39124q3, Integer.valueOf(i13))).intValue() : 0;
                int size6 = list2.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i19);
                    if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj6), "Leading")) {
                        break;
                    }
                    i19++;
                }
                InterfaceC39124q0 interfaceC39124q4 = (InterfaceC39124q0) obj6;
                int iIntValue6 = interfaceC39124q4 != null ? ((Number) interfaceC4351m.invoke(interfaceC39124q4, Integer.valueOf(i13))).intValue() : 0;
                int size7 = list2.size();
                for (int i24 = 0; i24 < size7; i24++) {
                    Object obj8 = list.get(i24);
                    if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                InterfaceC39124q0 interfaceC39124q5 = (InterfaceC39124q0) obj;
                int i25 = iIntValue4 + iIntValue5;
                return AbstractC39170b.m124775g(Math.max(iIntValue + i25, Math.max((interfaceC39124q5 != null ? ((Number) interfaceC4351m.invoke(interfaceC39124q5, Integer.valueOf(i13))).intValue() : 0) + i25, iIntValue2)) + iIntValue6 + iIntValue3, AbstractC39170b.m124770b(0, 0, 15));
            }
        }
        AbstractC0355b.m989c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: i */
    public static final int m67112i(C23137m4 c23137m4, int i13, int i14, AbstractC39104j1 abstractC39104j1) {
        if (!c23137m4.f91489a) {
            return i14;
        }
        return AbstractC11895b.m31982a(1, 0.0f, (i13 - abstractC39104j1.f168212x) / 2.0f);
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo521a(final InterfaceC39133t0 interfaceC39133t0, List list, long j7) {
        Object obj;
        Object obj2;
        Object obj3;
        List list2;
        Object obj4;
        Object obj5;
        int i13;
        Object obj6;
        Object obj7;
        int i14;
        int i15;
        AbstractC39104j1 abstractC39104j1;
        int i16;
        float f13;
        int i17;
        int i18;
        int i19;
        float fInvoke = this.f91491c.invoke();
        InterfaceC22973k1 interfaceC22973k1 = this.f91492d;
        final int iMo724F = interfaceC39133t0.mo724F(interfaceC22973k1.mo43112d());
        int iMo724F2 = interfaceC39133t0.mo724F(interfaceC22973k1.mo43109a());
        long jM124758b = C39169a.m124758b(j7, 0, 0, 0, 0, 10);
        List list3 = list;
        int size = list3.size();
        int i24 = 0;
        while (true) {
            if (i24 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i24);
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj), "Leading")) {
                break;
            }
            i24++;
        }
        InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) obj;
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0 != null ? interfaceC39124q0.mo448T(jM124758b) : null;
        int i25 = abstractC39104j1Mo448T != null ? abstractC39104j1Mo448T.f168211w : 0;
        int iMax = Math.max(0, abstractC39104j1Mo448T != null ? abstractC39104j1Mo448T.f168212x : 0);
        int size2 = list3.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i26);
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj2), "Trailing")) {
                break;
            }
            i26++;
        }
        InterfaceC39124q0 interfaceC39124q1 = (InterfaceC39124q0) obj2;
        AbstractC39104j1 abstractC39104j1Mo448T2 = interfaceC39124q1 != null ? interfaceC39124q1.mo448T(AbstractC39170b.m124778j(-i25, 0, jM124758b, 2)) : null;
        int i27 = i25 + (abstractC39104j1Mo448T2 != null ? abstractC39104j1Mo448T2.f168211w : 0);
        int iMax2 = Math.max(iMax, abstractC39104j1Mo448T2 != null ? abstractC39104j1Mo448T2.f168212x : 0);
        int size3 = list3.size();
        int i28 = 0;
        while (true) {
            if (i28 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i28);
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj3), "Prefix")) {
                break;
            }
            i28++;
        }
        InterfaceC39124q0 interfaceC39124q2 = (InterfaceC39124q0) obj3;
        AbstractC39104j1 abstractC39104j1Mo448T3 = interfaceC39124q2 != null ? interfaceC39124q2.mo448T(AbstractC39170b.m124778j(-i27, 0, jM124758b, 2)) : null;
        int i29 = (abstractC39104j1Mo448T3 != null ? abstractC39104j1Mo448T3.f168211w : 0) + i27;
        int iMax3 = Math.max(iMax2, abstractC39104j1Mo448T3 != null ? abstractC39104j1Mo448T3.f168212x : 0);
        int size4 = list3.size();
        int i34 = 0;
        while (true) {
            if (i34 >= size4) {
                list2 = list3;
                obj4 = null;
                break;
            }
            obj4 = list.get(i34);
            list2 = list3;
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj4), "Suffix")) {
                break;
            }
            i34++;
            list3 = list2;
        }
        InterfaceC39124q0 interfaceC39124q3 = (InterfaceC39124q0) obj4;
        AbstractC39104j1 abstractC39104j1Mo448T4 = interfaceC39124q3 != null ? interfaceC39124q3.mo448T(AbstractC39170b.m124778j(-i29, 0, jM124758b, 2)) : null;
        int i35 = i29 + (abstractC39104j1Mo448T4 != null ? abstractC39104j1Mo448T4.f168211w : 0);
        int iMax4 = Math.max(iMax3, abstractC39104j1Mo448T4 != null ? abstractC39104j1Mo448T4.f168212x : 0);
        int size5 = list2.size();
        int i36 = 0;
        while (true) {
            if (i36 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i36);
            int i37 = size5;
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj5), "Label")) {
                break;
            }
            i36++;
            size5 = i37;
        }
        InterfaceC39124q0 interfaceC39124q4 = (InterfaceC39124q0) obj5;
        final C22669g0 c22669g0 = new C22669g0();
        int i38 = -i35;
        c22669g0.f89336w = interfaceC39124q4 != null ? interfaceC39124q4.mo448T(AbstractC39170b.m124777i(i38, jM124758b, -iMo724F2)) : null;
        int size6 = list2.size();
        int i39 = 0;
        while (true) {
            if (i39 >= size6) {
                i13 = iMo724F2;
                obj6 = null;
                break;
            }
            obj6 = list.get(i39);
            i13 = iMo724F2;
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj6), "Supporting")) {
                break;
            }
            i39++;
            iMo724F2 = i13;
        }
        InterfaceC39124q0 interfaceC39124q5 = (InterfaceC39124q0) obj6;
        int iMo438C = interfaceC39124q5 != null ? interfaceC39124q5.mo438C(C39169a.m124767k(j7)) : 0;
        AbstractC39104j1 abstractC39104j2 = (AbstractC39104j1) c22669g0.f89336w;
        int i44 = iMo724F + (abstractC39104j2 != null ? abstractC39104j2.f168212x : 0);
        InterfaceC39124q0 interfaceC39124q6 = interfaceC39124q5;
        long jM124777i = AbstractC39170b.m124777i(i38, C39169a.m124758b(j7, 0, 0, 0, 0, 11), ((-i44) - i13) - iMo438C);
        int size7 = list2.size();
        int i45 = 0;
        while (i45 < size7) {
            InterfaceC39124q0 interfaceC39124q7 = (InterfaceC39124q0) list.get(i45);
            int i46 = size7;
            int i47 = i44;
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a(interfaceC39124q7), "TextField")) {
                final AbstractC39104j1 abstractC39104j1Mo448T5 = interfaceC39124q7.mo448T(jM124777i);
                long jM124758b2 = C39169a.m124758b(jM124777i, 0, 0, 0, 0, 14);
                List list4 = list;
                int size8 = list4.size();
                int i48 = 0;
                while (true) {
                    if (i48 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i48);
                    int i49 = size8;
                    int i54 = i48;
                    if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj7), "Hint")) {
                        break;
                    }
                    i48 = i54 + 1;
                    size8 = i49;
                }
                InterfaceC39124q0 interfaceC39124q8 = (InterfaceC39124q0) obj7;
                AbstractC39104j1 abstractC39104j1Mo448T6 = interfaceC39124q8 != null ? interfaceC39124q8.mo448T(jM124758b2) : null;
                int iMax5 = Math.max(iMax4, Math.max(abstractC39104j1Mo448T5.f168212x, abstractC39104j1Mo448T6 != null ? abstractC39104j1Mo448T6.f168212x : 0) + i47 + i13);
                int i55 = abstractC39104j1Mo448T != null ? abstractC39104j1Mo448T.f168211w : 0;
                int i56 = abstractC39104j1Mo448T2 != null ? abstractC39104j1Mo448T2.f168211w : 0;
                int i57 = abstractC39104j1Mo448T3 != null ? abstractC39104j1Mo448T3.f168211w : 0;
                int i58 = abstractC39104j1Mo448T4 != null ? abstractC39104j1Mo448T4.f168211w : 0;
                int i59 = i55;
                int i64 = abstractC39104j1Mo448T5.f168211w;
                AbstractC39104j1 abstractC39104j3 = (AbstractC39104j1) c22669g0.f89336w;
                int i65 = i57 + i58;
                final int iM124775g = AbstractC39170b.m124775g(Math.max(i64 + i65, Math.max((abstractC39104j1Mo448T6 != null ? abstractC39104j1Mo448T6.f168211w : 0) + i65, abstractC39104j3 != null ? abstractC39104j3.f168211w : 0)) + i59 + i56, j7);
                final AbstractC39104j1 abstractC39104j1Mo448T7 = interfaceC39124q6 != null ? interfaceC39124q6.mo448T(C39169a.m124758b(AbstractC39170b.m124778j(0, -iMax5, jM124758b, 1), 0, iM124775g, 0, 0, 9)) : null;
                int i66 = abstractC39104j1Mo448T7 != null ? abstractC39104j1Mo448T7.f168212x : 0;
                int i67 = abstractC39104j1Mo448T5.f168212x;
                AbstractC39104j1 abstractC39104j4 = (AbstractC39104j1) c22669g0.f89336w;
                int i68 = abstractC39104j4 != null ? abstractC39104j4.f168212x : 0;
                int i69 = abstractC39104j1Mo448T != null ? abstractC39104j1Mo448T.f168212x : 0;
                int i74 = abstractC39104j1Mo448T2 != null ? abstractC39104j1Mo448T2.f168212x : 0;
                final AbstractC39104j1 abstractC39104j5 = abstractC39104j1Mo448T2;
                if (abstractC39104j1Mo448T3 != null) {
                    int i75 = i68;
                    i15 = abstractC39104j1Mo448T3.f168212x;
                    i14 = i75;
                } else {
                    i14 = i68;
                    i15 = 0;
                }
                int i76 = i14;
                int i77 = abstractC39104j1Mo448T4 != null ? abstractC39104j1Mo448T4.f168212x : 0;
                if (abstractC39104j1Mo448T6 != null) {
                    i16 = abstractC39104j1Mo448T6.f168212x;
                    abstractC39104j1 = abstractC39104j1Mo448T;
                } else {
                    abstractC39104j1 = abstractC39104j1Mo448T;
                    i16 = 0;
                }
                if (abstractC39104j1Mo448T7 != null) {
                    f13 = fInvoke;
                    i17 = i76;
                    i18 = abstractC39104j1Mo448T7.f168212x;
                    i19 = 0;
                } else {
                    f13 = fInvoke;
                    i17 = i76;
                    i18 = 0;
                    i19 = 0;
                }
                final int iM67113f = m67113f(interfaceC39133t0, i67, i17, i69, i74, i15, i77, i16, i18, j7, f13);
                final int i78 = iM67113f - i66;
                int size9 = list4.size();
                int i79 = i19;
                while (i79 < size9) {
                    InterfaceC39124q0 interfaceC39124q9 = (InterfaceC39124q0) list.get(i79);
                    if (AbstractC22676k.m65745e(AbstractC1131a.m3497a(interfaceC39124q9), "Container")) {
                        final AbstractC39104j1 abstractC39104j1Mo448T8 = interfaceC39124q9.mo448T(AbstractC39170b.m124769a(iM124775g != 2147483647 ? iM124775g : i19, iM124775g, i78 != Integer.MAX_VALUE ? i78 : i19, i78));
                        final float f14 = f13;
                        final AbstractC39104j1 abstractC39104j6 = abstractC39104j1Mo448T4;
                        final AbstractC39104j1 abstractC39104j7 = abstractC39104j1;
                        final AbstractC39104j1 abstractC39104j8 = abstractC39104j1Mo448T3;
                        final AbstractC39104j1 abstractC39104j9 = abstractC39104j1Mo448T6;
                        return interfaceC39133t0.mo86822W(iM124775g, iM67113f, C25272z.f99163w, new Function1() { // from class: l1.l4
                            /* JADX WARN: Code duplicated, block: B:20:0x009f  */
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                int iMo724F3;
                                int i83;
                                AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj8;
                                C22669g0 c22669g1 = c22669g0;
                                Object obj9 = c22669g1.f89336w;
                                C23137m4 c23137m4 = this;
                                InterfaceC39133t0 interfaceC39133t1 = interfaceC39133t0;
                                int i84 = iM124775g;
                                int i85 = iM67113f;
                                AbstractC39104j1 abstractC39104j10 = abstractC39104j1Mo448T5;
                                AbstractC39104j1 abstractC39104j11 = abstractC39104j9;
                                AbstractC39104j1 abstractC39104j12 = abstractC39104j7;
                                AbstractC39104j1 abstractC39104j13 = abstractC39104j5;
                                AbstractC39104j1 abstractC39104j14 = abstractC39104j8;
                                AbstractC39104j1 abstractC39104j15 = abstractC39104j6;
                                AbstractC39104j1 abstractC39104j16 = abstractC39104j1Mo448T8;
                                AbstractC39104j1 abstractC39104j17 = abstractC39104j1Mo448T7;
                                if (obj9 != null) {
                                    boolean z4 = c23137m4.f91489a;
                                    int i86 = iMo724F;
                                    if (z4) {
                                        iMo724F3 = AbstractC11895b.m31982a(1, 0.0f, (i78 - ((AbstractC39104j1) obj9).f168212x) / 2.0f);
                                    } else {
                                        iMo724F3 = interfaceC39133t1.mo724F(c23137m4.f91493e) + i86;
                                    }
                                    AbstractC39104j1 abstractC39104j18 = (AbstractC39104j1) c22669g1.f89336w;
                                    int i87 = abstractC39104j18.f168212x + i86;
                                    EnumC39181m layoutDirection = interfaceC39133t1.getLayoutDirection();
                                    C23125k4 c23125k4 = c23137m4.f91490b;
                                    abstractC39101i1.m124632f(abstractC39104j16, 0, 0, 0.0f);
                                    int i88 = i85 - (abstractC39104j17 != null ? abstractC39104j17.f168212x : 0);
                                    if (abstractC39104j12 != null) {
                                        AbstractC39101i1.m124624n(abstractC39104j12, 0, AbstractC11895b.m31982a(1, 0.0f, (i88 - abstractC39104j12.f168212x) / 2.0f), abstractC39101i1);
                                    }
                                    float f15 = f14;
                                    int iM36250P = AbstractC12889b.m36250P(f15, iMo724F3, i86);
                                    if (layoutDirection == EnumC39181m.f168423w) {
                                        if (abstractC39104j12 != null) {
                                            i83 = abstractC39104j12.f168211w;
                                        } else {
                                            i83 = 0;
                                        }
                                    } else if (abstractC39104j13 != null) {
                                        i83 = abstractC39104j13.f168211w;
                                    } else {
                                        i83 = 0;
                                    }
                                    float f16 = AbstractC24913l0.f97578a;
                                    abstractC39101i1.m124632f(abstractC39104j18, AbstractC12889b.m36250P(f15, c23125k4.f91360b.mo7155a(abstractC39104j18.f168211w, (i84 - (abstractC39104j12 != null ? abstractC39104j12.f168211w : 0)) - (abstractC39104j13 != null ? abstractC39104j13.f168211w : 0), layoutDirection) + i83, ((C2305k) AbstractC24913l0.m73015c(c23125k4)).mo7155a(abstractC39104j18.f168211w, (i84 - (abstractC39104j12 != null ? abstractC39104j12.f168211w : 0)) - (abstractC39104j13 != null ? abstractC39104j13.f168211w : 0), layoutDirection) + i83), iM36250P, 0.0f);
                                    if (abstractC39104j14 != null) {
                                        AbstractC39101i1.m124624n(abstractC39104j14, abstractC39104j12 != null ? abstractC39104j12.f168211w : 0, i87, abstractC39101i1);
                                    }
                                    int i89 = (abstractC39104j12 != null ? abstractC39104j12.f168211w : 0) + (abstractC39104j14 != null ? abstractC39104j14.f168211w : 0);
                                    AbstractC39101i1.m124624n(abstractC39104j10, i89, i87, abstractC39101i1);
                                    if (abstractC39104j11 != null) {
                                        AbstractC39101i1.m124624n(abstractC39104j11, i89, i87, abstractC39101i1);
                                    }
                                    if (abstractC39104j15 != 0) {
                                        AbstractC39101i1.m124624n(abstractC39104j15, (i84 - (abstractC39104j13 != null ? abstractC39104j13.f168211w : 0)) - abstractC39104j15.f168211w, i87, abstractC39101i1);
                                    }
                                    if (abstractC39104j13 != null) {
                                        AbstractC39101i1.m124624n(abstractC39104j13, i84 - abstractC39104j13.f168211w, AbstractC11895b.m31982a(1, 0.0f, (i88 - abstractC39104j13.f168212x) / 2.0f), abstractC39101i1);
                                    }
                                    if (abstractC39104j17 != 0) {
                                        AbstractC39101i1.m124624n(abstractC39104j17, 0, i88, abstractC39101i1);
                                    }
                                } else {
                                    float density = interfaceC39133t1.getDensity();
                                    AbstractC39101i1.m124623k(abstractC39101i1, abstractC39104j16, 0L);
                                    int i94 = i85 - (abstractC39104j17 != null ? abstractC39104j17.f168212x : 0);
                                    int iM36258X = AbstractC12889b.m36258X(c23137m4.f91492d.mo43112d() * density);
                                    if (abstractC39104j12 != null) {
                                        AbstractC39101i1.m124624n(abstractC39104j12, 0, AbstractC11895b.m31982a(1, 0.0f, (i94 - abstractC39104j12.f168212x) / 2.0f), abstractC39101i1);
                                    }
                                    if (abstractC39104j14 != null) {
                                        AbstractC39101i1.m124624n(abstractC39104j14, abstractC39104j12 != null ? abstractC39104j12.f168211w : 0, C23137m4.m67112i(c23137m4, i94, iM36258X, abstractC39104j14), abstractC39101i1);
                                    }
                                    int i95 = (abstractC39104j12 != null ? abstractC39104j12.f168211w : 0) + (abstractC39104j14 != null ? abstractC39104j14.f168211w : 0);
                                    AbstractC39101i1.m124624n(abstractC39104j10, i95, C23137m4.m67112i(c23137m4, i94, iM36258X, abstractC39104j10), abstractC39101i1);
                                    if (abstractC39104j11 != null) {
                                        AbstractC39101i1.m124624n(abstractC39104j11, i95, C23137m4.m67112i(c23137m4, i94, iM36258X, abstractC39104j11), abstractC39101i1);
                                    }
                                    if (abstractC39104j15 != null) {
                                        AbstractC39101i1.m124624n(abstractC39104j15, (i84 - (abstractC39104j13 != null ? abstractC39104j13.f168211w : 0)) - abstractC39104j15.f168211w, C23137m4.m67112i(c23137m4, i94, iM36258X, abstractC39104j15), abstractC39101i1);
                                    }
                                    if (abstractC39104j13 != null) {
                                        AbstractC39101i1.m124624n(abstractC39104j13, i84 - abstractC39104j13.f168211w, AbstractC11895b.m31982a(1, 0.0f, (i94 - abstractC39104j13.f168212x) / 2.0f), abstractC39101i1);
                                    }
                                    if (abstractC39104j17 != null) {
                                        AbstractC39101i1.m124624n(abstractC39104j17, 0, i94, abstractC39101i1);
                                    }
                                }
                                return C23454a0.f92919a;
                            }
                        });
                    }
                    i79++;
                    i78 = i78;
                }
                AbstractC0355b.m989c("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            i45++;
            size7 = i46;
            i44 = i47;
            abstractC39104j1Mo448T4 = abstractC39104j1Mo448T4;
            jM124777i = jM124777i;
            interfaceC39124q6 = interfaceC39124q6;
        }
        AbstractC0355b.m989c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: b */
    public final int mo537b(InterfaceC39126r interfaceC39126r, List list, int i13) {
        return m67114g(interfaceC39126r, list, i13, new C22437l(13));
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: c */
    public final int mo538c(InterfaceC39126r interfaceC39126r, List list, int i13) {
        return m67111h(list, i13, new C22437l(12));
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: d */
    public final int mo539d(InterfaceC39126r interfaceC39126r, List list, int i13) {
        return m67114g(interfaceC39126r, list, i13, new C22437l(14));
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: e */
    public final int mo540e(InterfaceC39126r interfaceC39126r, List list, int i13) {
        return m67111h(list, i13, new C22437l(11));
    }

    /* JADX INFO: renamed from: f */
    public final int m67113f(InterfaceC39126r interfaceC39126r, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, long j7, float f13) {
        InterfaceC22973k1 interfaceC22973k1 = this.f91492d;
        int iMo724F = interfaceC39126r.mo724F(interfaceC22973k1.mo43109a() + interfaceC22973k1.mo43112d());
        int[] iArr = {i19, i17, i18, AbstractC12889b.m36250P(f13, i14, 0)};
        for (int i25 = 0; i25 < 4; i25++) {
            i13 = Math.max(i13, iArr[i25]);
        }
        return AbstractC39170b.m124774f(Math.max(i15, Math.max(i16, iMo724F + (i14 > 0 ? Math.max(interfaceC39126r.mo724F(this.f91493e * 2), AbstractC12889b.m36250P(AbstractC27376o.f109952a.mo7226i(f13), 0, i14)) : 0) + i13)) + i24, j7);
    }

    /* JADX INFO: renamed from: g */
    public final int m67114g(InterfaceC39126r interfaceC39126r, List list, int i13, InterfaceC4351m interfaceC4351m) {
        Object obj;
        int i14;
        int iM73003j;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i15;
        Object obj5;
        int i16;
        Object obj6;
        Object obj7;
        List list2 = list;
        int size = list2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i17);
            if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj), "Leading")) {
                break;
            }
            i17++;
        }
        InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) obj;
        if (interfaceC39124q0 != null) {
            i14 = i13;
            iM73003j = AbstractC24899e0.m73003j(i14, interfaceC39124q0.mo447Q(Integer.MAX_VALUE));
            iIntValue = ((Number) interfaceC4351m.invoke(interfaceC39124q0, Integer.valueOf(i14))).intValue();
        } else {
            i14 = i13;
            iM73003j = i14;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i18);
            if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj2), "Trailing")) {
                break;
            }
            i18++;
        }
        InterfaceC39124q0 interfaceC39124q1 = (InterfaceC39124q0) obj2;
        if (interfaceC39124q1 != null) {
            iM73003j = AbstractC24899e0.m73003j(iM73003j, interfaceC39124q1.mo447Q(Integer.MAX_VALUE));
            iIntValue2 = ((Number) interfaceC4351m.invoke(interfaceC39124q1, Integer.valueOf(i14))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i19);
            if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj3), "Label")) {
                break;
            }
            i19++;
        }
        Object obj8 = (InterfaceC39124q0) obj3;
        int iIntValue3 = obj8 != null ? ((Number) interfaceC4351m.invoke(obj8, Integer.valueOf(iM73003j))).intValue() : 0;
        int size4 = list2.size();
        int i24 = 0;
        while (true) {
            if (i24 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i24);
            if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj4), "Prefix")) {
                break;
            }
            i24++;
        }
        InterfaceC39124q0 interfaceC39124q2 = (InterfaceC39124q0) obj4;
        if (interfaceC39124q2 != null) {
            int iIntValue4 = ((Number) interfaceC4351m.invoke(interfaceC39124q2, Integer.valueOf(iM73003j))).intValue();
            iM73003j = AbstractC24899e0.m73003j(iM73003j, interfaceC39124q2.mo447Q(Integer.MAX_VALUE));
            i15 = iIntValue4;
        } else {
            i15 = 0;
        }
        int size5 = list2.size();
        int i25 = 0;
        while (true) {
            if (i25 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i25);
            if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj5), "Suffix")) {
                break;
            }
            i25++;
        }
        InterfaceC39124q0 interfaceC39124q3 = (InterfaceC39124q0) obj5;
        if (interfaceC39124q3 != null) {
            int iIntValue5 = ((Number) interfaceC4351m.invoke(interfaceC39124q3, Integer.valueOf(iM73003j))).intValue();
            iM73003j = AbstractC24899e0.m73003j(iM73003j, interfaceC39124q3.mo447Q(Integer.MAX_VALUE));
            i16 = iIntValue5;
        } else {
            i16 = 0;
        }
        int size6 = list2.size();
        for (int i26 = 0; i26 < size6; i26++) {
            Object obj9 = list.get(i26);
            if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj9), "TextField")) {
                int iIntValue6 = ((Number) interfaceC4351m.invoke(obj9, Integer.valueOf(iM73003j))).intValue();
                int size7 = list2.size();
                int i27 = 0;
                while (true) {
                    if (i27 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i27);
                    if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj6), "Hint")) {
                        break;
                    }
                    i27++;
                }
                Object obj10 = (InterfaceC39124q0) obj6;
                int iIntValue7 = obj10 != null ? ((Number) interfaceC4351m.invoke(obj10, Integer.valueOf(iM73003j))).intValue() : 0;
                int size8 = list2.size();
                int i28 = 0;
                while (true) {
                    if (i28 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i28);
                    if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i28++;
                }
                Object obj12 = (InterfaceC39124q0) obj7;
                return m67113f(interfaceC39126r, iIntValue6, iIntValue3, iIntValue, iIntValue2, i15, i16, iIntValue7, obj12 != null ? ((Number) interfaceC4351m.invoke(obj12, Integer.valueOf(i14))).intValue() : 0, AbstractC39170b.m124770b(0, 0, 15), this.f91491c.invoke());
            }
        }
        AbstractC0355b.m989c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
