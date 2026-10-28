package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C26372w {

    /* JADX INFO: renamed from: a */
    public final String f104801a;

    public C26372w(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104801a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26372w) && AbstractC22676k.m65745e(this.f104801a, ((C26372w) obj).f104801a);
    }

    public final int hashCode() {
        return this.f104801a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpEndofcandidates(value=", this.f104801a, ")");
    }
}
