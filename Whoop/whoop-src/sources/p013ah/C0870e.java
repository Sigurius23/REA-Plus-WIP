package p013ah;

/* JADX INFO: renamed from: ah.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C0870e extends C0876k {

    /* JADX INFO: renamed from: e */
    public final double f3163e;

    public C0870e(double d3) {
        super(EnumC0877l.f3176E);
        this.f3163e = d3;
    }

    @Override // p013ah.C0876k, p013ah.AbstractC0869d
    public final boolean equals(Object obj) {
        if (obj instanceof C0870e) {
            C0870e c0870e = (C0870e) obj;
            if (super.equals(obj) && this.f3163e == c0870e.f3163e) {
                return true;
            }
        }
        return false;
    }

    @Override // p013ah.C0876k, p013ah.AbstractC0869d
    public final int hashCode() {
        return super.hashCode() ^ Double.valueOf(this.f3163e).hashCode();
    }

    @Override // p013ah.C0876k
    public final String toString() {
        return String.valueOf(this.f3163e);
    }
}
