package p543v4;

import android.graphics.Path;
import android.util.Log;
import p463rj.AbstractC31484o;

/* JADX INFO: renamed from: v4.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C35645d {

    /* JADX INFO: renamed from: a */
    public char f151454a;

    /* JADX INFO: renamed from: b */
    public final float[] f151455b;

    public C35645d(char c3, float[] fArr) {
        this.f151454a = c3;
        this.f151455b = fArr;
    }

    /* JADX INFO: renamed from: a */
    public static void m112844a(Path path, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z4, boolean z13) {
        double d3;
        double d14;
        double radians = Math.toRadians(f19);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d15 = f13;
        double d16 = f14;
        double d17 = f17;
        double d18 = ((d16 * dSin) + (d15 * dCos)) / d17;
        double d19 = f18;
        double d24 = ((d16 * dCos) + (((double) (-f13)) * dSin)) / d19;
        double d25 = f16;
        double d26 = ((d25 * dSin) + (((double) f15) * dCos)) / d17;
        double d27 = ((d25 * dCos) + (((double) (-f15)) * dSin)) / d19;
        double d28 = d18 - d26;
        double d29 = d24 - d27;
        double d32 = (d18 + d26) / 2.0d;
        double d34 = (d24 + d27) / 2.0d;
        double d35 = (d29 * d29) + (d28 * d28);
        if (d35 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d36 = (1.0d / d35) - 0.25d;
        if (d36 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d35);
            float fSqrt = (float) (Math.sqrt(d35) / 1.99999d);
            m112844a(path, f13, f14, f15, f16, f17 * fSqrt, fSqrt * f18, f19, z4, z13);
            return;
        }
        double dSqrt = Math.sqrt(d36);
        double d37 = dSqrt * d28;
        double d38 = dSqrt * d29;
        if (z4 == z13) {
            d3 = d32 - d38;
            d14 = d34 + d37;
        } else {
            d3 = d32 + d38;
            d14 = d34 - d37;
        }
        double dAtan2 = Math.atan2(d24 - d14, d18 - d3);
        double dAtan3 = Math.atan2(d27 - d14, d26 - d3) - dAtan2;
        if (z13 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d39 = d3 * d17;
        double d44 = d14 * d19;
        double d45 = (d39 * dCos) - (d44 * dSin);
        double d46 = (d44 * dCos) + (d39 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d47 = -d17;
        double d48 = d47 * dCos2;
        double d49 = d19 * dSin2;
        double d54 = (d48 * dSin3) - (d49 * dCos3);
        double d55 = d47 * dSin2;
        double d56 = d19 * dCos2;
        double d57 = dAtan3 / ((double) iCeil);
        double d58 = (dCos3 * d56) + (dSin3 * d55);
        double d59 = d15;
        double d64 = d16;
        int i13 = 0;
        double d65 = dAtan2;
        while (i13 < iCeil) {
            double d66 = d65 + d57;
            double dSin4 = Math.sin(d66);
            double dCos4 = Math.cos(d66);
            int i14 = iCeil;
            double d67 = (((d17 * dCos2) * dCos4) + d45) - (d49 * dSin4);
            double d68 = (d56 * dSin4) + (d17 * dSin2 * dCos4) + d46;
            double d69 = (d48 * dSin4) - (d49 * dCos4);
            double d74 = (dCos4 * d56) + (dSin4 * d55);
            double d75 = d66 - d65;
            double dTan = Math.tan(d75 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d75)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d54 * dSqrt2) + d59), (float) ((d58 * dSqrt2) + d64), (float) (d67 - (dSqrt2 * d69)), (float) (d68 - (dSqrt2 * d74)), (float) d67, (float) d68);
            i13++;
            d64 = d68;
            dCos2 = dCos2;
            d55 = d55;
            d65 = d66;
            d58 = d74;
            d59 = d67;
            iCeil = i14;
            d54 = d69;
            d57 = d57;
        }
    }

    public C35645d(C35645d c35645d) {
        this.f151454a = c35645d.f151454a;
        float[] fArr = c35645d.f151455b;
        this.f151455b = AbstractC31484o.m96962n(fArr, fArr.length);
    }
}
