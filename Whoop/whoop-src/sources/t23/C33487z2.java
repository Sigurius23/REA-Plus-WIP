package t23;

import c13.AbstractC3855a;

/* JADX INFO: renamed from: t23.z2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33487z2 implements InterfaceC33377d3 {

    /* JADX INFO: renamed from: a */
    public final boolean f139814a;

    public C33487z2(boolean z4) {
        this.f139814a = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33487z2) && this.f139814a == ((C33487z2) obj).f139814a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f139814a);
    }

    public final String toString() {
        return AbstractC3855a.m11827k("Incoming(acceptedByMe=", ")", this.f139814a);
    }
}
