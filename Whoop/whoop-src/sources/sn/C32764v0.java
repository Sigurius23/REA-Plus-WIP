package sn;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import p309lo.AbstractC24543a;
import p465rm.AbstractC31558o1;
import p465rm.C31527e0;
import p465rm.C31536h0;
import p465rm.C31539i0;
import p465rm.C31545k0;
import p465rm.C31551m0;
import p465rm.C31552m1;
import p465rm.C31555n1;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import tn.C33956b;
import vn.C36172c;

/* JADX INFO: renamed from: sn.v0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32764v0 extends AbstractC31558o1 {

    /* JADX INFO: renamed from: N */
    public static final Object f136246N = new Object();

    /* JADX INFO: renamed from: E */
    public final long f136247E;

    /* JADX INFO: renamed from: F */
    public final long f136248F;

    /* JADX INFO: renamed from: G */
    public final long f136249G;

    /* JADX INFO: renamed from: H */
    public final boolean f136250H;

    /* JADX INFO: renamed from: I */
    public final boolean f136251I;

    /* JADX INFO: renamed from: J */
    public final boolean f136252J;

    /* JADX INFO: renamed from: K */
    public final Object f136253K;

    /* JADX INFO: renamed from: L */
    public final C31545k0 f136254L;

    /* JADX INFO: renamed from: M */
    public final C31536h0 f136255M;

    /* JADX INFO: renamed from: x */
    public final long f136256x;

    /* JADX INFO: renamed from: y */
    public final long f136257y;

    /* JADX INFO: renamed from: z */
    public final long f136258z;

    static {
        C31527e0 c31527e0 = new C31527e0();
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        C41060w0 c41060w0 = C41060w0.f177067E;
        List list = Collections.EMPTY_LIST;
        C41060w0 c41060w1 = C41060w0.f177067E;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new C31539i0(uri, null, list, c41060w1);
        }
        c31527e0.m97126a();
        C31551m0 c31551m0 = C31551m0.f130246h0;
    }

    public C32764v0(long j7, long j13, long j14, long j15, long j16, long j17, boolean z4, boolean z13, boolean z14, C36172c c36172c, C31545k0 c31545k0, C31536h0 c31536h0) {
        this.f136256x = j7;
        this.f136257y = j13;
        this.f136258z = j14;
        this.f136247E = j15;
        this.f136248F = j16;
        this.f136249G = j17;
        this.f136250H = z4;
        this.f136251I = z13;
        this.f136252J = z14;
        this.f136253K = c36172c;
        c31545k0.getClass();
        this.f136254L = c31545k0;
        this.f136255M = c31536h0;
    }

    @Override // p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: b */
    public final int mo97128b(Object obj) {
        return f136246N.equals(obj) ? 0 : -1;
    }

    @Override // p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: f */
    public final C31552m1 mo97131f(int i13, C31552m1 c31552m1, boolean z4) {
        AbstractC24543a.m71572h(i13, 1);
        Object obj = z4 ? f136246N : null;
        long j7 = -this.f136248F;
        c31552m1.getClass();
        c31552m1.m97157h(null, obj, 0, this.f136258z, j7, C33956b.f142378F, false);
        return c31552m1;
    }

    @Override // p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: h */
    public final int mo97133h() {
        return 1;
    }

    @Override // p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: l */
    public final Object mo97135l(int i13) {
        AbstractC24543a.m71572h(i13, 1);
        return f136246N;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d A[PHI: r1
      0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: m */
    public final C31555n1 mo97136m(int i13, C31555n1 c31555n1, long j7) {
        long j13;
        AbstractC24543a.m71572h(i13, 1);
        long j14 = this.f136249G;
        boolean z4 = this.f136251I;
        if (!z4 || this.f136252J || j7 == 0) {
            j13 = j14;
        } else {
            long j15 = this.f136247E;
            if (j15 != -9223372036854775807L) {
                j14 += j7;
                if (j14 <= j15) {
                    j13 = j14;
                }
            }
            j13 = -9223372036854775807L;
        }
        c31555n1.m97167b(C31555n1.f130306R, this.f136254L, this.f136253K, this.f136256x, this.f136257y, -9223372036854775807L, this.f136250H, z4, this.f136255M, j13, this.f136247E, 0, 0, this.f136248F);
        return c31555n1;
    }

    @Override // p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: o */
    public final int mo97137o() {
        return 1;
    }
}
