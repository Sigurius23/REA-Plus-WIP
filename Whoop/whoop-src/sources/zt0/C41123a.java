package zt0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: zt0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\u001d\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b#\u0010\u0012R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0014R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010(R\"\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b)\u0010*¨\u0006,"}, m65681d2 = {"Lzt0/a;", "", "", "packetTimeStampUtcMillis", "packetTimeStampMillis", "", "strapId", "hardwareVersion", "maximVersion", "dspVersion", "nordicVersion", "", "sequenceNumber", "Ljava/nio/ByteBuffer;", "receivedPacketRaw", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/nio/ByteBuffer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "g", "()J", "b", "f", "c", "Ljava/lang/String;", "j", "d", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "I", "i", "Ljava/nio/ByteBuffer;", "()Ljava/nio/ByteBuffer;", "k", "(J)V", "id", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41123a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long packetTimeStampUtcMillis;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long packetTimeStampMillis;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String strapId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String hardwareVersion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String maximVersion;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String dspVersion;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String nordicVersion;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int sequenceNumber;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final ByteBuffer receivedPacketRaw;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private long id;

    public C41123a(long j7, long j13, String strapId, String hardwareVersion, String maximVersion, String dspVersion, String nordicVersion, int i13, ByteBuffer receivedPacketRaw) {
        AbstractC22676k.m65750j(strapId, "strapId");
        AbstractC22676k.m65750j(hardwareVersion, "hardwareVersion");
        AbstractC22676k.m65750j(maximVersion, "maximVersion");
        AbstractC22676k.m65750j(dspVersion, "dspVersion");
        AbstractC22676k.m65750j(nordicVersion, "nordicVersion");
        AbstractC22676k.m65750j(receivedPacketRaw, "receivedPacketRaw");
        this.packetTimeStampUtcMillis = j7;
        this.packetTimeStampMillis = j13;
        this.strapId = strapId;
        this.hardwareVersion = hardwareVersion;
        this.maximVersion = maximVersion;
        this.dspVersion = dspVersion;
        this.nordicVersion = nordicVersion;
        this.sequenceNumber = i13;
        this.receivedPacketRaw = receivedPacketRaw;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDspVersion() {
        return this.dspVersion;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHardwareVersion() {
        return this.hardwareVersion;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMaximVersion() {
        return this.maximVersion;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getNordicVersion() {
        return this.nordicVersion;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41123a)) {
            return false;
        }
        C41123a c41123a = (C41123a) other;
        return this.packetTimeStampUtcMillis == c41123a.packetTimeStampUtcMillis && this.packetTimeStampMillis == c41123a.packetTimeStampMillis && AbstractC22676k.m65745e(this.strapId, c41123a.strapId) && AbstractC22676k.m65745e(this.hardwareVersion, c41123a.hardwareVersion) && AbstractC22676k.m65745e(this.maximVersion, c41123a.maximVersion) && AbstractC22676k.m65745e(this.dspVersion, c41123a.dspVersion) && AbstractC22676k.m65745e(this.nordicVersion, c41123a.nordicVersion) && this.sequenceNumber == c41123a.sequenceNumber && AbstractC22676k.m65745e(this.receivedPacketRaw, c41123a.receivedPacketRaw);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getPacketTimeStampMillis() {
        return this.packetTimeStampMillis;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getPacketTimeStampUtcMillis() {
        return this.packetTimeStampUtcMillis;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ByteBuffer getReceivedPacketRaw() {
        return this.receivedPacketRaw;
    }

    public int hashCode() {
        return this.receivedPacketRaw.hashCode() + AbstractC11266d.m30448b(this.sequenceNumber, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30451e(Long.hashCode(this.packetTimeStampUtcMillis) * 31, this.packetTimeStampMillis, 31), 31, this.strapId), 31, this.hardwareVersion), 31, this.maximVersion), 31, this.dspVersion), 31, this.nordicVersion), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getSequenceNumber() {
        return this.sequenceNumber;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getStrapId() {
        return this.strapId;
    }

    /* JADX INFO: renamed from: k */
    public final void m133508k(long j7) {
        this.id = j7;
    }

    public String toString() {
        long j7 = this.packetTimeStampUtcMillis;
        long j13 = this.packetTimeStampMillis;
        String str = this.strapId;
        String str2 = this.hardwareVersion;
        String str3 = this.maximVersion;
        String str4 = this.dspVersion;
        String str5 = this.nordicVersion;
        int i13 = this.sequenceNumber;
        ByteBuffer byteBuffer = this.receivedPacketRaw;
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "ConsolePacketsDto(packetTimeStampUtcMillis=", ", packetTimeStampMillis=");
        sbM125596b.append(j13);
        sbM125596b.append(", strapId=");
        sbM125596b.append(str);
        AbstractC11266d.m30444B(sbM125596b, ", hardwareVersion=", str2, ", maximVersion=", str3);
        AbstractC11266d.m30444B(sbM125596b, ", dspVersion=", str4, ", nordicVersion=", str5);
        sbM125596b.append(", sequenceNumber=");
        sbM125596b.append(i13);
        sbM125596b.append(", receivedPacketRaw=");
        sbM125596b.append(byteBuffer);
        sbM125596b.append(")");
        return sbM125596b.toString();
    }
}
