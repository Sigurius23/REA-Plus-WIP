package c52;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c52.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lc52/e;", "", "", "macAddress", "serialNumber", "", "lastConnectedTimeStamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getSerialNumber", "c", "J", "getLastConnectedTimeStamp", "()J", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4254e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String macAddress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String serialNumber;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long lastConnectedTimeStamp;

    public C4254e(String macAddress, String serialNumber, long j7) {
        AbstractC22676k.m65750j(macAddress, "macAddress");
        AbstractC22676k.m65750j(serialNumber, "serialNumber");
        this.macAddress = macAddress;
        this.serialNumber = serialNumber;
        this.lastConnectedTimeStamp = j7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMacAddress() {
        return this.macAddress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4254e)) {
            return false;
        }
        C4254e c4254e = (C4254e) other;
        return AbstractC22676k.m65745e(this.macAddress, c4254e.macAddress) && AbstractC22676k.m65745e(this.serialNumber, c4254e.serialNumber) && this.lastConnectedTimeStamp == c4254e.lastConnectedTimeStamp;
    }

    public int hashCode() {
        return Long.hashCode(this.lastConnectedTimeStamp) + AbstractC11266d.m30450d(this.macAddress.hashCode() * 31, 31, this.serialNumber);
    }

    public String toString() {
        return AbstractC11266d.m30457k(this.lastConnectedTimeStamp, ")", AbstractC11895b.m32001t("LastConnectedPuffinInfo(macAddress=", this.macAddress, ", serialNumber=", this.serialNumber, ", lastConnectedTimeStamp="));
    }
}
