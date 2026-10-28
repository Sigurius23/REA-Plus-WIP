package x20;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;

/* JADX INFO: renamed from: x20.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C37851s {

    /* JADX INFO: renamed from: a */
    public final String f162034a;

    /* JADX INFO: renamed from: b */
    public final long f162035b;

    /* JADX INFO: renamed from: c */
    public final long f162036c;

    /* JADX INFO: renamed from: d */
    public final int f162037d;

    /* JADX INFO: renamed from: e */
    public final String f162038e;

    /* JADX INFO: renamed from: f */
    public final String f162039f;

    public C37851s(String clientSecret, long j7, long j13, int i13, String str, String str2) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        this.f162034a = clientSecret;
        this.f162035b = j7;
        this.f162036c = j13;
        this.f162037d = i13;
        this.f162038e = str;
        this.f162039f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37851s)) {
            return false;
        }
        C37851s c37851s = (C37851s) obj;
        return AbstractC22676k.m65745e(this.f162034a, c37851s.f162034a) && Duration.m134267equalsimpl0(this.f162035b, c37851s.f162035b) && Duration.m134267equalsimpl0(this.f162036c, c37851s.f162036c) && this.f162037d == c37851s.f162037d && AbstractC22676k.m65745e(this.f162038e, c37851s.f162038e) && AbstractC22676k.m65745e(this.f162039f, c37851s.f162039f);
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.f162037d, (Duration.m134283hashCodeimpl(this.f162036c) + ((Duration.m134283hashCodeimpl(this.f162035b) + (this.f162034a.hashCode() * 31)) * 31)) * 31, 31);
        String str = this.f162038e;
        int iHashCode = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f162039f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String strM134302toStringimpl = Duration.m134302toStringimpl(this.f162035b);
        String strM134302toStringimpl2 = Duration.m134302toStringimpl(this.f162036c);
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Args(clientSecret=", this.f162034a, ", timeLimit=", strM134302toStringimpl, ", initialDelay=");
        AbstractC11266d.m30470x(this.f162037d, strM134302toStringimpl2, ", ctaText=", ", stripeAccountId=", sbM32001t);
        return AbstractC11266d.m30464r(sbM32001t, this.f162038e, ", qrCodeUrl=", this.f162039f, ")");
    }
}
