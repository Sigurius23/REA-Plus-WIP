package at0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: at0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\"\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010\u0014R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b#\u0010'¨\u0006("}, m65681d2 = {"Lat0/a;", "", "", "packetTimeStampUtcMillis", "", "strapId", "strapGenCodeName", "hardwareVersion", "maximVersion", "dspVersion", "", "sequenceNumber", "binaryVersion", "Ljava/nio/ByteBuffer;", "receivedPacketRaw", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/nio/ByteBuffer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "e", "()J", "b", "Ljava/lang/String;", "i", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "f", "g", "I", "Ljava/nio/ByteBuffer;", "()Ljava/nio/ByteBuffer;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C1983a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long packetTimeStampUtcMillis;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String strapId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String strapGenCodeName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String hardwareVersion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String maximVersion;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String dspVersion;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int sequenceNumber;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int binaryVersion;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final ByteBuffer receivedPacketRaw;

    public C1983a(long j7, String strapId, String strapGenCodeName, String hardwareVersion, String maximVersion, String dspVersion, int i13, int i14, ByteBuffer receivedPacketRaw) {
        AbstractC22676k.m65750j(strapId, "strapId");
        AbstractC22676k.m65750j(strapGenCodeName, "strapGenCodeName");
        AbstractC22676k.m65750j(hardwareVersion, "hardwareVersion");
        AbstractC22676k.m65750j(maximVersion, "maximVersion");
        AbstractC22676k.m65750j(dspVersion, "dspVersion");
        AbstractC22676k.m65750j(receivedPacketRaw, "receivedPacketRaw");
        this.packetTimeStampUtcMillis = j7;
        this.strapId = strapId;
        this.strapGenCodeName = strapGenCodeName;
        this.hardwareVersion = hardwareVersion;
        this.maximVersion = maximVersion;
        this.dspVersion = dspVersion;
        this.sequenceNumber = i13;
        this.binaryVersion = i14;
        this.receivedPacketRaw = receivedPacketRaw;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBinaryVersion() {
        return this.binaryVersion;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDspVersion() {
        return this.dspVersion;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHardwareVersion() {
        return this.hardwareVersion;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMaximVersion() {
        return this.maximVersion;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getPacketTimeStampUtcMillis() {
        return this.packetTimeStampUtcMillis;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C1983a)) {
            return false;
        }
        C1983a c1983a = (C1983a) other;
        return this.packetTimeStampUtcMillis == c1983a.packetTimeStampUtcMillis && AbstractC22676k.m65745e(this.strapId, c1983a.strapId) && AbstractC22676k.m65745e(this.strapGenCodeName, c1983a.strapGenCodeName) && AbstractC22676k.m65745e(this.hardwareVersion, c1983a.hardwareVersion) && AbstractC22676k.m65745e(this.maximVersion, c1983a.maximVersion) && AbstractC22676k.m65745e(this.dspVersion, c1983a.dspVersion) && this.sequenceNumber == c1983a.sequenceNumber && this.binaryVersion == c1983a.binaryVersion && AbstractC22676k.m65745e(this.receivedPacketRaw, c1983a.receivedPacketRaw);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ByteBuffer getReceivedPacketRaw() {
        return this.receivedPacketRaw;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getSequenceNumber() {
        return this.sequenceNumber;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getStrapGenCodeName() {
        return this.strapGenCodeName;
    }

    public int hashCode() {
        return this.receivedPacketRaw.hashCode() + AbstractC11266d.m30448b(this.binaryVersion, AbstractC11266d.m30448b(this.sequenceNumber, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(Long.hashCode(this.packetTimeStampUtcMillis) * 31, 31, this.strapId), 31, this.strapGenCodeName), 31, this.hardwareVersion), 31, this.maximVersion), 31, this.dspVersion), 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getStrapId() {
        return this.strapId;
    }

    public String toString() {
        long j7 = this.packetTimeStampUtcMillis;
        String str = this.strapId;
        String str2 = this.strapGenCodeName;
        String str3 = this.hardwareVersion;
        String str4 = this.maximVersion;
        String str5 = this.dspVersion;
        int i13 = this.sequenceNumber;
        int i14 = this.binaryVersion;
        ByteBuffer byteBuffer = this.receivedPacketRaw;
        StringBuilder sbM114685m = AbstractC36095b.m114685m("ConsolePacketData(packetTimeStampUtcMillis=", ", strapId=", j7, str);
        AbstractC11266d.m30444B(sbM114685m, ", strapGenCodeName=", str2, ", hardwareVersion=", str3);
        AbstractC11266d.m30444B(sbM114685m, ", maximVersion=", str4, ", dspVersion=", str5);
        sbM114685m.append(", sequenceNumber=");
        sbM114685m.append(i13);
        sbM114685m.append(", binaryVersion=");
        sbM114685m.append(i14);
        sbM114685m.append(", receivedPacketRaw=");
        sbM114685m.append(byteBuffer);
        sbM114685m.append(")");
        return sbM114685m.toString();
    }
}
