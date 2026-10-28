package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.j1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26335j1 {

    /* JADX INFO: renamed from: a */
    public final String f104664a;

    public C26335j1(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104664a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26335j1) && AbstractC22676k.m65745e(this.f104664a, ((C26335j1) obj).f104664a);
    }

    public final int hashCode() {
        return this.f104664a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpSetup(value=", this.f104664a, ")");
    }
}
