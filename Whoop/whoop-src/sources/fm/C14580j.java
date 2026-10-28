package fm;

/* JADX INFO: renamed from: fm.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C14580j extends AbstractC14587q {

    /* JADX INFO: renamed from: a */
    public final C14578h f53644a;

    public C14580j(C14578h c14578h) {
        this.f53644a = c14578h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC14587q)) {
            return false;
        }
        AbstractC14587q abstractC14587q = (AbstractC14587q) obj;
        Object obj2 = EnumC14586p.f53661w;
        if (obj2.equals(obj2)) {
            return this.f53644a.equals(((C14580j) abstractC14587q).f53644a);
        }
        return false;
    }

    public final int hashCode() {
        return ((EnumC14586p.f53661w.hashCode() ^ 1000003) * 1000003) ^ this.f53644a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + EnumC14586p.f53661w + ", androidClientInfo=" + this.f53644a + "}";
    }
}
