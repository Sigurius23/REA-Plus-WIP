package com.whoop.workmanager.smartalarmdiagnosticworkmanager;

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
import t03.InterfaceC33268b;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/workmanager/smartalarmdiagnosticworkmanager/SmartAlarmDiagnosticUploadWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "Lt03/b;", "z", "Ll83/h;", "k", "()Lt03/b;", "smartAlarmDiagnosticUploader", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SmartAlarmDiagnosticUploadWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h smartAlarmDiagnosticUploader;

    /* JADX INFO: renamed from: com.whoop.workmanager.smartalarmdiagnosticworkmanager.SmartAlarmDiagnosticUploadWorker$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10933a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33824w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33825x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33826y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10933a(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33824w = interfaceC27903a;
            this.f33825x = interfaceC35951a;
            this.f33826y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, t03.b] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC33268b invoke() {
            InterfaceC27903a interfaceC27903a = this.f33824w;
            InterfaceC35951a interfaceC35951a = this.f33825x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33826y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC33268b.class), interfaceC35951a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartAlarmDiagnosticUploadWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(parameters, "parameters");
        this.uniqueWorkName = "PERIODIC_SMART_ALARM_DIAGNOSTIC_UPLOAD_WORK";
        this.smartAlarmDiagnosticUploader = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C10933a(this, null, null));
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC33268b m28985k() {
        return (InterfaceC33268b) this.smartAlarmDiagnosticUploader.getValue();
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    public Object mo18568j(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        return m28985k().mo105542a(interfaceC30057d);
    }
}
