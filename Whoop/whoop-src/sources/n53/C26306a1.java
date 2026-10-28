package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.a1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26306a1 {

    /* JADX INFO: renamed from: a */
    public final String f104540a;

    public C26306a1(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        this.f104540a = id4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26306a1) && AbstractC22676k.m65745e(this.f104540a, ((C26306a1) obj).f104540a);
    }

    public final int hashCode() {
        return this.f104540a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpRids(id=", this.f104540a, ")");
    }
}
