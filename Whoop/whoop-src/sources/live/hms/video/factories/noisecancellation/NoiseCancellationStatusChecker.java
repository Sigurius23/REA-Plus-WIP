package live.hms.video.factories.noisecancellation;

import android.content.Context;
import c93.InterfaceC4339a;
import java.io.IOException;
import java.io.InputStream;
import l01.C23045q;
import l83.InterfaceC23462h;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u000bR\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, m65681d2 = {"Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;", "", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "isFlagEnabled", "isEnabledFromTemplate", "<init>", "(Landroid/content/Context;Lc93/a;Lc93/a;)V", "enabledFromDashboardInternal", "()Z", "enabledFromDashboard", "Ljava/io/InputStream;", "getModelStream", "(Landroid/content/Context;)Ljava/io/InputStream;", "Llive/hms/video/factories/noisecancellation/AvailabilityStatus;", "isNoiseCancellationAvailable", "()Llive/hms/video/factories/noisecancellation/AvailabilityStatus;", "enableWebrtcNoiseSuppression", "Lc93/a;", "", "modelPath", "Ljava/lang/String;", "modelName", "libraryPresent$delegate", "Ll83/h;", "getLibraryPresent", "libraryPresent", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class NoiseCancellationStatusChecker {
    private final InterfaceC4339a isEnabledFromTemplate;
    private final InterfaceC4339a isFlagEnabled;

    /* JADX INFO: renamed from: libraryPresent$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h libraryPresent;
    private final String modelName;
    private final String modelPath;

    public NoiseCancellationStatusChecker(Context context, InterfaceC4339a isFlagEnabled, InterfaceC4339a isEnabledFromTemplate) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(isFlagEnabled, "isFlagEnabled");
        AbstractC22676k.m65750j(isEnabledFromTemplate, "isEnabledFromTemplate");
        this.isFlagEnabled = isFlagEnabled;
        this.isEnabledFromTemplate = isEnabledFromTemplate;
        this.modelPath = "hms/";
        this.modelName = "100ms_noise_cancellation_model";
        this.libraryPresent = AbstractC30060g.m92088H(new C23045q(18, context, this));
    }

    private final boolean enabledFromDashboardInternal() {
        Object objInvoke = this.isFlagEnabled.invoke();
        Boolean bool = Boolean.TRUE;
        return AbstractC22676k.m65745e(objInvoke, bool) && AbstractC22676k.m65745e(this.isEnabledFromTemplate.invoke(), bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean libraryPresent_delegate$lambda$0(Context context, NoiseCancellationStatusChecker this$0) throws IOException {
        AbstractC22676k.m65750j(context, "$context");
        AbstractC22676k.m65750j(this$0, "this$0");
        String[] list = context.getResources().getAssets().list(this$0.modelPath);
        return list != null && AbstractC25260n.m74056a0(list, this$0.modelName);
    }

    public final boolean enableWebrtcNoiseSuppression() {
        return !AbstractC22676k.m65745e(isNoiseCancellationAvailable(), AvailabilityStatus.Available.INSTANCE);
    }

    public final boolean enabledFromDashboard() {
        return enabledFromDashboardInternal();
    }

    public final boolean getLibraryPresent() {
        return ((Boolean) this.libraryPresent.getValue()).booleanValue();
    }

    public final InputStream getModelStream(Context context) throws IOException {
        AbstractC22676k.m65750j(context, "context");
        InputStream inputStreamOpen = context.getResources().getAssets().open(this.modelPath + this.modelName);
        AbstractC22676k.m65749i(inputStreamOpen, "open(...)");
        return inputStreamOpen;
    }

    public final AvailabilityStatus isNoiseCancellationAvailable() {
        if (!getLibraryPresent()) {
            return new AvailabilityStatus.NotAvailable("Add the import for live.100ms:hms-noise-cancellation-android:$version to enable noise cancellation.");
        }
        boolean zEnabledFromDashboardInternal = enabledFromDashboardInternal();
        if (zEnabledFromDashboardInternal) {
            return AvailabilityStatus.Available.INSTANCE;
        }
        if (zEnabledFromDashboardInternal) {
            throw new NoWhenBranchMatchedException();
        }
        return new AvailabilityStatus.NotAvailable("Noise Cancellation is disabled in the 100ms dashboard. Enable it there to turn it on.");
    }
}
