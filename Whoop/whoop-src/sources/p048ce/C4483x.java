package p048ce;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ce.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C4483x implements InterfaceC4461b0 {

    /* JADX INFO: renamed from: a */
    public final String f18023a;

    public C4483x(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f18023a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4483x) && AbstractC22676k.m65745e(this.f18023a, ((C4483x) obj).f18023a);
    }

    public final int hashCode() {
        return this.f18023a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("Continuation(value="), this.f18023a, ')');
    }
}
