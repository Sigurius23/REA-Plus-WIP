package pu2;

import com.whoop.design.util.TextResource;
import cu2.AbstractC11123c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pu2.r */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lpu2/r;", "", "Lcom/whoop/design/util/TextResource;", "currentHeartRate", "", "zoneColor", "<init>", "(Lcom/whoop/design/util/TextResource;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "I", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29570r {

    /* JADX INFO: renamed from: c */
    public static final int f120637c = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource currentHeartRate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int zoneColor;

    public C29570r(TextResource currentHeartRate, int i13) {
        AbstractC22676k.m65750j(currentHeartRate, "currentHeartRate");
        this.currentHeartRate = currentHeartRate;
        this.zoneColor = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getCurrentHeartRate() {
        return this.currentHeartRate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getZoneColor() {
        return this.zoneColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29570r)) {
            return false;
        }
        C29570r c29570r = (C29570r) other;
        return AbstractC22676k.m65745e(this.currentHeartRate, c29570r.currentHeartRate) && this.zoneColor == c29570r.zoneColor;
    }

    public int hashCode() {
        return Integer.hashCode(this.zoneColor) + (this.currentHeartRate.hashCode() * 31);
    }

    public String toString() {
        return "NotificationHeartRateDisplayState(currentHeartRate=" + this.currentHeartRate + ", zoneColor=" + this.zoneColor + ")";
    }

    public /* synthetic */ C29570r(TextResource textResource, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, (i14 & 2) != 0 ? AbstractC11123c.f35347d : i13);
    }
}
