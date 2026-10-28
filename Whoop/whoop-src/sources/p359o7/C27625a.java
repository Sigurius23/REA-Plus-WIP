package p359o7;

import java.util.Set;
import m83.C25235a0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o7.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C27625a {

    /* JADX INFO: renamed from: a */
    public final Set f111161a;

    /* JADX INFO: renamed from: b */
    public final Set f111162b = C25235a0.f99113w;

    public C27625a(Set set) {
        this.f111161a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C27625a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.health.connect.client.request.ChangesTokenRequest");
        C27625a c27625a = (C27625a) obj;
        return AbstractC22676k.m65745e(this.f111161a, c27625a.f111161a) && AbstractC22676k.m65745e(this.f111162b, c27625a.f111162b);
    }

    public final int hashCode() {
        return this.f111162b.hashCode() + (this.f111161a.hashCode() * 31);
    }
}
