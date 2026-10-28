package t23;

import ih0.AbstractC18489d0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t23.j2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33407j2 implements InterfaceC33442q2 {

    /* JADX INFO: renamed from: a */
    public final Object f139482a;

    public C33407j2(Object error) {
        AbstractC22676k.m65750j(error, "error");
        this.f139482a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33407j2) && AbstractC22676k.m65745e(this.f139482a, ((C33407j2) obj).f139482a);
    }

    public final int hashCode() {
        return this.f139482a.hashCode();
    }

    public final String toString() {
        return AbstractC18489d0.m53369j(this.f139482a, "Failed(error=", ")");
    }
}
