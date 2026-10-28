package p292l1;

import androidx.compose.foundation.layout.AbstractC1099a;
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
import p181h2.C16620e;
import p291l0.InterfaceC22973k1;
import p316m1.AbstractC24899e0;
import p316m1.AbstractC24913l0;
import p316m1.C24911k0;
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

/* JADX INFO: renamed from: l1.e3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23088e3 implements InterfaceC39127r0 {

    /* JADX INFO: renamed from: a */
    public final Function1 f91113a;

    /* JADX INFO: renamed from: b */
    public final boolean f91114b;

    /* JADX INFO: renamed from: c */
    public final C23125k4 f91115c;

    /* JADX INFO: renamed from: d */
    public final C24911k0 f91116d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC22973k1 f91117e;

    /* JADX INFO: renamed from: f */
    public final float f91118f;

    public C23088e3(Function1 function1, boolean z4, C23125k4 c23125k4, C24911k0 c24911k0, InterfaceC22973k1 interfaceC22973k1, float f13) {
        this.f91113a = function1;
        this.f91114b = z4;
        this.f91115c = c23125k4;
        this.f91116d = c24911k0;
        this.f91117e = interfaceC22973k1;
        this.f91118f = f13;
    }

    /* JADX INFO: renamed from: j */
    public static final int m67057j(int i13, C23088e3 c23088e3, int i14, int i15, AbstractC39104j1 abstractC39104j1, AbstractC39104j1 abstractC39104j2) {
        if (c23088e3.f91114b) {
            i15 = AbstractC11895b.m31982a(1, 0.0f, (i14 - abstractC39104j2.f168212x) / 2.0f);
        }
        return Math.max(i13 + i15, (abstractC39104j1 != null ? abstractC39104j1.f168212x : 0) / 2);
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo521a(final InterfaceC39133t0 interfaceC39133t0, List list, long j7) {
        Object obj;
        List list2;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        long jFloatToRawIntBits;
        Object obj6;
        int i13;
        Object obj7;
        AbstractC39104j1 abstractC39104j1;
        int i14;
        AbstractC39104j1 abstractC39104j2;
        int i15;
        int i16;
        int i17;
        List list3 = list;
        final float fInvoke = this.f91116d.invoke();
        InterfaceC22973k1 interfaceC22973k1 = this.f91117e;
        int iMo724F = interfaceC39133t0.mo724F(interfaceC22973k1.mo43109a());
        long jM124758b = C39169a.m124758b(j7, 0, 0, 0, 0, 10);
        List list4 = list3;
        int size = list4.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size) {
                obj = null;
                break;
            }
            obj = list3.get(i18);
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj), "Leading")) {
                break;
            }
            i18++;
        }
        InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) obj;
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0 != null ? interfaceC39124q0.mo448T(jM124758b) : null;
        int i19 = abstractC39104j1Mo448T != null ? abstractC39104j1Mo448T.f168211w : 0;
        int iMax = Math.max(0, abstractC39104j1Mo448T != null ? abstractC39104j1Mo448T.f168212x : 0);
        int size2 = list4.size();
        int i24 = 0;
        while (true) {
            if (i24 >= size2) {
                list2 = list4;
                obj2 = null;
                break;
            }
            obj2 = list3.get(i24);
            list2 = list4;
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj2), "Trailing")) {
                break;
            }
            i24++;
            list4 = list2;
        }
        InterfaceC39124q0 interfaceC39124q1 = (InterfaceC39124q0) obj2;
        AbstractC39104j1 abstractC39104j1Mo448T2 = interfaceC39124q1 != null ? interfaceC39124q1.mo448T(AbstractC39170b.m124778j(-i19, 0, jM124758b, 2)) : null;
        int i25 = i19 + (abstractC39104j1Mo448T2 != null ? abstractC39104j1Mo448T2.f168211w : 0);
        int iMax2 = Math.max(iMax, abstractC39104j1Mo448T2 != null ? abstractC39104j1Mo448T2.f168212x : 0);
        int size3 = list2.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list3.get(i26);
            int i27 = size3;
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj3), "Prefix")) {
                break;
            }
            i26++;
            size3 = i27;
        }
        InterfaceC39124q0 interfaceC39124q2 = (InterfaceC39124q0) obj3;
        AbstractC39104j1 abstractC39104j1Mo448T3 = interfaceC39124q2 != null ? interfaceC39124q2.mo448T(AbstractC39170b.m124778j(-i25, 0, jM124758b, 2)) : null;
        int i28 = i25 + (abstractC39104j1Mo448T3 != null ? abstractC39104j1Mo448T3.f168211w : 0);
        int iMax3 = Math.max(iMax2, abstractC39104j1Mo448T3 != null ? abstractC39104j1Mo448T3.f168212x : 0);
        int size4 = list2.size();
        int i29 = 0;
        while (true) {
            if (i29 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list3.get(i29);
            int i34 = size4;
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj4), "Suffix")) {
                break;
            }
            i29++;
            size4 = i34;
        }
        InterfaceC39124q0 interfaceC39124q3 = (InterfaceC39124q0) obj4;
        AbstractC39104j1 abstractC39104j1Mo448T4 = interfaceC39124q3 != null ? interfaceC39124q3.mo448T(AbstractC39170b.m124778j(-i28, 0, jM124758b, 2)) : null;
        int i35 = i28 + (abstractC39104j1Mo448T4 != null ? abstractC39104j1Mo448T4.f168211w : 0);
        int iMax4 = Math.max(iMax3, abstractC39104j1Mo448T4 != null ? abstractC39104j1Mo448T4.f168212x : 0);
        int size5 = list2.size();
        int i36 = 0;
        while (true) {
            if (i36 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list3.get(i36);
            int i37 = size5;
            int i38 = i36;
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj5), "Label")) {
                break;
            }
            i36 = i38 + 1;
            size5 = i37;
        }
        InterfaceC39124q0 interfaceC39124q4 = (InterfaceC39124q0) obj5;
        final C22669g0 c22669g0 = new C22669g0();
        int iMo724F2 = interfaceC39133t0.mo724F(interfaceC22973k1.mo43111c(interfaceC39133t0.getLayoutDirection())) + interfaceC39133t0.mo724F(interfaceC22973k1.mo43110b(interfaceC39133t0.getLayoutDirection()));
        int i39 = -AbstractC12889b.m36250P(fInvoke, i35 + iMo724F2, iMo724F2);
        int i44 = -iMo724F;
        AbstractC39104j1 abstractC39104j1Mo448T5 = interfaceC39124q4 != null ? interfaceC39124q4.mo448T(AbstractC39170b.m124777i(i39, jM124758b, i44)) : null;
        c22669g0.f89336w = abstractC39104j1Mo448T5;
        if (abstractC39104j1Mo448T5 != null) {
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(abstractC39104j1Mo448T5.f168211w)) << 32) | (((long) Float.floatToRawIntBits(abstractC39104j1Mo448T5.f168212x)) & 4294967295L);
        } else {
            jFloatToRawIntBits = 0;
        }
        this.f91113a.invoke(new C16620e(jFloatToRawIntBits));
        int size6 = list2.size();
        int i45 = 0;
        while (true) {
            if (i45 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list3.get(i45);
            int i46 = size6;
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj6), "Supporting")) {
                break;
            }
            i45++;
            size6 = i46;
        }
        InterfaceC39124q0 interfaceC39124q5 = (InterfaceC39124q0) obj6;
        int iMo438C = interfaceC39124q5 != null ? interfaceC39124q5.mo438C(C39169a.m124767k(j7)) : 0;
        AbstractC39104j1 abstractC39104j3 = (AbstractC39104j1) c22669g0.f89336w;
        int iMax5 = Math.max((abstractC39104j3 != null ? abstractC39104j3.f168212x : 0) / 2, interfaceC39133t0.mo724F(interfaceC22973k1.mo43112d()));
        int i47 = (i44 - iMax5) - iMo438C;
        InterfaceC39124q0 interfaceC39124q6 = interfaceC39124q5;
        long jM124758b2 = C39169a.m124758b(AbstractC39170b.m124777i(-i35, j7, i47), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i48 = 0;
        while (i48 < size7) {
            InterfaceC39124q0 interfaceC39124q7 = (InterfaceC39124q0) list3.get(i48);
            int i49 = i48;
            InterfaceC39124q0 interfaceC39124q8 = interfaceC39124q6;
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a(interfaceC39124q7), "TextField")) {
                final AbstractC39104j1 abstractC39104j1Mo448T6 = interfaceC39124q7.mo448T(jM124758b2);
                long jM124758b3 = C39169a.m124758b(jM124758b2, 0, 0, 0, 0, 14);
                List list5 = list3;
                int size8 = list5.size();
                int i54 = 0;
                while (true) {
                    if (i54 >= size8) {
                        i13 = iMax5;
                        obj7 = null;
                        break;
                    }
                    obj7 = list3.get(i54);
                    i13 = iMax5;
                    int i55 = size8;
                    if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj7), "Hint")) {
                        break;
                    }
                    i54++;
                    size8 = i55;
                    iMax5 = i13;
                }
                InterfaceC39124q0 interfaceC39124q9 = (InterfaceC39124q0) obj7;
                AbstractC39104j1 abstractC39104j1Mo448T7 = interfaceC39124q9 != null ? interfaceC39124q9.mo448T(jM124758b3) : null;
                int iMax6 = Math.max(iMax4, Math.max(abstractC39104j1Mo448T6.f168212x, abstractC39104j1Mo448T7 != null ? abstractC39104j1Mo448T7.f168212x : 0) + i13 + iMo724F);
                int i56 = abstractC39104j1Mo448T != 0 ? abstractC39104j1Mo448T.f168211w : 0;
                final AbstractC39104j1 abstractC39104j4 = abstractC39104j1Mo448T2;
                int i57 = abstractC39104j1Mo448T2 != null ? abstractC39104j4.f168211w : 0;
                int i58 = abstractC39104j1Mo448T3 != null ? abstractC39104j1Mo448T3.f168211w : 0;
                int i59 = abstractC39104j1Mo448T4 != null ? abstractC39104j1Mo448T4.f168211w : 0;
                final AbstractC39104j1 abstractC39104j5 = abstractC39104j1Mo448T4;
                int i64 = abstractC39104j1Mo448T6.f168211w;
                AbstractC39104j1 abstractC39104j6 = (AbstractC39104j1) c22669g0.f89336w;
                if (abstractC39104j6 != null) {
                    i14 = abstractC39104j6.f168211w;
                    abstractC39104j1 = abstractC39104j1Mo448T3;
                } else {
                    abstractC39104j1 = abstractC39104j1Mo448T3;
                    i14 = 0;
                }
                if (abstractC39104j1Mo448T7 != null) {
                    abstractC39104j2 = abstractC39104j1;
                    i15 = abstractC39104j1Mo448T7.f168211w;
                } else {
                    abstractC39104j2 = abstractC39104j1;
                    i15 = 0;
                }
                final int iM67059g = m67059g(interfaceC39133t0, i56, i57, i58, i59, i64, i14, i15, j7, fInvoke);
                final AbstractC39104j1 abstractC39104j1Mo448T8 = interfaceC39124q8 != 0 ? interfaceC39124q8.mo448T(C39169a.m124758b(AbstractC39170b.m124778j(0, -iMax6, jM124758b, 1), 0, iM67059g, 0, 0, 9)) : null;
                int i65 = abstractC39104j1Mo448T8 != null ? abstractC39104j1Mo448T8.f168212x : 0;
                final AbstractC39104j1 abstractC39104j7 = abstractC39104j1Mo448T;
                int i66 = abstractC39104j1Mo448T != null ? abstractC39104j7.f168212x : 0;
                int i67 = abstractC39104j4 != 0 ? abstractC39104j4.f168212x : 0;
                final AbstractC39104j1 abstractC39104j8 = abstractC39104j2;
                int i68 = abstractC39104j8 != null ? abstractC39104j8.f168212x : 0;
                int i69 = abstractC39104j5 != null ? abstractC39104j5.f168212x : 0;
                int i74 = abstractC39104j1Mo448T6.f168212x;
                AbstractC39104j1 abstractC39104j9 = (AbstractC39104j1) c22669g0.f89336w;
                int i75 = abstractC39104j9 != null ? abstractC39104j9.f168212x : 0;
                int i76 = i65;
                final AbstractC39104j1 abstractC39104j10 = abstractC39104j1Mo448T7;
                int i77 = abstractC39104j10 != null ? abstractC39104j10.f168212x : 0;
                if (abstractC39104j1Mo448T8 != null) {
                    i16 = abstractC39104j1Mo448T8.f168212x;
                    i17 = 0;
                } else {
                    i16 = 0;
                    i17 = 0;
                }
                final int iM67058f = m67058f(interfaceC39133t0, i66, i67, i68, i69, i74, i75, i77, i16, j7, fInvoke);
                int i78 = iM67058f - i76;
                int size9 = list5.size();
                int i79 = i17;
                while (i79 < size9) {
                    InterfaceC39124q0 interfaceC39124q10 = (InterfaceC39124q0) list.get(i79);
                    if (AbstractC22676k.m65745e(AbstractC1131a.m3497a(interfaceC39124q10), "Container")) {
                        final AbstractC39104j1 abstractC39104j1Mo448T9 = interfaceC39124q10.mo448T(AbstractC39170b.m124769a(iM67059g != Integer.MAX_VALUE ? iM67059g : i17, iM67059g, i78 != Integer.MAX_VALUE ? i78 : i17, i78));
                        return interfaceC39133t0.mo86822W(iM67059g, iM67058f, C25272z.f99163w, new Function1() { // from class: l1.d3
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                float f13;
                                int i83;
                                int i84;
                                C23088e3 c23088e3;
                                int i85;
                                int iM31982a;
                                float f14;
                                float f15;
                                float f16;
                                AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj8;
                                AbstractC39104j1 abstractC39104j11 = (AbstractC39104j1) c22669g0.f89336w;
                                InterfaceC39133t0 interfaceC39133t1 = interfaceC39133t0;
                                float density = interfaceC39133t1.getDensity();
                                EnumC39181m layoutDirection = interfaceC39133t1.getLayoutDirection();
                                C23088e3 c23088e4 = this.f91078w;
                                float fMo743q0 = interfaceC39133t1.mo743q0(c23088e4.f91118f);
                                C23125k4 c23125k4 = c23088e4.f91115c;
                                InterfaceC22973k1 interfaceC22973k2 = c23088e4.f91117e;
                                abstractC39101i1.m124632f(abstractC39104j1Mo448T9, 0, 0, 0.0f);
                                AbstractC39104j1 abstractC39104j12 = abstractC39104j1Mo448T8;
                                int i86 = iM67058f - (abstractC39104j12 != null ? abstractC39104j12.f168212x : 0);
                                int iM36258X = AbstractC12889b.m36258X(interfaceC22973k2.mo43112d() * density);
                                AbstractC39104j1 abstractC39104j13 = abstractC39104j7;
                                if (abstractC39104j13 != null) {
                                    AbstractC39101i1.m124624n(abstractC39104j13, 0, AbstractC11895b.m31982a(1, 0.0f, (i86 - abstractC39104j13.f168212x) / 2.0f), abstractC39101i1);
                                }
                                int i87 = iM67059g;
                                AbstractC39104j1 abstractC39104j14 = abstractC39104j4;
                                if (abstractC39104j11 != null) {
                                    if (c23088e4.f91114b) {
                                        iM31982a = AbstractC11895b.m31982a(1, 0.0f, (i86 - abstractC39104j11.f168212x) / 2.0f);
                                    } else {
                                        iM31982a = iM36258X;
                                    }
                                    int i88 = -(abstractC39104j11.f168212x / 2);
                                    float f17 = fInvoke;
                                    int iM36250P = AbstractC12889b.m36250P(f17, iM31982a, i88);
                                    float fM3387i = AbstractC1099a.m3387i(interfaceC22973k2, layoutDirection) * density;
                                    float fM3386h = AbstractC1099a.m3386h(interfaceC22973k2, layoutDirection) * density;
                                    if (abstractC39104j13 == null) {
                                        f15 = fM3387i;
                                        f14 = 0.0f;
                                    } else {
                                        float f18 = abstractC39104j13.f168211w;
                                        float f19 = fM3387i - fMo743q0;
                                        f14 = 0.0f;
                                        if (f19 < 0.0f) {
                                            f19 = 0.0f;
                                        }
                                        f15 = f18 + f19;
                                    }
                                    if (abstractC39104j14 == null) {
                                        f16 = fM3386h;
                                    } else {
                                        float f24 = abstractC39104j14.f168211w;
                                        float f25 = fM3386h - fMo743q0;
                                        if (f25 < f14) {
                                            f25 = 0.0f;
                                        }
                                        f16 = f24 + f25;
                                    }
                                    EnumC39181m enumC39181m = EnumC39181m.f168423w;
                                    float f26 = layoutDirection == enumC39181m ? fM3387i : fM3386h;
                                    float f27 = layoutDirection == enumC39181m ? f15 : f16;
                                    float f28 = AbstractC24913l0.f97578a;
                                    int iM36258X2 = AbstractC12889b.m36258X(AbstractC12889b.m36249O(c23125k4.f91360b.mo7155a(abstractC39104j11.f168211w, i87 - AbstractC12889b.m36258X(f15 + f16), layoutDirection) + f27, ((C2305k) AbstractC24913l0.m73015c(c23125k4)).mo7155a(abstractC39104j11.f168211w, i87 - AbstractC12889b.m36258X(fM3387i + fM3386h), layoutDirection) + f26, f17));
                                    f13 = 0.0f;
                                    abstractC39101i1.m124632f(abstractC39104j11, iM36258X2, iM36250P, 0.0f);
                                } else {
                                    i87 = i87;
                                    f13 = 0.0f;
                                }
                                AbstractC39104j1 abstractC39104j15 = abstractC39104j8;
                                if (abstractC39104j15 != null) {
                                    i83 = iM36258X;
                                    i84 = i86;
                                    c23088e3 = c23088e4;
                                    i85 = 0;
                                    AbstractC39101i1.m124624n(abstractC39104j15, abstractC39104j13 != null ? abstractC39104j13.f168211w : 0, C23088e3.m67057j(0, c23088e3, i84, i83, abstractC39104j11, abstractC39104j15), abstractC39101i1);
                                } else {
                                    i83 = iM36258X;
                                    i84 = i86;
                                    c23088e3 = c23088e4;
                                    i85 = 0;
                                }
                                int i89 = (abstractC39104j13 != null ? abstractC39104j13.f168211w : 0) + (abstractC39104j15 != null ? abstractC39104j15.f168211w : 0);
                                AbstractC39104j1 abstractC39104j16 = abstractC39104j1Mo448T6;
                                AbstractC39101i1.m124624n(abstractC39104j16, i89, C23088e3.m67057j(i85, c23088e3, i84, i83, abstractC39104j11, abstractC39104j16), abstractC39101i1);
                                AbstractC39104j1 abstractC39104j17 = abstractC39104j10;
                                if (abstractC39104j17 != null) {
                                    AbstractC39101i1.m124624n(abstractC39104j17, i89, C23088e3.m67057j(i85, c23088e3, i84, i83, abstractC39104j11, abstractC39104j17), abstractC39101i1);
                                }
                                AbstractC39104j1 abstractC39104j18 = abstractC39104j5;
                                if (abstractC39104j18 != null) {
                                    AbstractC39101i1.m124624n(abstractC39104j18, (i87 - (abstractC39104j14 != null ? abstractC39104j14.f168211w : 0)) - abstractC39104j18.f168211w, C23088e3.m67057j(i85, c23088e3, i84, i83, abstractC39104j11, abstractC39104j18), abstractC39101i1);
                                }
                                if (abstractC39104j14 != null) {
                                    AbstractC39101i1.m124624n(abstractC39104j14, i87 - abstractC39104j14.f168211w, AbstractC11895b.m31982a(1, f13, (i84 - abstractC39104j14.f168212x) / 2.0f), abstractC39101i1);
                                }
                                if (abstractC39104j12 != null) {
                                    AbstractC39101i1.m124624n(abstractC39104j12, 0, i84, abstractC39101i1);
                                }
                                return C23454a0.f92919a;
                            }
                        });
                    }
                    i79++;
                    iM67058f = iM67058f;
                }
                AbstractC0355b.m989c("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            i48 = i49 + 1;
            interfaceC39124q6 = interfaceC39124q8;
            list3 = list3;
            iMax5 = iMax5;
        }
        AbstractC0355b.m989c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: b */
    public final int mo537b(InterfaceC39126r interfaceC39126r, List list, int i13) {
        return m67060h(interfaceC39126r, list, i13, new C22437l(6));
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: c */
    public final int mo538c(InterfaceC39126r interfaceC39126r, List list, int i13) {
        return m67061i(interfaceC39126r, list, i13, new C22437l(7));
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: d */
    public final int mo539d(InterfaceC39126r interfaceC39126r, List list, int i13) {
        return m67060h(interfaceC39126r, list, i13, new C22437l(8));
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: e */
    public final int mo540e(InterfaceC39126r interfaceC39126r, List list, int i13) {
        return m67061i(interfaceC39126r, list, i13, new C22437l(9));
    }

    /* JADX INFO: renamed from: f */
    public final int m67058f(InterfaceC39126r interfaceC39126r, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, long j7, float f13) {
        int[] iArr = {i19, i15, i16, AbstractC12889b.m36250P(f13, i18, 0)};
        for (int i25 = 0; i25 < 4; i25++) {
            i17 = Math.max(i17, iArr[i25]);
        }
        InterfaceC22973k1 interfaceC22973k1 = this.f91117e;
        float fMo743q0 = interfaceC39126r.mo743q0(interfaceC22973k1.mo43112d());
        return AbstractC39170b.m124774f(Math.max(i13, Math.max(i14, AbstractC12889b.m36258X(AbstractC12889b.m36249O(fMo743q0, Math.max(fMo743q0, i18 / 2.0f), f13) + i17 + interfaceC39126r.mo743q0(interfaceC22973k1.mo43109a())))) + i24, j7);
    }

    /* JADX INFO: renamed from: g */
    public final int m67059g(InterfaceC39126r interfaceC39126r, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j7, float f13) {
        int i24 = i15 + i16;
        int iMax = Math.max(i17 + i24, Math.max(i19 + i24, AbstractC12889b.m36250P(f13, i18, 0))) + i13 + i14;
        EnumC39181m enumC39181m = EnumC39181m.f168423w;
        InterfaceC22973k1 interfaceC22973k1 = this.f91117e;
        return AbstractC39170b.m124775g(Math.max(iMax, AbstractC12889b.m36258X((i18 + interfaceC39126r.mo743q0(interfaceC22973k1.mo43111c(enumC39181m) + interfaceC22973k1.mo43110b(enumC39181m))) * f13)), j7);
    }

    /* JADX INFO: renamed from: h */
    public final int m67060h(InterfaceC39126r interfaceC39126r, List list, int i13, InterfaceC4351m interfaceC4351m) {
        Object obj;
        int iM73003j;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        int i14;
        Object obj6;
        Object obj7;
        C23088e3 c23088e3 = this;
        float fInvoke = c23088e3.f91116d.invoke();
        List list2 = list;
        int size = list2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i15);
            if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj), "Leading")) {
                break;
            }
            i15++;
        }
        InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) obj;
        if (interfaceC39124q0 != null) {
            iM73003j = AbstractC24899e0.m73003j(i13, interfaceC39124q0.mo447Q(Integer.MAX_VALUE));
            iIntValue = ((Number) interfaceC4351m.invoke(interfaceC39124q0, Integer.valueOf(i13))).intValue();
        } else {
            iM73003j = i13;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i16);
            if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj2), "Trailing")) {
                break;
            }
            i16++;
        }
        InterfaceC39124q0 interfaceC39124q1 = (InterfaceC39124q0) obj2;
        if (interfaceC39124q1 != null) {
            iM73003j = AbstractC24899e0.m73003j(iM73003j, interfaceC39124q1.mo447Q(Integer.MAX_VALUE));
            iIntValue2 = ((Number) interfaceC4351m.invoke(interfaceC39124q1, Integer.valueOf(i13))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i17);
            if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj3), "Label")) {
                break;
            }
            i17++;
        }
        Object obj8 = (InterfaceC39124q0) obj3;
        int iIntValue5 = obj8 != null ? ((Number) interfaceC4351m.invoke(obj8, Integer.valueOf(AbstractC12889b.m36250P(fInvoke, iM73003j, i13)))).intValue() : 0;
        int size4 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i18);
            if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj4), "Prefix")) {
                break;
            }
            i18++;
        }
        InterfaceC39124q0 interfaceC39124q2 = (InterfaceC39124q0) obj4;
        if (interfaceC39124q2 != null) {
            iIntValue3 = ((Number) interfaceC4351m.invoke(interfaceC39124q2, Integer.valueOf(iM73003j))).intValue();
            iM73003j = AbstractC24899e0.m73003j(iM73003j, interfaceC39124q2.mo447Q(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list2.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i19);
            if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj5), "Suffix")) {
                break;
            }
            i19++;
        }
        InterfaceC39124q0 interfaceC39124q3 = (InterfaceC39124q0) obj5;
        if (interfaceC39124q3 != null) {
            iIntValue4 = ((Number) interfaceC4351m.invoke(interfaceC39124q3, Integer.valueOf(iM73003j))).intValue();
            iM73003j = AbstractC24899e0.m73003j(iM73003j, interfaceC39124q3.mo447Q(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list2.size();
        int i24 = 0;
        while (i24 < size6) {
            Object obj9 = list.get(i24);
            if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj9), "TextField")) {
                int iIntValue6 = ((Number) interfaceC4351m.invoke(obj9, Integer.valueOf(iM73003j))).intValue();
                int size7 = list2.size();
                int i25 = 0;
                while (true) {
                    if (i25 >= size7) {
                        i14 = iIntValue6;
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i25);
                    i14 = iIntValue6;
                    if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj6), "Hint")) {
                        break;
                    }
                    i25++;
                    iIntValue6 = i14;
                }
                Object obj10 = (InterfaceC39124q0) obj6;
                int iIntValue7 = obj10 != null ? ((Number) interfaceC4351m.invoke(obj10, Integer.valueOf(iM73003j))).intValue() : 0;
                int size8 = list2.size();
                int i26 = 0;
                while (true) {
                    if (i26 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i26);
                    if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj7), "Supporting")) {
                        break;
                    }
                    i26++;
                }
                Object obj11 = (InterfaceC39124q0) obj7;
                return c23088e3.m67058f(interfaceC39126r, iIntValue, iIntValue2, iIntValue3, iIntValue4, i14, iIntValue5, iIntValue7, obj11 != null ? ((Number) interfaceC4351m.invoke(obj11, Integer.valueOf(i13))).intValue() : 0, AbstractC39170b.m124770b(0, 0, 15), fInvoke);
            }
            i24++;
            iIntValue3 = iIntValue3;
            c23088e3 = this;
        }
        AbstractC0355b.m989c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: i */
    public final int m67061i(InterfaceC39126r interfaceC39126r, List list, int i13, InterfaceC4351m interfaceC4351m) {
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
                    if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj4), "Leading")) {
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
                    if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj5), "Prefix")) {
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
                    if (AbstractC22676k.m65745e(AbstractC24899e0.m73001h((InterfaceC39124q0) obj6), "Suffix")) {
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
                return m67059g(interfaceC39126r, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, interfaceC39124q5 != null ? ((Number) interfaceC4351m.invoke(interfaceC39124q5, Integer.valueOf(i13))).intValue() : 0, AbstractC39170b.m124770b(0, 0, 15), this.f91116d.invoke());
            }
        }
        AbstractC0355b.m989c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
