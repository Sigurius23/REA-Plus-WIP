package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class RenderFrameFinished implements Serializable {
    private final boolean needsRepaint;
    private final boolean placementChanged;
    private final RenderModeType renderMode;
    private final EventTimeInterval timeInterval;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public RenderFrameFinished(RenderModeType renderModeType, boolean z4, boolean z13, EventTimeInterval eventTimeInterval) {
        this.renderMode = renderModeType;
        this.needsRepaint = z4;
        this.placementChanged = z13;
        this.timeInterval = eventTimeInterval;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RenderFrameFinished.class != obj.getClass()) {
            return false;
        }
        RenderFrameFinished renderFrameFinished = (RenderFrameFinished) obj;
        return Objects.equals(this.renderMode, renderFrameFinished.renderMode) && this.needsRepaint == renderFrameFinished.needsRepaint && this.placementChanged == renderFrameFinished.placementChanged && Objects.equals(this.timeInterval, renderFrameFinished.timeInterval);
    }

    public boolean getNeedsRepaint() {
        return this.needsRepaint;
    }

    public boolean getPlacementChanged() {
        return this.placementChanged;
    }

    public RenderModeType getRenderMode() {
        return this.renderMode;
    }

    public EventTimeInterval getTimeInterval() {
        return this.timeInterval;
    }

    public int hashCode() {
        return Objects.hash(this.renderMode, Boolean.valueOf(this.needsRepaint), Boolean.valueOf(this.placementChanged), this.timeInterval);
    }

    public String toString() {
        return "[renderMode: " + RecordUtils.fieldToString(this.renderMode) + ", needsRepaint: " + RecordUtils.fieldToString(Boolean.valueOf(this.needsRepaint)) + ", placementChanged: " + RecordUtils.fieldToString(Boolean.valueOf(this.placementChanged)) + ", timeInterval: " + RecordUtils.fieldToString(this.timeInterval) + "]";
    }
}
