package on2;

import ad3.AbstractC0757c;
import al0.C0972g;
import android.content.Context;
import ao1.C1873h;
import ao2.C1876a;
import ap2.C1882a;
import bc3.InterfaceC2994c0;
import bp2.C3540d;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.whoop.data.coordinator.BannerInvalidator;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.AbstractC6730d;
import com.whoop.design.models.items.ShippingProgressBarModel;
import com.whoop.universalcheckout.features.cart.domain.C10661d;
import com.whoop.universalcheckout.features.cart.domain.CartApi;
import com.whoop.universalcheckout.features.cart.domain.models.items.CartItemModel;
import com.whoop.universalcheckout.features.cart.domain.models.items.EmptyCartContentModel;
import com.whoop.universalcheckout.features.checkout.domain.CheckoutApi;
import com.whoop.universalcheckout.features.checkout.domain.models.items.CheckoutFooterModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.CheckoutInfoModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.OrderDetailsModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.PaymentMethodTileModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.PreviewTileModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.PromoCodeInputModel;
import com.whoop.universalcheckout.features.receipt.domain.models.items.ReceiptHeaderModel;
import com.whoop.universalcheckout.features.receipt.domain.models.items.ReimbursementTileModel;
import do2.C12235a;
import do2.C12236b;
import dp2.C12255a;
import dp2.C12256b;
import eo2.C13386f;
import eo2.C13388h;
import ep2.C13430b;
import fi0.InterfaceC14515a;
import fp2.C14680a;
import ge3.AbstractC15751g;
import ho2.C17538a;
import ih0.AbstractC18489d0;
import ip2.C20814a;
import iy1.InterfaceC21030c;
import j02.InterfaceC21153l0;
import j02.InterfaceC21159o0;
import j93.InterfaceC21461d;
import java.util.List;
import java.util.Map;
import jo2.C21838a;
import jo2.C21842e;
import ko2.C22654d;
import kp2.C22762e;
import l83.C23454a0;
import l83.C23465k;
import lo2.C24621c;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import mp2.C25871a;
import mp2.C25872b;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import np2.C27035b;
import o02.InterfaceC27353d;
import on1.C28046a;
import oo2.C28066a;
import oo2.C28068c;
import op2.C28100a;
import or2.C28162g;
import org.koin.core.error.DefinitionParameterException;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p114eb.AbstractC12939a0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29222x0;
import po2.C29403b;
import qf3.C30330b;
import qo2.C30528a;
import qp2.C30539a;
import rf3.C31362a;
import rf3.C31365d;
import rr2.InterfaceC31766c;
import s82.C32266a;
import sp2.C32876d;
import sr2.AbstractC32943y;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u02.C34387c;
import u82.AbstractC34645f;
import u82.C34642c;
import u82.C34643d;
import u82.C34644e;
import u82.InterfaceC34640a;
import ud3.C34826l0;
import uf3.C34911a;
import uo2.C35143a;
import up2.C35154a;
import up2.C35155b;
import v82.C35799a;
import vf3.C35953c;
import vo2.C36255d;
import vp2.C36275b;
import w02.C36684a;
import wb3.AbstractC37056f;
import wf3.C37247a;
import wo2.C37478a;
import wo2.C37479b;
import wp2.C37500a;
import xf3.C38266c;
import xm0.C38458b;
import xo2.C38496b;
import yo2.C39692a;
import zn2.C40907a;

/* JADX INFO: renamed from: on2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lon2/d;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28051d implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f113193c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A0 */
    public static final C14680a m84602A0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C14680a(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C12256b m84604B0(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C0972g c0972g = new C0972g(params, 26);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21159o0 interfaceC21159o0 = (InterfaceC21159o0) factory.m122602a(c0972g, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C12256b(interfaceC21159o0, (AbstractC12939a0) objM110111b, (InterfaceC27353d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27353d.class), null), (C1882a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C1882a.class), null), (AbstractC0757c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("universal-checkout-json")), null, null, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C34911a m84606C0(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C12255a m84608D0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12255a((C1882a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C1882a.class), null), (AbstractC0757c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("universal-checkout-json")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C1882a m84610E0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C1882a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C13430b m84612F0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C13430b((C3540d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C3540d.class), null), (C14680a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C14680a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final C22762e m84614G0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C22762e((InterfaceC26834e) factory.m122602a(new C28049b(factory, 2), AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC26834e.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C34911a m84616H0(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("universal-checkout-bff-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I0 */
    public static final C28100a m84618I0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28100a(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final AbstractC0757c m84620J0(C38266c c38266c, C34911a c34911a) {
        return AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "universal-checkout-mapping")), null, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C25872b m84622K0(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C0972g c0972g = new C0972g(params, 29);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21159o0 interfaceC21159o0 = (InterfaceC21159o0) factory.m122602a(c0972g, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
        }
        AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) objM110111b;
        C20814a c20814a = (C20814a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C20814a.class), null);
        Object objM110111b2 = params.m110111b(c22673i0.getOrCreateKotlinClass(String.class));
        if (objM110111b2 == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, String.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C25872b(interfaceC21159o0, abstractC12939a0, c20814a, (String) objM110111b2, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C34911a m84624L0(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final C25871a m84626M0(C38266c factory, C34911a params) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        return new C25871a((C20814a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C20814a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final C20814a m84628N0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C20814a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final C27035b m84630O0(C38266c viewModel, C34911a c34911a) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27035b((C22762e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C22762e.class), null), (C28100a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28100a.class), null), (String) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(String.class)), (String) c34911a.m110110a(1, c22673i0.getOrCreateKotlinClass(String.class)), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final C32876d m84632P0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C28049b c28049b = new C28049b(factory, 1);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C32876d((InterfaceC26834e) factory.m122602a(c28049b, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (C30539a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C30539a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final C34911a m84634Q0(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("universal-checkout-bff-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R0 */
    public static final C37500a m84636R0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C37500a(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C35155b m84638S0(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C0972g c0972g = new C0972g(params, 25);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21159o0 interfaceC21159o0 = (InterfaceC21159o0) factory.m122602a(c0972g, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C35155b(interfaceC21159o0, (AbstractC12939a0) objM110111b, (C30539a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C30539a.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final C34911a m84640T0(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C35154a m84642U0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35154a((C30539a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30539a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final C30539a m84644V0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C30539a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final C36275b m84646W0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36275b((C32876d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C32876d.class), null), (C37500a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C37500a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final CheckoutApi m84648X0(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "universal-checkout-gson");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34643d c34643dM109481a = ((C34644e) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null)).m109481a((Gson) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), c35953cM73387t), (AbstractC0757c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("universal-checkout-json")), AbstractC12350b.m34570S("kt-serialization-universal-checkout"));
        C29222x0 c29222x0 = new C29222x0();
        return (CheckoutApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")), CheckoutApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final C36255d m84650Y0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36255d((InterfaceC26834e) factory.m122602a(new C28049b(factory, 3), AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC26834e.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final C34911a m84652Z0(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("universal-checkout-bff-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a1 */
    public static final C39692a m84655a1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C39692a(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final C37479b m84658b1(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C0972g c0972g = new C0972g(params, 28);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21159o0 interfaceC21159o0 = (InterfaceC21159o0) factory.m122602a(c0972g, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
        }
        AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) objM110111b;
        Object objM110111b2 = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b2 == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C37479b(interfaceC21159o0, abstractC12939a0, (AbstractC12939a0) objM110111b2, (C35143a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35143a.class), null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final C34911a m84661c1(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final C37478a m84664d1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C37478a((C35143a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35143a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final C35143a m84667e1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35143a((InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null));
    }

    /* JADX INFO: renamed from: f0 */
    private static final C23454a0 m84669f0(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "universal-checkout-mapping");
        C28046a c28046a = new C28046a(7);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c28046a, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), false, "universal-checkout-bff-cache-deserializer");
        C28046a c28046a2 = new C28046a(9);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class);
        C35953c c35953cM73385r2 = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass2, c35953cM73385r, c28046a2, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM73385r, c35953c), false, "universal-checkout-gson");
        C28046a c28046a3 = new C28046a(21);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(Gson.class);
        C35953c c35953cM53379t = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass3, c35953cM73385r2, c28046a3, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass3, c35953cM73385r2, c35953c), false, "universal-checkout-json");
        C28048a c28048a = new C28048a(3);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(AbstractC0757c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, c35953cM53379t, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass4, c35953cM53379t, c28048a, 1)), false);
        C28048a c28048a2 = new C28048a(11);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(CheckoutApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass5, null, c28048a2, 1)), false);
        C28048a c28048a3 = new C28048a(12);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(CartApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass6, null, c28048a3, 1)), false);
        C28048a c28048a4 = new C28048a(13);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C1876a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass7, null, c28048a4, 1)), false);
        C28048a c28048a5 = new C28048a(14);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C10661d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c28048a5, 2)), false);
        C28048a c28048a6 = new C28048a(15);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C13388h.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c28048a6, 2)), false);
        C28048a c28048a7 = new C28048a(16);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C40907a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c28048a7, 2)), false);
        C28046a c28046a4 = new C28046a(18);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C13386f.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c28046a4, 2)), false);
        C28046a c28046a5 = new C28046a(29);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C22654d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c28046a5, 2)), false);
        C28048a c28048a8 = new C28048a(10);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C30528a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c28048a8, 2)), false);
        C28048a c28048a9 = new C28048a(17);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C28068c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c28048a9, 2)), false);
        C28048a c28048a10 = new C28048a(18);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C12236b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass15, null, c28048a10, 2)), false);
        C28048a c28048a11 = new C28048a(19);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(C12235a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass16, null, c28048a11, 2)), false);
        C28048a c28048a12 = new C28048a(20);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(C28066a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass17, null, c28048a12, 2)), false);
        C28048a c28048a13 = new C28048a(21);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(C24621c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass18, null, c28048a13, 2)), false);
        C28048a c28048a14 = new C28048a(22);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(C17538a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass19, null, c28048a14, 2)), false);
        C28046a c28046a6 = new C28046a(8);
        InterfaceC21461d orCreateKotlinClass20 = c22673i0.getOrCreateKotlinClass(C29403b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass20, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass20, null, c28046a6, 2)), false);
        C28046a c28046a7 = new C28046a(10);
        InterfaceC21461d orCreateKotlinClass21 = c22673i0.getOrCreateKotlinClass(C21842e.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass21, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass21, null, c28046a7, 1)), false);
        C28046a c28046a8 = new C28046a(11);
        InterfaceC21461d orCreateKotlinClass22 = c22673i0.getOrCreateKotlinClass(C21838a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass22, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass22, null, c28046a8, 2)), false);
        C28046a c28046a9 = new C28046a(12);
        InterfaceC21461d orCreateKotlinClass23 = c22673i0.getOrCreateKotlinClass(C3540d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass23, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass23, null, c28046a9, 2)), false);
        C28046a c28046a10 = new C28046a(13);
        InterfaceC21461d orCreateKotlinClass24 = c22673i0.getOrCreateKotlinClass(C14680a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass24, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass24, null, c28046a10, 2)), false);
        C28046a c28046a11 = new C28046a(14);
        InterfaceC21461d orCreateKotlinClass25 = c22673i0.getOrCreateKotlinClass(C12256b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass25, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass25, null, c28046a11, 2)), false);
        C28046a c28046a12 = new C28046a(15);
        InterfaceC21461d orCreateKotlinClass26 = c22673i0.getOrCreateKotlinClass(C12255a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass26, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass26, null, c28046a12, 2)), false);
        C28046a c28046a13 = new C28046a(16);
        InterfaceC21461d orCreateKotlinClass27 = c22673i0.getOrCreateKotlinClass(C1882a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass27, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass27, null, c28046a13, 2)), false);
        C30330b c30330b = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C13430b.class), null, new C28046a(17), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b.f124471b, null, c35953c), new C31362a(c30330b), false);
        C30330b c30330b2 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C22762e.class), null, new C28046a(19), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b2.f124471b, null, c35953c), new C31362a(c30330b2), false);
        C30330b c30330b3 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28100a.class), null, new C28046a(20), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b3.f124471b, null, c35953c), new C31362a(c30330b3), false);
        C30330b c30330b4 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C25872b.class), null, new C28046a(22), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b4.f124471b, null, c35953c), new C31362a(c30330b4), false);
        C30330b c30330b5 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C25871a.class), null, new C28046a(23), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b5.f124471b, null, c35953c), new C31362a(c30330b5), false);
        C30330b c30330b6 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C20814a.class), null, new C28046a(24), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b6.f124471b, null, c35953c), new C31362a(c30330b6), false);
        C30330b c30330b7 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C27035b.class), null, new C28046a(25), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b7.f124471b, null, c35953c), new C31362a(c30330b7), false);
        C30330b c30330b8 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C32876d.class), null, new C28046a(26), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b8.f124471b, null, c35953c), new C31362a(c30330b8), false);
        C30330b c30330b9 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C37500a.class), null, new C28046a(27), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b9.f124471b, null, c35953c), new C31362a(c30330b9), false);
        C30330b c30330b10 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C35155b.class), null, new C28046a(28), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b10.f124471b, null, c35953c), new C31362a(c30330b10), false);
        C30330b c30330b11 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C35154a.class), null, new C28048a(0), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b11.f124471b, null, c35953c), new C31362a(c30330b11), false);
        C30330b c30330b12 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C30539a.class), null, new C28048a(1), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b12.f124471b, null, c35953c), new C31362a(c30330b12), false);
        C30330b c30330b13 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C36275b.class), null, new C28048a(2), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b13.f124471b, null, c35953c), new C31362a(c30330b13), false);
        C30330b c30330b14 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C36255d.class), null, new C28048a(4), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b14.f124471b, null, c35953c), new C31362a(c30330b14), false);
        C30330b c30330b15 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C39692a.class), null, new C28048a(5), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b15.f124471b, null, c35953c), new C31362a(c30330b15), false);
        C30330b c30330b16 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C37479b.class), null, new C28048a(6), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b16.f124471b, null, c35953c), new C31362a(c30330b16), false);
        C30330b c30330b17 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C37478a.class), null, new C28048a(7), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b17.f124471b, null, c35953c), new C31362a(c30330b17), false);
        C30330b c30330b18 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C35143a.class), null, new C28048a(8), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b18.f124471b, null, c35953c), new C31362a(c30330b18), false);
        C30330b c30330b19 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C38496b.class), null, new C28048a(9), 2);
        AbstractC25012a.m73393z(c30330b19, c33768a, AbstractC21598x.m60669Y(c30330b19.f124471b, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final C38496b m84670f1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C38496b((C36255d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C36255d.class), null), (C39692a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C39692a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final Map m84672g0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC25247g0.m73990Y(new C23465k("ORDER_DETAILS", c22673i0.getOrCreateKotlinClass(OrderDetailsModel.class)), new C23465k("CHECKOUT_INFO", c22673i0.getOrCreateKotlinClass(CheckoutInfoModel.class)), new C23465k("PREVIEW_TILE", c22673i0.getOrCreateKotlinClass(PreviewTileModel.class)), new C23465k("PAYMENT_METHOD_TILE", c22673i0.getOrCreateKotlinClass(PaymentMethodTileModel.class)), new C23465k("CHECKOUT_FOOTER", c22673i0.getOrCreateKotlinClass(CheckoutFooterModel.class)), new C23465k("RECEIPT_HEADER", c22673i0.getOrCreateKotlinClass(ReceiptHeaderModel.class)), new C23465k("REIMBURSEMENT", c22673i0.getOrCreateKotlinClass(ReimbursementTileModel.class)), new C23465k("PROMO_CODE_INPUT", c22673i0.getOrCreateKotlinClass(PromoCodeInputModel.class)), new C23465k("CART_ITEM", c22673i0.getOrCreateKotlinClass(CartItemModel.class)), new C23465k("EMPTY_CART_CONTENT", c22673i0.getOrCreateKotlinClass(EmptyCartContentModel.class)), new C23465k("SHIPPING_PROGRESS_BAR", c22673i0.getOrCreateKotlinClass(ShippingProgressBarModel.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final CartApi m84673g1(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "universal-checkout-json");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC0757c abstractC0757c = (AbstractC0757c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953cM73387t);
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(AbstractC34645f.m109482a(abstractC0757c));
        return (CartApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), CartApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final InterfaceC34640a m84675h0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("universal-checkout-json");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34642c((AbstractC0757c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953c), (Gson) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), new C35953c("universal-checkout-gson")), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), AbstractC12350b.m34570S("kt-serialization-universal-checkout"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final C1876a m84676h1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C1876a((CartApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(CartApi.class), null), null, null, (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C13386f m84678i0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C13386f((C10661d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C10661d.class), null), (C13388h) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C13388h.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final C10661d m84679i1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C10661d((CartApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(CartApi.class), null), (C1876a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C1876a.class), null), (C36684a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36684a.class), null), null, (InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C22654d m84681j0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C1873h c1873h = new C1873h(factory, 29);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C22654d((InterfaceC26834e) factory.m122602a(c1873h, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (C38458b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C38458b.class), null), (C21842e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21842e.class), null), (CheckoutApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(CheckoutApi.class), null), (C17538a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C17538a.class), null), (C36684a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36684a.class), null), (C32266a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C32266a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (BannerInvalidator) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(BannerInvalidator.class), null), null, 512, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j1 */
    public static final C13388h m84682j1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C13388h(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C34911a m84684k0(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("universal-checkout-bff-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final C40907a m84685k1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C40907a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public static final C30528a m84687l0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C30528a(null, (FeatureFlagChecker) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null), 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C28068c m84689m0(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C0972g c0972g = new C0972g(params, 27);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21159o0 interfaceC21159o0 = (InterfaceC21159o0) factory.m122602a(c0972g, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
        }
        AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) objM110111b;
        InterfaceC27353d interfaceC27353d = (InterfaceC27353d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27353d.class), null);
        Object objM110111b2 = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b2 == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C28068c(interfaceC21159o0, abstractC12939a0, (AbstractC12939a0) objM110111b2, (C17538a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C17538a.class), null), interfaceC27353d, null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C34911a m84691n0(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C12236b m84693o0(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C28050c c28050c = new C28050c(params, 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21159o0 interfaceC21159o0 = (InterfaceC21159o0) factory.m122602a(c28050c, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C12236b(interfaceC21159o0, (AbstractC12939a0) objM110111b, (C40907a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C40907a.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C34911a m84695p0(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C12235a m84697q0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C12235a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C28066a m84699r0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28066a((C17538a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17538a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C24621c m84701s0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C24621c((C17538a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17538a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C17538a m84703t0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C17538a((InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (InterfaceC34116n) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34116n.class), null), (InterfaceC21153l0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21153l0.class), null), (C21842e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21842e.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C29403b m84705u0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29403b((C22654d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C22654d.class), null), (C21842e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C21842e.class), null), (C30528a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30528a.class), null), (C24621c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C24621c.class), null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final Gson m84707v0(C38266c c38266c, C34911a c34911a) {
        return AbstractC6730d.m20388f(new GsonBuilder(), (Map) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "universal-checkout-mapping")), null, 2, null).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C21842e m84709w0(C38266c c38266c, C34911a c34911a) {
        Context contextM8292e = AbstractC2875y.m8292e(c38266c, "$this$single", c34911a, "it", c38266c);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21842e(contextM8292e, (InterfaceC2994c0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (C34387c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34387c.class), null), (C28162g) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C28162g.class), null), (C21838a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C21838a.class), null), (C32266a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C32266a.class), null), (FeatureFlagChecker) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 128, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x0 */
    public static final C21838a m84711x0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21838a(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C3540d m84713y0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C28049b c28049b = new C28049b(factory, 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C3540d((InterfaceC26834e) factory.m122602a(c28049b, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (C1882a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C1882a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C34911a m84715z0(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("universal-checkout-bff-cache-deserializer"))}));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m84669f0(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<InterfaceC26584j> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
