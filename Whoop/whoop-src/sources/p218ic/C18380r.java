package p218ic;

/* JADX INFO: renamed from: ic.r */
/* JADX INFO: loaded from: classes.dex */
public final class C18380r extends AbstractC18386u {

    /* JADX INFO: renamed from: a */
    public final C18358g f71546a;

    public C18380r(C18358g c18358g) {
        this.f71546a = c18358g;
    }

    @Override // p218ic.AbstractC18386u
    /* JADX INFO: renamed from: a */
    public final C18358g mo52883a() {
        return this.f71546a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18380r.class != obj.getClass()) {
            return false;
        }
        return this.f71546a.equals(((C18380r) obj).f71546a);
    }

    public final int hashCode() {
        return this.f71546a.hashCode() + (C18380r.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f71546a + '}';
    }

    public C18380r() {
        this(C18358g.f71479b);
    }
}
