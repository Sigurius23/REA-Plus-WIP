package hy1;

import androidx.room.C1818p0;
import bc3.InterfaceC2994c0;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.metrics.domain.MetricsApi;
import com.whoop.metrics.domain.p064db.MetricDatabase;
import fy1.C14878n;
import fy1.InterfaceC14865a;
import fy1.InterfaceC14867c;
import fy1.InterfaceC14868d;
import fy1.InterfaceC14871g;
import fy1.InterfaceC14876l;
import gy1.C16279a;
import gy1.C16280b;
import gy1.C16281c;
import ho0.C17535d;
import iy1.C21028a;
import iy1.C21029b;
import iy1.C21032e;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import jy1.AbstractC22050d;
import jy1.InterfaceC22048b;
import l83.C23454a0;
import m83.AbstractC25260n;
import my1.C26032a;
import nd1.InterfaceC26584j;
import ny1.C27297d;
import or2.C28167h1;
import oy1.C28473a;
import oy1.C28474b;
import p031b9.AbstractC2875y;
import p218ic.AbstractC18377p0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p325mb.AbstractC25380b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import pg3.C29224y0;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import rr2.InterfaceC31766c;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: hy1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lhy1/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17809a implements InterfaceC26584j {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C16281c m51181A(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C16281c((InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), InterfaceC34116n.INSTANCE.m107848a("MetricsHelper"), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final InterfaceC14868d m51182B(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C16279a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final InterfaceC14867c m51183C(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return (InterfaceC14867c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14868d.class), null);
    }

    /* JADX INFO: renamed from: o */
    private static final C23454a0 m51198o(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        HashSet hashSet = module.f141343a;
        C17535d c17535d = new C17535d(11);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(MetricsApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c17535d, 1)), false);
        C17535d c17535d2 = new C17535d(20);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(InterfaceC14871g.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass2, null, c17535d2, 1)), false);
        C17535d c17535d3 = new C17535d(21);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C21032e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c17535d3, 2)), false);
        C17535d c17535d4 = new C17535d(22);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c17535d4, 2)), false);
        C17535d c17535d5 = new C17535d(23);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(MetricDatabase.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass5, null, c17535d5, 1)), false);
        C17535d c17535d6 = new C17535d(24);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(InterfaceC22048b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c17535d6, 2)), false);
        C17535d c17535d7 = new C17535d(12);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C28473a.class);
        C30330b c30330b = new C30330b(c35953c, orCreateKotlinClass7, null, c17535d7, 1);
        String strM60669Y = AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c);
        C31365d c31365d = new C31365d(c30330b);
        module.m106774b(strM60669Y, c31365d, false);
        hashSet.add(c31365d);
        C17535d c17535d8 = new C17535d(13);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C16281c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c17535d8, 2)), false);
        C17535d c17535d9 = new C17535d(14);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(InterfaceC14868d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass9, null, c17535d9, 1)), false);
        C17535d c17535d10 = new C17535d(15);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(InterfaceC14867c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c17535d10, 2)), false);
        C17535d c17535d11 = new C17535d(16);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(InterfaceC14876l.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c17535d11, 2)), false);
        C17535d c17535d12 = new C17535d(17);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C26032a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass12, null, c17535d12, 1)), false);
        C17535d c17535d13 = new C17535d(18);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C27297d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c17535d13, 2)), false);
        C17535d c17535d14 = new C17535d(19);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C28474b.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass14, null, c17535d14, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final MetricsApi m51199p(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "retrofitWithKtxSerialization"))).m88733b(MetricsApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (MetricsApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final InterfaceC14871g m51200q(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C14878n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final InterfaceC14876l m51201r(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C16280b((C16281c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C16281c.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (InterfaceC14871g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14871g.class), null), InterfaceC34116n.INSTANCE.m107848a("ScreenStateTracker"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C26032a m51202s(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C26032a((InterfaceC21030c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), null, null, null, 112, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C27297d m51203t(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27297d((InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), AbstractC29125c.m88532i(factory), (InterfaceC14865a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14865a.class), null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C28474b m51204u(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28474b((AbstractC18377p0) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C21032e m51205v(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        MetricsApi metricsApi = (MetricsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(MetricsApi.class), null);
        InterfaceC22048b interfaceC22048b = (InterfaceC22048b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC22048b.class), null);
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("MetricsInteractor");
        String str = ((C28167h1) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28167h1.class), null)).m85270c(AbstractC29125c.m88532i(factory)).versionName;
        if (str == null) {
            str = "99.99.99";
        }
        return new C21032e(metricsApi, interfaceC22048b, interfaceC34116nM107848a, str, (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public static final InterfaceC21030c m51206w(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21028a(AbstractC25260n.m74059b1(new InterfaceC21030c[]{factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21032e.class), null), new C21029b(null, 1, null)}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final MetricDatabase m51207x(C38266c c38266c, C34911a c34911a) {
        C1818p0 c1818p0M60645C = AbstractC21598x.m60645C(AbstractC2875y.m8292e(c38266c, "$this$single", c34911a, "it", c38266c), MetricDatabase.class, "metrics_db");
        AbstractC25380b[] abstractC25380bArrM63123a = AbstractC22050d.m63123a();
        c1818p0M60645C.m5449a((AbstractC25380b[]) Arrays.copyOf(abstractC25380bArrM63123a, abstractC25380bArrM63123a.length));
        return (MetricDatabase) c1818p0M60645C.m5450b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final InterfaceC22048b m51208y(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return ((MetricDatabase) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(MetricDatabase.class), null)).mo22885b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C28473a m51209z(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C28473a((AbstractC18377p0) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m51198o(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ List<InterfaceC26584j> getDependencies() {
        return super.getDependencies();
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
