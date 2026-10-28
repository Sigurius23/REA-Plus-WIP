package bj;

import android.graphics.Color;
import dj.AbstractC12062g;
import e93.AbstractC12889b;
import java.util.ArrayList;
import java.util.Arrays;
import p049cj.AbstractC4737c;
import p649yi.C39548c;

/* JADX INFO: renamed from: bj.l */
/* JADX INFO: loaded from: classes.dex */
public final class C3313l implements InterfaceC3306e0 {

    /* JADX INFO: renamed from: a */
    public int f12888a;

    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    @Override // bj.InterfaceC3306e0
    /* JADX INFO: renamed from: a */
    public final Object mo9604a(AbstractC4737c abstractC4737c, float f13) {
        int i13;
        int iArgb;
        float f14;
        int iArgb2;
        float f15;
        float fM33256f;
        ArrayList arrayList = new ArrayList();
        int i14 = 1;
        int i15 = 0;
        boolean z4 = abstractC4737c.mo14822i() == 1;
        if (z4) {
            abstractC4737c.beginArray();
        }
        while (abstractC4737c.hasNext()) {
            arrayList.add(Float.valueOf((float) abstractC4737c.nextDouble()));
        }
        int i16 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f12888a = 2;
        }
        if (z4) {
            abstractC4737c.endArray();
        }
        if (this.f12888a == -1) {
            this.f12888a = arrayList.size() / 4;
        }
        int i17 = this.f12888a;
        float[] fArr = new float[i17];
        int[] iArr = new int[i17];
        int i18 = 0;
        int i19 = 0;
        int i24 = 0;
        while (true) {
            i13 = this.f12888a * 4;
            if (i18 >= i13) {
                break;
            }
            int i25 = i18 / 4;
            double dFloatValue = ((Float) arrayList.get(i18)).floatValue();
            int i26 = i15;
            int i27 = i18 % 4;
            if (i27 != 0) {
                if (i27 == i14) {
                    i19 = (int) (dFloatValue * 255.0d);
                } else if (i27 == 2) {
                    i24 = (int) (dFloatValue * 255.0d);
                } else if (i27 == 3) {
                    iArr[i25] = Color.argb(255, i19, i24, (int) (dFloatValue * 255.0d));
                }
            } else if (i25 > 0) {
                float f16 = (float) dFloatValue;
                if (fArr[i25 - 1] >= f16) {
                    fArr[i25] = f16 + 0.01f;
                } else {
                    fArr[i25] = (float) dFloatValue;
                }
            } else {
                fArr[i25] = (float) dFloatValue;
            }
            i18++;
            i15 = i26;
            i14 = 1;
        }
        int i28 = i15;
        C39548c c39548c = new C39548c(fArr, iArr);
        if (arrayList.size() <= i13) {
            return c39548c;
        }
        int size = (arrayList.size() - i13) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i29 = i28;
        while (i13 < arrayList.size()) {
            if (i13 % 2 == 0) {
                fArr2[i29] = ((Float) arrayList.get(i13)).floatValue();
            } else {
                fArr3[i29] = ((Float) arrayList.get(i13)).floatValue();
                i29++;
            }
            i13++;
        }
        float[] fArrCopyOf = c39548c.f170132a;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size != 0) {
            int length = fArrCopyOf.length + size;
            float[] fArr4 = new float[length];
            int i34 = i28;
            int i35 = i34;
            int i36 = i35;
            int i37 = i36;
            while (i34 < length) {
                float f17 = i36 < fArrCopyOf.length ? fArrCopyOf[i36] : Float.NaN;
                float f18 = i37 < size ? fArr2[i37] : Float.NaN;
                if (Float.isNaN(f18) || f17 < f18) {
                    fArr4[i34] = f17;
                    i36++;
                } else if (Float.isNaN(f17) || f18 < f17) {
                    fArr4[i34] = f18;
                    i37++;
                } else {
                    fArr4[i34] = f17;
                    i36++;
                    i37++;
                    i35++;
                }
                i34++;
            }
            fArrCopyOf = i35 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i35);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        int i38 = i28;
        while (i38 < length2) {
            float f19 = fArrCopyOf[i38];
            int iBinarySearch = Arrays.binarySearch(fArr, f19);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f19);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f24 = fArr3[iBinarySearch2];
                if (i17 < 2 || f19 == fArr[i28]) {
                    iArgb = iArr[i28];
                } else {
                    int i39 = 1;
                    while (true) {
                        if (i39 >= i17) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f14 = fArr[i39];
                        if (f14 >= f19 || i39 == i17 - 1) {
                            break;
                        }
                        i39++;
                    }
                    if (i39 != i17 - 1 || f19 < f14) {
                        int i44 = i39 - 1;
                        float f25 = fArr[i44];
                        int iM36296z = AbstractC12889b.m36296z((f19 - f25) / (f14 - f25), iArr[i44], iArr[i39]);
                        iArgb = Color.argb((int) (f24 * 255.0f), Color.red(iM36296z), Color.green(iM36296z), Color.blue(iM36296z));
                    } else {
                        iArgb = Color.argb((int) (f24 * 255.0f), Color.red(iArr[i39]), Color.green(iArr[i39]), Color.blue(iArr[i39]));
                    }
                }
                iArr2[i38] = iArgb;
            } else {
                int i45 = iArr[iBinarySearch];
                if (size < i16 || f19 <= fArr2[i28]) {
                    iArgb2 = Color.argb((int) (fArr3[i28] * 255.0f), Color.red(i45), Color.green(i45), Color.blue(i45));
                } else {
                    int i46 = 1;
                    while (true) {
                        if (i46 >= size) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f15 = fArr2[i46];
                        if (f15 >= f19 || i46 == size - 1) {
                            break;
                        }
                        i46++;
                    }
                    if (f15 <= f19) {
                        fM33256f = fArr3[i46];
                    } else {
                        int i47 = i46 - 1;
                        float f26 = fArr2[i47];
                        fM33256f = AbstractC12062g.m33256f(fArr3[i47], fArr3[i46], (f19 - f26) / (f15 - f26));
                    }
                    iArgb2 = Color.argb((int) (fM33256f * 255.0f), Color.red(i45), Color.green(i45), Color.blue(i45));
                }
                iArr2[i38] = iArgb2;
            }
            i38++;
            i16 = 2;
        }
        return new C39548c(fArrCopyOf, iArr2);
    }
}
