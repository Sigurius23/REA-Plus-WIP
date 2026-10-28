package y00;

import com.squareup.wire.AbstractC5583n;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38902n0 implements InterfaceC38920p0 {

    /* JADX INFO: renamed from: a */
    public final String f167468a;

    /* JADX INFO: renamed from: b */
    public final String f167469b;

    /* JADX INFO: renamed from: c */
    public final String f167470c;

    /* JADX INFO: renamed from: d */
    public final EnumC38922p2 f167471d;

    public C38902n0(String clientSecret, String str, String str2, EnumC38922p2 enumC38922p2) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        this.f167468a = clientSecret;
        this.f167469b = str;
        this.f167470c = str2;
        this.f167471d = enumC38922p2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38902n0)) {
            return false;
        }
        C38902n0 c38902n0 = (C38902n0) obj;
        return AbstractC22676k.m65745e(this.f167468a, c38902n0.f167468a) && AbstractC22676k.m65745e(this.f167469b, c38902n0.f167469b) && AbstractC22676k.m65745e(this.f167470c, c38902n0.f167470c) && this.f167471d == c38902n0.f167471d;
    }

    public final int hashCode() {
        int iHashCode = this.f167468a.hashCode() * 31;
        String str = this.f167469b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167470c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC38922p2 enumC38922p2 = this.f167471d;
        return iHashCode3 + (enumC38922p2 != null ? enumC38922p2.hashCode() : 0);
    }

    @Override // y00.InterfaceC38920p0
    public final Map toMap() {
        String str = null;
        C38809d5 c38809d5 = new C38809d5(EnumC38828f4.f167089H, null, null, null, null, new C38977v3(this.f167469b, null, 13), null, null, 2080766);
        C23465k c23465k = new C23465k("client_secret", this.f167468a);
        String str2 = this.f167470c;
        C23465k c23465k2 = new C23465k("hosted_surface", str2);
        C23465k c23465k3 = new C23465k("product", "instant_debits");
        C23465k c23465k4 = new C23465k("attach_required", Boolean.TRUE);
        if (str2 != null) {
            EnumC38922p2 enumC38922p2 = this.f167471d;
            str = enumC38922p2 != null ? enumC38922p2.f167549w : "LINK_DISABLED";
        }
        return AbstractC5583n.m16798y(AbstractC25247g0.m73990Y(c23465k, c23465k2, c23465k3, c23465k4, new C23465k("link_mode", str), new C23465k("payment_method_data", c38809d5.mo124325c0())));
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("InstantDebits(clientSecret=", this.f167468a, ", customerEmailAddress=", this.f167469b, ", hostedSurface=");
        sbM32001t.append(this.f167470c);
        sbM32001t.append(", linkMode=");
        sbM32001t.append(this.f167471d);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
