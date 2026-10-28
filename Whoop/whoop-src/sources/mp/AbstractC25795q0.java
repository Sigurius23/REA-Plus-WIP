package mp;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: renamed from: mp.q0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC25795q0 {

    /* JADX INFO: renamed from: a */
    public static final Comparator f101528a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(AbstractC25795q0.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = EnumC25793p0.f101525w;
        }
        f101528a = comparator;
    }
}
