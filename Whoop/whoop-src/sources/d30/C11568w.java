package d30;

import c93.InterfaceC4339a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: d30.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C11568w {

    /* JADX INFO: renamed from: a */
    public final String f37330a;

    /* JADX INFO: renamed from: b */
    public final String f37331b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c f37332c;

    /* JADX INFO: renamed from: d */
    public final int f37333d;

    /* JADX INFO: renamed from: e */
    public final Integer f37334e;

    /* JADX INFO: renamed from: f */
    public final String f37335f;

    /* JADX INFO: renamed from: g */
    public final String f37336g;

    /* JADX INFO: renamed from: h */
    public final boolean f37337h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC41211c f37338i;

    /* JADX INFO: renamed from: j */
    public final String f37339j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC4339a f37340k;

    /* JADX INFO: renamed from: l */
    public final Integer f37341l;

    public C11568w(String code, String syntheticCode, InterfaceC41211c displayName, int i13, Integer num, String str, String str2, boolean z4, InterfaceC41211c interfaceC41211c, String str3, InterfaceC4339a interfaceC4339a, Integer num2) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(syntheticCode, "syntheticCode");
        AbstractC22676k.m65750j(displayName, "displayName");
        this.f37330a = code;
        this.f37331b = syntheticCode;
        this.f37332c = displayName;
        this.f37333d = i13;
        this.f37334e = num;
        this.f37335f = str;
        this.f37336g = str2;
        this.f37337h = z4;
        this.f37338i = interfaceC41211c;
        this.f37339j = str3;
        this.f37340k = interfaceC4339a;
        this.f37341l = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11568w)) {
            return false;
        }
        C11568w c11568w = (C11568w) obj;
        return AbstractC22676k.m65745e(this.f37330a, c11568w.f37330a) && AbstractC22676k.m65745e(this.f37331b, c11568w.f37331b) && AbstractC22676k.m65745e(this.f37332c, c11568w.f37332c) && this.f37333d == c11568w.f37333d && AbstractC22676k.m65745e(this.f37334e, c11568w.f37334e) && AbstractC22676k.m65745e(this.f37335f, c11568w.f37335f) && AbstractC22676k.m65745e(this.f37336g, c11568w.f37336g) && this.f37337h == c11568w.f37337h && AbstractC22676k.m65745e(this.f37338i, c11568w.f37338i) && AbstractC22676k.m65745e(this.f37339j, c11568w.f37339j) && AbstractC22676k.m65745e(this.f37340k, c11568w.f37340k) && AbstractC22676k.m65745e(this.f37341l, c11568w.f37341l);
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.f37333d, (this.f37332c.hashCode() + AbstractC11266d.m30450d(this.f37330a.hashCode() * 31, 31, this.f37331b)) * 31, 31);
        Integer num = this.f37334e;
        int iHashCode = (iM30448b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f37335f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f37336g;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f37337h);
        InterfaceC41211c interfaceC41211c = this.f37338i;
        int iHashCode3 = (iM8289b + (interfaceC41211c == null ? 0 : interfaceC41211c.hashCode())) * 31;
        String str3 = this.f37339j;
        int iM94755d = AbstractC30802r.m94755d((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f37340k);
        Integer num2 = this.f37341l;
        return iM94755d + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DisplayablePaymentMethod(code=", this.f37330a, ", syntheticCode=", this.f37331b, ", displayName=");
        sbM32001t.append(this.f37332c);
        sbM32001t.append(", iconResource=");
        sbM32001t.append(this.f37333d);
        sbM32001t.append(", iconResourceNight=");
        AbstractC13673n.m38577x(this.f37334e, ", lightThemeIconUrl=", this.f37335f, ", darkThemeIconUrl=", sbM32001t);
        AbstractC38963t7.m124390t(sbM32001t, this.f37336g, ", iconRequiresTinting=", this.f37337h, ", subtitle=");
        sbM32001t.append(this.f37338i);
        sbM32001t.append(", promoBadge=");
        sbM32001t.append(this.f37339j);
        sbM32001t.append(", onClick=");
        sbM32001t.append(this.f37340k);
        sbM32001t.append(", outlinedIconResource=");
        sbM32001t.append(this.f37341l);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C11568w(String str, C41210b c41210b, int i13, InterfaceC41211c interfaceC41211c, InterfaceC4339a interfaceC4339a) {
        this(str, str, c41210b, i13, null, null, null, false, interfaceC41211c, null, interfaceC4339a, null);
    }
}
