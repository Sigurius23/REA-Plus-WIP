package oo2;

import android.net.Uri;
import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.EnumC21177x0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p114eb.C12969k0;
import p114eb.C12995w0;
import p114eb.C12997x0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: oo2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Loo2/b;", "Lj02/k0;", "Lj02/i0;", "navDeepLinkRequestHelper", "<init>", "(Lj02/i0;)V", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "a", "Lj02/i0;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28067b implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: b */
    public static final int f113561b = C21147i0.f80230a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    public C28067b(C21147i0 navDeepLinkRequestHelper) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        String str;
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (navigationScreen instanceof AbstractC21155m0.k5) {
            AbstractC21155m0.k5 k5Var = (AbstractC21155m0.k5) navigationScreen;
            String path = k5Var.getPath();
            String payload = k5Var.getPayload();
            if (payload == null) {
                payload = "";
            }
            String source = k5Var.getSource();
            if (source == null) {
                source = "";
            } else {
                if (AbstractC39414r.m125890i0(source)) {
                    source = null;
                }
                if (source == null) {
                    source = "";
                }
            }
            String method = k5Var.getMethod();
            if (method == null) {
                method = "";
            }
            EnumC21177x0 autoTrigger = k5Var.getAutoTrigger();
            String strName = autoTrigger != null ? autoTrigger.name() : null;
            str = strName != null ? strName : "";
            C21147i0 c21147i0 = this.navDeepLinkRequestHelper;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("android-app://com.whoop/UniversalCheckout?path=", path, "&payload=", payload, "&source=");
            AbstractC11266d.m30444B(sbM32001t, source, "&method=", method, "&cartId=&autoTrigger=");
            sbM32001t.append(str);
            C12969k0 c12969k0M58994a = c21147i0.m58994a(sbM32001t.toString());
            C12995w0 c12995w0M95631g = AbstractC31061c.m95631g();
            c12995w0M95631g.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M58994a, c12995w0M95631g.m36508a(), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.l5) {
            AbstractC21155m0.l5 l5Var = (AbstractC21155m0.l5) navigationScreen;
            String strEncode = Uri.encode(l5Var.getCartId());
            String strEncode2 = Uri.encode(l5Var.getSource());
            C12969k0 c12969k0M58994a2 = this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/UniversalCheckout?source=" + strEncode2 + "&receiptCartId=" + strEncode);
            C12995w0 c12995w0M95631g2 = AbstractC31061c.m95631g();
            c12995w0M95631g2.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M58994a2, c12995w0M95631g2.m36508a(), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.m5) {
            AbstractC21155m0.m5 m5Var = (AbstractC21155m0.m5) navigationScreen;
            String cartId = m5Var.getCartId();
            String source2 = m5Var.getSource();
            C12969k0 c12969k0M58994a3 = this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/UniversalCheckout?path=shippingAddress&payload=" + cartId + "&source=" + source2);
            C12995w0 c12995w0M95631g3 = AbstractC31061c.m95631g();
            c12995w0M95631g3.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M58994a3, c12995w0M95631g3.m36508a(), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.n5) {
            AbstractC21155m0.n5 n5Var = (AbstractC21155m0.n5) navigationScreen;
            String cartId2 = n5Var.getCartId();
            String source3 = n5Var.getSource();
            C12969k0 c12969k0M58994a4 = this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/UniversalCheckout?path=shippingMethod&payload=" + cartId2 + "&source=" + source3);
            C12995w0 c12995w0M95631g4 = AbstractC31061c.m95631g();
            c12995w0M95631g4.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M58994a4, c12995w0M95631g4.m36508a(), null, 4, null);
        }
        if (!(navigationScreen instanceof AbstractC21155m0.j5)) {
            return InterfaceC21149j0.d.f80241a;
        }
        AbstractC21155m0.j5 j5Var = (AbstractC21155m0.j5) navigationScreen;
        String cartId3 = j5Var.getCartId();
        if (cartId3 == null) {
            cartId3 = "";
        }
        String sku = j5Var.getSku();
        if (sku == null) {
            sku = "";
        }
        String addIntent = j5Var.getAddIntent();
        str = addIntent != null ? addIntent : "";
        C21147i0 c21147i1 = this.navDeepLinkRequestHelper;
        StringBuilder sbM32001t2 = AbstractC11895b.m32001t("android-app://com.whoop/UniversalCart?cartId=", cartId3, "&sku=", sku, "&addIntent=");
        sbM32001t2.append(str);
        return new InterfaceC21149j0.c(c21147i1.m58994a(sbM32001t2.toString()), new C12997x0(true, false, -1, false, false, -1, -1, -1, -1), null, 4, null);
    }

    public /* synthetic */ C28067b(C21147i0 c21147i0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21147i0() : c21147i0);
    }
}
