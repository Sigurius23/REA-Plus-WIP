package a00;

import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a00.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C0078m implements InterfaceC0080o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41211c f245a;

    public C0078m(InterfaceC41211c message) {
        AbstractC22676k.m65750j(message, "message");
        this.f245a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0078m) && AbstractC22676k.m65745e(this.f245a, ((C0078m) obj).f245a);
    }

    public final int hashCode() {
        return this.f245a.hashCode();
    }

    public final String toString() {
        return "Failed(message=" + this.f245a + ")";
    }
}
