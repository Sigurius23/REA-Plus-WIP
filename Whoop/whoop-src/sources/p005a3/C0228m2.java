package p005a3;

/* JADX INFO: renamed from: a3.m2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0228m2 {
    /* JADX INFO: renamed from: a */
    public static final int m566a(int i13, long j7) {
        int i14 = AbstractC0232n2.f802b;
        return ((int) (j7 >> (i13 * 15))) & 32767;
    }

    /* JADX INFO: renamed from: b */
    public static long m567b() {
        return AbstractC0232n2.f801a;
    }

    /* JADX INFO: renamed from: c */
    public static long m568c(int i13, int i14, int i15, int i16) {
        return (((long) (i14 & 32767)) << 15) | ((long) (i13 & 32767)) | (((long) (i15 & 32767)) << 30) | (((long) (i16 & 32767)) << 45) | Long.MIN_VALUE;
    }
}
