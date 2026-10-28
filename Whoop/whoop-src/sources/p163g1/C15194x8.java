package p163g1;

import androidx.compose.p018ui.layout.AbstractC1131a;
import c93.InterfaceC4351m;
import dw1.C12413a;
import java.util.List;
import m83.C25272z;
import p006a4.AbstractC0355b;
import p291l0.InterfaceC22973k1;
import p635y2.AbstractC39083d;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39126r;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.C39169a;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g1.x8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15194x8 implements InterfaceC39127r0 {

    /* JADX INFO: renamed from: a */
    public final boolean f57027a;

    /* JADX INFO: renamed from: b */
    public final float f57028b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC22973k1 f57029c;

    public C15194x8(boolean z4, float f13, InterfaceC22973k1 interfaceC22973k1) {
        this.f57027a = z4;
        this.f57028b = f13;
        this.f57029c = interfaceC22973k1;
    }

    /* JADX INFO: renamed from: g */
    public static int m43212g(List list, int i13, InterfaceC4351m interfaceC4351m) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        List list2 = list;
        int size = list2.size();
        for (int i14 = 0; i14 < size; i14++) {
            Object obj5 = list.get(i14);
            if (AbstractC22676k.m65745e(AbstractC15114p8.m43177d((InterfaceC39124q0) obj5), "TextField")) {
                int iIntValue = ((Number) interfaceC4351m.invoke(obj5, Integer.valueOf(i13))).intValue();
                int size2 = list2.size();
                int i15 = 0;
                while (true) {
                    obj = null;
                    if (i15 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i15);
                    if (AbstractC22676k.m65745e(AbstractC15114p8.m43177d((InterfaceC39124q0) obj2), "Label")) {
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
                    if (AbstractC22676k.m65745e(AbstractC15114p8.m43177d((InterfaceC39124q0) obj3), "Trailing")) {
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
                    if (AbstractC22676k.m65745e(AbstractC15114p8.m43177d((InterfaceC39124q0) obj4), "Leading")) {
                        break;
                    }
                    i17++;
                }
                InterfaceC39124q0 interfaceC39124q2 = (InterfaceC39124q0) obj4;
                int iIntValue4 = interfaceC39124q2 != null ? ((Number) interfaceC4351m.invoke(interfaceC39124q2, Integer.valueOf(i13))).intValue() : 0;
                int size5 = list2.size();
                for (int i18 = 0; i18 < size5; i18++) {
                    Object obj6 = list.get(i18);
                    if (AbstractC22676k.m65745e(AbstractC15114p8.m43177d((InterfaceC39124q0) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                }
                InterfaceC39124q0 interfaceC39124q3 = (InterfaceC39124q0) obj;
                int iIntValue5 = interfaceC39124q3 != null ? ((Number) interfaceC4351m.invoke(interfaceC39124q3, Integer.valueOf(i13))).intValue() : 0;
                long jM124770b = AbstractC39170b.m124770b(0, 0, 15);
                float f13 = AbstractC15164u8.f56885a;
                return AbstractC39170b.m124775g(Math.max(iIntValue, Math.max(iIntValue2, iIntValue5)) + iIntValue4 + iIntValue3, jM124770b);
            }
        }
        AbstractC0355b.m989c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo521a(InterfaceC39133t0 interfaceC39133t0, List list, long j7) {
        Object obj;
        Object obj2;
        int i13;
        AbstractC39104j1 abstractC39104j1Mo448T;
        int i14;
        Object obj3;
        int iMo450c0;
        Object obj4;
        C15194x8 c15194x8 = this;
        List list2 = list;
        InterfaceC22973k1 interfaceC22973k1 = c15194x8.f57029c;
        int iMo724F = interfaceC39133t0.mo724F(interfaceC22973k1.mo43112d());
        int iMo724F2 = interfaceC39133t0.mo724F(interfaceC22973k1.mo43109a());
        int iMo724F3 = interfaceC39133t0.mo724F(AbstractC15164u8.f56887c);
        long jM124758b = C39169a.m124758b(j7, 0, 0, 0, 0, 10);
        List list3 = list2;
        int size = list3.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i15);
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj), "Leading")) {
                break;
            }
            i15++;
        }
        InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) obj;
        AbstractC39104j1 abstractC39104j1Mo448T2 = interfaceC39124q0 != null ? interfaceC39124q0.mo448T(jM124758b) : null;
        float f13 = AbstractC15114p8.f56624a;
        int i16 = abstractC39104j1Mo448T2 != null ? abstractC39104j1Mo448T2.f168211w : 0;
        int size2 = list3.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i17);
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj2), "Trailing")) {
                break;
            }
            i17++;
        }
        InterfaceC39124q0 interfaceC39124q1 = (InterfaceC39124q0) obj2;
        if (interfaceC39124q1 != null) {
            i13 = 0;
            abstractC39104j1Mo448T = interfaceC39124q1.mo448T(AbstractC39170b.m124778j(-i16, 0, jM124758b, 2));
        } else {
            i13 = 0;
            abstractC39104j1Mo448T = null;
        }
        int i18 = -iMo724F2;
        int i19 = -(i16 + (abstractC39104j1Mo448T != null ? abstractC39104j1Mo448T.f168211w : i13));
        long jM124777i = AbstractC39170b.m124777i(i19, jM124758b, i18);
        int size3 = list3.size();
        int i24 = i13;
        while (true) {
            if (i24 >= size3) {
                i14 = iMo724F2;
                obj3 = null;
                break;
            }
            obj3 = list2.get(i24);
            i14 = iMo724F2;
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj3), "Label")) {
                break;
            }
            i24++;
            iMo724F2 = i14;
        }
        InterfaceC39124q0 interfaceC39124q2 = (InterfaceC39124q0) obj3;
        AbstractC39104j1 abstractC39104j1Mo448T3 = interfaceC39124q2 != null ? interfaceC39124q2.mo448T(jM124777i) : null;
        if (abstractC39104j1Mo448T3 != null) {
            iMo450c0 = abstractC39104j1Mo448T3.mo450c0(AbstractC39083d.f168141b);
            if (iMo450c0 == Integer.MIN_VALUE) {
                iMo450c0 = abstractC39104j1Mo448T3.f168212x;
            }
        } else {
            iMo450c0 = 0;
        }
        int iMax = Math.max(iMo450c0, iMo724F);
        long jM124777i2 = AbstractC39170b.m124777i(i19, C39169a.m124758b(j7, 0, 0, 0, 0, 11), abstractC39104j1Mo448T3 != null ? (i18 - iMo724F3) - iMax : (-iMo724F) - i14);
        int size4 = list3.size();
        int i25 = 0;
        while (i25 < size4) {
            InterfaceC39124q0 interfaceC39124q3 = (InterfaceC39124q0) list2.get(i25);
            int i26 = iMo724F;
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a(interfaceC39124q3), "TextField")) {
                AbstractC39104j1 abstractC39104j1Mo448T4 = interfaceC39124q3.mo448T(jM124777i2);
                long jM124758b2 = C39169a.m124758b(jM124777i2, 0, 0, 0, 0, 14);
                int size5 = list2.size();
                int i27 = 0;
                while (true) {
                    if (i27 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list2.get(i27);
                    if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj4), "Hint")) {
                        break;
                    }
                    i27++;
                    list2 = list;
                }
                InterfaceC39124q0 interfaceC39124q4 = (InterfaceC39124q0) obj4;
                AbstractC39104j1 abstractC39104j1Mo448T5 = interfaceC39124q4 != null ? interfaceC39124q4.mo448T(jM124758b2) : null;
                int iM124775g = AbstractC39170b.m124775g(Math.max(abstractC39104j1Mo448T4.f168211w, Math.max(abstractC39104j1Mo448T3 != null ? abstractC39104j1Mo448T3.f168211w : 0, abstractC39104j1Mo448T5 != null ? abstractC39104j1Mo448T5.f168211w : 0)) + (abstractC39104j1Mo448T2 != null ? abstractC39104j1Mo448T2.f168211w : 0) + (abstractC39104j1Mo448T != null ? abstractC39104j1Mo448T.f168211w : 0), j7);
                int iM43195d = AbstractC15164u8.m43195d(abstractC39104j1Mo448T4.f168212x, abstractC39104j1Mo448T3 != null, iMax, abstractC39104j1Mo448T2 != null ? abstractC39104j1Mo448T2.f168212x : 0, abstractC39104j1Mo448T != null ? abstractC39104j1Mo448T.f168212x : 0, abstractC39104j1Mo448T5 != null ? abstractC39104j1Mo448T5.f168212x : 0, j7, interfaceC39133t0.getDensity(), c15194x8.f57029c);
                return interfaceC39133t0.mo86822W(iM124775g, iM43195d, C25272z.f99163w, new C15174v8(abstractC39104j1Mo448T3, i26, iMo450c0, iM124775g, iM43195d, abstractC39104j1Mo448T4, abstractC39104j1Mo448T5, abstractC39104j1Mo448T2, abstractC39104j1Mo448T, c15194x8, iMax, iMo724F3, interfaceC39133t0, 0));
            }
            iMo724F = i26;
            i25++;
            c15194x8 = this;
            list2 = list;
        }
        AbstractC0355b.m989c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: b */
    public final int mo537b(InterfaceC39126r interfaceC39126r, List list, int i13) {
        return m43213f(interfaceC39126r, list, i13, new C12413a(29));
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: c */
    public final int mo538c(InterfaceC39126r interfaceC39126r, List list, int i13) {
        return m43212g(list, i13, new C12413a(28));
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: d */
    public final int mo539d(InterfaceC39126r interfaceC39126r, List list, int i13) {
        return m43213f(interfaceC39126r, list, i13, new C15184w8(0));
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: e */
    public final int mo540e(InterfaceC39126r interfaceC39126r, List list, int i13) {
        return m43212g(list, i13, new C15184w8(1));
    }

    /* JADX INFO: renamed from: f */
    public final int m43213f(InterfaceC39126r interfaceC39126r, List list, int i13, InterfaceC4351m interfaceC4351m) {
        Object obj;
        Object obj2;
        int i14;
        int iIntValue;
        Object obj3;
        int iIntValue2;
        Object obj4;
        List list2 = list;
        int size = list2.size();
        int i15 = 0;
        while (true) {
            obj = null;
            if (i15 >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i15);
            if (AbstractC22676k.m65745e(AbstractC15114p8.m43177d((InterfaceC39124q0) obj2), "Leading")) {
                break;
            }
            i15++;
        }
        InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) obj2;
        if (interfaceC39124q0 != null) {
            int iMo447Q = interfaceC39124q0.mo447Q(Integer.MAX_VALUE);
            if (i13 == Integer.MAX_VALUE) {
                i14 = i13;
            } else {
                i14 = i13 - iMo447Q;
                if (i14 < 0) {
                    i14 = 0;
                }
            }
            iIntValue = ((Number) interfaceC4351m.invoke(interfaceC39124q0, Integer.valueOf(i13))).intValue();
        } else {
            i14 = i13;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i16);
            if (AbstractC22676k.m65745e(AbstractC15114p8.m43177d((InterfaceC39124q0) obj3), "Trailing")) {
                break;
            }
            i16++;
        }
        InterfaceC39124q0 interfaceC39124q1 = (InterfaceC39124q0) obj3;
        if (interfaceC39124q1 != null) {
            int iMo447Q2 = interfaceC39124q1.mo447Q(Integer.MAX_VALUE);
            if (i14 != Integer.MAX_VALUE && (i14 = i14 - iMo447Q2) < 0) {
                i14 = 0;
            }
            iIntValue2 = ((Number) interfaceC4351m.invoke(interfaceC39124q1, Integer.valueOf(i13))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size3) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i17);
            if (AbstractC22676k.m65745e(AbstractC15114p8.m43177d((InterfaceC39124q0) obj4), "Label")) {
                break;
            }
            i17++;
        }
        Object obj5 = (InterfaceC39124q0) obj4;
        int iIntValue3 = obj5 != null ? ((Number) interfaceC4351m.invoke(obj5, Integer.valueOf(i14))).intValue() : 0;
        int size4 = list2.size();
        for (int i18 = 0; i18 < size4; i18++) {
            Object obj6 = list.get(i18);
            if (AbstractC22676k.m65745e(AbstractC15114p8.m43177d((InterfaceC39124q0) obj6), "TextField")) {
                int iIntValue4 = ((Number) interfaceC4351m.invoke(obj6, Integer.valueOf(i14))).intValue();
                int size5 = list2.size();
                for (int i19 = 0; i19 < size5; i19++) {
                    Object obj7 = list.get(i19);
                    if (AbstractC22676k.m65745e(AbstractC15114p8.m43177d((InterfaceC39124q0) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                }
                Object obj8 = (InterfaceC39124q0) obj;
                return AbstractC15164u8.m43195d(iIntValue4, iIntValue3 > 0, iIntValue3, iIntValue, iIntValue2, obj8 != null ? ((Number) interfaceC4351m.invoke(obj8, Integer.valueOf(i14))).intValue() : 0, AbstractC39170b.m124770b(0, 0, 15), interfaceC39126r.getDensity(), this.f57029c);
            }
        }
        AbstractC0355b.m989c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
