package cz;

import b30.C2550j3;
import b30.C2659y0;
import c93.InterfaceC4339a;
import ou1.C28376a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cz.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11225s0 extends AbstractC11227t0 {

    /* JADX INFO: renamed from: c */
    public final C2659y0 f36027c;

    /* JADX INFO: renamed from: d */
    public final boolean f36028d;

    public C11225s0(C2659y0 c2659y0, boolean z4) {
        super(false, true);
        this.f36027c = c2659y0;
        this.f36028d = z4;
    }

    @Override // cz.AbstractC11227t0
    /* JADX INFO: renamed from: b */
    public final C2550j3 mo30347b(InterfaceC4339a onEditIconPressed) {
        AbstractC22676k.m65750j(onEditIconPressed, "onEditIconPressed");
        return new C2550j3(!this.f36028d, false, false, new C28376a(7));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11225s0)) {
            return false;
        }
        C11225s0 c11225s0 = (C11225s0) obj;
        return this.f36027c.equals(c11225s0.f36027c) && this.f36028d == c11225s0.f36028d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36028d) + (this.f36027c.hashCode() * 31);
    }

    public final String toString() {
        return "UpdatePaymentMethod(updatePaymentMethodInteractor=" + this.f36027c + ", isLiveMode=" + this.f36028d + ")";
    }
}
