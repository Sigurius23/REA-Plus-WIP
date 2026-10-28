package cz;

import b30.C2550j3;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import ou1.C28376a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cz.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11221q0 extends AbstractC11227t0 {

    /* JADX INFO: renamed from: c */
    public final boolean f36010c;

    public C11221q0(boolean z4) {
        super(false, false);
        this.f36010c = z4;
    }

    @Override // cz.AbstractC11227t0
    /* JADX INFO: renamed from: b */
    public final C2550j3 mo30347b(InterfaceC4339a onEditIconPressed) {
        AbstractC22676k.m65750j(onEditIconPressed, "onEditIconPressed");
        return new C2550j3(!this.f36010c, false, false, new C28376a(7));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11221q0) && this.f36010c == ((C11221q0) obj).f36010c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36010c);
    }

    public final String toString() {
        return AbstractC3855a.m11827k("Loading(isLiveMode=", ")", this.f36010c);
    }
}
