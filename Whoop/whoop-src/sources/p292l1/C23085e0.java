package p292l1;

import java.util.LinkedHashMap;
import java.util.Locale;
import p316m1.AbstractC24899e0;

/* JADX INFO: renamed from: l1.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23085e0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f91100a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final String m67055a(Long l7, Locale locale, boolean z4) {
        if (l7 == null) {
            return null;
        }
        return AbstractC24899e0.m72999f(l7.longValue(), z4 ? "yMMMMEEEEd" : "yMMMd", locale, this.f91100a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof C23085e0;
    }

    public final int hashCode() {
        return 436998964;
    }
}
