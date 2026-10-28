package sn;

/* JADX INFO: renamed from: sn.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C32763v extends C32759t {
    public C32763v(Object obj) {
        super(-1, -1, -1, -1L, obj);
    }

    /* JADX INFO: renamed from: b */
    public final C32763v m102755b(Object obj) {
        C32759t c32759t;
        if (this.f136238a.equals(obj)) {
            c32759t = this;
        } else {
            long j7 = this.f136241d;
            c32759t = new C32759t(this.f136239b, this.f136240c, this.f136242e, j7, obj);
        }
        return new C32763v(c32759t);
    }

    public C32763v(Object obj, long j7, int i13) {
        super(-1, -1, i13, j7, obj);
    }
}
