package du0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: du0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b \u0010\u0012R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b\u001d\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b&\u0010\u0012R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b%\u0010(R\"\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\"\u0010\u001c\"\u0004\b)\u0010*¨\u0006,"}, m65681d2 = {"Ldu0/a;", "", "", "timestamp", "", "hardwareVersion", "maximVersion", "dspVersion", "strapId", "", "binaryVersion", "binaryFlags", "rawDataVersion", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/nio/ByteBuffer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "j", "()J", "b", "Ljava/lang/String;", "d", "c", "f", "e", "i", "I", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/nio/ByteBuffer;", "()Ljava/nio/ByteBuffer;", "k", "(J)V", "id", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12374a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String hardwareVersion;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String maximVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String dspVersion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String strapId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int binaryVersion;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int binaryFlags;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String rawDataVersion;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final ByteBuffer payload;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private long id;

    public C12374a(long j7, String hardwareVersion, String maximVersion, String dspVersion, String strapId, int i13, int i14, String rawDataVersion, ByteBuffer payload) {
        AbstractC22676k.m65750j(hardwareVersion, "hardwareVersion");
        AbstractC22676k.m65750j(maximVersion, "maximVersion");
        AbstractC22676k.m65750j(dspVersion, "dspVersion");
        AbstractC22676k.m65750j(strapId, "strapId");
        AbstractC22676k.m65750j(rawDataVersion, "rawDataVersion");
        AbstractC22676k.m65750j(payload, "payload");
        this.timestamp = j7;
        this.hardwareVersion = hardwareVersion;
        this.maximVersion = maximVersion;
        this.dspVersion = dspVersion;
        this.strapId = strapId;
        this.binaryVersion = i13;
        this.binaryFlags = i14;
        this.rawDataVersion = rawDataVersion;
        this.payload = payload;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBinaryFlags() {
        return this.binaryFlags;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBinaryVersion() {
        return this.binaryVersion;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDspVersion() {
        return this.dspVersion;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getHardwareVersion() {
        return this.hardwareVersion;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12374a)) {
            return false;
        }
        C12374a c12374a = (C12374a) other;
        return this.timestamp == c12374a.timestamp && AbstractC22676k.m65745e(this.hardwareVersion, c12374a.hardwareVersion) && AbstractC22676k.m65745e(this.maximVersion, c12374a.maximVersion) && AbstractC22676k.m65745e(this.dspVersion, c12374a.dspVersion) && AbstractC22676k.m65745e(this.strapId, c12374a.strapId) && this.binaryVersion == c12374a.binaryVersion && this.binaryFlags == c12374a.binaryFlags && AbstractC22676k.m65745e(this.rawDataVersion, c12374a.rawDataVersion) && AbstractC22676k.m65745e(this.payload, c12374a.payload);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMaximVersion() {
        return this.maximVersion;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ByteBuffer getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getRawDataVersion() {
        return this.rawDataVersion;
    }

    public int hashCode() {
        return this.payload.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.binaryFlags, AbstractC11266d.m30448b(this.binaryVersion, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(Long.hashCode(this.timestamp) * 31, 31, this.hardwareVersion), 31, this.maximVersion), 31, this.dspVersion), 31, this.strapId), 31), 31), 31, this.rawDataVersion);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getStrapId() {
        return this.strapId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: k */
    public final void m34722k(long j7) {
        this.id = j7;
    }

    public String toString() {
        long j7 = this.timestamp;
        String str = this.hardwareVersion;
        String str2 = this.maximVersion;
        String str3 = this.dspVersion;
        String str4 = this.strapId;
        int i13 = this.binaryVersion;
        int i14 = this.binaryFlags;
        String str5 = this.rawDataVersion;
        ByteBuffer byteBuffer = this.payload;
        StringBuilder sbM114685m = AbstractC36095b.m114685m("RawDataDto(timestamp=", ", hardwareVersion=", j7, str);
        AbstractC11266d.m30444B(sbM114685m, ", maximVersion=", str2, ", dspVersion=", str3);
        sbM114685m.append(", strapId=");
        sbM114685m.append(str4);
        sbM114685m.append(", binaryVersion=");
        sbM114685m.append(i13);
        sbM114685m.append(", binaryFlags=");
        sbM114685m.append(i14);
        sbM114685m.append(", rawDataVersion=");
        sbM114685m.append(str5);
        sbM114685m.append(", payload=");
        sbM114685m.append(byteBuffer);
        sbM114685m.append(")");
        return sbM114685m.toString();
    }
}
