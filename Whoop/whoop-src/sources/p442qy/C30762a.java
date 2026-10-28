package p442qy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: qy.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C30762a {

    /* JADX INFO: renamed from: c */
    public static final C30762a f126687c = new C30762a(0, C25235a0.f99113w);

    /* JADX INFO: renamed from: a */
    public final String f126688a;

    /* JADX INFO: renamed from: b */
    public final Set f126689b;

    public C30762a(int i13, Set betaCodes) {
        AbstractC22676k.m65750j(betaCodes, "betaCodes");
        this.f126688a = "2020-03-02";
        this.f126689b = betaCodes;
    }

    /* JADX INFO: renamed from: a */
    public final String m94509a() {
        List listM118958J = AbstractC37056f.m118958J(this.f126688a);
        Set set = this.f126689b;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return AbstractC25265s.m74110N0(AbstractC25265s.m74129g1(listM118958J, arrayList), ";", null, null, null, 62);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30762a)) {
            return false;
        }
        C30762a c30762a = (C30762a) obj;
        return AbstractC22676k.m65745e(this.f126688a, c30762a.f126688a) && AbstractC22676k.m65745e(this.f126689b, c30762a.f126689b);
    }

    public final int hashCode() {
        return this.f126689b.hashCode() + (this.f126688a.hashCode() * 31);
    }

    public final String toString() {
        return "ApiVersion(version=" + this.f126688a + ", betaCodes=" + this.f126689b + ")";
    }
}
