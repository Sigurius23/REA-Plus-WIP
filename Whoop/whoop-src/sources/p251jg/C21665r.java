package p251jg;

import hc3.AbstractC17176i;
import java.util.ArrayList;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: jg.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C21665r {

    /* JADX INFO: renamed from: a */
    public final List f83185a;

    /* JADX INFO: renamed from: b */
    public final List f83186b;

    public C21665r() {
        ArrayList arrayListM118964P = AbstractC37056f.m118964P(EnumC21664q.f83181w);
        ArrayList arrayList = new ArrayList();
        this.f83185a = arrayListM118964P;
        this.f83186b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21665r)) {
            return false;
        }
        C21665r c21665r = (C21665r) obj;
        return AbstractC22676k.m65745e(this.f83185a, c21665r.f83185a) && AbstractC22676k.m65745e(this.f83186b, c21665r.f83186b);
    }

    public final int hashCode() {
        return this.f83186b.hashCode() + (this.f83185a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("StateManager(state=");
        sb4.append(this.f83185a);
        sb4.append(", pendingMutations=");
        return AbstractC17176i.m48506h(sb4, this.f83186b, ')');
    }
}
