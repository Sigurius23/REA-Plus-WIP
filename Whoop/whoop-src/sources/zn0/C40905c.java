package zn0;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p412q3.C29885s;
import p412q3.InterfaceC29873g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import qz0.AbstractC30784c;
import r80.AbstractC31061c;
import wn0.C37416g;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: zn0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b(\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b,\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b+\u00104\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b5\u00104\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b&\u00108R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b1\u00107\u001a\u0004\b3\u00108R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b$\u00107\u001a\u0004\b\"\u00108R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b6\u0010;R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b9\u0010%R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b)\u00107\u001a\u0004\b5\u00108¨\u0006<"}, m65681d2 = {"Lzn0/c;", "", "", "isLoading", "isSaving", "isSuccess", "passwordIsVisible", "Lqz0/c;", "endingType", "Lq3/g0;", "visualTransformation", "", "initialCurrentPassword", "initialNewPassword", "initialConfirmPassword", "Lcom/whoop/design/util/TextResource;", "confirmPasswordErrorDescription", "newPasswordPlaceHolderDescription", "backendPasswordValidationFailureDescription", "", "Lwn0/g;", "validationResults", "isPasswordValid", "requirementsErrorMessage", "<init>", "(ZZZZLqz0/c;Lq3/g0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;ZLcom/whoop/design/util/TextResource;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "l", "()Z", "b", "n", "c", "o", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "Lqz0/c;", "()Lqz0/c;", "f", "Lq3/g0;", "k", "()Lq3/g0;", "g", "Ljava/lang/String;", "i", "j", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "m", "Ljava/util/List;", "()Ljava/util/List;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40905c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isSaving;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isSuccess;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean passwordIsVisible;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC30784c endingType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC29873g0 visualTransformation;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String initialCurrentPassword;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String initialNewPassword;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String initialConfirmPassword;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final TextResource confirmPasswordErrorDescription;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final TextResource newPasswordPlaceHolderDescription;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final TextResource backendPasswordValidationFailureDescription;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final List<C37416g> validationResults;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean isPasswordValid;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final TextResource requirementsErrorMessage;

    public C40905c(boolean z4, boolean z13, boolean z14, boolean z15, AbstractC30784c endingType, InterfaceC29873g0 visualTransformation, String str, String str2, String str3, TextResource textResource, TextResource newPasswordPlaceHolderDescription, TextResource textResource2, List<C37416g> validationResults, boolean z16, TextResource textResource3) {
        AbstractC22676k.m65750j(endingType, "endingType");
        AbstractC22676k.m65750j(visualTransformation, "visualTransformation");
        AbstractC22676k.m65750j(newPasswordPlaceHolderDescription, "newPasswordPlaceHolderDescription");
        AbstractC22676k.m65750j(validationResults, "validationResults");
        this.isLoading = z4;
        this.isSaving = z13;
        this.isSuccess = z14;
        this.passwordIsVisible = z15;
        this.endingType = endingType;
        this.visualTransformation = visualTransformation;
        this.initialCurrentPassword = str;
        this.initialNewPassword = str2;
        this.initialConfirmPassword = str3;
        this.confirmPasswordErrorDescription = textResource;
        this.newPasswordPlaceHolderDescription = newPasswordPlaceHolderDescription;
        this.backendPasswordValidationFailureDescription = textResource2;
        this.validationResults = validationResults;
        this.isPasswordValid = z16;
        this.requirementsErrorMessage = textResource3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getBackendPasswordValidationFailureDescription() {
        return this.backendPasswordValidationFailureDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getConfirmPasswordErrorDescription() {
        return this.confirmPasswordErrorDescription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC30784c getEndingType() {
        return this.endingType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInitialConfirmPassword() {
        return this.initialConfirmPassword;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getInitialCurrentPassword() {
        return this.initialCurrentPassword;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40905c)) {
            return false;
        }
        C40905c c40905c = (C40905c) other;
        return this.isLoading == c40905c.isLoading && this.isSaving == c40905c.isSaving && this.isSuccess == c40905c.isSuccess && this.passwordIsVisible == c40905c.passwordIsVisible && AbstractC22676k.m65745e(this.endingType, c40905c.endingType) && AbstractC22676k.m65745e(this.visualTransformation, c40905c.visualTransformation) && AbstractC22676k.m65745e(this.initialCurrentPassword, c40905c.initialCurrentPassword) && AbstractC22676k.m65745e(this.initialNewPassword, c40905c.initialNewPassword) && AbstractC22676k.m65745e(this.initialConfirmPassword, c40905c.initialConfirmPassword) && AbstractC22676k.m65745e(this.confirmPasswordErrorDescription, c40905c.confirmPasswordErrorDescription) && AbstractC22676k.m65745e(this.newPasswordPlaceHolderDescription, c40905c.newPasswordPlaceHolderDescription) && AbstractC22676k.m65745e(this.backendPasswordValidationFailureDescription, c40905c.backendPasswordValidationFailureDescription) && AbstractC22676k.m65745e(this.validationResults, c40905c.validationResults) && this.isPasswordValid == c40905c.isPasswordValid && AbstractC22676k.m65745e(this.requirementsErrorMessage, c40905c.requirementsErrorMessage);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getInitialNewPassword() {
        return this.initialNewPassword;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getNewPasswordPlaceHolderDescription() {
        return this.newPasswordPlaceHolderDescription;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getPasswordIsVisible() {
        return this.passwordIsVisible;
    }

    public int hashCode() {
        int iHashCode = (this.visualTransformation.hashCode() + ((this.endingType.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isSaving), 31, this.isSuccess), 31, this.passwordIsVisible)) * 31)) * 31;
        String str = this.initialCurrentPassword;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.initialNewPassword;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.initialConfirmPassword;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TextResource textResource = this.confirmPasswordErrorDescription;
        int iM95625a = AbstractC31061c.m95625a((iHashCode4 + (textResource == null ? 0 : textResource.hashCode())) * 31, this.newPasswordPlaceHolderDescription, 31);
        TextResource textResource2 = this.backendPasswordValidationFailureDescription;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b((iM95625a + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, 31, this.validationResults), 31, this.isPasswordValid);
        TextResource textResource3 = this.requirementsErrorMessage;
        return iM8289b + (textResource3 != null ? textResource3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getRequirementsErrorMessage() {
        return this.requirementsErrorMessage;
    }

    /* JADX INFO: renamed from: j */
    public final List<C37416g> m132581j() {
        return this.validationResults;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final InterfaceC29873g0 getVisualTransformation() {
        return this.visualTransformation;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsPasswordValid() {
        return this.isPasswordValid;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsSaving() {
        return this.isSaving;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isSaving;
        boolean z14 = this.isSuccess;
        boolean z15 = this.passwordIsVisible;
        AbstractC30784c abstractC30784c = this.endingType;
        InterfaceC29873g0 interfaceC29873g0 = this.visualTransformation;
        String str = this.initialCurrentPassword;
        String str2 = this.initialNewPassword;
        String str3 = this.initialConfirmPassword;
        TextResource textResource = this.confirmPasswordErrorDescription;
        TextResource textResource2 = this.newPasswordPlaceHolderDescription;
        TextResource textResource3 = this.backendPasswordValidationFailureDescription;
        List<C37416g> list = this.validationResults;
        boolean z16 = this.isPasswordValid;
        TextResource textResource4 = this.requirementsErrorMessage;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("ChangePasswordViewState(isLoading=", ", isSaving=", ", isSuccess=", z4, z13);
        AbstractC38963t7.m124392v(sbM32002u, z14, ", passwordIsVisible=", z15, ", endingType=");
        sbM32002u.append(abstractC30784c);
        sbM32002u.append(", visualTransformation=");
        sbM32002u.append(interfaceC29873g0);
        sbM32002u.append(", initialCurrentPassword=");
        AbstractC11266d.m30444B(sbM32002u, str, ", initialNewPassword=", str2, ", initialConfirmPassword=");
        AbstractC30007c.m91826A(sbM32002u, str3, ", confirmPasswordErrorDescription=", textResource, ", newPasswordPlaceHolderDescription=");
        AbstractC30007c.m91855y(sbM32002u, textResource2, ", backendPasswordValidationFailureDescription=", textResource3, ", validationResults=");
        AbstractC26725a.m79512p(", isPasswordValid=", ", requirementsErrorMessage=", sbM32002u, list, z16);
        return AbstractC30007c.m91841k(sbM32002u, textResource4, ")");
    }

    public C40905c(boolean z4, boolean z13, boolean z14, boolean z15, AbstractC30784c abstractC30784c, InterfaceC29873g0 interfaceC29873g0, String str, String str2, String str3, TextResource textResource, TextResource textResource2, TextResource textResource3, List list, boolean z16, TextResource textResource4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) == 0 ? z15 : false, (i13 & 16) != 0 ? new AbstractC30784c.a(C38072d.f163053a.m121951d().getVarious().getPrivacy(), null, null, null, 14, null) : abstractC30784c, (i13 & 32) != 0 ? new C29885s() : interfaceC29873g0, (i13 & 64) != 0 ? null : str, (i13 & 128) != 0 ? null : str2, (i13 & 256) != 0 ? null : str3, (i13 & 512) != 0 ? null : textResource, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : textResource3, (i13 & 4096) != 0 ? C25271y.f99162w : list, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? true : z16, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : textResource4);
    }
}
