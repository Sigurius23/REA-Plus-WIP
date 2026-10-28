package gt;

/* JADX INFO: renamed from: gt.i */
/* JADX INFO: loaded from: classes.dex */
public final class C16170i {

    /* JADX INFO: renamed from: a */
    public final C16177p f61449a;

    /* JADX INFO: renamed from: b */
    public final boolean f61450b;

    public C16170i(C16177p c16177p, boolean z4) {
        this.f61449a = c16177p;
        this.f61450b = z4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16170i) {
            C16170i c16170i = (C16170i) obj;
            if (c16170i.f61449a.equals(this.f61449a) && c16170i.f61450b == this.f61450b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f61449a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f61450b).hashCode();
    }
}
