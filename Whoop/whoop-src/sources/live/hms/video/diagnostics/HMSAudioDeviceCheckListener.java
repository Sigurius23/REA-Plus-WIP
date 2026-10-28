package live.hms.video.diagnostics;

import live.hms.video.error.HMSException;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Llive/hms/video/diagnostics/HMSAudioDeviceCheckListener;", "", "Ll83/a0;", "onSuccess", "()V", "", "decibel", "onAudioLevelChanged", "(I)V", "Llive/hms/video/error/HMSException;", "error", "onError", "(Llive/hms/video/error/HMSException;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface HMSAudioDeviceCheckListener {

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        public static void onAudioLevelChanged(HMSAudioDeviceCheckListener hMSAudioDeviceCheckListener, int i13) {
        }
    }

    void onAudioLevelChanged(int decibel);

    void onError(HMSException error);

    void onSuccess();
}
