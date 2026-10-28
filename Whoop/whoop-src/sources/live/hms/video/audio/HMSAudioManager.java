package live.hms.video.audio;

import ge3.AbstractC15751g;
import java.util.List;
import java.util.Set;
import live.hms.video.error.HMSException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0003\u001f !J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001e\u0010\u001d¨\u0006\""}, m65681d2 = {"Llive/hms/video/audio/HMSAudioManager;", "", "Ll83/a0;", "start", "()V", "stop", "", "isStarted", "()Z", "Llive/hms/video/audio/HMSAudioManager$AudioDevice;", "device", "selectAudioDevice", "(Llive/hms/video/audio/HMSAudioManager$AudioDevice;)V", "", "getAudioDevices", "()Ljava/util/Set;", "", "Llive/hms/video/audio/HMSAudioDeviceInfo;", "getAudioDevicesInfoList", "()Ljava/util/List;", "getSelectedAudioDevice", "()Llive/hms/video/audio/HMSAudioManager$AudioDevice;", "", "audioMode", "setAudioMode", "(I)V", "Llive/hms/video/audio/AudioManagerFocusChangeCallbacks;", "callback", "addAudioFocusChangeCallback", "(Llive/hms/video/audio/AudioManagerFocusChangeCallbacks;)V", "removeAudioFocusChangeCallback", "AudioDevice", "AudioManagerDeviceChangeListener", "AudioManagerState", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface HMSAudioManager {

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m65681d2 = {"Llive/hms/video/audio/HMSAudioManager$AudioDevice;", "", "<init>", "(Ljava/lang/String;I)V", "SPEAKER_PHONE", "WIRED_HEADSET", "EARPIECE", "BLUETOOTH", "AUTOMATIC", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public enum AudioDevice {
        SPEAKER_PHONE,
        WIRED_HEADSET,
        EARPIECE,
        BLUETOOTH,
        AUTOMATIC;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;", "", "Llive/hms/video/audio/HMSAudioManager$AudioDevice;", "selectedAudioDevice", "", "availableAudioDevices", "Ll83/a0;", "onAudioDeviceChanged", "(Llive/hms/video/audio/HMSAudioManager$AudioDevice;Ljava/util/Set;)V", "", "Llive/hms/video/audio/HMSAudioDeviceInfo;", "availableAudioInfoDevices", "onAudioDeviceInfoChanged", "(Llive/hms/video/audio/HMSAudioManager$AudioDevice;Ljava/util/List;)V", "Llive/hms/video/error/HMSException;", "e", "onError", "(Llive/hms/video/error/HMSException;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public interface AudioManagerDeviceChangeListener {

        @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
        public static final class DefaultImpls {
            public static void onAudioDeviceInfoChanged(AudioManagerDeviceChangeListener audioManagerDeviceChangeListener, AudioDevice selectedAudioDevice, List<HMSAudioDeviceInfo> availableAudioInfoDevices) {
                AbstractC22676k.m65750j(selectedAudioDevice, "selectedAudioDevice");
                AbstractC22676k.m65750j(availableAudioInfoDevices, "availableAudioInfoDevices");
            }
        }

        void onAudioDeviceChanged(AudioDevice selectedAudioDevice, Set<? extends AudioDevice> availableAudioDevices);

        void onAudioDeviceInfoChanged(AudioDevice selectedAudioDevice, List<HMSAudioDeviceInfo> availableAudioInfoDevices);

        void onError(HMSException e5);
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m65681d2 = {"Llive/hms/video/audio/HMSAudioManager$AudioManagerState;", "", "<init>", "(Ljava/lang/String;I)V", "UNINITIALIZED", "PREINITIALIZED", "RUNNING", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public enum AudioManagerState {
        UNINITIALIZED,
        PREINITIALIZED,
        RUNNING;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    void addAudioFocusChangeCallback(AudioManagerFocusChangeCallbacks callback);

    Set<AudioDevice> getAudioDevices();

    List<HMSAudioDeviceInfo> getAudioDevicesInfoList();

    AudioDevice getSelectedAudioDevice();

    boolean isStarted();

    void removeAudioFocusChangeCallback(AudioManagerFocusChangeCallbacks callback);

    void selectAudioDevice(AudioDevice device);

    void setAudioMode(int audioMode);

    void start();

    void stop();
}
