package t23;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t23.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33374d0 implements InterfaceC33400i0 {

    /* JADX INFO: renamed from: a */
    public final EnumC33389g f139328a;

    /* JADX INFO: renamed from: b */
    public final String f139329b;

    public C33374d0(EnumC33389g enumC33389g, String message) {
        AbstractC22676k.m65750j(message, "message");
        this.f139328a = enumC33389g;
        this.f139329b = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33374d0)) {
            return false;
        }
        C33374d0 c33374d0 = (C33374d0) obj;
        return this.f139328a == c33374d0.f139328a && AbstractC22676k.m65745e(this.f139329b, c33374d0.f139329b);
    }

    @Override // t23.InterfaceC33400i0
    public final String getMessage() {
        return this.f139329b;
    }

    public final int hashCode() {
        return this.f139329b.hashCode() + (this.f139328a.hashCode() * 31);
    }

    public final String toString() {
        return "Backend(cause=" + this.f139328a + ", message=" + this.f139329b + ")";
    }
}
