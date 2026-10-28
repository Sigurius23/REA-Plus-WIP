package p291l0;

import p088dc.AbstractC11895b;
import p184h5.C16905q1;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p543v4.C35643b;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: l0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C22937b implements InterfaceC22940b2 {

    /* JADX INFO: renamed from: a */
    public final int f90541a;

    /* JADX INFO: renamed from: b */
    public final String f90542b;

    /* JADX INFO: renamed from: c */
    public final C28633k1 f90543c = AbstractC28683x.m87272z(C35643b.f151448e);

    /* JADX INFO: renamed from: d */
    public final C28633k1 f90544d = AbstractC28683x.m87272z(Boolean.TRUE);

    public C22937b(int i13, String str) {
        this.f90541a = i13;
        this.f90542b = str;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: a */
    public final int mo43077a(InterfaceC39171c interfaceC39171c, EnumC39181m enumC39181m) {
        return m66705e().f151449a;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: b */
    public final int mo43078b(InterfaceC39171c interfaceC39171c, EnumC39181m enumC39181m) {
        return m66705e().f151451c;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: c */
    public final int mo43079c(InterfaceC39171c interfaceC39171c) {
        return m66705e().f151452d;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: d */
    public final int mo43080d(InterfaceC39171c interfaceC39171c) {
        return m66705e().f151450b;
    }

    /* JADX INFO: renamed from: e */
    public final C35643b m66705e() {
        return (C35643b) this.f90543c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C22937b) {
            return this.f90541a == ((C22937b) obj).f90541a;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m66706f(C16905q1 c16905q1, int i13) {
        int i14 = this.f90541a;
        if (i13 == 0 || (i13 & i14) != 0) {
            this.f90543c.setValue(c16905q1.f64864a.mo47530g(i14));
            this.f90544d.setValue(Boolean.valueOf(c16905q1.f64864a.mo47535q(i14)));
        }
    }

    public final int hashCode() {
        return this.f90541a;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f90542b);
        sb4.append('(');
        sb4.append(m66705e().f151449a);
        sb4.append(", ");
        sb4.append(m66705e().f151450b);
        sb4.append(", ");
        sb4.append(m66705e().f151451c);
        sb4.append(", ");
        return AbstractC11895b.m31999r(sb4, m66705e().f151452d, ')');
    }
}
