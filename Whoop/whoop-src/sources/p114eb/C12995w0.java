package p114eb;

/* JADX INFO: renamed from: eb.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12995w0 {

    /* JADX INFO: renamed from: a */
    public boolean f44891a;

    /* JADX INFO: renamed from: b */
    public boolean f44892b;

    /* JADX INFO: renamed from: d */
    public String f44894d;

    /* JADX INFO: renamed from: e */
    public boolean f44895e;

    /* JADX INFO: renamed from: f */
    public boolean f44896f;

    /* JADX INFO: renamed from: c */
    public int f44893c = -1;

    /* JADX INFO: renamed from: g */
    public int f44897g = -1;

    /* JADX INFO: renamed from: h */
    public int f44898h = -1;

    /* JADX INFO: renamed from: i */
    public int f44899i = -1;

    /* JADX INFO: renamed from: j */
    public int f44900j = -1;

    /* JADX INFO: renamed from: b */
    public static void m36507b(C12995w0 c12995w0, int i13, boolean z4) {
        c12995w0.f44893c = i13;
        c12995w0.f44894d = null;
        c12995w0.f44895e = z4;
        c12995w0.f44896f = false;
    }

    /* JADX INFO: renamed from: a */
    public final C12997x0 m36508a() {
        String str = this.f44894d;
        if (str == null) {
            return new C12997x0(this.f44891a, this.f44892b, this.f44893c, this.f44895e, this.f44896f, this.f44897g, this.f44898h, this.f44899i, this.f44900j);
        }
        boolean z4 = this.f44891a;
        boolean z13 = this.f44892b;
        boolean z14 = this.f44895e;
        boolean z15 = this.f44896f;
        int i13 = this.f44897g;
        int i14 = this.f44898h;
        int i15 = this.f44899i;
        int i16 = this.f44900j;
        int i17 = C12977n0.f44815K;
        C12997x0 c12997x0 = new C12997x0(z4, z13, "android-app://androidx.navigation/".concat(str).hashCode(), z14, z15, i13, i14, i15, i16);
        c12997x0.f44912j = str;
        return c12997x0;
    }
}
