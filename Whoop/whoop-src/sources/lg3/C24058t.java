package lg3;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: lg3.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C24058t {

    /* JADX INFO: renamed from: a */
    public static final C24058t f95077a = new C24058t();

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C24058t);
    }

    public final int hashCode() {
        return 182;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
