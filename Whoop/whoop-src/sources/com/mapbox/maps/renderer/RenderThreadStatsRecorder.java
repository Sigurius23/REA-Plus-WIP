package com.mapbox.maps.renderer;

import android.os.SystemClock;
import com.mapbox.maps.MapboxExperimental;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\u0003J\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;", "", "<init>", "()V", "", "", "sortedValues", "percentile", "percentileOfSortedList", "(Ljava/util/List;D)Ljava/lang/Double;", "Ll83/a0;", "start", "frameTime", "", "droppedFrames", "addFrameStats$maps_sdk_release", "(DI)V", "addFrameStats", "Lcom/mapbox/maps/renderer/RenderThreadStats;", "end", "()Lcom/mapbox/maps/renderer/RenderThreadStats;", "", "startTime", "J", "totalDroppedFrames", "", "frameTimeList", "Ljava/util/List;", "", "isRecording", "()Z", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@MapboxExperimental
public final class RenderThreadStatsRecorder {
    private final List<Double> frameTimeList = new ArrayList();
    private long startTime;
    private long totalDroppedFrames;

    private final Double percentileOfSortedList(List<Double> sortedValues, double percentile) {
        return (Double) AbstractC25265s.m74102I0(((int) Math.ceil((percentile / 100.0d) * ((double) sortedValues.size()))) - 1, sortedValues);
    }

    public final void addFrameStats$maps_sdk_release(double frameTime, int droppedFrames) {
        this.totalDroppedFrames += (long) droppedFrames;
        this.frameTimeList.add(Double.valueOf(frameTime));
    }

    public final RenderThreadStats end() {
        if (!isRecording()) {
            throw new RuntimeException("RendererStatRecorder: start() was not called!");
        }
        List<Double> listM74093D1 = AbstractC25265s.m74093D1(this.frameTimeList);
        List<Double> listM74150t1 = AbstractC25265s.m74150t1(this.frameTimeList);
        RenderThreadStats renderThreadStatsBuild = new RenderThreadStats.Builder().setTotalTime(SystemClock.elapsedRealtime() - this.startTime).setTotalFrames(((long) this.frameTimeList.size()) + this.totalDroppedFrames).setTotalDroppedFrames(this.totalDroppedFrames).setFrameTimeList(listM74093D1).setPercentile50(percentileOfSortedList(listM74150t1, 50.0d)).setPercentile90(percentileOfSortedList(listM74150t1, 90.0d)).setPercentile95(percentileOfSortedList(listM74150t1, 95.0d)).setPercentile99(percentileOfSortedList(listM74150t1, 99.0d)).build();
        this.startTime = 0L;
        this.totalDroppedFrames = 0L;
        this.frameTimeList.clear();
        return renderThreadStatsBuild;
    }

    public final boolean isRecording() {
        return this.startTime != 0;
    }

    public final void start() {
        if (isRecording()) {
            throw new RuntimeException("RendererStatRecorder: end() was not called after previous start()!");
        }
        this.startTime = SystemClock.elapsedRealtime();
    }
}
