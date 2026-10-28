package p649yi;

import e93.AbstractC12889b;
import java.util.Arrays;

/* JADX INFO: renamed from: yi.c */
/* JADX INFO: loaded from: classes.dex */
public final class C39548c {

    /* JADX INFO: renamed from: a */
    public final float[] f170132a;

    /* JADX INFO: renamed from: b */
    public final int[] f170133b;

    public C39548c(float[] fArr, int[] iArr) {
        this.f170132a = fArr;
        this.f170133b = iArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m126326a(C39548c c39548c) {
        int i13 = 0;
        while (true) {
            int[] iArr = c39548c.f170133b;
            if (i13 >= iArr.length) {
                return;
            }
            this.f170132a[i13] = c39548c.f170132a[i13];
            this.f170133b[i13] = iArr[i13];
            i13++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final C39548c m126327b(float[] fArr) {
        int iM36296z;
        int[] iArr = new int[fArr.length];
        for (int i13 = 0; i13 < fArr.length; i13++) {
            float f13 = fArr[i13];
            float[] fArr2 = this.f170132a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f13);
            int[] iArr2 = this.f170133b;
            if (iBinarySearch >= 0) {
                iM36296z = iArr2[iBinarySearch];
            } else {
                int i14 = -(iBinarySearch + 1);
                if (i14 == 0) {
                    iM36296z = iArr2[0];
                } else if (i14 == iArr2.length - 1) {
                    iM36296z = iArr2[iArr2.length - 1];
                } else {
                    int i15 = i14 - 1;
                    float f14 = fArr2[i15];
                    iM36296z = AbstractC12889b.m36296z((f13 - f14) / (fArr2[i14] - f14), iArr2[i15], iArr2[i14]);
                }
            }
            iArr[i13] = iM36296z;
        }
        return new C39548c(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C39548c.class == obj.getClass()) {
            C39548c c39548c = (C39548c) obj;
            if (Arrays.equals(this.f170132a, c39548c.f170132a) && Arrays.equals(this.f170133b, c39548c.f170133b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f170133b) + (Arrays.hashCode(this.f170132a) * 31);
    }
}
