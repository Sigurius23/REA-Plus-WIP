package sn;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: renamed from: sn.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32762u0 {

    /* JADX INFO: renamed from: a */
    public final Random f136243a;

    /* JADX INFO: renamed from: b */
    public final int[] f136244b;

    /* JADX INFO: renamed from: c */
    public final int[] f136245c;

    public C32762u0() {
        this(new Random());
    }

    /* JADX INFO: renamed from: a */
    public final C32762u0 m102754a(int i13) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i13];
        int[] iArr3 = new int[i13];
        int i14 = 0;
        while (true) {
            iArr = this.f136244b;
            random = this.f136243a;
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
        return new C32762u0(iArr4, new Random(random.nextLong()));
    }

    public C32762u0(int[] iArr, Random random) {
        this.f136244b = iArr;
        this.f136243a = random;
        this.f136245c = new int[iArr.length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            this.f136245c[iArr[i13]] = i13;
        }
    }

    public C32762u0(Random random) {
        this(new int[0], random);
    }
}
