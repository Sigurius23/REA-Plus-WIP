package cd;

import p715kotlin.jvm.internal.AbstractC22676k;
import ro.C31624i;

/* JADX INFO: renamed from: cd.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C4425e {

    /* JADX INFO: renamed from: a */
    public final C4426f f17895a;

    public C4425e(C31624i c31624i) {
        this.f17895a = (C4426f) c31624i.f130665x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C4425e.class == obj.getClass() && AbstractC22676k.m65745e(this.f17895a, ((C4425e) obj).f17895a);
    }

    public final int hashCode() {
        C4426f c4426f = this.f17895a;
        if (c4426f != null) {
            return c4426f.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CreateOAuth2TokenResponse(");
        sb4.append("tokenOutput=" + this.f17895a);
        sb4.append(")");
        return sb4.toString();
    }
}
