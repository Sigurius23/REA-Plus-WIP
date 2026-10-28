package p392p3;

import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m83.AbstractC25265s;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p3.q */
/* JADX INFO: loaded from: classes.dex */
public final class C28779q {

    /* JADX INFO: renamed from: a */
    public final ArrayList f116537a;

    public C28779q(InterfaceC28778p... interfaceC28778pArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC28778pArr.length > 0) {
            InterfaceC28778p interfaceC28778p = interfaceC28778pArr[0];
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                throw new IllegalArgumentException(AbstractC25012a.m73377j(AbstractC18489d0.m53375p("'", str, "' must be unique. Actual [ ["), AbstractC25265s.m74110N0(list, null, null, null, null, 63), ']').toString());
            }
            AbstractC25265s.m74141p0(arrayList, list);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f116537a = arrayList2;
        if (arrayList2.size() <= 0) {
            return;
        }
        arrayList2.get(0).getClass();
        throw new ClassCastException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C28779q) {
            return AbstractC22676k.m65745e(this.f116537a, ((C28779q) obj).f116537a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f116537a.hashCode();
    }
}
