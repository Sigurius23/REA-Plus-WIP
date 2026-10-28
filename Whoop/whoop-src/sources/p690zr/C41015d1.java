package p690zr;

import java.io.Serializable;

/* JADX INFO: renamed from: zr.d1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41015d1 extends AbstractC41058v0 implements Serializable {

    /* JADX INFO: renamed from: w */
    public final AbstractC41058v0 f176983w;

    public C41015d1(AbstractC41058v0 abstractC41058v0) {
        this.f176983w = abstractC41058v0;
    }

    @Override // p690zr.AbstractC41058v0
    /* JADX INFO: renamed from: a */
    public final AbstractC41058v0 mo133240a() {
        return this.f176983w;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f176983w.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C41015d1) {
            return this.f176983w.equals(((C41015d1) obj).f176983w);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f176983w.hashCode();
    }

    public final String toString() {
        return this.f176983w + ".reverse()";
    }
}
