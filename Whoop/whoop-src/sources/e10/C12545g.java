package e10;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e10.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C12545g implements InterfaceC12549i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC12555l f42857a;

    /* JADX INFO: renamed from: b */
    public final C12553k f42858b;

    public C12545g(InterfaceC12576v0 confirmationOption, C12553k arguments) {
        AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
        AbstractC22676k.m65750j(arguments, "arguments");
        this.f42857a = confirmationOption;
        this.f42858b = arguments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12545g)) {
            return false;
        }
        C12545g c12545g = (C12545g) obj;
        return AbstractC22676k.m65745e(this.f42857a, c12545g.f42857a) && AbstractC22676k.m65745e(this.f42858b, c12545g.f42858b);
    }

    public final int hashCode() {
        return this.f42858b.hashCode() + (this.f42857a.hashCode() * 31);
    }

    public final String toString() {
        return "NextStep(confirmationOption=" + this.f42857a + ", arguments=" + this.f42858b + ")";
    }
}
