package t23;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t23.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33390g0 implements InterfaceC33400i0 {

    /* JADX INFO: renamed from: a */
    public final EnumC33393g3 f139396a;

    /* JADX INFO: renamed from: b */
    public final String f139397b;

    public C33390g0(EnumC33393g3 enumC33393g3, String message) {
        AbstractC22676k.m65750j(message, "message");
        this.f139396a = enumC33393g3;
        this.f139397b = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33390g0)) {
            return false;
        }
        C33390g0 c33390g0 = (C33390g0) obj;
        return this.f139396a == c33390g0.f139396a && AbstractC22676k.m65745e(this.f139397b, c33390g0.f139397b);
    }

    @Override // t23.InterfaceC33400i0
    public final String getMessage() {
        return this.f139397b;
    }

    public final int hashCode() {
        return this.f139397b.hashCode() + (this.f139396a.hashCode() * 31);
    }

    public final String toString() {
        return "SdkDriven(cause=" + this.f139396a + ", message=" + this.f139397b + ")";
    }
}
