package xs0;

import com.whoop.connectivityCore.batteryPack.models.BatteryPackType;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xs0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lxs0/a;", "", "", "isChargingStrap", "Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;", "batteryPackType", "<init>", "(ZLcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;", "()Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38637a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isChargingStrap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final BatteryPackType batteryPackType;

    public C38637a(boolean z4, BatteryPackType batteryPackType) {
        this.isChargingStrap = z4;
        this.batteryPackType = batteryPackType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BatteryPackType getBatteryPackType() {
        return this.batteryPackType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsChargingStrap() {
        return this.isChargingStrap;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38637a)) {
            return false;
        }
        C38637a c38637a = (C38637a) other;
        return this.isChargingStrap == c38637a.isChargingStrap && this.batteryPackType == c38637a.batteryPackType;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isChargingStrap) * 31;
        BatteryPackType batteryPackType = this.batteryPackType;
        return iHashCode + (batteryPackType == null ? 0 : batteryPackType.hashCode());
    }

    public String toString() {
        return "BatteryPackChargingStatus(isChargingStrap=" + this.isChargingStrap + ", batteryPackType=" + this.batteryPackType + ")";
    }

    public /* synthetic */ C38637a(boolean z4, BatteryPackType batteryPackType, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, (i13 & 2) != 0 ? null : batteryPackType);
    }
}
