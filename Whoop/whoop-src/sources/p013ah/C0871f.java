package p013ah;

/* JADX INFO: renamed from: ah.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C0871f extends C0876k {

    /* JADX INFO: renamed from: e */
    public final float f3164e;

    public C0871f(EnumC0877l enumC0877l, float f13) {
        super(enumC0877l);
        this.f3164e = f13;
    }

    @Override // p013ah.C0876k, p013ah.AbstractC0869d
    public final boolean equals(Object obj) {
        if (obj instanceof C0871f) {
            C0871f c0871f = (C0871f) obj;
            if (super.equals(obj) && this.f3164e == c0871f.f3164e) {
                return true;
            }
        }
        return false;
    }

    @Override // p013ah.C0876k, p013ah.AbstractC0869d
    public final int hashCode() {
        return super.hashCode() ^ Float.valueOf(this.f3164e).hashCode();
    }
}
