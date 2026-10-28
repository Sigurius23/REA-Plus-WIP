package p163g1;

import androidx.compose.p018ui.layout.AbstractC1131a;
import c93.InterfaceC4351m;
import dw1.C12413a;
import e93.AbstractC12889b;
import java.util.List;
import m83.C25272z;
import p006a4.AbstractC0355b;
import p181h2.C16620e;
import p291l0.InterfaceC22973k1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39126r;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.C39169a;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g1.l4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15070l4 implements InterfaceC39127r0 {

    /* JADX INFO: renamed from: a */
    public final Function1 f56423a;

    /* JADX INFO: renamed from: b */
    public final boolean f56424b;

    /* JADX INFO: renamed from: c */
    public final float f56425c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC22973k1 f56426d;

    public C15070l4(Function1 function1, boolean z4, float f13, InterfaceC22973k1 interfaceC22973k1) {
        this.f56423a = function1;
        this.f56424b = z4;
        this.f56425c = f13;
        this.f56426d = interfaceC22973k1;
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo521a(InterfaceC39133t0 interfaceC39133t0, List list, long j7) {
        Object obj;
        Object obj2;
        Object obj3;
        long jFloatToRawIntBits;
        List list2;
        String str;
        Object obj4;
        C15070l4 c15070l4 = this;
        InterfaceC22973k1 interfaceC22973k1 = c15070l4.f56426d;
        int iMo724F = interfaceC39133t0.mo724F(interfaceC22973k1.mo43109a());
        long jM124758b = C39169a.m124758b(j7, 0, 0, 0, 0, 10);
        List list3 = list;
        int size = list3.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i13);
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj), "Leading")) {
                break;
            }
            i13++;
        }
        InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) obj;
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0 != null ? interfaceC39124q0.mo448T(jM124758b) : null;
        float f13 = AbstractC15114p8.f56624a;
        int i14 = abstractC39104j1Mo448T != null ? abstractC39104j1Mo448T.f168211w : 0;
        int size2 = list3.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i15);
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj2), "Trailing")) {
                break;
            }
            i15++;
        }
        InterfaceC39124q0 interfaceC39124q1 = (InterfaceC39124q0) obj2;
        char c3 = 2;
        AbstractC39104j1 abstractC39104j1Mo448T2 = interfaceC39124q1 != null ? interfaceC39124q1.mo448T(AbstractC39170b.m124778j(-i14, 0, jM124758b, 2)) : null;
        int i16 = i14 + (abstractC39104j1Mo448T2 != null ? abstractC39104j1Mo448T2.f168211w : 0);
        int iMo724F2 = interfaceC39133t0.mo724F(interfaceC22973k1.mo43111c(interfaceC39133t0.getLayoutDirection())) + interfaceC39133t0.mo724F(interfaceC22973k1.mo43110b(interfaceC39133t0.getLayoutDirection()));
        int i17 = -i16;
        int i18 = -iMo724F;
        long jM124777i = AbstractC39170b.m124777i(AbstractC12889b.m36250P(c15070l4.f56425c, i17 - iMo724F2, -iMo724F2), jM124758b, i18);
        int size3 = list3.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i19);
            char c7 = c3;
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj3), "Label")) {
                break;
            }
            i19++;
            c3 = c7;
        }
        InterfaceC39124q0 interfaceC39124q2 = (InterfaceC39124q0) obj3;
        AbstractC39104j1 abstractC39104j1Mo448T3 = interfaceC39124q2 != null ? interfaceC39124q2.mo448T(jM124777i) : null;
        if (abstractC39104j1Mo448T3 != null) {
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(abstractC39104j1Mo448T3.f168212x)) & 4294967295L) | (((long) Float.floatToRawIntBits(abstractC39104j1Mo448T3.f168211w)) << 32);
        } else {
            jFloatToRawIntBits = 0;
        }
        c15070l4.f56423a.invoke(new C16620e(jFloatToRawIntBits));
        long jM124758b2 = C39169a.m124758b(AbstractC39170b.m124777i(i17, j7, i18 - Math.max((abstractC39104j1Mo448T3 != null ? abstractC39104j1Mo448T3.f168212x : 0) / 2, interfaceC39133t0.mo724F(interfaceC22973k1.mo43112d()))), 0, 0, 0, 0, 11);
        int size4 = list3.size();
        int i24 = 0;
        while (true) {
            String str2 = "Collection contains no element matching the predicate.";
            if (i24 >= size4) {
                AbstractC0355b.m989c("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            InterfaceC39124q0 interfaceC39124q3 = (InterfaceC39124q0) list.get(i24);
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a(interfaceC39124q3), "TextField")) {
                AbstractC39104j1 abstractC39104j1Mo448T4 = interfaceC39124q3.mo448T(jM124758b2);
                long jM124758b3 = C39169a.m124758b(jM124758b2, 0, 0, 0, 0, 14);
                List list4 = list;
                int size5 = list4.size();
                int i25 = 0;
                while (true) {
                    if (i25 >= size5) {
                        list2 = list4;
                        str = str2;
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i25);
                    list2 = list4;
                    str = str2;
                    if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj4), "Hint")) {
                        break;
                    }
                    i25++;
                    list4 = list2;
                    str2 = str;
                }
                InterfaceC39124q0 interfaceC39124q4 = (InterfaceC39124q0) obj4;
                AbstractC39104j1 abstractC39104j1Mo448T5 = interfaceC39124q4 != null ? interfaceC39124q4.mo448T(jM124758b3) : null;
                AbstractC39104j1 abstractC39104j1 = abstractC39104j1Mo448T2;
                int iM43139e = AbstractC15050j4.m43139e(abstractC39104j1Mo448T != null ? abstractC39104j1Mo448T.f168211w : 0, abstractC39104j1Mo448T2 != null ? abstractC39104j1Mo448T2.f168211w : 0, abstractC39104j1Mo448T4.f168211w, abstractC39104j1Mo448T3 != null ? abstractC39104j1Mo448T3.f168211w : 0, abstractC39104j1Mo448T5 != null ? abstractC39104j1Mo448T5.f168211w : 0, c15070l4.f56425c, j7, interfaceC39133t0.getDensity(), c15070l4.f56426d);
                int iM43138d = AbstractC15050j4.m43138d(abstractC39104j1Mo448T != null ? abstractC39104j1Mo448T.f168212x : 0, abstractC39104j1 != null ? abstractC39104j1.f168212x : 0, abstractC39104j1Mo448T4.f168212x, abstractC39104j1Mo448T3 != null ? abstractC39104j1Mo448T3.f168212x : 0, abstractC39104j1Mo448T5 != null ? abstractC39104j1Mo448T5.f168212x : 0, c15070l4.f56425c, j7, interfaceC39133t0.getDensity(), c15070l4.f56426d);
                int size6 = list2.size();
                int i26 = 0;
                while (i26 < size6) {
                    InterfaceC39124q0 interfaceC39124q5 = (InterfaceC39124q0) list.get(i26);
                    if (AbstractC22676k.m65745e(AbstractC1131a.m3497a(interfaceC39124q5), "border")) {
                        return interfaceC39133t0.mo86822W(iM43139e, iM43138d, C25272z.f99163w, new C15060k4(iM43138d, iM43139e, abstractC39104j1Mo448T, abstractC39104j1, abstractC39104j1Mo448T4, abstractC39104j1Mo448T3, abstractC39104j1Mo448T5, interfaceC39124q5.mo448T(AbstractC39170b.m124769a(iM43139e != Integer.MAX_VALUE ? iM43139e : 0, iM43139e, iM43138d != Integer.MAX_VALUE ? iM43138d : 0, iM43138d)), c15070l4, interfaceC39133t0));
                    }
                    i26++;
                    abstractC39104j1Mo448T = abstractC39104j1Mo448T;
                    abstractC39104j1Mo448T3 = abstractC39104j1Mo448T3;
                    c15070l4 = this;
                    abstractC39104j1 = abstractC39104j1;
                }
                AbstractC0355b.m989c(str);
                throw new KotlinNothingValueException();
            }
            i24++;
            abstractC39104j1Mo448T = abstractC39104j1Mo448T;
            abstractC39104j1Mo448T3 = abstractC39104j1Mo448T3;
            c15070l4 = this;
            jM124758b2 = jM124758b2;
        }
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: b */
    public final int mo537b(InterfaceC39126r interfaceC39126r, List list, int i13) {
        return m43150f(interfaceC39126r, list, i13, new C12413a(23));
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: c */
    public final int mo538c(InterfaceC39126r interfaceC39126r, List list, int i13) {
        return m43151g(interfaceC39126r, list, i13, new C12413a(24));
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: d */
    public final int mo539d(InterfaceC39126r interfaceC39126r, List list, int i13) {
        return m43150f(interfaceC39126r, list, i13, new C12413a(26));
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: e */
    public final int mo540e(InterfaceC39126r interfaceC39126r, List list, int i13) {
        return m43151g(interfaceC39126r, list, i13, new C12413a(25));
    }

    /* JADX INFO: renamed from: f */
    public final int m43150f(InterfaceC39126r interfaceC39126r, List list, int i13, InterfaceC4351m interfaceC4351m) {
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
        int iIntValue3 = obj5 != null ? ((Number) interfaceC4351m.invoke(obj5, Integer.valueOf(AbstractC12889b.m36250P(this.f56425c, i14, i13)))).intValue() : 0;
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
                return AbstractC15050j4.m43138d(iIntValue, iIntValue2, iIntValue4, iIntValue3, obj8 != null ? ((Number) interfaceC4351m.invoke(obj8, Integer.valueOf(i14))).intValue() : 0, this.f56425c, AbstractC39170b.m124770b(0, 0, 15), interfaceC39126r.getDensity(), this.f56426d);
            }
        }
        AbstractC0355b.m989c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: g */
    public final int m43151g(InterfaceC39126r interfaceC39126r, List list, int i13, InterfaceC4351m interfaceC4351m) {
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
                return AbstractC15050j4.m43139e(iIntValue4, iIntValue3, iIntValue, iIntValue2, interfaceC39124q3 != null ? ((Number) interfaceC4351m.invoke(interfaceC39124q3, Integer.valueOf(i13))).intValue() : 0, this.f56425c, AbstractC39170b.m124770b(0, 0, 15), interfaceC39126r.getDensity(), this.f56426d);
            }
        }
        AbstractC0355b.m989c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
