package rd2;

import com.whoop.shepherd.feature.detail.domain.models.ShepherdHistoryDetailResponse;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: rd2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lrd2/b;", "", "Lrd2/e;", "currentScreenType", "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;", "historyDetailResponse", "<init>", "(Lrd2/e;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;)V", "a", "(Lrd2/e;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;)Lrd2/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrd2/e;", "c", "()Lrd2/e;", "b", "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;", "d", "()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31248b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC31251e currentScreenType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ShepherdHistoryDetailResponse historyDetailResponse;

    public C31248b(InterfaceC31251e currentScreenType, ShepherdHistoryDetailResponse shepherdHistoryDetailResponse) {
        AbstractC22676k.m65750j(currentScreenType, "currentScreenType");
        this.currentScreenType = currentScreenType;
        this.historyDetailResponse = shepherdHistoryDetailResponse;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C31248b m96259b(C31248b c31248b, InterfaceC31251e interfaceC31251e, ShepherdHistoryDetailResponse shepherdHistoryDetailResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC31251e = c31248b.currentScreenType;
        }
        if ((i13 & 2) != 0) {
            shepherdHistoryDetailResponse = c31248b.historyDetailResponse;
        }
        return c31248b.m96260a(interfaceC31251e, shepherdHistoryDetailResponse);
    }

    /* JADX INFO: renamed from: a */
    public final C31248b m96260a(InterfaceC31251e currentScreenType, ShepherdHistoryDetailResponse historyDetailResponse) {
        AbstractC22676k.m65750j(currentScreenType, "currentScreenType");
        return new C31248b(currentScreenType, historyDetailResponse);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC31251e getCurrentScreenType() {
        return this.currentScreenType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ShepherdHistoryDetailResponse getHistoryDetailResponse() {
        return this.historyDetailResponse;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31248b)) {
            return false;
        }
        C31248b c31248b = (C31248b) other;
        return AbstractC22676k.m65745e(this.currentScreenType, c31248b.currentScreenType) && AbstractC22676k.m65745e(this.historyDetailResponse, c31248b.historyDetailResponse);
    }

    public int hashCode() {
        int iHashCode = this.currentScreenType.hashCode() * 31;
        ShepherdHistoryDetailResponse shepherdHistoryDetailResponse = this.historyDetailResponse;
        return iHashCode + (shepherdHistoryDetailResponse == null ? 0 : shepherdHistoryDetailResponse.hashCode());
    }

    public String toString() {
        return "ShepherdHistoryDetailDomainState(currentScreenType=" + this.currentScreenType + ", historyDetailResponse=" + this.historyDetailResponse + ")";
    }

    public /* synthetic */ C31248b(InterfaceC31251e interfaceC31251e, ShepherdHistoryDetailResponse shepherdHistoryDetailResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC31251e.e.f128752a : interfaceC31251e, (i13 & 2) != 0 ? null : shepherdHistoryDetailResponse);
    }
}
