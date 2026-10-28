package x62;

import ad3.AbstractC0757c;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.whoop.connectivityDataPackets.PersistentStrapPacketDatabase;
import com.whoop.researchPacket.api.ResearchMetricsApi;
import j93.InterfaceC21461d;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import js0.AbstractC21909c;
import l83.C23454a0;
import mh2.C25561a;
import nd1.InterfaceC26584j;
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
import sr2.AbstractC32943y;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u82.AbstractC34650k;
import u82.C34643d;
import u82.C34644e;
import ud3.C34824k0;
import ud3.C34826l0;
import uf3.C34911a;
import vf3.C35953c;
import vt0.C36484a;
import w62.C36865a;
import wf3.C37247a;
import x52.C37993a;
import xf3.C38266c;
import y62.C39263b;

/* JADX INFO: renamed from: x62.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lx62/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "research-packet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38028a implements InterfaceC26584j {
    /* JADX INFO: renamed from: d */
    private static final C23454a0 m121764d(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C37993a c37993a = new C37993a(2);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(ResearchMetricsApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c37993a, 2)), false);
        C37993a c37993a2 = new C37993a(3);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C36865a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c37993a2, 2)), false);
        C37993a c37993a3 = new C37993a(4);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C39263b.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass3, null, c37993a3, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final ResearchMetricsApi m121765e(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "defaultOkHttpClient");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34824k0 c34824k0M109897a = ((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), c35953cM73387t)).m109897a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c34824k0M109897a.m109895e(30L, timeUnit);
        c34824k0M109897a.m109892b(30L, timeUnit);
        c34824k0M109897a.m109896f(30L, timeUnit);
        C34826l0 c34826l0 = new C34826l0(c34824k0M109897a);
        Gson gsonCreate = new GsonBuilder().create();
        AbstractC0757c abstractC0757cM109496c = AbstractC34650k.m109496c();
        C34644e c34644e = (C34644e) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null);
        AbstractC22676k.m65747g(gsonCreate);
        C34643d c34643dM109481a = c34644e.m109481a(gsonCreate, abstractC0757cM109496c, AbstractC12350b.m34570S("kt-serialization-research-packet"));
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(c34643dM109481a);
        c29222x0.f118281a = c34826l0;
        Object objM88733b = c29222x0.m88730d().m88733b(ResearchMetricsApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (ResearchMetricsApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C36865a m121766f(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        File cacheDir = AbstractC29125c.m88532i(factory).getCacheDir();
        AbstractC22676k.m65749i(cacheDir, "getCacheDir(...)");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36865a(cacheDir, (C39263b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39263b.class), null), (ResearchMetricsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(ResearchMetricsApi.class), null), (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (C25561a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C25561a.class), null), (C36484a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36484a.class), null), null, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C39263b m121767g(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("ResearchPacketDbManager");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C39263b(interfaceC34116nM107848a, ((PersistentStrapPacketDatabase) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(PersistentStrapPacketDatabase.class), null)).mo19638g(), (C25561a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C25561a.class), null));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m121764d(c33768a);
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
