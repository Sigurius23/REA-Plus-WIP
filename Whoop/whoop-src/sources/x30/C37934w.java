package x30;

import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.InterfaceC13037f2;
import g40.InterfaceC15455z2;
import java.util.LinkedHashMap;
import n53.C26318e;
import p029b5.C2725d;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p695zx.C41193o;
import p715kotlin.jvm.internal.AbstractC22676k;
import w30.InterfaceC36786c;

/* JADX INFO: renamed from: x30.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C37934w implements InterfaceC15455z2 {

    /* JADX INFO: renamed from: a */
    public final C2725d f162398a;

    /* JADX INFO: renamed from: b */
    public final C37932v f162399b;

    /* JADX INFO: renamed from: c */
    public final C26318e f162400c;

    public C37934w(C41193o cardAccountRangeRepositoryFactory, LinkedHashMap linkedHashMap, boolean z4, InterfaceC36786c cbcEligibility, InterfaceC35320a cardBrandFilter, InterfaceC35322b cardFundingFilter, C2725d c2725d) {
        AbstractC22676k.m65750j(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC22676k.m65750j(cbcEligibility, "cbcEligibility");
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        this.f162398a = c2725d;
        IdentifierSpec.Companion.getClass();
        C37932v c37932v = new C37932v(C5705a.m16892a("card_detail"), cardAccountRangeRepositoryFactory, linkedHashMap, z4, cbcEligibility, cardBrandFilter, cardFundingFilter);
        this.f162399b = c37932v;
        this.f162400c = c37932v.f162396c.f162390h;
    }

    @Override // g40.InterfaceC15455z2
    /* JADX INFO: renamed from: b */
    public final void mo43558b(boolean z4) {
        this.f162399b.mo43537b(z4);
    }

    @Override // g40.InterfaceC15455z2
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43544f() {
        return this.f162400c;
    }
}
