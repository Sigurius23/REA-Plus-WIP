package live.hms.video.events;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.HashMap;
import live.hms.video.error.HMSException;
import live.hms.video.sdk.models.enums.HMSAnalyticsEventLevel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007JN\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/events/MediaPluginsAnalyticsFactory;", "", "<init>", "()V", "failure", "Llive/hms/video/events/AnalyticsEvent;", "pluginName", "", "error", "Llive/hms/video/error/HMSException;", "added", "stats", AttachmentExtensionsKt.EXTRA_DURATION, "", "loadTime", "avgProcessingTimeWithMl", "", "avgProcessingTimeWithoutMl", "peakValueWithMl", "peakValueWithoutMl", "inputFrameRate", "", "pluginFrameRate", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class MediaPluginsAnalyticsFactory {
    public static final MediaPluginsAnalyticsFactory INSTANCE = new MediaPluginsAnalyticsFactory();

    private MediaPluginsAnalyticsFactory() {
    }

    public final AnalyticsEvent added(String pluginName) {
        AbstractC22676k.m65750j(pluginName, "pluginName");
        HMSAnalyticsEventLevel hMSAnalyticsEventLevel = HMSAnalyticsEventLevel.INFO;
        HashMap map = new HashMap();
        map.put("plugin_name", pluginName);
        return new AnalyticsEvent("mediaPlugin.added", hMSAnalyticsEventLevel, false, map);
    }

    public final AnalyticsEvent failure(String pluginName, HMSException error) {
        AbstractC22676k.m65750j(pluginName, "pluginName");
        AbstractC22676k.m65750j(error, "error");
        HMSAnalyticsEventLevel hMSAnalyticsEventLevel = HMSAnalyticsEventLevel.ERROR;
        HashMap map = new HashMap();
        map.put("plugin_name", pluginName);
        map.putAll(error.toAnalyticsProperties());
        return new AnalyticsEvent("mediaPlugin.failed", hMSAnalyticsEventLevel, false, map);
    }

    public final AnalyticsEvent stats(String pluginName, long duration, long loadTime, double avgProcessingTimeWithMl, double avgProcessingTimeWithoutMl, double peakValueWithMl, double peakValueWithoutMl, int inputFrameRate, int pluginFrameRate) {
        AbstractC22676k.m65750j(pluginName, "pluginName");
        HMSAnalyticsEventLevel hMSAnalyticsEventLevel = HMSAnalyticsEventLevel.INFO;
        HashMap map = new HashMap();
        map.put("plugin_name", pluginName);
        map.put(AttachmentExtensionsKt.EXTRA_DURATION, Long.valueOf(duration));
        map.put("load_time", Long.valueOf(loadTime));
        map.put("avg_processing_time", Double.valueOf(avgProcessingTimeWithMl));
        map.put("avg_processing_time_withoutML", Double.valueOf(avgProcessingTimeWithoutMl));
        map.put("peak_processing_time", Double.valueOf(peakValueWithMl));
        map.put("peak_processing_time_withoutML", Double.valueOf(peakValueWithoutMl));
        map.put("input_frame_rate", Integer.valueOf(inputFrameRate));
        map.put("plugin_frame_rate", Integer.valueOf(pluginFrameRate));
        return new AnalyticsEvent("mediaPlugin.stats", hMSAnalyticsEventLevel, false, map);
    }
}
