package q20;

import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q20.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29813d0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41211c f121871a;

    public C29813d0(InterfaceC41211c message) {
        AbstractC22676k.m65750j(message, "message");
        this.f121871a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29813d0) && AbstractC22676k.m65745e(this.f121871a, ((C29813d0) obj).f121871a);
    }

    public final int hashCode() {
        return this.f121871a.hashCode();
    }

    public final String toString() {
        return "UserErrorMessage(message=" + this.f121871a + ")";
    }
}
