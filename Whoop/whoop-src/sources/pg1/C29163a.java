package pg1;

import android.content.Context;
import no.nordicsemi.android.dfu.DfuBaseService;
import no.nordicsemi.android.dfu.DfuProgressListener;
import no.nordicsemi.android.dfu.DfuServiceController;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import no.nordicsemi.android.dfu.DfuServiceListenerHelper;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pg1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ]\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\f2\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b!\u0010\u001cJ\u001d\u0010\"\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010'¨\u0006)"}, m65681d2 = {"Lpg1/a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll83/a0;", "a", "()V", "", "address", "name", "", "keepBond", "forceDfu", "bleFirmwareFilePath", "enablePRNs", "", "numberOfPackets", "buttonless", "Ljava/lang/Class;", "Lno/nordicsemi/android/dfu/DfuBaseService;", "dfuService", "d", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZIZLjava/lang/Class;)V", "Lno/nordicsemi/android/dfu/DfuProgressListener;", "dfuProgressListener", "c", "(Landroid/content/Context;Lno/nordicsemi/android/dfu/DfuProgressListener;)V", "Lpg1/c;", "logListener", "b", "(Landroid/content/Context;Lpg1/c;)V", "f", "e", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lno/nordicsemi/android/dfu/DfuServiceController;", "Lno/nordicsemi/android/dfu/DfuServiceController;", "controller", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29163a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private DfuServiceController controller;

    public C29163a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m88608a() {
        DfuServiceInitiator.createDfuNotificationChannel(this.context);
    }

    /* JADX INFO: renamed from: b */
    public final void m88609b(Context context, C29165c logListener) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(logListener, "logListener");
        DfuServiceListenerHelper.registerLogListener(context, logListener);
    }

    /* JADX INFO: renamed from: c */
    public final void m88610c(Context context, DfuProgressListener dfuProgressListener) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(dfuProgressListener, "dfuProgressListener");
        DfuServiceListenerHelper.registerProgressListener(context, dfuProgressListener);
    }

    /* JADX INFO: renamed from: d */
    public final void m88611d(String address, String name, boolean keepBond, boolean forceDfu, String bleFirmwareFilePath, boolean enablePRNs, int numberOfPackets, boolean buttonless, Class<? extends DfuBaseService> dfuService) {
        AbstractC22676k.m65750j(address, "address");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(bleFirmwareFilePath, "bleFirmwareFilePath");
        AbstractC22676k.m65750j(dfuService, "dfuService");
        DfuServiceInitiator unsafeExperimentalButtonlessServiceInSecureDfuEnabled = new DfuServiceInitiator(address).setDeviceName(name).setKeepBond(keepBond).setForceDfu(forceDfu).setPacketsReceiptNotificationsEnabled(enablePRNs).setPacketsReceiptNotificationsValue(numberOfPackets).setUnsafeExperimentalButtonlessServiceInSecureDfuEnabled(buttonless);
        unsafeExperimentalButtonlessServiceInSecureDfuEnabled.setZip(null, bleFirmwareFilePath);
        DfuServiceController dfuServiceControllerStart = unsafeExperimentalButtonlessServiceInSecureDfuEnabled.start(this.context, dfuService);
        AbstractC22676k.m65749i(dfuServiceControllerStart, "start(...)");
        this.controller = dfuServiceControllerStart;
    }

    /* JADX INFO: renamed from: e */
    public final void m88612e(Context context, C29165c logListener) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(logListener, "logListener");
        DfuServiceListenerHelper.unregisterLogListener(context, logListener);
    }

    /* JADX INFO: renamed from: f */
    public final void m88613f(Context context, DfuProgressListener dfuProgressListener) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(dfuProgressListener, "dfuProgressListener");
        DfuServiceListenerHelper.unregisterProgressListener(context, dfuProgressListener);
    }
}
