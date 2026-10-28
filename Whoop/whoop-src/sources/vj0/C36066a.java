package vj0;

import fk2.C14554a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Arrays;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import rt0.InterfaceC31800b;

/* JADX INFO: renamed from: vj0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b)\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u001e\u0010.R\u001a\u0010\f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b\"\u0010.R\u001a\u0010\r\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b%\u0010.R\u001a\u0010\u000e\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b0\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010-\u001a\u0004\b*\u0010.R\u001a\u0010\u0010\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010-\u001a\u0004\b,\u0010.R\u001a\u0010\u0011\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b/\u0010.¨\u00062"}, m65681d2 = {"Lvj0/a;", "Lrt0/b$b;", "Lfk2/a;", "timeStamp", "", "samplingFrequency", "", "dataCycleSequence", "subSequence", "numberOfAccelReadings", "", "accelX", "accelY", "accelZ", "numberOfGyroReadings", "gyroX", "gyroY", "gyroZ", "<init>", "(Lfk2/a;IJII[S[S[SI[S[S[S)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lfk2/a;", "k", "()Lfk2/a;", "b", "I", "getSamplingFrequency", "c", "J", "d", "()J", "j", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "[S", "()[S", "g", "i", "l", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36066a implements InterfaceC31800b.b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14554a timeStamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int samplingFrequency;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long dataCycleSequence;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int subSequence;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int numberOfAccelReadings;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final short[] accelX;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final short[] accelY;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final short[] accelZ;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int numberOfGyroReadings;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final short[] gyroX;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final short[] gyroY;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final short[] gyroZ;

    public C36066a(C14554a timeStamp, int i13, long j7, int i14, int i15, short[] accelX, short[] accelY, short[] accelZ, int i16, short[] gyroX, short[] gyroY, short[] gyroZ) {
        AbstractC22676k.m65750j(timeStamp, "timeStamp");
        AbstractC22676k.m65750j(accelX, "accelX");
        AbstractC22676k.m65750j(accelY, "accelY");
        AbstractC22676k.m65750j(accelZ, "accelZ");
        AbstractC22676k.m65750j(gyroX, "gyroX");
        AbstractC22676k.m65750j(gyroY, "gyroY");
        AbstractC22676k.m65750j(gyroZ, "gyroZ");
        this.timeStamp = timeStamp;
        this.samplingFrequency = i13;
        this.dataCycleSequence = j7;
        this.subSequence = i14;
        this.numberOfAccelReadings = i15;
        this.accelX = accelX;
        this.accelY = accelY;
        this.accelZ = accelZ;
        this.numberOfGyroReadings = i16;
        this.gyroX = gyroX;
        this.gyroY = gyroY;
        this.gyroZ = gyroZ;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public short[] getAccelX() {
        return this.accelX;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public short[] getAccelY() {
        return this.accelY;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public short[] getAccelZ() {
        return this.accelZ;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public long getDataCycleSequence() {
        return this.dataCycleSequence;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public short[] getGyroX() {
        return this.gyroX;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!C36066a.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(other, "null cannot be cast to non-null type com.whoop.ble.model.ImuData");
        C36066a c36066a = (C36066a) other;
        if (AbstractC22676k.m65745e(getTimeStamp(), c36066a.getTimeStamp()) && getDataCycleSequence() == c36066a.getDataCycleSequence() && getSubSequence() == c36066a.getSubSequence() && getNumberOfAccelReadings() == c36066a.getNumberOfAccelReadings() && Arrays.equals(getAccelX(), c36066a.getAccelX()) && Arrays.equals(getAccelY(), c36066a.getAccelY()) && Arrays.equals(getAccelZ(), c36066a.getAccelZ()) && getNumberOfGyroReadings() == c36066a.getNumberOfGyroReadings() && Arrays.equals(getGyroX(), c36066a.getGyroX()) && Arrays.equals(getGyroY(), c36066a.getGyroY())) {
            return Arrays.equals(getGyroZ(), c36066a.getGyroZ());
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public short[] getGyroY() {
        return this.gyroY;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public short[] getGyroZ() {
        return this.gyroZ;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public int getNumberOfAccelReadings() {
        return this.numberOfAccelReadings;
    }

    public int hashCode() {
        return Arrays.hashCode(getGyroZ()) + ((Arrays.hashCode(getGyroY()) + ((Arrays.hashCode(getGyroX()) + ((getNumberOfGyroReadings() + ((Arrays.hashCode(getAccelZ()) + ((Arrays.hashCode(getAccelY()) + ((Arrays.hashCode(getAccelX()) + ((getNumberOfAccelReadings() + ((getSubSequence() + ((Long.hashCode(getDataCycleSequence()) + (getTimeStamp().hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public int getNumberOfGyroReadings() {
        return this.numberOfGyroReadings;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public int getSubSequence() {
        return this.subSequence;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public C14554a getTimeStamp() {
        return this.timeStamp;
    }

    public String toString() {
        C14554a c14554a = this.timeStamp;
        int i13 = this.samplingFrequency;
        long j7 = this.dataCycleSequence;
        int i14 = this.subSequence;
        int i15 = this.numberOfAccelReadings;
        String string = Arrays.toString(this.accelX);
        String string2 = Arrays.toString(this.accelY);
        String string3 = Arrays.toString(this.accelZ);
        int i16 = this.numberOfGyroReadings;
        String string4 = Arrays.toString(this.gyroX);
        String string5 = Arrays.toString(this.gyroY);
        String string6 = Arrays.toString(this.gyroZ);
        StringBuilder sb4 = new StringBuilder("ImuData(timeStamp=");
        sb4.append(c14554a);
        sb4.append(", samplingFrequency=");
        sb4.append(i13);
        sb4.append(", dataCycleSequence=");
        sb4.append(j7);
        sb4.append(", subSequence=");
        sb4.append(i14);
        sb4.append(", numberOfAccelReadings=");
        sb4.append(i15);
        sb4.append(", accelX=");
        sb4.append(string);
        AbstractC11266d.m30444B(sb4, ", accelY=", string2, ", accelZ=", string3);
        sb4.append(", numberOfGyroReadings=");
        sb4.append(i16);
        sb4.append(", gyroX=");
        sb4.append(string4);
        AbstractC11266d.m30444B(sb4, ", gyroY=", string5, ", gyroZ=", string6);
        sb4.append(")");
        return sb4.toString();
    }
}
