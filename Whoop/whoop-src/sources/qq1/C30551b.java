package qq1;

import ad3.AbstractC0757c;
import com.google.gson.Gson;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.AbstractC6730d;
import f91.C14283a;
import fi0.InterfaceC14515a;
import gq1.C16081a;
import hq1.C17564c;
import ih0.AbstractC18489d0;
import iq1.C20851d;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import lq1.C24667g;
import m83.AbstractC25260n;
import mq1.C25886a;
import mq1.C25887b;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import nq1.C27057b;
import on2.C28049b;
import p000.BehaviorImpactApi;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29222x0;
import qf3.C30330b;
import qi1.C30411a;
import rf3.C31362a;
import rf3.C31365d;
import rq1.C31711c;
import sr2.AbstractC32943y;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u82.C34642c;
import u82.C34643d;
import u82.C34644e;
import u82.InterfaceC34640a;
import ud3.C34826l0;
import uf3.C34911a;
import uq1.C35162b;
import v82.C35799a;
import vf3.C35953c;
import vq1.C36283a;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: qq1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lqq1/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30551b implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f125728c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C14283a(), new C35799a());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C34911a m93652A(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("BEHAVIOR_IMPACT_BFF_CACHE_DESERIALIZER"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C16081a m93653B(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C16081a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final BehaviorImpactApi m93654C(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "BEHAVIOR_IMPACT_GSON");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34643d c34643dM109481a = ((C34644e) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null)).m109481a((Gson) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), c35953cM73387t), (AbstractC0757c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("BEHAVIOR_IMPACT_JSON")), AbstractC12350b.m34570S("kt-serialization-behavior-impact"));
        C29222x0 c29222x0 = new C29222x0();
        return (BehaviorImpactApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")), BehaviorImpactApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C31711c m93655D(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C31711c((InterfaceC26834e) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC26834e.class), new C35953c("BEHAVIOR_IMPACT_CACHED_API_SOURCE")), InterfaceC34116n.INSTANCE.m107848a("BehaviorImpacts"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C17564c m93656E(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "BEHAVIOR_IMPACT_CACHED_API_SOURCE");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C17564c((InterfaceC26834e) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), c35953cM73387t), (BehaviorImpactApi) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(BehaviorImpactApi.class), null), InterfaceC34116n.INSTANCE.m107848a("BehaviorImpactsDetails"), (C16081a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C16081a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C20851d m93657F(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C20851d((InterfaceC26834e) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC26834e.class), new C35953c("BEHAVIOR_IMPACT_CACHED_API_SOURCE")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C36283a m93658G(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36283a();
    }

    /* JADX INFO: renamed from: q */
    private static final C23454a0 m93675q(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "BEHAVIOR_IMPACT_GSON");
        C30411a c30411a = new C30411a(17);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Gson.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM53379t = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c30411a, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), false, "BEHAVIOR_IMPACT_JSON");
        C30411a c30411a2 = new C30411a(28);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(AbstractC0757c.class);
        C35953c c35953cM53379t2 = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass2, c35953cM53379t, c30411a2, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM53379t, c35953c), false, "BEHAVIOR_IMPACT_BFF_CACHE_DESERIALIZER");
        C30411a c30411a3 = new C30411a(29);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class);
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass3, c35953cM53379t2, c30411a3, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass3, c35953cM53379t2, c35953c), false, "BEHAVIOR_IMPACT_CACHED_API_SOURCE");
        C30550a c30550a = new C30550a(0);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, c35953cM73385r, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, c35953cM73385r, c30550a, 2)), false);
        C30550a c30550a2 = new C30550a(1);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C16081a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c30550a2, 2)), false);
        C30411a c30411a4 = new C30411a(18);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(BehaviorImpactApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass6, null, c30411a4, 1)), false);
        C30411a c30411a5 = new C30411a(19);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C31711c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c30411a5, 2)), false);
        C30411a c30411a6 = new C30411a(20);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C17564c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c30411a6, 2)), false);
        C30411a c30411a7 = new C30411a(21);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C20851d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c30411a7, 2)), false);
        C30411a c30411a8 = new C30411a(22);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C36283a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c30411a8, 2)), false);
        C30411a c30411a9 = new C30411a(23);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C27057b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c30411a9, 2)), false);
        C30411a c30411a10 = new C30411a(24);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C25887b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c30411a10, 2)), false);
        C30411a c30411a11 = new C30411a(25);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C35162b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c30411a11, 2)), false);
        C30411a c30411a12 = new C30411a(26);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C24667g.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c30411a12, 2)), false);
        C30411a c30411a13 = new C30411a(27);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C25886a.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass15, null, c30411a13, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Gson m93676r(C38266c c38266c, C34911a c34911a) {
        Gson gsonCreate = AbstractC6730d.m20388f(AbstractC18489d0.m53366g(c38266c, "$this$single", c34911a, "it"), null, null, 3, null).create();
        AbstractC22676k.m65749i(gsonCreate, "create(...)");
        return gsonCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final AbstractC0757c m93677s(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return AbstractC6728b.m20380e(single, null, null, null, null, null, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C27057b m93678t(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C27057b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static final C25887b m93679u(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25887b(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C35162b m93680v(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35162b(null, (C31711c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C31711c.class), null), (C36283a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C36283a.class), null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C24667g m93681w(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C24667g(null, (C17564c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C17564c.class), null), (C27057b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27057b.class), null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C25886a m93682x(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25886a((C20851d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C20851d.class), null), (C25887b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C25887b.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final InterfaceC34640a m93683y(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("BEHAVIOR_IMPACT_JSON");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34642c((AbstractC0757c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953c), (Gson) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), new C35953c("BEHAVIOR_IMPACT_GSON")), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), AbstractC12350b.m34570S("kt-serialization-behavior-impact-cache"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final InterfaceC26834e m93684z(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return (InterfaceC26834e) factory.m122602a(new C28049b(factory, 6), AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC26834e.class), null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m93675q(c33768a);
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
