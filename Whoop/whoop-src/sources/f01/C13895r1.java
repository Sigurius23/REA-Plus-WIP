package f01;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f01.r1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b\u0017\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b\u001f\u0010%¨\u0006&"}, m65681d2 = {"Lf01/r1;", "", "Lgz0/m0;", "icon", "Lcom/whoop/whoopaction/domain/models/Action;", "resolvedAction", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "", "fallsThrough", "<init>", "(Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "d", "()Lgz0/m0;", "b", "Lcom/whoop/whoopaction/domain/models/Action;", "e", "()Lcom/whoop/whoopaction/domain/models/Action;", "c", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13895r1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Action resolvedAction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AnalyticEventModel analyticEvent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean fallsThrough;

    public C13895r1(EnumC16313m0 icon, Action action, C9598e c9598e, AnalyticEventModel analyticEventModel, boolean z4) {
        AbstractC22676k.m65750j(icon, "icon");
        this.icon = icon;
        this.resolvedAction = action;
        this.destination = c9598e;
        this.analyticEvent = analyticEventModel;
        this.fallsThrough = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getFallsThrough() {
        return this.fallsThrough;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Action getResolvedAction() {
        return this.resolvedAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13895r1)) {
            return false;
        }
        C13895r1 c13895r1 = (C13895r1) other;
        return this.icon == c13895r1.icon && AbstractC22676k.m65745e(this.resolvedAction, c13895r1.resolvedAction) && AbstractC22676k.m65745e(this.destination, c13895r1.destination) && AbstractC22676k.m65745e(this.analyticEvent, c13895r1.analyticEvent) && this.fallsThrough == c13895r1.fallsThrough;
    }

    public int hashCode() {
        int iHashCode = this.icon.hashCode() * 31;
        Action action = this.resolvedAction;
        int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode3 = (iHashCode2 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return Boolean.hashCode(this.fallsThrough) + ((iHashCode3 + (analyticEventModel != null ? analyticEventModel.hashCode() : 0)) * 31);
    }

    public String toString() {
        EnumC16313m0 enumC16313m0 = this.icon;
        Action action = this.resolvedAction;
        C9598e c9598e = this.destination;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        boolean z4 = this.fallsThrough;
        StringBuilder sb4 = new StringBuilder("TrailingIconState(icon=");
        sb4.append(enumC16313m0);
        sb4.append(", resolvedAction=");
        sb4.append(action);
        sb4.append(", destination=");
        sb4.append(c9598e);
        sb4.append(", analyticEvent=");
        sb4.append(analyticEventModel);
        sb4.append(", fallsThrough=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }
}
