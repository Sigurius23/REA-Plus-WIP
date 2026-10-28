package i40;

import androidx.compose.p018ui.layout.AbstractC1131a;
import c93.InterfaceC4351m;
import i22.C18014b;
import java.util.List;
import java.util.NoSuchElementException;
import m83.C25272z;
import p163g1.C15174v8;
import p291l0.C22976l1;
import p635y2.AbstractC39083d;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39126r;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.C39169a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i40.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C18077k implements InterfaceC39127r0 {

    /* JADX INFO: renamed from: a */
    public final boolean f70280a;

    /* JADX INFO: renamed from: b */
    public final float f70281b;

    /* JADX INFO: renamed from: c */
    public final C22976l1 f70282c;

    public C18077k(boolean z4, float f13, C22976l1 c22976l1) {
        this.f70280a = z4;
        this.f70281b = f13;
        this.f70282c = c22976l1;
    }

    /* JADX INFO: renamed from: g */
    public static int m51916g(List list, int i13, InterfaceC4351m interfaceC4351m) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            Object obj5 = list.get(i14);
            if (AbstractC22676k.m65745e(AbstractC18076j.m51915c((InterfaceC39124q0) obj5), "TextField")) {
                int iIntValue = ((Number) interfaceC4351m.invoke(obj5, Integer.valueOf(i13))).intValue();
                int size2 = list.size();
                int i15 = 0;
                while (true) {
                    obj = null;
                    if (i15 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i15);
                    if (AbstractC22676k.m65745e(AbstractC18076j.m51915c((InterfaceC39124q0) obj2), "Label")) {
                        break;
                    }
                    i15++;
                }
                InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) obj2;
                int iIntValue2 = interfaceC39124q0 != null ? ((Number) interfaceC4351m.invoke(interfaceC39124q0, Integer.valueOf(i13))).intValue() : 0;
                int size3 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i16);
                    if (AbstractC22676k.m65745e(AbstractC18076j.m51915c((InterfaceC39124q0) obj3), "Trailing")) {
                        break;
                    }
                    i16++;
                }
                InterfaceC39124q0 interfaceC39124q1 = (InterfaceC39124q0) obj3;
                int iIntValue3 = interfaceC39124q1 != null ? ((Number) interfaceC4351m.invoke(interfaceC39124q1, Integer.valueOf(i13))).intValue() : 0;
                int size4 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i17);
                    if (AbstractC22676k.m65745e(AbstractC18076j.m51915c((InterfaceC39124q0) obj4), "Leading")) {
                        break;
                    }
                    i17++;
                }
                InterfaceC39124q0 interfaceC39124q2 = (InterfaceC39124q0) obj4;
                int iIntValue4 = interfaceC39124q2 != null ? ((Number) interfaceC4351m.invoke(interfaceC39124q2, Integer.valueOf(i13))).intValue() : 0;
                int size5 = list.size();
                for (int i18 = 0; i18 < size5; i18++) {
                    Object obj6 = list.get(i18);
                    if (AbstractC22676k.m65745e(AbstractC18076j.m51915c((InterfaceC39124q0) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                }
                InterfaceC39124q0 interfaceC39124q3 = (InterfaceC39124q0) obj;
                return Math.max(Math.max(iIntValue, Math.max(iIntValue2, interfaceC39124q3 != null ? ((Number) interfaceC4351m.invoke(interfaceC39124q3, Integer.valueOf(i13))).intValue() : 0)) + iIntValue4 + iIntValue3, C39169a.m124767k(AbstractC18067a.f70153a));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo521a(InterfaceC39133t0 measure, List list, long j7) {
        Object obj;
        Object obj2;
        int i13;
        AbstractC39104j1 abstractC39104j1Mo448T;
        int i14;
        Object obj3;
        int iMo450c0;
        Object obj4;
        List measurables = list;
        AbstractC22676k.m65750j(measure, "$this$measure");
        AbstractC22676k.m65750j(measurables, "measurables");
        C18077k c18077k = this;
        C22976l1 c22976l1 = c18077k.f70282c;
        int iMo724F = measure.mo724F(c22976l1.f90647b);
        int iMo724F2 = measure.mo724F(c22976l1.f90649d);
        int iMo724F3 = measure.mo724F(AbstractC18076j.f70279a);
        long jM124758b = C39169a.m124758b(j7, 0, 0, 0, 0, 10);
        int size = measurables.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                obj = null;
                break;
            }
            obj = measurables.get(i15);
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj), "Leading")) {
                break;
            }
            i15++;
        }
        InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) obj;
        AbstractC39104j1 abstractC39104j1Mo448T2 = interfaceC39124q0 != null ? interfaceC39124q0.mo448T(jM124758b) : null;
        int i16 = abstractC39104j1Mo448T2 != null ? abstractC39104j1Mo448T2.f168211w : 0;
        int size2 = measurables.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = measurables.get(i17);
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
        int i19 = -((abstractC39104j1Mo448T != null ? abstractC39104j1Mo448T.f168211w : i13) + i16);
        long jM124777i = AbstractC39170b.m124777i(i19, jM124758b, i18);
        int size3 = measurables.size();
        int i24 = i13;
        while (true) {
            if (i24 >= size3) {
                i14 = iMo724F2;
                obj3 = null;
                break;
            }
            obj3 = measurables.get(i24);
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
        int i25 = iMo450c0;
        long jM124777i2 = AbstractC39170b.m124777i(i19, C39169a.m124758b(j7, 0, 0, 0, 0, 11), abstractC39104j1Mo448T3 != null ? (i18 - iMo724F3) - iMax : (-iMo724F) - i14);
        int size4 = measurables.size();
        int i26 = 0;
        while (i26 < size4) {
            InterfaceC39124q0 interfaceC39124q3 = (InterfaceC39124q0) measurables.get(i26);
            int i27 = size4;
            if (AbstractC22676k.m65745e(AbstractC1131a.m3497a(interfaceC39124q3), "TextField")) {
                AbstractC39104j1 abstractC39104j1Mo448T4 = interfaceC39124q3.mo448T(jM124777i2);
                long jM124758b2 = C39169a.m124758b(jM124777i2, 0, 0, 0, 0, 14);
                int size5 = measurables.size();
                int i28 = 0;
                while (true) {
                    if (i28 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = measurables.get(i28);
                    int i29 = size5;
                    if (AbstractC22676k.m65745e(AbstractC1131a.m3497a((InterfaceC39124q0) obj4), "Hint")) {
                        break;
                    }
                    i28++;
                    measurables = list;
                    size5 = i29;
                }
                InterfaceC39124q0 interfaceC39124q4 = (InterfaceC39124q0) obj4;
                AbstractC39104j1 abstractC39104j1Mo448T5 = interfaceC39124q4 != null ? interfaceC39124q4.mo448T(jM124758b2) : null;
                int iMax2 = Math.max(Math.max(abstractC39104j1Mo448T4.f168211w, Math.max(abstractC39104j1Mo448T3 != null ? abstractC39104j1Mo448T3.f168211w : 0, abstractC39104j1Mo448T5 != null ? abstractC39104j1Mo448T5.f168211w : 0)) + (abstractC39104j1Mo448T2 != null ? abstractC39104j1Mo448T2.f168211w : 0) + (abstractC39104j1Mo448T != null ? abstractC39104j1Mo448T.f168211w : 0), C39169a.m124767k(j7));
                int i34 = abstractC39104j1Mo448T4.f168212x;
                boolean z4 = abstractC39104j1Mo448T3 != null;
                int i35 = abstractC39104j1Mo448T2 != null ? abstractC39104j1Mo448T2.f168212x : 0;
                int i36 = abstractC39104j1Mo448T != null ? abstractC39104j1Mo448T.f168212x : 0;
                int i37 = i25;
                AbstractC39104j1 abstractC39104j1 = abstractC39104j1Mo448T;
                int iM51914b = AbstractC18076j.m51914b(i34, z4, iMax, i35, i36, abstractC39104j1Mo448T5 != null ? abstractC39104j1Mo448T5.f168212x : 0, j7, measure.getDensity(), c22976l1);
                return measure.mo86822W(iMax2, iM51914b, C25272z.f99163w, new C15174v8(abstractC39104j1Mo448T3, iMo724F, i37, iMax2, iM51914b, abstractC39104j1Mo448T4, abstractC39104j1Mo448T5, abstractC39104j1Mo448T2, abstractC39104j1, c18077k, iMax, iMo724F3, measure, 1));
            }
            C22976l1 c22976l2 = c22976l1;
            AbstractC39104j1 abstractC39104j2 = abstractC39104j1Mo448T;
            i26++;
            c18077k = this;
            size4 = i27;
            iMo724F = iMo724F;
            abstractC39104j1Mo448T2 = abstractC39104j1Mo448T2;
            i25 = i25;
            abstractC39104j1Mo448T = abstractC39104j2;
            c22976l1 = c22976l2;
            measurables = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: b */
    public final int mo537b(InterfaceC39126r interfaceC39126r, List list, int i13) {
        AbstractC22676k.m65750j(interfaceC39126r, "<this>");
        return m51917f(interfaceC39126r, list, i13, new C18014b(4));
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: c */
    public final int mo538c(InterfaceC39126r interfaceC39126r, List list, int i13) {
        AbstractC22676k.m65750j(interfaceC39126r, "<this>");
        return m51916g(list, i13, new C18014b(5));
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: d */
    public final int mo539d(InterfaceC39126r interfaceC39126r, List list, int i13) {
        AbstractC22676k.m65750j(interfaceC39126r, "<this>");
        return m51917f(interfaceC39126r, list, i13, new C18014b(2));
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: e */
    public final int mo540e(InterfaceC39126r interfaceC39126r, List list, int i13) {
        AbstractC22676k.m65750j(interfaceC39126r, "<this>");
        return m51916g(list, i13, new C18014b(3));
    }

    /* JADX INFO: renamed from: f */
    public final int m51917f(InterfaceC39126r interfaceC39126r, List list, int i13, InterfaceC4351m interfaceC4351m) {
        Object obj;
        Object obj2;
        int iMo447Q;
        int iIntValue;
        Object obj3;
        int iIntValue2;
        Object obj4;
        int size = list.size();
        int i14 = 0;
        while (true) {
            obj = null;
            if (i14 >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i14);
            if (AbstractC22676k.m65745e(AbstractC18076j.m51915c((InterfaceC39124q0) obj2), "Leading")) {
                break;
            }
            i14++;
        }
        InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) obj2;
        if (interfaceC39124q0 != null) {
            iMo447Q = i13 == Integer.MAX_VALUE ? i13 : i13 - interfaceC39124q0.mo447Q(Integer.MAX_VALUE);
            iIntValue = ((Number) interfaceC4351m.invoke(interfaceC39124q0, Integer.valueOf(i13))).intValue();
        } else {
            iMo447Q = i13;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i15);
            if (AbstractC22676k.m65745e(AbstractC18076j.m51915c((InterfaceC39124q0) obj3), "Trailing")) {
                break;
            }
            i15++;
        }
        InterfaceC39124q0 interfaceC39124q1 = (InterfaceC39124q0) obj3;
        if (interfaceC39124q1 != null) {
            int iMo447Q2 = interfaceC39124q1.mo447Q(Integer.MAX_VALUE);
            if (iMo447Q != Integer.MAX_VALUE) {
                iMo447Q -= iMo447Q2;
            }
            iIntValue2 = ((Number) interfaceC4351m.invoke(interfaceC39124q1, Integer.valueOf(i13))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size3) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i16);
            if (AbstractC22676k.m65745e(AbstractC18076j.m51915c((InterfaceC39124q0) obj4), "Label")) {
                break;
            }
            i16++;
        }
        Object obj5 = (InterfaceC39124q0) obj4;
        int iIntValue3 = obj5 != null ? ((Number) interfaceC4351m.invoke(obj5, Integer.valueOf(iMo447Q))).intValue() : 0;
        int size4 = list.size();
        for (int i17 = 0; i17 < size4; i17++) {
            Object obj6 = list.get(i17);
            if (AbstractC22676k.m65745e(AbstractC18076j.m51915c((InterfaceC39124q0) obj6), "TextField")) {
                int iIntValue4 = ((Number) interfaceC4351m.invoke(obj6, Integer.valueOf(iMo447Q))).intValue();
                int size5 = list.size();
                for (int i18 = 0; i18 < size5; i18++) {
                    Object obj7 = list.get(i18);
                    if (AbstractC22676k.m65745e(AbstractC18076j.m51915c((InterfaceC39124q0) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                }
                Object obj8 = (InterfaceC39124q0) obj;
                return AbstractC18076j.m51914b(iIntValue4, iIntValue3 > 0, iIntValue3, iIntValue, iIntValue2, obj8 != null ? ((Number) interfaceC4351m.invoke(obj8, Integer.valueOf(iMo447Q))).intValue() : 0, AbstractC18067a.f70153a, interfaceC39126r.getDensity(), this.f70282c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
