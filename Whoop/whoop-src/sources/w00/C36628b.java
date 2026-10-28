package w00;

import androidx.health.platform.client.proto.C1533u;
import com.stripe.android.p056ui.core.elements.AddressSpec;
import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import d30.C11530f0;
import g40.C15333c3;
import g40.C15339d3;
import g40.C15351f3;
import g40.C15366i0;
import g40.C15383l0;
import g40.C15413r0;
import g40.InterfaceC15367i1;
import h20.C16689l1;
import h20.EnumC16677j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import m63.C25126d;
import m83.C25271y;
import p098dt.AbstractC12350b;
import p479s4.AbstractC32128i;
import p499t9.C33623c0;
import u00.C34373a;
import u00.C34374b;
import u00.C34378f;
import u00.EnumC34376d;
import v00.AbstractC35485p0;
import v00.C35459c0;
import v00.C35479m0;
import wb3.AbstractC37056f;
import x30.C37874b;
import x30.C37885e1;
import x30.C37895i;
import x30.C37924r1;
import y00.EnumC38828f4;

/* JADX INFO: renamed from: w00.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C36628b extends AbstractC35485p0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f156972a;

    /* JADX INFO: renamed from: b */
    public static final C36628b f156947b = new C36628b(0);

    /* JADX INFO: renamed from: c */
    public static final C36628b f156948c = new C36628b(1);

    /* JADX INFO: renamed from: d */
    public static final C36628b f156949d = new C36628b(2);

    /* JADX INFO: renamed from: e */
    public static final C36628b f156950e = new C36628b(3);

    /* JADX INFO: renamed from: f */
    public static final C36628b f156951f = new C36628b(4);

    /* JADX INFO: renamed from: g */
    public static final C36628b f156952g = new C36628b(5);

    /* JADX INFO: renamed from: h */
    public static final C36628b f156953h = new C36628b(6);

    /* JADX INFO: renamed from: i */
    public static final C36628b f156954i = new C36628b(7);

    /* JADX INFO: renamed from: j */
    public static final C36628b f156955j = new C36628b(8);

    /* JADX INFO: renamed from: k */
    public static final C36628b f156956k = new C36628b(9);

    /* JADX INFO: renamed from: l */
    public static final C36628b f156957l = new C36628b(10);

    /* JADX INFO: renamed from: m */
    public static final C36628b f156958m = new C36628b(11);

    /* JADX INFO: renamed from: n */
    public static final C36628b f156959n = new C36628b(12);

    /* JADX INFO: renamed from: o */
    public static final C36628b f156960o = new C36628b(13);

    /* JADX INFO: renamed from: p */
    public static final C36628b f156961p = new C36628b(14);

    /* JADX INFO: renamed from: q */
    public static final C36628b f156962q = new C36628b(15);

    /* JADX INFO: renamed from: r */
    public static final C36628b f156963r = new C36628b(16);

    /* JADX INFO: renamed from: s */
    public static final C36628b f156964s = new C36628b(17);

    /* JADX INFO: renamed from: t */
    public static final C36628b f156965t = new C36628b(18);

    /* JADX INFO: renamed from: u */
    public static final C36628b f156966u = new C36628b(19);

    /* JADX INFO: renamed from: v */
    public static final C36628b f156967v = new C36628b(20);

    /* JADX INFO: renamed from: w */
    public static final C36628b f156968w = new C36628b(21);

    /* JADX INFO: renamed from: x */
    public static final C36628b f156969x = new C36628b(22);

    /* JADX INFO: renamed from: y */
    public static final C36628b f156970y = new C36628b(23);

    /* JADX INFO: renamed from: z */
    public static final C36628b f156971z = new C36628b(24);

    /* JADX INFO: renamed from: A */
    public static final C36628b f156945A = new C36628b(25);

    /* JADX INFO: renamed from: B */
    public static final C36628b f156946B = new C36628b(26);

    public /* synthetic */ C36628b(int i13) {
        this.f156972a = i13;
    }

    @Override // v00.AbstractC35485p0
    /* JADX INFO: renamed from: k */
    public void mo112559k(C35459c0 c35459c0, C35479m0 c35479m0, C11530f0 c11530f0) {
        switch (this.f156972a) {
            case 0:
                IdentifierSpec.Companion.getClass();
                ((ArrayList) c11530f0.f37151d).add(new C37874b(C5705a.m16892a("affirm_header")));
                break;
            case 3:
                if (C36638g.f156995a.mo112528c(c35459c0)) {
                    IdentifierSpec.Companion.getClass();
                    c11530f0.m30982e(new C37885e1(C5705a.m16892a("mandate"), R.string.stripe_amazon_pay_mandate, AbstractC37056f.m118958J(c35479m0.f151038g), 0.0f, 24));
                }
                break;
            case 4:
                C34374b c34374b = EnumC34376d.f144461w;
                c11530f0.m30985h(c34374b);
                c11530f0.m30984g(c34374b);
                C36646k c36646k = C36646k.f157011a;
                if (c35459c0.m112543x(C36646k.f157012b.f167132w)) {
                    c11530f0.m30985h(EnumC34376d.f144463y);
                }
                c11530f0.m30984g(EnumC34376d.f144463y);
                c11530f0.m30984g(EnumC34376d.f144462x);
                if (c36646k.mo112528c(c35459c0)) {
                    c11530f0.m30982e(new C37885e1(null, R.string.stripe_sepa_mandate, AbstractC37056f.m118958J(c35479m0.f151038g), 0.0f, 25));
                }
                break;
            case 6:
                c11530f0.m30981d(C15383l0.m43594b(new C37895i(0), null));
                break;
            case 7:
                IdentifierSpec.Companion.getClass();
                IdentifierSpec identifierSpecM16892a = C5705a.m16892a("boleto[tax_id]");
                C15333c3 c15333c3 = new C15333c3(identifierSpecM16892a, new C15351f3(new C15339d3(AbstractC32128i.m100064s(R.string.stripe_boleto_tax_id_label, new Object[0], C25271y.f99162w), 0, 2, null, false, 56), (String) c35479m0.f151034c.get(identifierSpecM16892a), null, 4));
                c11530f0.m30985h(EnumC34376d.f144461w);
                c11530f0.m30985h(EnumC34376d.f144463y);
                c11530f0.m30981d(C15383l0.m43594b(c15333c3, null));
                Set setM34570S = AbstractC12350b.m34570S("BR");
                if (((C35479m0) c11530f0.f37150c).f151040i.f64192z != EnumC16677j1.f64132x) {
                    c11530f0.f37148a = true;
                    c11530f0.f37149b = setM34570S;
                }
                break;
            case 8:
                if (C36658q.f157039a.mo112528c(c35459c0)) {
                    IdentifierSpec.Companion.getClass();
                    IdentifierSpec identifierSpecM16892a2 = C5705a.m16892a("cashapp_mandate");
                    String str = c35479m0.f151038g;
                    c11530f0.m30982e(new C37885e1(identifierSpecM16892a2, R.string.stripe_cash_app_pay_mandate, AbstractC37056f.m118959K(str, str), 0.0f, 24));
                }
                break;
            case 11:
                IdentifierSpec.Companion.getClass();
                ((ArrayList) c11530f0.f37151d).add(new C37924r1(C5705a.m16892a("klarna_header_text"), R.string.stripe_klarna_buy_now_pay_later));
                c11530f0.m30984g(EnumC34376d.f144461w);
                C34373a c34373a = EnumC34376d.f144463y;
                c11530f0.m30985h(c34373a);
                c11530f0.m30984g(c34373a);
                c11530f0.m30984g(EnumC34376d.f144462x);
                c11530f0.f37148a = false;
                IdentifierSpec identifierSpec = IdentifierSpec.Country;
                C16689l1 c16689l1 = c35459c0.f150997x;
                C25126d c25126d = new C25126d(c16689l1.m47249b(), null, null, 62);
                LinkedHashMap linkedHashMap = c35479m0.f151034c;
                c11530f0.m30981d(C15383l0.m43594b(new C15366i0(identifierSpec, new C15413r0(c25126d, (String) linkedHashMap.get(IdentifierSpec.Country))), null));
                if (c16689l1.f64192z == EnumC16677j1.f64133y) {
                    Iterator<T> it = new AddressSpec(null, c35479m0.f151040i.m47249b(), null, false, null, true, 29, null).transform(linkedHashMap, c35479m0.f151036e, c35479m0.f151046o).iterator();
                    while (it.hasNext()) {
                        c11530f0.m30981d((InterfaceC15367i1) it.next());
                    }
                }
                if (C36631c0.f156977a.mo112528c(c35459c0)) {
                    String str2 = c35479m0.f151038g;
                    c11530f0.m30982e(new C37885e1(null, R.string.stripe_klarna_mandate, AbstractC37056f.m118959K(str2, str2), 0.0f, 25));
                }
                break;
            case 12:
                IdentifierSpec.Companion.getClass();
                C15333c3 c15333c4 = new C15333c3(IdentifierSpec.KonbiniConfirmationNumber, new C15351f3(new C15339d3(AbstractC32128i.m100064s(R.string.stripe_konbini_confirmation_number_label, new Object[0], C25271y.f99162w), 0, 4, null, true, 40), (String) c35479m0.f151034c.get(IdentifierSpec.KonbiniConfirmationNumber), null, 4));
                c11530f0.m30985h(EnumC34376d.f144461w);
                c11530f0.m30985h(EnumC34376d.f144463y);
                c11530f0.m30981d(C15383l0.m43594b(c15333c4, null));
                break;
            case 14:
                c11530f0.m30985h(EnumC34376d.f144463y);
                break;
            case 16:
                if (C36649l0.f157017a.mo112528c(c35459c0)) {
                    c11530f0.m30982e(new C37885e1(null, R.string.stripe_paypal_mandate, AbstractC37056f.m118958J(c35479m0.f151038g), 0.0f, 25));
                }
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                c11530f0.m30984g(EnumC34376d.f144461w);
                C34373a c34373a2 = EnumC34376d.f144463y;
                c11530f0.m30985h(c34373a2);
                c11530f0.m30984g(c34373a2);
                c11530f0.m30984g(EnumC34376d.f144462x);
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                if (C36655o0.f157030a.mo112528c(c35459c0)) {
                    c11530f0.m30982e(new C37885e1(null, R.string.stripe_revolut_mandate, AbstractC37056f.m118958J(c35479m0.f151038g), 0.0f, 25));
                }
                break;
            case 20:
                if (C36657p0.f157037a.mo112528c(c35459c0)) {
                    c11530f0.m30982e(new C37885e1(null, R.string.stripe_satispay_mandate, AbstractC37056f.m118958J(c35479m0.f151038g), 0.0f, 25));
                }
                break;
            case 24:
                c11530f0.m30981d(C15383l0.m43594b(new C37895i(1), AbstractC32128i.m100064s(R.string.stripe_paymentsheet_buy_using_upi_id, new Object[0], C25271y.f99162w)));
                break;
        }
    }

    @Override // v00.AbstractC35485p0
    /* JADX INFO: renamed from: l */
    public final C34378f mo112560l(C35459c0 c35459c0) {
        switch (this.f156972a) {
            case 0:
                C33623c0 c33623c0 = EnumC38828f4.f167088G;
                return new C34378f("affirm", null, R.string.stripe_paymentsheet_payment_method_affirm, R.drawable.stripe_ic_paymentsheet_pm_affirm, false, AbstractC32128i.m100054h(R.string.stripe_affirm_buy_now_pay_later_plaintext), 546);
            case 1:
                return new C34378f(C36634e.f156987a, null, R.string.stripe_paymentsheet_payment_method_alipay, R.drawable.stripe_ic_paymentsheet_pm_alipay, null, false, null, null, 226);
            case 2:
                return new C34378f(C36636f.f156991a, null, R.string.stripe_paymentsheet_payment_method_alma, R.drawable.stripe_ic_paymentsheet_pm_alma_day, Integer.valueOf(R.drawable.stripe_ic_paymentsheet_pm_alma_night), false, null, null, 226);
            case 3:
                C33623c0 c33623c1 = EnumC38828f4.f167088G;
                return new C34378f("amazon_pay", null, R.string.stripe_paymentsheet_payment_method_amazon_pay, R.drawable.stripe_ic_paymentsheet_pm_amazon_pay, false, null, 802);
            case 4:
                return new C34378f(C36646k.f157011a, null, R.string.stripe_paymentsheet_payment_method_bancontact, R.drawable.stripe_ic_paymentsheet_pm_bancontact, null, false, null, null, 226);
            case 5:
                return new C34378f(C36648l.f157015a, null, R.string.stripe_paymentsheet_payment_method_billie, R.drawable.stripe_ic_paymentsheet_pm_billie_day, Integer.valueOf(R.drawable.stripe_ic_paymentsheet_pm_billie_night), false, null, null, 226);
            case 6:
                return new C34378f(C36650m.f157019a, null, R.string.stripe_paymentsheet_payment_method_blik, R.drawable.stripe_ic_paymentsheet_pm_blik, null, false, null, null, 226);
            case 7:
                return new C34378f(C36652n.f157023a, null, R.string.stripe_paymentsheet_payment_method_boleto, R.drawable.stripe_ic_paymentsheet_pm_boleto, null, false, null, null, 226);
            case 8:
                return new C34378f(C36658q.f157039a, null, R.string.stripe_paymentsheet_payment_method_cashapp, R.drawable.stripe_ic_paymentsheet_pm_cash_app_pay, null, false, null, null, 226);
            case 9:
                return new C34378f(C36662s.f157050a, null, R.string.stripe_paymentsheet_payment_method_crypto, R.drawable.stripe_ic_paymentsheet_pm_crypto_day, Integer.valueOf(R.drawable.stripe_ic_paymentsheet_pm_crypto_night), true, null, Integer.valueOf(R.drawable.stripe_ic_paymentsheet_pm_crypto_outlined), 66);
            case 10:
                return new C34378f(C36675z.f157077a, null, R.string.stripe_paymentsheet_payment_method_grabpay, R.drawable.stripe_ic_paymentsheet_pm_grabpay, null, false, null, null, 226);
            case 11:
                return new C34378f(C36631c0.f156977a, null, R.string.stripe_paymentsheet_payment_method_klarna, R.drawable.stripe_ic_paymentsheet_pm_klarna, null, false, AbstractC32128i.m100054h(R.string.stripe_klarna_pay_later), null, 162);
            case 12:
                return new C34378f(C36633d0.f156985a, null, R.string.stripe_paymentsheet_payment_method_konbini, R.drawable.stripe_ic_paymentsheet_pm_konbini, null, false, null, null, 226);
            case 13:
                return new C34378f(C36637f0.f156993a, null, R.string.stripe_paymentsheet_payment_method_mobile_pay, R.drawable.stripe_ic_paymentsheet_pm_mobile_pay_day, Integer.valueOf(R.drawable.stripe_ic_paymentsheet_pm_mobile_pay_night), false, null, null, 226);
            case 14:
                return new C34378f(C36639g0.f156997a, null, R.string.stripe_paymentsheet_payment_method_multibanco, R.drawable.stripe_ic_paymentsheet_pm_multibanco_day, Integer.valueOf(R.drawable.stripe_ic_paymentsheet_pm_multibanco_night), false, null, null, 226);
            case 15:
                return new C34378f(C36647k0.f157013a, null, R.string.stripe_paymentsheet_payment_method_paynow, R.drawable.stripe_ic_paymentsheet_pm_paynow_day, Integer.valueOf(R.drawable.stripe_ic_paymentsheet_pm_paynow_night), false, null, null, 226);
            case 16:
                return new C34378f(C36649l0.f157017a, null, R.string.stripe_paymentsheet_payment_method_paypal, R.drawable.stripe_ic_paymentsheet_pm_paypal_day, Integer.valueOf(R.drawable.stripe_ic_paymentsheet_pm_paypal_night), false, null, null, 226);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C34378f(C36651m0.f157021a, null, R.string.stripe_paymentsheet_payment_method_paypay, R.drawable.stripe_ic_paymentsheet_pm_paypay, null, false, null, null, 226);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C34378f(C36653n0.f157025a, null, R.string.stripe_paymentsheet_payment_method_promptpay, R.drawable.stripe_ic_paymentsheet_pm_promptpay_day, Integer.valueOf(R.drawable.stripe_ic_paymentsheet_pm_promptpay_night), false, null, null, 226);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C34378f(C36655o0.f157030a, null, R.string.stripe_paymentsheet_payment_method_revolut_pay, R.drawable.stripe_ic_paymentsheet_pm_revolut_pay_day, Integer.valueOf(R.drawable.stripe_ic_paymentsheet_pm_revolut_pay_night), false, null, null, 226);
            case 20:
                return new C34378f(C36657p0.f157037a, null, R.string.stripe_paymentsheet_payment_method_satispay, R.drawable.stripe_ic_paymentsheet_pm_satispay_day, Integer.valueOf(R.drawable.stripe_ic_paymentsheet_pm_satispay_night), false, null, null, 226);
            case 21:
                return new C34378f(C36661r0.f157048a, null, R.string.stripe_paymentsheet_payment_method_sunbit, R.drawable.stripe_ic_paymentsheet_pm_sunbit_day, Integer.valueOf(R.drawable.stripe_ic_paymentsheet_pm_sunbit_night), false, null, null, 226);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C34378f(C36663s0.f157052a, null, R.string.stripe_paymentsheet_payment_method_swish, R.drawable.stripe_ic_paymentsheet_pm_swish, null, false, null, null, 226);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C34378f(C36665t0.f157055a, null, R.string.stripe_paymentsheet_payment_method_twint, R.drawable.stripe_ic_paymentsheet_pm_twint, null, false, null, null, 226);
            case 24:
                return new C34378f(C36667u0.f157059a, null, R.string.stripe_paymentsheet_payment_method_upi, R.drawable.stripe_ic_paymentsheet_pm_upi, null, false, null, null, 226);
            case 25:
                return new C34378f(C36671w0.f157068a, null, R.string.stripe_paymentsheet_payment_method_wechat, R.drawable.stripe_ic_paymentsheet_pm_wechat_pay, null, false, null, null, 226);
            default:
                return new C34378f(C36673x0.f157072a, null, R.string.stripe_paymentsheet_payment_method_zip, R.drawable.stripe_ic_paymentsheet_pm_zip, null, false, null, null, 226);
        }
    }
}
