package p163g1;

import c93.InterfaceC4351m;
import ec3.C13036f1;
import ec3.InterfaceC13062m;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import p077d0.InterfaceC11372l;
import p390p1.C28633k1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.j7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15053j7 implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C15093n7 f56354w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f56355x;

    public C15053j7(C15093n7 c15093n7, float f13) {
        this.f56354w = c15093n7;
        this.f56355x = f13;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        Object obj2;
        float f13;
        Object obj3;
        float fFloatValue;
        Map map = (Map) obj;
        C15093n7 c15093n7 = this.f56354w;
        C28633k1 c28633k1 = c15093n7.f56510c;
        InterfaceC11372l interfaceC11372l = c15093n7.f56508a;
        Float fM60433g = AbstractC21478l0.m60433g(c28633k1.getValue(), map);
        AbstractC22676k.m65747g(fM60433g);
        float fFloatValue2 = fM60433g.floatValue();
        float fFloatValue3 = ((Number) c15093n7.f56512e.getValue()).floatValue();
        Set setKeySet = map.keySet();
        InterfaceC4351m interfaceC4351m = (InterfaceC4351m) c15093n7.f56520m.getValue();
        float fM87022x = c15093n7.f56521n.m87022x();
        Set set = setKeySet;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : set) {
            if (((Number) obj4).floatValue() <= ((double) fFloatValue3) + 0.001d) {
                arrayList.add(obj4);
            }
        }
        int i13 = 1;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            float fFloatValue4 = ((Number) obj2).floatValue();
            int iM118951C = AbstractC37056f.m118951C(arrayList);
            if (1 <= iM118951C) {
                while (true) {
                    Object obj5 = arrayList.get(i13);
                    float fFloatValue5 = ((Number) obj5).floatValue();
                    if (Float.compare(fFloatValue4, fFloatValue5) < 0) {
                        fFloatValue4 = fFloatValue5;
                        obj2 = obj5;
                    }
                    if (i13 == iM118951C) {
                        break;
                    }
                    i13++;
                }
            }
        } else {
            obj2 = null;
        }
        Float f14 = (Float) obj2;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj6 : set) {
            if (((Number) obj6).floatValue() >= ((double) fFloatValue3) - 0.001d) {
                arrayList2.add(obj6);
            }
        }
        if (arrayList2.isEmpty()) {
            f13 = fFloatValue3;
            obj3 = null;
        } else {
            Object obj7 = arrayList2.get(0);
            float fFloatValue6 = ((Number) obj7).floatValue();
            int iM118951C2 = AbstractC37056f.m118951C(arrayList2);
            if (1 <= iM118951C2) {
                int i14 = 1;
                while (true) {
                    Object obj8 = arrayList2.get(i14);
                    f13 = fFloatValue3;
                    float fFloatValue7 = ((Number) obj8).floatValue();
                    if (Float.compare(fFloatValue6, fFloatValue7) > 0) {
                        fFloatValue6 = fFloatValue7;
                        obj7 = obj8;
                    }
                    if (i14 == iM118951C2) {
                        break;
                    }
                    i14++;
                    fFloatValue3 = f13;
                }
            } else {
                f13 = fFloatValue3;
            }
            obj3 = obj7;
        }
        Float f15 = (Float) obj3;
        List listM118958J = f14 == null ? AbstractC37056f.m118960L(f15) : (f15 == null || AbstractC22676k.m65744d(f14, f15)) ? AbstractC37056f.m118958J(f14) : AbstractC37056f.m118959K(f14, f15);
        int size = listM118958J.size();
        if (size == 0) {
            fFloatValue = fFloatValue2;
        } else if (size != 1) {
            fFloatValue = ((Number) listM118958J.get(0)).floatValue();
            float fFloatValue8 = ((Number) listM118958J.get(1)).floatValue();
            float f16 = this.f56355x;
            if (fFloatValue2 > f13 ? f16 > (-fM87022x) && f13 > ((Number) interfaceC4351m.invoke(Float.valueOf(fFloatValue8), Float.valueOf(fFloatValue))).floatValue() : f16 >= fM87022x || f13 >= ((Number) interfaceC4351m.invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue8))).floatValue()) {
                fFloatValue = fFloatValue8;
            }
        } else {
            fFloatValue = ((Number) listM118958J.get(0)).floatValue();
        }
        Object obj9 = map.get(new Float(fFloatValue));
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (obj9 == null || !((Boolean) c15093n7.f56509b.invoke(obj9)).booleanValue()) {
            Object objM43162a = c15093n7.m43162a(fFloatValue2, interfaceC11372l, interfaceC30057d);
            if (objM43162a == EnumC31071a.f128113w) {
                return objM43162a;
            }
        } else {
            Object objCollect = c15093n7.f56517j.collect(new C13036f1(obj9, c15093n7, interfaceC11372l, 3), interfaceC30057d);
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (objCollect != enumC31071a) {
                objCollect = c23454a0;
            }
            if (objCollect == enumC31071a) {
                return objCollect;
            }
        }
        return c23454a0;
    }
}
