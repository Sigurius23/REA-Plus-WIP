package d20;

import p663yx.C39838b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d20.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C11491g extends AbstractC11492h {

    /* JADX INFO: renamed from: a */
    public final C39838b f36950a;

    public C11491g(C39838b c39838b) {
        this.f36950a = c39838b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11491g) && AbstractC22676k.m65745e(this.f36950a, ((C11491g) obj).f36950a);
    }

    public final int hashCode() {
        return this.f36950a.hashCode();
    }

    public final String toString() {
        return "StartFallback(args=" + this.f36950a + ")";
    }
}
