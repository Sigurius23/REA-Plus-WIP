package p291l0;

import p088dc.AbstractC11895b;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l0.z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23018z1 implements InterfaceC22940b2 {

    /* JADX INFO: renamed from: a */
    public final String f90760a;

    /* JADX INFO: renamed from: b */
    public final C28633k1 f90761b;

    public C23018z1(C23014y0 c23014y0, String str) {
        this.f90760a = str;
        this.f90761b = AbstractC28683x.m87272z(c23014y0);
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: a */
    public final int mo43077a(InterfaceC39171c interfaceC39171c, EnumC39181m enumC39181m) {
        return m66780e().f90751a;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: b */
    public final int mo43078b(InterfaceC39171c interfaceC39171c, EnumC39181m enumC39181m) {
        return m66780e().f90753c;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: c */
    public final int mo43079c(InterfaceC39171c interfaceC39171c) {
        return m66780e().f90754d;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: d */
    public final int mo43080d(InterfaceC39171c interfaceC39171c) {
        return m66780e().f90752b;
    }

    /* JADX INFO: renamed from: e */
    public final C23014y0 m66780e() {
        return (C23014y0) this.f90761b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C23018z1) {
            return AbstractC22676k.m65745e(m66780e(), ((C23018z1) obj).m66780e());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m66781f(C23014y0 c23014y0) {
        this.f90761b.setValue(c23014y0);
    }

    public final int hashCode() {
        return this.f90760a.hashCode();
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f90760a);
        sb4.append("(left=");
        sb4.append(m66780e().f90751a);
        sb4.append(", top=");
        sb4.append(m66780e().f90752b);
        sb4.append(", right=");
        sb4.append(m66780e().f90753c);
        sb4.append(", bottom=");
        return AbstractC11895b.m31999r(sb4, m66780e().f90754d, ')');
    }
}
