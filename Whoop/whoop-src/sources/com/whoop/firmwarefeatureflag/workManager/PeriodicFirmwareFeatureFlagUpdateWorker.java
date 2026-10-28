package com.whoop.firmwarefeatureflag.workManager;

import android.content.Context;
import androidx.work.WorkerParameters;
import c93.InterfaceC4339a;
import com.whoop.metrics.worker.BaseReportingWorker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import of3.InterfaceC27903a;
import p218ic.AbstractC18386u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import vf3.InterfaceC35951a;
import zg1.InterfaceC40631a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/firmwarefeatureflag/workManager/PeriodicFirmwareFeatureFlagUpdateWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Lof3/a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "Lzg1/a;", "z", "Ll83/h;", "k", "()Lzg1/a;", "fwFFUpdateService", "firmware-feature-flag_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PeriodicFirmwareFeatureFlagUpdateWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h fwFFUpdateService;

    /* JADX INFO: renamed from: com.whoop.firmwarefeatureflag.workManager.PeriodicFirmwareFeatureFlagUpdateWorker$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8759a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f26092w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26093x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26094y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8759a(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26092w = interfaceC27903a;
            this.f26093x = interfaceC35951a;
            this.f26094y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, zg1.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC40631a invoke() {
            InterfaceC27903a interfaceC27903a = this.f26092w;
            InterfaceC35951a interfaceC35951a = this.f26093x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f26094y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40631a.class), interfaceC35951a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodicFirmwareFeatureFlagUpdateWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        this.uniqueWorkName = "PeriodicFirmwareFeatureFlagUpdateWorker";
        this.fwFFUpdateService = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C8759a(this, null, null));
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC40631a m21445k() {
        return (InterfaceC40631a) this.fwFFUpdateService.getValue();
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    public Object mo18568j(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        m22895c().mo85216g("Periodic firmware feature flag update check worker started", new AbstractC30556a.a[0]);
        return m21445k().mo131861a(interfaceC30057d);
    }
}
