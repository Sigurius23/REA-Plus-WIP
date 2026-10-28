package e10;

import ih0.AbstractC18489d0;
import n10.EnumC26121c0;
import p442qy.C30765d;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: e10.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C12577w implements InterfaceC12578x {

    /* JADX INFO: renamed from: a */
    public final InterfaceC38802c8 f42947a;

    /* JADX INFO: renamed from: b */
    public final EnumC26121c0 f42948b;

    /* JADX INFO: renamed from: c */
    public final boolean f42949c;

    public C12577w(InterfaceC38802c8 intent, EnumC26121c0 enumC26121c0, boolean z4) {
        AbstractC22676k.m65750j(intent, "intent");
        this.f42947a = intent;
        this.f42948b = enumC26121c0;
        this.f42949c = z4;
    }

    @Override // e10.InterfaceC12578x
    /* JADX INFO: renamed from: a */
    public final void mo35243a(C30765d logger) {
        AbstractC22676k.m65750j(logger, "logger");
        logger.m94513c("ConfirmationHandler.Result.Succeeded");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12577w)) {
            return false;
        }
        C12577w c12577w = (C12577w) obj;
        return AbstractC22676k.m65745e(this.f42947a, c12577w.f42947a) && this.f42948b == c12577w.f42948b && this.f42949c == c12577w.f42949c;
    }

    public final int hashCode() {
        int iHashCode = this.f42947a.hashCode() * 31;
        EnumC26121c0 enumC26121c0 = this.f42948b;
        return Boolean.hashCode(this.f42949c) + ((iHashCode + (enumC26121c0 == null ? 0 : enumC26121c0.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Succeeded(intent=");
        sb4.append(this.f42947a);
        sb4.append(", deferredIntentConfirmationType=");
        sb4.append(this.f42948b);
        sb4.append(", completedFullPaymentFlow=");
        return AbstractC18489d0.m53372m(sb4, this.f42949c, ")");
    }
}
