package re;

import p087db.C11856j0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: re.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31282l0 {

    /* JADX INFO: renamed from: a */
    public final String f128808a;

    public C31282l0(C11856j0 c11856j0) {
        this.f128808a = c11856j0.f38685x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C31282l0.class == obj.getClass() && AbstractC22676k.m65745e(this.f128808a, ((C31282l0) obj).f128808a);
    }

    public final int hashCode() {
        String str = this.f128808a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "GetUserRequest(accessToken=*** Sensitive Data Redacted ***)";
    }
}
