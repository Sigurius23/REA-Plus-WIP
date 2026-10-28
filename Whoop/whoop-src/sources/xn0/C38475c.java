package xn0;

import com.whoop.service.network.model.PasswordRequirement;
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
import wn0.AbstractC37412c;
import wn0.AbstractC37414e;
import wn0.C37416g;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: xn0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u008e\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b!\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\n\u0010)R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b*\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010)R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b'\u0010)R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b2\u0010)R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b.\u0010)¨\u00064"}, m65681d2 = {"Lxn0/c;", "", "", "currentPassword", "", "Lcom/whoop/service/network/model/PasswordRequirement;", "requirements", "Lwn0/g;", "validationResults", "", "isValid", "isLoading", "Lwn0/c;", "requirementsError", "Lwn0/e;", "submissionError", "isSuccess", "newLinkSent", "showExitDialog", "shouldGoBack", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLwn0/c;Lwn0/e;ZZZZ)V", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLwn0/c;Lwn0/e;ZZZZ)Lxn0/c;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "getValidationResults", "d", "Z", "()Z", "j", "f", "Lwn0/c;", "()Lwn0/c;", "g", "Lwn0/e;", "i", "()Lwn0/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "k", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38475c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String currentPassword;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<PasswordRequirement> requirements;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C37416g> validationResults;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isValid;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC37412c requirementsError;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final AbstractC37414e submissionError;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isSuccess;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean newLinkSent;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean showExitDialog;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean shouldGoBack;

    public C38475c(String currentPassword, List<PasswordRequirement> requirements, List<C37416g> validationResults, boolean z4, boolean z13, AbstractC37412c abstractC37412c, AbstractC37414e abstractC37414e, boolean z14, boolean z15, boolean z16, boolean z17) {
        AbstractC22676k.m65750j(currentPassword, "currentPassword");
        AbstractC22676k.m65750j(requirements, "requirements");
        AbstractC22676k.m65750j(validationResults, "validationResults");
        this.currentPassword = currentPassword;
        this.requirements = requirements;
        this.validationResults = validationResults;
        this.isValid = z4;
        this.isLoading = z13;
        this.requirementsError = abstractC37412c;
        this.submissionError = abstractC37414e;
        this.isSuccess = z14;
        this.newLinkSent = z15;
        this.showExitDialog = z16;
        this.shouldGoBack = z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C38475c m123281b(C38475c c38475c, String str, List list, List list2, boolean z4, boolean z13, AbstractC37412c abstractC37412c, AbstractC37414e abstractC37414e, boolean z14, boolean z15, boolean z16, boolean z17, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c38475c.currentPassword;
        }
        if ((i13 & 2) != 0) {
            list = c38475c.requirements;
        }
        if ((i13 & 4) != 0) {
            list2 = c38475c.validationResults;
        }
        if ((i13 & 8) != 0) {
            z4 = c38475c.isValid;
        }
        if ((i13 & 16) != 0) {
            z13 = c38475c.isLoading;
        }
        if ((i13 & 32) != 0) {
            abstractC37412c = c38475c.requirementsError;
        }
        if ((i13 & 64) != 0) {
            abstractC37414e = c38475c.submissionError;
        }
        if ((i13 & 128) != 0) {
            z14 = c38475c.isSuccess;
        }
        if ((i13 & 256) != 0) {
            z15 = c38475c.newLinkSent;
        }
        if ((i13 & 512) != 0) {
            z16 = c38475c.showExitDialog;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            z17 = c38475c.shouldGoBack;
        }
        boolean z18 = z16;
        boolean z19 = z17;
        boolean z24 = z14;
        boolean z25 = z15;
        AbstractC37412c abstractC37412c2 = abstractC37412c;
        AbstractC37414e abstractC37414e2 = abstractC37414e;
        boolean z26 = z13;
        List list3 = list2;
        return c38475c.m123282a(str, list, list3, z4, z26, abstractC37412c2, abstractC37414e2, z24, z25, z18, z19);
    }

    /* JADX INFO: renamed from: a */
    public final C38475c m123282a(String currentPassword, List<PasswordRequirement> requirements, List<C37416g> validationResults, boolean isValid, boolean isLoading, AbstractC37412c requirementsError, AbstractC37414e submissionError, boolean isSuccess, boolean newLinkSent, boolean showExitDialog, boolean shouldGoBack) {
        AbstractC22676k.m65750j(currentPassword, "currentPassword");
        AbstractC22676k.m65750j(requirements, "requirements");
        AbstractC22676k.m65750j(validationResults, "validationResults");
        return new C38475c(currentPassword, requirements, validationResults, isValid, isLoading, requirementsError, submissionError, isSuccess, newLinkSent, showExitDialog, shouldGoBack);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCurrentPassword() {
        return this.currentPassword;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getNewLinkSent() {
        return this.newLinkSent;
    }

    /* JADX INFO: renamed from: e */
    public final List<PasswordRequirement> m123285e() {
        return this.requirements;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38475c)) {
            return false;
        }
        C38475c c38475c = (C38475c) other;
        return AbstractC22676k.m65745e(this.currentPassword, c38475c.currentPassword) && AbstractC22676k.m65745e(this.requirements, c38475c.requirements) && AbstractC22676k.m65745e(this.validationResults, c38475c.validationResults) && this.isValid == c38475c.isValid && this.isLoading == c38475c.isLoading && AbstractC22676k.m65745e(this.requirementsError, c38475c.requirementsError) && AbstractC22676k.m65745e(this.submissionError, c38475c.submissionError) && this.isSuccess == c38475c.isSuccess && this.newLinkSent == c38475c.newLinkSent && this.showExitDialog == c38475c.showExitDialog && this.shouldGoBack == c38475c.shouldGoBack;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC37412c getRequirementsError() {
        return this.requirementsError;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getShouldGoBack() {
        return this.shouldGoBack;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getShowExitDialog() {
        return this.showExitDialog;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.currentPassword.hashCode() * 31, 31, this.requirements), 31, this.validationResults), 31, this.isValid), 31, this.isLoading);
        AbstractC37412c abstractC37412c = this.requirementsError;
        int iHashCode = (iM8289b + (abstractC37412c == null ? 0 : abstractC37412c.hashCode())) * 31;
        AbstractC37414e abstractC37414e = this.submissionError;
        return Boolean.hashCode(this.shouldGoBack) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (abstractC37414e != null ? abstractC37414e.hashCode() : 0)) * 31, 31, this.isSuccess), 31, this.newLinkSent), 31, this.showExitDialog);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final AbstractC37414e getSubmissionError() {
        return this.submissionError;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public String toString() {
        List<PasswordRequirement> list = this.requirements;
        List<C37416g> list2 = this.validationResults;
        boolean z4 = this.isValid;
        boolean z13 = this.isLoading;
        AbstractC37412c abstractC37412c = this.requirementsError;
        AbstractC37414e abstractC37414e = this.submissionError;
        boolean z14 = this.isSuccess;
        boolean z15 = this.newLinkSent;
        boolean z16 = this.showExitDialog;
        boolean z17 = this.shouldGoBack;
        StringBuilder sbM124380j = AbstractC38963t7.m124380j("ResetPasswordDomainResult(currentPassword=REDACTED, requirements=", ", validationResults=", list, ", isValid=", list2);
        AbstractC38963t7.m124392v(sbM124380j, z4, ", isLoading=", z13, ", requirementsError=");
        sbM124380j.append(abstractC37412c);
        sbM124380j.append(", submissionError=");
        sbM124380j.append(abstractC37414e);
        sbM124380j.append(", isSuccess=");
        AbstractC38963t7.m124392v(sbM124380j, z14, ", newLinkSent=", z15, ", showExitDialog=");
        return AbstractC36095b.m114682j(sbM124380j, z16, ", shouldGoBack=", z17, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C38475c(String str, List list, List list2, boolean z4, boolean z13, AbstractC37412c abstractC37412c, AbstractC37414e abstractC37414e, boolean z14, boolean z15, boolean z16, boolean z17, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i13 & 1) != 0 ? "" : str;
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        this(str, i14 != 0 ? c25271y : list, (i13 & 4) != 0 ? c25271y : list2, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? null : abstractC37412c, (i13 & 64) != 0 ? null : abstractC37414e, (i13 & 128) != 0 ? false : z14, (i13 & 256) != 0 ? false : z15, (i13 & 512) != 0 ? false : z16, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z17);
    }
}
