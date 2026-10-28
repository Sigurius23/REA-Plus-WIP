package dc3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dc3.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C11928m extends C11929n {

    /* JADX INFO: renamed from: a */
    public final Throwable f39030a;

    public C11928m(Throwable th3) {
        this.f39030a = th3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11928m) {
            return AbstractC22676k.m65745e(this.f39030a, ((C11928m) obj).f39030a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th3 = this.f39030a;
        if (th3 != null) {
            return th3.hashCode();
        }
        return 0;
    }

    @Override // dc3.C11929n
    public final String toString() {
        return "Closed(" + this.f39030a + ')';
    }
}
