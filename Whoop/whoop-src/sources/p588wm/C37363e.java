package p588wm;

import java.util.Arrays;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p309lo.AbstractC24567y;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: wm.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C37363e implements InterfaceC37374p {

    /* JADX INFO: renamed from: a */
    public final int f159840a;

    /* JADX INFO: renamed from: b */
    public final int[] f159841b;

    /* JADX INFO: renamed from: c */
    public final long[] f159842c;

    /* JADX INFO: renamed from: d */
    public final long[] f159843d;

    /* JADX INFO: renamed from: e */
    public final long[] f159844e;

    /* JADX INFO: renamed from: f */
    public final long f159845f;

    public C37363e(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f159841b = iArr;
        this.f159842c = jArr;
        this.f159843d = jArr2;
        this.f159844e = jArr3;
        int length = iArr.length;
        this.f159840a = length;
        if (length > 0) {
            this.f159845f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f159845f = 0L;
        }
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: c */
    public final C37373o mo3112c(long j7) {
        long[] jArr = this.f159844e;
        int iM71674e = AbstractC24567y.m71674e(jArr, j7, true);
        long j13 = jArr[iM71674e];
        long[] jArr2 = this.f159842c;
        C37375q c37375q = new C37375q(j13, jArr2[iM71674e]);
        if (j13 >= j7 || iM71674e == this.f159840a - 1) {
            return new C37373o(c37375q, c37375q);
        }
        int i13 = iM71674e + 1;
        return new C37373o(c37375q, new C37375q(jArr[i13], jArr2[i13]));
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: e */
    public final boolean mo3113e() {
        return true;
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: f */
    public final long mo3114f() {
        return this.f159845f;
    }

    public final String toString() {
        String string = Arrays.toString(this.f159841b);
        String string2 = Arrays.toString(this.f159842c);
        String string3 = Arrays.toString(this.f159844e);
        String string4 = Arrays.toString(this.f159843d);
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(AbstractC30007c.m91832b(AbstractC30007c.m91832b(AbstractC30007c.m91832b(71, string), string2), string3), string4));
        sb4.append("ChunkIndex(length=");
        sb4.append(this.f159840a);
        sb4.append(", sizes=");
        sb4.append(string);
        AbstractC11266d.m30444B(sb4, ", offsets=", string2, ", timeUs=", string3);
        return AbstractC2875y.m8304q(sb4, ", durationsUs=", string4, ")");
    }
}
