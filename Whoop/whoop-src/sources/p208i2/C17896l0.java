package p208i2;

import java.util.Arrays;
import p181h2.C16616a;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: i2.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17896l0 {

    /* JADX INFO: renamed from: a */
    public final float[] f69598a;

    /* JADX INFO: renamed from: a */
    public static float[] m51471a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    /* JADX INFO: renamed from: b */
    public static final long m51472b(long j7, float[] fArr) {
        if (fArr.length < 16) {
            return j7;
        }
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[3];
        float f16 = fArr[4];
        float f17 = fArr[5];
        float f18 = fArr[7];
        float f19 = fArr[12];
        float f24 = fArr[13];
        float f25 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        float f26 = 1 / (((f18 * fIntBitsToFloat2) + (f15 * fIntBitsToFloat)) + f25);
        if ((Float.floatToRawIntBits(f26) & Integer.MAX_VALUE) >= 2139095040) {
            f26 = 0.0f;
        }
        return (((long) Float.floatToRawIntBits((((f16 * fIntBitsToFloat2) + (f13 * fIntBitsToFloat)) + f19) * f26)) << 32) | (((long) Float.floatToRawIntBits(((f17 * fIntBitsToFloat2) + (f14 * fIntBitsToFloat) + f24) * f26)) & 4294967295L);
    }

    /* JADX INFO: renamed from: c */
    public static final void m51473c(float[] fArr, C16616a c16616a) {
        if (fArr.length < 16) {
            return;
        }
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[3];
        float f16 = fArr[4];
        float f17 = fArr[5];
        float f18 = fArr[7];
        float f19 = fArr[12];
        float f24 = fArr[13];
        float f25 = fArr[15];
        float f26 = c16616a.f63933a;
        float f27 = c16616a.f63934b;
        float f28 = c16616a.f63935c;
        float f29 = c16616a.f63936d;
        float f34 = f15 * f26;
        float f35 = f18 * f27;
        float f36 = 1.0f / ((f34 + f35) + f25);
        if ((Float.floatToRawIntBits(f36) & Integer.MAX_VALUE) >= 2139095040) {
            f36 = 0.0f;
        }
        float f37 = f13 * f26;
        float f38 = f16 * f27;
        float f39 = (f37 + f38 + f19) * f36;
        float f43 = f26 * f14;
        float f44 = f27 * f17;
        float f45 = (f43 + f44 + f24) * f36;
        float f46 = f18 * f29;
        float f47 = 1.0f / ((f34 + f46) + f25);
        if ((Float.floatToRawIntBits(f47) & Integer.MAX_VALUE) >= 2139095040) {
            f47 = 0.0f;
        }
        float f48 = f16 * f29;
        float f49 = (f37 + f48 + f19) * f47;
        float f54 = f17 * f29;
        float f55 = (f43 + f54 + f24) * f47;
        float f56 = f15 * f28;
        float f57 = 1.0f / ((f35 + f56) + f25);
        if ((Float.floatToRawIntBits(f57) & Integer.MAX_VALUE) >= 2139095040) {
            f57 = 0.0f;
        }
        float f58 = f13 * f28;
        float f59 = (f58 + f38 + f19) * f57;
        float f64 = f28 * f14;
        float f65 = (f44 + f64 + f24) * f57;
        float f66 = 1.0f / ((f56 + f46) + f25);
        float f67 = (Float.floatToRawIntBits(f66) & Integer.MAX_VALUE) < 2139095040 ? f66 : 0.0f;
        float f68 = (f58 + f48 + f19) * f67;
        float f69 = (f64 + f54 + f24) * f67;
        c16616a.f63933a = Math.min(f39, Math.min(f49, Math.min(f59, f68)));
        c16616a.f63934b = Math.min(f45, Math.min(f55, Math.min(f65, f69)));
        c16616a.f63935c = Math.max(f39, Math.max(f49, Math.max(f59, f68)));
        c16616a.f63936d = Math.max(f45, Math.max(f55, Math.max(f65, f69)));
    }

    /* JADX INFO: renamed from: d */
    public static final void m51474d(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    /* JADX INFO: renamed from: e */
    public static final void m51475e(float[] fArr, float f13, float f14) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f13;
        fArr[1] = fArr[1] * f13;
        fArr[2] = fArr[2] * f13;
        fArr[3] = fArr[3] * f13;
        fArr[4] = fArr[4] * f14;
        fArr[5] = fArr[5] * f14;
        fArr[6] = fArr[6] * f14;
        fArr[7] = fArr[7] * f14;
        fArr[8] = fArr[8] * 1.0f;
        fArr[9] = fArr[9] * 1.0f;
        fArr[10] = fArr[10] * 1.0f;
        fArr[11] = fArr[11] * 1.0f;
    }

    /* JADX INFO: renamed from: f */
    public static final void m51476f(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f13 = fArr[0];
            float f14 = fArr2[0];
            float f15 = fArr[1];
            float f16 = fArr2[4];
            float f17 = fArr[2];
            float f18 = fArr2[8];
            float f19 = f17 * f18;
            float f24 = fArr[3];
            float f25 = fArr2[12];
            float f26 = f24 * f25;
            float f27 = f26 + f19 + (f15 * f16) + (f13 * f14);
            float f28 = fArr2[1];
            float f29 = fArr2[5];
            float f34 = fArr2[9];
            float f35 = f17 * f34;
            float f36 = fArr2[13];
            float f37 = f24 * f36;
            float f38 = f37 + f35 + (f15 * f29) + (f13 * f28);
            float f39 = fArr2[2];
            float f43 = fArr2[6];
            float f44 = fArr2[10];
            float f45 = f17 * f44;
            float f46 = fArr2[14];
            float f47 = f24 * f46;
            float f48 = f47 + f45 + (f15 * f43) + (f13 * f39);
            float f49 = fArr2[3];
            float f54 = fArr2[7];
            float f55 = fArr2[11];
            float f56 = f17 * f55;
            float f57 = fArr2[15];
            float f58 = f24 * f57;
            float f59 = f58 + f56 + (f15 * f54) + (f13 * f49);
            float f64 = fArr[4];
            float f65 = fArr[5];
            float f66 = fArr[6];
            float f67 = (f66 * f18) + (f65 * f16) + (f64 * f14);
            float f68 = fArr[7];
            float f69 = (f68 * f25) + f67;
            float f74 = (f68 * f36) + (f66 * f34) + (f65 * f29) + (f64 * f28);
            float f75 = (f68 * f46) + (f66 * f44) + (f65 * f43) + (f64 * f39);
            float f76 = f66 * f55;
            float f77 = f68 * f57;
            float f78 = f77 + f76 + (f65 * f54) + (f64 * f49);
            float f79 = fArr[8];
            float f84 = fArr[9];
            float f85 = fArr[10];
            float f86 = (f85 * f18) + (f84 * f16) + (f79 * f14);
            float f87 = fArr[11];
            float f88 = (f87 * f25) + f86;
            float f89 = (f87 * f36) + (f85 * f34) + (f84 * f29) + (f79 * f28);
            float f94 = (f87 * f46) + (f85 * f44) + (f84 * f43) + (f79 * f39);
            float f95 = f85 * f55;
            float f96 = f87 * f57;
            float f97 = f96 + f95 + (f84 * f54) + (f79 * f49);
            float f98 = fArr[12];
            float f99 = fArr[13];
            float f100 = (f16 * f99) + (f14 * f98);
            float f101 = fArr[14];
            float f102 = (f18 * f101) + f100;
            float f103 = fArr[15];
            float f104 = (f25 * f103) + f102;
            float f105 = f34 * f101;
            float f106 = f36 * f103;
            float f107 = f106 + f105 + (f29 * f99) + (f28 * f98);
            float f108 = f44 * f101;
            float f109 = f46 * f103;
            float f110 = f109 + f108 + (f43 * f99) + (f39 * f98);
            float f111 = f101 * f55;
            float f112 = f103 * f57;
            fArr[0] = f27;
            fArr[1] = f38;
            fArr[2] = f48;
            fArr[3] = f59;
            fArr[4] = f69;
            fArr[5] = f74;
            fArr[6] = f75;
            fArr[7] = f78;
            fArr[8] = f88;
            fArr[9] = f89;
            fArr[10] = f94;
            fArr[11] = f97;
            fArr[12] = f104;
            fArr[13] = f107;
            fArr[14] = f110;
            fArr[15] = f112 + f111 + (f99 * f54) + (f98 * f49);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m51477g(float[] fArr, float f13, float f14) {
        if (fArr.length < 16) {
            return;
        }
        float f15 = (fArr[8] * 0.0f) + (fArr[4] * f14) + (fArr[0] * f13) + fArr[12];
        float f16 = (fArr[9] * 0.0f) + (fArr[5] * f14) + (fArr[1] * f13) + fArr[13];
        float f17 = (fArr[10] * 0.0f) + (fArr[6] * f14) + (fArr[2] * f13) + fArr[14];
        float f18 = (fArr[11] * 0.0f) + (fArr[7] * f14) + (fArr[3] * f13) + fArr[15];
        fArr[12] = f15;
        fArr[13] = f16;
        fArr[14] = f17;
        fArr[15] = f18;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17896l0) {
            return AbstractC22676k.m65745e(this.f69598a, ((C17896l0) obj).f69598a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f69598a);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("\n            |");
        float[] fArr = this.f69598a;
        sb4.append(fArr[0]);
        sb4.append(' ');
        sb4.append(fArr[1]);
        sb4.append(' ');
        sb4.append(fArr[2]);
        sb4.append(' ');
        sb4.append(fArr[3]);
        sb4.append("|\n            |");
        sb4.append(fArr[4]);
        sb4.append(' ');
        sb4.append(fArr[5]);
        sb4.append(' ');
        sb4.append(fArr[6]);
        sb4.append(' ');
        sb4.append(fArr[7]);
        sb4.append("|\n            |");
        sb4.append(fArr[8]);
        sb4.append(' ');
        sb4.append(fArr[9]);
        sb4.append(' ');
        sb4.append(fArr[10]);
        sb4.append(' ');
        sb4.append(fArr[11]);
        sb4.append("|\n            |");
        sb4.append(fArr[12]);
        sb4.append(' ');
        sb4.append(fArr[13]);
        sb4.append(' ');
        sb4.append(fArr[14]);
        sb4.append(' ');
        sb4.append(fArr[15]);
        sb4.append("|\n        ");
        return AbstractC39415s.m125909s(sb4.toString());
    }
}
