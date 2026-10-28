package j43;

import p715kotlin.jvm.internal.AbstractC22676k;
import t23.C33368c0;

/* JADX INFO: renamed from: j43.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C21326j {

    /* JADX INFO: renamed from: a */
    public final C33368c0 f81544a;

    /* JADX INFO: renamed from: b */
    public final C21319c f81545b;

    public C21326j(C33368c0 c33368c0, C21319c callServiceConfiguration) {
        AbstractC22676k.m65750j(callServiceConfiguration, "callServiceConfiguration");
        this.f81544a = c33368c0;
        this.f81545b = callServiceConfiguration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21326j)) {
            return false;
        }
        C21326j c21326j = (C21326j) obj;
        return AbstractC22676k.m65745e(this.f81544a, c21326j.f81544a) && AbstractC22676k.m65745e(this.f81545b, c21326j.f81545b);
    }

    public final int hashCode() {
        C33368c0 c33368c0 = this.f81544a;
        return this.f81545b.hashCode() + ((c33368c0 == null ? 0 : c33368c0.hashCode()) * 31);
    }

    public final String toString() {
        return "StopServiceParam(call=" + this.f81544a + ", callServiceConfiguration=" + this.f81545b + ")";
    }
}
