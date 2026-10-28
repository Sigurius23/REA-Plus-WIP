package b30;

import p550vd.AbstractC35902e;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2631u0 extends AbstractC35902e {

    /* JADX INFO: renamed from: w */
    public final InterfaceC41211c f10257w;

    public C2631u0(InterfaceC41211c interfaceC41211c) {
        this.f10257w = interfaceC41211c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2631u0) && AbstractC22676k.m65745e(this.f10257w, ((C2631u0) obj).f10257w);
    }

    public final int hashCode() {
        InterfaceC41211c interfaceC41211c = this.f10257w;
        if (interfaceC41211c == null) {
            return 0;
        }
        return interfaceC41211c.hashCode();
    }

    public final String toString() {
        return "Error(errorMessage=" + this.f10257w + ")";
    }
}
