package hu0;

import java.nio.ByteBuffer;
import lu0.InterfaceC24745a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hu0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0015\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001f"}, m65681d2 = {"Lhu0/d;", "Llu0/a;", "", "timestamp", "", "packetRevision", "Ljava/nio/ByteBuffer;", "packetData", "versionId", "<init>", "(JILjava/nio/ByteBuffer;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getTimestamp", "()J", "b", "I", "c", "Ljava/nio/ByteBuffer;", "()Ljava/nio/ByteBuffer;", "d", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17643d implements InterfaceC24745a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int packetRevision;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ByteBuffer packetData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int versionId;

    public C17643d(long j7, int i13, ByteBuffer packetData, int i14) {
        AbstractC22676k.m65750j(packetData, "packetData");
        this.timestamp = j7;
        this.packetRevision = i13;
        this.packetData = packetData;
        this.versionId = i14;
    }

    @Override // lu0.InterfaceC24745a
    /* JADX INFO: renamed from: a, reason: from getter */
    public ByteBuffer getPacketData() {
        return this.packetData;
    }

    @Override // lu0.InterfaceC24745a
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getVersionId() {
        return this.versionId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getPacketRevision() {
        return this.packetRevision;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17643d)) {
            return false;
        }
        C17643d c17643d = (C17643d) other;
        return this.timestamp == c17643d.timestamp && this.packetRevision == c17643d.packetRevision && AbstractC22676k.m65745e(this.packetData, c17643d.packetData) && this.versionId == c17643d.versionId;
    }

    @Override // lu0.InterfaceC24745a
    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Integer.hashCode(this.versionId) + ((this.packetData.hashCode() + AbstractC11266d.m30448b(this.packetRevision, Long.hashCode(this.timestamp) * 31, 31)) * 31);
    }

    public String toString() {
        return "SensorDataPacketDto(timestamp=" + this.timestamp + ", packetRevision=" + this.packetRevision + ", packetData=" + this.packetData + ", versionId=" + this.versionId + ")";
    }
}
