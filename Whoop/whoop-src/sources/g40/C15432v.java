package g40;

import c93.InterfaceC4339a;
import com.stripe.android.uicore.elements.AddressFieldConfiguration;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import java.util.Map;
import java.util.Set;
import l83.C23470p;
import m63.C25126d;
import no.nordicsemi.android.dfu.DfuBaseService;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: g40.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C15432v implements InterfaceC15359h {

    /* JADX INFO: renamed from: a */
    public final IdentifierSpec f58005a;

    /* JADX INFO: renamed from: b */
    public final C23470p f58006b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13037f2 f58007c;

    /* JADX INFO: renamed from: d */
    public final C15366i0 f58008d;

    /* JADX INFO: renamed from: e */
    public final boolean f58009e;

    public C15432v(IdentifierSpec identifier, final Map map, final Set countryCodes, C15413r0 c15413r0, AddressFieldConfiguration addressFieldConfiguration, AddressFieldConfiguration addressFieldConfiguration2, AddressFieldConfiguration addressFieldConfiguration3, final C15435v2 c15435v2, final Map map2, final InterfaceC15452z interactorFactory, boolean z4, int i13) {
        final C15413r0 c15413r1;
        if ((i13 & 8) != 0) {
            C25126d c25126d = new C25126d(countryCodes, null, null, 62);
            IdentifierSpec.Companion.getClass();
            c15413r1 = new C15413r0(c25126d, (String) map.get(IdentifierSpec.Country));
        } else {
            c15413r1 = c15413r0;
        }
        final AddressFieldConfiguration phoneNumberConfig = (i13 & 16) != 0 ? AddressFieldConfiguration.HIDDEN : addressFieldConfiguration;
        AddressFieldConfiguration nameConfig = (i13 & 32) != 0 ? AddressFieldConfiguration.HIDDEN : addressFieldConfiguration2;
        final AddressFieldConfiguration emailConfig = (i13 & 64) != 0 ? AddressFieldConfiguration.HIDDEN : addressFieldConfiguration3;
        final boolean z13 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z4;
        AbstractC22676k.m65750j(identifier, "identifier");
        AbstractC22676k.m65750j(countryCodes, "countryCodes");
        AbstractC22676k.m65750j(phoneNumberConfig, "phoneNumberConfig");
        AbstractC22676k.m65750j(nameConfig, "nameConfig");
        AbstractC22676k.m65750j(emailConfig, "emailConfig");
        AbstractC22676k.m65750j(interactorFactory, "interactorFactory");
        this.f58005a = identifier;
        final AddressFieldConfiguration addressFieldConfiguration4 = nameConfig;
        this.f58006b = AbstractC30060g.m92088H(new InterfaceC4339a() { // from class: g40.u
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                return new C15422t(this.f57986w.f58005a, map, interactorFactory, countryCodes, c15413r1, phoneNumberConfig, addressFieldConfiguration4, emailConfig, c15435v2, map2, z13);
            }
        });
        this.f58007c = m43608k().f57956r;
        this.f58008d = m43608k().f57951m;
        this.f58009e = true;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43531a() {
        return this.f58005a;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: b */
    public final void mo43537b(boolean z4) {
        m43608k().mo43558b(z4);
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43532c() {
        return null;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: d */
    public final boolean mo43533d() {
        return this.f58009e;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: e */
    public final InterfaceC13037f2 mo43535e() {
        return m43608k().f57954p;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43538f() {
        return m43608k().f57955q;
    }

    @Override // g40.InterfaceC15359h
    /* JADX INFO: renamed from: g */
    public final InterfaceC13037f2 mo43553g() {
        return this.f58007c;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: h */
    public final void mo43539h(Map rawValuesMap) {
        AbstractC22676k.m65750j(rawValuesMap, "rawValuesMap");
        C15422t c15422tM43608k = m43608k();
        c15422tM43608k.getClass();
        C13045h2 c13045h2 = c15422tM43608k.f57952n;
        C15347f c15347fM43604u = c15422tM43608k.m43604u(rawValuesMap, c15422tM43608k.m43605v(c15422tM43608k.f57949k, rawValuesMap));
        c13045h2.getClass();
        c13045h2.m36571k(null, c15347fM43604u);
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: i */
    public final InterfaceC15455z2 mo43540i() {
        return m43608k();
    }

    @Override // g40.InterfaceC15359h
    /* JADX INFO: renamed from: j */
    public final C15366i0 mo43554j() {
        return this.f58008d;
    }

    /* JADX INFO: renamed from: k */
    public final C15422t m43608k() {
        return (C15422t) this.f58006b.getValue();
    }
}
