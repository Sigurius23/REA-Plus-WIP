package kg3;

import com.squareup.wire.AbstractC5583n;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import ng3.AbstractC26703p;
import ng3.EnumC26688a;
import ng3.InterfaceC26698k;
import org.threeten.p379bp.DateTimeException;

/* JADX INFO: renamed from: kg3.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC22465d implements Comparable {
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        try {
            Locale.class.getMethod("getUnicodeLocaleType", String.class);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC22465d m64906a(InterfaceC26698k interfaceC26698k) {
        AbstractC5583n.m16762V(interfaceC26698k, "temporal");
        AbstractC22465d abstractC22465d = (AbstractC22465d) interfaceC26698k.mo14019g(AbstractC26703p.f106195b);
        return abstractC22465d != null ? abstractC22465d : C22466e.f88015w;
    }

    /* JADX INFO: renamed from: b */
    public static void m64907b(HashMap map, EnumC26688a enumC26688a, long j7) {
        Long l7 = (Long) map.get(enumC26688a);
        if (l7 == null || l7.longValue() == j7) {
            map.put(enumC26688a, Long.valueOf(j7));
            return;
        }
        throw new DateTimeException("Invalid state, field: " + enumC26688a + " " + l7 + " conflicts with " + enumC26688a + " " + j7);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((AbstractC22465d) obj).getClass();
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof AbstractC22465d);
    }

    public final int hashCode() {
        return getClass().hashCode() ^ 72805;
    }

    public final String toString() {
        return "ISO";
    }
}
