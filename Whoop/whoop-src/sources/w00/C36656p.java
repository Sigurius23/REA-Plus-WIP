package w00;

import a30.C0307l0;
import b30.C2570m;
import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import ec3.InterfaceC13037f2;
import g40.C15383l0;
import g40.C15430u2;
import g40.C15435v2;
import g40.InterfaceC15367i1;
import g40.InterfaceC15452z;
import h20.C16689l1;
import h20.C16765y;
import h20.EnumC16677j1;
import j00.EnumC21096d0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25260n;
import m83.C25271y;
import n83.C26460c;
import p352ny.C27235g;
import p479s4.AbstractC32121b;
import p479s4.AbstractC32128i;
import p484s9.AbstractC32281f;
import p499t9.C33623c0;
import p599wz.C37734l1;
import p695zx.C41193o;
import p715kotlin.NoWhenBranchMatchedException;
import q20.C29810c;
import t00.C33254a;
import u00.C34378f;
import u30.C34498c;
import u30.EnumC34497b;
import v00.C35459c0;
import v00.C35479m0;
import v00.InterfaceC35457b0;
import v00.InterfaceC35481n0;
import wb3.AbstractC37056f;
import x00.C37798a;
import x30.C37885e1;
import x30.C37913o;
import x30.C37936x;
import y00.EnumC38828f4;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: w00.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C36656p implements InterfaceC35481n0 {

    /* JADX INFO: renamed from: b */
    public static final C36656p f157032b = new C36656p(0);

    /* JADX INFO: renamed from: c */
    public static final C36656p f157033c = new C36656p(1);

    /* JADX INFO: renamed from: d */
    public static final C36656p f157034d = new C36656p(2);

    /* JADX INFO: renamed from: e */
    public static final C36656p f157035e = new C36656p(3);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f157036a;

    public /* synthetic */ C36656p(int i13) {
        this.f157036a = i13;
    }

    @Override // v00.InterfaceC35487q0
    /* JADX INFO: renamed from: a */
    public final List mo112554a(InterfaceC35457b0 interfaceC35457b0, C35459c0 c35459c0, List list, C35479m0 c35479m0) {
        switch (this.f157036a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return AbstractC32281f.m100451s(this, interfaceC35457b0, c35459c0, list, c35479m0);
    }

    @Override // v00.InterfaceC35487q0
    /* JADX INFO: renamed from: b */
    public final C34378f mo112555b(C35459c0 c35459c0, InterfaceC35457b0 interfaceC35457b0, List list) {
        switch (this.f157036a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return AbstractC32281f.m100457z(this, c35459c0, interfaceC35457b0, list);
    }

    @Override // v00.InterfaceC35481n0
    /* JADX INFO: renamed from: d */
    public final C33254a mo112548d(boolean z4, C29810c c29810c) {
        switch (this.f157036a) {
            case 0:
                return C33254a.m105492a(mo112549e().m108679a(c29810c), AbstractC32128i.m100054h(z4 ? R.string.stripe_paymentsheet_add_new_card : R.string.stripe_paymentsheet_add_card), null, 508);
            case 1:
                return mo112549e().m108679a(c29810c);
            case 2:
                return mo112549e().m108679a(c29810c);
            default:
                return C33254a.m105492a(mo112549e().m108679a(c29810c), AbstractC32128i.m100054h(R.string.stripe_paymentsheet_add_us_bank_account), null, 508);
        }
    }

    @Override // v00.InterfaceC35481n0
    /* JADX INFO: renamed from: e */
    public final C34378f mo112549e() {
        switch (this.f157036a) {
            case 0:
                return new C34378f(C36654o.f157027a, null, R.string.stripe_paymentsheet_payment_method_card, R.drawable.stripe_ic_paymentsheet_pm_card, null, true, null, Integer.valueOf(R.drawable.stripe_ic_paymentsheet_pm_card_outlined), 66);
            case 1:
                return new C34378f(C36629b0.f156974b.f167132w, "link_instant_debits", R.string.stripe_paymentsheet_payment_method_instant_debits, R.drawable.stripe_ic_paymentsheet_pm_bank, true, null, 256);
            case 2:
                return new C34378f(C36629b0.f156974b.f167132w, "link_card_brand", R.string.stripe_paymentsheet_payment_method_instant_debits, R.drawable.stripe_ic_paymentsheet_pm_bank, true, null, 256);
            default:
                return new C34378f(C36669v0.f157065b.f167132w, null, R.string.stripe_paymentsheet_payment_method_us_bank_account, R.drawable.stripe_ic_paymentsheet_pm_bank, true, null, 258);
        }
    }

    @Override // v00.InterfaceC35487q0
    /* JADX INFO: renamed from: g */
    public final boolean mo112556g(InterfaceC35457b0 interfaceC35457b0, List list) {
        switch (this.f157036a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return AbstractC32281f.m100450r(this, interfaceC35457b0, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v00.InterfaceC35481n0
    /* JADX INFO: renamed from: h */
    public final List mo112550h(C35459c0 c35459c0, C35479m0 c35479m0) {
        EnumC34497b enumC34497b;
        int i13;
        boolean z4;
        int i14;
        String str;
        Boolean boolM125868N0;
        EnumC21096d0 enumC21096d0;
        float f13;
        InterfaceC13037f2 interfaceC13037f2M9493Z;
        C37734l1 c37734l1;
        int i15 = this.f157036a;
        C25271y c25271y = C25271y.f99162w;
        switch (i15) {
            case 0:
                C16689l1 c16689l1 = c35459c0.f150997x;
                C0307l0 c0307l0 = c35459c0.f150995l0;
                boolean z13 = c35459c0.f150984a0;
                C26460c c26460cM119000x = AbstractC37056f.m119000x();
                C41193o c41193o = c35479m0.f151032a;
                LinkedHashMap linkedHashMap = c35479m0.f151034c;
                IdentifierSpec.Companion.getClass();
                c26460cM119000x.add(new C37936x(c41193o, linkedHashMap, c35479m0.f151050s, c16689l1.m47251h(), c35479m0.f151039h, c35479m0.f151043l, c35479m0.f151044m, C5705a.m16892a("card_details")));
                EnumC16677j1 enumC16677j1 = c16689l1.f64192z;
                if (enumC16677j1 != EnumC16677j1.f64132x || c16689l1.m47250f() || c16689l1.m47252i()) {
                    Set setM47249b = c16689l1.m47249b();
                    boolean zM47250f = c16689l1.m47250f();
                    boolean zM47252i = c16689l1.m47252i();
                    int iOrdinal = enumC16677j1.ordinal();
                    if (iOrdinal == 0) {
                        enumC34497b = EnumC34497b.f144990w;
                    } else if (iOrdinal == 1) {
                        enumC34497b = EnumC34497b.f144991x;
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        enumC34497b = EnumC34497b.f144992y;
                    }
                    C34498c c34498c = new C34498c(false, zM47250f, zM47252i, enumC34497b, 16);
                    InterfaceC15452z interfaceC15452z = c35479m0.f151046o;
                    Map map = c35479m0.f151036e;
                    C15435v2 c15435v2 = (map == null || (str = (String) map.get(IdentifierSpec.SameAsShipping)) == null || (boolM125868N0 = AbstractC39414r.m125868N0(str)) == null) ? null : new C15435v2(IdentifierSpec.SameAsShipping, new C15430u2(boolM125868N0.booleanValue()));
                    i13 = 0;
                    z4 = true;
                    i14 = 2;
                    c26460cM119000x.addAll(AbstractC25260n.m74077r0(new InterfaceC15367i1[]{C15383l0.m43594b(new C37913o(C5705a.m16892a("credit_billing"), linkedHashMap, setM47249b, interfaceC15452z, c15435v2, map, c34498c, 264), (c34498c.f144998z == EnumC34497b.f144991x && (c34498c.f144997y || c34498c.f144996x)) ? AbstractC32128i.m100064s(R.string.stripe_contact_information, new Object[0], c25271y) : AbstractC32128i.m100064s(R.string.stripe_billing_details, new Object[0], c25271y)), c15435v2}));
                } else {
                    i14 = 2;
                    z4 = true;
                    i13 = 0;
                }
                C33623c0 c33623c0 = EnumC38828f4.f167088G;
                boolean zM100011q = AbstractC32121b.m100011q("card", c35459c0.f150976S, c35459c0.f150996w, c35459c0.f150973P != null ? z4 : i13);
                if (zM100011q && !z13) {
                    AbstractC32121b.m99997b(c26460cM119000x, c35459c0, c35479m0);
                }
                if ((c0307l0 != null ? c0307l0.f1061z : null) == null || (c37734l1 = c35479m0.f151033b) == null) {
                    enumC21096d0 = null;
                } else {
                    c26460cM119000x.add(new C37798a(c0307l0.f1061z, c0307l0.f1058w, c37734l1, c35479m0.f151035d, c35479m0.f151042k, c35479m0.f151049r));
                    enumC21096d0 = c0307l0.f1061z;
                }
                EnumC38828f4 enumC38828f4 = C36654o.f157028b;
                boolean zM112531H = c35459c0.m112531H(enumC38828f4);
                if (z13) {
                    IdentifierSpec identifierSpecM16892a = C5705a.m16892a("card_mandate");
                    String str2 = c35459c0.f150966I;
                    boolean z14 = c35479m0.f151048q;
                    C16765y c16765y = c35479m0.f151047p;
                    if (c16765y == null || (interfaceC13037f2M9493Z = c16765y.f64440b) == null) {
                        interfaceC13037f2M9493Z = AbstractC3269g.m9493Z(null);
                    }
                    c26460cM119000x.add(new C36660r(identifierSpecM16892a, enumC21096d0, zM100011q, str2, interfaceC13037f2M9493Z, z14));
                } else {
                    EnumC21096d0 enumC21096d1 = enumC21096d0;
                    if (c35459c0.m112543x(enumC38828f4.f167132w) && zM112531H) {
                        IdentifierSpec identifierSpecM16892a2 = C5705a.m16892a("card_mandate");
                        if (enumC21096d1 == EnumC21096d0.f79990x) {
                            f13 = i13;
                        } else {
                            if (enumC21096d1 == EnumC21096d0.f79989w) {
                                i14 = 4;
                            } else if (zM100011q) {
                                i14 = 6;
                            }
                            f13 = i14;
                        }
                        c26460cM119000x.add(new C37885e1(identifierSpecM16892a2, R.string.stripe_paymentsheet_card_mandate, AbstractC37056f.m118958J(c35459c0.f150966I), f13, 16));
                    }
                }
                C26460c c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
                C2570m c2570m = c35479m0.f151051t;
                return (!c35459c0.f150994k0 || c2570m == null) ? c26460cM118988k : AbstractC37056f.m118958J(new C27235g(c2570m, c26460cM118988k));
            case 1:
            case 2:
            default:
                return c25271y;
        }
    }

    @Override // v00.InterfaceC35487q0
    /* JADX INFO: renamed from: i */
    public final C33254a mo112558i(InterfaceC35457b0 interfaceC35457b0, C35459c0 c35459c0, List list, boolean z4) {
        switch (this.f157036a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return AbstractC32281f.m100452t(this, interfaceC35457b0, c35459c0, list, z4);
    }
}
