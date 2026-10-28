package zt0;

import com.whoop.connectivityDataPacketsModels.console.dto.ConsolePacketsMetadata;
import java.nio.ByteBuffer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: zt0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0016\u0010!R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001f\u0010#¨\u0006$"}, m65681d2 = {"Lzt0/b;", "", "", "id", "", "sequenceNo", "packetTimeStampUtcMillis", "Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;", "consolePacketsMetadata", "Ljava/nio/ByteBuffer;", "receivedPacketRaw", "<init>", "(JIJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;Ljava/nio/ByteBuffer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "setId", "(J)V", "I", "e", "c", "d", "Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;", "()Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;", "Ljava/nio/ByteBuffer;", "()Ljava/nio/ByteBuffer;", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41124b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int sequenceNo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long packetTimeStampUtcMillis;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ConsolePacketsMetadata consolePacketsMetadata;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ByteBuffer receivedPacketRaw;

    public C41124b(long j7, int i13, long j13, ConsolePacketsMetadata consolePacketsMetadata, ByteBuffer receivedPacketRaw) {
        AbstractC22676k.m65750j(consolePacketsMetadata, "consolePacketsMetadata");
        AbstractC22676k.m65750j(receivedPacketRaw, "receivedPacketRaw");
        this.id = j7;
        this.sequenceNo = i13;
        this.packetTimeStampUtcMillis = j13;
        this.consolePacketsMetadata = consolePacketsMetadata;
        this.receivedPacketRaw = receivedPacketRaw;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ConsolePacketsMetadata getConsolePacketsMetadata() {
        return this.consolePacketsMetadata;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getPacketTimeStampUtcMillis() {
        return this.packetTimeStampUtcMillis;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ByteBuffer getReceivedPacketRaw() {
        return this.receivedPacketRaw;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getSequenceNo() {
        return this.sequenceNo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41124b)) {
            return false;
        }
        C41124b c41124b = (C41124b) other;
        return this.id == c41124b.id && this.sequenceNo == c41124b.sequenceNo && this.packetTimeStampUtcMillis == c41124b.packetTimeStampUtcMillis && AbstractC22676k.m65745e(this.consolePacketsMetadata, c41124b.consolePacketsMetadata) && AbstractC22676k.m65745e(this.receivedPacketRaw, c41124b.receivedPacketRaw);
    }

    public int hashCode() {
        return this.receivedPacketRaw.hashCode() + ((this.consolePacketsMetadata.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.sequenceNo, Long.hashCode(this.id) * 31, 31), this.packetTimeStampUtcMillis, 31)) * 31);
    }

    public String toString() {
        long j7 = this.id;
        int i13 = this.sequenceNo;
        long j13 = this.packetTimeStampUtcMillis;
        ConsolePacketsMetadata consolePacketsMetadata = this.consolePacketsMetadata;
        ByteBuffer byteBuffer = this.receivedPacketRaw;
        StringBuilder sb4 = new StringBuilder("ConsolePacketsDtoNew(id=");
        sb4.append(j7);
        sb4.append(", sequenceNo=");
        sb4.append(i13);
        AbstractC2875y.m8285A(sb4, ", packetTimeStampUtcMillis=", j13, ", consolePacketsMetadata=");
        sb4.append(consolePacketsMetadata);
        sb4.append(", receivedPacketRaw=");
        sb4.append(byteBuffer);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C41124b(long j7, int i13, long j13, ConsolePacketsMetadata consolePacketsMetadata, ByteBuffer byteBuffer, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0L : j7, i13, j13, consolePacketsMetadata, byteBuffer);
    }
}
