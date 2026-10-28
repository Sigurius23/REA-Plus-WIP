package qy1;

import com.whoop.data.repositories.FeatureFlagChecker;
import dj0.C12066b;
import dj0.C12086v;
import ej0.C13227a;
import fi0.InterfaceC14515a;
import iy1.InterfaceC21030c;
import j92.C21443k;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import od1.InterfaceC27837a0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import py1.C29622a;
import qf3.C30330b;
import qq1.C30550a;
import rf3.C31362a;
import ry1.C31911b;
import sy1.C33096a;
import sy1.C33097b;
import tf3.C33768a;
import uf3.C34911a;
import uy1.C35377a;
import uy1.C35379c;
import uy1.C35381e;
import uy1.C35382f;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import wy1.C37696c;
import wy1.C37697d;
import xf3.C38266c;
import xy1.C38701b;
import xy1.C38704e;
import y92.C39352a;
import z92.InterfaceC40205a;
import zy1.C41219a;
import zy1.C41220b;
import zy1.C41221c;
import zy1.C41224f;
import zy1.C41225g;
import zy1.C41226h;

/* JADX INFO: renamed from: qy1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lqy1/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30776a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C13227a());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C29622a m94574A(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29622a((InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C41224f m94575B(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        return new C41224f((C29622a) viewModel.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29622a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C41225g m94576C(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C41225g((C38704e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C38704e.class), null), (C41226h) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C41226h.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C41226h m94577D(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C41226h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C38704e m94578E(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C38704e((C29622a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29622a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C33096a m94579F(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C33096a((C31911b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C31911b.class), null), (C33097b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C33097b.class), null), (C12086v) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C12086v.class), null), null, null, null, 56, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C41219a m94580G(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C41219a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C41220b m94581H(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C41220b((C38701b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C38701b.class), null), (C41221c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C41221c.class), null), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C38701b m94582I(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C38701b((C12066b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C12066b.class), null), (C39352a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39352a.class), null), (C29622a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29622a.class), null), (InterfaceC40205a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C41221c m94583J(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C41221c((C41219a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41219a.class), null), (InterfaceC40205a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C31911b m94584K(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C12066b c12066b = (C12066b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C12066b.class), null);
        C12086v c12086v = (C12086v) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C12086v.class), null);
        InterfaceC27837a0 interfaceC27837a0 = (InterfaceC27837a0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27837a0.class), null);
        C37697d c37697d = (C37697d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37697d.class), null);
        C29622a c29622a = (C29622a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29622a.class), null);
        return new C31911b(c12066b, c12086v, interfaceC27837a0, (C39352a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39352a.class), null), c37697d, c29622a, null, ((Duration) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Duration.class), new C35953c("loading-delay"))).getRawValue(), null, 320, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C35377a m94585L(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35377a((C39352a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39352a.class), null), null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C35379c m94586M(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35379c((C39352a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39352a.class), null), (C35377a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35377a.class), null), (C12066b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C12066b.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (C37697d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37697d.class), null), (C29622a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29622a.class), null), null, 64, null);
    }

    /* JADX INFO: renamed from: t */
    private static final C23454a0 m94606t(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C30550a c30550a = new C30550a(3);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C33097b.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass, null, c30550a, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), false, "loading-delay");
        C30550a c30550a2 = new C30550a(4);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(Duration.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM73385r, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, c35953cM73385r, c30550a2, 2)), false);
        C30550a c30550a3 = new C30550a(5);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C33096a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c30550a3, 2)), false);
        C30550a c30550a4 = new C30550a(6);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C41219a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c30550a4, 2)), false);
        C30550a c30550a5 = new C30550a(7);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C41220b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c30550a5, 2)), false);
        C30550a c30550a6 = new C30550a(8);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C38701b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c30550a6, 2)), false);
        C30550a c30550a7 = new C30550a(9);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C41221c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c30550a7, 2)), false);
        C30550a c30550a8 = new C30550a(10);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C31911b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c30550a8, 2)), false);
        C30550a c30550a9 = new C30550a(11);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C35377a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c30550a9, 2)), false);
        C30550a c30550a10 = new C30550a(12);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C35379c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c30550a10, 2)), false);
        C30550a c30550a11 = new C30550a(13);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C37697d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c30550a11, 2)), false);
        C30550a c30550a12 = new C30550a(14);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C35382f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c30550a12, 2)), false);
        C30550a c30550a13 = new C30550a(15);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C35381e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c30550a13, 2)), false);
        C30550a c30550a14 = new C30550a(16);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C37696c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c30550a14, 2)), false);
        C30550a c30550a15 = new C30550a(17);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C29622a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass15, null, c30550a15, 2)), false);
        C30550a c30550a16 = new C30550a(18);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(C41224f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass16, null, c30550a16, 2)), false);
        C30550a c30550a17 = new C30550a(19);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(C41225g.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass17, null, c30550a17, 2)), false);
        C30550a c30550a18 = new C30550a(20);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(C41226h.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass18, null, c30550a18, 2)), false);
        C30550a c30550a19 = new C30550a(21);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(C38704e.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass19, null, c30550a19, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C33097b m94607u(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C33097b((C41219a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C41219a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final Duration m94608v(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m134260boximpl(DurationKt.toDuration(500, DurationUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C37697d m94609w(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37697d((C39352a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39352a.class), null), (C21443k) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21443k.class), null), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C35382f m94610x(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35382f((FeatureFlagChecker) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C35381e m94611y(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35381e((C35379c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C35379c.class), null), (C35382f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C35382f.class), null), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C37696c m94612z(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37696c((C35377a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35377a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 4, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m94606t(c33768a);
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
