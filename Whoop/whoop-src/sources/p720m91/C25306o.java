package p720m91;

import com.whoop.analytics.AnalyticEventModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: m91.o */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lm91/o;", "", "Lm91/u;", "state", "Lcom/whoop/analytics/AnalyticEventModel;", "primaryAnalyticEvent", "<init>", "(Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;)V", "a", "(Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;)Lm91/o;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lm91/u;", "e", "()Lm91/u;", "b", "Lcom/whoop/analytics/AnalyticEventModel;", "d", "()Lcom/whoop/analytics/AnalyticEventModel;", "c", "()Ljava/lang/Object;", "id", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25306o {

    /* JADX INFO: renamed from: c */
    public static final int f99297c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC25312u state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AnalyticEventModel primaryAnalyticEvent;

    public C25306o(InterfaceC25312u state, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(state, "state");
        this.state = state;
        this.primaryAnalyticEvent = analyticEventModel;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C25306o m74314b(C25306o c25306o, InterfaceC25312u interfaceC25312u, AnalyticEventModel analyticEventModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC25312u = c25306o.state;
        }
        if ((i13 & 2) != 0) {
            analyticEventModel = c25306o.primaryAnalyticEvent;
        }
        return c25306o.m74315a(interfaceC25312u, analyticEventModel);
    }

    /* JADX INFO: renamed from: a */
    public final C25306o m74315a(InterfaceC25312u state, AnalyticEventModel primaryAnalyticEvent) {
        AbstractC22676k.m65750j(state, "state");
        return new C25306o(state, primaryAnalyticEvent);
    }

    /* JADX INFO: renamed from: c */
    public final Object m74316c() {
        InterfaceC25312u interfaceC25312u = this.state;
        InterfaceC25305n interfaceC25305n = interfaceC25312u instanceof InterfaceC25305n ? (InterfaceC25305n) interfaceC25312u : null;
        if (interfaceC25305n != null) {
            return interfaceC25305n.getId();
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AnalyticEventModel getPrimaryAnalyticEvent() {
        return this.primaryAnalyticEvent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC25312u getState() {
        return this.state;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25306o)) {
            return false;
        }
        C25306o c25306o = (C25306o) other;
        return AbstractC22676k.m65745e(this.state, c25306o.state) && AbstractC22676k.m65745e(this.primaryAnalyticEvent, c25306o.primaryAnalyticEvent);
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        AnalyticEventModel analyticEventModel = this.primaryAnalyticEvent;
        return iHashCode + (analyticEventModel == null ? 0 : analyticEventModel.hashCode());
    }

    public String toString() {
        return "ItemStateWrapper(state=" + this.state + ", primaryAnalyticEvent=" + this.primaryAnalyticEvent + ")";
    }

    public /* synthetic */ C25306o(InterfaceC25312u interfaceC25312u, AnalyticEventModel analyticEventModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC25312u, (i13 & 2) != 0 ? null : analyticEventModel);
    }
}
