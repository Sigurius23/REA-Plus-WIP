package vo0;

import com.whoop.coacheverywhere.onboarding.model.CoachOnboardingStepModel;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: vo0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJT\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001a\u0010(\u001a\u0004\b&\u0010\u0013R\u0013\u0010*\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b \u0010)R\u0011\u0010,\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b+\u0010%R\u0011\u0010.\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b-\u0010%¨\u0006/"}, m65681d2 = {"Lvo0/b;", "", "", "featureId", "", "Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepModel;", "steps", "", "currentStepIndex", "", "isCompleted", "isLoading", "", "error", "<init>", "(JLjava/util/List;IZZLjava/lang/String;)V", "a", "(JLjava/util/List;IZZLjava/lang/String;)Lvo0/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "f", "()J", "b", "Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/List;", "c", "I", "d", "Z", "i", "()Z", "e", "k", "Ljava/lang/String;", "()Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepModel;", "currentStep", "j", "isLastStep", "g", "hasSteps", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36224b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long featureId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<CoachOnboardingStepModel> steps;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int currentStepIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isCompleted;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String error;

    public C36224b(long j7, List<CoachOnboardingStepModel> steps, int i13, boolean z4, boolean z13, String str) {
        AbstractC22676k.m65750j(steps, "steps");
        this.featureId = j7;
        this.steps = steps;
        this.currentStepIndex = i13;
        this.isCompleted = z4;
        this.isLoading = z13;
        this.error = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C36224b m115342b(C36224b c36224b, long j7, List list, int i13, boolean z4, boolean z13, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j7 = c36224b.featureId;
        }
        long j13 = j7;
        if ((i14 & 2) != 0) {
            list = c36224b.steps;
        }
        List list2 = list;
        if ((i14 & 4) != 0) {
            i13 = c36224b.currentStepIndex;
        }
        int i15 = i13;
        if ((i14 & 8) != 0) {
            z4 = c36224b.isCompleted;
        }
        boolean z14 = z4;
        if ((i14 & 16) != 0) {
            z13 = c36224b.isLoading;
        }
        boolean z15 = z13;
        if ((i14 & 32) != 0) {
            str = c36224b.error;
        }
        return c36224b.m115343a(j13, list2, i15, z14, z15, str);
    }

    /* JADX INFO: renamed from: a */
    public final C36224b m115343a(long featureId, List<CoachOnboardingStepModel> steps, int currentStepIndex, boolean isCompleted, boolean isLoading, String error) {
        AbstractC22676k.m65750j(steps, "steps");
        return new C36224b(featureId, steps, currentStepIndex, isCompleted, isLoading, error);
    }

    /* JADX INFO: renamed from: c */
    public final CoachOnboardingStepModel m115344c() {
        return (CoachOnboardingStepModel) AbstractC25265s.m74102I0(this.currentStepIndex, this.steps);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCurrentStepIndex() {
        return this.currentStepIndex;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36224b)) {
            return false;
        }
        C36224b c36224b = (C36224b) other;
        return this.featureId == c36224b.featureId && AbstractC22676k.m65745e(this.steps, c36224b.steps) && this.currentStepIndex == c36224b.currentStepIndex && this.isCompleted == c36224b.isCompleted && this.isLoading == c36224b.isLoading && AbstractC22676k.m65745e(this.error, c36224b.error);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getFeatureId() {
        return this.featureId;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m115348g() {
        return !this.steps.isEmpty();
    }

    /* JADX INFO: renamed from: h */
    public final List<CoachOnboardingStepModel> m115349h() {
        return this.steps;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.currentStepIndex, AbstractC11895b.m31983b(Long.hashCode(this.featureId) * 31, 31, this.steps), 31), 31, this.isCompleted), 31, this.isLoading);
        String str = this.error;
        return iM8289b + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsCompleted() {
        return this.isCompleted;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m115351j() {
        return this.currentStepIndex == AbstractC37056f.m118951C(this.steps);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "CoachOnboardingDomainResult(featureId=" + this.featureId + ", steps=" + this.steps + ", currentStepIndex=" + this.currentStepIndex + ", isCompleted=" + this.isCompleted + ", isLoading=" + this.isLoading + ", error=" + this.error + ")";
    }

    public /* synthetic */ C36224b(long j7, List list, int i13, boolean z4, boolean z13, String str, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0L : j7, (i14 & 2) != 0 ? C25271y.f99162w : list, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? false : z4, (i14 & 16) == 0 ? z13 : false, (i14 & 32) != 0 ? null : str);
    }
}
