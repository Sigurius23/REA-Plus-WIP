package com.whoop.data.local.room.entity.connectivity;

import java.nio.ByteBuffer;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;", "", "packetRevision", "", "timestamp", "", "packetData", "Ljava/nio/ByteBuffer;", "versionId", "<init>", "(IJLjava/nio/ByteBuffer;I)V", "getPacketRevision", "()I", "getTimestamp", "()J", "getPacketData", "()Ljava/nio/ByteBuffer;", "getVersionId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class CachedMetricsDataDto {
    private final ByteBuffer packetData;
    private final int packetRevision;
    private final long timestamp;
    private final int versionId;

    public CachedMetricsDataDto(int i13, long j7, ByteBuffer packetData, int i14) {
        AbstractC22676k.m65750j(packetData, "packetData");
        this.packetRevision = i13;
        this.timestamp = j7;
        this.packetData = packetData;
        this.versionId = i14;
    }

    public static /* synthetic */ CachedMetricsDataDto copy$default(CachedMetricsDataDto cachedMetricsDataDto, int i13, long j7, ByteBuffer byteBuffer, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = cachedMetricsDataDto.packetRevision;
        }
        if ((i15 & 2) != 0) {
            j7 = cachedMetricsDataDto.timestamp;
        }
        if ((i15 & 4) != 0) {
            byteBuffer = cachedMetricsDataDto.packetData;
        }
        if ((i15 & 8) != 0) {
            i14 = cachedMetricsDataDto.versionId;
        }
        return cachedMetricsDataDto.copy(i13, j7, byteBuffer, i14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPacketRevision() {
        return this.packetRevision;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ByteBuffer getPacketData() {
        return this.packetData;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getVersionId() {
        return this.versionId;
    }

    public final CachedMetricsDataDto copy(int packetRevision, long timestamp, ByteBuffer packetData, int versionId) {
        AbstractC22676k.m65750j(packetData, "packetData");
        return new CachedMetricsDataDto(packetRevision, timestamp, packetData, versionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachedMetricsDataDto)) {
            return false;
        }
        CachedMetricsDataDto cachedMetricsDataDto = (CachedMetricsDataDto) other;
        return this.packetRevision == cachedMetricsDataDto.packetRevision && this.timestamp == cachedMetricsDataDto.timestamp && AbstractC22676k.m65745e(this.packetData, cachedMetricsDataDto.packetData) && this.versionId == cachedMetricsDataDto.versionId;
    }

    public final ByteBuffer getPacketData() {
        return this.packetData;
    }

    public final int getPacketRevision() {
        return this.packetRevision;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getVersionId() {
        return this.versionId;
    }

    public int hashCode() {
        return Integer.hashCode(this.versionId) + ((this.packetData.hashCode() + AbstractC11266d.m30451e(Integer.hashCode(this.packetRevision) * 31, this.timestamp, 31)) * 31);
    }

    public String toString() {
        return "CachedMetricsDataDto(packetRevision=" + this.packetRevision + ", timestamp=" + this.timestamp + ", packetData=" + this.packetData + ", versionId=" + this.versionId + ")";
    }
}
