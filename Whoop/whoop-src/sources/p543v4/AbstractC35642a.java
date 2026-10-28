package p543v4;

import android.graphics.Color;

/* JADX INFO: renamed from: v4.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC35642a {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f151447a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static int m112832a(double d3, double d14, double d15) {
        double d16 = (((-0.4986d) * d15) + (((-1.5372d) * d14) + (3.2406d * d3))) / 100.0d;
        double d17 = ((0.0415d * d15) + ((1.8758d * d14) + ((-0.9689d) * d3))) / 100.0d;
        double d18 = ((1.057d * d15) + (((-0.204d) * d14) + (0.0557d * d3))) / 100.0d;
        double dPow = d16 > 0.0031308d ? (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d : d16 * 12.92d;
        double dPow2 = d17 > 0.0031308d ? (Math.pow(d17, 0.4166666666666667d) * 1.055d) - 0.055d : d17 * 12.92d;
        double dPow3 = d18 > 0.0031308d ? (Math.pow(d18, 0.4166666666666667d) * 1.055d) - 0.055d : d18 * 12.92d;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    /* JADX INFO: renamed from: b */
    public static int m112833b(float f13, int i13, int i14) {
        float f14 = 1.0f - f13;
        return Color.argb((int) ((Color.alpha(i14) * f13) + (Color.alpha(i13) * f14)), (int) ((Color.red(i14) * f13) + (Color.red(i13) * f14)), (int) ((Color.green(i14) * f13) + (Color.green(i13) * f14)), (int) ((Color.blue(i14) * f13) + (Color.blue(i13) * f14)));
    }

    /* JADX INFO: renamed from: c */
    public static double m112834c(int i13, int i14) {
        if (Color.alpha(i14) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i14));
        }
        if (Color.alpha(i13) < 255) {
            i13 = m112836e(i13, i14);
        }
        double dM112835d = m112835d(i13) + 0.05d;
        double dM112835d2 = m112835d(i14) + 0.05d;
        return Math.max(dM112835d, dM112835d2) / Math.min(dM112835d, dM112835d2);
    }

    /* JADX INFO: renamed from: d */
    public static double m112835d(int i13) {
        ThreadLocal threadLocal = f151447a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i13);
        int iGreen = Color.green(i13);
        int iBlue = Color.blue(i13);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d3 = ((double) iRed) / 255.0d;
        double dPow = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d14 = ((double) iGreen) / 255.0d;
        double dPow2 = d14 < 0.04045d ? d14 / 12.92d : Math.pow((d14 + 0.055d) / 1.055d, 2.4d);
        double d15 = ((double) iBlue) / 255.0d;
        double dPow3 = d15 < 0.04045d ? d15 / 12.92d : Math.pow((d15 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d16 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d16;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d16 / 100.0d;
    }

    /* JADX INFO: renamed from: e */
    public static int m112836e(int i13, int i14) {
        int iAlpha = Color.alpha(i14);
        int iAlpha2 = Color.alpha(i13);
        int i15 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i15, m112837f(Color.red(i13), iAlpha2, Color.red(i14), iAlpha, i15), m112837f(Color.green(i13), iAlpha2, Color.green(i14), iAlpha, i15), m112837f(Color.blue(i13), iAlpha2, Color.blue(i14), iAlpha, i15));
    }

    /* JADX INFO: renamed from: f */
    public static int m112837f(int i13, int i14, int i15, int i16, int i17) {
        if (i17 == 0) {
            return 0;
        }
        return (((255 - i14) * (i15 * i16)) + ((i13 * 255) * i14)) / (i17 * 255);
    }

    /* JADX INFO: renamed from: g */
    public static int m112838g(int i13, int i14) {
        if (i14 < 0 || i14 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i13 & 16777215) | (i14 << 24);
    }
}
