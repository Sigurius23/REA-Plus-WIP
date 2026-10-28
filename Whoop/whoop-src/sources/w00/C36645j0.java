package w00;

import com.stripe.android.p056ui.core.elements.DropdownItemSpec;
import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import d30.C11530f0;
import g40.C15383l0;
import g40.C15413r0;
import java.util.LinkedHashMap;
import java.util.List;
import p408q.C29662f;
import p479s4.AbstractC32128i;
import u00.C34373a;
import u00.C34374b;
import u00.C34378f;
import u00.EnumC34376d;
import v00.AbstractC35485p0;
import v00.C35459c0;
import v00.C35479m0;
import wb3.AbstractC37056f;
import x30.C37918p1;

/* JADX INFO: renamed from: w00.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36645j0 extends AbstractC35485p0 {

    /* JADX INFO: renamed from: a */
    public static final C36645j0 f157008a = new C36645j0();

    /* JADX INFO: renamed from: b */
    public static final IdentifierSpec f157009b;

    /* JADX INFO: renamed from: c */
    public static final List f157010c;

    static {
        IdentifierSpec.Companion.getClass();
        f157009b = C5705a.m16892a("p24[bank]");
        f157010c = AbstractC37056f.m118959K(new DropdownItemSpec("alior_bank", "Alior Bank"), new DropdownItemSpec("bank_millennium", "Bank Millenium"), new DropdownItemSpec("bank_nowy_bfg_sa", "Bank Nowy BFG S.A."), new DropdownItemSpec("bank_pekao_sa", "Bank PEKAO S.A"), new DropdownItemSpec("banki_spbdzielcze", "Bank spółdzielczy"), new DropdownItemSpec("blik", "BLIK"), new DropdownItemSpec("bnp_paribas", "BNP Paribas"), new DropdownItemSpec("boz", "BOZ"), new DropdownItemSpec("citi_handlowy", "CitiHandlowy"), new DropdownItemSpec("credit_agricole", "Credit Agricole"), new DropdownItemSpec("etransfer_pocztowy24", "e-Transfer Pocztowy24"), new DropdownItemSpec("getin_bank", "Getin Bank"), new DropdownItemSpec("ideabank", "IdeaBank"), new DropdownItemSpec("ing", "ING"), new DropdownItemSpec("inteligo", "inteligo"), new DropdownItemSpec("mbank_mtransfer", "mBank"), new DropdownItemSpec("nest_przelew", "Nest Przelew"), new DropdownItemSpec("noble_pay", "Noble Pay"), new DropdownItemSpec("pbac_z_ipko", "Płać z iPKO (PKO BP)"), new DropdownItemSpec("plus_bank", "Plus Bank"), new DropdownItemSpec("santander_przelew24", "Santander"), new DropdownItemSpec("toyota_bank", "Toyota Bank"), new DropdownItemSpec("velobank", "VeloBank"), new DropdownItemSpec("volkswagen_bank", "Volkswagen Bank"));
    }

    @Override // v00.AbstractC35485p0
    /* JADX INFO: renamed from: k */
    public final void mo112559k(C35459c0 c35459c0, C35479m0 c35479m0, C11530f0 c11530f0) {
        C34374b c34374b = EnumC34376d.f144461w;
        c11530f0.m30985h(c34374b);
        c11530f0.m30984g(c34374b);
        C34373a c34373a = EnumC34376d.f144463y;
        c11530f0.m30985h(c34373a);
        c11530f0.m30984g(c34373a);
        c11530f0.m30984g(EnumC34376d.f144462x);
        C29662f c29662f = new C29662f(AbstractC32128i.m100054h(R.string.stripe_p24_bank), f157010c);
        LinkedHashMap linkedHashMap = c35479m0.f151034c;
        IdentifierSpec identifierSpec = f157009b;
        c11530f0.m30981d(C15383l0.m43594b(new C37918p1(identifierSpec, new C15413r0(c29662f, (String) linkedHashMap.get(identifierSpec))), null));
    }

    @Override // v00.AbstractC35485p0
    /* JADX INFO: renamed from: l */
    public final C34378f mo112560l(C35459c0 c35459c0) {
        return new C34378f(C36643i0.f157005a, null, R.string.stripe_paymentsheet_payment_method_p24, R.drawable.stripe_ic_paymentsheet_pm_p24, null, false, null, null, 226);
    }
}
