package q82;

import android.net.ConnectivityManager;
import bc3.InterfaceC2994c0;
import bi2.InterfaceC3288d;
import ca2.InterfaceC4368h;
import ca2.InterfaceC4371k;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.sensorDataUpload.retrofit.SensorDataApi;
import ge3.AbstractC15751g;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.util.List;
import l83.C23454a0;
import ma1.C25371a;
import nd1.InterfaceC26584j;
import p007a6.InterfaceC0422g;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p82.C28972a;
import p82.C28973b;
import pf.AbstractC29125c;
import pg3.C29224y0;
import q42.C29976a;
import qf3.C30330b;
import r82.C31070a;
import rd1.C31242a;
import rf3.C31362a;
import st0.InterfaceC32974r;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wf3.C37247a;
import wp0.C37496a;
import xf3.C38266c;

/* JADX INFO: renamed from: q82.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lq82/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "sensor-data-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30053a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: renamed from: f */
    private static final C23454a0 m92077f(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C29976a c29976a = new C29976a(24);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(SensorDataApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c29976a, 2)), false);
        C29976a c29976a2 = new C29976a(25);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C28972a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c29976a2, 2)), false);
        C29976a c29976a3 = new C29976a(26);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C28973b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c29976a3, 2)), false);
        C29976a c29976a4 = new C29976a(27);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C31070a.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass4, null, c29976a4, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final SensorDataApi m92078g(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(new C25371a(17), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "featureFlaggableDefaultRetrofit"))).m88733b(SensorDataApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (SensorDataApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C34911a m92079h() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S("kt-serialization-sensor-data-upload"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C28972a m92080i(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("ProcessNowAnalyticsReporter");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null);
        InterfaceC0422g interfaceC0422g = (InterfaceC0422g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null);
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
        return new C28972a(interfaceC34116nM107848a, featureFlagChecker, interfaceC0422g, clockSystemDefaultZone, (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (InterfaceC4368h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4368h.class), null), (InterfaceC32974r) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC32974r.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C28973b m92081j(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("SensorDataUploadInteractor");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28973b(interfaceC34116nM107848a, (InterfaceC3288d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC3288d.class), null), (SensorDataApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(SensorDataApi.class), null), (InterfaceC4371k) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4371k.class), null), C37496a.f160377a, (C31242a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C31242a.class), null), (C31070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C31070a.class), null), (C28972a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28972a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C31070a m92082k(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("SensorDataUploadThroughputTracker");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21030c interfaceC21030c = (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null);
        Object systemService = AbstractC29125c.m88532i(factory).getSystemService((Class<Object>) ConnectivityManager.class);
        if (systemService != null) {
            return new C31070a(interfaceC34116nM107848a, interfaceC21030c, (ConnectivityManager) systemService, (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (InterfaceC4368h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4368h.class), null), (InterfaceC32974r) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC32974r.class), null));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m92077f(c33768a);
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
