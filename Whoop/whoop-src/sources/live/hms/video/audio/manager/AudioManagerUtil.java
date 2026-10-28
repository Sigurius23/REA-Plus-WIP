package live.hms.video.audio.manager;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Llive/hms/video/audio/manager/AudioManagerUtil;", "", "<init>", "()V", "AudioDevice", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class AudioManagerUtil {

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m65681d2 = {"Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;", "", "<init>", "(Ljava/lang/String;I)V", "SPEAKER_PHONE", "WIRED_HEADSET", "EARPIECE", "BLUETOOTH", "NONE", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public enum AudioDevice {
        SPEAKER_PHONE,
        WIRED_HEADSET,
        EARPIECE,
        BLUETOOTH,
        NONE;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ AudioManagerUtil(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AudioManagerUtil() {
    }
}
