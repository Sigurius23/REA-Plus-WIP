package p353o0;

/* JADX INFO: renamed from: o0.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C27319c {

    /* JADX INFO: renamed from: a */
    public final long f109387a;

    public final boolean equals(Object obj) {
        if (obj instanceof C27319c) {
            return this.f109387a == ((C27319c) obj).f109387a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f109387a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f109387a + ')';
    }
}
