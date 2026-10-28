package ws2;

import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationResponse;
import java.util.UUID;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sw0.C33050g;

/* JADX INFO: renamed from: ws2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b\u001f\u0010$¨\u0006%"}, m65681d2 = {"Lws2/d;", "", "Lws2/h;", "state", "Lws2/g;", "progressResult", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;", "response", "Lsw0/g;", "currentBottomSheet", "<init>", "(Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;)V", "a", "(Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;)Lws2/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lws2/h;", "f", "()Lws2/h;", "b", "Lws2/g;", "d", "()Lws2/g;", "c", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;", "e", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;", "Lsw0/g;", "()Lsw0/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37612d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC37616h state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C37615g progressResult;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final WeeklyPlanCustomizationResponse response;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C33050g currentBottomSheet;

    public C37612d(AbstractC37616h state, C37615g progressResult, WeeklyPlanCustomizationResponse response, C33050g currentBottomSheet) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(progressResult, "progressResult");
        AbstractC22676k.m65750j(response, "response");
        AbstractC22676k.m65750j(currentBottomSheet, "currentBottomSheet");
        this.state = state;
        this.progressResult = progressResult;
        this.response = response;
        this.currentBottomSheet = currentBottomSheet;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C37612d m120779b(C37612d c37612d, AbstractC37616h abstractC37616h, C37615g c37615g, WeeklyPlanCustomizationResponse weeklyPlanCustomizationResponse, C33050g c33050g, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC37616h = c37612d.state;
        }
        if ((i13 & 2) != 0) {
            c37615g = c37612d.progressResult;
        }
        if ((i13 & 4) != 0) {
            weeklyPlanCustomizationResponse = c37612d.response;
        }
        if ((i13 & 8) != 0) {
            c33050g = c37612d.currentBottomSheet;
        }
        return c37612d.m120780a(abstractC37616h, c37615g, weeklyPlanCustomizationResponse, c33050g);
    }

    /* JADX INFO: renamed from: a */
    public final C37612d m120780a(AbstractC37616h state, C37615g progressResult, WeeklyPlanCustomizationResponse response, C33050g currentBottomSheet) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(progressResult, "progressResult");
        AbstractC22676k.m65750j(response, "response");
        AbstractC22676k.m65750j(currentBottomSheet, "currentBottomSheet");
        return new C37612d(state, progressResult, response, currentBottomSheet);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C33050g getCurrentBottomSheet() {
        return this.currentBottomSheet;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C37615g getProgressResult() {
        return this.progressResult;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final WeeklyPlanCustomizationResponse getResponse() {
        return this.response;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37612d)) {
            return false;
        }
        C37612d c37612d = (C37612d) other;
        return AbstractC22676k.m65745e(this.state, c37612d.state) && AbstractC22676k.m65745e(this.progressResult, c37612d.progressResult) && AbstractC22676k.m65745e(this.response, c37612d.response) && AbstractC22676k.m65745e(this.currentBottomSheet, c37612d.currentBottomSheet);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC37616h getState() {
        return this.state;
    }

    public int hashCode() {
        return this.currentBottomSheet.hashCode() + ((this.response.hashCode() + ((this.progressResult.hashCode() + (this.state.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "CustomizePlanDomainResult(state=" + this.state + ", progressResult=" + this.progressResult + ", response=" + this.response + ", currentBottomSheet=" + this.currentBottomSheet + ")";
    }

    public /* synthetic */ C37612d(AbstractC37616h abstractC37616h, C37615g c37615g, WeeklyPlanCustomizationResponse weeklyPlanCustomizationResponse, C33050g c33050g, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC37616h.c.f160937a : abstractC37616h, (i13 & 2) != 0 ? new C37615g(0, 0, false, 7, null) : c37615g, (i13 & 4) != 0 ? new WeeklyPlanCustomizationResponse(new UUID(1L, 1L), C25271y.f99162w) : weeklyPlanCustomizationResponse, (i13 & 8) != 0 ? new C33050g(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null) : c33050g);
    }
}
