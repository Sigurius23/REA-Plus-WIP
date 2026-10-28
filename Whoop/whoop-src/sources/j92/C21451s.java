package j92;

import com.whoop.domain.model.AuthMaterial;
import or2.AbstractC28153d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j92.s */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u0016\u0010\"¨\u0006#"}, m65681d2 = {"Lj92/s;", "", "Lcom/whoop/domain/model/AuthMaterial;", "authMaterial", "", "differentOperationHandlesSuccessfulRefreshCall", "shouldSignUserOut", "Lj92/j;", "metric", "Lor2/d;", "analyticEvent", "<init>", "(Lcom/whoop/domain/model/AuthMaterial;ZZLj92/j;Lor2/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/domain/model/AuthMaterial;", "b", "()Lcom/whoop/domain/model/AuthMaterial;", "Z", "c", "()Z", "e", "d", "Lj92/j;", "()Lj92/j;", "Lor2/d;", "()Lor2/d;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21451s {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AuthMaterial authMaterial;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean differentOperationHandlesSuccessfulRefreshCall;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean shouldSignUserOut;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC21442j metric;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC28153d analyticEvent;

    public C21451s(AuthMaterial authMaterial, boolean z4, boolean z13, InterfaceC21442j interfaceC21442j, AbstractC28153d abstractC28153d) {
        this.authMaterial = authMaterial;
        this.differentOperationHandlesSuccessfulRefreshCall = z4;
        this.shouldSignUserOut = z13;
        this.metric = interfaceC21442j;
        this.analyticEvent = abstractC28153d;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC28153d getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AuthMaterial getAuthMaterial() {
        return this.authMaterial;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getDifferentOperationHandlesSuccessfulRefreshCall() {
        return this.differentOperationHandlesSuccessfulRefreshCall;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC21442j getMetric() {
        return this.metric;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShouldSignUserOut() {
        return this.shouldSignUserOut;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21451s)) {
            return false;
        }
        C21451s c21451s = (C21451s) other;
        return AbstractC22676k.m65745e(this.authMaterial, c21451s.authMaterial) && this.differentOperationHandlesSuccessfulRefreshCall == c21451s.differentOperationHandlesSuccessfulRefreshCall && this.shouldSignUserOut == c21451s.shouldSignUserOut && AbstractC22676k.m65745e(this.metric, c21451s.metric) && AbstractC22676k.m65745e(this.analyticEvent, c21451s.analyticEvent);
    }

    public int hashCode() {
        AuthMaterial authMaterial = this.authMaterial;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((authMaterial == null ? 0 : authMaterial.hashCode()) * 31, 31, this.differentOperationHandlesSuccessfulRefreshCall), 31, this.shouldSignUserOut);
        InterfaceC21442j interfaceC21442j = this.metric;
        int iHashCode = (iM8289b + (interfaceC21442j == null ? 0 : interfaceC21442j.hashCode())) * 31;
        AbstractC28153d abstractC28153d = this.analyticEvent;
        return iHashCode + (abstractC28153d != null ? abstractC28153d.hashCode() : 0);
    }

    public String toString() {
        return "TokenRefreshResult(authMaterial=" + this.authMaterial + ", differentOperationHandlesSuccessfulRefreshCall=" + this.differentOperationHandlesSuccessfulRefreshCall + ", shouldSignUserOut=" + this.shouldSignUserOut + ", metric=" + this.metric + ", analyticEvent=" + this.analyticEvent + ")";
    }
}
