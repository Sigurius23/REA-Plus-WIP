package pw1;

import com.whoop.membership.familyPlan.domain.model.FamilyPlanScreenResponse;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pw1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lpw1/b;", "", "Lpw1/c;", "currentDialogType", "Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;", HMSTrackSource.SCREEN, "<init>", "(Lpw1/c;Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;)V", "a", "(Lpw1/c;Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;)Lpw1/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lpw1/c;", "c", "()Lpw1/c;", "b", "Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;", "d", "()Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29586b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC29587c currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FamilyPlanScreenResponse screen;

    public C29586b(InterfaceC29587c interfaceC29587c, FamilyPlanScreenResponse familyPlanScreenResponse) {
        this.currentDialogType = interfaceC29587c;
        this.screen = familyPlanScreenResponse;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C29586b m90697b(C29586b c29586b, InterfaceC29587c interfaceC29587c, FamilyPlanScreenResponse familyPlanScreenResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC29587c = c29586b.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            familyPlanScreenResponse = c29586b.screen;
        }
        return c29586b.m90698a(interfaceC29587c, familyPlanScreenResponse);
    }

    /* JADX INFO: renamed from: a */
    public final C29586b m90698a(InterfaceC29587c currentDialogType, FamilyPlanScreenResponse screen) {
        return new C29586b(currentDialogType, screen);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC29587c getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final FamilyPlanScreenResponse getScreen() {
        return this.screen;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29586b)) {
            return false;
        }
        C29586b c29586b = (C29586b) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c29586b.currentDialogType) && AbstractC22676k.m65745e(this.screen, c29586b.screen);
    }

    public int hashCode() {
        InterfaceC29587c interfaceC29587c = this.currentDialogType;
        int iHashCode = (interfaceC29587c == null ? 0 : interfaceC29587c.hashCode()) * 31;
        FamilyPlanScreenResponse familyPlanScreenResponse = this.screen;
        return iHashCode + (familyPlanScreenResponse != null ? familyPlanScreenResponse.hashCode() : 0);
    }

    public String toString() {
        return "FamilyPlanDomainResult(currentDialogType=" + this.currentDialogType + ", screen=" + this.screen + ")";
    }

    public /* synthetic */ C29586b(InterfaceC29587c interfaceC29587c, FamilyPlanScreenResponse familyPlanScreenResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC29587c, (i13 & 2) != 0 ? null : familyPlanScreenResponse);
    }
}
