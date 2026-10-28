package c42;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: c42.r */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012Jp\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b(\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b%\u0010/R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b$\u00100\u001a\u0004\b#\u00101¨\u00062"}, m65681d2 = {"Lc42/r;", "", "", "dueDateLoading", "isLoading", "isGeneralError", "isDueDateUpdateError", "", "previousDueDate", "Lc42/q;", "settingsScreenViewState", "Lc42/h;", "onboardingScreenViewState", "Lc42/e;", "onboardingSavedViewState", "Lc42/g;", "educationContent", "<init>", "(ZZZZLjava/lang/String;Lc42/q;Lc42/h;Lc42/e;Lc42/g;)V", "a", "(ZZZZLjava/lang/String;Lc42/q;Lc42/h;Lc42/e;Lc42/g;)Lc42/r;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "c", "()Z", "b", "k", "j", "d", "i", "e", "Ljava/lang/String;", "g", "f", "Lc42/q;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lc42/q;", "Lc42/h;", "()Lc42/h;", "Lc42/e;", "()Lc42/e;", "Lc42/g;", "()Lc42/g;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4181r {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean dueDateLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isGeneralError;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isDueDateUpdateError;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String previousDueDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C4180q settingsScreenViewState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C4171h onboardingScreenViewState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C4168e onboardingSavedViewState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C4170g educationContent;

    public C4181r(boolean z4, boolean z13, boolean z14, boolean z15, String previousDueDate, C4180q c4180q, C4171h c4171h, C4168e c4168e, C4170g educationContent) {
        AbstractC22676k.m65750j(previousDueDate, "previousDueDate");
        AbstractC22676k.m65750j(educationContent, "educationContent");
        this.dueDateLoading = z4;
        this.isLoading = z13;
        this.isGeneralError = z14;
        this.isDueDateUpdateError = z15;
        this.previousDueDate = previousDueDate;
        this.settingsScreenViewState = c4180q;
        this.onboardingScreenViewState = c4171h;
        this.onboardingSavedViewState = c4168e;
        this.educationContent = educationContent;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4181r m13054b(C4181r c4181r, boolean z4, boolean z13, boolean z14, boolean z15, String str, C4180q c4180q, C4171h c4171h, C4168e c4168e, C4170g c4170g, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c4181r.dueDateLoading;
        }
        if ((i13 & 2) != 0) {
            z13 = c4181r.isLoading;
        }
        if ((i13 & 4) != 0) {
            z14 = c4181r.isGeneralError;
        }
        if ((i13 & 8) != 0) {
            z15 = c4181r.isDueDateUpdateError;
        }
        if ((i13 & 16) != 0) {
            str = c4181r.previousDueDate;
        }
        if ((i13 & 32) != 0) {
            c4180q = c4181r.settingsScreenViewState;
        }
        if ((i13 & 64) != 0) {
            c4171h = c4181r.onboardingScreenViewState;
        }
        if ((i13 & 128) != 0) {
            c4168e = c4181r.onboardingSavedViewState;
        }
        if ((i13 & 256) != 0) {
            c4170g = c4181r.educationContent;
        }
        C4168e c4168e2 = c4168e;
        C4170g c4170g2 = c4170g;
        C4180q c4180q2 = c4180q;
        C4171h c4171h2 = c4171h;
        String str2 = str;
        boolean z16 = z14;
        return c4181r.m13055a(z4, z13, z16, z15, str2, c4180q2, c4171h2, c4168e2, c4170g2);
    }

    /* JADX INFO: renamed from: a */
    public final C4181r m13055a(boolean dueDateLoading, boolean isLoading, boolean isGeneralError, boolean isDueDateUpdateError, String previousDueDate, C4180q settingsScreenViewState, C4171h onboardingScreenViewState, C4168e onboardingSavedViewState, C4170g educationContent) {
        AbstractC22676k.m65750j(previousDueDate, "previousDueDate");
        AbstractC22676k.m65750j(educationContent, "educationContent");
        return new C4181r(dueDateLoading, isLoading, isGeneralError, isDueDateUpdateError, previousDueDate, settingsScreenViewState, onboardingScreenViewState, onboardingSavedViewState, educationContent);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getDueDateLoading() {
        return this.dueDateLoading;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C4170g getEducationContent() {
        return this.educationContent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C4168e getOnboardingSavedViewState() {
        return this.onboardingSavedViewState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4181r)) {
            return false;
        }
        C4181r c4181r = (C4181r) other;
        return this.dueDateLoading == c4181r.dueDateLoading && this.isLoading == c4181r.isLoading && this.isGeneralError == c4181r.isGeneralError && this.isDueDateUpdateError == c4181r.isDueDateUpdateError && AbstractC22676k.m65745e(this.previousDueDate, c4181r.previousDueDate) && AbstractC22676k.m65745e(this.settingsScreenViewState, c4181r.settingsScreenViewState) && AbstractC22676k.m65745e(this.onboardingScreenViewState, c4181r.onboardingScreenViewState) && AbstractC22676k.m65745e(this.onboardingSavedViewState, c4181r.onboardingSavedViewState) && AbstractC22676k.m65745e(this.educationContent, c4181r.educationContent);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C4171h getOnboardingScreenViewState() {
        return this.onboardingScreenViewState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPreviousDueDate() {
        return this.previousDueDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C4180q getSettingsScreenViewState() {
        return this.settingsScreenViewState;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.dueDateLoading) * 31, 31, this.isLoading), 31, this.isGeneralError), 31, this.isDueDateUpdateError), 31, this.previousDueDate);
        C4180q c4180q = this.settingsScreenViewState;
        int iHashCode = (iM30450d + (c4180q == null ? 0 : c4180q.hashCode())) * 31;
        C4171h c4171h = this.onboardingScreenViewState;
        int iHashCode2 = (iHashCode + (c4171h == null ? 0 : c4171h.hashCode())) * 31;
        C4168e c4168e = this.onboardingSavedViewState;
        return this.educationContent.hashCode() + ((iHashCode2 + (c4168e != null ? c4168e.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsDueDateUpdateError() {
        return this.isDueDateUpdateError;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsGeneralError() {
        return this.isGeneralError;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        boolean z4 = this.dueDateLoading;
        boolean z13 = this.isLoading;
        boolean z14 = this.isGeneralError;
        boolean z15 = this.isDueDateUpdateError;
        String str = this.previousDueDate;
        C4180q c4180q = this.settingsScreenViewState;
        C4171h c4171h = this.onboardingScreenViewState;
        C4168e c4168e = this.onboardingSavedViewState;
        C4170g c4170g = this.educationContent;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("PregnancySettingsViewState(dueDateLoading=", ", isLoading=", ", isGeneralError=", z4, z13);
        AbstractC38963t7.m124392v(sbM32002u, z14, ", isDueDateUpdateError=", z15, ", previousDueDate=");
        sbM32002u.append(str);
        sbM32002u.append(", settingsScreenViewState=");
        sbM32002u.append(c4180q);
        sbM32002u.append(", onboardingScreenViewState=");
        sbM32002u.append(c4171h);
        sbM32002u.append(", onboardingSavedViewState=");
        sbM32002u.append(c4168e);
        sbM32002u.append(", educationContent=");
        sbM32002u.append(c4170g);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C4181r(boolean z4, boolean z13, boolean z14, boolean z15, String str, C4180q c4180q, C4171h c4171h, C4168e c4168e, C4170g c4170g, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? false : z15, (i13 & 16) != 0 ? "" : str, (i13 & 32) != 0 ? null : c4180q, (i13 & 64) != 0 ? null : c4171h, (i13 & 128) != 0 ? null : c4168e, (i13 & 256) != 0 ? new C4170g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : c4170g);
    }
}
