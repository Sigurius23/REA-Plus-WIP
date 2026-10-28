package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26382z0 {

    /* JADX INFO: renamed from: a */
    public final String f104830a;

    public C26382z0(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104830a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26382z0) && AbstractC22676k.m65745e(this.f104830a, ((C26382z0) obj).f104830a);
    }

    public final int hashCode() {
        return this.f104830a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpRepeats(value=", this.f104830a, ")");
    }
}
