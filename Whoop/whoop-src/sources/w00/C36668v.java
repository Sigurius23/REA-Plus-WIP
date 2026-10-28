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
import u00.C34374b;
import u00.C34378f;
import u00.EnumC34376d;
import v00.AbstractC35485p0;
import v00.C35459c0;
import v00.C35479m0;
import wb3.AbstractC37056f;
import x30.C37918p1;

/* JADX INFO: renamed from: w00.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C36668v extends AbstractC35485p0 {

    /* JADX INFO: renamed from: a */
    public static final C36668v f157061a = new C36668v();

    /* JADX INFO: renamed from: b */
    public static final IdentifierSpec f157062b;

    /* JADX INFO: renamed from: c */
    public static final List f157063c;

    static {
        IdentifierSpec.Companion.getClass();
        f157062b = C5705a.m16892a("eps[bank]");
        f157063c = AbstractC37056f.m118959K(new DropdownItemSpec("arzte_und_apotheker_bank", "Ärzte- und Apothekerbank"), new DropdownItemSpec("austrian_anadi_bank_ag", "Austrian Anadi Bank AG"), new DropdownItemSpec("bank_austria", "Bank Austria"), new DropdownItemSpec("brull_kallmus_bank_ag", "bank99 AG"), new DropdownItemSpec("bankhaus_carl_spangler", "Bankhaus Carl Spängler & Co.AG"), new DropdownItemSpec("bankhaus_schelhammer_und_schattera_ag", "Bankhaus Schelhammer & Schattera AG"), new DropdownItemSpec("bawag_psk_ag", "BAWAG P.S.K. AG"), new DropdownItemSpec("bks_bank_ag", "BKS Bank AG"), new DropdownItemSpec("btv_vier_lander_bank", "BTV VIER LÄNDER BANK"), new DropdownItemSpec("capital_bank_grawe_gruppe_ag", "Capital Bank Grawe Gruppe AG"), new DropdownItemSpec("dolomitenbank", "Dolomitenbank"), new DropdownItemSpec("easybank_ag", "Easybank AG"), new DropdownItemSpec("erste_bank_und_sparkassen", "Erste Bank und Sparkassen"), new DropdownItemSpec("hypo_alpeadriabank_international_ag", "Hypo Alpe-Adria-Bank International AG"), new DropdownItemSpec("hypo_noe_lb_fur_niederosterreich_u_wien", "HYPO NOE LB für Niederösterreich u. Wien"), new DropdownItemSpec("hypo_oberosterreich_salzburg_steiermark", "HYPO Oberösterreich,Salzburg,Steiermark"), new DropdownItemSpec("hypo_tirol_bank_ag", "Hypo Tirol Bank AG"), new DropdownItemSpec("hypo_vorarlberg_bank_ag", "Hypo Vorarlberg Bank AG"), new DropdownItemSpec("hypo_bank_burgenland_aktiengesellschaft", "HYPO-BANK BURGENLAND Aktiengesellschaft"), new DropdownItemSpec("marchfelder_bank", "Marchfelder Bank"), new DropdownItemSpec("oberbank_ag", "Oberbank AG"), new DropdownItemSpec("raiffeisen_bankengruppe_osterreich", "Raiffeisen Bankengruppe Österreich"), new DropdownItemSpec("schoellerbank_ag", "Schoellerbank AG"), new DropdownItemSpec("sparda_bank_wien", "Sparda-Bank Wien"), new DropdownItemSpec("volksbank_gruppe", "Volksbank Gruppe"), new DropdownItemSpec("volkskreditbank_ag", "Volkskreditbank AG"), new DropdownItemSpec("vr_bank_braunau", "VR-Bank Braunau"));
    }

    @Override // v00.AbstractC35485p0
    /* JADX INFO: renamed from: k */
    public final void mo112559k(C35459c0 c35459c0, C35479m0 c35479m0, C11530f0 c11530f0) {
        C34374b c34374b = EnumC34376d.f144461w;
        c11530f0.m30985h(c34374b);
        c11530f0.m30984g(c34374b);
        c11530f0.m30984g(EnumC34376d.f144463y);
        c11530f0.m30984g(EnumC34376d.f144462x);
        C29662f c29662f = new C29662f(AbstractC32128i.m100054h(R.string.stripe_eps_bank), f157063c);
        LinkedHashMap linkedHashMap = c35479m0.f151034c;
        IdentifierSpec identifierSpec = f157062b;
        c11530f0.m30981d(C15383l0.m43594b(new C37918p1(identifierSpec, new C15413r0(c29662f, (String) linkedHashMap.get(identifierSpec))), null));
    }

    @Override // v00.AbstractC35485p0
    /* JADX INFO: renamed from: l */
    public final C34378f mo112560l(C35459c0 c35459c0) {
        return new C34378f(C36666u.f157057a, null, R.string.stripe_paymentsheet_payment_method_eps, R.drawable.stripe_ic_paymentsheet_pm_eps, null, false, null, null, 226);
    }
}
