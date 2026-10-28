package y00;

import com.squareup.wire.AbstractC5583n;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38911o0 implements InterfaceC38920p0 {

    /* JADX INFO: renamed from: a */
    public final String f167493a;

    /* JADX INFO: renamed from: b */
    public final String f167494b;

    /* JADX INFO: renamed from: c */
    public final String f167495c;

    /* JADX INFO: renamed from: d */
    public final String f167496d;

    /* JADX INFO: renamed from: e */
    public final EnumC38922p2 f167497e;

    public C38911o0(String clientSecret, String customerName, String str, String str2, EnumC38922p2 enumC38922p2) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(customerName, "customerName");
        this.f167493a = clientSecret;
        this.f167494b = customerName;
        this.f167495c = str;
        this.f167496d = str2;
        this.f167497e = enumC38922p2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38911o0)) {
            return false;
        }
        C38911o0 c38911o0 = (C38911o0) obj;
        return AbstractC22676k.m65745e(this.f167493a, c38911o0.f167493a) && AbstractC22676k.m65745e(this.f167494b, c38911o0.f167494b) && AbstractC22676k.m65745e(this.f167495c, c38911o0.f167495c) && AbstractC22676k.m65745e(this.f167496d, c38911o0.f167496d) && this.f167497e == c38911o0.f167497e;
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f167493a.hashCode() * 31, 31, this.f167494b);
        String str = this.f167495c;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167496d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC38922p2 enumC38922p2 = this.f167497e;
        return iHashCode2 + (enumC38922p2 != null ? enumC38922p2.hashCode() : 0);
    }

    @Override // y00.InterfaceC38920p0
    public final Map toMap() {
        String str;
        C38809d5 c38809d5 = new C38809d5(EnumC38828f4.f167119l0, null, null, null, null, new C38977v3(this.f167495c, this.f167494b, 9), null, null, 1916926);
        C23465k c23465k = new C23465k("client_secret", this.f167493a);
        String str2 = this.f167496d;
        C23465k c23465k2 = new C23465k("hosted_surface", str2);
        if (str2 != null) {
            EnumC38922p2 enumC38922p2 = this.f167497e;
            str = enumC38922p2 != null ? enumC38922p2.f167549w : "LINK_DISABLED";
        } else {
            str = null;
        }
        return AbstractC5583n.m16798y(AbstractC25247g0.m73990Y(c23465k, c23465k2, new C23465k("link_mode", str), new C23465k("payment_method_data", c38809d5.mo124325c0())));
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("USBankAccount(clientSecret=", this.f167493a, ", customerName=", this.f167494b, ", customerEmailAddress=");
        AbstractC11266d.m30444B(sbM32001t, this.f167495c, ", hostedSurface=", this.f167496d, ", linkMode=");
        sbM32001t.append(this.f167497e);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
