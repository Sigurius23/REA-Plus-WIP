package live.hms.video.media.streams;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import c93.InterfaceC4339a;
import hms.webrtc.AudioSource;
import hms.webrtc.AudioTrack;
import hms.webrtc.PeerConnectionFactory;
import hms.webrtc.VideoSource;
import hms.webrtc.VideoTrack;
import hms.webrtc.voiceengine.WebRtcAudioUtils;
import java.util.concurrent.CopyOnWriteArrayList;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSException;
import live.hms.video.events.AnalyticsEventsService;
import live.hms.video.factories.HMSPeerConnectionFactory;
import live.hms.video.factories.MediaConstraintsFactory;
import live.hms.video.media.capturers.HMSAudioCapturer;
import live.hms.video.media.capturers.HMSCameraCapturer;
import live.hms.video.media.capturers.HMSCapturer;
import live.hms.video.media.capturers.HMSScreenCapturer;
import live.hms.video.media.settings.HMSAudioTrackSettings;
import live.hms.video.media.settings.HMSVideoTrackSettings;
import live.hms.video.plugin.video.HMSVideoPlugin;
import live.hms.video.plugin.video.HMSVideoPluginsManager;
import live.hms.video.sdk.HMSActionResultListener;
import live.hms.video.sdk.models.enums.AudioMixingMode;
import live.hms.video.utils.HMSLogger;
import live.hms.video.utils.IdHelper;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018JG\u0010\"\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b\"\u0010#JG\u0010)\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020$2\u0006\u0010&\u001a\u00020%2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010'\u001a\u0004\u0018\u00010\u001c2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u001f¢\u0006\u0004\b+\u0010\u0003JE\u00106\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u00103\u001a\u00020\b2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010:¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u001f¢\u0006\u0004\b=\u0010\u0003R\u0014\u0010>\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR$\u0010D\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010BR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006N"}, m65681d2 = {"Llive/hms/video/media/streams/HMSStreamFactory;", "", "<init>", "()V", "Lhms/webrtc/PeerConnectionFactory;", "peerConnectionFactory", "Llive/hms/video/media/settings/HMSAudioTrackSettings;", "settings", "", "enableWebrtcNoiseSuppressor", "Lhms/webrtc/AudioTrack;", "makeLocalAudioTrack", "(Lhms/webrtc/PeerConnectionFactory;Llive/hms/video/media/settings/HMSAudioTrackSettings;Z)Lhms/webrtc/AudioTrack;", "isScreenShare", "Lhms/webrtc/VideoTrack;", "makeLocalVideoTrack", "(Lhms/webrtc/PeerConnectionFactory;Z)Lhms/webrtc/VideoTrack;", "Landroid/content/Context;", "context", "Llive/hms/video/media/settings/HMSVideoTrackSettings;", "Llive/hms/video/events/AnalyticsEventsService;", "analyticsEventsService", "Llive/hms/video/media/capturers/HMSCameraCapturer;", "makeLocalVideoCapturer", "(Landroid/content/Context;Llive/hms/video/media/settings/HMSVideoTrackSettings;Llive/hms/video/events/AnalyticsEventsService;)Llive/hms/video/media/capturers/HMSCameraCapturer;", "Landroid/content/Intent;", "mediaProjectionPermissionResultData", "hmsVideoTrackSettings", "Landroid/app/Notification;", "screenShareNotification", "Lkotlin/Function0;", "Ll83/a0;", "endScreenShare", "Llive/hms/video/media/capturers/HMSCapturer;", "makeScreenShareCapturer", "(Landroid/content/Context;Lhms/webrtc/PeerConnectionFactory;Landroid/content/Intent;Llive/hms/video/media/settings/HMSVideoTrackSettings;Landroid/app/Notification;Lc93/a;)Llive/hms/video/media/capturers/HMSCapturer;", "Llive/hms/video/factories/HMSPeerConnectionFactory;", "Llive/hms/video/sdk/models/enums/AudioMixingMode;", "audioMixingMode", "audioShareNotification", "endAudioShare", "makeAudioShareCapturer", "(Landroid/content/Context;Llive/hms/video/factories/HMSPeerConnectionFactory;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/content/Intent;Landroid/app/Notification;Lc93/a;)Llive/hms/video/media/capturers/HMSCapturer;", "updatePluginCameraSource", "Llive/hms/video/plugin/video/HMSVideoPlugin;", "plugin", "Llive/hms/video/sdk/HMSActionResultListener;", "resultListener", "", "inputFrameRate", "pluginFrameRate", "isEffectsSdkEnabled", "", "effectsKey", "addPlugin", "(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;IILlive/hms/video/events/AnalyticsEventsService;ZLjava/lang/String;)V", "removePlugin", "(Llive/hms/video/plugin/video/HMSVideoPlugin;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getPlugins", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "clean", "TAG", "Ljava/lang/String;", "Lhms/webrtc/VideoSource;", "videoSource", "Lhms/webrtc/VideoSource;", "Lhms/webrtc/AudioSource;", "audioSource", "Lhms/webrtc/AudioSource;", "getAudioSource", "()Lhms/webrtc/AudioSource;", "setAudioSource", "(Lhms/webrtc/AudioSource;)V", "localCameraVideoSource", "Llive/hms/video/plugin/video/HMSVideoPluginsManager;", "pluginsManager", "Llive/hms/video/plugin/video/HMSVideoPluginsManager;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSStreamFactory {
    public static final HMSStreamFactory INSTANCE = new HMSStreamFactory();
    private static final String TAG = "HMSStreamHelper";
    private static AudioSource audioSource;
    private static VideoSource localCameraVideoSource;
    private static HMSVideoPluginsManager pluginsManager;
    private static VideoSource videoSource;

    private HMSStreamFactory() {
    }

    public static /* synthetic */ VideoTrack makeLocalVideoTrack$default(HMSStreamFactory hMSStreamFactory, PeerConnectionFactory peerConnectionFactory, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return hMSStreamFactory.makeLocalVideoTrack(peerConnectionFactory, z4);
    }

    public final void addPlugin(HMSVideoPlugin plugin, HMSActionResultListener resultListener, int inputFrameRate, int pluginFrameRate, AnalyticsEventsService analyticsEventsService, boolean isEffectsSdkEnabled, String effectsKey) {
        AbstractC22676k.m65750j(plugin, "plugin");
        AbstractC22676k.m65750j(resultListener, "resultListener");
        AbstractC22676k.m65750j(analyticsEventsService, "analyticsEventsService");
        AbstractC22676k.m65750j(effectsKey, "effectsKey");
        if ((!isEffectsSdkEnabled || effectsKey.length() == 0) && AbstractC22676k.m65745e(plugin.getName(), "@100mslive/hms-virtual-background")) {
            resultListener.onError(ErrorFactory.GenericErrors.Unknown$default(ErrorFactory.GenericErrors.INSTANCE, ErrorFactory.Action.PLUGIN, "Effects SDK plugin needs to be enabled from dashboard. Please contact sales `sales@100ms.live` ", null, null, 12, null));
            return;
        }
        if (AbstractC22676k.m65745e(plugin.getName(), "@100mslive/hms-virtual-background")) {
            plugin.setKey(effectsKey);
        }
        if (pluginsManager == null) {
            HMSLogger.INSTANCE.m71139i(HMSVideoPluginsManager.TAG, "initializing plugin manager");
            VideoSource videoSource2 = localCameraVideoSource;
            if (videoSource2 == null) {
                HMSLogger.m71137e(TAG, "localCameraVideoSource is null. Not adding plugin");
                resultListener.onError(ErrorFactory.GenericErrors.Unknown$default(ErrorFactory.GenericErrors.INSTANCE, ErrorFactory.Action.PLUGIN, "localCameraVideoSource is null", null, null, 12, null));
                return;
            } else {
                HMSVideoPluginsManager hMSVideoPluginsManager = new HMSVideoPluginsManager(videoSource2, analyticsEventsService);
                pluginsManager = hMSVideoPluginsManager;
                hMSVideoPluginsManager.setInputFps(inputFrameRate);
            }
        }
        try {
            HMSVideoPluginsManager hMSVideoPluginsManager2 = pluginsManager;
            if (hMSVideoPluginsManager2 != null) {
                hMSVideoPluginsManager2.addPlugin(plugin, resultListener, pluginFrameRate);
            }
        } catch (HMSException e5) {
            HMSLogger.INSTANCE.m71139i(HMSVideoPluginsManager.TAG, " Adding plugin " + plugin + " getting error:" + e5);
            throw e5;
        }
    }

    public final void clean() {
        HMSVideoPluginsManager hMSVideoPluginsManager = pluginsManager;
        if (hMSVideoPluginsManager != null) {
            hMSVideoPluginsManager.clean();
        }
        pluginsManager = null;
        localCameraVideoSource = null;
        videoSource = null;
        audioSource = null;
    }

    public final AudioSource getAudioSource() {
        return audioSource;
    }

    public final CopyOnWriteArrayList<HMSVideoPlugin> getPlugins() throws HMSException {
        try {
            HMSVideoPluginsManager hMSVideoPluginsManager = pluginsManager;
            if (hMSVideoPluginsManager != null) {
                return hMSVideoPluginsManager.getPlugins();
            }
            return null;
        } catch (HMSException e5) {
            HMSLogger.INSTANCE.m71139i(HMSVideoPluginsManager.TAG, " List of plugins call giving error: " + e5);
            throw e5;
        }
    }

    public final HMSCapturer makeAudioShareCapturer(Context context, HMSPeerConnectionFactory peerConnectionFactory, AudioMixingMode audioMixingMode, Intent mediaProjectionPermissionResultData, Notification audioShareNotification, InterfaceC4339a endAudioShare) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(peerConnectionFactory, "peerConnectionFactory");
        AbstractC22676k.m65750j(audioMixingMode, "audioMixingMode");
        AbstractC22676k.m65750j(endAudioShare, "endAudioShare");
        return new HMSAudioCapturer(context, peerConnectionFactory, audioMixingMode, mediaProjectionPermissionResultData, audioShareNotification, endAudioShare);
    }

    public final AudioTrack makeLocalAudioTrack(PeerConnectionFactory peerConnectionFactory, HMSAudioTrackSettings settings, boolean enableWebrtcNoiseSuppressor) {
        AbstractC22676k.m65750j(peerConnectionFactory, "peerConnectionFactory");
        AbstractC22676k.m65750j(settings, "settings");
        WebRtcAudioUtils.setWebRtcBasedAcousticEchoCanceler(settings.getEnableEchoCancellation());
        WebRtcAudioUtils.setWebRtcBasedAutomaticGainControl(settings.getEnableAutomaticGainControl());
        WebRtcAudioUtils.setWebRtcBasedNoiseSuppressor(enableWebrtcNoiseSuppressor && settings.getEnableNoiseSupression());
        audioSource = peerConnectionFactory.createAudioSource(MediaConstraintsFactory.INSTANCE.makeLocalAudioTrackConstraints(settings, enableWebrtcNoiseSuppressor));
        String strMakeAudioMediaStreamTrackId = IdHelper.INSTANCE.makeAudioMediaStreamTrackId();
        AudioTrack audioTrackCreateAudioTrack = peerConnectionFactory.createAudioTrack(strMakeAudioMediaStreamTrackId, audioSource);
        audioTrackCreateAudioTrack.setVolume(settings.getVolume());
        HMSLogger.m71136d(TAG, "Initialized local AudioTrack with id=" + strMakeAudioMediaStreamTrackId);
        return audioTrackCreateAudioTrack;
    }

    public final HMSCameraCapturer makeLocalVideoCapturer(Context context, HMSVideoTrackSettings settings, AnalyticsEventsService analyticsEventsService) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(settings, "settings");
        AbstractC22676k.m65750j(analyticsEventsService, "analyticsEventsService");
        VideoSource videoSource2 = videoSource;
        AbstractC22676k.m65747g(videoSource2);
        return new HMSCameraCapturer(context, videoSource2, settings, analyticsEventsService);
    }

    public final VideoTrack makeLocalVideoTrack(PeerConnectionFactory peerConnectionFactory, boolean isScreenShare) {
        AbstractC22676k.m65750j(peerConnectionFactory, "peerConnectionFactory");
        VideoSource videoSourceCreateVideoSource = peerConnectionFactory.createVideoSource(isScreenShare);
        videoSource = videoSourceCreateVideoSource;
        if (!isScreenShare) {
            localCameraVideoSource = videoSourceCreateVideoSource;
        }
        String strMakeVideoMediaStreamTrackId = IdHelper.INSTANCE.makeVideoMediaStreamTrackId();
        VideoTrack videoTrackCreateVideoTrack = peerConnectionFactory.createVideoTrack(strMakeVideoMediaStreamTrackId, videoSource);
        HMSLogger.m71136d(TAG, "Initialized local VideoTrack with id=" + strMakeVideoMediaStreamTrackId);
        AbstractC22676k.m65747g(videoTrackCreateVideoTrack);
        return videoTrackCreateVideoTrack;
    }

    public final HMSCapturer makeScreenShareCapturer(Context context, PeerConnectionFactory peerConnectionFactory, Intent mediaProjectionPermissionResultData, HMSVideoTrackSettings hmsVideoTrackSettings, Notification screenShareNotification, InterfaceC4339a endScreenShare) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(peerConnectionFactory, "peerConnectionFactory");
        AbstractC22676k.m65750j(hmsVideoTrackSettings, "hmsVideoTrackSettings");
        AbstractC22676k.m65750j(endScreenShare, "endScreenShare");
        if (videoSource == null) {
            videoSource = peerConnectionFactory.createVideoSource(true);
        }
        VideoSource videoSource2 = videoSource;
        AbstractC22676k.m65747g(videoSource2);
        return new HMSScreenCapturer(context, videoSource2, mediaProjectionPermissionResultData, hmsVideoTrackSettings, screenShareNotification, endScreenShare);
    }

    public final void removePlugin(HMSVideoPlugin plugin) {
        AbstractC22676k.m65750j(plugin, "plugin");
        try {
            HMSVideoPluginsManager hMSVideoPluginsManager = pluginsManager;
            if (hMSVideoPluginsManager != null) {
                hMSVideoPluginsManager.removePlugin(plugin);
            }
        } catch (HMSException e5) {
            HMSLogger.INSTANCE.m71139i(HMSVideoPluginsManager.TAG, " Removing plugin " + plugin + " getting error: " + e5);
            throw e5;
        }
    }

    public final void setAudioSource(AudioSource audioSource2) {
        audioSource = audioSource2;
    }

    public final void updatePluginCameraSource() {
        HMSVideoPluginsManager hMSVideoPluginsManager;
        VideoSource videoSource2 = localCameraVideoSource;
        if (videoSource2 == null || (hMSVideoPluginsManager = pluginsManager) == null) {
            return;
        }
        hMSVideoPluginsManager.updateCameraSource(videoSource2);
    }
}
