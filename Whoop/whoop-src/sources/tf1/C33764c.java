package tf1;

import com.whoop.feedbacksurvey.domain.models.FeedbackSurveyModels;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: tf1.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJR\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b\"\u0010%¨\u0006&"}, m65681d2 = {"Ltf1/c;", "", "", "reason", "details", "Ltf1/a;", "currentDialogType", "Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;", "response", "", "manualRefresh", "displayRefreshingSpinner", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ltf1/a;Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;ZZ)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ltf1/a;Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;ZZ)Ltf1/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "b", "d", "c", "Ltf1/a;", "()Ltf1/a;", "Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;", "e", "Z", "f", "()Z", "feedback-survey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33764c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String reason;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String details;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC33762a currentDialogType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeedbackSurveyModels response;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    public C33764c(String reason, String str, InterfaceC33762a interfaceC33762a, FeedbackSurveyModels feedbackSurveyModels, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(reason, "reason");
        this.reason = reason;
        this.details = str;
        this.currentDialogType = interfaceC33762a;
        this.response = feedbackSurveyModels;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C33764c m106749b(C33764c c33764c, String str, String str2, InterfaceC33762a interfaceC33762a, FeedbackSurveyModels feedbackSurveyModels, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c33764c.reason;
        }
        if ((i13 & 2) != 0) {
            str2 = c33764c.details;
        }
        if ((i13 & 4) != 0) {
            interfaceC33762a = c33764c.currentDialogType;
        }
        if ((i13 & 8) != 0) {
            feedbackSurveyModels = c33764c.response;
        }
        if ((i13 & 16) != 0) {
            z4 = c33764c.manualRefresh;
        }
        if ((i13 & 32) != 0) {
            z13 = c33764c.displayRefreshingSpinner;
        }
        boolean z14 = z4;
        boolean z15 = z13;
        return c33764c.m106750a(str, str2, interfaceC33762a, feedbackSurveyModels, z14, z15);
    }

    /* JADX INFO: renamed from: a */
    public final C33764c m106750a(String reason, String details, InterfaceC33762a currentDialogType, FeedbackSurveyModels response, boolean manualRefresh, boolean displayRefreshingSpinner) {
        AbstractC22676k.m65750j(reason, "reason");
        return new C33764c(reason, details, currentDialogType, response, manualRefresh, displayRefreshingSpinner);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC33762a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getDisplayRefreshingSpinner() {
        return this.displayRefreshingSpinner;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33764c)) {
            return false;
        }
        C33764c c33764c = (C33764c) other;
        return AbstractC22676k.m65745e(this.reason, c33764c.reason) && AbstractC22676k.m65745e(this.details, c33764c.details) && AbstractC22676k.m65745e(this.currentDialogType, c33764c.currentDialogType) && AbstractC22676k.m65745e(this.response, c33764c.response) && this.manualRefresh == c33764c.manualRefresh && this.displayRefreshingSpinner == c33764c.displayRefreshingSpinner;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getManualRefresh() {
        return this.manualRefresh;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final FeedbackSurveyModels getResponse() {
        return this.response;
    }

    public int hashCode() {
        int iHashCode = this.reason.hashCode() * 31;
        String str = this.details;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC33762a interfaceC33762a = this.currentDialogType;
        int iHashCode3 = (iHashCode2 + (interfaceC33762a == null ? 0 : interfaceC33762a.hashCode())) * 31;
        FeedbackSurveyModels feedbackSurveyModels = this.response;
        return Boolean.hashCode(this.displayRefreshingSpinner) + AbstractC2875y.m8289b((iHashCode3 + (feedbackSurveyModels != null ? feedbackSurveyModels.hashCode() : 0)) * 31, 31, this.manualRefresh);
    }

    public String toString() {
        String str = this.reason;
        String str2 = this.details;
        InterfaceC33762a interfaceC33762a = this.currentDialogType;
        FeedbackSurveyModels feedbackSurveyModels = this.response;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("FeedbackSurveyDomainState(reason=", str, ", details=", str2, ", currentDialogType=");
        sbM32001t.append(interfaceC33762a);
        sbM32001t.append(", response=");
        sbM32001t.append(feedbackSurveyModels);
        sbM32001t.append(", manualRefresh=");
        return AbstractC36095b.m114682j(sbM32001t, z4, ", displayRefreshingSpinner=", z13, ")");
    }

    public /* synthetic */ C33764c(String str, String str2, InterfaceC33762a interfaceC33762a, FeedbackSurveyModels feedbackSurveyModels, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "NO_REASON_PROVIDED" : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : interfaceC33762a, (i13 & 8) != 0 ? null : feedbackSurveyModels, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? false : z13);
    }
}
