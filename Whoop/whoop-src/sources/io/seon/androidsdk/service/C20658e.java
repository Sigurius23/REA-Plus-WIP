package io.seon.androidsdk.service;

import java.util.Arrays;
import live.hms.video.error.ErrorCodes;
import p002a0.C0028i;

/* JADX INFO: renamed from: io.seon.androidsdk.service.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C20658e extends AbstractC20660e1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f77283h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20658e() {
        super(ErrorCodes.TracksErrors.cGenericTrack, 4);
        this.f77283h = 1;
    }

    @Override // io.seon.androidsdk.service.AbstractC20660e1
    /* JADX INFO: renamed from: a */
    public void mo56787a(float[] fArr) {
        float[] fArrCopyOf;
        switch (this.f77283h) {
            case 0:
                float f13 = fArr[0];
                float f14 = fArr[1];
                float f15 = fArr[2];
                super.mo56787a(new float[]{(float) Math.sqrt((f15 * f15) + (f14 * f14) + (f13 * f13))});
                break;
            case 1:
                float[] fArr2 = new float[4];
                System.arraycopy(fArr, 0, fArr2, 0, 3);
                int i13 = this.f77288d;
                float f16 = 0.0f;
                if (i13 != 0) {
                    if (i13 == 0) {
                        fArrCopyOf = null;
                    } else {
                        int i14 = this.f77287c - 1;
                        int i15 = this.f77289e;
                        float[] fArr3 = ((float[][]) this.f77291g)[(i14 + i15) % i15];
                        fArrCopyOf = Arrays.copyOf(fArr3, fArr3.length);
                    }
                    if (fArrCopyOf == null || fArr.length < 3 || fArrCopyOf.length < 3) {
                        f16 = -1.0f;
                    } else {
                        for (int i16 = 0; i16 < fArr.length; i16++) {
                            float fAbs = Math.abs(fArr[i16] - fArrCopyOf[i16]);
                            if (fAbs > f16) {
                                f16 = fAbs;
                            }
                        }
                    }
                }
                fArr2[3] = f16;
                super.mo56787a(fArr2);
                break;
            default:
                super.mo56787a(fArr);
                break;
        }
    }

    /* JADX INFO: renamed from: g */
    public C0028i m56788g() {
        int i13 = this.f77289e;
        float[][] fArr = (float[][]) this.f77291g;
        int i14 = this.f77288d;
        if (i14 < 2) {
            return new C0028i(-1, -1, new float[0], i14);
        }
        if (i14 <= 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        float[] fArr2 = fArr[this.f77286b % i13];
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (true) {
            int i18 = this.f77288d;
            if (i17 >= i18) {
                float[] fArr3 = new float[i18];
                for (int i19 = 0; i19 < this.f77288d; i19++) {
                    fArr3[i19] = fArr[i19][3];
                }
                Arrays.sort(fArr3);
                return new C0028i(i15, i16, Arrays.copyOfRange(fArr3, Math.max(1, this.f77288d - 10), this.f77288d), this.f77288d);
            }
            if (i17 >= i18) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            float[] fArr4 = fArr[(this.f77286b + i17) % i13];
            if (!Arrays.equals(fArr2, fArr4)) {
                if (fArr4 == null || fArr2 == null || fArr4.length != fArr2.length) {
                    i15++;
                    break;
                }
                int i24 = 0;
                while (true) {
                    if (i24 >= fArr4.length) {
                        i16++;
                        break;
                    }
                    if (Math.abs(fArr4[i24] - fArr2[i24]) > 0.1f) {
                        i15++;
                        break;
                        break;
                    }
                    i24++;
                }
            }
            i17++;
            fArr2 = fArr4;
        }
    }

    /* JADX INFO: renamed from: h */
    public C20667h m56789h() {
        int i13 = this.f77288d;
        if (i13 == 0) {
            return new C20667h(-1.0f, -1.0f, -1.0f, -1.0f, i13, 0);
        }
        float[][] fArr = (float[][]) Arrays.copyOfRange((float[][]) this.f77291g, 0, i13);
        int i14 = this.f77288d;
        float[] fArr2 = new float[i14];
        for (int i15 = 0; i15 < this.f77288d; i15++) {
            fArr2[i15] = fArr[i15][0];
        }
        Arrays.sort(fArr2);
        int i16 = i14 - 1;
        return new C20667h(i14 % 2 != 0 ? fArr2[i14 / 2] : (fArr2[i16 / 2] + fArr2[i14 / 2]) / 2.0f, fArr2[0], fArr2[i16], fArr2[(int) (((double) i16) * 0.95d)], i14, 0);
    }

    /* JADX INFO: renamed from: i */
    public C20667h m56790i() {
        int i13 = this.f77288d;
        if (i13 == 0) {
            return new C20667h(-1.0f, -1.0f, -1.0f, -1.0f, i13, 1);
        }
        float[][] fArr = (float[][]) Arrays.copyOfRange((float[][]) this.f77291g, 0, i13);
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i14 = 0; i14 < fArr.length; i14++) {
            fArr2[i14] = fArr[i14][0];
        }
        Arrays.sort(fArr2);
        int i15 = length - 1;
        return new C20667h(length % 2 != 0 ? fArr2[length / 2] : (fArr2[i15 / 2] + fArr2[length / 2]) / 2.0f, fArr2[i15], fArr2[0], fArr2[(int) (((double) i15) * 0.95d)], length, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20658e(int i13, int i14, int i15) {
        super(i13, i14);
        this.f77283h = i15;
    }
}
