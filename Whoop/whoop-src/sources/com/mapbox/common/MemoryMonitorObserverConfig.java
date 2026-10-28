package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class MemoryMonitorObserverConfig implements Serializable {
    private final long maxUsedMemoryPercentThreshold;
    private final long maxUsedMemoryThreshold;
    private final boolean sendAppRunningInBackgroundNotification;
    private final long thresholdReachedNotificationTimeout;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        private boolean sendAppRunningInBackgroundNotification = true;
        private long maxUsedMemoryPercentThreshold = 75;
        private long maxUsedMemoryThreshold = 0;
        private long thresholdReachedNotificationTimeout = 300000;

        public MemoryMonitorObserverConfig build() {
            return new MemoryMonitorObserverConfig(this.sendAppRunningInBackgroundNotification, this.maxUsedMemoryPercentThreshold, this.maxUsedMemoryThreshold, this.thresholdReachedNotificationTimeout);
        }

        public Builder maxUsedMemoryPercentThreshold(long j7) {
            this.maxUsedMemoryPercentThreshold = j7;
            return this;
        }

        public Builder maxUsedMemoryThreshold(long j7) {
            this.maxUsedMemoryThreshold = j7;
            return this;
        }

        public Builder sendAppRunningInBackgroundNotification(boolean z4) {
            this.sendAppRunningInBackgroundNotification = z4;
            return this;
        }

        public Builder thresholdReachedNotificationTimeout(long j7) {
            this.thresholdReachedNotificationTimeout = j7;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MemoryMonitorObserverConfig.class != obj.getClass()) {
            return false;
        }
        MemoryMonitorObserverConfig memoryMonitorObserverConfig = (MemoryMonitorObserverConfig) obj;
        return this.sendAppRunningInBackgroundNotification == memoryMonitorObserverConfig.sendAppRunningInBackgroundNotification && this.maxUsedMemoryPercentThreshold == memoryMonitorObserverConfig.maxUsedMemoryPercentThreshold && this.maxUsedMemoryThreshold == memoryMonitorObserverConfig.maxUsedMemoryThreshold && this.thresholdReachedNotificationTimeout == memoryMonitorObserverConfig.thresholdReachedNotificationTimeout;
    }

    public long getMaxUsedMemoryPercentThreshold() {
        return this.maxUsedMemoryPercentThreshold;
    }

    public long getMaxUsedMemoryThreshold() {
        return this.maxUsedMemoryThreshold;
    }

    public boolean getSendAppRunningInBackgroundNotification() {
        return this.sendAppRunningInBackgroundNotification;
    }

    public long getThresholdReachedNotificationTimeout() {
        return this.thresholdReachedNotificationTimeout;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.sendAppRunningInBackgroundNotification), Long.valueOf(this.maxUsedMemoryPercentThreshold), Long.valueOf(this.maxUsedMemoryThreshold), Long.valueOf(this.thresholdReachedNotificationTimeout));
    }

    public Builder toBuilder() {
        return new Builder().sendAppRunningInBackgroundNotification(this.sendAppRunningInBackgroundNotification).maxUsedMemoryPercentThreshold(this.maxUsedMemoryPercentThreshold).maxUsedMemoryThreshold(this.maxUsedMemoryThreshold).thresholdReachedNotificationTimeout(this.thresholdReachedNotificationTimeout);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[sendAppRunningInBackgroundNotification: ");
        sb4.append(RecordUtils.fieldToString(Boolean.valueOf(this.sendAppRunningInBackgroundNotification)));
        sb4.append(", maxUsedMemoryPercentThreshold: ");
        AbstractC3855a.m11836t(this.maxUsedMemoryPercentThreshold, ", maxUsedMemoryThreshold: ", sb4);
        AbstractC3855a.m11836t(this.maxUsedMemoryThreshold, ", thresholdReachedNotificationTimeout: ", sb4);
        sb4.append(RecordUtils.fieldToString(Long.valueOf(this.thresholdReachedNotificationTimeout)));
        sb4.append("]");
        return sb4.toString();
    }

    private MemoryMonitorObserverConfig(boolean z4, long j7, long j13, long j14) {
        this.sendAppRunningInBackgroundNotification = z4;
        this.maxUsedMemoryPercentThreshold = j7;
        this.maxUsedMemoryThreshold = j13;
        this.thresholdReachedNotificationTimeout = j14;
    }

    private MemoryMonitorObserverConfig() {
        this.sendAppRunningInBackgroundNotification = true;
        this.maxUsedMemoryPercentThreshold = 75L;
        this.maxUsedMemoryThreshold = 0L;
        this.thresholdReachedNotificationTimeout = 300000L;
    }
}
