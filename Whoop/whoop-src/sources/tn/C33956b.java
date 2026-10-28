package tn;

import android.net.Uri;
import java.util.Arrays;
import p309lo.AbstractC24567y;
import p465rm.InterfaceC31529f;
import sm.C32710c;

/* JADX INFO: renamed from: tn.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C33956b implements InterfaceC31529f {

    /* JADX INFO: renamed from: F */
    public static final C33956b f142378F = new C33956b(new C33955a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: G */
    public static final C33955a f142379G;

    /* JADX INFO: renamed from: H */
    public static final C32710c f142380H;

    /* JADX INFO: renamed from: E */
    public final C33955a[] f142381E;

    /* JADX INFO: renamed from: w */
    public final int f142382w;

    /* JADX INFO: renamed from: x */
    public final long f142383x;

    /* JADX INFO: renamed from: y */
    public final long f142384y;

    /* JADX INFO: renamed from: z */
    public final int f142385z;

    static {
        int iMax = Math.max(0, 0);
        int[] iArrCopyOf = Arrays.copyOf(new int[0], iMax);
        Arrays.fill(iArrCopyOf, 0, iMax, 0);
        int iMax2 = Math.max(0, 0);
        long[] jArrCopyOf = Arrays.copyOf(new long[0], iMax2);
        Arrays.fill(jArrCopyOf, 0, iMax2, -9223372036854775807L);
        f142379G = new C33955a(0L, 0, iArrCopyOf, (Uri[]) Arrays.copyOf(new Uri[0], 0), jArrCopyOf, 0L, false);
        f142380H = new C32710c(26);
    }

    public C33956b(C33955a[] c33955aArr, long j7, long j13, int i13) {
        this.f142383x = j7;
        this.f142384y = j13;
        this.f142382w = c33955aArr.length + i13;
        this.f142381E = c33955aArr;
        this.f142385z = i13;
    }

    /* JADX INFO: renamed from: a */
    public final C33955a m107404a(int i13) {
        int i14 = this.f142385z;
        return i13 < i14 ? f142379G : this.f142381E[i13 - i14];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C33956b.class != obj.getClass()) {
            return false;
        }
        C33956b c33956b = (C33956b) obj;
        int i13 = AbstractC24567y.f95875a;
        return this.f142382w == c33956b.f142382w && this.f142383x == c33956b.f142383x && this.f142384y == c33956b.f142384y && this.f142385z == c33956b.f142385z && Arrays.equals(this.f142381E, c33956b.f142381E);
    }

    public final int hashCode() {
        return (((((((this.f142382w * 961) + ((int) this.f142383x)) * 31) + ((int) this.f142384y)) * 31) + this.f142385z) * 31) + Arrays.hashCode(this.f142381E);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb4.append(this.f142383x);
        sb4.append(", adGroups=[");
        int i13 = 0;
        while (true) {
            C33955a[] c33955aArr = this.f142381E;
            if (i13 >= c33955aArr.length) {
                sb4.append("])");
                return sb4.toString();
            }
            sb4.append("adGroup(timeUs=");
            sb4.append(c33955aArr[i13].f142374w);
            sb4.append(", ads=[");
            for (int i14 = 0; i14 < c33955aArr[i13].f142377z.length; i14++) {
                sb4.append("ad(state=");
                int i15 = c33955aArr[i13].f142377z[i14];
                if (i15 == 0) {
                    sb4.append('_');
                } else if (i15 == 1) {
                    sb4.append('R');
                } else if (i15 == 2) {
                    sb4.append('S');
                } else if (i15 == 3) {
                    sb4.append('P');
                } else if (i15 != 4) {
                    sb4.append('?');
                } else {
                    sb4.append('!');
                }
                sb4.append(", durationUs=");
                sb4.append(c33955aArr[i13].f142371E[i14]);
                sb4.append(')');
                if (i14 < c33955aArr[i13].f142377z.length - 1) {
                    sb4.append(", ");
                }
            }
            sb4.append("])");
            if (i13 < c33955aArr.length - 1) {
                sb4.append(", ");
            }
            i13++;
        }
    }
}
