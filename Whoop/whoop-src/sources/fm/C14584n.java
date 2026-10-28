package fm;

/* JADX INFO: renamed from: fm.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C14584n extends AbstractC14592v {

    /* JADX INFO: renamed from: a */
    public final EnumC14591u f53659a;

    /* JADX INFO: renamed from: b */
    public final EnumC14590t f53660b;

    public C14584n(EnumC14591u enumC14591u, EnumC14590t enumC14590t) {
        this.f53659a = enumC14591u;
        this.f53660b = enumC14590t;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC14592v) {
            AbstractC14592v abstractC14592v = (AbstractC14592v) obj;
            EnumC14591u enumC14591u = this.f53659a;
            if (enumC14591u != null ? enumC14591u.equals(((C14584n) abstractC14592v).f53659a) : ((C14584n) abstractC14592v).f53659a == null) {
                EnumC14590t enumC14590t = this.f53660b;
                if (enumC14590t != null ? enumC14590t.equals(((C14584n) abstractC14592v).f53660b) : ((C14584n) abstractC14592v).f53660b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC14591u enumC14591u = this.f53659a;
        int iHashCode = ((enumC14591u == null ? 0 : enumC14591u.hashCode()) ^ 1000003) * 1000003;
        EnumC14590t enumC14590t = this.f53660b;
        return (enumC14590t != null ? enumC14590t.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f53659a + ", mobileSubtype=" + this.f53660b + "}";
    }
}
