package p208i2;

import android.graphics.Shader;
import hc3.AbstractC17176i;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC11266d;
import p181h2.C16617b;
import p181h2.C16620e;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i2.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17914u0 extends AbstractC17922y0 {

    /* JADX INFO: renamed from: f */
    public final List f69615f;

    /* JADX INFO: renamed from: g */
    public final List f69616g;

    /* JADX INFO: renamed from: h */
    public final long f69617h;

    /* JADX INFO: renamed from: i */
    public final float f69618i;

    /* JADX INFO: renamed from: j */
    public final int f69619j;

    public C17914u0(List list, ArrayList arrayList, long j7, float f13, int i13) {
        this.f69615f = list;
        this.f69616g = arrayList;
        this.f69617h = j7;
        this.f69618i = f13;
        this.f69619j = i13;
    }

    @Override // p208i2.AbstractC17922y0
    /* JADX INFO: renamed from: b */
    public final Shader mo29549b(long j7) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j13 = this.f69617h;
        if ((9223372034707292159L & j13) == 9205357640488583168L) {
            long jM60656L = AbstractC21598x.m60656L(j7);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jM60656L >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM60656L & 4294967295L));
        } else {
            int i13 = (int) (j13 >> 32);
            if (Float.intBitsToFloat(i13) == Float.POSITIVE_INFINITY) {
                i13 = (int) (j7 >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i13);
            int i14 = (int) (j13 & 4294967295L);
            if (Float.intBitsToFloat(i14) == Float.POSITIVE_INFINITY) {
                i14 = (int) (j7 & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i14);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        float fM47212d = this.f69618i;
        if (fM47212d == Float.POSITIVE_INFINITY) {
            fM47212d = C16620e.m47212d(j7) / 2;
        }
        return AbstractC17918w0.m51523k(jFloatToRawIntBits, fM47212d, this.f69615f, this.f69616g, this.f69619j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17914u0)) {
            return false;
        }
        C17914u0 c17914u0 = (C17914u0) obj;
        return AbstractC22676k.m65745e(this.f69615f, c17914u0.f69615f) && AbstractC22676k.m65745e(this.f69616g, c17914u0.f69616g) && C16617b.m47187c(this.f69617h, c17914u0.f69617h) && this.f69618i == c17914u0.f69618i && this.f69619j == c17914u0.f69619j;
    }

    public final int hashCode() {
        int iHashCode = this.f69615f.hashCode() * 31;
        List list = this.f69616g;
        return Integer.hashCode(this.f69619j) + AbstractC11266d.m30447a(this.f69618i, AbstractC11266d.m30451e((iHashCode + (list != null ? list.hashCode() : 0)) * 31, this.f69617h, 31), 31);
    }

    public final String toString() {
        String str;
        long j7 = this.f69617h;
        String str2 = "";
        if ((9223372034707292159L & j7) != 9205357640488583168L) {
            str = "center=" + ((Object) C16617b.m47194j(j7)) + ", ";
        } else {
            str = "";
        }
        float f13 = this.f69618i;
        if ((Float.floatToRawIntBits(f13) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f13 + ", ";
        }
        StringBuilder sb4 = new StringBuilder("RadialGradient(colors=");
        sb4.append(this.f69615f);
        sb4.append(", stops=");
        AbstractC17176i.m48511m(", ", str, str2, sb4, this.f69616g);
        sb4.append("tileMode=");
        sb4.append((Object) AbstractC17918w0.m51510L(this.f69619j));
        sb4.append(')');
        return sb4.toString();
    }
}
