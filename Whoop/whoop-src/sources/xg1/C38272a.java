package xg1;

import ah1.C0891a;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import ci2.InterfaceC4733b;
import com.whoop.data.repositories.FeatureFlagChecker;
import el1.C13319b;
import fi0.InterfaceC14515a;
import it0.C20926b;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.util.List;
import js0.AbstractC21909c;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import p007a6.InterfaceC0422g;
import p218ic.AbstractC18377p0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import vf3.C35953c;
import wf3.C37247a;
import x52.C37993a;
import xf3.C38266c;
import yg1.C39525b;
import zg1.C40632b;
import zg1.InterfaceC40631a;

/* JADX INFO: renamed from: xg1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lxg1/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "firmware-feature-flag_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38272a implements InterfaceC26584j {
    /* JADX INFO: renamed from: f */
    private static final C23454a0 m122626f(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C37993a c37993a = new C37993a(7);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C13319b.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c37993a, 2)), false);
        C37993a c37993a2 = new C37993a(8);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C39525b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c37993a2, 2)), false);
        C37993a c37993a3 = new C37993a(9);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C20926b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass3, null, c37993a3, 1)), false);
        C37993a c37993a4 = new C37993a(10);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(InterfaceC40631a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c37993a4, 2)), false);
        C37993a c37993a5 = new C37993a(11);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C0891a.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass5, null, c37993a5, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C13319b m122627g(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C13319b(InterfaceC34116n.INSTANCE.m107848a("HistorySyncCompleteHook"), AbstractC3006f0.m8708b(AbstractC3050q0.f12077a.plus(AbstractC3006f0.m8710d())), (InterfaceC4733b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC4733b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C39525b m122628h(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C39525b(InterfaceC34116n.INSTANCE.m107848a("FirmwareUpdateStatusHook"), (InterfaceC4733b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC4733b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C20926b m122629i(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C20926b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC40631a m122630j(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC4733b interfaceC4733b = (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null);
        FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null);
        InterfaceC0422g interfaceC0422g = (InterfaceC0422g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null);
        InterfaceC14515a interfaceC14515a = (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null);
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C40632b(interfaceC4733b, featureFlagChecker, interfaceC0422g, interfaceC14515a, clockSystemUTC, InterfaceC34116n.INSTANCE.m107848a("FirmwareFeatureFlagUpdateServiceImpl"), (C13319b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C13319b.class), null), null, null, 384, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C0891a m122631k(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C0891a((AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (AbstractC18377p0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")), InterfaceC34116n.INSTANCE.m107848a("PeriodicFirmwareFeatureFlagUpdateScheduler"));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m122626f(c33768a);
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
