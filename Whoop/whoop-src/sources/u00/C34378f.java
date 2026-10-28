package u00;

import com.stripe.android.p056ui.core.elements.SelectorIcon;
import com.stripe.android.p056ui.core.elements.SharedDataSpec;
import com.whoop.android.R;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p479s4.AbstractC32128i;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29810c;
import t00.C33254a;
import v00.InterfaceC35457b0;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: u00.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C34378f {

    /* JADX INFO: renamed from: a */
    public final String f144467a;

    /* JADX INFO: renamed from: b */
    public final String f144468b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c f144469c;

    /* JADX INFO: renamed from: d */
    public final int f144470d;

    /* JADX INFO: renamed from: e */
    public final Integer f144471e;

    /* JADX INFO: renamed from: f */
    public final String f144472f;

    /* JADX INFO: renamed from: g */
    public final String f144473g;

    /* JADX INFO: renamed from: h */
    public final boolean f144474h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC41211c f144475i;

    /* JADX INFO: renamed from: j */
    public final Integer f144476j;

    /* JADX WARN: Illegal instructions before constructor call */
    public C34378f(String code, String str, int i13, int i14, boolean z4, C41210b c41210b, int i15) {
        Integer numValueOf = Integer.valueOf(R.drawable.stripe_ic_paymentsheet_pm_bank_outlined);
        String syntheticCode = (i15 & 2) != 0 ? code : str;
        boolean z13 = (i15 & 32) != 0 ? false : z4;
        C41210b c41210b2 = (i15 & 256) != 0 ? null : c41210b;
        Integer num = (i15 & 512) != 0 ? null : numValueOf;
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(syntheticCode, "syntheticCode");
        this(code, syntheticCode, AbstractC32128i.m100054h(i13), i14, (Integer) null, (String) null, (String) null, z13, c41210b2, num);
    }

    /* JADX INFO: renamed from: a */
    public final C33254a m108679a(C29810c c29810c) {
        return new C33254a(this.f144469c, true, this.f144470d, this.f144471e, this.f144472f, this.f144473g, this.f144474h, c29810c != null ? c29810c.f121867x : null, this.f144476j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34378f)) {
            return false;
        }
        C34378f c34378f = (C34378f) obj;
        return AbstractC22676k.m65745e(this.f144467a, c34378f.f144467a) && AbstractC22676k.m65745e(this.f144468b, c34378f.f144468b) && AbstractC22676k.m65745e(this.f144469c, c34378f.f144469c) && this.f144470d == c34378f.f144470d && AbstractC22676k.m65745e(this.f144471e, c34378f.f144471e) && AbstractC22676k.m65745e(this.f144472f, c34378f.f144472f) && AbstractC22676k.m65745e(this.f144473g, c34378f.f144473g) && this.f144474h == c34378f.f144474h && AbstractC22676k.m65745e(this.f144475i, c34378f.f144475i) && AbstractC22676k.m65745e(this.f144476j, c34378f.f144476j);
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.f144470d, (this.f144469c.hashCode() + AbstractC11266d.m30450d(this.f144467a.hashCode() * 31, 31, this.f144468b)) * 31, 31);
        Integer num = this.f144471e;
        int iHashCode = (iM30448b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f144472f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f144473g;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f144474h);
        InterfaceC41211c interfaceC41211c = this.f144475i;
        int iHashCode3 = (iM8289b + (interfaceC41211c == null ? 0 : interfaceC41211c.hashCode())) * 31;
        Integer num2 = this.f144476j;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SupportedPaymentMethod(code=", this.f144467a, ", syntheticCode=", this.f144468b, ", displayName=");
        sbM32001t.append(this.f144469c);
        sbM32001t.append(", iconResource=");
        sbM32001t.append(this.f144470d);
        sbM32001t.append(", iconResourceNight=");
        AbstractC13673n.m38577x(this.f144471e, ", lightThemeIconUrl=", this.f144472f, ", darkThemeIconUrl=", sbM32001t);
        AbstractC38963t7.m124390t(sbM32001t, this.f144473g, ", iconRequiresTinting=", this.f144474h, ", subtitle=");
        sbM32001t.append(this.f144475i);
        sbM32001t.append(", outlinedIconResource=");
        sbM32001t.append(this.f144476j);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C34378f(InterfaceC35457b0 paymentMethodDefinition, SharedDataSpec sharedDataSpec, int i13, int i14, Integer num, boolean z4, C41210b c41210b, Integer num2, int i15) {
        SelectorIcon selectorIcon;
        SelectorIcon selectorIcon2;
        String darkThemePng = null;
        SharedDataSpec sharedDataSpec2 = (i15 & 2) != 0 ? null : sharedDataSpec;
        boolean z13 = (i15 & 32) != 0 ? false : z4;
        C41210b c41210b2 = (i15 & 64) != 0 ? null : c41210b;
        Integer num3 = (i15 & 128) != 0 ? null : num2;
        AbstractC22676k.m65750j(paymentMethodDefinition, "paymentMethodDefinition");
        String str = paymentMethodDefinition.getType().f167132w;
        C41210b c41210bM100054h = AbstractC32128i.m100054h(i13);
        String lightThemePng = (sharedDataSpec2 == null || (selectorIcon2 = sharedDataSpec2.getSelectorIcon()) == null) ? null : selectorIcon2.getLightThemePng();
        if (sharedDataSpec2 != null && (selectorIcon = sharedDataSpec2.getSelectorIcon()) != null) {
            darkThemePng = selectorIcon.getDarkThemePng();
        }
        this(str, c41210bM100054h, i14, num, lightThemePng, darkThemePng, z13, c41210b2, num3, 2);
    }

    public C34378f(String code, String syntheticCode, InterfaceC41211c interfaceC41211c, int i13, Integer num, String str, String str2, boolean z4, InterfaceC41211c interfaceC41211c2, Integer num2) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(syntheticCode, "syntheticCode");
        this.f144467a = code;
        this.f144468b = syntheticCode;
        this.f144469c = interfaceC41211c;
        this.f144470d = i13;
        this.f144471e = num;
        this.f144472f = str;
        this.f144473g = str2;
        this.f144474h = z4;
        this.f144475i = interfaceC41211c2;
        this.f144476j = num2;
    }

    public /* synthetic */ C34378f(String str, InterfaceC41211c interfaceC41211c, int i13, Integer num, String str2, String str3, boolean z4, InterfaceC41211c interfaceC41211c2, Integer num2, int i14) {
        this(str, str, interfaceC41211c, i13, num, str2, str3, z4, (i14 & 256) != 0 ? null : interfaceC41211c2, (i14 & 512) != 0 ? null : num2);
    }
}
