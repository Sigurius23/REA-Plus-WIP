package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C26378y {

    /* JADX INFO: renamed from: a */
    public final String f104823a;

    public C26378y(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104823a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26378y) && AbstractC22676k.m65745e(this.f104823a, ((C26378y) obj).f104823a);
    }

    public final int hashCode() {
        return this.f104823a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpExtmapallowmixed(value=", this.f104823a, ")");
    }
}
