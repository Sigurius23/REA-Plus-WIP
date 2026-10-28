package tn;

import android.net.Uri;
import java.util.Arrays;
import p309lo.AbstractC24543a;
import p465rm.InterfaceC31529f;
import sm.C32710c;

/* JADX INFO: renamed from: tn.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C33955a implements InterfaceC31529f {

    /* JADX INFO: renamed from: H */
    public static final C32710c f142370H = new C32710c(27);

    /* JADX INFO: renamed from: E */
    public final long[] f142371E;

    /* JADX INFO: renamed from: F */
    public final long f142372F;

    /* JADX INFO: renamed from: G */
    public final boolean f142373G;

    /* JADX INFO: renamed from: w */
    public final long f142374w;

    /* JADX INFO: renamed from: x */
    public final int f142375x;

    /* JADX INFO: renamed from: y */
    public final Uri[] f142376y;

    /* JADX INFO: renamed from: z */
    public final int[] f142377z;

    public C33955a(long j7, int i13, int[] iArr, Uri[] uriArr, long[] jArr, long j13, boolean z4) {
        AbstractC24543a.m71569e(iArr.length == uriArr.length);
        this.f142374w = j7;
        this.f142375x = i13;
        this.f142377z = iArr;
        this.f142376y = uriArr;
        this.f142371E = jArr;
        this.f142372F = j13;
        this.f142373G = z4;
    }

    /* JADX INFO: renamed from: a */
    public final int m107403a(int i13) {
        int i14;
        int i15 = i13 + 1;
        while (true) {
            int[] iArr = this.f142377z;
            if (i15 >= iArr.length || this.f142373G || (i14 = iArr[i15]) == 0 || i14 == 1) {
                break;
            }
            i15++;
        }
        return i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C33955a.class == obj.getClass()) {
            C33955a c33955a = (C33955a) obj;
            if (this.f142374w == c33955a.f142374w && this.f142375x == c33955a.f142375x && Arrays.equals(this.f142376y, c33955a.f142376y) && Arrays.equals(this.f142377z, c33955a.f142377z) && Arrays.equals(this.f142371E, c33955a.f142371E) && this.f142372F == c33955a.f142372F && this.f142373G == c33955a.f142373G) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = this.f142375x * 31;
        long j7 = this.f142374w;
        int iHashCode = (Arrays.hashCode(this.f142371E) + ((Arrays.hashCode(this.f142377z) + ((((i13 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + Arrays.hashCode(this.f142376y)) * 31)) * 31)) * 31;
        long j13 = this.f142372F;
        return ((iHashCode + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.f142373G ? 1 : 0);
    }
}
