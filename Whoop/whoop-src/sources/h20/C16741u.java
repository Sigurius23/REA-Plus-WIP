package h20;

import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C16741u implements InterfaceC16747v {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41211c f64301a;

    public C16741u(InterfaceC41211c interfaceC41211c) {
        this.f64301a = interfaceC41211c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16741u) && AbstractC22676k.m65745e(this.f64301a, ((C16741u) obj).f64301a);
    }

    public final int hashCode() {
        return this.f64301a.hashCode();
    }

    public final String toString() {
        return "MandateOnly(mandate=" + this.f64301a + ")";
    }
}
