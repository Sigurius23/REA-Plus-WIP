package p013ah;

/* JADX INFO: renamed from: ah.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C0879n extends AbstractC0868c {

    /* JADX INFO: renamed from: d */
    public final String f3185d;

    public C0879n(String str) {
        super(5);
        this.f3185d = str;
    }

    @Override // p013ah.AbstractC0868c, p013ah.AbstractC0869d
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0879n) || !super.equals(obj)) {
            return false;
        }
        String str = ((C0879n) obj).f3185d;
        String str2 = this.f3185d;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    @Override // p013ah.AbstractC0868c, p013ah.AbstractC0869d
    public final int hashCode() {
        String str = this.f3185d;
        if (str == null) {
            return 0;
        }
        return str.hashCode() + super.hashCode();
    }

    public final String toString() {
        String str = this.f3185d;
        return str == null ? "null" : str;
    }
}
