package bo0;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import wn0.C37416g;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: bo0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b(\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001e\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b&\u0010+R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b,\u0010%R\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b\"\u0010%¨\u0006/"}, m65681d2 = {"Lbo0/c;", "", "", "password", "", "Lwn0/g;", "validationResults", "", "isPasswordValid", "isLoadingRequirements", "isSubmittingPassword", "Lcom/whoop/design/util/TextResource;", "requirementsErrorMessage", "submissionErrorMessage", "isSuccess", "isExpired", "newLinkSent", "showExitDialog", "<init>", "(Ljava/lang/String;Ljava/util/List;ZZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "d", "g", "i", "f", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "j", "getNewLinkSent", "k", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3505c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String password;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C37416g> validationResults;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isPasswordValid;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isLoadingRequirements;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isSubmittingPassword;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource requirementsErrorMessage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource submissionErrorMessage;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isSuccess;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isExpired;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean newLinkSent;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean showExitDialog;

    public C3505c(String password, List<C37416g> validationResults, boolean z4, boolean z13, boolean z14, TextResource textResource, TextResource textResource2, boolean z15, boolean z16, boolean z17, boolean z18) {
        AbstractC22676k.m65750j(password, "password");
        AbstractC22676k.m65750j(validationResults, "validationResults");
        this.password = password;
        this.validationResults = validationResults;
        this.isPasswordValid = z4;
        this.isLoadingRequirements = z13;
        this.isSubmittingPassword = z14;
        this.requirementsErrorMessage = textResource;
        this.submissionErrorMessage = textResource2;
        this.isSuccess = z15;
        this.isExpired = z16;
        this.newLinkSent = z17;
        this.showExitDialog = z18;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getRequirementsErrorMessage() {
        return this.requirementsErrorMessage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShowExitDialog() {
        return this.showExitDialog;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubmissionErrorMessage() {
        return this.submissionErrorMessage;
    }

    /* JADX INFO: renamed from: e */
    public final List<C37416g> m10345e() {
        return this.validationResults;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3505c)) {
            return false;
        }
        C3505c c3505c = (C3505c) other;
        return AbstractC22676k.m65745e(this.password, c3505c.password) && AbstractC22676k.m65745e(this.validationResults, c3505c.validationResults) && this.isPasswordValid == c3505c.isPasswordValid && this.isLoadingRequirements == c3505c.isLoadingRequirements && this.isSubmittingPassword == c3505c.isSubmittingPassword && AbstractC22676k.m65745e(this.requirementsErrorMessage, c3505c.requirementsErrorMessage) && AbstractC22676k.m65745e(this.submissionErrorMessage, c3505c.submissionErrorMessage) && this.isSuccess == c3505c.isSuccess && this.isExpired == c3505c.isExpired && this.newLinkSent == c3505c.newLinkSent && this.showExitDialog == c3505c.showExitDialog;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsExpired() {
        return this.isExpired;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsLoadingRequirements() {
        return this.isLoadingRequirements;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsPasswordValid() {
        return this.isPasswordValid;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11895b.m31983b(this.password.hashCode() * 31, 31, this.validationResults), 31, this.isPasswordValid), 31, this.isLoadingRequirements), 31, this.isSubmittingPassword);
        TextResource textResource = this.requirementsErrorMessage;
        int iHashCode = (iM8289b + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.submissionErrorMessage;
        return Boolean.hashCode(this.showExitDialog) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (textResource2 != null ? textResource2.hashCode() : 0)) * 31, 31, this.isSuccess), 31, this.isExpired), 31, this.newLinkSent);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsSubmittingPassword() {
        return this.isSubmittingPassword;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public String toString() {
        List<C37416g> list = this.validationResults;
        boolean z4 = this.isPasswordValid;
        boolean z13 = this.isLoadingRequirements;
        boolean z14 = this.isSubmittingPassword;
        TextResource textResource = this.requirementsErrorMessage;
        TextResource textResource2 = this.submissionErrorMessage;
        boolean z15 = this.isSuccess;
        boolean z16 = this.isExpired;
        boolean z17 = this.newLinkSent;
        boolean z18 = this.showExitDialog;
        StringBuilder sb4 = new StringBuilder("ResetPasswordViewState(password=REDACTED, validationResults=");
        sb4.append(list);
        sb4.append(", isPasswordValid=");
        sb4.append(z4);
        sb4.append(", isLoadingRequirements=");
        AbstractC38963t7.m124392v(sb4, z13, ", isSubmittingPassword=", z14, ", requirementsErrorMessage=");
        AbstractC30007c.m91855y(sb4, textResource, ", submissionErrorMessage=", textResource2, ", isSuccess=");
        AbstractC38963t7.m124392v(sb4, z15, ",  isExpired=", z16, ", newLinkSent=");
        return AbstractC36095b.m114682j(sb4, z17, ", showExitDialog=", z18, ")");
    }

    public /* synthetic */ C3505c(String str, List list, boolean z4, boolean z13, boolean z14, TextResource textResource, TextResource textResource2, boolean z15, boolean z16, boolean z17, boolean z18, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? false : z14, (i13 & 32) != 0 ? null : textResource, (i13 & 64) != 0 ? null : textResource2, (i13 & 128) != 0 ? false : z15, (i13 & 256) != 0 ? false : z16, (i13 & 512) != 0 ? false : z17, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z18);
    }
}
