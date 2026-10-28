package hms.webrtc.voiceengine;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import androidx.health.platform.client.proto.C1533u;
import hms.webrtc.ContextUtils;
import hms.webrtc.Logging;
import ih0.AbstractC18489d0;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
public final class WebRtcAudioUtils {
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static final String TAG = "WebRtcAudioUtils";
    private static int defaultSampleRateHz = 16000;
    private static boolean isDefaultSampleRateOverridden;
    private static boolean useWebRtcBasedAcousticEchoCanceler;
    private static boolean useWebRtcBasedNoiseSuppressor;
    private static final String[] BLACKLISTED_OPEN_SL_ES_MODELS = new String[0];
    private static final String[] BLACKLISTED_AEC_MODELS = new String[0];
    private static final String[] BLACKLISTED_NS_MODELS = new String[0];

    public static boolean deviceIsBlacklistedForOpenSLESUsage() {
        return Arrays.asList(BLACKLISTED_OPEN_SL_ES_MODELS).contains(Build.MODEL);
    }

    private static String deviceTypeToString(int i13) {
        switch (i13) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return "TYPE_TV_TUNER";
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return "TYPE_TELEPHONY";
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static List<String> getBlackListedModelsForAecUsage() {
        return Arrays.asList(BLACKLISTED_AEC_MODELS);
    }

    public static List<String> getBlackListedModelsForNsUsage() {
        return Arrays.asList(BLACKLISTED_NS_MODELS);
    }

    public static synchronized int getDefaultSampleRateHz() {
        return defaultSampleRateHz;
    }

    public static String getThreadInfo() {
        StringBuilder sbM32000s = AbstractC11895b.m32000s("@[name=", Thread.currentThread().getName(), Thread.currentThread().getId(), ", id=");
        sbM32000s.append("]");
        return sbM32000s.toString();
    }

    private static boolean hasMicrophone() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    public static boolean isAutomaticGainControlSupported() {
        return false;
    }

    public static synchronized boolean isDefaultSampleRateOverridden() {
        return isDefaultSampleRateOverridden;
    }

    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        AudioDeviceInfo[] devices = audioManager.getDevices(3);
        if (devices.length == 0) {
            return;
        }
        Logging.m49570d(str, "Audio Devices: ");
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            StringBuilder sb4 = new StringBuilder("  ");
            sb4.append(deviceTypeToString(audioDeviceInfo.getType()));
            sb4.append(audioDeviceInfo.isSource() ? "(in): " : "(out): ");
            if (audioDeviceInfo.getChannelCounts().length > 0) {
                sb4.append("channels=");
                sb4.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                sb4.append(", ");
            }
            if (audioDeviceInfo.getEncodings().length > 0) {
                sb4.append("encodings=");
                sb4.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                sb4.append(", ");
            }
            if (audioDeviceInfo.getSampleRates().length > 0) {
                sb4.append("sample rates=");
                sb4.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                sb4.append(", ");
            }
            sb4.append("id=");
            sb4.append(audioDeviceInfo.getId());
            Logging.m49570d(str, sb4.toString());
        }
    }

    public static void logAudioState(String str) {
        logDeviceInfo(str);
        AudioManager audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        logAudioStateBasic(str, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    private static void logAudioStateBasic(String str, AudioManager audioManager) {
        String strModeToString = modeToString(audioManager.getMode());
        boolean zHasMicrophone = hasMicrophone();
        boolean zIsMicrophoneMute = audioManager.isMicrophoneMute();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        boolean zIsBluetoothScoOn = audioManager.isBluetoothScoOn();
        StringBuilder sbM73379l = AbstractC25012a.m73379l("Audio State: audio mode: ", strModeToString, ", has mic: ", ", mic muted: ", zHasMicrophone);
        AbstractC38963t7.m124392v(sbM73379l, zIsMicrophoneMute, ", music active: ", zIsMusicActive, ", speakerphone: ");
        sbM73379l.append(zIsSpeakerphoneOn);
        sbM73379l.append(", BT SCO: ");
        sbM73379l.append(zIsBluetoothScoOn);
        Logging.m49570d(str, sbM73379l.toString());
    }

    private static void logAudioStateVolume(String str, AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.m49570d(str, "Audio State: ");
        boolean zIsVolumeFixed = audioManager.isVolumeFixed();
        Logging.m49570d(str, "  fixed volume=" + zIsVolumeFixed);
        if (zIsVolumeFixed) {
            return;
        }
        for (int i13 = 0; i13 < 6; i13++) {
            int i14 = iArr[i13];
            StringBuilder sb4 = new StringBuilder();
            sb4.append("  " + streamTypeToString(i14) + ": ");
            sb4.append("volume=");
            sb4.append(audioManager.getStreamVolume(i14));
            sb4.append(", max=");
            sb4.append(audioManager.getStreamMaxVolume(i14));
            logIsStreamMute(str, audioManager, i14, sb4);
            Logging.m49570d(str, sb4.toString());
        }
    }

    public static void logDeviceInfo(String str) {
        int i13 = Build.VERSION.SDK_INT;
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.BRAND;
        String str4 = Build.DEVICE;
        String str5 = Build.ID;
        String str6 = Build.HARDWARE;
        String str7 = Build.MANUFACTURER;
        String str8 = Build.MODEL;
        String str9 = Build.PRODUCT;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "Android SDK: ", ", Release: ", str2, ", Brand: ");
        AbstractC11266d.m30444B(sbM53373n, str3, ", Device: ", str4, ", Id: ");
        AbstractC11266d.m30444B(sbM53373n, str5, ", Hardware: ", str6, ", Manufacturer: ");
        AbstractC11266d.m30444B(sbM53373n, str7, ", Model: ", str8, ", Product: ");
        sbM53373n.append(str9);
        Logging.m49570d(str, sbM53373n.toString());
    }

    private static void logIsStreamMute(String str, AudioManager audioManager, int i13, StringBuilder sb4) {
        sb4.append(", muted=");
        sb4.append(audioManager.isStreamMute(i13));
    }

    public static String modeToString(int i13) {
        if (i13 == 0) {
            return "MODE_NORMAL";
        }
        if (i13 == 1) {
            return "MODE_RINGTONE";
        }
        if (i13 != 2) {
            return i13 != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION";
        }
        return "MODE_IN_CALL";
    }

    public static boolean runningOnEmulator() {
        return Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_");
    }

    public static synchronized void setDefaultSampleRateHz(int i13) {
        isDefaultSampleRateOverridden = true;
        defaultSampleRateHz = i13;
    }

    public static synchronized void setWebRtcBasedAcousticEchoCanceler(boolean z4) {
        useWebRtcBasedAcousticEchoCanceler = z4;
    }

    public static synchronized void setWebRtcBasedAutomaticGainControl(boolean z4) {
        Logging.m49574w(TAG, "setWebRtcBasedAutomaticGainControl() is deprecated");
    }

    public static synchronized void setWebRtcBasedNoiseSuppressor(boolean z4) {
        useWebRtcBasedNoiseSuppressor = z4;
    }

    private static String streamTypeToString(int i13) {
        if (i13 == 0) {
            return "STREAM_VOICE_CALL";
        }
        if (i13 == 1) {
            return "STREAM_SYSTEM";
        }
        if (i13 == 2) {
            return "STREAM_RING";
        }
        if (i13 == 3) {
            return "STREAM_MUSIC";
        }
        if (i13 != 4) {
            return i13 != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION";
        }
        return "STREAM_ALARM";
    }

    public static synchronized boolean useWebRtcBasedAcousticEchoCanceler() {
        try {
            if (useWebRtcBasedAcousticEchoCanceler) {
                Logging.m49574w(TAG, "Overriding default behavior; now using WebRTC AEC!");
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return useWebRtcBasedAcousticEchoCanceler;
    }

    public static synchronized boolean useWebRtcBasedAutomaticGainControl() {
        return true;
    }

    public static synchronized boolean useWebRtcBasedNoiseSuppressor() {
        try {
            if (useWebRtcBasedNoiseSuppressor) {
                Logging.m49574w(TAG, "Overriding default behavior; now using WebRTC NS!");
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return useWebRtcBasedNoiseSuppressor;
    }
}
