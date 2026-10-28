package x30;

import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.InterfaceC13037f2;
import g40.InterfaceC15367i1;
import java.util.LinkedHashMap;
import p029b5.C2725d;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p695zx.C41193o;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import w30.InterfaceC36786c;

/* JADX INFO: renamed from: x30.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C37936x implements InterfaceC15367i1 {

    /* JADX INFO: renamed from: a */
    public final IdentifierSpec f162402a;

    /* JADX INFO: renamed from: b */
    public final C37934w f162403b;

    /* JADX INFO: renamed from: c */
    public final boolean f162404c;

    public C37936x(C41193o cardAccountRangeRepositoryFactory, LinkedHashMap linkedHashMap, C2725d c2725d, boolean z4, InterfaceC36786c cbcEligibility, InterfaceC35320a cardBrandFilter, InterfaceC35322b cardFundingFilter, IdentifierSpec identifierSpec) {
        C37934w c37934w = new C37934w(cardAccountRangeRepositoryFactory, linkedHashMap, z4, cbcEligibility, cardBrandFilter, cardFundingFilter, c2725d);
        AbstractC22676k.m65750j(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC22676k.m65750j(cbcEligibility, "cbcEligibility");
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        this.f162402a = identifierSpec;
        this.f162403b = c37934w;
        this.f162404c = true;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43547a() {
        return this.f162402a;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: b */
    public final void mo43548b(boolean z4) {
        this.f162403b.mo43558b(z4);
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43549c() {
        return null;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: d */
    public final boolean mo43550d() {
        return this.f162404c;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: e */
    public final InterfaceC13037f2 mo43551e() {
        return this.f162403b.f162399b.mo43535e();
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43552f() {
        return this.f162403b.f162399b.mo43538f();
    }
}
