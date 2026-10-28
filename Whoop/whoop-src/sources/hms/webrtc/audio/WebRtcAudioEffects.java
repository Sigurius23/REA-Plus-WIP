package hms.webrtc.audio;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import hc3.AbstractC17176i;
import hms.webrtc.Logging;
import java.util.UUID;
import p319m4.AbstractC25012a;

/* JADX INFO: loaded from: classes11.dex */
class WebRtcAudioEffects {
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffectsExternal";
    private static AudioEffect.Descriptor[] cachedEffects;
    private AcousticEchoCanceler aec;

    /* JADX INFO: renamed from: ns */
    private NoiseSuppressor f67574ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;

    public WebRtcAudioEffects() {
        AbstractC17176i.m48510l("ctor", WebRtcAudioUtils.getThreadInfo(), TAG);
    }

    private static void assertTrue(boolean z4) {
        if (!z4) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        if (AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) {
            return true;
        }
        return AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported();
    }

    private static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] descriptorArrQueryEffects = AudioEffect.queryEffects();
        cachedEffects = descriptorArrQueryEffects;
        return descriptorArrQueryEffects;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC, AOSP_ACOUSTIC_ECHO_CANCELER);
    }

    private static boolean isEffectTypeAvailable(UUID uuid, UUID uuid2) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return !descriptor.uuid.equals(uuid2);
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS, AOSP_NOISE_SUPPRESSOR);
    }

    public void enable(int i13) {
        Logging.m49570d(TAG, "enable(audioSession=" + i13 + ")");
        boolean z4 = false;
        assertTrue(this.aec == null);
        assertTrue(this.f67574ns == null);
        if (isAcousticEchoCancelerSupported()) {
            AcousticEchoCanceler acousticEchoCancelerCreate = AcousticEchoCanceler.create(i13);
            this.aec = acousticEchoCancelerCreate;
            if (acousticEchoCancelerCreate != null) {
                boolean enabled = acousticEchoCancelerCreate.getEnabled();
                boolean z13 = this.shouldEnableAec && isAcousticEchoCancelerSupported();
                if (this.aec.setEnabled(z13) != 0) {
                    Logging.m49571e(TAG, "Failed to set the AcousticEchoCanceler state");
                }
                String str = enabled ? "enabled" : "disabled";
                String str2 = this.aec.getEnabled() ? "enabled" : "disabled";
                StringBuilder sbM73379l = AbstractC25012a.m73379l("AcousticEchoCanceler: was ", str, ", enable: ", ", is now: ", z13);
                sbM73379l.append(str2);
                Logging.m49570d(TAG, sbM73379l.toString());
            } else {
                Logging.m49571e(TAG, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            NoiseSuppressor noiseSuppressorCreate = NoiseSuppressor.create(i13);
            this.f67574ns = noiseSuppressorCreate;
            if (noiseSuppressorCreate == null) {
                Logging.m49571e(TAG, "Failed to create the NoiseSuppressor instance");
                return;
            }
            boolean enabled2 = noiseSuppressorCreate.getEnabled();
            if (this.shouldEnableNs && isNoiseSuppressorSupported()) {
                z4 = true;
            }
            if (this.f67574ns.setEnabled(z4) != 0) {
                Logging.m49571e(TAG, "Failed to set the NoiseSuppressor state");
            }
            String str3 = enabled2 ? "enabled" : "disabled";
            String str4 = this.f67574ns.getEnabled() ? "enabled" : "disabled";
            StringBuilder sbM73379l2 = AbstractC25012a.m73379l("NoiseSuppressor: was ", str3, ", enable: ", ", is now: ", z4);
            sbM73379l2.append(str4);
            Logging.m49570d(TAG, sbM73379l2.toString());
        }
    }

    public void release() {
        Logging.m49570d(TAG, "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.f67574ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.f67574ns = null;
        }
    }

    public boolean setAEC(boolean z4) {
        Logging.m49570d(TAG, "setAEC(" + z4 + ")");
        if (!isAcousticEchoCancelerSupported()) {
            Logging.m49574w(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec == null || z4 == this.shouldEnableAec) {
            this.shouldEnableAec = z4;
            return true;
        }
        Logging.m49571e(TAG, "Platform AEC state can't be modified while recording");
        return false;
    }

    public boolean setNS(boolean z4) {
        Logging.m49570d(TAG, "setNS(" + z4 + ")");
        if (!isNoiseSuppressorSupported()) {
            Logging.m49574w(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        }
        if (this.f67574ns == null || z4 == this.shouldEnableNs) {
            this.shouldEnableNs = z4;
            return true;
        }
        Logging.m49571e(TAG, "Platform NS state can't be modified while recording");
        return false;
    }
}
