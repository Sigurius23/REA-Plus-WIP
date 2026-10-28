package nz1;

import a02.C0096a;
import a02.C0097b;
import ad3.AbstractC0757c;
import androidx.fragment.app.AbstractActivityC1340r0;
import ao1.C1871f;
import ao1.C1873h;
import ao2.C1876a;
import b02.C2202f;
import c02.C3812c;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.models.items.ShippingProgressBarModel;
import com.whoop.nativestore.home.domain.api.NativeStoreApi;
import com.whoop.nativestore.home.domain.model.ShopBannerCarouselModel;
import com.whoop.nativestore.home.domain.model.ShopCategoryModel;
import com.whoop.nativestore.home.domain.model.ShopProductCarouselModel;
import com.whoop.nativestore.pdp.domain.api.PdpApi;
import com.whoop.nativestore.pdp.domain.model.PackItemModel;
import com.whoop.nativestore.pdp.domain.model.ProductAccordionListModel;
import com.whoop.nativestore.pdp.domain.model.ProductDescriptionHeaderModel;
import com.whoop.nativestore.pdp.domain.model.ProductDetailsSectionModel;
import com.whoop.nativestore.pdp.domain.model.ProductImageGalleryModel;
import com.whoop.nativestore.pdp.domain.model.ProductVariantSelectorModel;
import com.whoop.nativestore.pdp.domain.model.WhoopYourWayPriceBreakdownAccordionModel;
import d02.C11444a;
import e02.C12512h;
import fi0.InterfaceC14515a;
import g02.C14945a;
import ge3.AbstractC15751g;
import i02.C17847a;
import j02.InterfaceC21159o0;
import j93.InterfaceC21461d;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import oz1.C28498a;
import p031b9.AbstractC2875y;
import p114eb.AbstractC12939a0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29222x0;
import pz1.C29646d;
import pz1.C29647e;
import qf3.C30330b;
import r80.AbstractC31061c;
import rf3.C31362a;
import rf3.C31365d;
import sr2.AbstractC32943y;
import sz1.C33236a;
import sz1.C33238c;
import tf3.C33768a;
import tz1.C34285g;
import u82.C34648i;
import u82.InterfaceC34640a;
import ud3.C34826l0;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import vz1.C36614a;
import wb3.AbstractC37056f;
import wf3.C37247a;
import wz1.C37781a;
import xf3.C38266c;
import xm0.C38458b;
import xz1.C38761f;

/* JADX INFO: renamed from: nz1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lnz1/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27306b implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f109367c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Map m82405A(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC25247g0.m73990Y(new C23465k("PRODUCT_IMAGE_GALLERY", c22673i0.getOrCreateKotlinClass(ProductImageGalleryModel.class)), new C23465k("SHOP_CATEGORY", c22673i0.getOrCreateKotlinClass(ShopCategoryModel.class)), new C23465k("SHOP_BANNER_CAROUSEL", c22673i0.getOrCreateKotlinClass(ShopBannerCarouselModel.class)), new C23465k("SHOP_PRODUCT_CAROUSEL", c22673i0.getOrCreateKotlinClass(ShopProductCarouselModel.class)), new C23465k("PRODUCT_DESCRIPTION_HEADER", c22673i0.getOrCreateKotlinClass(ProductDescriptionHeaderModel.class)), new C23465k("PRODUCT_VARIANT_SELECTOR", c22673i0.getOrCreateKotlinClass(ProductVariantSelectorModel.class)), new C23465k("PRODUCT_ACCORDION_LIST", c22673i0.getOrCreateKotlinClass(ProductAccordionListModel.class)), new C23465k("PRODUCT_DETAILS_SECTION", c22673i0.getOrCreateKotlinClass(ProductDetailsSectionModel.class)), new C23465k("PACK_ITEM", c22673i0.getOrCreateKotlinClass(PackItemModel.class)), new C23465k("WHOOP_YOUR_WAY_PRICE_BREAKDOWN_ACCORDION", c22673i0.getOrCreateKotlinClass(WhoopYourWayPriceBreakdownAccordionModel.class)), new C23465k("SHIPPING_PROGRESS_TILE", c22673i0.getOrCreateKotlinClass(ShippingProgressBarModel.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final AbstractC0757c m82406B(C38266c c38266c, C34911a c34911a) {
        return AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "native-store-model-mapping")), null, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C17847a m82407C(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C17847a((C38761f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C38761f.class), null), (C2202f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C2202f.class), null), (C1876a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C1876a.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C36614a m82408D(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36614a((C29646d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C29646d.class), null), (C34285g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C34285g.class), null), (C28498a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28498a.class), null), (C1876a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C1876a.class), null), (FeatureFlagChecker) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C33238c m82409E(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C33238c((AbstractC12939a0) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class)), (InterfaceC21159o0) factory.m122602a(new C1871f((AbstractActivityC1340r0) c34911a.m110110a(1, c22673i0.getOrCreateKotlinClass(AbstractActivityC1340r0.class)), 6), c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C34911a m82410F(AbstractActivityC1340r0 abstractActivityC1340r0) {
        return AbstractC15751g.m44431K(abstractActivityC1340r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C28498a m82411G(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28498a((InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C37781a m82412H(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C37781a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C33236a m82413I(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C33236a((C28498a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28498a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C0097b m82414J(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C0097b((AbstractC12939a0) c34911a.m110110a(1, c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class)), (InterfaceC21159o0) factory.m122602a(new C1871f((AbstractActivityC1340r0) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(AbstractActivityC1340r0.class)), 7), c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null), (C1876a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C1876a.class), null), (C37781a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37781a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C34911a m82415K(AbstractActivityC1340r0 abstractActivityC1340r0) {
        return AbstractC15751g.m44431K(abstractActivityC1340r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C0096a m82416L(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C0096a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public static final C3812c m82417M(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C3812c((PdpApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PdpApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public static final C12512h m82418N(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C12512h(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final InterfaceC34640a m82419O(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34648i((AbstractC0757c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("native-store-json")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C14945a m82420P(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C14945a((C3812c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C3812c.class), null), (C12512h) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C12512h.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C11444a m82421Q(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        return new C11444a((AbstractC12939a0) c34911a.m110110a(0, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC12939a0.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final NativeStoreApi m82422R(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$single", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return (NativeStoreApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC25012a.m73384q((AbstractC0757c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), AbstractC31061c.m95649y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0M73382o, "native-store-json")), c29222x0M73382o, "defaultOkHttpClient")), NativeStoreApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final PdpApi m82423S(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$single", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return (PdpApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC25012a.m73384q((AbstractC0757c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), AbstractC31061c.m95649y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0M73382o, "native-store-json")), c29222x0M73382o, "defaultOkHttpClient")), PdpApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C29646d m82424T(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C1873h c1873h = new C1873h(factory, 28);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29646d((InterfaceC26834e) factory.m122602a(c1873h, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (C1876a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C1876a.class), null), (C38458b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C38458b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C34911a m82425U(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("native-store-bff-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C38761f m82426V(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C38761f((PdpApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(PdpApi.class), null), (C1876a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C1876a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C29647e m82427W(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29647e((NativeStoreApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(NativeStoreApi.class), null), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public static final C34285g m82428X(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34285g(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public static final C2202f m82429Y(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C2202f(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: z */
    private static final C23454a0 m82455z(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "native-store-model-mapping");
        C27305a c27305a = new C27305a(0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c27305a, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), false, "native-store-json");
        C27305a c27305a2 = new C27305a(2);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(AbstractC0757c.class);
        C35953c c35953cM73385r2 = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass2, c35953cM73385r, c27305a2, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM73385r, c35953c), false, "native-store-bff-cache-deserializer");
        C27305a c27305a3 = new C27305a(5);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, c35953cM73385r2, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, c35953cM73385r2, c27305a3, 2)), false);
        C27305a c27305a4 = new C27305a(6);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(NativeStoreApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass4, null, c27305a4, 1)), false);
        C27305a c27305a5 = new C27305a(7);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(PdpApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass5, null, c27305a5, 1)), false);
        C27305a c27305a6 = new C27305a(8);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C29646d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c27305a6, 2)), false);
        C27305a c27305a7 = new C27305a(9);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C38761f.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c27305a7, 2)), false);
        C27305a c27305a8 = new C27305a(10);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C29647e.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c27305a8, 2)), false);
        C27305a c27305a9 = new C27305a(12);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C34285g.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c27305a9, 2)), false);
        C27305a c27305a10 = new C27305a(13);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C2202f.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c27305a10, 2)), false);
        C27305a c27305a11 = new C27305a(11);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C17847a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c27305a11, 2)), false);
        C27305a c27305a12 = new C27305a(14);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C36614a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c27305a12, 2)), false);
        C27305a c27305a13 = new C27305a(15);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C33238c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c27305a13, 2)), false);
        C27305a c27305a14 = new C27305a(16);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C28498a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c27305a14, 2)), false);
        C27305a c27305a15 = new C27305a(17);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C37781a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass15, null, c27305a15, 2)), false);
        C27305a c27305a16 = new C27305a(18);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(C33236a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass16, null, c27305a16, 2)), false);
        C27305a c27305a17 = new C27305a(19);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(C0097b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass17, null, c27305a17, 2)), false);
        C27305a c27305a18 = new C27305a(20);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(C0096a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass18, null, c27305a18, 2)), false);
        C27305a c27305a19 = new C27305a(21);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(C3812c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass19, null, c27305a19, 2)), false);
        C27305a c27305a20 = new C27305a(1);
        InterfaceC21461d orCreateKotlinClass20 = c22673i0.getOrCreateKotlinClass(C12512h.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass20, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass20, null, c27305a20, 2)), false);
        C27305a c27305a21 = new C27305a(3);
        InterfaceC21461d orCreateKotlinClass21 = c22673i0.getOrCreateKotlinClass(C14945a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass21, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass21, null, c27305a21, 2)), false);
        C27305a c27305a22 = new C27305a(4);
        InterfaceC21461d orCreateKotlinClass22 = c22673i0.getOrCreateKotlinClass(C11444a.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass22, null, c27305a22, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass22, null, c35953c), false);
        return C23454a0.f92919a;
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m82455z(c33768a);
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
