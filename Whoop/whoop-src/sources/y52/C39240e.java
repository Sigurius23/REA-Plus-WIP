package y52;

import com.whoop.recoveryimpacts.domain.model.RecoveryImpactsResponse;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: y52.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ly52/e;", "", "Ly52/d;", "result", "Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsResponse;", "response", "<init>", "(Ly52/d;Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly52/d;", "b", "()Ly52/d;", "Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsResponse;", "()Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsResponse;", "recovery-impacts-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39240e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39239d result;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final RecoveryImpactsResponse response;

    public C39240e(InterfaceC39239d result, RecoveryImpactsResponse recoveryImpactsResponse) {
        AbstractC22676k.m65750j(result, "result");
        this.result = result;
        this.response = recoveryImpactsResponse;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final RecoveryImpactsResponse getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39239d getResult() {
        return this.result;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39240e)) {
            return false;
        }
        C39240e c39240e = (C39240e) other;
        return AbstractC22676k.m65745e(this.result, c39240e.result) && AbstractC22676k.m65745e(this.response, c39240e.response);
    }

    public int hashCode() {
        int iHashCode = this.result.hashCode() * 31;
        RecoveryImpactsResponse recoveryImpactsResponse = this.response;
        return iHashCode + (recoveryImpactsResponse == null ? 0 : recoveryImpactsResponse.hashCode());
    }

    public String toString() {
        return "RecoveryImpactsTileDomainState(result=" + this.result + ", response=" + this.response + ")";
    }

    public /* synthetic */ C39240e(InterfaceC39239d interfaceC39239d, RecoveryImpactsResponse recoveryImpactsResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC39239d, (i13 & 2) != 0 ? null : recoveryImpactsResponse);
    }
}
