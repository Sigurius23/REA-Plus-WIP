package p114eb;

import android.os.Bundle;
import java.util.Collection;
import java.util.Set;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eb.g */
/* JADX INFO: loaded from: classes.dex */
public final class C12956g {

    /* JADX INFO: renamed from: a */
    public final int f44752a;

    /* JADX INFO: renamed from: b */
    public C12997x0 f44753b = null;

    /* JADX INFO: renamed from: c */
    public Bundle f44754c = null;

    public C12956g(int i13) {
        this.f44752a = i13;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C12956g)) {
            C12956g c12956g = (C12956g) obj;
            if (this.f44752a == c12956g.f44752a && AbstractC22676k.m65745e(this.f44753b, c12956g.f44753b)) {
                if (!AbstractC22676k.m65745e(this.f44754c, c12956g.f44754c)) {
                    Bundle bundle = this.f44754c;
                    if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                        Set<String> set = setKeySet;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            for (String str : set) {
                                Bundle bundle2 = this.f44754c;
                                Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                                Bundle bundle3 = c12956g.f44754c;
                                if (!AbstractC22676k.m65745e(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = Integer.hashCode(this.f44752a) * 31;
        C12997x0 c12997x0 = this.f44753b;
        int iHashCode2 = iHashCode + (c12997x0 != null ? c12997x0.hashCode() : 0);
        Bundle bundle = this.f44754c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : setKeySet) {
                int i13 = iHashCode2 * 31;
                Bundle bundle2 = this.f44754c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                iHashCode2 = i13 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return iHashCode2;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C12956g.class.getSimpleName());
        sb4.append("(0x");
        sb4.append(Integer.toHexString(this.f44752a));
        sb4.append(")");
        if (this.f44753b != null) {
            sb4.append(" navOptions=");
            sb4.append(this.f44753b);
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "sb.toString()");
        return string;
    }
}
