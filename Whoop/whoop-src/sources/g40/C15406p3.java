package g40;

import java.util.List;
import p127ev.AbstractC13673n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.p3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15406p3 extends AbstractC15416r3 {

    /* JADX INFO: renamed from: a */
    public final List f57870a;

    /* JADX INFO: renamed from: b */
    public final List f57871b;

    public C15406p3(List list, List list2) {
        this.f57870a = list;
        this.f57871b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15406p3)) {
            return false;
        }
        C15406p3 c15406p3 = (C15406p3) obj;
        return AbstractC22676k.m65745e(this.f57870a, c15406p3.f57870a) && AbstractC22676k.m65745e(this.f57871b, c15406p3.f57871b);
    }

    public final int hashCode() {
        return this.f57871b.hashCode() + (this.f57870a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC13673n.m38562i("MultiTrailing(staticIcons=", ", animatedIcons=", this.f57870a, ")", this.f57871b);
    }
}
