package l53;

import java.util.List;
import p005a3.C0271z0;

/* JADX INFO: renamed from: l53.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C23371l {

    /* JADX INFO: renamed from: a */
    public final List f92649a;

    /* JADX INFO: renamed from: b */
    public final C0271z0 f92650b;

    public C23371l(List list, C0271z0 c0271z0) {
        this.f92649a = list;
        this.f92650b = c0271z0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23371l)) {
            return false;
        }
        C23371l c23371l = (C23371l) obj;
        return this.f92649a.equals(c23371l.f92649a) && this.f92650b.equals(c23371l.f92650b);
    }

    public final int hashCode() {
        return this.f92650b.hashCode() + (this.f92649a.hashCode() * 31);
    }

    public final String toString() {
        return "TraceSlice(snapshot=" + this.f92649a + ", rollback=" + this.f92650b + ")";
    }
}
