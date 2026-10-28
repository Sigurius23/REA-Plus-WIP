package o10;

import e10.InterfaceC12576v0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o10.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C27390c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC12576v0 f110100a;

    public C27390c(InterfaceC12576v0 nextConfirmationOption) {
        AbstractC22676k.m65750j(nextConfirmationOption, "nextConfirmationOption");
        this.f110100a = nextConfirmationOption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27390c) && AbstractC22676k.m65745e(this.f110100a, ((C27390c) obj).f110100a);
    }

    public final int hashCode() {
        return this.f110100a.hashCode();
    }

    public final String toString() {
        return "LauncherArguments(nextConfirmationOption=" + this.f110100a + ")";
    }
}
