package live.hms.video.audio.manager;

import java.util.List;
import java.util.Map;
import l83.C23465k;
import live.hms.video.audio.HMSAudioManager;
import m83.AbstractC25247g0;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0007J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000eH\u0007R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/audio/manager/AudioDeviceMapping;", "", "<init>", "()V", "systemDeviceTypeMap", "", "Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;", "", "", "getEquivalentPlatformTypes", "audioDevice", "fromPlatformType", "type", "toHMSMapping", "Llive/hms/video/audio/HMSAudioManager$AudioDevice;", "signalDeviceMapping", "toSignalMapping", "hmsDeviceMapping", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class AudioDeviceMapping {
    public static final AudioDeviceMapping INSTANCE = new AudioDeviceMapping();
    private static final Map<AudioManagerUtil.AudioDevice, List<Integer>> systemDeviceTypeMap = AbstractC25247g0.m73990Y(new C23465k(AudioManagerUtil.AudioDevice.BLUETOOTH, AbstractC37056f.m118959K(7, 26, 23)), new C23465k(AudioManagerUtil.AudioDevice.EARPIECE, AbstractC37056f.m118958J(1)), new C23465k(AudioManagerUtil.AudioDevice.SPEAKER_PHONE, AbstractC37056f.m118959K(2, 24)), new C23465k(AudioManagerUtil.AudioDevice.WIRED_HEADSET, AbstractC37056f.m118959K(4, 3, 22)), new C23465k(AudioManagerUtil.AudioDevice.NONE, C25271y.f99162w));

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AudioManagerUtil.AudioDevice.values().length];
            try {
                iArr[AudioManagerUtil.AudioDevice.BLUETOOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioManagerUtil.AudioDevice.EARPIECE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioManagerUtil.AudioDevice.SPEAKER_PHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioManagerUtil.AudioDevice.WIRED_HEADSET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AudioManagerUtil.AudioDevice.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HMSAudioManager.AudioDevice.values().length];
            try {
                iArr2[HMSAudioManager.AudioDevice.BLUETOOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[HMSAudioManager.AudioDevice.EARPIECE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[HMSAudioManager.AudioDevice.SPEAKER_PHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[HMSAudioManager.AudioDevice.WIRED_HEADSET.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[HMSAudioManager.AudioDevice.AUTOMATIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private AudioDeviceMapping() {
    }

    public static final AudioManagerUtil.AudioDevice fromPlatformType(int type) {
        for (AudioManagerUtil.AudioDevice audioDevice : AudioManagerUtil.AudioDevice.values()) {
            if (getEquivalentPlatformTypes(audioDevice).contains(Integer.valueOf(type))) {
                return audioDevice;
            }
        }
        return AudioManagerUtil.AudioDevice.NONE;
    }

    public static final List<Integer> getEquivalentPlatformTypes(AudioManagerUtil.AudioDevice audioDevice) {
        AbstractC22676k.m65750j(audioDevice, "audioDevice");
        List<Integer> list = systemDeviceTypeMap.get(audioDevice);
        AbstractC22676k.m65747g(list);
        return list;
    }

    public static final HMSAudioManager.AudioDevice toHMSMapping(AudioManagerUtil.AudioDevice signalDeviceMapping) {
        AbstractC22676k.m65750j(signalDeviceMapping, "signalDeviceMapping");
        int i13 = WhenMappings.$EnumSwitchMapping$0[signalDeviceMapping.ordinal()];
        if (i13 == 1) {
            return HMSAudioManager.AudioDevice.BLUETOOTH;
        }
        if (i13 == 2) {
            return HMSAudioManager.AudioDevice.EARPIECE;
        }
        if (i13 == 3) {
            return HMSAudioManager.AudioDevice.SPEAKER_PHONE;
        }
        if (i13 == 4) {
            return HMSAudioManager.AudioDevice.WIRED_HEADSET;
        }
        if (i13 == 5) {
            return HMSAudioManager.AudioDevice.AUTOMATIC;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AudioManagerUtil.AudioDevice toSignalMapping(HMSAudioManager.AudioDevice hmsDeviceMapping) {
        AbstractC22676k.m65750j(hmsDeviceMapping, "hmsDeviceMapping");
        int i13 = WhenMappings.$EnumSwitchMapping$1[hmsDeviceMapping.ordinal()];
        if (i13 == 1) {
            return AudioManagerUtil.AudioDevice.BLUETOOTH;
        }
        if (i13 == 2) {
            return AudioManagerUtil.AudioDevice.EARPIECE;
        }
        if (i13 == 3) {
            return AudioManagerUtil.AudioDevice.SPEAKER_PHONE;
        }
        if (i13 == 4) {
            return AudioManagerUtil.AudioDevice.WIRED_HEADSET;
        }
        if (i13 == 5) {
            return AudioManagerUtil.AudioDevice.NONE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
