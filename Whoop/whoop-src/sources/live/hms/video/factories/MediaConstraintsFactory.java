package live.hms.video.factories;

import hms.webrtc.MediaConstraints;
import java.util.List;
import live.hms.video.media.settings.HMSAudioTrackSettings;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0002J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020$J\u0006\u0010&\u001a\u00020$J\u0016\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006,"}, m65681d2 = {"Llive/hms/video/factories/MediaConstraintsFactory;", "", "<init>", "()V", "kValueTrue", "", "kValueFalse", "kGoogEchoCancellation", "kAutoGainControl", "kExperimentalAutoGainControl", "kNoiseSuppression", "kExperimentalNoiseSuppression", "kHighpassFilter", "kTypingNoiseDetection", "kAudioMirroring", "kAudioNetworkAdaptorConfig", "kOfferToReceiveAudio", "kOfferToReceiveVideo", "kVoiceActivityDetection", "kIceRestart", "kUseRtpMux", "kEnableDtlsSrtp", "kEnableRtpDataChannels", "kEnableDscp", "kEnableIPv6", "kEnableVideoSuspendBelowMinBitrate", "kCombinedAudioVideoBwe", "kScreencastMinBitrate", "kCpuOveruseDetection", "kRawPacketizationForVideoEnabled", "kNumSimulcastLayers", "kv", "Lhms/webrtc/MediaConstraints$KeyValuePair;", "key", "value", "makePublishOfferConstraints", "Lhms/webrtc/MediaConstraints;", "makeIceRestartPublishOfferConstraints", "makeSubscribeAnswerConstraints", "makeLocalAudioTrackConstraints", "trackSettings", "Llive/hms/video/media/settings/HMSAudioTrackSettings;", "enableWebrtcNoiseSuppressor", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class MediaConstraintsFactory {
    public static final MediaConstraintsFactory INSTANCE = new MediaConstraintsFactory();
    public static final String kAudioMirroring = "googAudioMirroring";
    public static final String kAudioNetworkAdaptorConfig = "googAudioNetworkAdaptorConfig";
    public static final String kAutoGainControl = "googAutoGainControl";
    public static final String kCombinedAudioVideoBwe = "googCombinedAudioVideoBwe";
    public static final String kCpuOveruseDetection = "googCpuOveruseDetection";
    public static final String kEnableDscp = "googDscp";
    public static final String kEnableDtlsSrtp = "DtlsSrtpKeyAgreement";
    public static final String kEnableIPv6 = "googIPv6";
    public static final String kEnableRtpDataChannels = "RtpDataChannels";
    public static final String kEnableVideoSuspendBelowMinBitrate = "googSuspendBelowMinBitrate";
    public static final String kExperimentalAutoGainControl = "googAutoGainControl2";
    public static final String kExperimentalNoiseSuppression = "googNoiseSuppression2";
    public static final String kGoogEchoCancellation = "googEchoCancellation";
    public static final String kHighpassFilter = "googHighpassFilter";
    public static final String kIceRestart = "IceRestart";
    public static final String kNoiseSuppression = "googNoiseSuppression";
    public static final String kNumSimulcastLayers = "googNumSimulcastLayers";
    public static final String kOfferToReceiveAudio = "OfferToReceiveAudio";
    public static final String kOfferToReceiveVideo = "OfferToReceiveVideo";
    public static final String kRawPacketizationForVideoEnabled = "googRawPacketizationForVideoEnabled";
    public static final String kScreencastMinBitrate = "googScreencastMinBitrate";
    public static final String kTypingNoiseDetection = "googTypingNoiseDetection";
    public static final String kUseRtpMux = "googUseRtpMUX";
    public static final String kValueFalse = "false";
    public static final String kValueTrue = "true";
    public static final String kVoiceActivityDetection = "VoiceActivityDetection";

    private MediaConstraintsFactory() {
    }

    /* JADX INFO: renamed from: kv */
    private final MediaConstraints.KeyValuePair m71056kv(String key, String value) {
        return new MediaConstraints.KeyValuePair(key, value);
    }

    public final MediaConstraints makeIceRestartPublishOfferConstraints() {
        MediaConstraints mediaConstraints = new MediaConstraints();
        List<MediaConstraints.KeyValuePair> list = mediaConstraints.mandatory;
        MediaConstraintsFactory mediaConstraintsFactory = INSTANCE;
        list.add(mediaConstraintsFactory.m71056kv(kOfferToReceiveAudio, kValueFalse));
        mediaConstraints.mandatory.add(mediaConstraintsFactory.m71056kv(kOfferToReceiveVideo, kValueFalse));
        mediaConstraints.mandatory.add(mediaConstraintsFactory.m71056kv(kIceRestart, kValueTrue));
        return mediaConstraints;
    }

    public final MediaConstraints makeLocalAudioTrackConstraints(HMSAudioTrackSettings trackSettings, boolean enableWebrtcNoiseSuppressor) {
        AbstractC22676k.m65750j(trackSettings, "trackSettings");
        MediaConstraints mediaConstraints = new MediaConstraints();
        List<MediaConstraints.KeyValuePair> list = mediaConstraints.optional;
        MediaConstraintsFactory mediaConstraintsFactory = INSTANCE;
        boolean enableNoiseSupression = trackSettings.getEnableNoiseSupression();
        String str = kValueFalse;
        list.add(mediaConstraintsFactory.m71056kv(kNoiseSuppression, (enableNoiseSupression && enableWebrtcNoiseSuppressor) ? kValueTrue : kValueFalse));
        mediaConstraints.optional.add(mediaConstraintsFactory.m71056kv(kGoogEchoCancellation, trackSettings.getEnableEchoCancellation() ? kValueTrue : kValueFalse));
        List<MediaConstraints.KeyValuePair> list2 = mediaConstraints.optional;
        if (trackSettings.getEnableAutomaticGainControl()) {
            str = kValueTrue;
        }
        list2.add(mediaConstraintsFactory.m71056kv(kAutoGainControl, str));
        return mediaConstraints;
    }

    public final MediaConstraints makePublishOfferConstraints() {
        MediaConstraints mediaConstraints = new MediaConstraints();
        List<MediaConstraints.KeyValuePair> list = mediaConstraints.mandatory;
        MediaConstraintsFactory mediaConstraintsFactory = INSTANCE;
        list.add(mediaConstraintsFactory.m71056kv(kOfferToReceiveAudio, kValueFalse));
        mediaConstraints.mandatory.add(mediaConstraintsFactory.m71056kv(kOfferToReceiveVideo, kValueFalse));
        return mediaConstraints;
    }

    public final MediaConstraints makeSubscribeAnswerConstraints() {
        MediaConstraints mediaConstraints = new MediaConstraints();
        List<MediaConstraints.KeyValuePair> list = mediaConstraints.mandatory;
        MediaConstraintsFactory mediaConstraintsFactory = INSTANCE;
        list.add(mediaConstraintsFactory.m71056kv(kOfferToReceiveAudio, kValueFalse));
        mediaConstraints.mandatory.add(mediaConstraintsFactory.m71056kv(kOfferToReceiveVideo, kValueFalse));
        return mediaConstraints;
    }
}
