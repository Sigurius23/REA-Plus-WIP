package p636y3;

/* JADX INFO: renamed from: y3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C39174f implements Comparable {

    /* JADX INFO: renamed from: w */
    public final float f168413w;

    public /* synthetic */ C39174f(float f13) {
        this.f168413w = f13;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C39174f m124781a(float f13) {
        return new C39174f(f13);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m124782b(float f13, float f14) {
        return Float.compare(f13, f14) == 0;
    }

    /* JADX INFO: renamed from: c */
    public static String m124783c(float f13) {
        if (Float.isNaN(f13)) {
            return "Dp.Unspecified";
        }
        return f13 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f168413w, ((C39174f) obj).f168413w);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C39174f) {
            return Float.compare(this.f168413w, ((C39174f) obj).f168413w) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f168413w);
    }

    public final String toString() {
        return m124783c(this.f168413w);
    }
}
