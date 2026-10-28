package eg1;

import android.content.SharedPreferences;
import com.whoop.firmwareEvents.api.FirmwareEventsApi;
import ds2.C12347a;
import fg1.InterfaceC14457c;
import hg1.C17257b;
import hg1.C17259d;
import hg1.InterfaceC17256a;
import hg1.InterfaceC17258c;
import j93.InterfaceC21461d;
import java.io.File;
import java.util.List;
import js0.AbstractC21909c;
import l83.C23454a0;
import mh2.C25561a;
import nd1.InterfaceC26584j;
import or2.C28162g;
import p007a6.InterfaceC0422g;
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
import r80.AbstractC31061c;
import rf3.C31362a;
import sr2.AbstractC32943y;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import ud3.C34826l0;
import uf3.C34911a;
import vf3.C35953c;
import vt0.C36484a;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: eg1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Leg1/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "firmware-events_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13167a implements InterfaceC26584j {
    /* JADX INFO: renamed from: e */
    private static final C23454a0 m36855e(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C12347a c12347a = new C12347a(21);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(FirmwareEventsApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c12347a, 2)), false);
        C12347a c12347a2 = new C12347a(22);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(InterfaceC17256a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c12347a2, 2)), false);
        C12347a c12347a3 = new C12347a(23);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(InterfaceC17258c.class);
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass3, null, c12347a3, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), false, "fw-events-shared-prefs-koin");
        C12347a c12347a4 = new C12347a(24);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(SharedPreferences.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass4, c35953cM73385r, c12347a4, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass4, c35953cM73385r, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final FirmwareEventsApi m36856f(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$factory", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return (FirmwareEventsApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC31061c.m95649y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0M73382o, "defaultOkHttpClient")), FirmwareEventsApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC17256a m36857g(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("StrapEventsUploaderToApiImpl");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C17257b(interfaceC34116nM107848a, (FirmwareEventsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FirmwareEventsApi.class), null), ((C28162g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28162g.class), null)).getRelease(), (InterfaceC0422g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC17258c m36858h(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("StrapFirmwareEventsFileExporter");
        File cacheDir = AbstractC29125c.m88532i(factory).getCacheDir();
        AbstractC22676k.m65749i(cacheDir, "getCacheDir(...)");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C17259d(interfaceC34116nM107848a, cacheDir, (InterfaceC14457c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14457c.class), null), (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (C25561a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C25561a.class), null), (C36484a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36484a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final SharedPreferences m36859i(C38266c c38266c, C34911a c34911a) {
        return AbstractC2875y.m8292e(c38266c, "$this$factory", c34911a, "it", c38266c).getSharedPreferences("prefs-fw-events", 0);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m36855e(c33768a);
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
