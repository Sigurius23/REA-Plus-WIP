package mp;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: mp.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C25771h extends AbstractC25808x implements Serializable {

    /* JADX INFO: renamed from: w */
    public final Comparator f101485w;

    public C25771h(Comparator comparator) {
        comparator.getClass();
        this.f101485w = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f101485w.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25771h) {
            return this.f101485w.equals(((C25771h) obj).f101485w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f101485w.hashCode();
    }

    public final String toString() {
        return this.f101485w.toString();
    }
}
