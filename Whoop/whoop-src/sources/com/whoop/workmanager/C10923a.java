package com.whoop.workmanager;

import ah1.C0891a;
import com.whoop.firmwareEvents.uploader.FirmwareEventsUploadWorker;
import com.whoop.labradorService.uploader.LabradorPacketsUploadWorker;
import com.whoop.puffin.sync.BatteryPackRelativeEventsWorker;
import com.whoop.removeDeviceConfig.workmanager.RemoteDeviceConfigWorkManager;
import com.whoop.researchPacket.data.ResearchPacketsUploadWorker;
import com.whoop.util.LocalLogExportFileWorker;
import g52.C15495a;
import h03.C16604b;
import hi1.C17315a;
import hx0.C17708d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j52.C21340a;
import od1.InterfaceC27837a0;
import oy1.C28473a;
import oy1.C28474b;
import p218ic.AbstractC18377p0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r03.C30844a;
import s03.C32052a;
import sk2.C32574a;
import t03.C33267a;

/* JADX INFO: renamed from: com.whoop.workmanager.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, m65681d2 = {"Lcom/whoop/workmanager/a;", "", "Ls03/a;", "logEventUploadScheduler", "Lr03/a;", "consolePacketUploadScheduler", "Lhx0/d;", "rawDataUploadScheduler", "Lt03/a;", "smartAlarmDiagnosticUploadScheduler", "Lhi1/a;", "gpsUploadScheduler", "Lic/p0;", "workManager", "Lod1/a0;", "userSessionManager", "Lh03/b;", "widgetRefreshScheduler", "Loy1/a;", "dataDogMetricsUploadScheduler", "Lj52/a;", "pipUploadScheduler", "Lah1/a;", "periodicFirmwareFeatureFlagUpdateScheduler", "Lg52/a;", "puffinScanScheduler", "Loy1/b;", "storageMetricsUploadScheduler", "Lsk2/a;", "trackActivityPrefetchScheduler", "<init>", "(Ls03/a;Lr03/a;Lhx0/d;Lt03/a;Lhi1/a;Lic/p0;Lod1/a0;Lh03/b;Loy1/a;Lj52/a;Lah1/a;Lg52/a;Loy1/b;Lsk2/a;)V", "Ll83/a0;", "a", "()V", "Ls03/a;", "b", "Lr03/a;", "c", "Lhx0/d;", "d", "Lt03/a;", "e", "Lhi1/a;", "f", "Lic/p0;", "g", "Lod1/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lh03/b;", "i", "Loy1/a;", "j", "Lj52/a;", "k", "Lah1/a;", "l", "Lg52/a;", "m", "Loy1/b;", "n", "Lsk2/a;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10923a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C32052a logEventUploadScheduler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30844a consolePacketUploadScheduler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17708d rawDataUploadScheduler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C33267a smartAlarmDiagnosticUploadScheduler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C17315a gpsUploadScheduler;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC27837a0 userSessionManager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C16604b widgetRefreshScheduler;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C28473a dataDogMetricsUploadScheduler;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C21340a pipUploadScheduler;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C0891a periodicFirmwareFeatureFlagUpdateScheduler;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C15495a puffinScanScheduler;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C28474b storageMetricsUploadScheduler;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C32574a trackActivityPrefetchScheduler;

    public C10923a(C32052a logEventUploadScheduler, C30844a consolePacketUploadScheduler, C17708d rawDataUploadScheduler, C33267a smartAlarmDiagnosticUploadScheduler, C17315a gpsUploadScheduler, AbstractC18377p0 workManager, InterfaceC27837a0 userSessionManager, C16604b widgetRefreshScheduler, C28473a dataDogMetricsUploadScheduler, C21340a pipUploadScheduler, C0891a periodicFirmwareFeatureFlagUpdateScheduler, C15495a puffinScanScheduler, C28474b storageMetricsUploadScheduler, C32574a trackActivityPrefetchScheduler) {
        AbstractC22676k.m65750j(logEventUploadScheduler, "logEventUploadScheduler");
        AbstractC22676k.m65750j(consolePacketUploadScheduler, "consolePacketUploadScheduler");
        AbstractC22676k.m65750j(rawDataUploadScheduler, "rawDataUploadScheduler");
        AbstractC22676k.m65750j(smartAlarmDiagnosticUploadScheduler, "smartAlarmDiagnosticUploadScheduler");
        AbstractC22676k.m65750j(gpsUploadScheduler, "gpsUploadScheduler");
        AbstractC22676k.m65750j(workManager, "workManager");
        AbstractC22676k.m65750j(userSessionManager, "userSessionManager");
        AbstractC22676k.m65750j(widgetRefreshScheduler, "widgetRefreshScheduler");
        AbstractC22676k.m65750j(dataDogMetricsUploadScheduler, "dataDogMetricsUploadScheduler");
        AbstractC22676k.m65750j(pipUploadScheduler, "pipUploadScheduler");
        AbstractC22676k.m65750j(periodicFirmwareFeatureFlagUpdateScheduler, "periodicFirmwareFeatureFlagUpdateScheduler");
        AbstractC22676k.m65750j(puffinScanScheduler, "puffinScanScheduler");
        AbstractC22676k.m65750j(storageMetricsUploadScheduler, "storageMetricsUploadScheduler");
        AbstractC22676k.m65750j(trackActivityPrefetchScheduler, "trackActivityPrefetchScheduler");
        this.logEventUploadScheduler = logEventUploadScheduler;
        this.consolePacketUploadScheduler = consolePacketUploadScheduler;
        this.rawDataUploadScheduler = rawDataUploadScheduler;
        this.smartAlarmDiagnosticUploadScheduler = smartAlarmDiagnosticUploadScheduler;
        this.gpsUploadScheduler = gpsUploadScheduler;
        this.workManager = workManager;
        this.userSessionManager = userSessionManager;
        this.widgetRefreshScheduler = widgetRefreshScheduler;
        this.dataDogMetricsUploadScheduler = dataDogMetricsUploadScheduler;
        this.pipUploadScheduler = pipUploadScheduler;
        this.periodicFirmwareFeatureFlagUpdateScheduler = periodicFirmwareFeatureFlagUpdateScheduler;
        this.puffinScanScheduler = puffinScanScheduler;
        this.storageMetricsUploadScheduler = storageMetricsUploadScheduler;
        this.trackActivityPrefetchScheduler = trackActivityPrefetchScheduler;
    }

    /* JADX INFO: renamed from: a */
    public final void m28978a() {
        this.logEventUploadScheduler.m99628f();
        this.consolePacketUploadScheduler.m94868e();
        this.rawDataUploadScheduler.m50702d();
        this.widgetRefreshScheduler.m47121d();
        this.pipUploadScheduler.m59943b();
        LocalLogExportFileWorker.INSTANCE.m27810b(this.workManager);
        LabradorPacketsUploadWorker.INSTANCE.m22541a(this.workManager);
        RemoteDeviceConfigWorkManager.INSTANCE.m24384c(this.workManager);
        FirmwareEventsUploadWorker.INSTANCE.m21429a(this.workManager);
        ResearchPacketsUploadWorker.INSTANCE.m24388a(this.workManager);
        this.smartAlarmDiagnosticUploadScheduler.m105541e();
        this.gpsUploadScheduler.m49062c();
        this.dataDogMetricsUploadScheduler.m86385a();
        PushNotificationPermissionStatusWorker.INSTANCE.m28977b(this.workManager);
        BatteryPackRelativeEventsWorker.INSTANCE.m23645b(this.workManager);
        this.puffinScanScheduler.m43706a();
        this.periodicFirmwareFeatureFlagUpdateScheduler.m2186a();
        this.storageMetricsUploadScheduler.m86386a();
        this.trackActivityPrefetchScheduler.m101635d();
    }
}
