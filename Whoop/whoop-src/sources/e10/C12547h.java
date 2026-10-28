package e10;

import ih0.AbstractC18489d0;
import n10.EnumC26121c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: e10.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C12547h implements InterfaceC12549i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC38802c8 f42862a;

    /* JADX INFO: renamed from: b */
    public final EnumC26121c0 f42863b;

    /* JADX INFO: renamed from: c */
    public final boolean f42864c;

    public C12547h(InterfaceC38802c8 intent, EnumC26121c0 enumC26121c0, boolean z4) {
        AbstractC22676k.m65750j(intent, "intent");
        this.f42862a = intent;
        this.f42863b = enumC26121c0;
        this.f42864c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12547h)) {
            return false;
        }
        C12547h c12547h = (C12547h) obj;
        return AbstractC22676k.m65745e(this.f42862a, c12547h.f42862a) && this.f42863b == c12547h.f42863b && this.f42864c == c12547h.f42864c;
    }

    public final int hashCode() {
        int iHashCode = this.f42862a.hashCode() * 31;
        EnumC26121c0 enumC26121c0 = this.f42863b;
        return Boolean.hashCode(this.f42864c) + ((iHashCode + (enumC26121c0 == null ? 0 : enumC26121c0.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Succeeded(intent=");
        sb4.append(this.f42862a);
        sb4.append(", deferredIntentConfirmationType=");
        sb4.append(this.f42863b);
        sb4.append(", completedFullPaymentFlow=");
        return AbstractC18489d0.m53372m(sb4, this.f42864c, ")");
    }
}
