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
import u00.C34378f;
import v00.AbstractC35485p0;
import v00.C35459c0;
import v00.C35479m0;
import wb3.AbstractC37056f;
import x30.C37918p1;

/* JADX INFO: renamed from: w00.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C36674y extends AbstractC35485p0 {

    /* JADX INFO: renamed from: a */
    public static final C36674y f157074a = new C36674y();

    /* JADX INFO: renamed from: b */
    public static final IdentifierSpec f157075b;

    /* JADX INFO: renamed from: c */
    public static final List f157076c;

    static {
        IdentifierSpec.Companion.getClass();
        f157075b = C5705a.m16892a("fpx[bank]");
        f157076c = AbstractC37056f.m118959K(new DropdownItemSpec("affin_bank", "Affin Bank"), new DropdownItemSpec("alliance_bank", "Alliance Bank"), new DropdownItemSpec("ambank", "AmBank"), new DropdownItemSpec("bank_islam", "Bank Islam"), new DropdownItemSpec("bank_muamalat", "Bank Muamalat"), new DropdownItemSpec("bank_rakyat", "Bank Rakyat"), new DropdownItemSpec("bsn", "BSN"), new DropdownItemSpec("cimb", "CIMB Clicks"), new DropdownItemSpec("hong_leong_bank", "Hong Leong Bank"), new DropdownItemSpec("hsbc", "HSBC BANK"), new DropdownItemSpec("kfh", "KFH"), new DropdownItemSpec("maybank2e", "Maybank2E"), new DropdownItemSpec("maybank2u", "Maybank2U"), new DropdownItemSpec("ocbc", "OCBC Bank"), new DropdownItemSpec("public_bank", "Public Bank"), new DropdownItemSpec("rhb", "RHB Bank"), new DropdownItemSpec("standard_chartered", "Standard Chartered"), new DropdownItemSpec("uob", "UOB Bank"));
    }

    @Override // v00.AbstractC35485p0
    /* JADX INFO: renamed from: k */
    public final void mo112559k(C35459c0 c35459c0, C35479m0 c35479m0, C11530f0 c11530f0) {
        C29662f c29662f = new C29662f(AbstractC32128i.m100054h(R.string.stripe_fpx_bank), f157076c);
        LinkedHashMap linkedHashMap = c35479m0.f151034c;
        IdentifierSpec identifierSpec = f157075b;
        c11530f0.m30981d(C15383l0.m43594b(new C37918p1(identifierSpec, new C15413r0(c29662f, (String) linkedHashMap.get(identifierSpec))), null));
    }

    @Override // v00.AbstractC35485p0
    /* JADX INFO: renamed from: l */
    public final C34378f mo112560l(C35459c0 c35459c0) {
        return new C34378f(C36672x.f157070a, null, R.string.stripe_paymentsheet_payment_method_fpx, R.drawable.stripe_ic_paymentsheet_pm_fpx, null, false, null, null, 194);
    }
}
