package p10;

import e10.InterfaceC12576v0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p10.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C28693b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC12576v0 f116062a;

    public C28693b(InterfaceC12576v0 nextConfirmationOption) {
        AbstractC22676k.m65750j(nextConfirmationOption, "nextConfirmationOption");
        this.f116062a = nextConfirmationOption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28693b) && AbstractC22676k.m65745e(this.f116062a, ((C28693b) obj).f116062a);
    }

    public final int hashCode() {
        return this.f116062a.hashCode();
    }

    public final String toString() {
        return "LauncherArguments(nextConfirmationOption=" + this.f116062a + ")";
    }
}
