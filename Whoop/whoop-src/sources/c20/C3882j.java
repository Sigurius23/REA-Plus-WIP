package c20;

import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: c20.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C3882j {

    /* JADX INFO: renamed from: a */
    public final String f15878a;

    /* JADX INFO: renamed from: b */
    public final String f15879b;

    /* JADX INFO: renamed from: c */
    public final boolean f15880c;

    /* JADX INFO: renamed from: d */
    public final String f15881d;

    /* JADX INFO: renamed from: e */
    public final boolean f15882e;

    public C3882j(int i13, String authUrl, String str, String str2) {
        boolean z4 = (i13 & 8) != 0;
        str2 = (i13 & 16) != 0 ? null : str2;
        boolean z13 = (i13 & 32) == 0;
        AbstractC22676k.m65750j(authUrl, "authUrl");
        this.f15878a = authUrl;
        this.f15879b = str;
        this.f15880c = z4;
        this.f15881d = str2;
        this.f15882e = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3882j)) {
            return false;
        }
        C3882j c3882j = (C3882j) obj;
        return AbstractC22676k.m65745e(this.f15878a, c3882j.f15878a) && AbstractC22676k.m65745e(this.f15879b, c3882j.f15879b) && this.f15880c == c3882j.f15880c && AbstractC22676k.m65745e(this.f15881d, c3882j.f15881d) && this.f15882e == c3882j.f15882e;
    }

    public final int hashCode() {
        int iHashCode = this.f15878a.hashCode() * 31;
        String str = this.f15879b;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, false), 31, this.f15880c);
        String str2 = this.f15881d;
        return Boolean.hashCode(this.f15882e) + ((iM8289b + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WebAuthParams(authUrl=", this.f15878a, ", returnUrl=", this.f15879b, ", shouldCancelSource=false, shouldCancelIntentOnUserNavigation=");
        AbstractC38963t7.m124391u(sbM32001t, this.f15880c, ", referrer=", this.f15881d, ", forceInAppWebView=");
        return AbstractC18489d0.m53372m(sbM32001t, this.f15882e, ")");
    }
}
