package so1;

import com.whoop.design.util.TextResource;
import hy0.C17731c2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: so1.j0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lso1/j0;", "", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "", "icon", "Lhy0/c2;", "trend", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lhy0/c2;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "Lhy0/c2;", "()Lhy0/c2;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32821j0 {

    /* JADX INFO: renamed from: d */
    public static final int f136736d = C17731c2.f68917p | TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17731c2 trend;

    public C32821j0(TextResource titleDisplay, Integer num, C17731c2 trend) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(trend, "trend");
        this.titleDisplay = titleDisplay;
        this.icon = num;
        this.trend = trend;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C17731c2 getTrend() {
        return this.trend;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32821j0)) {
            return false;
        }
        C32821j0 c32821j0 = (C32821j0) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c32821j0.titleDisplay) && AbstractC22676k.m65745e(this.icon, c32821j0.icon) && AbstractC22676k.m65745e(this.trend, c32821j0.trend);
    }

    public int hashCode() {
        int iHashCode = this.titleDisplay.hashCode() * 31;
        Integer num = this.icon;
        return this.trend.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public String toString() {
        return "PhaseStatViewState(titleDisplay=" + this.titleDisplay + ", icon=" + this.icon + ", trend=" + this.trend + ")";
    }
}
