package a30;

import c93.InterfaceC4339a;
import java.util.List;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.EnumC35491s0;

/* JADX INFO: renamed from: a30.n1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0314n1 {

    /* JADX INFO: renamed from: a */
    public final C0311m1 f1079a;

    /* JADX INFO: renamed from: b */
    public final C0308l1 f1080b;

    /* JADX INFO: renamed from: c */
    public final List f1081c;

    /* JADX INFO: renamed from: d */
    public final boolean f1082d;

    /* JADX INFO: renamed from: e */
    public final int f1083e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC35322b f1084f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC35320a f1085g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC4339a f1086h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC4339a f1087i;

    public C0314n1(C0311m1 c0311m1, C0308l1 c0308l1, List walletsAllowedInHeader, boolean z4, int i13, InterfaceC35322b cardFundingFilter, InterfaceC35320a cardBrandFilter, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
        AbstractC22676k.m65750j(walletsAllowedInHeader, "walletsAllowedInHeader");
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        this.f1079a = c0311m1;
        this.f1080b = c0308l1;
        this.f1081c = walletsAllowedInHeader;
        this.f1082d = z4;
        this.f1083e = i13;
        this.f1084f = cardFundingFilter;
        this.f1085g = cardBrandFilter;
        this.f1086h = interfaceC4339a;
        this.f1087i = interfaceC4339a2;
    }

    /* JADX INFO: renamed from: a */
    public final C0308l1 m826a(EnumC0293g1 enumC0293g1) {
        int iOrdinal = enumC0293g1.ordinal();
        List list = this.f1081c;
        C0308l1 c0308l1 = this.f1080b;
        if (iOrdinal == 0) {
            if (c0308l1 == null || !list.contains(EnumC35491s0.GooglePay)) {
                return null;
            }
            return c0308l1;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        if (c0308l1 == null || list.contains(EnumC35491s0.GooglePay)) {
            return null;
        }
        return c0308l1;
    }

    /* JADX INFO: renamed from: b */
    public final C0311m1 m827b(EnumC0293g1 enumC0293g1) {
        int iOrdinal = enumC0293g1.ordinal();
        List list = this.f1081c;
        C0311m1 c0311m1 = this.f1079a;
        if (iOrdinal == 0) {
            if (c0311m1 == null || !list.contains(EnumC35491s0.Link)) {
                return null;
            }
            return c0311m1;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        if (c0311m1 == null || list.contains(EnumC35491s0.Link)) {
            return null;
        }
        return c0311m1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0314n1)) {
            return false;
        }
        C0314n1 c0314n1 = (C0314n1) obj;
        return AbstractC22676k.m65745e(this.f1079a, c0314n1.f1079a) && AbstractC22676k.m65745e(this.f1080b, c0314n1.f1080b) && AbstractC22676k.m65745e(this.f1081c, c0314n1.f1081c) && this.f1082d == c0314n1.f1082d && this.f1083e == c0314n1.f1083e && AbstractC22676k.m65745e(this.f1084f, c0314n1.f1084f) && AbstractC22676k.m65745e(this.f1085g, c0314n1.f1085g) && AbstractC22676k.m65745e(this.f1086h, c0314n1.f1086h) && AbstractC22676k.m65745e(this.f1087i, c0314n1.f1087i);
    }

    public final int hashCode() {
        C0311m1 c0311m1 = this.f1079a;
        int iHashCode = (c0311m1 == null ? 0 : c0311m1.hashCode()) * 31;
        C0308l1 c0308l1 = this.f1080b;
        return this.f1087i.hashCode() + AbstractC30802r.m94755d((this.f1085g.hashCode() + ((this.f1084f.hashCode() + AbstractC11266d.m30448b(this.f1083e, AbstractC2875y.m8289b(AbstractC11895b.m31983b((iHashCode + (c0308l1 != null ? c0308l1.hashCode() : 0)) * 31, 31, this.f1081c), 31, this.f1082d), 31)) * 31)) * 31, 31, this.f1086h);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("WalletsState(link=");
        sb4.append(this.f1079a);
        sb4.append(", googlePay=");
        sb4.append(this.f1080b);
        sb4.append(", walletsAllowedInHeader=");
        AbstractC26725a.m79512p(", buttonsEnabled=", ", dividerTextResource=", sb4, this.f1081c, this.f1082d);
        sb4.append(this.f1083e);
        sb4.append(", cardFundingFilter=");
        sb4.append(this.f1084f);
        sb4.append(", cardBrandFilter=");
        sb4.append(this.f1085g);
        sb4.append(", onGooglePayPressed=");
        sb4.append(this.f1086h);
        sb4.append(", onLinkPressed=");
        sb4.append(this.f1087i);
        sb4.append(")");
        return sb4.toString();
    }
}
