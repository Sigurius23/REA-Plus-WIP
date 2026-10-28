package v10;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;
import y00.C38899m6;

/* JADX INFO: renamed from: v10.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C35527c {

    /* JADX INFO: renamed from: a */
    public final String f151157a;

    /* JADX INFO: renamed from: b */
    public final int f151158b;

    /* JADX INFO: renamed from: c */
    public final boolean f151159c;

    /* JADX INFO: renamed from: d */
    public final String f151160d;

    /* JADX INFO: renamed from: e */
    public final C38899m6 f151161e;

    /* JADX INFO: renamed from: f */
    public final String f151162f;

    public C35527c(String clientSecret, int i13, boolean z4, String str, C38899m6 c38899m6, String str2) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        this.f151157a = clientSecret;
        this.f151158b = i13;
        this.f151159c = z4;
        this.f151160d = str;
        this.f151161e = c38899m6;
        this.f151162f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35527c)) {
            return false;
        }
        C35527c c35527c = (C35527c) obj;
        return AbstractC22676k.m65745e(this.f151157a, c35527c.f151157a) && this.f151158b == c35527c.f151158b && this.f151159c == c35527c.f151159c && AbstractC22676k.m65745e(this.f151160d, c35527c.f151160d) && AbstractC22676k.m65745e(this.f151161e, c35527c.f151161e) && AbstractC22676k.m65745e(this.f151162f, c35527c.f151162f);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.f151158b, this.f151157a.hashCode() * 31, 31), 31, this.f151159c);
        String str = this.f151160d;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        C38899m6 c38899m6 = this.f151161e;
        int iHashCode2 = (iHashCode + (c38899m6 == null ? 0 : c38899m6.hashCode())) * 31;
        String str2 = this.f151162f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM30467u = AbstractC11266d.m30467u(this.f151158b, "Validated(clientSecret=", this.f151157a, ", flowOutcome=", ", canCancelSource=");
        AbstractC38963t7.m124391u(sbM30467u, this.f151159c, ", sourceId=", this.f151160d, ", source=");
        sbM30467u.append(this.f151161e);
        sbM30467u.append(", stripeAccountId=");
        sbM30467u.append(this.f151162f);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }
}
