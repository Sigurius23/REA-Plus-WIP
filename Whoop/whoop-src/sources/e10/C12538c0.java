package e10;

import ih0.AbstractC18489d0;
import n10.EnumC26121c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: e10.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12538c0 implements InterfaceC12544f0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC38802c8 f42845a;

    /* JADX INFO: renamed from: b */
    public final EnumC26121c0 f42846b;

    /* JADX INFO: renamed from: c */
    public final boolean f42847c;

    public C12538c0(InterfaceC38802c8 intent, EnumC26121c0 enumC26121c0, boolean z4) {
        AbstractC22676k.m65750j(intent, "intent");
        this.f42845a = intent;
        this.f42846b = enumC26121c0;
        this.f42847c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12538c0)) {
            return false;
        }
        C12538c0 c12538c0 = (C12538c0) obj;
        return AbstractC22676k.m65745e(this.f42845a, c12538c0.f42845a) && this.f42846b == c12538c0.f42846b && this.f42847c == c12538c0.f42847c;
    }

    public final int hashCode() {
        int iHashCode = this.f42845a.hashCode() * 31;
        EnumC26121c0 enumC26121c0 = this.f42846b;
        return Boolean.hashCode(this.f42847c) + ((iHashCode + (enumC26121c0 == null ? 0 : enumC26121c0.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Complete(intent=");
        sb4.append(this.f42845a);
        sb4.append(", deferredIntentConfirmationType=");
        sb4.append(this.f42846b);
        sb4.append(", completedFullPaymentFlow=");
        return AbstractC18489d0.m53372m(sb4, this.f42847c, ")");
    }
}
