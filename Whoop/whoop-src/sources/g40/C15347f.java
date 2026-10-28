package g40;

import a01.C0084d;
import b30.C2624t0;
import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.AddressFieldConfiguration;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import e40.C12688b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import eg.C13161j;
import f01.C13857f;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import m63.C25126d;
import m83.C25235a0;
import m83.C25271y;
import n53.C26318e;
import p127ev.AbstractC13673n;
import p163g1.C15160u4;
import p479s4.AbstractC32128i;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import qg3.C30352d;
import x30.C37895i;

/* JADX INFO: renamed from: g40.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C15347f extends AbstractC15321a3 implements InterfaceC15359h {

    /* JADX INFO: renamed from: b */
    public Map f57662b;

    /* JADX INFO: renamed from: c */
    public final AbstractC15387m f57663c;

    /* JADX INFO: renamed from: d */
    public final C15366i0 f57664d;

    /* JADX INFO: renamed from: e */
    public final boolean f57665e;

    /* JADX INFO: renamed from: f */
    public final boolean f57666f;

    /* JADX INFO: renamed from: g */
    public final boolean f57667g;

    /* JADX INFO: renamed from: h */
    public final C13045h2 f57668h;

    /* JADX INFO: renamed from: i */
    public final C15319a1 f57669i;

    /* JADX INFO: renamed from: j */
    public final C15333c3 f57670j;

    /* JADX INFO: renamed from: k */
    public final C37895i f57671k;

    /* JADX INFO: renamed from: l */
    public final C15320a2 f57672l;

    /* JADX INFO: renamed from: m */
    public final LinkedHashMap f57673m;

    /* JADX INFO: renamed from: n */
    public final C30352d f57674n;

    /* JADX INFO: renamed from: o */
    public Boolean f57675o;

    /* JADX INFO: renamed from: p */
    public final C26318e f57676p;

    /* JADX INFO: renamed from: q */
    public final C15341e f57677q;

    /* JADX INFO: renamed from: r */
    public final C13081r1 f57678r;

    public C15347f(IdentifierSpec _identifier, Map rawValuesMap, AbstractC15387m abstractC15387m, Set set, C15366i0 c15366i0, C15435v2 c15435v2, Map map, boolean z4, boolean z13, int i13) {
        C15366i0 countryElement;
        boolean z14;
        C13081r1 c13081r1;
        AbstractC15387m addressInputMode = (i13 & 4) != 0 ? new C15382l((AddressFieldConfiguration) null, (AddressFieldConfiguration) null, 7) : abstractC15387m;
        Set countryCodes = (i13 & 8) != 0 ? C25235a0.f99113w : set;
        if ((i13 & 16) != 0) {
            IdentifierSpec.Companion.getClass();
            countryElement = new C15366i0(IdentifierSpec.Country, new C15413r0(new C25126d(countryCodes, null, null, 62), (String) rawValuesMap.get(IdentifierSpec.Country)));
        } else {
            countryElement = c15366i0;
        }
        if ((i13 & 128) != 0) {
            try {
                Class.forName("com.google.android.libraries.places.api.Places");
                z14 = true;
            } catch (Exception unused) {
                z14 = false;
            }
        } else {
            z14 = z4;
        }
        boolean z15 = (i13 & 256) != 0 ? false : z13;
        AbstractC22676k.m65750j(_identifier, "_identifier");
        AbstractC22676k.m65750j(rawValuesMap, "rawValuesMap");
        AbstractC22676k.m65750j(addressInputMode, "addressInputMode");
        AbstractC22676k.m65750j(countryCodes, "countryCodes");
        AbstractC22676k.m65750j(countryElement, "countryElement");
        C15413r0 c15413r0 = countryElement.f57766c;
        super(_identifier);
        this.f57662b = rawValuesMap;
        this.f57663c = addressInputMode;
        this.f57664d = countryElement;
        this.f57665e = z14;
        this.f57666f = z15;
        this.f57667g = true;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Boolean.FALSE);
        this.f57668h = c13045h2M36593c;
        Map map2 = this.f57662b;
        IdentifierSpec.Companion.getClass();
        this.f57669i = new C15319a1(null, (String) map2.get(IdentifierSpec.Email), 5);
        IdentifierSpec identifierSpec = IdentifierSpec.Name;
        C25271y c25271y = C25271y.f99162w;
        C41210b c41210bM100064s = AbstractC32128i.m100064s(R.string.stripe_address_label_full_name, new Object[0], c25271y);
        AddressFieldConfiguration addressFieldConfigurationMo43582s = addressInputMode.mo43582s();
        AddressFieldConfiguration addressFieldConfiguration = AddressFieldConfiguration.OPTIONAL;
        this.f57670j = new C15333c3(identifierSpec, new C15351f3(new C15339d3(c41210bM100064s, 0, 0, null, addressFieldConfigurationMo43582s == addressFieldConfiguration, 14), (String) this.f57662b.get(IdentifierSpec.Name), null, 4));
        IdentifierSpec identifierSpec2 = IdentifierSpec.OneLineAddress;
        C41210b c41210bM100064s2 = AbstractC32128i.m100064s(R.string.stripe_address_label_address, new Object[0], c25271y);
        C15371j c15371j = addressInputMode instanceof C15371j ? (C15371j) addressInputMode : null;
        this.f57671k = new C37895i(identifierSpec2, c41210bM100064s2, c15371j != null ? c15371j.f57776F : null);
        IdentifierSpec identifierSpec3 = IdentifierSpec.Phone;
        String str = (String) this.f57662b.get(IdentifierSpec.Phone);
        this.f57672l = new C15320a2(identifierSpec3, C15383l0.m43593a(str == null ? "" : str, 6, null, addressInputMode.mo43583x() == addressFieldConfiguration, addressInputMode.mo43583x() != AddressFieldConfiguration.REQUIRED));
        this.f57673m = new LinkedHashMap();
        Object obj = C12688b.f43390a;
        this.f57674n = new C30352d(13, (byte) 0);
        C26318e c26318e = c15413r0.f57908i;
        C26318e c26318eM9484M = AbstractC3269g.m9484M(c26318e, new C13161j(this, 17));
        C26318e c26318eM9511r = AbstractC3269g.m9511r(c26318e, c26318eM9484M, AbstractC3269g.m9509p(c26318eM9484M, (c15435v2 == null || (c13081r1 = (C13081r1) c15435v2.f58019b.f58003e) == null) ? AbstractC3269g.m9493Z(null) : c13081r1, new C13857f(16, this, map)), AbstractC3269g.m9509p(c26318e, AbstractC3269g.m9518y(c26318eM9484M, new C15160u4(11)), new C0084d(this, c15435v2, map, 15)), c13045h2M36593c, new C2624t0(this, 1));
        this.f57676p = c26318eM9511r;
        C15341e c15341e = new C15341e(c26318eM9511r);
        this.f57677q = c15341e;
        this.f57678r = AbstractC3269g.m9493Z(c15341e);
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: b */
    public final void mo43537b(boolean z4) {
        AbstractC13673n.m38550B(z4, this.f57668h, null);
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43532c() {
        return null;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: d */
    public final boolean mo43533d() {
        return this.f57667g;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: e */
    public final InterfaceC13037f2 mo43535e() {
        return AbstractC3269g.m9518y(this.f57676p, new C15160u4(12));
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43538f() {
        return AbstractC3269g.m9518y(this.f57676p, new C15160u4(13));
    }

    @Override // g40.InterfaceC15359h
    /* JADX INFO: renamed from: g */
    public final InterfaceC13037f2 mo43553g() {
        return this.f57678r;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: h */
    public final void mo43539h(Map rawValuesMap) {
        AbstractC22676k.m65750j(rawValuesMap, "rawValuesMap");
        this.f57662b = rawValuesMap;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: i */
    public final InterfaceC15455z2 mo43540i() {
        return this.f57677q;
    }

    @Override // g40.InterfaceC15359h
    /* JADX INFO: renamed from: j */
    public final C15366i0 mo43554j() {
        return this.f57664d;
    }
}
