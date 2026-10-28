package kt1;

import com.whoop.labrador.feature.eligibility.domain.model.LabradorEligibilityResponse;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kt1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lkt1/b;", "", "Lkt1/e;", "currentScreenType", "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;", "labradorEligibilityResponse", "<init>", "(Lkt1/e;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;)V", "a", "(Lkt1/e;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;)Lkt1/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkt1/e;", "c", "()Lkt1/e;", "b", "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;", "d", "()Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22826b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC22829e currentScreenType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LabradorEligibilityResponse labradorEligibilityResponse;

    public C22826b(InterfaceC22829e currentScreenType, LabradorEligibilityResponse labradorEligibilityResponse) {
        AbstractC22676k.m65750j(currentScreenType, "currentScreenType");
        this.currentScreenType = currentScreenType;
        this.labradorEligibilityResponse = labradorEligibilityResponse;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22826b m66190b(C22826b c22826b, InterfaceC22829e interfaceC22829e, LabradorEligibilityResponse labradorEligibilityResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC22829e = c22826b.currentScreenType;
        }
        if ((i13 & 2) != 0) {
            labradorEligibilityResponse = c22826b.labradorEligibilityResponse;
        }
        return c22826b.m66191a(interfaceC22829e, labradorEligibilityResponse);
    }

    /* JADX INFO: renamed from: a */
    public final C22826b m66191a(InterfaceC22829e currentScreenType, LabradorEligibilityResponse labradorEligibilityResponse) {
        AbstractC22676k.m65750j(currentScreenType, "currentScreenType");
        return new C22826b(currentScreenType, labradorEligibilityResponse);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC22829e getCurrentScreenType() {
        return this.currentScreenType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LabradorEligibilityResponse getLabradorEligibilityResponse() {
        return this.labradorEligibilityResponse;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22826b)) {
            return false;
        }
        C22826b c22826b = (C22826b) other;
        return AbstractC22676k.m65745e(this.currentScreenType, c22826b.currentScreenType) && AbstractC22676k.m65745e(this.labradorEligibilityResponse, c22826b.labradorEligibilityResponse);
    }

    public int hashCode() {
        int iHashCode = this.currentScreenType.hashCode() * 31;
        LabradorEligibilityResponse labradorEligibilityResponse = this.labradorEligibilityResponse;
        return iHashCode + (labradorEligibilityResponse == null ? 0 : labradorEligibilityResponse.hashCode());
    }

    public String toString() {
        return "LabradorEligibilityDomainState(currentScreenType=" + this.currentScreenType + ", labradorEligibilityResponse=" + this.labradorEligibilityResponse + ")";
    }

    public /* synthetic */ C22826b(InterfaceC22829e interfaceC22829e, LabradorEligibilityResponse labradorEligibilityResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC22829e.c.f89968a : interfaceC22829e, (i13 & 2) != 0 ? null : labradorEligibilityResponse);
    }
}
