package vn2;

import android.net.Uri;
import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p114eb.C12997x0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import uo1.C35141b;

/* JADX INFO: renamed from: vn2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u000eB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lvn2/c;", "Lj02/k0;", "Lj02/i0;", "navDeepLinkRequestHelper", "<init>", "(Lj02/i0;)V", "", "b", "(Ljava/lang/String;)Ljava/lang/String;", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "a", "Lj02/i0;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36218c implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: c */
    public static final int f155062c = C21147i0.f80230a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    public C36218c(C21147i0 navDeepLinkRequestHelper) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
    }

    /* JADX INFO: renamed from: b */
    private final String m115287b(String str) {
        if (str == null) {
            str = "";
        }
        String strEncode = Uri.encode(str);
        AbstractC22676k.m65749i(strEncode, "encode(...)");
        return strEncode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final CharSequence m115288c(C36218c c36218c, String it) {
        AbstractC22676k.m65750j(it, "it");
        return c36218c.m115287b(it);
    }

    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (!(navigationScreen instanceof AbstractC21155m0.i5)) {
            return InterfaceC21149j0.d.f80241a;
        }
        AbstractC21155m0.i5 i5Var = (AbstractC21155m0.i5) navigationScreen;
        String strM115287b = m115287b(i5Var.getSku());
        String strM115287b2 = m115287b(i5Var.getPackSku());
        List<String> listM59151c = i5Var.m59151c();
        if (listM59151c == null) {
            listM59151c = C25271y.f99162w;
        }
        String strM74110N0 = AbstractC25265s.m74110N0(listM59151c, ",", null, null, new C35141b(this, 10), 30);
        String strM115287b3 = m115287b(i5Var.getWywSku());
        String strM115287b4 = m115287b(i5Var.getBandSku());
        String strM115287b5 = m115287b(i5Var.getClaspSku());
        String strM115287b6 = m115287b(i5Var.getHookSku());
        String strM115287b7 = m115287b(i5Var.getFastLinkSku());
        String strM115287b8 = m115287b(i5Var.getStoreDomain());
        C21147i0 c21147i0 = this.navDeepLinkRequestHelper;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("android-app://com.whoop/UniversalBuyNow?sku=", strM115287b, "&packSku=", strM115287b2, "&childItemSkus=");
        AbstractC11266d.m30444B(sbM32001t, strM74110N0, "&wywSku=", strM115287b3, "&bandSku=");
        AbstractC11266d.m30444B(sbM32001t, strM115287b4, "&claspSku=", strM115287b5, "&hookSku=");
        AbstractC11266d.m30444B(sbM32001t, strM115287b6, "&fastLinkSku=", strM115287b7, "&storeDomain=");
        sbM32001t.append(strM115287b8);
        return new InterfaceC21149j0.c(c21147i0.m58994a(sbM32001t.toString()), new C12997x0(true, false, -1, false, false, -1, -1, -1, -1), null, 4, null);
    }

    public /* synthetic */ C36218c(C21147i0 c21147i0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21147i0() : c21147i0);
    }
}
