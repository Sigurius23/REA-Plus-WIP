package re;

import aa3.C0656u0;
import java.util.ArrayList;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: re.d1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31264d1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f128777a;

    public C31264d1(C0656u0 c0656u0) {
        this.f128777a = c0656u0.f2286a;
    }

    /* JADX INFO: renamed from: a */
    public final List m96288a() {
        return this.f128777a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C31264d1.class == obj.getClass() && AbstractC22676k.m65745e(this.f128777a, ((C31264d1) obj).f128777a);
    }

    public final int hashCode() {
        ArrayList arrayList = this.f128777a;
        if (arrayList != null) {
            return arrayList.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("UpdateUserAttributesResponse(");
        sb4.append("codeDeliveryDetailsList=" + this.f128777a);
        sb4.append(")");
        return sb4.toString();
    }
}
