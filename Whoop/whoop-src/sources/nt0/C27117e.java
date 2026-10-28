package nt0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import lt0.C24725b;
import lt0.C24736m;
import or2.AbstractC28174k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uk0.C35048b;

/* JADX INFO: renamed from: nt0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0017\n\u0002\b\u001a\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\"\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018R\u0017\u0010%\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u0017\u0010(\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u0018R\u001a\u0010+\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b*\u0010\f¨\u0006."}, m65681d2 = {"Lnt0/e;", "Lnt0/h;", "Llt0/m;", "receivedPacket", "Llt0/b;", "dataPacket", "<init>", "(Llt0/m;Llt0/b;)V", "", "v", "I", "g0", "()I", "accelSamplingFrequency", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "n0", "numberOfAccelReadings", "x", "o0", "numberOfGyroReadings", "", "y", "[S", "h0", "()[S", "accelX", "z", "i0", "accelY", "A", "j0", "accelZ", "B", "k0", "gyroX", "C", "l0", "gyroY", "D", "m0", "gyroZ", "E", "c0", "expectedPacketLength", "F", "a", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27117e extends AbstractC27120h {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final short[] accelZ;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final short[] gyroX;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final short[] gyroY;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final short[] gyroZ;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final int expectedPacketLength;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final int accelSamplingFrequency;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int numberOfAccelReadings;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final int numberOfGyroReadings;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final short[] accelX;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final short[] accelY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27117e(C24736m receivedPacket, C24725b dataPacket) {
        super(receivedPacket, dataPacket, null);
        AbstractC22676k.m65750j(receivedPacket, "receivedPacket");
        AbstractC22676k.m65750j(dataPacket, "dataPacket");
        C35048b c35048b = C35048b.f148538a;
        this.accelSamplingFrequency = c35048b.m110786e(getPayload().getShort(14));
        int iM110786e = c35048b.m110786e(getPayload().getShort(16));
        this.numberOfAccelReadings = iM110786e;
        int iM110786e2 = c35048b.m110786e(getPayload().getShort(622));
        this.numberOfGyroReadings = iM110786e2;
        this.accelX = AbstractC28174k.m85287b(20, iM110786e, getPayload(), null, 8, null);
        this.accelY = AbstractC28174k.m85287b(220, iM110786e, getPayload(), null, 8, null);
        this.accelZ = AbstractC28174k.m85287b(420, iM110786e, getPayload(), null, 8, null);
        this.gyroX = AbstractC28174k.m85287b(632, iM110786e2, getPayload(), null, 8, null);
        this.gyroY = AbstractC28174k.m85287b(832, iM110786e2, getPayload(), null, 8, null);
        this.gyroZ = AbstractC28174k.m85287b(1032, iM110786e2, getPayload(), null, 8, null);
        this.expectedPacketLength = 1244;
    }

    @Override // nt0.AbstractC27120h
    /* JADX INFO: renamed from: c0, reason: from getter */
    public int getExpectedPacketLength() {
        return this.expectedPacketLength;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final int getAccelSamplingFrequency() {
        return this.accelSamplingFrequency;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final short[] getAccelX() {
        return this.accelX;
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final short[] getAccelY() {
        return this.accelY;
    }

    /* JADX INFO: renamed from: j0, reason: from getter */
    public final short[] getAccelZ() {
        return this.accelZ;
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final short[] getGyroX() {
        return this.gyroX;
    }

    /* JADX INFO: renamed from: l0, reason: from getter */
    public final short[] getGyroY() {
        return this.gyroY;
    }

    /* JADX INFO: renamed from: m0, reason: from getter */
    public final short[] getGyroZ() {
        return this.gyroZ;
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final int getNumberOfAccelReadings() {
        return this.numberOfAccelReadings;
    }

    /* JADX INFO: renamed from: o0, reason: from getter */
    public final int getNumberOfGyroReadings() {
        return this.numberOfGyroReadings;
    }
}
