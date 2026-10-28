package p299l9;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: renamed from: l9.c1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23489c1 {

    /* JADX INFO: renamed from: a */
    public final Random f92981a;

    /* JADX INFO: renamed from: b */
    public final int[] f92982b;

    /* JADX INFO: renamed from: c */
    public final int[] f92983c;

    public C23489c1() {
        this(new Random());
    }

    /* JADX INFO: renamed from: a */
    public final C23489c1 m68055a(int i13) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i13];
        int[] iArr3 = new int[i13];
        int i14 = 0;
        while (true) {
            iArr = this.f92982b;
            random = this.f92981a;
            if (i14 >= i13) {
                break;
            }
            iArr2[i14] = random.nextInt(iArr.length + 1);
            int i15 = i14 + 1;
            int iNextInt = random.nextInt(i15);
            iArr3[i14] = iArr3[iNextInt];
            iArr3[iNextInt] = i14;
            i14 = i15;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i13];
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < iArr.length + i13; i18++) {
            if (i16 >= i13 || i17 != iArr2[i16]) {
                int i19 = i17 + 1;
                int i24 = iArr[i17];
                iArr4[i18] = i24;
                if (i24 >= 0) {
                    iArr4[i18] = i24 + i13;
                }
                i17 = i19;
            } else {
                iArr4[i18] = iArr3[i16];
                i16++;
            }
        }
        return new C23489c1(iArr4, new Random(random.nextLong()));
    }

    public C23489c1(int[] iArr, Random random) {
        this.f92982b = iArr;
        this.f92981a = random;
        this.f92983c = new int[iArr.length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            this.f92983c[iArr[i13]] = i13;
        }
    }

    public C23489c1(Random random) {
        this(new int[0], random);
    }
}
