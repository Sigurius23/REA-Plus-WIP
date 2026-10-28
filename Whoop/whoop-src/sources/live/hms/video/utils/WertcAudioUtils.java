package live.hms.video.utils;

import android.media.AudioManager;
import android.media.audiofx.AudioEffect;
import android.os.Build;
import hms.webrtc.Logging;
import java.util.UUID;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Llive/hms/video/utils/WertcAudioUtils;", "", "<init>", "()V", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class WertcAudioUtils {
    private static final String TAG = "WertcAudioUtils";
    private static AudioEffect.Descriptor[] cachedEffects;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");

    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u001c"}, m65681d2 = {"Llive/hms/video/utils/WertcAudioUtils$Companion;", "", "<init>", "()V", "TAG", "", "AOSP_ACOUSTIC_ECHO_CANCELER", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "getAOSP_ACOUSTIC_ECHO_CANCELER", "()Ljava/util/UUID;", "Ljava/util/UUID;", "cachedEffects", "", "Landroid/media/audiofx/AudioEffect$Descriptor;", "[Landroid/media/audiofx/AudioEffect$Descriptor;", "getAvailableEffects", "()[Landroid/media/audiofx/AudioEffect$Descriptor;", "isEffectTypeAvailable", "", "effectType", "blockListedUuid", "getSampleRateForApiLevel", "", "audioManager", "Landroid/media/AudioManager;", "getSampleRate", "runningOnEmulator", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final AudioEffect.Descriptor[] getAvailableEffects() {
            if (WertcAudioUtils.cachedEffects != null) {
                return WertcAudioUtils.cachedEffects;
            }
            WertcAudioUtils.cachedEffects = AudioEffect.queryEffects();
            return WertcAudioUtils.cachedEffects;
        }

        public final UUID getAOSP_ACOUSTIC_ECHO_CANCELER() {
            return WertcAudioUtils.AOSP_ACOUSTIC_ECHO_CANCELER;
        }

        public final int getSampleRate(AudioManager audioManager) {
            AbstractC22676k.m65750j(audioManager, "audioManager");
            if (runningOnEmulator()) {
                Logging.m49570d(WertcAudioUtils.TAG, "Running emulator, overriding sample rate to 8 kHz.");
                return 8000;
            }
            int sampleRateForApiLevel = getSampleRateForApiLevel(audioManager);
            HMSLogger.m71136d(WertcAudioUtils.TAG, "Sample rate is set to " + sampleRateForApiLevel + " Hz");
            return sampleRateForApiLevel;
        }

        public final int getSampleRateForApiLevel(AudioManager audioManager) {
            AbstractC22676k.m65750j(audioManager, "audioManager");
            String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
            if (property != null) {
                return Integer.parseInt(property);
            }
            return 16000;
        }

        public final boolean isEffectTypeAvailable(UUID effectType, UUID blockListedUuid) {
            AbstractC22676k.m65750j(effectType, "effectType");
            AbstractC22676k.m65750j(blockListedUuid, "blockListedUuid");
            AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
            if (availableEffects == null) {
                return false;
            }
            for (AudioEffect.Descriptor descriptor : availableEffects) {
                if (AbstractC22676k.m65745e(descriptor.type, effectType)) {
                    return !AbstractC22676k.m65745e(descriptor.uuid, blockListedUuid);
                }
            }
            return false;
        }

        public final boolean runningOnEmulator() {
            if (AbstractC22676k.m65745e(Build.HARDWARE, "goldfish")) {
                String BRAND = Build.BRAND;
                AbstractC22676k.m65749i(BRAND, "BRAND");
                if (AbstractC39421y.m125930O(BRAND, "generic_", false)) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }
}
