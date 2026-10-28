package p516u8;

/* JADX INFO: renamed from: u8.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34593g0 {

    /* JADX INFO: renamed from: a */
    public final C34606n f145665a;

    public C34593g0(C34606n c34606n) {
        this.f145665a = c34606n;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m109390a(int... iArr) {
        for (int i13 : iArr) {
            if (this.f145665a.f145698a.get(i13)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34593g0) {
            return this.f145665a.equals(((C34593g0) obj).f145665a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f145665a.hashCode();
    }
}
