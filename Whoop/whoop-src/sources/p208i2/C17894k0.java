package p208i2;

import android.graphics.Shader;
import hc3.AbstractC17176i;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC11266d;
import p181h2.C16617b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i2.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17894k0 extends AbstractC17922y0 {

    /* JADX INFO: renamed from: f */
    public final List f69592f;

    /* JADX INFO: renamed from: g */
    public final List f69593g;

    /* JADX INFO: renamed from: h */
    public final long f69594h;

    /* JADX INFO: renamed from: i */
    public final long f69595i;

    /* JADX INFO: renamed from: j */
    public final int f69596j;

    public C17894k0(List list, ArrayList arrayList, long j7, long j13, int i13) {
        this.f69592f = list;
        this.f69593g = arrayList;
        this.f69594h = j7;
        this.f69595i = j13;
        this.f69596j = i13;
    }

    @Override // p208i2.AbstractC17922y0
    /* JADX INFO: renamed from: b */
    public final Shader mo29549b(long j7) {
        long j13 = this.f69594h;
        int i13 = (int) (j13 >> 32);
        if (Float.intBitsToFloat(i13) == Float.POSITIVE_INFINITY) {
            i13 = (int) (j7 >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i13);
        int i14 = (int) (j13 & 4294967295L);
        if (Float.intBitsToFloat(i14) == Float.POSITIVE_INFINITY) {
            i14 = (int) (j7 & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i14);
        long j14 = this.f69595i;
        int i15 = (int) (j14 >> 32);
        if (Float.intBitsToFloat(i15) == Float.POSITIVE_INFINITY) {
            i15 = (int) (j7 >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i15);
        int i16 = (int) (j14 & 4294967295L);
        if (Float.intBitsToFloat(i16) == Float.POSITIVE_INFINITY) {
            i16 = (int) (j7 & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i16);
        return AbstractC17918w0.m51521i((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), this.f69592f, this.f69593g, this.f69596j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17894k0)) {
            return false;
        }
        C17894k0 c17894k0 = (C17894k0) obj;
        return AbstractC22676k.m65745e(this.f69592f, c17894k0.f69592f) && AbstractC22676k.m65745e(this.f69593g, c17894k0.f69593g) && C16617b.m47187c(this.f69594h, c17894k0.f69594h) && C16617b.m47187c(this.f69595i, c17894k0.f69595i) && this.f69596j == c17894k0.f69596j;
    }

    public final int hashCode() {
        int iHashCode = this.f69592f.hashCode() * 31;
        List list = this.f69593g;
        return Integer.hashCode(this.f69596j) + AbstractC11266d.m30451e(AbstractC11266d.m30451e((iHashCode + (list != null ? list.hashCode() : 0)) * 31, this.f69594h, 31), this.f69595i, 31);
    }

    public final String toString() {
        String str;
        long j7 = this.f69594h;
        String str2 = "";
        if (((((j7 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) C16617b.m47194j(j7)) + ", ";
        } else {
            str = "";
        }
        long j13 = this.f69595i;
        if (((((j13 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) C16617b.m47194j(j13)) + ", ";
        }
        StringBuilder sb4 = new StringBuilder("LinearGradient(colors=");
        sb4.append(this.f69592f);
        sb4.append(", stops=");
        AbstractC17176i.m48511m(", ", str, str2, sb4, this.f69593g);
        sb4.append("tileMode=");
        sb4.append((Object) AbstractC17918w0.m51510L(this.f69596j));
        sb4.append(')');
        return sb4.toString();
    }
}
