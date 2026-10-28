package t23;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t23.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33380e0 implements InterfaceC33400i0 {

    /* JADX INFO: renamed from: a */
    public final String f139343a;

    public C33380e0(String str) {
        this.f139343a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33380e0) && AbstractC22676k.m65745e(this.f139343a, ((C33380e0) obj).f139343a);
    }

    @Override // t23.InterfaceC33400i0
    public final String getMessage() {
        return this.f139343a;
    }

    public final int hashCode() {
        return this.f139343a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Custom(message=", this.f139343a, ")");
    }
}
