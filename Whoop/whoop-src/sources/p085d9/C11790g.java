package p085d9;

/* JADX INFO: renamed from: d9.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C11790g {

    /* JADX INFO: renamed from: d */
    public static final C11790g f38233d = new C11789f().m31608a();

    /* JADX INFO: renamed from: a */
    public final boolean f38234a;

    /* JADX INFO: renamed from: b */
    public final boolean f38235b;

    /* JADX INFO: renamed from: c */
    public final boolean f38236c;

    public C11790g(C11789f c11789f) {
        this.f38234a = c11789f.f38230a;
        this.f38235b = c11789f.f38231b;
        this.f38236c = c11789f.f38232c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11790g.class != obj.getClass()) {
            return false;
        }
        C11790g c11790g = (C11790g) obj;
        return this.f38234a == c11790g.f38234a && this.f38235b == c11790g.f38235b && this.f38236c == c11790g.f38236c;
    }

    public final int hashCode() {
        return ((this.f38234a ? 1 : 0) << 2) + ((this.f38235b ? 1 : 0) << 1) + (this.f38236c ? 1 : 0);
    }
}
