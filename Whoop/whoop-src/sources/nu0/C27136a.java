package nu0;

import java.nio.ByteBuffer;
import lu0.InterfaceC24745a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nu0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b\u001d\u0010\u0010¨\u0006!"}, m65681d2 = {"Lnu0/a;", "Llu0/a;", "", "packetRevision", "", "timestamp", "Ljava/nio/ByteBuffer;", "packetData", "versionId", "frameRevision", "<init>", "(IJLjava/nio/ByteBuffer;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "J", "getTimestamp", "()J", "c", "Ljava/nio/ByteBuffer;", "()Ljava/nio/ByteBuffer;", "e", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27136a implements InterfaceC24745a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int packetRevision;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long timestamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ByteBuffer packetData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int versionId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int frameRevision;

    public C27136a(int i13, long j7, ByteBuffer packetData, int i14, int i15) {
        AbstractC22676k.m65750j(packetData, "packetData");
        this.packetRevision = i13;
        this.timestamp = j7;
        this.packetData = packetData;
        this.versionId = i14;
        this.frameRevision = i15;
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
    public final int getFrameRevision() {
        return this.frameRevision;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getPacketRevision() {
        return this.packetRevision;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27136a)) {
            return false;
        }
        C27136a c27136a = (C27136a) other;
        return this.packetRevision == c27136a.packetRevision && this.timestamp == c27136a.timestamp && AbstractC22676k.m65745e(this.packetData, c27136a.packetData) && this.versionId == c27136a.versionId && this.frameRevision == c27136a.frameRevision;
    }

    @Override // lu0.InterfaceC24745a
    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Integer.hashCode(this.frameRevision) + AbstractC11266d.m30448b(this.versionId, (this.packetData.hashCode() + AbstractC11266d.m30451e(Integer.hashCode(this.packetRevision) * 31, this.timestamp, 31)) * 31, 31);
    }

    public String toString() {
        return "MetricsDataDto(packetRevision=" + this.packetRevision + ", timestamp=" + this.timestamp + ", packetData=" + this.packetData + ", versionId=" + this.versionId + ", frameRevision=" + this.frameRevision + ")";
    }
}
