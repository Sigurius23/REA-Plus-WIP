package a30;

import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a30.i1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0299i1 implements InterfaceC0305k1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41211c f1038a;

    public C0299i1(InterfaceC41211c interfaceC41211c) {
        this.f1038a = interfaceC41211c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0299i1) && AbstractC22676k.m65745e(this.f1038a, ((C0299i1) obj).f1038a);
    }

    public final int hashCode() {
        InterfaceC41211c interfaceC41211c = this.f1038a;
        if (interfaceC41211c == null) {
            return 0;
        }
        return interfaceC41211c.hashCode();
    }

    public final String toString() {
        return "Idle(error=" + this.f1038a + ")";
    }
}
