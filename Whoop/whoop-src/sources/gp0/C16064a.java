package gp0;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import com.whoop.data.repositories.HealthMonitorRepository;
import com.whoop.data.repositories.StringsRepository;
import gt0.InterfaceC16183e;
import hj0.AbstractC17356o;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import od1.C27858u;
import or2.C28144a0;
import or2.C28180m;
import or2.C28199s0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p92.C29020i;
import q83.InterfaceC30063j;
import z82.InterfaceC40188b;

/* JADX INFO: renamed from: gp0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001;BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00102\u001a\u00020-8\u0016X\u0096D¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u00109\u001a\b\u0012\u0004\u0012\u000204038\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006<"}, m65681d2 = {"Lgp0/a;", "Lhj0/o;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/whoop/data/repositories/HealthMonitorRepository;", "repository", "Lcom/whoop/data/repositories/StringsRepository;", "stringsRepository", "Lod1/u;", "userContext", "Lp92/i;", "realTimeStreamController", "Lor2/a0;", "fileManager", "Lz82/b;", "analyticsManager", "Lgt0/e;", "firmwareUpdateApi", "Lq83/j;", "ioContext", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcom/whoop/data/repositories/HealthMonitorRepository;Lcom/whoop/data/repositories/StringsRepository;Lod1/u;Lp92/i;Lor2/a0;Lz82/b;Lgt0/e;Lq83/j;Lbc3/c0;)V", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onStart", "(Landroidx/lifecycle/g0;)V", "onStop", "E", "Lcom/whoop/data/repositories/HealthMonitorRepository;", "F", "Lcom/whoop/data/repositories/StringsRepository;", "G", "Lod1/u;", "H", "Lp92/i;", "I", "Lor2/a0;", "J", "Lz82/b;", "K", "Lgt0/e;", "L", "Lq83/j;", "", "M", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Landroidx/lifecycle/p0;", "", "N", "Landroidx/lifecycle/p0;", "getHealthReportEvent", "()Landroidx/lifecycle/p0;", "healthReportEvent", "O", "a", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16064a extends AbstractC17356o implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: P */
    public static final int f60748P = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final HealthMonitorRepository repository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final StringsRepository stringsRepository;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C29020i realTimeStreamController;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C28144a0 fileManager;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC40188b analyticsManager;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC16183e firmwareUpdateApi;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC30063j ioContext;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final AbstractC1615p0 healthReportEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16064a(HealthMonitorRepository repository, StringsRepository stringsRepository, C27858u userContext, C29020i realTimeStreamController, C28144a0 fileManager, InterfaceC40188b analyticsManager, InterfaceC16183e firmwareUpdateApi, InterfaceC30063j ioContext, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(repository, "repository");
        AbstractC22676k.m65750j(stringsRepository, "stringsRepository");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(realTimeStreamController, "realTimeStreamController");
        AbstractC22676k.m65750j(fileManager, "fileManager");
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        AbstractC22676k.m65750j(firmwareUpdateApi, "firmwareUpdateApi");
        AbstractC22676k.m65750j(ioContext, "ioContext");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.repository = repository;
        this.stringsRepository = stringsRepository;
        this.userContext = userContext;
        this.realTimeStreamController = realTimeStreamController;
        this.fileManager = fileManager;
        this.analyticsManager = analyticsManager;
        this.firmwareUpdateApi = firmwareUpdateApi;
        this.ioContext = ioContext;
        this.logTag = "HealthMonitorViewModel";
        this.healthReportEvent = new C28199s0();
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onCreate(InterfaceC1585g0 interfaceC1585g0) {
        super.onCreate(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        this.realTimeStreamController.m88251a();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        this.realTimeStreamController.m88252b();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C16064a(HealthMonitorRepository healthMonitorRepository, StringsRepository stringsRepository, C27858u c27858u, C29020i c29020i, C28144a0 c28144a0, InterfaceC40188b interfaceC40188b, InterfaceC16183e interfaceC16183e, InterfaceC30063j interfaceC30063j, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC30063j interfaceC30063j2;
        if ((i13 & 128) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC30063j2 = ExecutorC22364d.f87316w;
        } else {
            interfaceC30063j2 = interfaceC30063j;
        }
        this(healthMonitorRepository, stringsRepository, c27858u, c29020i, c28144a0, interfaceC40188b, interfaceC16183e, interfaceC30063j2, (i13 & 256) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
