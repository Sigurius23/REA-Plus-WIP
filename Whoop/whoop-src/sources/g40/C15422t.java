package g40;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import com.stripe.android.uicore.elements.AddressFieldConfiguration;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import eg.C13161j;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import n53.C26318e;
import o73.C27648a;
import p127ev.AbstractC13673n;
import p133f1.C13968p1;
import p163g1.C15160u4;
import p163g1.C15184w8;
import p390p1.C28655q;
import p547v8.AbstractC35785b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C15422t implements InterfaceC15455z2, InterfaceC15445x2 {

    /* JADX INFO: renamed from: a */
    public final IdentifierSpec f57939a;

    /* JADX INFO: renamed from: b */
    public final C15413r0 f57940b;

    /* JADX INFO: renamed from: c */
    public final AddressFieldConfiguration f57941c;

    /* JADX INFO: renamed from: d */
    public final AddressFieldConfiguration f57942d;

    /* JADX INFO: renamed from: e */
    public final AddressFieldConfiguration f57943e;

    /* JADX INFO: renamed from: f */
    public final C15435v2 f57944f;

    /* JADX INFO: renamed from: g */
    public final Map f57945g;

    /* JADX INFO: renamed from: h */
    public final boolean f57946h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC15318a0 f57947i;

    /* JADX INFO: renamed from: j */
    public final C13968p1 f57948j;

    /* JADX INFO: renamed from: k */
    public boolean f57949k;

    /* JADX INFO: renamed from: l */
    public final C13045h2 f57950l;

    /* JADX INFO: renamed from: m */
    public final C15366i0 f57951m;

    /* JADX INFO: renamed from: n */
    public final C13045h2 f57952n;

    /* JADX INFO: renamed from: o */
    public final C26318e f57953o;

    /* JADX INFO: renamed from: p */
    public final C26318e f57954p;

    /* JADX INFO: renamed from: q */
    public final C26318e f57955q;

    /* JADX INFO: renamed from: r */
    public final C26318e f57956r;

    /* JADX INFO: renamed from: s */
    public final C26318e f57957s;

    public C15422t(IdentifierSpec identifier, Map map, InterfaceC15452z interactorFactory, Set set, C15413r0 c15413r0, AddressFieldConfiguration addressFieldConfiguration, AddressFieldConfiguration addressFieldConfiguration2, AddressFieldConfiguration addressFieldConfiguration3, C15435v2 c15435v2, Map map2, boolean z4) {
        AbstractC22676k.m65750j(identifier, "identifier");
        AbstractC22676k.m65750j(interactorFactory, "interactorFactory");
        this.f57939a = identifier;
        this.f57940b = c15413r0;
        this.f57941c = addressFieldConfiguration;
        this.f57942d = addressFieldConfiguration2;
        this.f57943e = addressFieldConfiguration3;
        this.f57944f = c15435v2;
        this.f57945g = map2;
        this.f57946h = z4;
        InterfaceC15318a0 interfaceC15318a0Create = interactorFactory.create();
        this.f57947i = interfaceC15318a0Create;
        this.f57948j = interfaceC15318a0Create.mo43530f();
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Boolean.FALSE);
        this.f57950l = c13045h2M36593c;
        IdentifierSpec.Companion.getClass();
        this.f57951m = new C15366i0(IdentifierSpec.Country, c15413r0);
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(m43604u(map, m43605v(this.f57949k, map)));
        this.f57952n = c13045h2M36593c2;
        C26318e c26318eM9509p = AbstractC3269g.m9509p(c13045h2M36593c2, c13045h2M36593c, new C15184w8(3));
        this.f57953o = c26318eM9509p;
        this.f57954p = AbstractC3269g.m9518y(c26318eM9509p, new C15160u4(16));
        this.f57955q = AbstractC3269g.m9518y(c26318eM9509p, new C15160u4(17));
        C26318e c26318eM9518y = AbstractC3269g.m9518y(c26318eM9509p, new C15160u4(18));
        this.f57956r = c26318eM9518y;
        this.f57957s = AbstractC3269g.m9518y(c26318eM9518y, new C15160u4(19));
        interfaceC15318a0Create.mo43528d(new C13161j(this, 18));
    }

    @Override // g40.InterfaceC15455z2
    /* JADX INFO: renamed from: b */
    public final void mo43558b(boolean z4) {
        AbstractC13673n.m38550B(z4, this.f57950l, null);
    }

    @Override // g40.InterfaceC15455z2
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43544f() {
        return this.f57957s;
    }

    @Override // g40.InterfaceC15445x2
    /* JADX INFO: renamed from: i */
    public final void mo43545i(boolean z4, InterfaceC15450y2 interfaceC15450y2, Modifier modifier, Set set, IdentifierSpec identifierSpec, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1686156249);
        int i14 = i13 >> 3;
        AbstractC35785b.m113406b(z4, (C15341e) C27648a.m83597t(this.f57956r, c28655q, 0).getValue(), set, identifierSpec, modifier, c28655q, (i13 & 14) | (i14 & 896) | (i14 & 7168) | ((i13 << 6) & 57344), 0);
        c28655q.m87173q(false);
    }

    /* JADX INFO: renamed from: u */
    public final C15347f m43604u(Map map, AbstractC15387m abstractC15387m) {
        return new C15347f(this.f57939a, map, abstractC15387m, null, this.f57951m, this.f57944f, this.f57945g, this.f57948j.f49807x, this.f57946h, 8);
    }

    /* JADX INFO: renamed from: v */
    public final AbstractC15387m m43605v(boolean z4, Map map) {
        C13968p1 c13968p1 = this.f57948j;
        String str = (String) c13968p1.f49808y;
        AddressFieldConfiguration addressFieldConfiguration = this.f57943e;
        AddressFieldConfiguration addressFieldConfiguration2 = this.f57942d;
        AddressFieldConfiguration addressFieldConfiguration3 = this.f57941c;
        if (str == null) {
            return new C15382l(addressFieldConfiguration3, addressFieldConfiguration2, addressFieldConfiguration);
        }
        if (!z4) {
            IdentifierSpec.Companion.getClass();
            if (map.get(IdentifierSpec.Line1) == null) {
                final int i13 = 1;
                return new C15371j(str, (Set) c13968p1.f49809z, addressFieldConfiguration3, addressFieldConfiguration2, addressFieldConfiguration, new InterfaceC4339a(this) { // from class: g40.s

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C15422t f57925x;

                    {
                        this.f57925x = this;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                C15422t c15422t = this.f57925x;
                                InterfaceC15318a0 interfaceC15318a0 = c15422t.f57947i;
                                String str2 = (String) ((InterfaceC4339a) c15422t.f57940b.f57908i.f104635y).invoke();
                                if (str2 == null) {
                                    str2 = "";
                                }
                                interfaceC15318a0.mo43529e(str2);
                                break;
                            default:
                                C15422t c15422t2 = this.f57925x;
                                InterfaceC15318a0 interfaceC15318a1 = c15422t2.f57947i;
                                String str3 = (String) ((InterfaceC4339a) c15422t2.f57940b.f57908i.f104635y).invoke();
                                if (str3 == null) {
                                    str3 = "";
                                }
                                interfaceC15318a1.mo43529e(str3);
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                });
            }
        }
        final int i14 = 0;
        return new C15377k(str, (Set) c13968p1.f49809z, addressFieldConfiguration3, addressFieldConfiguration2, addressFieldConfiguration, new InterfaceC4339a(this) { // from class: g40.s

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C15422t f57925x;

            {
                this.f57925x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        C15422t c15422t = this.f57925x;
                        InterfaceC15318a0 interfaceC15318a0 = c15422t.f57947i;
                        String str2 = (String) ((InterfaceC4339a) c15422t.f57940b.f57908i.f104635y).invoke();
                        if (str2 == null) {
                            str2 = "";
                        }
                        interfaceC15318a0.mo43529e(str2);
                        break;
                    default:
                        C15422t c15422t2 = this.f57925x;
                        InterfaceC15318a0 interfaceC15318a1 = c15422t2.f57947i;
                        String str3 = (String) ((InterfaceC4339a) c15422t2.f57940b.f57908i.f104635y).invoke();
                        if (str3 == null) {
                            str3 = "";
                        }
                        interfaceC15318a1.mo43529e(str3);
                        break;
                }
                return C23454a0.f92919a;
            }
        });
    }
}
