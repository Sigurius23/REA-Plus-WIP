package p695zx;

import java.util.List;

/* JADX INFO: renamed from: zx.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C41182d implements InterfaceC41183e {

    /* JADX INFO: renamed from: a */
    public final Object f177692a;

    /* JADX INFO: renamed from: b */
    public final List f177693b;

    public C41182d(List list, List list2) {
        this.f177692a = list;
        this.f177693b = list2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // p695zx.InterfaceC41183e
    /* JADX INFO: renamed from: a */
    public final List mo133829a() {
        return this.f177692a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41182d)) {
            return false;
        }
        C41182d c41182d = (C41182d) obj;
        return this.f177692a.equals(c41182d.f177692a) && this.f177693b.equals(c41182d.f177693b);
    }

    public final int hashCode() {
        return this.f177693b.hashCode() + (this.f177692a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(ranges=" + this.f177692a + ", unfilteredRanges=" + this.f177693b + ")";
    }
}
