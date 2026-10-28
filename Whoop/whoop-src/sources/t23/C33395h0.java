package t23;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t23.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33395h0 implements InterfaceC33400i0 {

    /* JADX INFO: renamed from: a */
    public final EnumC33378d4 f139457a;

    /* JADX INFO: renamed from: b */
    public final String f139458b;

    public C33395h0(EnumC33378d4 enumC33378d4, String message) {
        AbstractC22676k.m65750j(message, "message");
        this.f139457a = enumC33378d4;
        this.f139458b = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33395h0)) {
            return false;
        }
        C33395h0 c33395h0 = (C33395h0) obj;
        return this.f139457a == c33395h0.f139457a && AbstractC22676k.m65745e(this.f139458b, c33395h0.f139458b);
    }

    @Override // t23.InterfaceC33400i0
    public final String getMessage() {
        return this.f139458b;
    }

    public final int hashCode() {
        return this.f139458b.hashCode() + (this.f139457a.hashCode() * 31);
    }

    public final String toString() {
        return "UserAction(cause=" + this.f139457a + ", message=" + this.f139458b + ")";
    }
}
