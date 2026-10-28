package ql1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ql1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0010\u0010\f¨\u0006\u0015"}, m65681d2 = {"Lql1/d;", "", "", "showTile", "", "batteryPercentage", "<init>", "(ZI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "I", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30473d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean showTile;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int batteryPercentage;

    public C30473d(boolean z4, int i13) {
        this.showTile = z4;
        this.batteryPercentage = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBatteryPercentage() {
        return this.batteryPercentage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShowTile() {
        return this.showTile;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30473d)) {
            return false;
        }
        C30473d c30473d = (C30473d) other;
        return this.showTile == c30473d.showTile && this.batteryPercentage == c30473d.batteryPercentage;
    }

    public int hashCode() {
        return Integer.hashCode(this.batteryPercentage) + (Boolean.hashCode(this.showTile) * 31);
    }

    public String toString() {
        return "ShowLowBatteryState(showTile=" + this.showTile + ", batteryPercentage=" + this.batteryPercentage + ")";
    }

    public /* synthetic */ C30473d(boolean z4, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, (i14 & 2) != 0 ? 0 : i13);
    }
}
