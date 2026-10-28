package ex0;

import android.content.SharedPreferences;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import ca2.InterfaceC4366f;
import ca2.InterfaceC4368h;
import ci2.InterfaceC4733b;
import com.whoop.connectivityDataPackets.PersistentStrapPacketDatabase;
import com.whoop.data.local.room.dao.persistent.RawDataDao;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.dataSyncService.retrofit.DataSyncApi;
import com.whoop.dataSyncService.room.DataSyncWorkDatabase;
import com.whoop.researchPacket.api.ResearchMetricsApi;
import cu0.InterfaceC11114b;
import dt0.InterfaceC12361d;
import dt0.InterfaceC12362e;
import dx0.C12422a;
import dx0.C12423b;
import dx0.C12425d;
import e93.AbstractC12889b;
import ek1.C13302a;
import eu0.InterfaceC13640a;
import eu0.InterfaceC13641b;
import fi0.InterfaceC14515a;
import fx0.C14844b;
import gx0.C16271a;
import hc3.C17171d;
import hu1.InterfaceC17647d;
import hx0.C17706b;
import hx0.InterfaceC17709e;
import ih0.AbstractC18489d0;
import ix0.C21013b;
import ix0.C21016e;
import ix0.InterfaceC21012a;
import ix0.InterfaceC21015d;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.util.List;
import js0.AbstractC21909c;
import jx0.C22003f;
import kx0.C22874a;
import kx0.C22877d;
import kx0.C22879f;
import l83.C23454a0;
import lx0.C24787d;
import lx0.C24789f;
import mu0.InterfaceC25949a;
import mx0.C25991a;
import mx0.C25992b;
import mx0.C25993c;
import nd1.InterfaceC26584j;
import od1.InterfaceC27837a0;
import p007a6.InterfaceC0422g;
import p031b9.AbstractC2875y;
import p218ic.AbstractC18377p0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import p82.C28973b;
import pf.AbstractC29125c;
import pg3.C29224y0;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u92.C34660d;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;
import yh2.InterfaceC39544c;
import yh2.InterfaceC39545d;
import yt0.InterfaceC39765d;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: ex0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lex0/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13726b implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final InterfaceC21015d m38900A(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21016e((InterfaceC13641b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC13641b.class), null), (ResearchMetricsApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(ResearchMetricsApi.class), null), (AbstractC21909c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final InterfaceC21012a m38901B(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21013b((InterfaceC13640a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC13640a.class), null), (ResearchMetricsApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(ResearchMetricsApi.class), null), (AbstractC21909c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final InterfaceC17709e m38902C(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("NewRawDataUploaderImpl");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        DataSyncApi dataSyncApi = (DataSyncApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(DataSyncApi.class), null);
        ResearchMetricsApi researchMetricsApi = (ResearchMetricsApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(ResearchMetricsApi.class), null);
        InterfaceC11114b interfaceC11114b = (InterfaceC11114b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC11114b.class), null);
        AbstractC21909c abstractC21909c = (AbstractC21909c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null);
        InterfaceC14515a interfaceC14515a = (InterfaceC14515a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null);
        SharedPreferences sharedPreferences = AbstractC29125c.m88532i(single).getSharedPreferences("prefs-raw-data", 0);
        AbstractC22676k.m65749i(sharedPreferences, "getSharedPreferences(...)");
        return new C17706b(interfaceC34116nM107848a, dataSyncApi, researchMetricsApi, interfaceC11114b, abstractC21909c, interfaceC14515a, sharedPreferences, (InterfaceC41070a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (InterfaceC21015d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21015d.class), null), (InterfaceC21012a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21012a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C25992b m38903D(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("workManagerInstance");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC18377p0 abstractC18377p0 = (AbstractC18377p0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC18377p0.class), c35953c);
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("DataSyncScheduler");
        C22003f c22003f = (C22003f) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C22003f.class), null);
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
        return new C25992b(abstractC18377p0, interfaceC34116nM107848a, c22003f, clockSystemDefaultZone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C25991a m38904E(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25991a((C24787d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C24787d.class), null), (C22877d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C22877d.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), InterfaceC34116n.INSTANCE.m107848a("DataFlowController"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C22003f m38905F(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C22003f(((DataSyncWorkDatabase) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DataSyncWorkDatabase.class), null)).mo19997b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C14844b m38906G(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C14844b((InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (InterfaceC4368h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4368h.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final DataSyncWorkDatabase m38907H(C38266c c38266c, C34911a c34911a) {
        return (DataSyncWorkDatabase) AbstractC21598x.m60645C(AbstractC2875y.m8292e(c38266c, "$this$single", c34911a, "it", c38266c), DataSyncWorkDatabase.class, "data_sync_work_db").m5450b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C34660d m38908I(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C34660d(AbstractC29125c.m88531h(single), "whoop_dataSyncService_preferences");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final Clock m38909J(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return clockSystemUTC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C16271a m38910K(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C34660d c34660d = (C34660d) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34660d.class), new C35953c("whoop_dataSyncService_preferences"));
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C16271a(c34660d, clockSystemUTC, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C25993c m38911L(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25993c((InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (C16271a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C16271a.class), null), (DataSyncApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(DataSyncApi.class), null), InterfaceC34116n.INSTANCE.m107848a("HighWatermarkHelper"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final InterfaceC12361d m38912M(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("DataSyncService");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12422a(interfaceC34116nM107848a, (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (C12423b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C12423b.class), null), (C25993c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C25993c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final InterfaceC12362e m38913N(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("ProcessNowApi");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC12361d interfaceC12361d = (InterfaceC12361d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC12361d.class), null);
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(AbstractC12889b.m36254T(AbstractC3006f0.m8710d(), AbstractC3050q0.f12077a));
        AbstractC21909c abstractC21909c = (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null);
        InterfaceC0422g interfaceC0422g = (InterfaceC0422g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null);
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
        return new C12425d(interfaceC34116nM107848a, interfaceC12361d, c17171dM8708b, abstractC21909c, interfaceC0422g, clockSystemDefaultZone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C12423b m38914O(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null);
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("DataSyncServiceManager");
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null);
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C12423b(interfaceC2994c0, featureFlagChecker, interfaceC34116nM107848a, clockSystemUTC, (C25992b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C25992b.class), null), (C22003f) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C22003f.class), null), (InterfaceC27837a0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27837a0.class), null), (C14844b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C14844b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C24789f m38915P(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null);
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C24789f(featureFlagChecker, clockSystemUTC, InterfaceC34116n.INSTANCE.m107848a("UploadPipelineGate"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C24787d m38916Q(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("UploadDataInteractor");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C24787d((C28973b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28973b.class), null), (C24789f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C24789f.class), null), interfaceC34116nM107848a);
    }

    /* JADX INFO: renamed from: v */
    private static final C23454a0 m38938v(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C13302a c13302a = new C13302a(24);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(InterfaceC39545d.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c13302a, 1)), false);
        C13302a c13302a2 = new C13302a(26);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(DataSyncApi.class);
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass2, null, c13302a2, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), false, "whoop_dataSyncService_preferences");
        C13302a c13302a3 = new C13302a(28);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C34660d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, c35953cM73385r, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass3, c35953cM73385r, c13302a3, 1)), false);
        C13302a c13302a4 = new C13302a(29);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C16271a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass4, null, c13302a4, 1)), false);
        C13725a c13725a = new C13725a(0);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C25993c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass5, null, c13725a, 1)), false);
        C13725a c13725a2 = new C13725a(1);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(InterfaceC12361d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass6, null, c13725a2, 1)), false);
        C13725a c13725a3 = new C13725a(2);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(InterfaceC12362e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c13725a3, 2)), false);
        C13725a c13725a4 = new C13725a(3);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C12423b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass8, null, c13725a4, 1)), false);
        C13725a c13725a5 = new C13725a(4);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C24789f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass9, null, c13725a5, 1)), false);
        C13725a c13725a6 = new C13725a(6);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C24787d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c13725a6, 2)), false);
        C13725a c13725a7 = new C13725a(5);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(InterfaceC4366f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass11, null, c13725a7, 1)), false);
        C13725a c13725a8 = new C13725a(7);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C22877d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c13725a8, 2)), false);
        C13725a c13725a9 = new C13725a(8);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(InterfaceC21015d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass13, null, c13725a9, 1)), false);
        C13725a c13725a10 = new C13725a(9);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(InterfaceC21012a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass14, null, c13725a10, 1)), false);
        C13725a c13725a11 = new C13725a(10);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(InterfaceC17709e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass15, null, c13725a11, 1)), false);
        C13725a c13725a12 = new C13725a(11);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(C25992b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass16, null, c13725a12, 1)), false);
        C13725a c13725a13 = new C13725a(12);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(C25991a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass17, null, c13725a13, 2)), false);
        C13725a c13725a14 = new C13725a(13);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(C22003f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass18, null, c13725a14, 1)), false);
        C13725a c13725a15 = new C13725a(14);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(C14844b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass19, null, c13725a15, 2)), false);
        C13302a c13302a5 = new C13302a(25);
        InterfaceC21461d orCreateKotlinClass20 = c22673i0.getOrCreateKotlinClass(DataSyncWorkDatabase.class);
        C35953c c35953cM53379t = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass20, null, c13302a5, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass20, null, c35953c), false, "WORKER_CLOCK");
        C13302a c13302a6 = new C13302a(27);
        InterfaceC21461d orCreateKotlinClass21 = c22673i0.getOrCreateKotlinClass(Clock.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass21, c35953cM53379t, c13302a6, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass21, c35953cM53379t, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final InterfaceC39545d m38939w(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C22879f((InterfaceC25949a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25949a.class), null), (RawDataDao) single.m122602a(null, c22673i0.getOrCreateKotlinClass(RawDataDao.class), null), ((PersistentStrapPacketDatabase) single.m122602a(null, c22673i0.getOrCreateKotlinClass(PersistentStrapPacketDatabase.class), null)).mo19642k(), ((PersistentStrapPacketDatabase) single.m122602a(null, c22673i0.getOrCreateKotlinClass(PersistentStrapPacketDatabase.class), null)).mo19640i(), ((PersistentStrapPacketDatabase) single.m122602a(null, c22673i0.getOrCreateKotlinClass(PersistentStrapPacketDatabase.class), null)).mo19639h(), (InterfaceC17647d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC17647d.class), null), (InterfaceC39765d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC39765d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final DataSyncApi m38940x(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "retrofitWithKtxSerialization"))).m88733b(DataSyncApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (DataSyncApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final InterfaceC4366f m38941y(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC39544c interfaceC39544c = (InterfaceC39544c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC39544c.class), null);
        InterfaceC12361d interfaceC12361d = (InterfaceC12361d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC12361d.class), null);
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null);
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C22874a(interfaceC39544c, interfaceC12361d, interfaceC2994c0, clockSystemUTC, InterfaceC34116n.INSTANCE.m107848a("HistorySyncRouter"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C22877d m38942z(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC39544c interfaceC39544c = (InterfaceC39544c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC39544c.class), null);
        InterfaceC4733b interfaceC4733b = (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null);
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("StrapSyncInteractor");
        Duration.Companion companion = Duration.INSTANCE;
        return new C22877d(interfaceC39544c, interfaceC4733b, interfaceC34116nM107848a, DurationKt.toDuration(10, DurationUnit.MINUTES), null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m38938v(c33768a);
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
