package u22;

import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y71.C39282o;

/* JADX INFO: renamed from: u22.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lu22/j;", "", "Ly71/o;", "menuItemState", "", "", "analyticsProperties", "<init>", "(Ly71/o;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly71/o;", "b", "()Ly71/o;", "Ljava/util/Map;", "()Ljava/util/Map;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34495j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39282o menuItemState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Map<String, String> analyticsProperties;

    public C34495j(C39282o menuItemState, Map<String, String> map) {
        AbstractC22676k.m65750j(menuItemState, "menuItemState");
        this.menuItemState = menuItemState;
        this.analyticsProperties = map;
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, String> m109033a() {
        return this.analyticsProperties;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C39282o getMenuItemState() {
        return this.menuItemState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34495j)) {
            return false;
        }
        C34495j c34495j = (C34495j) other;
        return AbstractC22676k.m65745e(this.menuItemState, c34495j.menuItemState) && AbstractC22676k.m65745e(this.analyticsProperties, c34495j.analyticsProperties);
    }

    public int hashCode() {
        int iHashCode = this.menuItemState.hashCode() * 31;
        Map<String, String> map = this.analyticsProperties;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "PaymentMethodMenuItemResult(menuItemState=" + this.menuItemState + ", analyticsProperties=" + this.analyticsProperties + ")";
    }
}
