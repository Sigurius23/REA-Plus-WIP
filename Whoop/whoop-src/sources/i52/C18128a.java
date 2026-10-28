package i52;

import com.whoop.connectivityDataPackets.PersistentStrapPacketDatabase;
import com.whoop.pulseinformationpacket.network.PulseInformationMetricsApi;
import h52.C16935a;
import i12.C17865a;
import j52.C21340a;
import j52.C21342c;
import j52.InterfaceC21341b;
import j93.InterfaceC21461d;
import java.io.File;
import java.util.List;
import js0.AbstractC21909c;
import l83.C23454a0;
import mh2.C25561a;
import nd1.InterfaceC26584j;
import p031b9.AbstractC2875y;
import p218ic.AbstractC18377p0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import pg3.C29224y0;
import qf3.C30330b;
import rf3.C31362a;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import vt0.C36484a;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: i52.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Li52/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "pulseInformationPacket_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18128a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: renamed from: e */
    private static final C23454a0 m52077e(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C17865a c17865a = new C17865a(12);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C16935a.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c17865a, 2)), false);
        C17865a c17865a2 = new C17865a(13);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(PulseInformationMetricsApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c17865a2, 2)), false);
        C17865a c17865a3 = new C17865a(14);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(InterfaceC21341b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c17865a3, 2)), false);
        C17865a c17865a4 = new C17865a(15);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C21340a.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass4, null, c17865a4, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C16935a m52078f(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("PulseInformationDbManager");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C16935a(interfaceC34116nM107848a, ((PersistentStrapPacketDatabase) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(PersistentStrapPacketDatabase.class), null)).mo19641j(), (C25561a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C25561a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final PulseInformationMetricsApi m52079g(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "retrofitWithKtxSerialization"))).m88733b(PulseInformationMetricsApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (PulseInformationMetricsApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC21341b m52080h(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("PipUploaderImpl");
        File cacheDir = AbstractC29125c.m88532i(factory).getCacheDir();
        AbstractC22676k.m65749i(cacheDir, "getCacheDir(...)");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21342c(interfaceC34116nM107848a, cacheDir, (PulseInformationMetricsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(PulseInformationMetricsApi.class), null), ((PersistentStrapPacketDatabase) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(PersistentStrapPacketDatabase.class), null)).mo19641j(), (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (C25561a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C25561a.class), null), (C36484a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36484a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C21340a m52081i(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21340a((AbstractC18377p0) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")), InterfaceC34116n.INSTANCE.m107848a("PipUploadScheduler"));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m52077e(c33768a);
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
