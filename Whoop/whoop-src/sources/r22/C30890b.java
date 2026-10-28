package r22;

import a32.C0346a;
import ad3.AbstractC0757c;
import b32.C2678d;
import bh1.C3249a;
import bh1.C3250b;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.AbstractC6730d;
import com.whoop.payments.domain.PaymentsApi;
import com.whoop.payments.stripebottomsheettile.domain.StripeBottomSheetTileApi;
import com.whoop.payments.stripebottomsheettile.model.StripeBottomSheetTileModel;
import com.whoop.payments.stripepaymentsheettileminiarch.domain.MiniArchStripePaymentSheetTileApi;
import com.whoop.payments.stripepaymentsheettileminiarch.model.MiniArchStripePaymentSheetTileModel;
import e32.C12618e;
import f32.C14047a;
import fi0.InterfaceC14515a;
import g32.C15315o;
import ge3.AbstractC15751g;
import h32.C16830c;
import h32.InterfaceC16828a;
import i32.C18056c;
import ih0.AbstractC18489d0;
import iy1.InterfaceC21030c;
import j02.InterfaceC21159o0;
import j32.C21295j;
import j93.InterfaceC21461d;
import java.util.List;
import java.util.Map;
import k32.C22175a;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import od1.C27858u;
import on2.C28050c;
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
import pf.AbstractC29125c;
import pg3.C29222x0;
import pg3.C29224y0;
import q22.C29855e;
import q83.InterfaceC30057d;
import qf3.C30330b;
import qq1.C30550a;
import qw2.C30695c;
import rf3.C31362a;
import rf3.C31365d;
import t22.C33352b;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u02.C34387c;
import u22.C34490e;
import u22.C34494i;
import u22.InterfaceC34486a;
import u22.InterfaceC34493h;
import u82.C34643d;
import u82.C34644e;
import u82.InterfaceC34640a;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import w22.C36740a;
import w22.C36742c;
import wf3.C37247a;
import x22.C37863b;
import xf3.C38266c;
import y22.C39166a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: r22.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m65681d2 = {"Lr22/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30890b implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f127363c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: renamed from: r22.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC34486a {

        /* JADX INFO: renamed from: a */
        public static final b f127365a = new b();

        @Override // u22.InterfaceC34486a
        /* JADX INFO: renamed from: a */
        public final Object mo95014a(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: B */
    private static final C23454a0 m94960B(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "PAYMENTS_MODEL_MAPPING");
        C30550a c30550a = new C30550a(22);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM53379t = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c30550a, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), false, "PAYMENTS_GSON");
        C30550a c30550a2 = new C30550a(24);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(Gson.class);
        C35953c c35953cM53379t2 = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass2, c35953cM53379t, c30550a2, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM53379t, c35953c), false, "PAYMENTS_JSON");
        C30550a c30550a3 = new C30550a(29);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(AbstractC0757c.class);
        C35953c c35953cM53379t3 = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass3, c35953cM53379t2, c30550a3, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass3, c35953cM53379t2, c35953c), false, "PAYMENTS_RETROFIT");
        C30889a c30889a = new C30889a(0);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C29224y0.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, c35953cM53379t3, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass4, c35953cM53379t3, c30889a, 1)), false);
        C30889a c30889a2 = new C30889a(1);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(PaymentsApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass5, null, c30889a2, 1)), false);
        C30889a c30889a3 = new C30889a(2);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(StripeBottomSheetTileApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass6, null, c30889a3, 1)), false);
        C30889a c30889a4 = new C30889a(4);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C0346a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass7, null, c30889a4, 1)), false);
        C30889a c30889a5 = new C30889a(5);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C15315o.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c30889a5, 2)), false);
        C30889a c30889a6 = new C30889a(6);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C2678d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c30889a6, 2)), false);
        C30889a c30889a7 = new C30889a(7);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C14047a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c30889a7, 2)), false);
        C30889a c30889a8 = new C30889a(3);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C12618e.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c30889a8, 2)), false);
        C30889a c30889a9 = new C30889a(8);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C29855e.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c30889a9, 2)), false);
        C30889a c30889a10 = new C30889a(9);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(InterfaceC16828a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c30889a10, 2)), false);
        C30889a c30889a11 = new C30889a(10);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C34490e.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c30889a11, 2)), false);
        C30889a c30889a12 = new C30889a(11);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C39166a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass15, null, c30889a12, 2)), false);
        C30889a c30889a13 = new C30889a(12);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(C36742c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass16, null, c30889a13, 2)), false);
        C30889a c30889a14 = new C30889a(13);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(C36740a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass17, null, c30889a14, 2)), false);
        C30889a c30889a15 = new C30889a(14);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(C33352b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass18, null, c30889a15, 2)), false);
        C30889a c30889a16 = new C30889a(15);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(InterfaceC34493h.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass19, null, c30889a16, 2)), false);
        C30550a c30550a4 = new C30550a(23);
        InterfaceC21461d orCreateKotlinClass20 = c22673i0.getOrCreateKotlinClass(C37863b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass20, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass20, null, c30550a4, 2)), false);
        C30550a c30550a5 = new C30550a(25);
        InterfaceC21461d orCreateKotlinClass21 = c22673i0.getOrCreateKotlinClass(MiniArchStripePaymentSheetTileApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass21, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass21, null, c30550a5, 1)), false);
        C30550a c30550a6 = new C30550a(26);
        InterfaceC21461d orCreateKotlinClass22 = c22673i0.getOrCreateKotlinClass(C18056c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass22, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass22, null, c30550a6, 2)), false);
        C30550a c30550a7 = new C30550a(27);
        InterfaceC21461d orCreateKotlinClass23 = c22673i0.getOrCreateKotlinClass(C22175a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass23, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass23, null, c30550a7, 2)), false);
        C30550a c30550a8 = new C30550a(28);
        InterfaceC21461d orCreateKotlinClass24 = c22673i0.getOrCreateKotlinClass(C21295j.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass24, null, c30550a8, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass24, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final Map m94961C(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC25247g0.m73990Y(new C23465k("STRIPE_PAYMENT_SHEET_TILE", c22673i0.getOrCreateKotlinClass(StripeBottomSheetTileModel.class)), new C23465k("MINI_ARCH_STRIPE_PAYMENT_SHEET_TILE", c22673i0.getOrCreateKotlinClass(MiniArchStripePaymentSheetTileModel.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final Gson m94962D(C38266c c38266c, C34911a c34911a) {
        return AbstractC6730d.m20389g(c38266c, new GsonBuilder(), (Map) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "PAYMENTS_MODEL_MAPPING")), null, 4, null).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C12618e m94963E(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12618e((C2678d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C2678d.class), null), (C14047a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C14047a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C29855e m94964F(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29855e((InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), ((C27858u) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext"))).m84055f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final InterfaceC16828a m94965G(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C16830c((PaymentsApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PaymentsApi.class), null), AbstractC29125c.m88532i(factory), InterfaceC34116n.INSTANCE.m107848a("StripeManager"), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C34490e m94966H(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "PAYMENTS_MODEL_MAPPING");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Map map = (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t);
        InterfaceC26834e interfaceC26834e = (InterfaceC26834e) c38266c.m122602a(new C3250b(map, (InterfaceC34640a) c38266c.m122602a(new C3249a(map, 7), c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("KotlinxDeserializer")), 13), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null);
        C30695c c30695c = (C30695c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C30695c.class), null);
        InterfaceC21030c interfaceC21030c = (InterfaceC21030c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null);
        StripeBottomSheetTileApi stripeBottomSheetTileApi = (StripeBottomSheetTileApi) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(StripeBottomSheetTileApi.class), null);
        C0346a c0346a = (C0346a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C0346a.class), null);
        InterfaceC34486a interfaceC34486a = (InterfaceC34486a) c38266c.m122604c(null, c22673i0.getOrCreateKotlinClass(InterfaceC34486a.class), null);
        if (interfaceC34486a == null) {
            interfaceC34486a = b.f127365a;
        }
        return new C34490e(interfaceC26834e, c30695c, interfaceC21030c, stripeBottomSheetTileApi, c0346a, interfaceC34486a, (FeatureFlagChecker) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 128, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C34911a m94967I(Map map) {
        return AbstractC15751g.m44431K(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C34911a m94968J(Map map, InterfaceC34640a interfaceC34640a) {
        return AbstractC15751g.m44431K(map, interfaceC34640a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public static final C39166a m94969K(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C39166a(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C36742c m94970L(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C28050c c28050c = new C28050c(params, 4);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21159o0 interfaceC21159o0 = (InterfaceC21159o0) factory.m122602a(c28050c, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b != null) {
            return new C36742c(interfaceC21159o0, (AbstractC12939a0) objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C34911a m94971M(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C36740a m94972N(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36740a((C33352b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33352b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C33352b m94973O(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C33352b((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final InterfaceC34493h m94974P(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34494i((C34387c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34387c.class), null), null, InterfaceC34116n.INSTANCE.m107848a("PaymentMethodMenuItemRepository"), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C37863b m94975Q(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37863b((C34490e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C34490e.class), null), (C39166a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C39166a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final AbstractC0757c m94976R(C38266c c38266c, C34911a c34911a) {
        return AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "PAYMENTS_MODEL_MAPPING")), null, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final MiniArchStripePaymentSheetTileApi m94977S(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "PAYMENTS_RETROFIT"))).m88733b(MiniArchStripePaymentSheetTileApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (MiniArchStripePaymentSheetTileApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public static final C18056c m94978T(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C18056c((MiniArchStripePaymentSheetTileApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(MiniArchStripePaymentSheetTileApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C22175a m94979U(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C22175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C21295j m94980V(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21295j((C18056c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C18056c.class), null), (C22175a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C22175a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C29224y0 m94981W(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34643d c34643dM109481a = ((C34644e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null)).m109481a((Gson) single.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), new C35953c("PAYMENTS_GSON")), (AbstractC0757c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("PAYMENTS_JSON")), AbstractC12350b.m34570S("kt-serialization-payments-module"));
        C29224y0 c29224y0 = (C29224y0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C29224y0.class), new C35953c("baseRetrofit"));
        c29224y0.getClass();
        C29222x0 c29222x0 = new C29222x0(c29224y0);
        c29222x0.m88728b(c34643dM109481a);
        return c29222x0.m88730d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final PaymentsApi m94982X(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "PAYMENTS_RETROFIT"))).m88733b(PaymentsApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (PaymentsApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final StripeBottomSheetTileApi m94983Y(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "PAYMENTS_RETROFIT"))).m88733b(StripeBottomSheetTileApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (StripeBottomSheetTileApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C0346a m94984Z(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C0346a((InterfaceC14515a) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C15315o m94986a0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C15315o((C28162g) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28162g.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C2678d m94988b0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C2678d((StripeBottomSheetTileApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(StripeBottomSheetTileApi.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (C0346a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C0346a.class), null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C14047a m94990c0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C14047a();
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m94960B(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<C35799a> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
