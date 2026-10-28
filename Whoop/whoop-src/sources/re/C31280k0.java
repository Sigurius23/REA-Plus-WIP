package re;

import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29934u0;

/* JADX INFO: renamed from: re.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31280k0 {

    /* JADX INFO: renamed from: a */
    public final C31260c0 f128806a;

    public C31280k0(C29934u0 c29934u0) {
        this.f128806a = (C31260c0) c29934u0.f122249x;
    }

    /* JADX INFO: renamed from: a */
    public final C31260c0 m96297a() {
        return this.f128806a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C31280k0.class == obj.getClass() && AbstractC22676k.m65745e(this.f128806a, ((C31280k0) obj).f128806a);
    }

    public final int hashCode() {
        C31260c0 c31260c0 = this.f128806a;
        if (c31260c0 != null) {
            return c31260c0.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("GetUserAttributeVerificationCodeResponse(");
        sb4.append("codeDeliveryDetails=" + this.f128806a);
        sb4.append(")");
        return sb4.toString();
    }
}
