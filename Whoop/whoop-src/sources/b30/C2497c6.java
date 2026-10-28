package b30;

import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2497c6 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41211c f9734a;

    /* JADX INFO: renamed from: b */
    public final EnumC2505d6 f9735b;

    /* JADX INFO: renamed from: c */
    public final boolean f9736c;

    /* JADX INFO: renamed from: d */
    public final boolean f9737d;

    public C2497c6(InterfaceC41211c interfaceC41211c, EnumC2505d6 status, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(status, "status");
        this.f9734a = interfaceC41211c;
        this.f9735b = status;
        this.f9736c = z4;
        this.f9737d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2497c6)) {
            return false;
        }
        C2497c6 c2497c6 = (C2497c6) obj;
        return AbstractC22676k.m65745e(this.f9734a, c2497c6.f9734a) && this.f9735b == c2497c6.f9735b && this.f9736c == c2497c6.f9736c && this.f9737d == c2497c6.f9737d;
    }

    public final int hashCode() {
        InterfaceC41211c interfaceC41211c = this.f9734a;
        return Boolean.hashCode(this.f9737d) + AbstractC2875y.m8289b((this.f9735b.hashCode() + ((interfaceC41211c == null ? 0 : interfaceC41211c.hashCode()) * 31)) * 31, 31, this.f9736c);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("State(error=");
        sb4.append(this.f9734a);
        sb4.append(", status=");
        sb4.append(this.f9735b);
        sb4.append(", setAsDefaultCheckboxChecked=");
        return AbstractC36095b.m114682j(sb4, this.f9736c, ", isSaveButtonEnabled=", this.f9737d, ")");
    }
}
