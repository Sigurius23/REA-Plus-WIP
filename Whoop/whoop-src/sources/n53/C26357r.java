package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C26357r {

    /* JADX INFO: renamed from: a */
    public final String f104771a;

    public C26357r(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104771a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26357r) && AbstractC22676k.m65745e(this.f104771a, ((C26357r) obj).f104771a);
    }

    public final int hashCode() {
        return this.f104771a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpControl(value=", this.f104771a, ")");
    }
}
