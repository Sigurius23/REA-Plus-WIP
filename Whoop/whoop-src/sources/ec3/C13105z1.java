package ec3;

/* JADX INFO: renamed from: ec3.z1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13105z1 {

    /* JADX INFO: renamed from: a */
    public static final C13021b2 f45288a = new C13021b2(0);

    /* JADX INFO: renamed from: b */
    public static final C13021b2 f45289b = new C13021b2(1);

    /* JADX INFO: renamed from: a */
    public static C13033e2 m36630a(int i13, long j7) {
        if ((i13 & 1) != 0) {
            j7 = 0;
        }
        return new C13033e2(j7, (i13 & 2) != 0 ? Long.MAX_VALUE : 0L);
    }
}
