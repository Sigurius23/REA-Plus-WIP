package sj0;

import fk2.C14554a;
import jk0.EnumC21749c;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import rt0.InterfaceC31800b;

/* JADX INFO: renamed from: sj0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0015\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lsj0/a;", "Lrt0/b$a;", "", "heartRate", "", "isOffBody", "Lfk2/a;", "timeStamp", "Ljk0/c;", "garmentDeviceLocation", "<init>", "(IZLfk2/a;Ljk0/c;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getHeartRate", "b", "Z", "()Z", "c", "Lfk2/a;", "()Lfk2/a;", "d", "Ljk0/c;", "getGarmentDeviceLocation", "()Ljk0/c;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32562a implements InterfaceC31800b.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int heartRate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isOffBody;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C14554a timeStamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC21749c garmentDeviceLocation;

    public C32562a(int i13, boolean z4, C14554a timeStamp, EnumC21749c garmentDeviceLocation) {
        AbstractC22676k.m65750j(timeStamp, "timeStamp");
        AbstractC22676k.m65750j(garmentDeviceLocation, "garmentDeviceLocation");
        this.heartRate = i13;
        this.isOffBody = z4;
        this.timeStamp = timeStamp;
        this.garmentDeviceLocation = garmentDeviceLocation;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public C14554a getTimeStamp() {
        return this.timeStamp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32562a)) {
            return false;
        }
        C32562a c32562a = (C32562a) other;
        return this.heartRate == c32562a.heartRate && this.isOffBody == c32562a.isOffBody && AbstractC22676k.m65745e(this.timeStamp, c32562a.timeStamp) && this.garmentDeviceLocation == c32562a.garmentDeviceLocation;
    }

    @Override // rt0.InterfaceC31800b.a
    public int getHeartRate() {
        return this.heartRate;
    }

    public int hashCode() {
        return this.garmentDeviceLocation.hashCode() + ((this.timeStamp.hashCode() + AbstractC2875y.m8289b(Integer.hashCode(this.heartRate) * 31, 31, this.isOffBody)) * 31);
    }

    public String toString() {
        return "RealTimeHrStream(heartRate=" + this.heartRate + ", isOffBody=" + this.isOffBody + ", timeStamp=" + this.timeStamp + ", garmentDeviceLocation=" + this.garmentDeviceLocation + ")";
    }
}
