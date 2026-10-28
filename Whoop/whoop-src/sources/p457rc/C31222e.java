package p457rc;

import android.net.NetworkRequest;
import d13.AbstractC11478a;
import p218ic.C18389w;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rc.e */
/* JADX INFO: loaded from: classes.dex */
public final class C31222e {

    /* JADX INFO: renamed from: b */
    public static final String f128598b;

    /* JADX INFO: renamed from: a */
    public final Object f128599a;

    static {
        String strM52887f = C18389w.m52887f("NetworkRequestCompat");
        AbstractC22676k.m65749i(strM52887f, "tagWithPrefix(...)");
        f128598b = strM52887f;
    }

    public C31222e(NetworkRequest networkRequest) {
        this.f128599a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31222e) && AbstractC22676k.m65745e(this.f128599a, ((C31222e) obj).f128599a);
    }

    public final int hashCode() {
        Object obj = this.f128599a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return AbstractC11478a.m30860l(new StringBuilder("NetworkRequestCompat(wrapped="), this.f128599a, ')');
    }
}
