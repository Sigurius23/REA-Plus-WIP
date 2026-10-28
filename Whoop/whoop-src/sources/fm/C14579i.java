package fm;

import java.util.ArrayList;

/* JADX INFO: renamed from: fm.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C14579i extends AbstractC14585o {

    /* JADX INFO: renamed from: a */
    public final ArrayList f53643a;

    public C14579i(ArrayList arrayList) {
        this.f53643a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC14585o)) {
            return false;
        }
        return this.f53643a.equals(((C14579i) ((AbstractC14585o) obj)).f53643a);
    }

    public final int hashCode() {
        return this.f53643a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f53643a + "}";
    }
}
