package mp;

import java.io.Serializable;

/* JADX INFO: renamed from: mp.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C25754b0 extends AbstractC25808x implements Serializable {

    /* JADX INFO: renamed from: w */
    public final AbstractC25808x f101469w;

    public C25754b0(AbstractC25808x abstractC25808x) {
        this.f101469w = abstractC25808x;
    }

    @Override // mp.AbstractC25808x
    /* JADX INFO: renamed from: a */
    public final AbstractC25808x mo76003a() {
        return this.f101469w;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f101469w.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25754b0) {
            return this.f101469w.equals(((C25754b0) obj).f101469w);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f101469w.hashCode();
    }

    public final String toString() {
        return this.f101469w.toString().concat(".reverse()");
    }
}
