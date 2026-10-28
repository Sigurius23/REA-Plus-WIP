package p294l3;

import j93.AbstractC21478l0;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: l3.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23283u0 {

    /* JADX INFO: renamed from: b */
    public static final long f92251b = AbstractC21478l0.m60431f(0, 0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f92252c = 0;

    /* JADX INFO: renamed from: a */
    public final long f92253a;

    public /* synthetic */ C23283u0(long j7) {
        this.f92253a = j7;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m67355a(long j7, Object obj) {
        return (obj instanceof C23283u0) && j7 == ((C23283u0) obj).f92253a;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m67356b(long j7, long j13) {
        return j7 == j13;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m67357c(long j7) {
        return ((int) (j7 >> 32)) == ((int) (j7 & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static final int m67358d(long j7) {
        return m67359e(j7) - m67360f(j7);
    }

    /* JADX INFO: renamed from: e */
    public static final int m67359e(long j7) {
        return Math.max((int) (j7 >> 32), (int) (j7 & 4294967295L));
    }

    /* JADX INFO: renamed from: f */
    public static final int m67360f(long j7) {
        return Math.min((int) (j7 >> 32), (int) (j7 & 4294967295L));
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m67361g(long j7) {
        return ((int) (j7 >> 32)) > ((int) (j7 & 4294967295L));
    }

    /* JADX INFO: renamed from: h */
    public static String m67362h(long j7) {
        StringBuilder sb4 = new StringBuilder("TextRange(");
        sb4.append((int) (j7 >> 32));
        sb4.append(", ");
        return AbstractC11895b.m31999r(sb4, (int) (j7 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return m67355a(this.f92253a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f92253a);
    }

    public final String toString() {
        return m67362h(this.f92253a);
    }
}
