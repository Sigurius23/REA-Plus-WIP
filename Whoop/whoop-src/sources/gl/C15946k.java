package gl;

import p586wk.C37329g;

/* JADX INFO: renamed from: gl.k */
/* JADX INFO: loaded from: classes.dex */
public final class C15946k {

    /* JADX INFO: renamed from: b */
    public static final C15946k f60354b = new C15946k(2);

    /* JADX INFO: renamed from: c */
    public static final C15946k f60355c = new C15946k(0);

    /* JADX INFO: renamed from: d */
    public static final C15946k f60356d;

    /* JADX INFO: renamed from: e */
    public static final C15946k f60357e;

    /* JADX INFO: renamed from: f */
    public static final C15946k f60358f;

    /* JADX INFO: renamed from: g */
    public static final C37329g f60359g;

    /* JADX INFO: renamed from: h */
    public static final boolean f60360h;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60361a;

    static {
        C15946k c15946k = new C15946k(1);
        f60356d = c15946k;
        f60357e = new C15946k(3);
        f60358f = c15946k;
        f60359g = C37329g.m119568a(c15946k, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f60360h = true;
    }

    public /* synthetic */ C15946k(int i13) {
        this.f60361a = i13;
    }

    /* JADX INFO: renamed from: a */
    public final int m45009a(int i13, int i14, int i15, int i16) {
        switch (this.f60361a) {
            case 0:
                if (m45010b(i13, i14, i15, i16) == 1.0f) {
                    return 2;
                }
                return f60354b.m45009a(i13, i14, i15, i16);
            case 1:
                return 2;
            case 2:
                return f60360h ? 2 : 1;
            default:
                return 2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m45010b(int i13, int i14, int i15, int i16) {
        switch (this.f60361a) {
            case 0:
                return Math.min(1.0f, f60354b.m45010b(i13, i14, i15, i16));
            case 1:
                return Math.max(i15 / i13, i16 / i14);
            case 2:
                if (f60360h) {
                    return Math.min(i15 / i13, i16 / i14);
                }
                int iMax = Math.max(i14 / i16, i13 / i15);
                if (iMax == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(iMax);
            default:
                return 1.0f;
        }
    }
}
