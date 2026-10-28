package ws0;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: ws0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\nR\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lws0/a;", "", "", "level", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Z", "()Z", "isLowForFirmwareUpdate", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37605a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int level;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isLowForFirmwareUpdate;

    public C37605a(int i13) {
        this.level = i13;
        this.isLowForFirmwareUpdate = i13 < 20;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsLowForFirmwareUpdate() {
        return this.isLowForFirmwareUpdate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C37605a) && this.level == ((C37605a) other).level;
    }

    public int hashCode() {
        return Integer.hashCode(this.level);
    }

    public String toString() {
        return AbstractC2875y.m8296i(this.level, "WhoopDeviceBatteryLevel(level=", ")");
    }
}
