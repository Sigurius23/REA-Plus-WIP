package bh2;

import a13.C0148f;
import ah2.C0892a;
import b52.C2741a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.stealthmode.api.StealthModeApi;
import dh2.C12051d;
import fh2.C14491a;
import fh2.C14492b;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import gh2.C15855a;
import j93.InterfaceC21461d;
import java.util.List;
import jh2.C21699a;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29224y0;
import qf3.C30330b;
import rf3.C31362a;
import rr2.InterfaceC31766c;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import we1.InterfaceC37217a;
import wf3.C37247a;
import xe1.C38231a;
import xf3.C38266c;

/* JADX INFO: renamed from: bh2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lbh2/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3253b implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C38231a(), new C35799a());

    /* JADX INFO: renamed from: i */
    private static final C23454a0 m9463i(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C2741a c2741a = new C2741a(25);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C21699a.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c2741a, 2)), false);
        C2741a c2741a2 = new C2741a(26);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C12051d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c2741a2, 2)), false);
        C2741a c2741a3 = new C2741a(27);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C14492b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c2741a3, 2)), false);
        C2741a c2741a4 = new C2741a(28);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C0892a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c2741a4, 2)), false);
        C2741a c2741a5 = new C2741a(29);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C14491a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c2741a5, 2)), false);
        C3252a c3252a = new C3252a(0);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C15855a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c3252a, 2)), false);
        C3252a c3252a2 = new C3252a(1);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(StealthModeApi.class);
        AbstractC11895b.m31980C(new C30330b(c35953c, orCreateKotlinClass7, null, c3252a2, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C21699a m9464j(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21699a((C12051d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C12051d.class), null), (C14492b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C14492b.class), null), (C14491a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C14491a.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C12051d m9465k(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12051d((StealthModeApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(StealthModeApi.class), null), (C0892a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C0892a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC37217a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC37217a.class), null), (InterfaceC34116n) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34116n.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C14492b m9466l(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C14492b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C0892a m9467m(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C0892a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C14491a m9468n(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C14491a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C15855a m9469o(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C15855a((StealthModeApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(StealthModeApi.class), null), (InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final StealthModeApi m9470p(C38266c c38266c, C34911a c34911a) {
        return (StealthModeApi) ((C29224y0) c38266c.m122602a(new C0148f(13), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "featureFlaggableLegacyDefaultRetrofit"))).m88733b(StealthModeApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C34911a m9471q() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S("kt-serialization-stealth-mode"));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m9463i(c33768a);
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
