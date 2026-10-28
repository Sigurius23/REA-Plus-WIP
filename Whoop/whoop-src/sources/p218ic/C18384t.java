package p218ic;

/* JADX INFO: renamed from: ic.t */
/* JADX INFO: loaded from: classes.dex */
public final class C18384t extends AbstractC18386u {

    /* JADX INFO: renamed from: a */
    public final C18358g f71552a;

    public C18384t(C18358g c18358g) {
        this.f71552a = c18358g;
    }

    @Override // p218ic.AbstractC18386u
    /* JADX INFO: renamed from: a */
    public final C18358g mo52883a() {
        return this.f71552a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18384t.class != obj.getClass()) {
            return false;
        }
        return this.f71552a.equals(((C18384t) obj).f71552a);
    }

    public final int hashCode() {
        return this.f71552a.hashCode() + (C18384t.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f71552a + '}';
    }
}
