package p513u4;

import android.graphics.Color;
import p543v4.AbstractC35642a;

/* JADX INFO: renamed from: u4.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C34513a {

    /* JADX INFO: renamed from: a */
    public final float f145086a;

    /* JADX INFO: renamed from: b */
    public final float f145087b;

    /* JADX INFO: renamed from: c */
    public final float f145088c;

    /* JADX INFO: renamed from: d */
    public final float f145089d;

    /* JADX INFO: renamed from: e */
    public final float f145090e;

    /* JADX INFO: renamed from: f */
    public final float f145091f;

    public C34513a(float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f145086a = f13;
        this.f145087b = f14;
        this.f145088c = f15;
        this.f145089d = f16;
        this.f145090e = f17;
        this.f145091f = f18;
    }

    /* JADX INFO: renamed from: a */
    public static C34513a m109064a(int i13) {
        C34524l c34524l = C34524l.f145120k;
        float fM109073i = AbstractC34514b.m109073i(Color.red(i13));
        float fM109073i2 = AbstractC34514b.m109073i(Color.green(i13));
        float fM109073i3 = AbstractC34514b.m109073i(Color.blue(i13));
        float[][] fArr = AbstractC34514b.f145095d;
        float[] fArr2 = fArr[0];
        float f13 = (fArr2[2] * fM109073i3) + (fArr2[1] * fM109073i2) + (fArr2[0] * fM109073i);
        float[] fArr3 = fArr[1];
        float f14 = (fArr3[2] * fM109073i3) + (fArr3[1] * fM109073i2) + (fArr3[0] * fM109073i);
        float[] fArr4 = fArr[2];
        float f15 = (fM109073i3 * fArr4[2]) + (fM109073i2 * fArr4[1]) + (fM109073i * fArr4[0]);
        float[][] fArr5 = AbstractC34514b.f145092a;
        float[] fArr6 = fArr5[0];
        float f16 = (fArr6[2] * f15) + (fArr6[1] * f14) + (fArr6[0] * f13);
        float[] fArr7 = fArr5[1];
        float f17 = (fArr7[2] * f15) + (fArr7[1] * f14) + (fArr7[0] * f13);
        float[] fArr8 = fArr5[2];
        float f18 = (f15 * fArr8[2]) + (f14 * fArr8[1]) + (f13 * fArr8[0]);
        float[] fArr9 = c34524l.f145127g;
        float f19 = c34524l.f145129i;
        float f24 = c34524l.f145124d;
        float f25 = c34524l.f145121a;
        float f26 = fArr9[0] * f16;
        float f27 = fArr9[1] * f17;
        float f28 = fArr9[2] * f18;
        float f29 = c34524l.f145128h;
        float fPow = (float) Math.pow(((double) (Math.abs(f26) * f29)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f27) * f29)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f28) * f29)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f26) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f27) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f28) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d3 = fSignum3;
        float f34 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d3)) / 11.0f;
        float f35 = ((float) (((double) (fSignum + fSignum2)) - (d3 * 2.0d))) / 9.0f;
        float f36 = fSignum2 * 20.0f;
        float f37 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f36)) / 20.0f;
        float f38 = (((fSignum * 40.0f) + f36) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f35, f34)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f39 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f38 * c34524l.f145122b) / f25, c34524l.f145130j * f24)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f43 = f25 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c34524l.f145126f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c34524l.f145125e) * c34524l.f145123c) * ((float) Math.sqrt((f35 * f35) + (f34 * f34)))) / (f37 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((fPow5 * f24) / f43);
        float f44 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f19 * fSqrt * 0.0228f) + 1.0f)) * 43.85965f;
        double d14 = f39;
        return new C34513a(fAtan2, fSqrt, fPow4, f44, fLog * ((float) Math.cos(d14)), fLog * ((float) Math.sin(d14)));
    }

    /* JADX INFO: renamed from: b */
    public static C34513a m109065b(float f13, float f14, float f15) {
        C34524l c34524l = C34524l.f145120k;
        float f16 = c34524l.f145124d;
        double d3 = ((double) f13) / 100.0d;
        Math.sqrt(d3);
        float f17 = c34524l.f145121a + 4.0f;
        float f18 = c34524l.f145129i * f14;
        Math.sqrt(((f14 / ((float) Math.sqrt(d3))) * c34524l.f145124d) / f17);
        float f19 = (1.7f * f13) / ((0.007f * f13) + 1.0f);
        float fLog = ((float) Math.log((((double) f18) * 0.0228d) + 1.0d)) * 43.85965f;
        double d14 = (3.1415927f * f15) / 180.0f;
        return new C34513a(f15, f14, f13, f19, fLog * ((float) Math.cos(d14)), fLog * ((float) Math.sin(d14)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX INFO: renamed from: c */
    public final int m109066c(C34524l c34524l) {
        float fSqrt;
        float f13 = this.f145087b;
        double d3 = f13;
        float f14 = this.f145088c;
        if (d3 != 0.0d) {
            double d14 = f14;
            if (d14 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f13 / ((float) Math.sqrt(d14 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float f15 = c34524l.f145126f;
        float f16 = c34524l.f145128h;
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, f15), 0.73d), 1.1111111111111112d);
        double d15 = (this.f145086a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d15) + 3.8d)) * 0.25f;
        float fPow2 = c34524l.f145121a * ((float) Math.pow(((double) f14) / 100.0d, (1.0d / ((double) c34524l.f145124d)) / ((double) c34524l.f145130j)));
        float f17 = fCos * 3846.1538f * c34524l.f145125e * c34524l.f145123c;
        float f18 = fPow2 / c34524l.f145122b;
        float fSin = (float) Math.sin(d15);
        float fCos2 = (float) Math.cos(d15);
        float f19 = (((0.305f + f18) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f17 * 23.0f)));
        float f24 = fCos2 * f19;
        float f25 = f19 * fSin;
        float f26 = f18 * 460.0f;
        float f27 = ((288.0f * f25) + ((451.0f * f24) + f26)) / 1403.0f;
        float f28 = ((f26 - (891.0f * f24)) - (261.0f * f25)) / 1403.0f;
        float f29 = ((f26 - (f24 * 220.0f)) - (f25 * 6300.0f)) / 1403.0f;
        float f34 = 100.0f / f16;
        float fSignum = Math.signum(f27) * f34 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f27)) * 27.13d) / (400.0d - ((double) Math.abs(f27)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f28) * f34 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f28)) * 27.13d) / (400.0d - ((double) Math.abs(f28)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f29) * f34 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f29)) * 27.13d) / (400.0d - ((double) Math.abs(f29)))), 2.380952380952381d));
        float[] fArr = c34524l.f145127g;
        float f35 = fSignum / fArr[0];
        float f36 = fSignum2 / fArr[1];
        float f37 = fSignum3 / fArr[2];
        float[][] fArr2 = AbstractC34514b.f145093b;
        float[] fArr3 = fArr2[0];
        float f38 = (fArr3[2] * f37) + (fArr3[1] * f36) + (fArr3[0] * f35);
        float[] fArr4 = fArr2[1];
        float f39 = (fArr4[2] * f37) + (fArr4[1] * f36) + (fArr4[0] * f35);
        float[] fArr5 = fArr2[2];
        return AbstractC35642a.m112832a(f38, f39, (f37 * fArr5[2]) + (f36 * fArr5[1]) + (f35 * fArr5[0]));
    }
}
