package com.whoop.data.local.room.entity;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/data/local/room/entity/HeartRateWithTimestamp;", "", "heart_rate", "", "timestamp_utc", "", "<init>", "(IJ)V", "getHeart_rate", "()I", "getTimestamp_utc", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class HeartRateWithTimestamp {
    private final int heart_rate;
    private final long timestamp_utc;

    public HeartRateWithTimestamp(int i13, long j7) {
        this.heart_rate = i13;
        this.timestamp_utc = j7;
    }

    public static /* synthetic */ HeartRateWithTimestamp copy$default(HeartRateWithTimestamp heartRateWithTimestamp, int i13, long j7, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = heartRateWithTimestamp.heart_rate;
        }
        if ((i14 & 2) != 0) {
            j7 = heartRateWithTimestamp.timestamp_utc;
        }
        return heartRateWithTimestamp.copy(i13, j7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHeart_rate() {
        return this.heart_rate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp_utc() {
        return this.timestamp_utc;
    }

    public final HeartRateWithTimestamp copy(int heart_rate, long timestamp_utc) {
        return new HeartRateWithTimestamp(heart_rate, timestamp_utc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartRateWithTimestamp)) {
            return false;
        }
        HeartRateWithTimestamp heartRateWithTimestamp = (HeartRateWithTimestamp) other;
        return this.heart_rate == heartRateWithTimestamp.heart_rate && this.timestamp_utc == heartRateWithTimestamp.timestamp_utc;
    }

    public final int getHeart_rate() {
        return this.heart_rate;
    }

    public final long getTimestamp_utc() {
        return this.timestamp_utc;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp_utc) + (Integer.hashCode(this.heart_rate) * 31);
    }

    public String toString() {
        return "HeartRateWithTimestamp(heart_rate=" + this.heart_rate + ", timestamp_utc=" + this.timestamp_utc + ")";
    }
}
