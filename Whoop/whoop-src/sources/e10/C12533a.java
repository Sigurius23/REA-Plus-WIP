package e10;

import ih0.AbstractC18489d0;
import n10.EnumC26121c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: e10.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C12533a implements InterfaceC12539d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC38802c8 f42835a;

    /* JADX INFO: renamed from: b */
    public final EnumC26121c0 f42836b;

    /* JADX INFO: renamed from: c */
    public final boolean f42837c;

    public C12533a(InterfaceC38802c8 intent, EnumC26121c0 enumC26121c0, boolean z4) {
        AbstractC22676k.m65750j(intent, "intent");
        this.f42835a = intent;
        this.f42836b = enumC26121c0;
        this.f42837c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12533a)) {
            return false;
        }
        C12533a c12533a = (C12533a) obj;
        return AbstractC22676k.m65745e(this.f42835a, c12533a.f42835a) && this.f42836b == c12533a.f42836b && this.f42837c == c12533a.f42837c;
    }

    public final int hashCode() {
        int iHashCode = this.f42835a.hashCode() * 31;
        EnumC26121c0 enumC26121c0 = this.f42836b;
        return Boolean.hashCode(this.f42837c) + ((iHashCode + (enumC26121c0 == null ? 0 : enumC26121c0.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Complete(intent=");
        sb4.append(this.f42835a);
        sb4.append(", deferredIntentConfirmationType=");
        sb4.append(this.f42836b);
        sb4.append(", completedFullPaymentFlow=");
        return AbstractC18489d0.m53372m(sb4, this.f42837c, ")");
    }
}
