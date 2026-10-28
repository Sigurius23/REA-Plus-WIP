package a30;

import p000.AbstractC30802r;

/* JADX INFO: renamed from: a30.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0328u0 {

    /* JADX INFO: renamed from: a */
    public final boolean f1144a;

    /* JADX INFO: renamed from: b */
    public final boolean f1145b;

    public C0328u0(boolean z4, boolean z13) {
        this.f1144a = z4;
        this.f1145b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0328u0)) {
            return false;
        }
        C0328u0 c0328u0 = (C0328u0) obj;
        return this.f1144a == c0328u0.f1144a && this.f1145b == c0328u0.f1145b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1145b) + (Boolean.hashCode(this.f1144a) * 31);
    }

    public final String toString() {
        return AbstractC30802r.m94762k("Metadata(isReloadingAfterProcessDeath=", ", initializedViaCompose=", ")", this.f1144a, this.f1145b);
    }
}
