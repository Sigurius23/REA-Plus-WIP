package iu1;

import ad3.AbstractC0757c;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import ci2.InterfaceC4733b;
import com.google.gson.Gson;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.labradorService.data.LabradorPacketDatabase;
import com.whoop.labradorService.network.LabradorNetworkApi;
import eu1.C13643b;
import fi0.InterfaceC14515a;
import fu1.InterfaceC14783b;
import gu1.C16213a;
import hu1.C17652i;
import hu1.InterfaceC17647d;
import in0.C18719a;
import j93.InterfaceC21461d;
import java.io.File;
import java.time.Clock;
import java.util.List;
import js0.AbstractC21909c;
import ju1.C21961a;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import ku1.C22836a;
import l83.C23454a0;
import mh2.C25561a;
import nd1.InterfaceC26584j;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
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
import sr2.AbstractC32943y;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import ts0.InterfaceC34136a;
import u82.AbstractC34650k;
import u82.C34643d;
import u82.C34644e;
import ud3.C34826l0;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import vt0.C36484a;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: iu1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Liu1/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "labrador-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20936a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: renamed from: i */
    private static final C23454a0 m58128i(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C18719a c18719a = new C18719a(9);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(LabradorPacketDatabase.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c18719a, 1)), false);
        C18719a c18719a2 = new C18719a(10);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(LabradorNetworkApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass2, null, c18719a2, 1)), false);
        C18719a c18719a3 = new C18719a(11);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C22836a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass3, null, c18719a3, 1)), false);
        C18719a c18719a4 = new C18719a(12);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(InterfaceC17647d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass4, null, c18719a4, 1)), false);
        C18719a c18719a5 = new C18719a(13);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C17652i.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c18719a5, 2)), false);
        C18719a c18719a6 = new C18719a(14);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(InterfaceC14783b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass6, null, c18719a6, 1)), false);
        C18719a c18719a7 = new C18719a(15);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C16213a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c18719a7, 2)), false);
        C18719a c18719a8 = new C18719a(16);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C13643b.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass8, null, c18719a8, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final LabradorPacketDatabase m58129j(C38266c c38266c, C34911a c34911a) {
        return (LabradorPacketDatabase) AbstractC21598x.m60645C(AbstractC2875y.m8292e(c38266c, "$this$single", c34911a, "it", c38266c), LabradorPacketDatabase.class, "ecg_packets_db").m5450b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final LabradorNetworkApi m58130k(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        Gson gson = new Gson();
        AbstractC0757c abstractC0757cM109496c = AbstractC34650k.m109496c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34643d c34643dM109481a = ((C34644e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null)).m109481a(gson, abstractC0757cM109496c, AbstractC12350b.m34570S("kt-serialization-labrador-service"));
        C29222x0 c29222x0 = new C29222x0();
        return (LabradorNetworkApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")), LabradorNetworkApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C22836a m58131l(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("EcgPacketsUploadManager");
        File cacheDir = AbstractC29125c.m88532i(single).getCacheDir();
        AbstractC22676k.m65749i(cacheDir, "getCacheDir(...)");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C22836a(interfaceC34116nM107848a, cacheDir, (C17652i) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C17652i.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (AbstractC21909c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (LabradorNetworkApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(LabradorNetworkApi.class), null), (C25561a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C25561a.class), null), (C36484a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C36484a.class), null), null, 256, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC17647d m58132m(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return ((LabradorPacketDatabase) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(LabradorPacketDatabase.class), null)).mo22536b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C17652i m58133n(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("EcgPacketsDbManager");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC17647d interfaceC17647d = (InterfaceC17647d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC17647d.class), null);
        C25561a c25561a = (C25561a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C25561a.class), null);
        InterfaceC14515a interfaceC14515a = (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null);
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C17652i(interfaceC34116nM107848a, interfaceC17647d, c25561a, interfaceC14515a, clockSystemUTC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final InterfaceC14783b m58134o(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21961a((InterfaceC4733b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (C16213a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C16213a.class), null), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), null, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C16213a m58135p(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC34136a interfaceC34136a = (InterfaceC34136a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34136a.class), null);
        C22836a c22836a = (C22836a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C22836a.class), null);
        C13643b c13643b = (C13643b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C13643b.class), null);
        C22365e c22365e = AbstractC3050q0.f12077a;
        return new C16213a(interfaceC34136a, c22836a, c13643b, AbstractC3006f0.m8708b(ExecutorC22364d.f87316w.plus(AbstractC3006f0.m8710d())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C13643b m58136q(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C13643b((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m58128i(c33768a);
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
