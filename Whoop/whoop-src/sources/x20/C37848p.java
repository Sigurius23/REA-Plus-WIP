package x20;

import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;

/* JADX INFO: renamed from: x20.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C37848p {

    /* JADX INFO: renamed from: a */
    public final long f162023a;

    /* JADX INFO: renamed from: b */
    public final int f162024b;

    /* JADX INFO: renamed from: c */
    public final EnumC37847o f162025c;

    /* JADX INFO: renamed from: d */
    public final boolean f162026d;

    public C37848p(long j7, int i13, EnumC37847o pollingState, boolean z4) {
        AbstractC22676k.m65750j(pollingState, "pollingState");
        this.f162023a = j7;
        this.f162024b = i13;
        this.f162025c = pollingState;
        this.f162026d = z4;
    }

    /* JADX INFO: renamed from: a */
    public static C37848p m121377a(C37848p c37848p, long j7, EnumC37847o enumC37847o, boolean z4, int i13) {
        if ((i13 & 1) != 0) {
            j7 = c37848p.f162023a;
        }
        long j13 = j7;
        int i14 = c37848p.f162024b;
        if ((i13 & 4) != 0) {
            enumC37847o = c37848p.f162025c;
        }
        EnumC37847o pollingState = enumC37847o;
        if ((i13 & 8) != 0) {
            z4 = c37848p.f162026d;
        }
        c37848p.getClass();
        AbstractC22676k.m65750j(pollingState, "pollingState");
        return new C37848p(j13, i14, pollingState, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37848p)) {
            return false;
        }
        C37848p c37848p = (C37848p) obj;
        return Duration.m134267equalsimpl0(this.f162023a, c37848p.f162023a) && this.f162024b == c37848p.f162024b && this.f162025c == c37848p.f162025c && this.f162026d == c37848p.f162026d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f162026d) + ((this.f162025c.hashCode() + AbstractC11266d.m30448b(this.f162024b, Duration.m134283hashCodeimpl(this.f162023a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM30467u = AbstractC11266d.m30467u(this.f162024b, "PollingUiState(durationRemaining=", Duration.m134302toStringimpl(this.f162023a), ", ctaText=", ", pollingState=");
        sbM30467u.append(this.f162025c);
        sbM30467u.append(", shouldShowQrCode=");
        sbM30467u.append(this.f162026d);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }
}
