package e10;

import p442qy.C30765d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e10.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C12559n implements InterfaceC12578x {

    /* JADX INFO: renamed from: a */
    public final EnumC12557m f42891a;

    public C12559n(EnumC12557m enumC12557m) {
        this.f42891a = enumC12557m;
    }

    @Override // e10.InterfaceC12578x
    /* JADX INFO: renamed from: a */
    public final void mo35243a(C30765d logger) {
        AbstractC22676k.m65750j(logger, "logger");
        logger.m94513c("ConfirmationHandler.Result.Canceled: " + this.f42891a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12559n) && this.f42891a == ((C12559n) obj).f42891a;
    }

    public final int hashCode() {
        return this.f42891a.hashCode();
    }

    public final String toString() {
        return "Canceled(action=" + this.f42891a + ")";
    }
}
