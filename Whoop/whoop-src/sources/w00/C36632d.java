package w00;

import com.stripe.android.p056ui.core.elements.FormItemSpec;
import com.stripe.android.p056ui.core.elements.SharedDataSpec;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import g40.InterfaceC15367i1;
import h20.EnumC16673i3;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p479s4.AbstractC32121b;
import p479s4.AbstractC32128i;
import p484s9.AbstractC32281f;
import p508ty.C34249c;
import p522uf.AbstractC34870c0;
import p696zy.C41210b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29810c;
import s93.AbstractC32306h;
import t00.C33254a;
import u00.C34378f;
import v00.C35459c0;
import v00.C35479m0;
import v00.InterfaceC35457b0;
import v00.InterfaceC35483o0;
import wb3.AbstractC37056f;
import x30.C37885e1;
import y00.EnumC38828f4;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: w00.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C36632d implements InterfaceC35483o0 {

    /* JADX INFO: renamed from: b */
    public static final C36632d f156979b = new C36632d(0);

    /* JADX INFO: renamed from: c */
    public static final C36632d f156980c = new C36632d(1);

    /* JADX INFO: renamed from: d */
    public static final C36632d f156981d = new C36632d(2);

    /* JADX INFO: renamed from: e */
    public static final C36632d f156982e = new C36632d(3);

    /* JADX INFO: renamed from: f */
    public static final C36632d f156983f = new C36632d(4);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f156984a;

    public /* synthetic */ C36632d(int i13) {
        this.f156984a = i13;
    }

    @Override // v00.InterfaceC35487q0
    /* JADX INFO: renamed from: a */
    public final List mo112554a(InterfaceC35457b0 interfaceC35457b0, C35459c0 c35459c0, List list, C35479m0 c35479m0) {
        switch (this.f156984a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return AbstractC32281f.m100451s(this, interfaceC35457b0, c35459c0, list, c35479m0);
    }

    @Override // v00.InterfaceC35487q0
    /* JADX INFO: renamed from: b */
    public final C34378f mo112555b(C35459c0 c35459c0, InterfaceC35457b0 interfaceC35457b0, List list) {
        switch (this.f156984a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return AbstractC32281f.m100457z(this, c35459c0, interfaceC35457b0, list);
    }

    @Override // v00.InterfaceC35483o0
    /* JADX INFO: renamed from: c */
    public final C33254a mo112551c(C35459c0 c35459c0, SharedDataSpec sharedDataSpec, C29810c c29810c) {
        switch (this.f156984a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return mo112552f(c35459c0, sharedDataSpec).m108679a(c29810c);
    }

    @Override // v00.InterfaceC35483o0
    /* JADX INFO: renamed from: f */
    public final C34378f mo112552f(C35459c0 c35459c0, SharedDataSpec sharedDataSpec) {
        C41210b c41210bM100054h;
        switch (this.f156984a) {
            case 0:
                C36630c c36630c = C36630c.f156975a;
                InterfaceC38802c8 interfaceC38802c8 = c35459c0.f150996w;
                int i13 = "GBP".equalsIgnoreCase(AbstractC34870c0.m109981P(interfaceC38802c8)) ? R.string.stripe_paymentsheet_payment_method_clearpay : R.string.stripe_paymentsheet_payment_method_afterpay;
                int i14 = "USD".equalsIgnoreCase(AbstractC34870c0.m109981P(interfaceC38802c8)) ? R.drawable.stripe_ic_paymentsheet_pm_cash_app_pay : R.drawable.stripe_ic_paymentsheet_pm_afterpay_clearpay;
                if ("GBP".equalsIgnoreCase(AbstractC34870c0.m109981P(interfaceC38802c8))) {
                    c41210bM100054h = AbstractC32128i.m100054h(R.string.stripe_clearpay_subtitle);
                } else {
                    c41210bM100054h = "USD".equalsIgnoreCase(AbstractC34870c0.m109981P(interfaceC38802c8)) ? AbstractC32128i.m100054h(R.string.stripe_cashapp_afterpay_subtitle) : AbstractC32128i.m100054h(R.string.stripe_afterpay_subtitle);
                }
                return new C34378f(c36630c, sharedDataSpec, i13, i14, null, false, c41210bM100054h, null, 160);
            case 1:
                return new C34378f(C36640h.f156999a, sharedDataSpec, R.string.stripe_paymentsheet_payment_method_au_becs_debit, R.drawable.stripe_ic_paymentsheet_pm_bank, null, true, null, Integer.valueOf(R.drawable.stripe_ic_paymentsheet_pm_bank_outlined), 64);
            case 2:
                return new C34378f(C36627a0.f156943a, sharedDataSpec, R.string.stripe_paymentsheet_payment_method_ideal, R.drawable.stripe_ic_paymentsheet_pm_ideal, null, false, null, null, 224);
            case 3:
                return new C34378f(C36641h0.f157002b.f167132w, null, R.string.stripe_paymentsheet_payment_method_oxxo, R.drawable.stripe_ic_paymentsheet_pm_oxxo, false, null, 770);
            default:
                return new C34378f(C36659q0.f157041a, sharedDataSpec, R.string.stripe_paymentsheet_payment_method_sepa_debit, R.drawable.stripe_ic_paymentsheet_pm_sepa_debit, null, false, null, null, 224);
        }
    }

    @Override // v00.InterfaceC35487q0
    /* JADX INFO: renamed from: g */
    public final boolean mo112556g(InterfaceC35457b0 interfaceC35457b0, List list) {
        switch (this.f156984a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return AbstractC32281f.m100450r(this, interfaceC35457b0, list);
    }

    @Override // v00.InterfaceC35487q0
    /* JADX INFO: renamed from: i */
    public final C33254a mo112558i(InterfaceC35457b0 interfaceC35457b0, C35459c0 c35459c0, List list, boolean z4) {
        switch (this.f156984a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return AbstractC32281f.m100452t(this, interfaceC35457b0, c35459c0, list, z4);
    }

    @Override // v00.InterfaceC35483o0
    /* JADX INFO: renamed from: j */
    public final List mo112553j(C35459c0 c35459c0, SharedDataSpec sharedDataSpec, C34249c c34249c, C35479m0 c35479m0) {
        switch (this.f156984a) {
            case 0:
                return m117696k(c35459c0, sharedDataSpec, c34249c);
            case 1:
                return m117696k(c35459c0, sharedDataSpec, c34249c);
            case 2:
                return m117696k(c35459c0, sharedDataSpec, c34249c);
            case 3:
                return m117696k(c35459c0, sharedDataSpec, c34249c);
            default:
                String code = C36659q0.f157042b.f167132w;
                AbstractC22676k.m65750j(code, "code");
                boolean zM100011q = AbstractC32121b.m100011q(code, c35459c0.f150976S, c35459c0.f150996w, c35459c0.f150973P != null);
                ArrayList arrayListM100558f = AbstractC32306h.m100558f(c35459c0, sharedDataSpec, c34249c);
                if (!zM100011q) {
                    return arrayListM100558f;
                }
                ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(arrayListM100558f);
                InterfaceC15367i1 interfaceC15367i1 = ((InterfaceC15367i1) AbstractC25265s.m74114R0(arrayListM74097F1)) instanceof C37885e1 ? (InterfaceC15367i1) arrayListM74097F1.remove(AbstractC37056f.m118951C(arrayListM74097F1)) : null;
                AbstractC32121b.m99997b(arrayListM74097F1, c35459c0, c35479m0);
                if (interfaceC15367i1 != null) {
                    arrayListM74097F1.add(interfaceC15367i1);
                }
                return AbstractC25265s.m74093D1(arrayListM74097F1);
        }
    }

    /* JADX INFO: renamed from: k */
    public ArrayList m117696k(C35459c0 c35459c0, SharedDataSpec sharedDataSpec, C34249c c34249c) {
        List listM118959K;
        switch (this.f156984a) {
            case 0:
                return AbstractC32306h.m100558f(c35459c0, sharedDataSpec, c34249c);
            case 1:
                return AbstractC32306h.m100558f(c35459c0, sharedDataSpec, c34249c);
            case 2:
                ArrayList<FormItemSpec> fields = sharedDataSpec.getFields();
                EnumC38828f4 enumC38828f4 = C36627a0.f156944b;
                if (c35459c0.m112543x(enumC38828f4.f167132w)) {
                    IdentifierSpec.Companion.getClass();
                    listM118959K = AbstractC37056f.m118959K(IdentifierSpec.Name, IdentifierSpec.Email);
                } else {
                    listM118959K = C25271y.f99162w;
                }
                EnumC16673i3 enumC16673i3 = (EnumC16673i3) c35459c0.f150983Z.get(enumC38828f4);
                if (enumC16673i3 == null) {
                    enumC16673i3 = EnumC16673i3.f64121w;
                }
                return c34249c.m108305v(c35459c0, fields, listM118959K, enumC16673i3);
            default:
                return AbstractC32306h.m100558f(c35459c0, sharedDataSpec, c34249c);
        }
    }
}
