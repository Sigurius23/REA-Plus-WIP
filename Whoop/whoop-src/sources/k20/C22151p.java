package k20;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: k20.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C22151p implements InterfaceC22153r {

    /* JADX INFO: renamed from: a */
    public final AbstractC22143h f85907a;

    public C22151p(AbstractC22143h abstractC22143h) {
        this.f85907a = abstractC22143h;
    }

    @Override // k20.InterfaceC22153r
    /* JADX INFO: renamed from: e */
    public final String mo63410e() {
        return "failure";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22151p) && AbstractC22676k.m65745e(this.f85907a, ((C22151p) obj).f85907a);
    }

    public final int hashCode() {
        return this.f85907a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.f85907a + ")";
    }
}
