package p490t0;

import p181h2.C16620e;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17904p0;
import p208i2.C17891j;
import p208i2.C17898m0;
import p208i2.InterfaceC17869a1;
import p370oj.C27973t;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: t0.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C33249f implements InterfaceC17869a1 {
    @Override // p208i2.InterfaceC17869a1
    /* JADX INFO: renamed from: a */
    public final AbstractC17904p0 mo39171a(long j7, EnumC39181m enumC39181m, InterfaceC39171c interfaceC39171c) {
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        C27973t.f112806w.invoke(c17891jM51478a, new C16620e(j7), enumC39181m);
        c17891jM51478a.m51459f();
        return new C17898m0(c17891jM51478a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C33249f c33249f = obj instanceof C33249f ? (C33249f) obj : null;
        C27973t c27973t = C27973t.f112806w;
        return (c33249f != null ? c27973t : null) == c27973t;
    }

    public final int hashCode() {
        return C27973t.f112806w.hashCode();
    }
}
