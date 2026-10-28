package live.hms.video.sdk.models;

import android.content.Context;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23454a0;
import live.hms.video.events.AnalyticsEvent;
import live.hms.video.events.AnalyticsEventFactory;
import live.hms.video.events.AnalyticsEventsService;
import live.hms.video.network.HMSNetworkManager;
import live.hms.video.utils.HMSLogger;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ[\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012j\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014`\u00152\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001f\u0010 J \u0010#\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\rH\u0096@¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0010H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010*\u001a\u00020\u0018H\u0000¢\u0006\u0004\b)\u0010\u001aJ\u0017\u0010-\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0010H\u0000¢\u0006\u0004\b,\u0010'J\u000f\u0010.\u001a\u00020\u0018H\u0016¢\u0006\u0004\b.\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00101R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u00103\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0013078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0013078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109¨\u0006;"}, m65681d2 = {"Llive/hms/video/sdk/models/PerformanceMeasurement;", "Ljava/io/Closeable;", "Llive/hms/video/sdk/models/IRetryAttemptTracking;", "Llive/hms/video/events/AnalyticsEventsService;", "analyticsEventsService", "Landroid/content/Context;", "applicationContext", "Llive/hms/video/network/HMSNetworkManager;", "hmsNetworkManager", "<init>", "(Llive/hms/video/events/AnalyticsEventsService;Landroid/content/Context;Llive/hms/video/network/HMSNetworkManager;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "Llive/hms/video/sdk/models/EVENT_TYPE;", "", "startTimes", "stopTimes", "", "isJoin", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getPropertiesFromTimes", "(Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/concurrent/ConcurrentHashMap;Z)Ljava/util/HashMap;", "Ll83/a0;", "clearValues", "()V", "eventType", "start$lib_release", "(Llive/hms/video/sdk/models/EVENT_TYPE;)V", "start", "end$lib_release", "(Llive/hms/video/sdk/models/EVENT_TYPE;)Llive/hms/video/sdk/models/PerformanceMeasurement;", "end", "times", "numberedValue", "(Llive/hms/video/sdk/models/EVENT_TYPE;JLq83/d;)Ljava/lang/Object;", "success", "fireJoinPerformanceMeasurementEvent$lib_release", "(Z)V", "fireJoinPerformanceMeasurementEvent", "startPreview$lib_release", "startPreview", "eventSuccessful", "firePreviewPerformanceMeasurementEvent$lib_release", "firePreviewPerformanceMeasurementEvent", "close", "Llive/hms/video/events/AnalyticsEventsService;", "Llive/hms/video/network/HMSNetworkManager;", "Ljava/util/concurrent/ConcurrentHashMap;", "numberEvents", "previewStartTime", "J", "isPreviewCalled", "Z", "Ljava/util/HashSet;", "eventsThatWereEnded", "Ljava/util/HashSet;", "eventsThatWereStarted", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class PerformanceMeasurement implements Closeable, IRetryAttemptTracking {
    private AnalyticsEventsService analyticsEventsService;
    private final HashSet<String> eventsThatWereEnded;
    private final HashSet<String> eventsThatWereStarted;
    private final HMSNetworkManager hmsNetworkManager;
    private boolean isPreviewCalled;
    private final ConcurrentHashMap<String, Long> numberEvents;
    private long previewStartTime;
    private final ConcurrentHashMap<EVENT_TYPE, Long> startTimes;
    private final ConcurrentHashMap<EVENT_TYPE, Long> stopTimes;

    public PerformanceMeasurement(AnalyticsEventsService analyticsEventsService, Context applicationContext, HMSNetworkManager hmsNetworkManager) {
        AbstractC22676k.m65750j(analyticsEventsService, "analyticsEventsService");
        AbstractC22676k.m65750j(applicationContext, "applicationContext");
        AbstractC22676k.m65750j(hmsNetworkManager, "hmsNetworkManager");
        this.analyticsEventsService = analyticsEventsService;
        this.hmsNetworkManager = hmsNetworkManager;
        this.startTimes = new ConcurrentHashMap<>();
        this.stopTimes = new ConcurrentHashMap<>();
        this.numberEvents = new ConcurrentHashMap<>();
        this.eventsThatWereEnded = new HashSet<>();
        this.eventsThatWereStarted = new HashSet<>();
    }

    private final void clearValues() {
        this.startTimes.clear();
        this.stopTimes.clear();
        this.numberEvents.clear();
    }

    private final HashMap<String, Object> getPropertiesFromTimes(ConcurrentHashMap<EVENT_TYPE, Long> startTimes, ConcurrentHashMap<EVENT_TYPE, Long> stopTimes, boolean isJoin) {
        if (isJoin) {
            EVENT_TYPE event_type = EVENT_TYPE.PREVIEW_CALL;
            startTimes.remove(event_type);
            stopTimes.remove(event_type);
        }
        HashMap<String, Object> map = new HashMap<>();
        ArrayList arrayList = new ArrayList(startTimes.size());
        for (Map.Entry<EVENT_TYPE, Long> entry : startTimes.entrySet()) {
            Long l7 = stopTimes.get(entry.getKey());
            Long lValueOf = l7 != null ? Long.valueOf(l7.longValue() - entry.getValue().longValue()) : null;
            if (lValueOf != null && lValueOf.longValue() >= 0) {
                map.put(entry.getKey().getValue(), lValueOf);
            }
            arrayList.add(C23454a0.f92919a);
        }
        map.putAll(this.numberEvents);
        return map;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.isPreviewCalled = false;
        clearValues();
    }

    public final PerformanceMeasurement end$lib_release(EVENT_TYPE eventType) {
        AbstractC22676k.m65750j(eventType, "eventType");
        this.stopTimes.put(eventType, Long.valueOf(System.currentTimeMillis()));
        return this;
    }

    public final void fireJoinPerformanceMeasurementEvent$lib_release(boolean success) {
        if (this.startTimes.containsKey(EVENT_TYPE.JOIN_CALL)) {
            HashMap<String, Object> propertiesFromTimes = getPropertiesFromTimes(this.startTimes, this.stopTimes, true);
            propertiesFromTimes.put("is_preview_called", Boolean.valueOf(this.isPreviewCalled));
            propertiesFromTimes.put("network_type", this.hmsNetworkManager.getConnectedNetworkType());
            HMSLogger.m71136d("PerformanceJoinEvents", "Sending event: " + propertiesFromTimes);
            this.analyticsEventsService.queue(AnalyticsEventFactory.INSTANCE.joinStatusEvent(success, propertiesFromTimes)).flush();
        } else {
            HMSLogger.m71137e("PerformanceJoinEvents", "Throwing away a flush since the measurement was wrong by not having a time at all");
        }
        clearValues();
    }

    public final void firePreviewPerformanceMeasurementEvent$lib_release(boolean eventSuccessful) {
        ConcurrentHashMap<EVENT_TYPE, Long> concurrentHashMap = this.stopTimes;
        EVENT_TYPE event_type = EVENT_TYPE.PREVIEW_CALL;
        concurrentHashMap.put(event_type, Long.valueOf(System.currentTimeMillis()));
        this.startTimes.put(event_type, Long.valueOf(this.previewStartTime));
        AnalyticsEvent analyticsEventPreviewStatusEvent = AnalyticsEventFactory.INSTANCE.previewStatusEvent(eventSuccessful, getPropertiesFromTimes(this.startTimes, this.stopTimes, false));
        this.analyticsEventsService.queue(analyticsEventPreviewStatusEvent).flush();
        HMSLogger.m71136d("PerformanceJoinEvents", "Fire preview measurement: " + analyticsEventPreviewStatusEvent);
    }

    @Override // live.hms.video.sdk.models.IRetryAttemptTracking
    public Object numberedValue(EVENT_TYPE event_type, long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.numberEvents.put(event_type.getValue(), new Long(j7));
        return C23454a0.f92919a;
    }

    public final void start$lib_release(EVENT_TYPE eventType) {
        AbstractC22676k.m65750j(eventType, "eventType");
        this.startTimes.put(eventType, Long.valueOf(System.currentTimeMillis()));
    }

    public final void startPreview$lib_release() {
        this.previewStartTime = System.currentTimeMillis();
        this.isPreviewCalled = true;
    }
}
