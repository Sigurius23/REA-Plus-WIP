package gu0;

import com.whoop.connectivityDataPacketsModels.firmware.rawdata.rev2.dto.Rev2RawDataMetadata;
import java.nio.ByteBuffer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: gu0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u001c\u0010 ¨\u0006!"}, m65681d2 = {"Lgu0/c;", "", "", "id", "packetTimeStampUtcMillis", "sequenceNo", "Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;", "metadata", "Ljava/nio/ByteBuffer;", "receivedPacketRaw", "<init>", "(JJJLcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;Ljava/nio/ByteBuffer;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "c", "e", "d", "Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;", "()Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;", "Ljava/nio/ByteBuffer;", "()Ljava/nio/ByteBuffer;", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16211c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long packetTimeStampUtcMillis;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long sequenceNo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Rev2RawDataMetadata metadata;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ByteBuffer receivedPacketRaw;

    public C16211c(long j7, long j13, long j14, Rev2RawDataMetadata metadata, ByteBuffer receivedPacketRaw) {
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(receivedPacketRaw, "receivedPacketRaw");
        this.id = j7;
        this.packetTimeStampUtcMillis = j13;
        this.sequenceNo = j14;
        this.metadata = metadata;
        this.receivedPacketRaw = receivedPacketRaw;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Rev2RawDataMetadata getMetadata() {
        return this.metadata;
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
    public final long getSequenceNo() {
        return this.sequenceNo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16211c)) {
            return false;
        }
        C16211c c16211c = (C16211c) other;
        return this.id == c16211c.id && this.packetTimeStampUtcMillis == c16211c.packetTimeStampUtcMillis && this.sequenceNo == c16211c.sequenceNo && AbstractC22676k.m65745e(this.metadata, c16211c.metadata) && AbstractC22676k.m65745e(this.receivedPacketRaw, c16211c.receivedPacketRaw);
    }

    public int hashCode() {
        return this.receivedPacketRaw.hashCode() + ((this.metadata.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.id) * 31, this.packetTimeStampUtcMillis, 31), this.sequenceNo, 31)) * 31);
    }

    public String toString() {
        long j7 = this.id;
        long j13 = this.packetTimeStampUtcMillis;
        long j14 = this.sequenceNo;
        Rev2RawDataMetadata rev2RawDataMetadata = this.metadata;
        ByteBuffer byteBuffer = this.receivedPacketRaw;
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "Rev2RawDataDto(id=", ", packetTimeStampUtcMillis=");
        sbM125596b.append(j13);
        AbstractC2875y.m8285A(sbM125596b, ", sequenceNo=", j14, ", metadata=");
        sbM125596b.append(rev2RawDataMetadata);
        sbM125596b.append(", receivedPacketRaw=");
        sbM125596b.append(byteBuffer);
        sbM125596b.append(")");
        return sbM125596b.toString();
    }

    public /* synthetic */ C16211c(long j7, long j13, long j14, Rev2RawDataMetadata rev2RawDataMetadata, ByteBuffer byteBuffer, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0L : j7, j13, j14, rev2RawDataMetadata, byteBuffer);
    }
}
