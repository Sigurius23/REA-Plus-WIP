package nu1;

import mc1.EnumC25417b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nu1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lnu1/g;", "", "Lmc1/b;", "heartRateZoneType", "", "componentId", "<init>", "(Lmc1/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmc1/b;", "b", "()Lmc1/b;", "Ljava/lang/String;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27143g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC25417b heartRateZoneType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String componentId;

    public C27143g(EnumC25417b heartRateZoneType, String componentId) {
        AbstractC22676k.m65750j(heartRateZoneType, "heartRateZoneType");
        AbstractC22676k.m65750j(componentId, "componentId");
        this.heartRateZoneType = heartRateZoneType;
        this.componentId = componentId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getComponentId() {
        return this.componentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC25417b getHeartRateZoneType() {
        return this.heartRateZoneType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27143g)) {
            return false;
        }
        C27143g c27143g = (C27143g) other;
        return this.heartRateZoneType == c27143g.heartRateZoneType && AbstractC22676k.m65745e(this.componentId, c27143g.componentId);
    }

    public int hashCode() {
        return this.componentId.hashCode() + (this.heartRateZoneType.hashCode() * 31);
    }

    public String toString() {
        return "SelectedHeartRateZone(heartRateZoneType=" + this.heartRateZoneType + ", componentId=" + this.componentId + ")";
    }
}
