package x30;

import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.AddressFieldConfiguration;
import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.InterfaceC13037f2;
import g40.C15347f;
import g40.C15366i0;
import g40.C15382l;
import g40.C15413r0;
import g40.C15420s2;
import g40.C15432v;
import g40.C15435v2;
import g40.InterfaceC15359h;
import g40.InterfaceC15452z;
import g40.InterfaceC15455z2;
import java.util.Map;
import java.util.Set;
import m63.C25126d;
import n53.C26318e;
import no.nordicsemi.android.dfu.DfuBaseService;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import u30.C34498c;
import u30.EnumC34497b;

/* JADX INFO: renamed from: x30.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C37913o implements InterfaceC15359h {

    /* JADX INFO: renamed from: a */
    public final IdentifierSpec f162318a;

    /* JADX INFO: renamed from: b */
    public final C34498c f162319b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC15359h f162320c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC15455z2 f162321d;

    /* JADX INFO: renamed from: e */
    public final C15420s2 f162322e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 f162323f;

    /* JADX INFO: renamed from: g */
    public final C15366i0 f162324g;

    /* JADX INFO: renamed from: h */
    public final C26318e f162325h;

    /* JADX INFO: renamed from: i */
    public final boolean f162326i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC41211c f162327j;

    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    public C37913o(IdentifierSpec identifier, Map map, Set countryCodes, InterfaceC15452z interfaceC15452z, C15435v2 c15435v2, Map map2, C34498c c34498c, int i13) {
        C15413r0 c15413r0;
        boolean z4;
        InterfaceC15359h c15347f;
        C25126d c25126d = new C25126d(countryCodes, null, null, 62);
        C5705a c5705a = IdentifierSpec.Companion;
        c5705a.getClass();
        C15413r0 c15413r1 = new C15413r0(c25126d, (String) map.get(IdentifierSpec.Country));
        boolean z13 = (i13 & 256) != 0;
        AbstractC22676k.m65750j(identifier, "identifier");
        AbstractC22676k.m65750j(countryCodes, "countryCodes");
        EnumC34497b enumC34497b = c34498c.f144998z;
        this.f162318a = identifier;
        this.f162319b = c34498c;
        AddressFieldConfiguration addressFieldConfiguration = c34498c.f144995w ? AddressFieldConfiguration.REQUIRED : AddressFieldConfiguration.HIDDEN;
        AddressFieldConfiguration addressFieldConfiguration2 = c34498c.f144996x ? AddressFieldConfiguration.REQUIRED : AddressFieldConfiguration.HIDDEN;
        AddressFieldConfiguration addressFieldConfiguration3 = c34498c.f144997y ? AddressFieldConfiguration.REQUIRED : AddressFieldConfiguration.HIDDEN;
        if (interfaceC15452z == null) {
            AddressFieldConfiguration addressFieldConfiguration4 = addressFieldConfiguration2;
            c15413r0 = c15413r1;
            C15382l c15382l = new C15382l(addressFieldConfiguration3, addressFieldConfiguration, addressFieldConfiguration4);
            c5705a.getClass();
            C15366i0 c15366i0 = new C15366i0(IdentifierSpec.Country, c15413r0);
            if (z13 || enumC34497b != EnumC34497b.f144991x) {
                z4 = false;
            } else {
                z4 = true;
            }
            c15347f = new C15347f(identifier, map, c15382l, countryCodes, c15366i0, c15435v2, map2, false, z4, 128);
        } else {
            InterfaceC15452z interfaceC15452z2 = enumC34497b == EnumC34497b.f144992y ? interfaceC15452z : null;
            if (interfaceC15452z2 != null) {
                c15347f = new C15432v(identifier, map, countryCodes, c15413r1, addressFieldConfiguration3, addressFieldConfiguration, addressFieldConfiguration2, c15435v2, map2, interfaceC15452z2, false, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                c15413r0 = c15413r1;
            } else {
                AddressFieldConfiguration addressFieldConfiguration5 = addressFieldConfiguration2;
                c15413r0 = c15413r1;
                C15382l c15382l2 = new C15382l(addressFieldConfiguration3, addressFieldConfiguration, addressFieldConfiguration5);
                c5705a.getClass();
                C15366i0 c15366i1 = new C15366i0(IdentifierSpec.Country, c15413r0);
                if (z13) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                c15347f = new C15347f(identifier, map, c15382l2, countryCodes, c15366i1, c15435v2, map2, false, z4, 128);
            }
        }
        this.f162320c = c15347f;
        this.f162321d = c15347f.mo43540i();
        this.f162322e = new C15420s2(this);
        this.f162323f = c15347f.mo43553g();
        this.f162324g = c15347f.mo43554j();
        this.f162325h = AbstractC3269g.m9484M(c15413r0.f57908i, new C37910n(this, 0));
        this.f162326i = c15347f.mo43533d();
        this.f162327j = c15347f.mo43532c();
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43531a() {
        return this.f162318a;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: b */
    public final void mo43537b(boolean z4) {
        this.f162320c.mo43537b(z4);
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43532c() {
        return this.f162327j;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: d */
    public final boolean mo43533d() {
        return this.f162326i;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: e */
    public final InterfaceC13037f2 mo43535e() {
        return this.f162320c.mo43535e();
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43538f() {
        return this.f162320c.mo43538f();
    }

    @Override // g40.InterfaceC15359h
    /* JADX INFO: renamed from: g */
    public final InterfaceC13037f2 mo43553g() {
        return this.f162323f;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: h */
    public final void mo43539h(Map rawValuesMap) {
        AbstractC22676k.m65750j(rawValuesMap, "rawValuesMap");
        this.f162320c.mo43539h(rawValuesMap);
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: i */
    public final InterfaceC15455z2 mo43540i() {
        return this.f162322e;
    }

    @Override // g40.InterfaceC15359h
    /* JADX INFO: renamed from: j */
    public final C15366i0 mo43554j() {
        return this.f162324g;
    }
}
