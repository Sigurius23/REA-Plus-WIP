package p580wd;

import java.util.ArrayList;
import java.util.List;
import p470rv.AbstractC31834n;

/* JADX INFO: renamed from: wd.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C37159l {

    /* JADX INFO: renamed from: a */
    public final AbstractC31834n f158915a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f158916b;

    public C37159l(AbstractC31834n abstractC31834n, ArrayList arrayList) {
        this.f158915a = abstractC31834n;
        this.f158916b = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC31834n m119080a() {
        return this.f158915a;
    }

    /* JADX INFO: renamed from: b */
    public final List m119081b() {
        return this.f158916b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37159l)) {
            return false;
        }
        C37159l c37159l = (C37159l) obj;
        return this.f158915a.equals(c37159l.f158915a) && this.f158916b.equals(c37159l.f158916b);
    }

    public final int hashCode() {
        return this.f158916b.hashCode() + (this.f158915a.hashCode() * 31);
    }

    public final String toString() {
        return "ProfileChain(leaf=" + this.f158915a + ", roles=" + this.f158916b + ')';
    }
}
