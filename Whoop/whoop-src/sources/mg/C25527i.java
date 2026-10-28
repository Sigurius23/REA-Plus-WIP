package mg;

import g73.C15556d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30054a;

/* JADX INFO: renamed from: mg.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C25527i extends AbstractC30054a {

    /* JADX INFO: renamed from: x */
    public static final C15556d f99938x = new C15556d(25);

    /* JADX INFO: renamed from: w */
    public final InterfaceC25526h f99939w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25527i(InterfaceC25526h provider) {
        super(f99938x);
        AbstractC22676k.m65750j(provider, "provider");
        this.f99939w = provider;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25527i) && AbstractC22676k.m65745e(this.f99939w, ((C25527i) obj).f99939w);
    }

    public final int hashCode() {
        return this.f99939w.hashCode();
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceC25526h m75078s() {
        return this.f99939w;
    }

    public final String toString() {
        return "TelemetryContext(" + this.f99939w + ')';
    }
}
