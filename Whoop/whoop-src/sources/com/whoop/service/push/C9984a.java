package com.whoop.service.push;

import android.app.NotificationManager;
import android.content.Context;
import c12.InterfaceC3852c;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.dataSyncService.workmanager.DataSyncWorker;
import com.whoop.firmwareUpdateService.workmanager.FirmwareUpdateWorker;
import com.whoop.realtime.service.C9907b;
import com.whoop.service.sync.WhoopSyncService;
import com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker;
import com.whoop.whooplabs.workers.BtHrSubmissionWorker;
import o92.C27702f0;
import o92.C27705h;
import o92.C27707i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import x82.C38082i;

/* JADX INFO: renamed from: com.whoop.service.push.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/service/push/a;", "", "Lc12/c;", "notificationInitializer", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lc12/c;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Landroid/content/Context;", "context", "Ll83/a0;", "a", "(Landroid/content/Context;)V", "Lc12/c;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9984a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC3852c notificationInitializer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    public C9984a(InterfaceC3852c notificationInitializer, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(notificationInitializer, "notificationInitializer");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.notificationInitializer = notificationInitializer;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: a */
    public final void m24509a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        NotificationManager notificationManagerMo11801b = this.notificationInitializer.mo11801b(context);
        if (notificationManagerMo11801b != null) {
            C38082i.INSTANCE.m122033a(context, notificationManagerMo11801b);
            PushService.Companion companion = PushService.INSTANCE;
            companion.m24506a(context, notificationManagerMo11801b);
            companion.m24508c(this.featureFlagChecker, notificationManagerMo11801b);
            WhoopSyncService.m24785f(context, notificationManagerMo11801b);
            C9907b.m24264w(context, notificationManagerMo11801b);
            DataSyncWorker.INSTANCE.m20016b(context, notificationManagerMo11801b);
            FirmwareUpdateWorker.INSTANCE.m21442a(context, notificationManagerMo11801b);
            C27702f0.INSTANCE.m83738a(context, notificationManagerMo11801b);
            C27707i.INSTANCE.m83753a(context, notificationManagerMo11801b);
            C27705h.INSTANCE.m83745a(context, notificationManagerMo11801b);
            BtHrSubmissionWorker.INSTANCE.m28629c(context, notificationManagerMo11801b);
            BtHrPeriodicCheckWorker.INSTANCE.m28622c(context, notificationManagerMo11801b);
        }
    }
}
