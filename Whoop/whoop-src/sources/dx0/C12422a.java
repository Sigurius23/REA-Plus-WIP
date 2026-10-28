package dx0;

import com.whoop.connectivityCore.dataSyncService.models.DeviceTriggerSource;
import com.whoop.data.repositories.FeatureFlagChecker;
import dt0.InterfaceC12361d;
import ec3.InterfaceC13037f2;
import l83.C23454a0;
import mx0.C25993c;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: dx0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0013\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Ldx0/a;", "Ldt0/d;", "Ltr2/n;", "logger", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ldx0/b;", "dataSyncServiceManager", "Lmx0/c;", "highWatermarkHelper", "<init>", "(Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;Ldx0/b;Lmx0/c;)V", "Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;", "triggerSource", "Ll83/a0;", "c", "(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;)V", "b", "(Lq83/d;)Ljava/lang/Object;", "a", "Ltr2/n;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ldx0/b;", "d", "Lmx0/c;", "Lec3/f2;", "", "e", "Lec3/f2;", "()Lec3/f2;", "highWaterMark", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12422a implements InterfaceC12361d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C12423b dataSyncServiceManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C25993c highWatermarkHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13037f2 highWaterMark;

    public C12422a(InterfaceC34116n logger, FeatureFlagChecker featureFlagChecker, C12423b dataSyncServiceManager, C25993c highWatermarkHelper) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(dataSyncServiceManager, "dataSyncServiceManager");
        AbstractC22676k.m65750j(highWatermarkHelper, "highWatermarkHelper");
        this.logger = logger;
        this.featureFlagChecker = featureFlagChecker;
        this.dataSyncServiceManager = dataSyncServiceManager;
        this.highWatermarkHelper = highWatermarkHelper;
        this.highWaterMark = highWatermarkHelper.getHighWaterMark();
    }

    @Override // dt0.InterfaceC12361d
    /* JADX INFO: renamed from: a, reason: from getter */
    public InterfaceC13037f2 getHighWaterMark() {
        return this.highWaterMark;
    }

    @Override // dt0.InterfaceC12361d
    /* JADX INFO: renamed from: b */
    public Object mo34624b(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM77146e = this.highWatermarkHelper.m77146e(interfaceC30057d);
        return objM77146e == EnumC31071a.f128113w ? objM77146e : C23454a0.f92919a;
    }

    @Override // dt0.InterfaceC12361d
    /* JADX INFO: renamed from: c */
    public void mo34625c(DeviceTriggerSource triggerSource) {
        AbstractC22676k.m65750j(triggerSource, "triggerSource");
        this.logger.mo85228t(AbstractC11266d.m30461o("Sending sync event from source: ", triggerSource.name()), new AbstractC30556a.a[0]);
        this.dataSyncServiceManager.m34982p(triggerSource);
    }
}
