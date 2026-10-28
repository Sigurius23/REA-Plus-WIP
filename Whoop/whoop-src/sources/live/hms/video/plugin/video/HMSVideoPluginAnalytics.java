package live.hms.video.plugin.video;

import c93.InterfaceC4339a;
import java.util.HashMap;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSAction;
import live.hms.video.error.HMSException;
import live.hms.video.events.AnalyticsEvent;
import live.hms.video.events.AnalyticsEventsService;
import live.hms.video.events.MediaPluginsAnalyticsFactory;
import live.hms.video.utils.HMSLogger;
import live.hms.video.utils.RunningAverage;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 32\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u000fJ#\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b \u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u0005R2\u0010'\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190%j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0019`&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R2\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190%j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0019`&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R2\u0010+\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020*0%j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020*`&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010(R2\u0010-\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020,0%j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020,`&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010(R2\u0010.\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020*0%j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020*`&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010(R2\u0010/\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020,0%j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020,`&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010(R2\u00101\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002000%j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u000200`&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010(R2\u00102\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0%j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b`&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010(R2\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0%j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b`&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010(¨\u00064"}, m65681d2 = {"Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;", "", "Llive/hms/video/events/AnalyticsEventsService;", "analyticsEventsService", "<init>", "(Llive/hms/video/events/AnalyticsEventsService;)V", "", "name", "", "inputFrameRate", "pluginFrameRate", "Ll83/a0;", "added", "(Ljava/lang/String;ILjava/lang/Integer;)V", "removed", "(Ljava/lang/String;)V", "Llive/hms/video/error/HMSException;", "error", "failure", "(Ljava/lang/String;Llive/hms/video/error/HMSException;)V", "addPluginSuccess", "Lkotlin/Function0;", "processFn", "processWithTime", "(Ljava/lang/String;Lc93/a;)V", "", "timeWithML", "timeWithoutML", "processTime", "(Ljava/lang/String;JJ)V", "timeInMs", "(Lc93/a;)J", "clean", "Llive/hms/video/events/AnalyticsEventsService;", "getAnalyticsEventsService", "()Llive/hms/video/events/AnalyticsEventsService;", "setAnalyticsEventsService", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "initTime", "Ljava/util/HashMap;", "addedTimestamps", "Llive/hms/video/utils/RunningAverage;", "processingAvgsWithMl", "", "peakValueWithMl", "processingAvgsWithoutMl", "peakValueWithoutMl", "", "pluginAdded", "pluginInputFrameRate", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSVideoPluginAnalytics {
    public static final String TAG = "HMSVideoPluginAnalytics";
    private HashMap<String, Long> addedTimestamps;
    private AnalyticsEventsService analyticsEventsService;
    private HashMap<String, Long> initTime;
    private HashMap<String, Double> peakValueWithMl;
    private HashMap<String, Double> peakValueWithoutMl;
    private HashMap<String, Boolean> pluginAdded;
    private HashMap<String, Integer> pluginFrameRate;
    private HashMap<String, Integer> pluginInputFrameRate;
    private HashMap<String, RunningAverage> processingAvgsWithMl;
    private HashMap<String, RunningAverage> processingAvgsWithoutMl;

    public HMSVideoPluginAnalytics(AnalyticsEventsService analyticsEventsService) {
        AbstractC22676k.m65750j(analyticsEventsService, "analyticsEventsService");
        this.analyticsEventsService = analyticsEventsService;
        this.initTime = new HashMap<>();
        this.addedTimestamps = new HashMap<>();
        this.processingAvgsWithMl = new HashMap<>();
        this.peakValueWithMl = new HashMap<>();
        this.processingAvgsWithoutMl = new HashMap<>();
        this.peakValueWithoutMl = new HashMap<>();
        this.pluginAdded = new HashMap<>();
        this.pluginInputFrameRate = new HashMap<>();
        this.pluginFrameRate = new HashMap<>();
    }

    public final void addPluginSuccess(String name) {
        AbstractC22676k.m65750j(name, "name");
        try {
            if (AbstractC22676k.m65745e(this.pluginAdded.get(name), Boolean.TRUE)) {
                this.analyticsEventsService.queue(MediaPluginsAnalyticsFactory.INSTANCE.added(name)).flush();
            }
        } catch (Throwable th3) {
            AbstractC34132o.m107888l(th3);
        }
    }

    public final void added(String name, int inputFrameRate, Integer pluginFrameRate) {
        AbstractC22676k.m65750j(name, "name");
        this.pluginAdded.put(name, Boolean.TRUE);
        this.addedTimestamps.put(name, Long.valueOf(System.currentTimeMillis()));
        this.processingAvgsWithMl.put(name, new RunningAverage());
        this.processingAvgsWithoutMl.put(name, new RunningAverage());
        HashMap<String, Double> map = this.peakValueWithMl;
        Double dValueOf = Double.valueOf(0.0d);
        map.put(name, dValueOf);
        this.peakValueWithoutMl.put(name, dValueOf);
        this.pluginInputFrameRate.put(name, Integer.valueOf(inputFrameRate));
        if (pluginFrameRate != null) {
            this.pluginFrameRate.put(name, pluginFrameRate);
        } else {
            this.pluginFrameRate.put(name, Integer.valueOf(inputFrameRate));
        }
    }

    public final void clean(String name) {
        AbstractC22676k.m65750j(name, "name");
        this.addedTimestamps.remove(name);
        this.initTime.remove(name);
        this.processingAvgsWithMl.remove(name);
        this.peakValueWithMl.remove(name);
        this.peakValueWithoutMl.remove(name);
        this.processingAvgsWithoutMl.remove(name);
        this.pluginAdded.remove(name);
        this.pluginInputFrameRate.remove(name);
        this.pluginFrameRate.remove(name);
    }

    public final void failure(String name, HMSException error) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(error, "error");
        this.analyticsEventsService.queue(MediaPluginsAnalyticsFactory.INSTANCE.failure(name, error)).flush();
        clean(name);
    }

    public final AnalyticsEventsService getAnalyticsEventsService() {
        return this.analyticsEventsService;
    }

    public final void processTime(String name, long timeWithML, long timeWithoutML) {
        AbstractC22676k.m65750j(name, "name");
        if (timeWithML > 0) {
            RunningAverage runningAverage = this.processingAvgsWithMl.get(name);
            if (runningAverage != null) {
                runningAverage.add(timeWithML);
            }
            if (this.peakValueWithMl.containsKey(name)) {
                Double d3 = this.peakValueWithMl.get(name);
                AbstractC22676k.m65747g(d3);
                double d14 = timeWithML;
                if (d3.doubleValue() < d14) {
                    this.peakValueWithMl.put(name, Double.valueOf(d14));
                }
            }
        }
        if (timeWithoutML > 0) {
            RunningAverage runningAverage2 = this.processingAvgsWithoutMl.get(name);
            if (runningAverage2 != null) {
                runningAverage2.add(timeWithoutML);
            }
            if (this.peakValueWithoutMl.containsKey(name)) {
                Double d15 = this.peakValueWithoutMl.get(name);
                AbstractC22676k.m65747g(d15);
                double d16 = timeWithoutML;
                if (d15.doubleValue() < d16) {
                    this.peakValueWithoutMl.put(name, Double.valueOf(d16));
                }
            }
        }
    }

    public final void processWithTime(String name, InterfaceC4339a processFn) {
        RunningAverage runningAverage;
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(processFn, "processFn");
        try {
            Long lValueOf = Long.valueOf(timeInMs(processFn));
            if (lValueOf.longValue() < 0 || (runningAverage = this.processingAvgsWithMl.get(name)) == null) {
                return;
            }
            runningAverage.add(lValueOf.longValue());
        } catch (HMSException e5) {
            HMSException hMSExceptionProcessingFailed = ErrorFactory.MediaPluginErrors.INSTANCE.ProcessingFailed(HMSAction.VIDEO_PLUGINS, "Failed during processing of plugin" + e5.getMessage());
            HMSLogger.m71137e(TAG, hMSExceptionProcessingFailed.toString());
            failure(name, hMSExceptionProcessingFailed);
            throw hMSExceptionProcessingFailed;
        }
    }

    public final void removed(String name) {
        AbstractC22676k.m65750j(name, "name");
        if (this.pluginAdded.containsKey(name)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l7 = this.addedTimestamps.get(name);
            AbstractC22676k.m65747g(l7);
            long jLongValue = (jCurrentTimeMillis - l7.longValue()) / ((long) 1000);
            Long l12 = this.initTime.get(name);
            RunningAverage runningAverage = this.processingAvgsWithMl.get(name);
            Double dValueOf = runningAverage != null ? Double.valueOf(runningAverage.getAvg()) : null;
            RunningAverage runningAverage2 = this.processingAvgsWithoutMl.get(name);
            Double dValueOf2 = runningAverage2 != null ? Double.valueOf(runningAverage2.getAvg()) : null;
            Integer num = this.pluginInputFrameRate.get(name);
            Integer num2 = this.pluginFrameRate.get(name);
            HMSLogger hMSLogger = HMSLogger.INSTANCE;
            StringBuilder sbM32000s = AbstractC11895b.m32000s("pluginName = ", name, jLongValue, ", duration = ");
            sbM32000s.append(", loadTime = ");
            sbM32000s.append(l12);
            sbM32000s.append(", avgProcesstimeWithMl = ");
            sbM32000s.append(dValueOf);
            sbM32000s.append(", avgProcesstimeWithoutMl = ");
            sbM32000s.append(dValueOf2);
            sbM32000s.append(", inputFR = ");
            sbM32000s.append(num);
            sbM32000s.append(", pluginFr = ");
            sbM32000s.append(num2);
            hMSLogger.m71139i(TAG, sbM32000s.toString());
            MediaPluginsAnalyticsFactory mediaPluginsAnalyticsFactory = MediaPluginsAnalyticsFactory.INSTANCE;
            long jLongValue2 = l12 != null ? l12.longValue() : 0L;
            double dDoubleValue = dValueOf != null ? dValueOf.doubleValue() : 0.0d;
            double dDoubleValue2 = dValueOf2 != null ? dValueOf2.doubleValue() : 0.0d;
            Double d3 = this.peakValueWithMl.get(name);
            double dDoubleValue3 = d3 != null ? d3.doubleValue() : 0.0d;
            Double d14 = this.peakValueWithoutMl.get(name);
            AnalyticsEvent analyticsEventStats = mediaPluginsAnalyticsFactory.stats(name, jLongValue, jLongValue2, dDoubleValue, dDoubleValue2, dDoubleValue3, d14 != null ? d14.doubleValue() : 0.0d, num != null ? num.intValue() : 0, num2 != null ? num2.intValue() : 0);
            hMSLogger.m71139i(TAG, "event got = " + analyticsEventStats + ", sending to service " + this.analyticsEventsService);
            this.analyticsEventsService.queue(analyticsEventStats).flush();
            clean(name);
        }
    }

    public final void setAnalyticsEventsService(AnalyticsEventsService analyticsEventsService) {
        AbstractC22676k.m65750j(analyticsEventsService, "<set-?>");
        this.analyticsEventsService = analyticsEventsService;
    }

    public final long timeInMs(InterfaceC4339a processFn) {
        AbstractC22676k.m65750j(processFn, "processFn");
        long jCurrentTimeMillis = System.currentTimeMillis();
        processFn.invoke();
        return System.currentTimeMillis() - jCurrentTimeMillis;
    }
}
