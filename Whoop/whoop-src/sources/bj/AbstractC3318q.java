package bj;

import java.util.ArrayList;
import p049cj.AbstractC4737c;
import p119ej.C13224a;
import p426qi.C30387i;
import p502ti.C33828k;
import p581we.C37199o;

/* JADX INFO: renamed from: bj.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3318q {

    /* JADX INFO: renamed from: a */
    public static final C37199o f12898a = C37199o.m119195L("k");

    /* JADX INFO: renamed from: a */
    public static ArrayList m9616a(AbstractC4737c abstractC4737c, C30387i c30387i, float f13, InterfaceC3306e0 interfaceC3306e0, boolean z4) {
        AbstractC4737c abstractC4737c2;
        C30387i c30387i2;
        float f14;
        InterfaceC3306e0 interfaceC3306e1;
        boolean z13;
        ArrayList arrayList = new ArrayList();
        if (abstractC4737c.mo14822i() == 6) {
            c30387i.m92858a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC4737c.beginObject();
        while (abstractC4737c.hasNext()) {
            if (abstractC4737c.mo14824m(f12898a) != 0) {
                abstractC4737c.skipValue();
            } else if (abstractC4737c.mo14822i() == 1) {
                abstractC4737c.beginArray();
                if (abstractC4737c.mo14822i() == 7) {
                    AbstractC4737c abstractC4737c3 = abstractC4737c;
                    C30387i c30387i3 = c30387i;
                    float f15 = f13;
                    InterfaceC3306e0 interfaceC3306e2 = interfaceC3306e0;
                    boolean z14 = z4;
                    C13224a c13224aM9615b = AbstractC3317p.m9615b(abstractC4737c3, c30387i3, f15, interfaceC3306e2, false, z14);
                    abstractC4737c2 = abstractC4737c3;
                    c30387i2 = c30387i3;
                    f14 = f15;
                    interfaceC3306e1 = interfaceC3306e2;
                    z13 = z14;
                    arrayList.add(c13224aM9615b);
                } else {
                    abstractC4737c2 = abstractC4737c;
                    c30387i2 = c30387i;
                    f14 = f13;
                    interfaceC3306e1 = interfaceC3306e0;
                    z13 = z4;
                    while (abstractC4737c2.hasNext()) {
                        arrayList.add(AbstractC3317p.m9615b(abstractC4737c2, c30387i2, f14, interfaceC3306e1, true, z13));
                    }
                }
                abstractC4737c2.endArray();
                abstractC4737c = abstractC4737c2;
                c30387i = c30387i2;
                f13 = f14;
                interfaceC3306e0 = interfaceC3306e1;
                z4 = z13;
            } else {
                AbstractC4737c abstractC4737c4 = abstractC4737c;
                arrayList.add(AbstractC3317p.m9615b(abstractC4737c4, c30387i, f13, interfaceC3306e0, false, z4));
                abstractC4737c = abstractC4737c4;
            }
        }
        abstractC4737c.endObject();
        m9617b(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static void m9617b(ArrayList arrayList) {
        int i13;
        Object obj;
        int size = arrayList.size();
        int i14 = 0;
        while (true) {
            i13 = size - 1;
            if (i14 >= i13) {
                break;
            }
            C13224a c13224a = (C13224a) arrayList.get(i14);
            i14++;
            C13224a c13224a2 = (C13224a) arrayList.get(i14);
            c13224a.f45822h = Float.valueOf(c13224a2.f45821g);
            if (c13224a.f45817c == null && (obj = c13224a2.f45816b) != null) {
                c13224a.f45817c = obj;
                if (c13224a instanceof C33828k) {
                    ((C33828k) c13224a).m106994d();
                }
            }
        }
        C13224a c13224a3 = (C13224a) arrayList.get(i13);
        if ((c13224a3.f45816b == null || c13224a3.f45817c == null) && arrayList.size() > 1) {
            arrayList.remove(c13224a3);
        }
    }
}
