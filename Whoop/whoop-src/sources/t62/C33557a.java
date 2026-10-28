package t62;

import android.content.SharedPreferences;
import ci2.InterfaceC4733b;
import com.whoop.removeDeviceConfig.domain.RemoteDeviceConfigApi;
import el1.C13319b;
import ge3.AbstractC15751g;
import it0.C20926b;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.util.List;
import js0.AbstractC21909c;
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
import pf.AbstractC29125c;
import pg3.C29224y0;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import s52.C32223d;
import sv1.C33036b;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u62.C34558b;
import u62.C34559c;
import uf3.C34911a;
import v62.C35742a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: t62.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lt62/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "remote-device-config_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33557a implements InterfaceC26584j {
    /* JADX INFO: renamed from: f */
    private static final C23454a0 m105972f(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C33036b c33036b = new C33036b(9);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(RemoteDeviceConfigApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c33036b, 2)), false);
        C33036b c33036b2 = new C33036b(10);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C34559c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass2, null, c33036b2, 1)), false);
        C33036b c33036b3 = new C33036b(11);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C34558b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c33036b3, 2)), false);
        C33036b c33036b4 = new C33036b(12);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C35742a.class);
        AbstractC11895b.m31980C(new C30330b(c35953c, orCreateKotlinClass4, null, c33036b4, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final RemoteDeviceConfigApi m105973g(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(new C32223d(20), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "featureFlaggableDefaultRetrofit"))).m88733b(RemoteDeviceConfigApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (RemoteDeviceConfigApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C34911a m105974h() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S("kt-serialization-remote-device-config"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C34559c m105975i(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34559c((InterfaceC4733b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (C20926b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C20926b.class), null), (C13319b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C13319b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C34558b m105976j(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        RemoteDeviceConfigApi remoteDeviceConfigApi = (RemoteDeviceConfigApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(RemoteDeviceConfigApi.class), null);
        C35742a c35742a = (C35742a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35742a.class), null);
        C34559c c34559c = (C34559c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34559c.class), null);
        AbstractC21909c abstractC21909c = (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null);
        InterfaceC4733b interfaceC4733b = (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null);
        SharedPreferences sharedPreferences = AbstractC29125c.m88532i(factory).getSharedPreferences("prefs-remote-device-config", 0);
        AbstractC22676k.m65749i(sharedPreferences, "getSharedPreferences(...)");
        InterfaceC21030c interfaceC21030c = (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null);
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C34558b(remoteDeviceConfigApi, c35742a, c34559c, interfaceC4733b, abstractC21909c, sharedPreferences, interfaceC21030c, clockSystemUTC, InterfaceC34116n.INSTANCE.m107848a("RemoteDeviceConfigInteractor"), null, null, 1536, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static final C35742a m105977k(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C35742a(null, 1, 0 == true ? 1 : 0);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m105972f(c33768a);
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
