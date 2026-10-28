package d00;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d00.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C11426e implements InterfaceC11427f {

    /* JADX INFO: renamed from: a */
    public final boolean f36646a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC11432k f36647b;

    public C11426e(boolean z4, InterfaceC11432k interfaceC11432k) {
        this.f36646a = z4;
        this.f36647b = interfaceC11432k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11426e)) {
            return false;
        }
        C11426e c11426e = (C11426e) obj;
        return this.f36646a == c11426e.f36646a && AbstractC22676k.m65745e(this.f36647b, c11426e.f36647b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f36646a) * 31;
        InterfaceC11432k interfaceC11432k = this.f36647b;
        return iHashCode + (interfaceC11432k == null ? 0 : interfaceC11432k.hashCode());
    }

    public final String toString() {
        return "Verified(hasVerifiedSMSSession=" + this.f36646a + ", consentPresentation=" + this.f36647b + ")";
    }
}
