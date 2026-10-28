package p516u8;

import java.util.Arrays;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: u8.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C34582b {

    /* JADX INFO: renamed from: c */
    public static final C34582b f145636c = new C34582b(new C34580a[0]);

    /* JADX INFO: renamed from: d */
    public static final C34580a f145637d;

    /* JADX INFO: renamed from: a */
    public final int f145638a;

    /* JADX INFO: renamed from: b */
    public final C34580a[] f145639b;

    static {
        C34580a c34580a = new C34580a(-1, -1, new int[0], new C34626x[0], new long[0], new String[0]);
        int[] iArr = c34580a.f145605e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = c34580a.f145606f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f145637d = new C34580a(0, c34580a.f145602b, iArrCopyOf, (C34626x[]) Arrays.copyOf(c34580a.f145604d, 0), jArrCopyOf, (String[]) Arrays.copyOf(c34580a.f145607g, 0));
        AbstractC38065t.m121892F(1);
        AbstractC38065t.m121892F(2);
        AbstractC38065t.m121892F(3);
        AbstractC38065t.m121892F(4);
    }

    public C34582b(C34580a[] c34580aArr) {
        this.f145638a = c34580aArr.length;
        this.f145639b = c34580aArr;
    }

    /* JADX INFO: renamed from: a */
    public final C34580a m109363a(int i13) {
        return i13 < 0 ? f145637d : this.f145639b[i13];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34582b.class != obj.getClass()) {
            return false;
        }
        C34582b c34582b = (C34582b) obj;
        return this.f145638a == c34582b.f145638a && Arrays.equals(this.f145639b, c34582b.f145639b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f145639b) + (((((this.f145638a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i13 = 0;
        while (true) {
            C34580a[] c34580aArr = this.f145639b;
            if (i13 >= c34580aArr.length) {
                sb4.append("])");
                return sb4.toString();
            }
            sb4.append("adGroup(timeUs=0, ads=[");
            c34580aArr[i13].getClass();
            for (int i14 = 0; i14 < c34580aArr[i13].f145605e.length; i14++) {
                sb4.append("ad(state=");
                int i15 = c34580aArr[i13].f145605e[i14];
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
                sb4.append(c34580aArr[i13].f145606f[i14]);
                sb4.append(')');
                if (i14 < c34580aArr[i13].f145605e.length - 1) {
                    sb4.append(", ");
                }
            }
            sb4.append("])");
            if (i13 < c34580aArr.length - 1) {
                sb4.append(", ");
            }
            i13++;
        }
    }
}
