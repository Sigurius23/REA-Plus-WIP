package live.hms.video.sdk;

import java.util.ArrayList;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J7\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000e¨\u0006#"}, m65681d2 = {"Llive/hms/video/sdk/PublishConnection;", "", "bytesSent", "", "availableOutgoingBitrates", "", "", "packetsSent", "packetLoss", "<init>", "(JLjava/util/List;JJ)V", "getBytesSent", "()J", "setBytesSent", "(J)V", "getAvailableOutgoingBitrates", "()Ljava/util/List;", "setAvailableOutgoingBitrates", "(Ljava/util/List;)V", "getPacketsSent", "setPacketsSent", "getPacketLoss", "setPacketLoss", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PublishConnection {
    private List<Double> availableOutgoingBitrates;
    private long bytesSent;
    private long packetLoss;
    private long packetsSent;

    public PublishConnection() {
        this(0L, null, 0L, 0L, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PublishConnection copy$default(PublishConnection publishConnection, long j7, List list, long j13, long j14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = publishConnection.bytesSent;
        }
        long j15 = j7;
        if ((i13 & 2) != 0) {
            list = publishConnection.availableOutgoingBitrates;
        }
        List list2 = list;
        if ((i13 & 4) != 0) {
            j13 = publishConnection.packetsSent;
        }
        long j16 = j13;
        if ((i13 & 8) != 0) {
            j14 = publishConnection.packetLoss;
        }
        return publishConnection.copy(j15, list2, j16, j14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getBytesSent() {
        return this.bytesSent;
    }

    public final List<Double> component2() {
        return this.availableOutgoingBitrates;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPacketsSent() {
        return this.packetsSent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPacketLoss() {
        return this.packetLoss;
    }

    public final PublishConnection copy(long bytesSent, List<Double> availableOutgoingBitrates, long packetsSent, long packetLoss) {
        AbstractC22676k.m65750j(availableOutgoingBitrates, "availableOutgoingBitrates");
        return new PublishConnection(bytesSent, availableOutgoingBitrates, packetsSent, packetLoss);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublishConnection)) {
            return false;
        }
        PublishConnection publishConnection = (PublishConnection) other;
        return this.bytesSent == publishConnection.bytesSent && AbstractC22676k.m65745e(this.availableOutgoingBitrates, publishConnection.availableOutgoingBitrates) && this.packetsSent == publishConnection.packetsSent && this.packetLoss == publishConnection.packetLoss;
    }

    public final List<Double> getAvailableOutgoingBitrates() {
        return this.availableOutgoingBitrates;
    }

    public final long getBytesSent() {
        return this.bytesSent;
    }

    public final long getPacketLoss() {
        return this.packetLoss;
    }

    public final long getPacketsSent() {
        return this.packetsSent;
    }

    public int hashCode() {
        return Long.hashCode(this.packetLoss) + AbstractC11266d.m30451e(AbstractC11895b.m31983b(Long.hashCode(this.bytesSent) * 31, 31, this.availableOutgoingBitrates), this.packetsSent, 31);
    }

    public final void setAvailableOutgoingBitrates(List<Double> list) {
        AbstractC22676k.m65750j(list, "<set-?>");
        this.availableOutgoingBitrates = list;
    }

    public final void setBytesSent(long j7) {
        this.bytesSent = j7;
    }

    public final void setPacketLoss(long j7) {
        this.packetLoss = j7;
    }

    public final void setPacketsSent(long j7) {
        this.packetsSent = j7;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("PublishConnection(bytesSent=");
        sb4.append(this.bytesSent);
        sb4.append(", availableOutgoingBitrates=");
        sb4.append(this.availableOutgoingBitrates);
        sb4.append(", packetsSent=");
        sb4.append(this.packetsSent);
        sb4.append(", packetLoss=");
        return AbstractC2875y.m8302o(sb4, this.packetLoss, ')');
    }

    public PublishConnection(long j7, List<Double> availableOutgoingBitrates, long j13, long j14) {
        AbstractC22676k.m65750j(availableOutgoingBitrates, "availableOutgoingBitrates");
        this.bytesSent = j7;
        this.availableOutgoingBitrates = availableOutgoingBitrates;
        this.packetsSent = j13;
        this.packetLoss = j14;
    }

    public /* synthetic */ PublishConnection(long j7, List list, long j13, long j14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0L : j7, (i13 & 2) != 0 ? new ArrayList() : list, (i13 & 4) != 0 ? 0L : j13, (i13 & 8) != 0 ? 0L : j14);
    }
}
