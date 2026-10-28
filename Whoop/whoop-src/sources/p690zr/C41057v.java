package p690zr;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: zr.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C41057v extends AbstractC41058v0 implements Serializable {

    /* JADX INFO: renamed from: w */
    public final Comparator f177066w;

    public C41057v(Comparator comparator) {
        this.f177066w = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f177066w.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C41057v) {
            return this.f177066w.equals(((C41057v) obj).f177066w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f177066w.hashCode();
    }

    public final String toString() {
        return this.f177066w.toString();
    }
}
