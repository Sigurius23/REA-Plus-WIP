package p695zx;

import java.util.List;

/* JADX INFO: renamed from: zx.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C41180b {

    /* JADX INFO: renamed from: a */
    public final Object f177689a;

    /* JADX INFO: renamed from: b */
    public final List f177690b;

    public C41180b(List list, List list2) {
        this.f177689a = list;
        this.f177690b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41180b)) {
            return false;
        }
        C41180b c41180b = (C41180b) obj;
        return this.f177689a.equals(c41180b.f177689a) && this.f177690b.equals(c41180b.f177690b);
    }

    public final int hashCode() {
        return this.f177690b.hashCode() + (this.f177689a.hashCode() * 31);
    }

    public final String toString() {
        return "AccountRangesResult(accountRanges=" + this.f177689a + ", unfilteredAccountRanges=" + this.f177690b + ")";
    }
}
