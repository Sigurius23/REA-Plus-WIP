package al;

/* JADX INFO: renamed from: al.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C0956c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3537a;

    /* JADX INFO: renamed from: a */
    public final int m2435a(Object obj) {
        switch (this.f3537a) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m2436b() {
        switch (this.f3537a) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m2437c() {
        switch (this.f3537a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m2438d(int i13) {
        switch (this.f3537a) {
            case 0:
                return new byte[i13];
            default:
                return new int[i13];
        }
    }
}
