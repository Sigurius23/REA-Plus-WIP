package ss;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: ss.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C32945a {

    /* JADX INFO: renamed from: b */
    public static final C32945a f137237b = new C32945a(Collections.unmodifiableMap(new HashMap()));

    /* JADX INFO: renamed from: a */
    public final Map f137238a;

    public C32945a(Map map) {
        this.f137238a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C32945a) {
            return this.f137238a.equals(((C32945a) obj).f137238a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f137238a.hashCode();
    }

    public final String toString() {
        return this.f137238a.toString();
    }
}
