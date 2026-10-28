package nt0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Arrays;
import l83.C23472r;
import lt0.AbstractC24726c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: nt0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0017\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b#\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001c\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u0010*R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u0010*¨\u00065"}, m65681d2 = {"Lnt0/i;", "", "Llt0/c$a;", "type", "", "timestampSeconds", "timestampSubseconds", "Ll83/r;", "heartRate", "", "accelerometerSamplesX", "accelerometerSamplesY", "accelerometerSamplesZ", "gyroscopeSamplesX", "gyroscopeSamplesY", "gyroscopeSamplesZ", "<init>", "(Llt0/c$a;JJB[S[S[S[S[S[SLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Llt0/c$a;", "c", "()Llt0/c$a;", "b", "J", "()J", "getTimestampSubseconds", "d", "B", "()B", "e", "[S", "getAccelerometerSamplesX", "()[S", "f", "getAccelerometerSamplesY", "g", "getAccelerometerSamplesZ", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getGyroscopeSamplesX", "i", "getGyroscopeSamplesY", "j", "getGyroscopeSamplesZ", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27121i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC24726c.a type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long timestampSeconds;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long timestampSubseconds;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final byte heartRate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final short[] accelerometerSamplesX;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final short[] accelerometerSamplesY;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final short[] accelerometerSamplesZ;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final short[] gyroscopeSamplesX;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final short[] gyroscopeSamplesY;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final short[] gyroscopeSamplesZ;

    public /* synthetic */ C27121i(AbstractC24726c.a aVar, long j7, long j13, byte b, short[] sArr, short[] sArr2, short[] sArr3, short[] sArr4, short[] sArr5, short[] sArr6, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, j7, j13, b, sArr, sArr2, sArr3, sArr4, sArr5, sArr6);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte getHeartRate() {
        return this.heartRate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTimestampSeconds() {
        return this.timestampSeconds;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC24726c.a getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!C27121i.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(other, "null cannot be cast to non-null type com.whoop.connectivityCore.packets.datapacket.rawdata.RawDataStreamResult");
        C27121i c27121i = (C27121i) other;
        return this.timestampSeconds == c27121i.timestampSeconds && this.timestampSubseconds == c27121i.timestampSubseconds && this.heartRate == c27121i.heartRate && Arrays.equals(this.accelerometerSamplesX, c27121i.accelerometerSamplesX) && Arrays.equals(this.accelerometerSamplesY, c27121i.accelerometerSamplesY) && Arrays.equals(this.accelerometerSamplesZ, c27121i.accelerometerSamplesZ) && Arrays.equals(this.gyroscopeSamplesX, c27121i.gyroscopeSamplesX) && Arrays.equals(this.gyroscopeSamplesY, c27121i.gyroscopeSamplesY) && Arrays.equals(this.gyroscopeSamplesZ, c27121i.gyroscopeSamplesZ);
    }

    public int hashCode() {
        return Arrays.hashCode(this.gyroscopeSamplesZ) + ((Arrays.hashCode(this.gyroscopeSamplesY) + ((Arrays.hashCode(this.gyroscopeSamplesX) + ((Arrays.hashCode(this.accelerometerSamplesZ) + ((Arrays.hashCode(this.accelerometerSamplesY) + ((Arrays.hashCode(this.accelerometerSamplesX) + ((Byte.hashCode(this.heartRate) + AbstractC11266d.m30451e(Long.hashCode(this.timestampSeconds) * 31, this.timestampSubseconds, 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        AbstractC24726c.a aVar = this.type;
        long j7 = this.timestampSeconds;
        long j13 = this.timestampSubseconds;
        String strM68039a = C23472r.m68039a(this.heartRate);
        String string = Arrays.toString(this.accelerometerSamplesX);
        String string2 = Arrays.toString(this.accelerometerSamplesY);
        String string3 = Arrays.toString(this.accelerometerSamplesZ);
        String string4 = Arrays.toString(this.gyroscopeSamplesX);
        String string5 = Arrays.toString(this.gyroscopeSamplesY);
        String string6 = Arrays.toString(this.gyroscopeSamplesZ);
        StringBuilder sb4 = new StringBuilder("RawDataStreamResult(type=");
        sb4.append(aVar);
        sb4.append(", timestampSeconds=");
        sb4.append(j7);
        AbstractC2875y.m8285A(sb4, ", timestampSubseconds=", j13, ", heartRate=");
        AbstractC11266d.m30444B(sb4, strM68039a, ", accelerometerSamplesX=", string, ", accelerometerSamplesY=");
        AbstractC11266d.m30444B(sb4, string2, ", accelerometerSamplesZ=", string3, ", gyroscopeSamplesX=");
        AbstractC11266d.m30444B(sb4, string4, ", gyroscopeSamplesY=", string5, ", gyroscopeSamplesZ=");
        return AbstractC25012a.m73376i(string6, ")", sb4);
    }

    private C27121i(AbstractC24726c.a type, long j7, long j13, byte b, short[] accelerometerSamplesX, short[] accelerometerSamplesY, short[] accelerometerSamplesZ, short[] gyroscopeSamplesX, short[] gyroscopeSamplesY, short[] gyroscopeSamplesZ) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(accelerometerSamplesX, "accelerometerSamplesX");
        AbstractC22676k.m65750j(accelerometerSamplesY, "accelerometerSamplesY");
        AbstractC22676k.m65750j(accelerometerSamplesZ, "accelerometerSamplesZ");
        AbstractC22676k.m65750j(gyroscopeSamplesX, "gyroscopeSamplesX");
        AbstractC22676k.m65750j(gyroscopeSamplesY, "gyroscopeSamplesY");
        AbstractC22676k.m65750j(gyroscopeSamplesZ, "gyroscopeSamplesZ");
        this.type = type;
        this.timestampSeconds = j7;
        this.timestampSubseconds = j13;
        this.heartRate = b;
        this.accelerometerSamplesX = accelerometerSamplesX;
        this.accelerometerSamplesY = accelerometerSamplesY;
        this.accelerometerSamplesZ = accelerometerSamplesZ;
        this.gyroscopeSamplesX = gyroscopeSamplesX;
        this.gyroscopeSamplesY = gyroscopeSamplesY;
        this.gyroscopeSamplesZ = gyroscopeSamplesZ;
    }
}
