package p490t0;

import hg3.AbstractC17269i;
import j93.AbstractC21478l0;
import p181h2.C16618c;
import p208i2.AbstractC17904p0;
import p208i2.C17900n0;
import p208i2.C17902o0;
import p636y3.EnumC39181m;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C33252i extends AbstractC33244a {
    @Override // p490t0.AbstractC33244a
    /* JADX INFO: renamed from: c */
    public final AbstractC33244a mo64096c(InterfaceC33245b interfaceC33245b, InterfaceC33245b interfaceC33245b2, InterfaceC33245b interfaceC33245b3, InterfaceC33245b interfaceC33245b4) {
        return new C33252i(interfaceC33245b, interfaceC33245b2, interfaceC33245b3, interfaceC33245b4);
    }

    @Override // p490t0.AbstractC33244a
    /* JADX INFO: renamed from: e */
    public final AbstractC17904p0 mo64097e(long j7, float f13, float f14, float f15, float f16, EnumC39181m enumC39181m) {
        if (f13 + f14 + f15 + f16 == 0.0f) {
            return new C17900n0(AbstractC17269i.m48896j(0L, j7));
        }
        C16618c c16618cM48896j = AbstractC17269i.m48896j(0L, j7);
        EnumC39181m enumC39181m2 = EnumC39181m.f168423w;
        float f17 = enumC39181m == enumC39181m2 ? f13 : f14;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f17)) & 4294967295L) | (((long) Float.floatToRawIntBits(f17)) << 32);
        float f18 = enumC39181m == enumC39181m2 ? f14 : f13;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f18)) & 4294967295L) | (((long) Float.floatToRawIntBits(f18)) << 32);
        float f19 = enumC39181m == enumC39181m2 ? f15 : f16;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f19)) << 32) | (((long) Float.floatToRawIntBits(f19)) & 4294967295L);
        float f24 = enumC39181m == enumC39181m2 ? f16 : f15;
        return new C17902o0(AbstractC21478l0.m60425c(c16618cM48896j, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(f24)) << 32) | (((long) Float.floatToRawIntBits(f24)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33252i)) {
            return false;
        }
        C33252i c33252i = (C33252i) obj;
        return AbstractC22676k.m65745e(m105482i(), c33252i.m105482i()) && AbstractC22676k.m65745e(m105481h(), c33252i.m105481h()) && AbstractC22676k.m65745e(m105479f(), c33252i.m105479f()) && AbstractC22676k.m65745e(m105480g(), c33252i.m105480g());
    }

    public final int hashCode() {
        return m105480g().hashCode() + ((m105479f().hashCode() + ((m105481h().hashCode() + (m105482i().hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + m105482i() + ", topEnd = " + m105481h() + ", bottomEnd = " + m105479f() + ", bottomStart = " + m105480g() + ')';
    }
}
