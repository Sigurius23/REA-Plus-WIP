package g40;

import c13.AbstractC3855a;

/* JADX INFO: renamed from: g40.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15393n0 implements InterfaceC15398o0 {

    /* JADX INFO: renamed from: a */
    public final boolean f57842a;

    public C15393n0(boolean z4) {
        this.f57842a = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15393n0) && this.f57842a == ((C15393n0) obj).f57842a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57842a);
    }

    public final String toString() {
        return AbstractC3855a.m11827k("Full(selectsFirstOptionAsDefault=", ")", this.f57842a);
    }
}
