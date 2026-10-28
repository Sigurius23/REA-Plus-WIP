package xl2;

import ad3.AbstractC0757c;
import c61.C4272a;
import ci2.InterfaceC4733b;
import cm2.C4812a;
import cm2.C4815c;
import cm2.C4832t;
import cm2.C4834v;
import cm2.C4836x;
import cm2.C4838z;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.exerciseprogressminiarch.domain.models.ArchMiniExerciseProgress;
import com.whoop.personalrecords.miniarch.domain.models.ArchMiniPersonalRecords;
import com.whoop.trends.data.TrendsApi;
import com.whoop.trends.data.model.MeasurementBox;
import com.whoop.trends.data.model.TrendMenuItemModel;
import hf1.InterfaceC17235b;
import in2.InterfaceC18732d;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import lf1.C23996f;
import m83.AbstractC25247g0;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import p031b9.AbstractC2875y;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import pg3.C29222x0;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import rr2.InterfaceC31766c;
import sr2.AbstractC32943y;
import tf3.C33768a;
import tl2.C33920a;
import tr2.InterfaceC34116n;
import u82.AbstractC34645f;
import ud3.C34826l0;
import uf3.C34911a;
import ul2.C35068a;
import ul2.C35070c;
import v82.C35799a;
import vf3.C35953c;
import vl2.C36119l;
import vl2.C36123p;
import vl2.C36128u;
import vl2.C36129v;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;
import z82.InterfaceC40188b;
import zl2.C40880a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: xl2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lxl2/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38455b implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C36119l m123209A(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36119l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C36123p m123210B(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36123p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C40880a m123211C(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C40880a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C36129v m123212D(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36129v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C4836x m123213E(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C4836x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C4834v m123214F(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C4834v((C4815c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C4815c.class), null), (C4836x) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C4836x.class), null), (C4812a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C4812a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (C4832t) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C4832t.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C4815c m123215G(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C4815c((C4836x) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4836x.class), null));
    }

    /* JADX INFO: renamed from: q */
    private static final C23454a0 m123232q(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C38454a c38454a = new C38454a(0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(TrendsApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c38454a, 1)), false);
        C38454a c38454a2 = new C38454a(13);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C35070c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c38454a2, 2)), false);
        C38454a c38454a3 = new C38454a(14);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C36128u.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c38454a3, 2)), false);
        C38454a c38454a4 = new C38454a(15);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C36119l.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c38454a4, 2)), false);
        C38454a c38454a5 = new C38454a(1);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C36123p.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c38454a5, 2)), false);
        C38454a c38454a6 = new C38454a(2);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C40880a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c38454a6, 2)), false);
        C38454a c38454a7 = new C38454a(3);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C36129v.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c38454a7, 2)), false);
        C38454a c38454a8 = new C38454a(4);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C4836x.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c38454a8, 2)), false);
        C38454a c38454a9 = new C38454a(5);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C4834v.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c38454a9, 2)), false);
        C38454a c38454a10 = new C38454a(6);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C4815c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c38454a10, 2)), false);
        C38454a c38454a11 = new C38454a(7);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C4812a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c38454a11, 2)), false);
        C38454a c38454a12 = new C38454a(8);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C4832t.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c38454a12, 2)), false);
        C38454a c38454a13 = new C38454a(9);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C35068a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c38454a13, 2)), false);
        C38454a c38454a14 = new C38454a(10);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C33920a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c38454a14, 2)), false);
        C38454a c38454a15 = new C38454a(11);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C23996f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass15, null, c38454a15, 2)), false);
        C38454a c38454a16 = new C38454a(12);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(C4838z.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass16, null, c38454a16, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final TrendsApi m123233r(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(single, AbstractC25247g0.m73990Y(new C23465k("MEASUREMENT_BOX", c22673i0.getOrCreateKotlinClass(MeasurementBox.class)), new C23465k("trend_menus", c22673i0.getOrCreateKotlinClass(TrendMenuItemModel.class)), new C23465k("MINI_ARCH_ALL_PRS", c22673i0.getOrCreateKotlinClass(ArchMiniPersonalRecords.class)), new C23465k("MINI_ARCH_EXERCISE_PROGRESS", c22673i0.getOrCreateKotlinClass(ArchMiniExerciseProgress.class))), null, null, null, null, 30, null);
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(((AbstractC32943y) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(AbstractC34645f.m109482a(abstractC0757cM20380e));
        return (TrendsApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), TrendsApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C35070c m123234s(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35070c((TrendsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(TrendsApi.class), null), InterfaceC34116n.INSTANCE.m107848a("TrendsRepository"), (InterfaceC18732d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C4812a m123235t(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C4812a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static final C4832t m123236u(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C4832t(null, AbstractC29125c.m88532i(factory), 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C35068a m123237v(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35068a(AbstractC29125c.m88532i(factory), InterfaceC34116n.INSTANCE.m107848a("HealthConnectClientWrapper"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C33920a m123238w(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C33920a((InterfaceC40188b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40188b.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (C4272a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C4272a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), InterfaceC34116n.INSTANCE.m107848a("TrendsAnalyticsHelper"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23996f m123239x(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C23996f((FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC17235b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC17235b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C4838z m123240y(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C4838z((C36128u) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C36128u.class), null), (C36119l) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C36119l.class), null), (C36123p) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C36123p.class), null), (C36129v) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C36129v.class), null), (C4834v) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C4834v.class), null), InterfaceC34116n.INSTANCE.m107848a("TrendsViewModel"), (C33920a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C33920a.class), null), (C23996f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C23996f.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C36128u m123241z(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36128u((C35070c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35070c.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (C35068a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35068a.class), null));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m123232q(c33768a);
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
