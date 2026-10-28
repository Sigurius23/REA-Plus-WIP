package f22;

import c22.EnumC3894b;
import j02.AbstractC21155m0;
import j02.AbstractC21161p0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import nf1.AbstractC26660a;
import p088dc.AbstractC11895b;
import p114eb.C12997x0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: f22.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lf22/e;", "Lj02/k0;", "Lj02/i0;", "navDeepLinkRequestHelper", "<init>", "(Lj02/i0;)V", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "a", "Lj02/i0;", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14033e implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: b */
    public static final int f50077b = C21147i0.f80230a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    public C14033e(C21147i0 navDeepLinkRequestHelper) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        EnumC3894b enumC3894b;
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (!(navigationScreen instanceof AbstractC21155m0.y2)) {
            return InterfaceC21149j0.d.f80241a;
        }
        AbstractC21155m0.y2 y2Var = (AbstractC21155m0.y2) navigationScreen;
        String strapSerial = y2Var.getStrapSerial();
        String strapSignature = y2Var.getStrapSignature();
        String source = y2Var.getSource();
        if (source != null) {
            EnumC3894b[] enumC3894bArrValues = EnumC3894b.values();
            int length = enumC3894bArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC3894b = null;
                    break;
                }
                enumC3894b = enumC3894bArrValues[i13];
                if (AbstractC22676k.m65745e(enumC3894b.name(), source)) {
                    break;
                }
                i13++;
            }
            if (enumC3894b == null) {
                enumC3894b = EnumC3894b.PAIRING_FLOW;
            }
        } else {
            enumC3894b = EnumC3894b.PAIRING_FLOW;
        }
        C21147i0 c21147i0 = this.navDeepLinkRequestHelper;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("android-app://com.whoop/membershipAdjustment?strapSerial=", strapSerial, "&strapSignature=", strapSignature, "&source=");
        sbM32001t.append(enumC3894b);
        return new InterfaceC21149j0.c(c21147i0.m58994a(sbM32001t.toString()), new C12997x0(false, false, -1, false, false, AbstractC26660a.f105970o, -1, -1, AbstractC26660a.f105971p), AbstractC21161p0.d.f80690a);
    }

    public /* synthetic */ C14033e(C21147i0 c21147i0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21147i0() : c21147i0);
    }
}
