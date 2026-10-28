package p390p1;

/* JADX INFO: renamed from: p1.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C28628j0 implements InterfaceC28682w2 {

    /* JADX INFO: renamed from: a */
    public final C28633k1 f115811a;

    public C28628j0(C28633k1 c28633k1) {
        this.f115811a = c28633k1;
    }

    @Override // p390p1.InterfaceC28682w2
    /* JADX INFO: renamed from: a */
    public final Object mo86979a(InterfaceC28653p1 interfaceC28653p1) {
        return this.f115811a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28628j0) && this.f115811a.equals(((C28628j0) obj).f115811a);
    }

    public final int hashCode() {
        return this.f115811a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f115811a + ')';
    }
}
