package ya3;

import java.util.Comparator;
import r93.EnumC31120f;
import r93.InterfaceC31117e;
import r93.InterfaceC31132j;
import r93.InterfaceC31135k;
import r93.InterfaceC31145n0;
import r93.InterfaceC31162w;
import r93.InterfaceC31163w0;

/* JADX INFO: renamed from: ya3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C39366i implements Comparator {

    /* JADX INFO: renamed from: w */
    public static final C39366i f169415w = new C39366i();

    /* JADX INFO: renamed from: a */
    public static int m125545a(InterfaceC31135k interfaceC31135k) {
        if (interfaceC31135k == null) {
            AbstractC39363f.m125519a(36);
            throw null;
        }
        int i13 = AbstractC39363f.f169413a;
        if (AbstractC39363f.m125530l(interfaceC31135k, EnumC31120f.f128331z)) {
            return 8;
        }
        if (interfaceC31135k instanceof InterfaceC31132j) {
            return 7;
        }
        if (interfaceC31135k instanceof InterfaceC31145n0) {
            return ((InterfaceC31145n0) interfaceC31135k).mo78667B() == null ? 6 : 5;
        }
        if (interfaceC31135k instanceof InterfaceC31162w) {
            return ((InterfaceC31162w) interfaceC31135k).mo78667B() == null ? 4 : 3;
        }
        if (interfaceC31135k instanceof InterfaceC31117e) {
            return 2;
        }
        return interfaceC31135k instanceof InterfaceC31163w0 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer numValueOf;
        InterfaceC31135k interfaceC31135k = (InterfaceC31135k) obj;
        InterfaceC31135k interfaceC31135k2 = (InterfaceC31135k) obj2;
        int iM125545a = m125545a(interfaceC31135k2) - m125545a(interfaceC31135k);
        if (iM125545a != 0) {
            numValueOf = Integer.valueOf(iM125545a);
        } else {
            EnumC31120f enumC31120f = EnumC31120f.f128331z;
            if (AbstractC39363f.m125530l(interfaceC31135k, enumC31120f) && AbstractC39363f.m125530l(interfaceC31135k2, enumC31120f)) {
                numValueOf = 0;
            } else {
                int iCompareTo = interfaceC31135k.getName().f152620w.compareTo(interfaceC31135k2.getName().f152620w);
                numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
