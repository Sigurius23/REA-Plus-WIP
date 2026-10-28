package live.hms.video.media.capturers;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m65681d2 = {"Llive/hms/video/media/capturers/HMSCapturer;", "", "Ll83/a0;", "start", "()V", "stop", "dispose", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface HMSCapturer {

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        public static void dispose(HMSCapturer hMSCapturer) {
        }
    }

    void dispose();

    void start();

    void stop();
}
