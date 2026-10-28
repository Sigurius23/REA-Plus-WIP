package w00;

import com.stripe.android.p056ui.core.elements.BacsDebitBankAccountSpec;
import com.stripe.android.p056ui.core.elements.BacsDebitConfirmSpec;
import com.stripe.android.p056ui.core.elements.FormItemSpec;
import com.stripe.android.p056ui.core.elements.PlaceholderSpec;
import com.stripe.android.p056ui.core.elements.SharedDataSpec;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import h20.EnumC16673i3;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p484s9.AbstractC32281f;
import p508ty.C34249c;
import q20.C29810c;
import t00.C33254a;
import u00.C34378f;
import v00.C35459c0;
import v00.C35479m0;
import v00.InterfaceC35457b0;
import v00.InterfaceC35483o0;
import wb3.AbstractC37056f;
import y00.EnumC38828f4;

/* JADX INFO: renamed from: w00.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C36644j implements InterfaceC35483o0 {

    /* JADX INFO: renamed from: a */
    public static final C36644j f157007a = new C36644j();

    @Override // v00.InterfaceC35487q0
    /* JADX INFO: renamed from: a */
    public final List mo112554a(InterfaceC35457b0 interfaceC35457b0, C35459c0 c35459c0, List list, C35479m0 c35479m0) {
        return AbstractC32281f.m100451s(this, interfaceC35457b0, c35459c0, list, c35479m0);
    }

    @Override // v00.InterfaceC35487q0
    /* JADX INFO: renamed from: b */
    public final C34378f mo112555b(C35459c0 c35459c0, InterfaceC35457b0 interfaceC35457b0, List list) {
        return AbstractC32281f.m100457z(this, c35459c0, interfaceC35457b0, list);
    }

    @Override // v00.InterfaceC35483o0
    /* JADX INFO: renamed from: c */
    public final C33254a mo112551c(C35459c0 c35459c0, SharedDataSpec sharedDataSpec, C29810c c29810c) {
        return mo112552f(c35459c0, sharedDataSpec).m108679a(c29810c);
    }

    @Override // v00.InterfaceC35483o0
    /* JADX INFO: renamed from: f */
    public final C34378f mo112552f(C35459c0 c35459c0, SharedDataSpec sharedDataSpec) {
        return new C34378f(C36642i.f157003a, sharedDataSpec, R.string.stripe_paymentsheet_payment_method_bacs_debit, R.drawable.stripe_ic_paymentsheet_pm_bank, null, true, null, Integer.valueOf(R.drawable.stripe_ic_paymentsheet_pm_bank_outlined), 64);
    }

    @Override // v00.InterfaceC35487q0
    /* JADX INFO: renamed from: g */
    public final boolean mo112556g(InterfaceC35457b0 interfaceC35457b0, List list) {
        return AbstractC32281f.m100450r(this, interfaceC35457b0, list);
    }

    @Override // v00.InterfaceC35487q0
    /* JADX INFO: renamed from: i */
    public final C33254a mo112558i(InterfaceC35457b0 interfaceC35457b0, C35459c0 c35459c0, List list, boolean z4) {
        return AbstractC32281f.m100452t(this, interfaceC35457b0, c35459c0, list, z4);
    }

    @Override // v00.InterfaceC35483o0
    /* JADX INFO: renamed from: j */
    public final List mo112553j(C35459c0 c35459c0, SharedDataSpec sharedDataSpec, C34249c c34249c, C35479m0 c35479m0) {
        IdentifierSpec.Companion.getClass();
        PlaceholderSpec placeholderSpec = new PlaceholderSpec(IdentifierSpec.Name, PlaceholderSpec.PlaceholderField.Name);
        PlaceholderSpec placeholderSpec2 = new PlaceholderSpec(IdentifierSpec.Email, PlaceholderSpec.PlaceholderField.Email);
        PlaceholderSpec placeholderSpec3 = new PlaceholderSpec(IdentifierSpec.Phone, PlaceholderSpec.PlaceholderField.Phone);
        BacsDebitBankAccountSpec bacsDebitBankAccountSpec = new BacsDebitBankAccountSpec();
        PlaceholderSpec placeholderSpec4 = new PlaceholderSpec(IdentifierSpec.BillingAddress, PlaceholderSpec.PlaceholderField.BillingAddress);
        BacsDebitConfirmSpec bacsDebitConfirmSpec = new BacsDebitConfirmSpec();
        EnumC38828f4 enumC38828f4 = C36642i.f157004b;
        if (!c35459c0.m112531H(enumC38828f4)) {
            bacsDebitConfirmSpec = null;
        }
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(sharedDataSpec.getFields(), AbstractC25260n.m74077r0(new FormItemSpec[]{placeholderSpec, placeholderSpec2, placeholderSpec3, bacsDebitBankAccountSpec, placeholderSpec4, bacsDebitConfirmSpec}));
        List listM118959K = AbstractC37056f.m118959K(IdentifierSpec.Name, IdentifierSpec.Email, IdentifierSpec.BillingAddress);
        EnumC16673i3 enumC16673i3 = (EnumC16673i3) c35459c0.f150983Z.get(enumC38828f4);
        if (enumC16673i3 == null) {
            enumC16673i3 = EnumC16673i3.f64121w;
        }
        return c34249c.m108305v(c35459c0, arrayListM74129g1, listM118959K, enumC16673i3);
    }
}
