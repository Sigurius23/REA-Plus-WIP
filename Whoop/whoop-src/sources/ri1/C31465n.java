package ri1;

import cj1.C4757m;
import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ri1.n */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lri1/n;", "", "Lri1/m;", "result", "Lcj1/m;", "viewState", "", "hasClosedCalibration", "<init>", "(Lri1/m;Lcj1/m;Z)V", "a", "(Lri1/m;Lcj1/m;Z)Lri1/n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lri1/m;", "d", "()Lri1/m;", "b", "Lcj1/m;", "e", "()Lcj1/m;", "c", "Z", "()Z", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31465n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC31464m result;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C4757m viewState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean hasClosedCalibration;

    public C31465n(InterfaceC31464m result, C4757m c4757m, boolean z4) {
        AbstractC22676k.m65750j(result, "result");
        this.result = result;
        this.viewState = c4757m;
        this.hasClosedCalibration = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C31465n m96899b(C31465n c31465n, InterfaceC31464m interfaceC31464m, C4757m c4757m, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC31464m = c31465n.result;
        }
        if ((i13 & 2) != 0) {
            c4757m = c31465n.viewState;
        }
        if ((i13 & 4) != 0) {
            z4 = c31465n.hasClosedCalibration;
        }
        return c31465n.m96900a(interfaceC31464m, c4757m, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C31465n m96900a(InterfaceC31464m result, C4757m viewState, boolean hasClosedCalibration) {
        AbstractC22676k.m65750j(result, "result");
        return new C31465n(result, viewState, hasClosedCalibration);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHasClosedCalibration() {
        return this.hasClosedCalibration;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC31464m getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C4757m getViewState() {
        return this.viewState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31465n)) {
            return false;
        }
        C31465n c31465n = (C31465n) other;
        return AbstractC22676k.m65745e(this.result, c31465n.result) && AbstractC22676k.m65745e(this.viewState, c31465n.viewState) && this.hasClosedCalibration == c31465n.hasClosedCalibration;
    }

    public int hashCode() {
        int iHashCode = this.result.hashCode() * 31;
        C4757m c4757m = this.viewState;
        return Boolean.hashCode(this.hasClosedCalibration) + ((iHashCode + (c4757m == null ? 0 : c4757m.hashCode())) * 31);
    }

    public String toString() {
        InterfaceC31464m interfaceC31464m = this.result;
        C4757m c4757m = this.viewState;
        boolean z4 = this.hasClosedCalibration;
        StringBuilder sb4 = new StringBuilder("HealthspanHeroMetricDomainState(result=");
        sb4.append(interfaceC31464m);
        sb4.append(", viewState=");
        sb4.append(c4757m);
        sb4.append(", hasClosedCalibration=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ C31465n(InterfaceC31464m interfaceC31464m, C4757m c4757m, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC31464m, (i13 & 2) != 0 ? null : c4757m, (i13 & 4) != 0 ? false : z4);
    }
}
