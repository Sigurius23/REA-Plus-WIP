package dk0;

import fk2.C14554a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import jk0.EnumC21749c;
import lt0.AbstractC24726c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sj0.C32562a;
import uk0.C35048b;

/* JADX INFO: renamed from: dk0.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000eR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Ldk0/k;", "Llt0/c;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "toString", "()Ljava/lang/String;", "Lsj0/a;", "R", "()Lsj0/a;", "", "c", "S", "getRevision", "()S", "revision", "Lfk2/a;", "d", "Lfk2/a;", "Q", "()Lfk2/a;", "timeStamp", "e", "getHeartRate", "heartRate", "", "f", "Z", "isOffWrist", "g", "deviceLocationShort", "Ljk0/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljk0/c;", "garmentDeviceLocation", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12111k extends AbstractC24726c {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final short revision;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C14554a timeStamp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final short heartRate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isOffWrist;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final short deviceLocationShort;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC21749c garmentDeviceLocation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12111k(ByteBuffer payload) {
        super(payload);
        AbstractC22676k.m65750j(payload, "payload");
        this.revision = C35048b.m110782b(payload.get(1));
        this.timeStamp = new C14554a(C35048b.m110783d(payload.getInt(2)), C35048b.f148538a.m110786e(payload.getShort(6)));
        this.heartRate = C35048b.m110782b(payload.get(8));
        this.isOffWrist = payload.get(18) == 0;
        short sM110782b = C35048b.m110782b(payload.get(19));
        this.deviceLocationShort = sM110782b;
        this.garmentDeviceLocation = EnumC21749c.INSTANCE.m61367a(sM110782b);
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final C14554a getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: R */
    public final C32562a m33470R() {
        return new C32562a(this.heartRate, this.isOffWrist, this.timeStamp, this.garmentDeviceLocation);
    }

    @Override // lt0.AbstractC24726c
    public String toString() {
        if (this.revision != 2) {
            String string = super.toString();
            short s13 = this.revision;
            short s14 = this.heartRate;
            return string + " Revision: " + ((int) s13) + ", Heart Rate: " + ((int) s14) + ", timestamp: " + this.timeStamp;
        }
        String string2 = super.toString();
        short s15 = this.revision;
        short s16 = this.heartRate;
        return string2 + " Revision: " + ((int) s15) + ", Heart Rate: " + ((int) s16) + ", timestamp: " + this.timeStamp + ", isOffWrist: " + this.isOffWrist + ", Body Location: " + this.garmentDeviceLocation + " (" + ((int) this.deviceLocationShort) + ")";
    }
}
