package live.hms.video.events;

import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.models.MessageType;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import l83.C23465k;
import live.hms.video.audio.HMSAudioManager;
import live.hms.video.connection.stats.clientside.model.PublishAnalyticPayload;
import live.hms.video.error.HMSException;
import live.hms.video.factories.MediaConstraintsFactory;
import live.hms.video.sdk.models.enums.HMSAnalyticsEventLevel;
import live.hms.video.sdk.models.enums.RetrySchedulerState;
import live.hms.video.utils.ExtensionUtilsKt;
import m83.AbstractC25247g0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.json.JSONException;
import org.json.JSONObject;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001d\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0005J.\u0010&\u001a\u00020\b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020-J\u0018\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020*2\b\b\u0002\u00100\u001a\u00020\u0005J\u000e\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020$J\u000e\u00101\u001a\u00020\b2\u0006\u00103\u001a\u00020*J\u0018\u00104\u001a\u00020\b2\u0006\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020*J\u000e\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020*J\"\u0010:\u001a\u00020\b2\u0006\u0010;\u001a\u00020*2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010=J\"\u0010>\u001a\u00020\b2\u0006\u0010;\u001a\u00020*2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010=J\u000e\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\nJ\u000e\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020CR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006D"}, m65681d2 = {"Llive/hms/video/events/AnalyticsEventFactory;", "", "<init>", "()V", "cRequestedAt", "", "cRespondedAt", "disconnect", "Llive/hms/video/events/AnalyticsEvent;", "error", "Llive/hms/video/error/HMSException;", "source", "Llive/hms/video/sdk/models/enums/RetrySchedulerState;", "networkTypeEvent", "currentNetworkType", "joinFailedEvent", "requestedAt", "Ljava/util/Date;", "respondedAt", "publishFail", "audioPublishFail", "videoPublishFail", "subscribeFail", "connect", "networkQualityInPreviewResults", "score", "", "speedKilobytesPerSecond", "", "(ILjava/lang/Double;)Llive/hms/video/events/AnalyticsEvent;", "performance", "stats", "Llive/hms/video/events/IAnalyticsPropertiesProvider;", "rtcStats", "degradation", "eventTime", "", "trackId", "restoration", "degradedAt", "durationDegraded", "hidden", "", "selectedAudioDevice", "selectedDevice", "Llive/hms/video/audio/HMSAudioManager$AudioDevice;", "interruptionState", "interruptStart", "type", "noiseCancellationStats", "enabledDuration", "isStart", "clientSideStats", "publishAnalyticPayload", "Llive/hms/video/connection/stats/clientside/model/PublishAnalyticPayload;", "isSubscriber", "audioEchoCancellation", "isHardware", "joinStatusEvent", "eventSuccessful", "eventMap", "Ljava/util/HashMap;", "previewStatusEvent", "genericHMSExceptionEvent", "hmsException", "cameraCapturingException", "exception", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class AnalyticsEventFactory {
    public static final AnalyticsEventFactory INSTANCE = new AnalyticsEventFactory();
    private static final String cRequestedAt = "requested_at";
    private static final String cRespondedAt = "responded_at";

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMSAudioManager.AudioDevice.values().length];
            try {
                iArr[HMSAudioManager.AudioDevice.SPEAKER_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HMSAudioManager.AudioDevice.WIRED_HEADSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HMSAudioManager.AudioDevice.EARPIECE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HMSAudioManager.AudioDevice.BLUETOOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HMSAudioManager.AudioDevice.AUTOMATIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AnalyticsEventFactory() {
    }

    public static /* synthetic */ AnalyticsEvent clientSideStats$default(AnalyticsEventFactory analyticsEventFactory, PublishAnalyticPayload publishAnalyticPayload, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return analyticsEventFactory.clientSideStats(publishAnalyticPayload, z4);
    }

    public static /* synthetic */ AnalyticsEvent interruptionState$default(AnalyticsEventFactory analyticsEventFactory, boolean z4, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = "audio";
        }
        return analyticsEventFactory.interruptionState(z4, str);
    }

    public final AnalyticsEvent audioEchoCancellation(boolean isHardware) {
        return new AnalyticsEvent("aec.isHardware", HMSAnalyticsEventLevel.INFO, false, AbstractC25247g0.m73987V(new C23465k("isHardwareAEC", Boolean.valueOf(isHardware))));
    }

    public final AnalyticsEvent audioPublishFail(HMSException error) {
        AbstractC22676k.m65750j(error, "error");
        return new AnalyticsEvent("audiopresence.failed", HMSAnalyticsEventLevel.ERROR, false, error.toAnalyticsProperties());
    }

    public final AnalyticsEvent cameraCapturingException(Throwable exception) {
        AbstractC22676k.m65750j(exception, "exception");
        C23465k c23465k = new C23465k("error_code", "7006");
        C23465k c23465k2 = new C23465k("is_terminal", MediaConstraintsFactory.kValueFalse);
        C23465k c23465k3 = new C23465k("name", "Error in capturing image from camera pipeline");
        String message = exception.getMessage();
        String string = null;
        if (message == null) {
            message = null;
        }
        C23465k c23465k4 = new C23465k("error_message", String.valueOf(message));
        StackTraceElement[] stackTrace = exception.getStackTrace();
        if (stackTrace != null) {
            string = Arrays.toString(stackTrace);
            AbstractC22676k.m65749i(string, "toString(...)");
        }
        if (string == null) {
            string = "";
        }
        return new AnalyticsEvent("camera.captureImageAtMaxSupportedResolution.error", HMSAnalyticsEventLevel.ERROR, false, AbstractC25247g0.m73987V(c23465k, c23465k2, c23465k3, c23465k4, new C23465k("error_description", AbstractC39414r.m125866L0(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, string))));
    }

    public final AnalyticsEvent clientSideStats(PublishAnalyticPayload publishAnalyticPayload, boolean isSubscriber) throws JSONException {
        AbstractC22676k.m65750j(publishAnalyticPayload, "publishAnalyticPayload");
        return new AnalyticsEvent((isSubscriber ? "subscriber" : "publisher").concat(".stats"), HMSAnalyticsEventLevel.INFO, false, ExtensionUtilsKt.toMap(new JSONObject(ExtensionUtilsKt.toJson(publishAnalyticPayload))));
    }

    public final AnalyticsEvent connect(HMSException error, RetrySchedulerState source) {
        AbstractC22676k.m65750j(error, "error");
        AbstractC22676k.m65750j(source, "source");
        HashMap<String, Object> analyticsProperties = error.toAnalyticsProperties();
        analyticsProperties.put("transport_state", source.getCurrentState());
        return new AnalyticsEvent("connect.failed", HMSAnalyticsEventLevel.ERROR, false, analyticsProperties);
    }

    public final AnalyticsEvent degradation(long eventTime, String trackId) {
        AbstractC22676k.m65750j(trackId, "trackId");
        return new AnalyticsEvent("video.degradation.stats", HMSAnalyticsEventLevel.ERROR, false, AbstractC25247g0.m73987V(new C23465k("trackID", trackId), new C23465k("degradedAt", String.valueOf(eventTime))));
    }

    public final AnalyticsEvent disconnect(HMSException error, RetrySchedulerState source) {
        AbstractC22676k.m65750j(error, "error");
        AbstractC22676k.m65750j(source, "source");
        HashMap<String, Object> analyticsProperties = error.toAnalyticsProperties();
        analyticsProperties.put("transport_state", source.getCurrentState());
        return new AnalyticsEvent("disconnected", HMSAnalyticsEventLevel.ERROR, false, analyticsProperties);
    }

    public final AnalyticsEvent genericHMSExceptionEvent(HMSException hmsException) {
        AbstractC22676k.m65750j(hmsException, "hmsException");
        return new AnalyticsEvent(hmsException.getName(), HMSAnalyticsEventLevel.ERROR, false, AbstractC25247g0.m73987V(new C23465k("error_code", Integer.valueOf(hmsException.getCode())), new C23465k("error_message", String.valueOf(hmsException.getMessage())), new C23465k("error_description", String.valueOf(hmsException.getCause())), new C23465k("is_terminal", Boolean.valueOf(hmsException.getIsTerminal()))));
    }

    public final AnalyticsEvent interruptionState(boolean interruptStart, String type) {
        AbstractC22676k.m65750j(type, "type");
        String str = interruptStart ? "start" : "end";
        return new AnalyticsEvent("interruption.".concat(str), HMSAnalyticsEventLevel.INFO, false, AbstractC25247g0.m73987V(new C23465k("type", type)));
    }

    public final AnalyticsEvent joinFailedEvent(Date requestedAt, Date respondedAt, HMSException error, String currentNetworkType) {
        AbstractC22676k.m65750j(requestedAt, "requestedAt");
        AbstractC22676k.m65750j(respondedAt, "respondedAt");
        AbstractC22676k.m65750j(error, "error");
        HashMap mapM73987V = AbstractC25247g0.m73987V(new C23465k(cRequestedAt, String.valueOf(requestedAt.getTime())), new C23465k(cRespondedAt, String.valueOf(respondedAt.getTime())));
        if (currentNetworkType != null) {
            mapM73987V.put("network_type", currentNetworkType);
        }
        mapM73987V.putAll(error.toAnalyticsProperties());
        return new AnalyticsEvent("join.failed", HMSAnalyticsEventLevel.ERROR, false, mapM73987V);
    }

    public final AnalyticsEvent joinStatusEvent(boolean eventSuccessful, HashMap<String, Object> eventMap) {
        AbstractC22676k.m65750j(eventMap, "eventMap");
        String str = eventSuccessful ? "success" : MessageType.FAILED;
        HMSAnalyticsEventLevel hMSAnalyticsEventLevel = eventSuccessful ? HMSAnalyticsEventLevel.INFO : HMSAnalyticsEventLevel.ERROR;
        String strConcat = "join.".concat(str);
        HashMap map = new HashMap();
        map.putAll(eventMap);
        return new AnalyticsEvent(strConcat, hMSAnalyticsEventLevel, false, map);
    }

    public final AnalyticsEvent networkQualityInPreviewResults(int score, Double speedKilobytesPerSecond) {
        Object obj = speedKilobytesPerSecond;
        if (speedKilobytesPerSecond == null) {
            obj = "null";
        }
        return new AnalyticsEvent("perf.networkquality.preview", HMSAnalyticsEventLevel.INFO, false, AbstractC25247g0.m73987V(new C23465k("score", Integer.valueOf(score)), new C23465k("downLink", obj)));
    }

    public final AnalyticsEvent networkTypeEvent(String currentNetworkType) {
        HMSAnalyticsEventLevel hMSAnalyticsEventLevel = HMSAnalyticsEventLevel.INFO;
        HashMap map = new HashMap();
        if (currentNetworkType != null) {
            map.put("network_type", currentNetworkType);
        }
        return new AnalyticsEvent("network.type.changed", hMSAnalyticsEventLevel, false, map);
    }

    public final AnalyticsEvent noiseCancellationStats(long enabledDuration) {
        return new AnalyticsEvent("krisp.usage", HMSAnalyticsEventLevel.INFO, false, AbstractC25247g0.m73987V(new C23465k(AttachmentExtensionsKt.EXTRA_DURATION, Long.valueOf(enabledDuration))));
    }

    public final AnalyticsEvent performance(IAnalyticsPropertiesProvider stats) {
        AbstractC22676k.m65750j(stats, "stats");
        return new AnalyticsEvent("perf.stats", HMSAnalyticsEventLevel.INFO, false, stats.toAnalyticsProperties());
    }

    public final AnalyticsEvent previewStatusEvent(boolean eventSuccessful, HashMap<String, Object> eventMap) {
        AbstractC22676k.m65750j(eventMap, "eventMap");
        String str = eventSuccessful ? "success" : "failure";
        HMSAnalyticsEventLevel hMSAnalyticsEventLevel = eventSuccessful ? HMSAnalyticsEventLevel.INFO : HMSAnalyticsEventLevel.ERROR;
        String strConcat = "preview.".concat(str);
        HashMap map = new HashMap();
        map.putAll(eventMap);
        return new AnalyticsEvent(strConcat, hMSAnalyticsEventLevel, false, map);
    }

    public final AnalyticsEvent publishFail(HMSException error) {
        AbstractC22676k.m65750j(error, "error");
        return new AnalyticsEvent("publish.failed", HMSAnalyticsEventLevel.ERROR, false, error.toAnalyticsProperties());
    }

    public final AnalyticsEvent restoration(long eventTime, String trackId, long degradedAt, long durationDegraded, boolean hidden) {
        AbstractC22676k.m65750j(trackId, "trackId");
        return new AnalyticsEvent("video.degradation.stats", HMSAnalyticsEventLevel.ERROR, false, AbstractC25247g0.m73987V(new C23465k("trackID", trackId), new C23465k("recoveredAt", String.valueOf(eventTime)), new C23465k("degradedAt", String.valueOf(degradedAt)), new C23465k(AttachmentExtensionsKt.EXTRA_DURATION, String.valueOf(durationDegraded)), new C23465k("hidden", String.valueOf(hidden))));
    }

    public final AnalyticsEvent rtcStats(IAnalyticsPropertiesProvider stats) {
        AbstractC22676k.m65750j(stats, "stats");
        return new AnalyticsEvent("rtc.stats", HMSAnalyticsEventLevel.INFO, false, stats.toAnalyticsProperties());
    }

    public final AnalyticsEvent selectedAudioDevice(HMSAudioManager.AudioDevice selectedDevice) {
        String str;
        AbstractC22676k.m65750j(selectedDevice, "selectedDevice");
        int i13 = WhenMappings.$EnumSwitchMapping$0[selectedDevice.ordinal()];
        if (i13 == 1) {
            str = "speakerphone";
        } else if (i13 == 2) {
            str = "wiredhs";
        } else if (i13 == 3) {
            str = "earpiece";
        } else if (i13 == 4) {
            str = "bt";
        } else {
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str = UserState.Sources.AUTO;
        }
        return new AnalyticsEvent("audio.stats", HMSAnalyticsEventLevel.INFO, false, AbstractC25247g0.m73987V(new C23465k("speakerOutput", str)));
    }

    public final AnalyticsEvent subscribeFail(HMSException error) {
        AbstractC22676k.m65750j(error, "error");
        return new AnalyticsEvent("subscribe.failed", HMSAnalyticsEventLevel.ERROR, false, error.toAnalyticsProperties());
    }

    public final AnalyticsEvent videoPublishFail(HMSException error) {
        AbstractC22676k.m65750j(error, "error");
        return new AnalyticsEvent("videopresence.failed", HMSAnalyticsEventLevel.ERROR, false, error.toAnalyticsProperties());
    }

    public final AnalyticsEvent noiseCancellationStats(boolean isStart) {
        return new AnalyticsEvent("krisp.".concat(isStart ? "start" : "stop"), HMSAnalyticsEventLevel.INFO, false, null, 8, null);
    }
}
