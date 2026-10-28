package eq2;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import lr2.C24702c;
import lr2.InterfaceC24703d;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import zp2.C40943a;

/* JADX INFO: renamed from: eq2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\"\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b#\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b&\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0014R\u0011\u00102\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u00101R\u0011\u00104\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b.\u00103¨\u00065"}, m65681d2 = {"Leq2/b;", "", "", "Llr2/d;", "steps", "", "currentStepIndex", "totalSteps", "Leq2/a;", "headerViewState", "Llr2/c;", "landingViewState", "Lzp2/a;", "sectionProgress", "previousStepIndex", "", "submittedTimeCapsuleText", "<init>", "(Ljava/util/List;IILeq2/a;Llr2/c;Lzp2/a;Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "f", "()Ljava/util/List;", "b", "I", "c", "g", "d", "Leq2/a;", "()Leq2/a;", "e", "Llr2/c;", "()Llr2/c;", "Lzp2/a;", "()Lzp2/a;", "Ljava/lang/Integer;", "getPreviousStepIndex", "()Ljava/lang/Integer;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/lang/String;", "getSubmittedTimeCapsuleText", "()Llr2/d;", "currentStep", "()Z", "isLastStep", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13564b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC24703d> steps;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int currentStepIndex;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int totalSteps;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C13563a headerViewState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C24702c landingViewState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C40943a sectionProgress;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Integer previousStepIndex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String submittedTimeCapsuleText;

    /* JADX WARN: Multi-variable type inference failed */
    public C13564b(List<? extends InterfaceC24703d> steps, int i13, int i14, C13563a headerViewState, C24702c c24702c, C40943a c40943a, Integer num, String str) {
        AbstractC22676k.m65750j(steps, "steps");
        AbstractC22676k.m65750j(headerViewState, "headerViewState");
        this.steps = steps;
        this.currentStepIndex = i13;
        this.totalSteps = i14;
        this.headerViewState = headerViewState;
        this.landingViewState = c24702c;
        this.sectionProgress = c40943a;
        this.previousStepIndex = num;
        this.submittedTimeCapsuleText = str;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC24703d m38290a() {
        return this.steps.get(this.currentStepIndex);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCurrentStepIndex() {
        return this.currentStepIndex;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C13563a getHeaderViewState() {
        return this.headerViewState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C24702c getLandingViewState() {
        return this.landingViewState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C40943a getSectionProgress() {
        return this.sectionProgress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13564b)) {
            return false;
        }
        C13564b c13564b = (C13564b) other;
        return AbstractC22676k.m65745e(this.steps, c13564b.steps) && this.currentStepIndex == c13564b.currentStepIndex && this.totalSteps == c13564b.totalSteps && AbstractC22676k.m65745e(this.headerViewState, c13564b.headerViewState) && AbstractC22676k.m65745e(this.landingViewState, c13564b.landingViewState) && AbstractC22676k.m65745e(this.sectionProgress, c13564b.sectionProgress) && AbstractC22676k.m65745e(this.previousStepIndex, c13564b.previousStepIndex) && AbstractC22676k.m65745e(this.submittedTimeCapsuleText, c13564b.submittedTimeCapsuleText);
    }

    /* JADX INFO: renamed from: f */
    public final List<InterfaceC24703d> m38295f() {
        return this.steps;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getTotalSteps() {
        return this.totalSteps;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m38297h() {
        return this.currentStepIndex == this.totalSteps - 1;
    }

    public int hashCode() {
        int iHashCode = (this.headerViewState.hashCode() + AbstractC11266d.m30448b(this.totalSteps, AbstractC11266d.m30448b(this.currentStepIndex, this.steps.hashCode() * 31, 31), 31)) * 31;
        C24702c c24702c = this.landingViewState;
        int iHashCode2 = (iHashCode + (c24702c == null ? 0 : c24702c.hashCode())) * 31;
        C40943a c40943a = this.sectionProgress;
        int iHashCode3 = (iHashCode2 + (c40943a == null ? 0 : c40943a.hashCode())) * 31;
        Integer num = this.previousStepIndex;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.submittedTimeCapsuleText;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "JourneyReadyState(steps=" + this.steps + ", currentStepIndex=" + this.currentStepIndex + ", totalSteps=" + this.totalSteps + ", headerViewState=" + this.headerViewState + ", landingViewState=" + this.landingViewState + ", sectionProgress=" + this.sectionProgress + ", previousStepIndex=" + this.previousStepIndex + ", submittedTimeCapsuleText=" + this.submittedTimeCapsuleText + ")";
    }

    public /* synthetic */ C13564b(List list, int i13, int i14, C13563a c13563a, C24702c c24702c, C40943a c40943a, Integer num, String str, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i13, i14, c13563a, (i15 & 16) != 0 ? null : c24702c, (i15 & 32) != 0 ? null : c40943a, (i15 & 64) != 0 ? null : num, (i15 & 128) != 0 ? null : str);
    }
}
