package p010a9;

/* JADX INFO: renamed from: a9.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC0576a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f2051w;

    /* JADX INFO: renamed from: x */
    public int f2052x;

    /* JADX INFO: renamed from: c */
    public static String m1492c(int i13) {
        StringBuilder sb4 = new StringBuilder(4);
        sb4.append((char) ((i13 >> 24) & 255));
        sb4.append((char) ((i13 >> 16) & 255));
        sb4.append((char) ((i13 >> 8) & 255));
        sb4.append((char) (i13 & 255));
        return sb4.toString();
    }

    /* JADX INFO: renamed from: e */
    public static String m1493e(int i13) {
        return "" + ((char) ((i13 >> 24) & 255)) + ((char) ((i13 >> 16) & 255)) + ((char) ((i13 >> 8) & 255)) + ((char) (i13 & 255));
    }

    /* JADX INFO: renamed from: n */
    public static int m1494n(int i13) {
        return (i13 >> 24) & 255;
    }

    /* JADX INFO: renamed from: a */
    public void m1495a(int i13) {
        switch (this.f2051w) {
            case 0:
                this.f2052x = i13 | this.f2052x;
                break;
            default:
                this.f2052x = i13 | this.f2052x;
                break;
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m1496f(int i13) {
        switch (this.f2051w) {
            case 0:
                return (this.f2052x & i13) == i13;
            default:
                return (this.f2052x & i13) == i13;
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo1497g();

    /* JADX INFO: renamed from: i */
    public abstract int mo1498i();

    /* JADX INFO: renamed from: k */
    public abstract int mo1499k();

    /* JADX INFO: renamed from: l */
    public abstract int mo1500l();

    /* JADX INFO: renamed from: m */
    public abstract int mo1501m();

    public String toString() {
        switch (this.f2051w) {
            case 1:
                return m1492c(this.f2052x);
            case 4:
                return m1493e(this.f2052x);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ AbstractC0576a(int i13, int i14) {
        this.f2051w = i14;
        this.f2052x = i13;
    }
}
