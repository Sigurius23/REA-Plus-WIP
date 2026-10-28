package dc3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dc3.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C11930o {

    /* JADX INFO: renamed from: b */
    public static final C11929n f39031b = new C11929n();

    /* JADX INFO: renamed from: a */
    public final Object f39032a;

    /* JADX INFO: renamed from: a */
    public static final Object m32226a(Object obj) {
        if (obj instanceof C11929n) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11930o) {
            return AbstractC22676k.m65745e(this.f39032a, ((C11930o) obj).f39032a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f39032a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f39032a;
        if (obj instanceof C11928m) {
            return ((C11928m) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
