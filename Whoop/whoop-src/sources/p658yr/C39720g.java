package p658yr;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: yr.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C39720g implements InterfaceC39719f, Serializable {

    /* JADX INFO: renamed from: w */
    public final List f170960w;

    public C39720g(List list) {
        this.f170960w = list;
    }

    @Override // p658yr.InterfaceC39719f
    public final boolean apply(Object obj) {
        int i13 = 0;
        while (true) {
            List list = this.f170960w;
            if (i13 >= list.size()) {
                return true;
            }
            if (!((InterfaceC39719f) list.get(i13)).apply(obj)) {
                return false;
            }
            i13++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C39720g) {
            return this.f170960w.equals(((C39720g) obj).f170960w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f170960w.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Predicates.and(");
        boolean z4 = true;
        for (Object obj : this.f170960w) {
            if (!z4) {
                sb4.append(DateTimeRange.lowerUpperDelimiter);
            }
            sb4.append(obj);
            z4 = false;
        }
        sb4.append(')');
        return sb4.toString();
    }
}
