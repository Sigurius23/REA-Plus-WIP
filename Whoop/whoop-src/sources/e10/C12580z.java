package e10;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e10.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C12580z implements InterfaceC12536b0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC12555l f42951a;

    public C12580z(InterfaceC12555l option) {
        AbstractC22676k.m65750j(option, "option");
        this.f42951a = option;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12580z) && AbstractC22676k.m65745e(this.f42951a, ((C12580z) obj).f42951a);
    }

    public final int hashCode() {
        return this.f42951a.hashCode();
    }

    public final String toString() {
        return "Confirming(option=" + this.f42951a + ")";
    }
}
