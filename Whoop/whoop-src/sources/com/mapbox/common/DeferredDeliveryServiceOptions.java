package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class DeferredDeliveryServiceOptions implements Serializable {
    private final long batchFlushTimeout;
    private final long batchLengthToFlush;
    private final String dataStoragePath;
    private final Long maxStorageUsage;
    private final long memoryQueueFlushTimeout;
    private final long memoryQueueLengthToFlush;
    private final Long memoryQueueMaxLength;
    private final DeferredDeliveryOverflowPolicy memoryQueueOverflowPolicy;
    private final long persistentQueueFlushTimeout;
    private final long persistentQueueLengthToFlush;
    private final Long persistentQueueMaxLength;
    private final DeferredDeliveryOverflowPolicy persistentQueueOverflowPolicy;
    private final DeferredDeliveryOverflowPolicy storageOverflowPolicy;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public DeferredDeliveryServiceOptions(long j7, long j13, Long l7, long j14, long j15, DeferredDeliveryOverflowPolicy deferredDeliveryOverflowPolicy, Long l12, long j16, long j17, DeferredDeliveryOverflowPolicy deferredDeliveryOverflowPolicy2, String str, Long l13, DeferredDeliveryOverflowPolicy deferredDeliveryOverflowPolicy3) {
        this.batchLengthToFlush = j7;
        this.batchFlushTimeout = j13;
        this.memoryQueueMaxLength = l7;
        this.memoryQueueLengthToFlush = j14;
        this.memoryQueueFlushTimeout = j15;
        this.memoryQueueOverflowPolicy = deferredDeliveryOverflowPolicy;
        this.persistentQueueMaxLength = l12;
        this.persistentQueueLengthToFlush = j16;
        this.persistentQueueFlushTimeout = j17;
        this.persistentQueueOverflowPolicy = deferredDeliveryOverflowPolicy2;
        this.dataStoragePath = str;
        this.maxStorageUsage = l13;
        this.storageOverflowPolicy = deferredDeliveryOverflowPolicy3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeferredDeliveryServiceOptions deferredDeliveryServiceOptions = (DeferredDeliveryServiceOptions) obj;
        return this.batchLengthToFlush == deferredDeliveryServiceOptions.batchLengthToFlush && this.batchFlushTimeout == deferredDeliveryServiceOptions.batchFlushTimeout && Objects.equals(this.memoryQueueMaxLength, deferredDeliveryServiceOptions.memoryQueueMaxLength) && this.memoryQueueLengthToFlush == deferredDeliveryServiceOptions.memoryQueueLengthToFlush && this.memoryQueueFlushTimeout == deferredDeliveryServiceOptions.memoryQueueFlushTimeout && Objects.equals(this.memoryQueueOverflowPolicy, deferredDeliveryServiceOptions.memoryQueueOverflowPolicy) && Objects.equals(this.persistentQueueMaxLength, deferredDeliveryServiceOptions.persistentQueueMaxLength) && this.persistentQueueLengthToFlush == deferredDeliveryServiceOptions.persistentQueueLengthToFlush && this.persistentQueueFlushTimeout == deferredDeliveryServiceOptions.persistentQueueFlushTimeout && Objects.equals(this.persistentQueueOverflowPolicy, deferredDeliveryServiceOptions.persistentQueueOverflowPolicy) && Objects.equals(this.dataStoragePath, deferredDeliveryServiceOptions.dataStoragePath) && Objects.equals(this.maxStorageUsage, deferredDeliveryServiceOptions.maxStorageUsage) && Objects.equals(this.storageOverflowPolicy, deferredDeliveryServiceOptions.storageOverflowPolicy);
    }

    public long getBatchFlushTimeout() {
        return this.batchFlushTimeout;
    }

    public long getBatchLengthToFlush() {
        return this.batchLengthToFlush;
    }

    public String getDataStoragePath() {
        return this.dataStoragePath;
    }

    public Long getMaxStorageUsage() {
        return this.maxStorageUsage;
    }

    public long getMemoryQueueFlushTimeout() {
        return this.memoryQueueFlushTimeout;
    }

    public long getMemoryQueueLengthToFlush() {
        return this.memoryQueueLengthToFlush;
    }

    public Long getMemoryQueueMaxLength() {
        return this.memoryQueueMaxLength;
    }

    public DeferredDeliveryOverflowPolicy getMemoryQueueOverflowPolicy() {
        return this.memoryQueueOverflowPolicy;
    }

    public long getPersistentQueueFlushTimeout() {
        return this.persistentQueueFlushTimeout;
    }

    public long getPersistentQueueLengthToFlush() {
        return this.persistentQueueLengthToFlush;
    }

    public Long getPersistentQueueMaxLength() {
        return this.persistentQueueMaxLength;
    }

    public DeferredDeliveryOverflowPolicy getPersistentQueueOverflowPolicy() {
        return this.persistentQueueOverflowPolicy;
    }

    public DeferredDeliveryOverflowPolicy getStorageOverflowPolicy() {
        return this.storageOverflowPolicy;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.batchLengthToFlush), Long.valueOf(this.batchFlushTimeout), this.memoryQueueMaxLength, Long.valueOf(this.memoryQueueLengthToFlush), Long.valueOf(this.memoryQueueFlushTimeout), this.memoryQueueOverflowPolicy, this.persistentQueueMaxLength, Long.valueOf(this.persistentQueueLengthToFlush), Long.valueOf(this.persistentQueueFlushTimeout), this.persistentQueueOverflowPolicy, this.dataStoragePath, this.maxStorageUsage, this.storageOverflowPolicy);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[batchLengthToFlush: ");
        AbstractC3855a.m11836t(this.batchLengthToFlush, ", batchFlushTimeout: ", sb4);
        AbstractC3855a.m11836t(this.batchFlushTimeout, ", memoryQueueMaxLength: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.memoryQueueMaxLength));
        sb4.append(", memoryQueueLengthToFlush: ");
        AbstractC3855a.m11836t(this.memoryQueueLengthToFlush, ", memoryQueueFlushTimeout: ", sb4);
        AbstractC3855a.m11836t(this.memoryQueueFlushTimeout, ", memoryQueueOverflowPolicy: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.memoryQueueOverflowPolicy));
        sb4.append(", persistentQueueMaxLength: ");
        sb4.append(RecordUtils.fieldToString(this.persistentQueueMaxLength));
        sb4.append(", persistentQueueLengthToFlush: ");
        AbstractC3855a.m11836t(this.persistentQueueLengthToFlush, ", persistentQueueFlushTimeout: ", sb4);
        AbstractC3855a.m11836t(this.persistentQueueFlushTimeout, ", persistentQueueOverflowPolicy: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.persistentQueueOverflowPolicy));
        sb4.append(", dataStoragePath: ");
        AbstractC3855a.m11838v(this.dataStoragePath, ", maxStorageUsage: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.maxStorageUsage));
        sb4.append(", storageOverflowPolicy: ");
        sb4.append(RecordUtils.fieldToString(this.storageOverflowPolicy));
        sb4.append("]");
        return sb4.toString();
    }

    public DeferredDeliveryServiceOptions(Long l7, Long l12, String str, Long l13) {
        this.memoryQueueMaxLength = l7;
        this.persistentQueueMaxLength = l12;
        this.dataStoragePath = str;
        this.maxStorageUsage = l13;
        this.batchLengthToFlush = 180L;
        this.batchFlushTimeout = 180000L;
        this.memoryQueueLengthToFlush = 180L;
        this.memoryQueueFlushTimeout = 180000L;
        DeferredDeliveryOverflowPolicy deferredDeliveryOverflowPolicy = DeferredDeliveryOverflowPolicy.RETIRE_OLDEST;
        this.memoryQueueOverflowPolicy = deferredDeliveryOverflowPolicy;
        this.persistentQueueLengthToFlush = 180L;
        this.persistentQueueFlushTimeout = 180000L;
        this.persistentQueueOverflowPolicy = deferredDeliveryOverflowPolicy;
        this.storageOverflowPolicy = DeferredDeliveryOverflowPolicy.DISCARD_INCOMING;
    }
}
