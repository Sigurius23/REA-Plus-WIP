package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class MemoryMonitorStatus implements Serializable {
    private final MemoryMonitorState state;
    private final long totalMemory;
    private final long usedMemory;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public MemoryMonitorStatus(MemoryMonitorState memoryMonitorState, long j7, long j13) {
        this.state = memoryMonitorState;
        this.totalMemory = j7;
        this.usedMemory = j13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MemoryMonitorStatus.class != obj.getClass()) {
            return false;
        }
        MemoryMonitorStatus memoryMonitorStatus = (MemoryMonitorStatus) obj;
        return Objects.equals(this.state, memoryMonitorStatus.state) && this.totalMemory == memoryMonitorStatus.totalMemory && this.usedMemory == memoryMonitorStatus.usedMemory;
    }

    public MemoryMonitorState getState() {
        return this.state;
    }

    public long getTotalMemory() {
        return this.totalMemory;
    }

    public long getUsedMemory() {
        return this.usedMemory;
    }

    public int hashCode() {
        return Objects.hash(this.state, Long.valueOf(this.totalMemory), Long.valueOf(this.usedMemory));
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[state: ");
        sb4.append(RecordUtils.fieldToString(this.state));
        sb4.append(", totalMemory: ");
        AbstractC3855a.m11836t(this.totalMemory, ", usedMemory: ", sb4);
        sb4.append(RecordUtils.fieldToString(Long.valueOf(this.usedMemory)));
        sb4.append("]");
        return sb4.toString();
    }
}
