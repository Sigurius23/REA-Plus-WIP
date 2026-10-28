package live.hms.video.factories.noisecancellation;

import android.content.Context;
import android.util.Log;
import c93.InterfaceC4339a;
import hms.webrtc.KrispAudioProcessingImpl;
import java.io.IOException;
import java.io.InputStream;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import s40.AbstractC32145e0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Llive/hms/video/factories/noisecancellation/NoiseCancellationFactoryImpl;", "Llive/hms/video/factories/noisecancellation/NoiseCancellationFactory;", "noiseCancellationStatusChecker", "Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;", "<init>", "(Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;)V", "jniLoad", "Llive/hms/video/factories/noisecancellation/NoiseCancellation;", "context", "Landroid/content/Context;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class NoiseCancellationFactoryImpl implements NoiseCancellationFactory {
    private final NoiseCancellationStatusChecker noiseCancellationStatusChecker;

    /* JADX INFO: renamed from: live.hms.video.factories.noisecancellation.NoiseCancellationFactoryImpl$jniLoad$2 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C241532 extends C22672i implements InterfaceC4339a {
        public C241532(Object obj) {
            super(0, 0, NoiseCancellationStatusChecker.class, obj, "enabledFromDashboard", "enabledFromDashboard()Z");
        }

        @Override // c93.InterfaceC4339a
        public final Boolean invoke() {
            return Boolean.valueOf(((NoiseCancellationStatusChecker) this.receiver).enabledFromDashboard());
        }
    }

    public NoiseCancellationFactoryImpl(NoiseCancellationStatusChecker noiseCancellationStatusChecker) {
        AbstractC22676k.m65750j(noiseCancellationStatusChecker, "noiseCancellationStatusChecker");
        this.noiseCancellationStatusChecker = noiseCancellationStatusChecker;
    }

    @Override // live.hms.video.factories.noisecancellation.NoiseCancellationFactory
    public NoiseCancellation jniLoad(Context context) throws IOException {
        NoiseCancellation noiseCancellationFake;
        AbstractC22676k.m65750j(context, "context");
        boolean libraryPresent = this.noiseCancellationStatusChecker.getLibraryPresent();
        boolean zEnabledFromDashboard = this.noiseCancellationStatusChecker.enabledFromDashboard();
        Log.d("KrispLoading", "Present: Library " + libraryPresent + ", Dashboard " + zEnabledFromDashboard + ' ');
        if (!libraryPresent) {
            return new NoiseCancellationFake(libraryPresent, zEnabledFromDashboard);
        }
        InputStream modelStream = null;
        try {
            try {
                modelStream = this.noiseCancellationStatusChecker.getModelStream(context);
                byte[] bArrM100100g = AbstractC32145e0.m100100g(modelStream);
                KrispAudioProcessingImpl krispAudioProcessingImpl = new KrispAudioProcessingImpl();
                krispAudioProcessingImpl.InitWithData(bArrM100100g, "libkrisp-audio-sdk.so");
                noiseCancellationFake = new NoiseCancellationImpl(krispAudioProcessingImpl, new C241532(this.noiseCancellationStatusChecker));
            } catch (Exception unused) {
                noiseCancellationFake = new NoiseCancellationFake(true, true);
                if (modelStream != null) {
                }
                return noiseCancellationFake;
            }
            modelStream.close();
            return noiseCancellationFake;
        } catch (Throwable th3) {
            if (modelStream != null) {
                modelStream.close();
            }
            throw th3;
        }
    }
}
