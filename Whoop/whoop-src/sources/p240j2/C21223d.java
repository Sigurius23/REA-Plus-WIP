package p240j2;

import io.sentry.okhttp.C20450b;

/* JADX INFO: renamed from: j2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C21223d {

    /* JADX INFO: renamed from: a */
    public static final float[] f81019a;

    /* JADX INFO: renamed from: b */
    public static final float[] f81020b;

    /* JADX INFO: renamed from: c */
    public static final C21237r f81021c;

    /* JADX INFO: renamed from: d */
    public static final C21237r f81022d;

    /* JADX INFO: renamed from: e */
    public static final C21236q f81023e;

    /* JADX INFO: renamed from: f */
    public static final C21236q f81024f;

    /* JADX INFO: renamed from: g */
    public static final C21236q f81025g;

    /* JADX INFO: renamed from: h */
    public static final C21236q f81026h;

    /* JADX INFO: renamed from: i */
    public static final C21236q f81027i;

    /* JADX INFO: renamed from: j */
    public static final C21236q f81028j;

    /* JADX INFO: renamed from: k */
    public static final C21236q f81029k;

    /* JADX INFO: renamed from: l */
    public static final C21236q f81030l;

    /* JADX INFO: renamed from: m */
    public static final C21236q f81031m;

    /* JADX INFO: renamed from: n */
    public static final C21236q f81032n;

    /* JADX INFO: renamed from: o */
    public static final C21236q f81033o;

    /* JADX INFO: renamed from: p */
    public static final C21236q f81034p;

    /* JADX INFO: renamed from: q */
    public static final C21236q f81035q;

    /* JADX INFO: renamed from: r */
    public static final C21236q f81036r;

    /* JADX INFO: renamed from: s */
    public static final C21230k f81037s;

    /* JADX INFO: renamed from: t */
    public static final C21230k f81038t;

    /* JADX INFO: renamed from: u */
    public static final C21236q f81039u;

    /* JADX INFO: renamed from: v */
    public static final C21236q f81040v;

    /* JADX INFO: renamed from: w */
    public static final C21236q f81041w;

    /* JADX INFO: renamed from: x */
    public static final C21231l f81042x;

    /* JADX INFO: renamed from: y */
    public static final AbstractC21222c[] f81043y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f81019a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f81020b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        C21237r c21237r = new C21237r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C21237r c21237r2 = new C21237r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C21237r c21237r3 = new C21237r(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f81021c = c21237r3;
        C21237r c21237r4 = new C21237r(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f81022d = c21237r4;
        C21238s c21238s = AbstractC21229j.f81055d;
        C21236q c21236q = new C21236q("sRGB IEC61966-2.1", fArr, c21238s, c21237r, 0);
        f81023e = c21236q;
        C21236q c21236q2 = new C21236q("sRGB IEC61966-2.1 (Linear)", fArr, c21238s, 1.0d, 0.0f, 1.0f, 1);
        f81024f = c21236q2;
        C21236q c21236q3 = new C21236q("scRGB-nl IEC 61966-2-2:2003", fArr, c21238s, null, new C20450b(2), new C20450b(3), -0.799f, 2.399f, c21237r, 2);
        f81025g = c21236q3;
        C21236q c21236q4 = new C21236q("scRGB IEC 61966-2-2:2003", fArr, c21238s, 1.0d, -0.5f, 7.499f, 3);
        f81026h = c21236q4;
        C21236q c21236q5 = new C21236q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c21238s, new C21237r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f81027i = c21236q5;
        C21236q c21236q6 = new C21236q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c21238s, new C21237r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f81028j = c21236q6;
        C21236q c21236q7 = new C21236q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C21238s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f81029k = c21236q7;
        C21236q c21236q8 = new C21236q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c21238s, c21237r, 7);
        f81030l = c21236q8;
        double d3 = 0.2222222222222222d;
        double d14 = 0.081d;
        double d15 = 2.2222222222222223d;
        double d16 = 0.9099181073703367d;
        double d17 = 0.09008189262966333d;
        C21236q c21236q9 = new C21236q("NTSC (1953)", fArr2, AbstractC21229j.f81052a, new C21237r(d15, d16, d17, d3, d14), 8);
        f81031m = c21236q9;
        C21236q c21236q10 = new C21236q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c21238s, new C21237r(d15, d16, d17, d3, d14), 9);
        f81032n = c21236q10;
        C21236q c21236q11 = new C21236q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c21238s, 2.2d, 0.0f, 1.0f, 10);
        f81033o = c21236q11;
        C21236q c21236q12 = new C21236q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, AbstractC21229j.f81053b, new C21237r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f81034p = c21236q12;
        C21238s c21238s2 = AbstractC21229j.f81054c;
        C21236q c21236q13 = new C21236q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, c21238s2, 1.0d, -65504.0f, 65504.0f, 12);
        f81035q = c21236q13;
        C21236q c21236q14 = new C21236q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c21238s2, 1.0d, -65504.0f, 65504.0f, 13);
        f81036r = c21236q14;
        C21230k c21230k = new C21230k(AbstractC21221b.f81012b, "Generic XYZ", 14, 1);
        f81037s = c21230k;
        long j7 = AbstractC21221b.f81013c;
        C21230k c21230k2 = new C21230k(j7, "Generic L*a*b*", 15, 0);
        f81038t = c21230k2;
        C21236q c21236q15 = new C21236q("None", fArr, c21238s, c21237r2, 16);
        f81039u = c21236q15;
        C21236q c21236q16 = new C21236q("Hybrid Log Gamma encoding", fArr3, c21238s, null, new C20450b(4), new C20450b(5), 0.0f, 1.0f, c21237r3, 17);
        f81040v = c21236q16;
        C21236q c21236q17 = new C21236q("Perceptual Quantizer encoding", fArr3, c21238s, null, new C20450b(6), new C20450b(7), 0.0f, 1.0f, c21237r4, 18);
        f81041w = c21236q17;
        C21231l c21231l = new C21231l(19, "Oklab", j7);
        f81042x = c21231l;
        f81043y = new AbstractC21222c[]{c21236q, c21236q2, c21236q3, c21236q4, c21236q5, c21236q6, c21236q7, c21236q8, c21236q9, c21236q10, c21236q11, c21236q12, c21236q13, c21236q14, c21230k, c21230k2, c21236q15, c21236q16, c21236q17, c21231l};
    }

    /* JADX INFO: renamed from: a */
    public static double m59548a(C21237r c21237r, double d3) {
        double d14 = d3 < 0.0d ? -1.0d : 1.0d;
        double d15 = d3 * d14;
        double d16 = c21237r.f81086b;
        double d17 = c21237r.f81087c;
        double d18 = c21237r.f81088d;
        double d19 = c21237r.f81089e;
        double d24 = c21237r.f81090f;
        double d25 = d16 * d15;
        return (c21237r.f81091g + 1.0d) * d14 * (d25 <= 1.0d ? Math.pow(d25, d17) : Math.exp((d15 - d24) * d18) + d19);
    }

    /* JADX INFO: renamed from: b */
    public static double m59549b(C21237r c21237r, double d3) {
        double d14 = d3 < 0.0d ? -1.0d : 1.0d;
        double d15 = 1.0d / c21237r.f81086b;
        double d16 = 1.0d / c21237r.f81087c;
        double d17 = 1.0d / c21237r.f81088d;
        double d18 = c21237r.f81089e;
        double d19 = c21237r.f81090f;
        double d24 = (d3 * d14) / (c21237r.f81091g + 1.0d);
        return d14 * (d24 <= 1.0d ? Math.pow(d24, d16) * d15 : (Math.log(d24 - d18) * d17) + d19);
    }

    /* JADX INFO: renamed from: c */
    public static double m59550c(C21237r c21237r, double d3) {
        double d14 = d3 < 0.0d ? -1.0d : 1.0d;
        double d15 = d3 * d14;
        double d16 = c21237r.f81086b;
        double d17 = c21237r.f81088d;
        double dPow = (Math.pow(d15, d17) * c21237r.f81087c) + d16;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d15, d17) * c21237r.f81090f) + c21237r.f81089e), c21237r.f81091g) * d14;
    }

    /* JADX INFO: renamed from: d */
    public static double m59551d(C21237r c21237r, double d3) {
        double d14 = d3 < 0.0d ? -1.0d : 1.0d;
        double d15 = d3 * d14;
        double d16 = -c21237r.f81086b;
        double d17 = c21237r.f81089e;
        double d18 = 1.0d / c21237r.f81091g;
        return Math.pow(Math.max((Math.pow(d15, d18) * d17) + d16, 0.0d) / ((Math.pow(d15, d18) * (-c21237r.f81090f)) + c21237r.f81087c), 1.0d / c21237r.f81088d) * d14;
    }
}
