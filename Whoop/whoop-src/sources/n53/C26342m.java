package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C26342m {

    /* JADX INFO: renamed from: a */
    public final String f104672a;

    public C26342m(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104672a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26342m) && AbstractC22676k.m65745e(this.f104672a, ((C26342m) obj).f104672a);
    }

    public final int hashCode() {
        return this.f104672a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpBundleonly(value=", this.f104672a, ")");
    }
}
