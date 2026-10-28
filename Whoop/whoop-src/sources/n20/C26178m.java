package n20;

import a30.AbstractC0326t0;
import h20.C16761x1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n20.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C26178m {

    /* JADX INFO: renamed from: a */
    public final AbstractC0326t0 f103821a;

    /* JADX INFO: renamed from: b */
    public final C16761x1 f103822b;

    public C26178m(AbstractC0326t0 initializationMode, C16761x1 configuration) {
        AbstractC22676k.m65750j(initializationMode, "initializationMode");
        AbstractC22676k.m65750j(configuration, "configuration");
        this.f103821a = initializationMode;
        this.f103822b = configuration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26178m)) {
            return false;
        }
        C26178m c26178m = (C26178m) obj;
        return AbstractC22676k.m65745e(this.f103821a, c26178m.f103821a) && AbstractC22676k.m65745e(this.f103822b, c26178m.f103822b);
    }

    public final int hashCode() {
        return this.f103822b.hashCode() + (this.f103821a.hashCode() * 31);
    }

    public final String toString() {
        return "ConfigureRequest(initializationMode=" + this.f103821a + ", configuration=" + this.f103822b + ")";
    }
}
