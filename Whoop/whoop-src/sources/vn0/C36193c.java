package vn0;

import com.whoop.service.network.model.PasswordRequirement;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p412q3.C29885s;
import p412q3.InterfaceC29873g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qz0.AbstractC30784c;
import wn0.AbstractC37412c;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: vn0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\"J¢\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b8\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b3\u0010=\u001a\u0004\b<\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b>\u0010=\u001a\u0004\b4\u0010\"R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b2\u0010AR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b,\u0010B\u001a\u0004\b0\u0010CR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b/\u0010D\u001a\u0004\b>\u0010ER\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b1\u0010F\u001a\u0004\b?\u0010G¨\u0006H"}, m65681d2 = {"Lvn0/c;", "", "", "isLoadingRequirements", "isSavingPassword", "isSuccess", "passwordIsVisible", "Lqz0/c;", "endingType", "Lq3/g0;", "visualTransformation", "", "initialCurrentPassword", "initialNewPassword", "initialConfirmPassword", "Lvn0/f;", "confirmPasswordErrorReason", "Lvn0/a;", "backendPasswordValidationFailureReason", "", "Lcom/whoop/service/network/model/PasswordRequirement;", "requirements", "Lwn0/c;", "requirementsError", "<init>", "(ZZZZLqz0/c;Lq3/g0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvn0/f;Lvn0/a;Ljava/util/List;Lwn0/c;)V", "p", "()Lvn0/c;", "q", "n", "(Lvn0/a;)Lvn0/c;", "o", "(Lvn0/f;)Lvn0/c;", "toString", "()Ljava/lang/String;", "a", "(ZZZZLqz0/c;Lq3/g0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvn0/f;Lvn0/a;Ljava/util/List;Lwn0/c;)Lvn0/c;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "k", "()Z", "b", "l", "c", "m", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "Lqz0/c;", "getEndingType", "()Lqz0/c;", "f", "Lq3/g0;", "getVisualTransformation", "()Lq3/g0;", "g", "Ljava/lang/String;", "i", "j", "Lvn0/f;", "()Lvn0/f;", "Lvn0/a;", "()Lvn0/a;", "Ljava/util/List;", "()Ljava/util/List;", "Lwn0/c;", "()Lwn0/c;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36193c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoadingRequirements;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isSavingPassword;

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
    private final EnumC36196f confirmPasswordErrorReason;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final EnumC36191a backendPasswordValidationFailureReason;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final List<PasswordRequirement> requirements;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final AbstractC37412c requirementsError;

    public C36193c(boolean z4, boolean z13, boolean z14, boolean z15, AbstractC30784c endingType, InterfaceC29873g0 visualTransformation, String str, String str2, String str3, EnumC36196f confirmPasswordErrorReason, EnumC36191a enumC36191a, List<PasswordRequirement> requirements, AbstractC37412c abstractC37412c) {
        AbstractC22676k.m65750j(endingType, "endingType");
        AbstractC22676k.m65750j(visualTransformation, "visualTransformation");
        AbstractC22676k.m65750j(confirmPasswordErrorReason, "confirmPasswordErrorReason");
        AbstractC22676k.m65750j(requirements, "requirements");
        this.isLoadingRequirements = z4;
        this.isSavingPassword = z13;
        this.isSuccess = z14;
        this.passwordIsVisible = z15;
        this.endingType = endingType;
        this.visualTransformation = visualTransformation;
        this.initialCurrentPassword = str;
        this.initialNewPassword = str2;
        this.initialConfirmPassword = str3;
        this.confirmPasswordErrorReason = confirmPasswordErrorReason;
        this.backendPasswordValidationFailureReason = enumC36191a;
        this.requirements = requirements;
        this.requirementsError = abstractC37412c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C36193c m115151b(C36193c c36193c, boolean z4, boolean z13, boolean z14, boolean z15, AbstractC30784c abstractC30784c, InterfaceC29873g0 interfaceC29873g0, String str, String str2, String str3, EnumC36196f enumC36196f, EnumC36191a enumC36191a, List list, AbstractC37412c abstractC37412c, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c36193c.isLoadingRequirements;
        }
        return c36193c.m115152a(z4, (i13 & 2) != 0 ? c36193c.isSavingPassword : z13, (i13 & 4) != 0 ? c36193c.isSuccess : z14, (i13 & 8) != 0 ? c36193c.passwordIsVisible : z15, (i13 & 16) != 0 ? c36193c.endingType : abstractC30784c, (i13 & 32) != 0 ? c36193c.visualTransformation : interfaceC29873g0, (i13 & 64) != 0 ? c36193c.initialCurrentPassword : str, (i13 & 128) != 0 ? c36193c.initialNewPassword : str2, (i13 & 256) != 0 ? c36193c.initialConfirmPassword : str3, (i13 & 512) != 0 ? c36193c.confirmPasswordErrorReason : enumC36196f, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c36193c.backendPasswordValidationFailureReason : enumC36191a, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c36193c.requirements : list, (i13 & 4096) != 0 ? c36193c.requirementsError : abstractC37412c);
    }

    /* JADX INFO: renamed from: a */
    public final C36193c m115152a(boolean isLoadingRequirements, boolean isSavingPassword, boolean isSuccess, boolean passwordIsVisible, AbstractC30784c endingType, InterfaceC29873g0 visualTransformation, String initialCurrentPassword, String initialNewPassword, String initialConfirmPassword, EnumC36196f confirmPasswordErrorReason, EnumC36191a backendPasswordValidationFailureReason, List<PasswordRequirement> requirements, AbstractC37412c requirementsError) {
        AbstractC22676k.m65750j(endingType, "endingType");
        AbstractC22676k.m65750j(visualTransformation, "visualTransformation");
        AbstractC22676k.m65750j(confirmPasswordErrorReason, "confirmPasswordErrorReason");
        AbstractC22676k.m65750j(requirements, "requirements");
        return new C36193c(isLoadingRequirements, isSavingPassword, isSuccess, passwordIsVisible, endingType, visualTransformation, initialCurrentPassword, initialNewPassword, initialConfirmPassword, confirmPasswordErrorReason, backendPasswordValidationFailureReason, requirements, requirementsError);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC36191a getBackendPasswordValidationFailureReason() {
        return this.backendPasswordValidationFailureReason;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC36196f getConfirmPasswordErrorReason() {
        return this.confirmPasswordErrorReason;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getInitialConfirmPassword() {
        return this.initialConfirmPassword;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36193c)) {
            return false;
        }
        C36193c c36193c = (C36193c) other;
        return this.isLoadingRequirements == c36193c.isLoadingRequirements && this.isSavingPassword == c36193c.isSavingPassword && this.isSuccess == c36193c.isSuccess && this.passwordIsVisible == c36193c.passwordIsVisible && AbstractC22676k.m65745e(this.endingType, c36193c.endingType) && AbstractC22676k.m65745e(this.visualTransformation, c36193c.visualTransformation) && AbstractC22676k.m65745e(this.initialCurrentPassword, c36193c.initialCurrentPassword) && AbstractC22676k.m65745e(this.initialNewPassword, c36193c.initialNewPassword) && AbstractC22676k.m65745e(this.initialConfirmPassword, c36193c.initialConfirmPassword) && this.confirmPasswordErrorReason == c36193c.confirmPasswordErrorReason && this.backendPasswordValidationFailureReason == c36193c.backendPasswordValidationFailureReason && AbstractC22676k.m65745e(this.requirements, c36193c.requirements) && AbstractC22676k.m65745e(this.requirementsError, c36193c.requirementsError);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getInitialCurrentPassword() {
        return this.initialCurrentPassword;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getInitialNewPassword() {
        return this.initialNewPassword;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getPasswordIsVisible() {
        return this.passwordIsVisible;
    }

    public int hashCode() {
        int iHashCode = (this.visualTransformation.hashCode() + ((this.endingType.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.isLoadingRequirements) * 31, 31, this.isSavingPassword), 31, this.isSuccess), 31, this.passwordIsVisible)) * 31)) * 31;
        String str = this.initialCurrentPassword;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.initialNewPassword;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.initialConfirmPassword;
        int iHashCode4 = (this.confirmPasswordErrorReason.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        EnumC36191a enumC36191a = this.backendPasswordValidationFailureReason;
        int iM31983b = AbstractC11895b.m31983b((iHashCode4 + (enumC36191a == null ? 0 : enumC36191a.hashCode())) * 31, 31, this.requirements);
        AbstractC37412c abstractC37412c = this.requirementsError;
        return iM31983b + (abstractC37412c != null ? abstractC37412c.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final List<PasswordRequirement> m115159i() {
        return this.requirements;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final AbstractC37412c getRequirementsError() {
        return this.requirementsError;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsLoadingRequirements() {
        return this.isLoadingRequirements;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsSavingPassword() {
        return this.isSavingPassword;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* JADX INFO: renamed from: n */
    public final C36193c m115164n(EnumC36191a backendPasswordValidationFailureReason) {
        AbstractC22676k.m65750j(backendPasswordValidationFailureReason, "backendPasswordValidationFailureReason");
        return m115151b(this, false, false, false, false, null, null, null, null, null, null, backendPasswordValidationFailureReason, null, null, 7160, null);
    }

    /* JADX INFO: renamed from: o */
    public final C36193c m115165o(EnumC36196f confirmPasswordErrorReason) {
        AbstractC22676k.m65750j(confirmPasswordErrorReason, "confirmPasswordErrorReason");
        return m115151b(this, false, false, false, false, null, null, null, null, null, confirmPasswordErrorReason, null, null, null, 6648, null);
    }

    /* JADX INFO: renamed from: p */
    public final C36193c m115166p() {
        return m115151b(this, false, true, false, false, null, null, null, null, null, EnumC36196f.VALID, null, null, null, 2552, null);
    }

    /* JADX INFO: renamed from: q */
    public final C36193c m115167q() {
        return m115151b(this, false, false, true, false, null, null, null, null, null, EnumC36196f.VALID, null, null, null, 2552, null);
    }

    public String toString() {
        boolean z4 = this.isLoadingRequirements;
        boolean z13 = this.isSavingPassword;
        boolean z14 = this.isSuccess;
        boolean z15 = this.passwordIsVisible;
        EnumC36196f enumC36196f = this.confirmPasswordErrorReason;
        EnumC36191a enumC36191a = this.backendPasswordValidationFailureReason;
        List<PasswordRequirement> list = this.requirements;
        AbstractC37412c abstractC37412c = this.requirementsError;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("ChangePasswordDomainResult(isLoadingRequirements=", ", isSavingPassword=", ", isSuccess=", z4, z13);
        AbstractC38963t7.m124392v(sbM32002u, z14, ", passwordIsVisible=", z15, ", initialCurrentPassword=REDACTED, initialNewPassword=REDACTED, initialConfirmPassword=REDACTED, confirmPasswordErrorReason=");
        sbM32002u.append(enumC36196f);
        sbM32002u.append(", backendPasswordValidationFailureReason=");
        sbM32002u.append(enumC36191a);
        sbM32002u.append(", requirements=");
        sbM32002u.append(list);
        sbM32002u.append(", requirementsError=");
        sbM32002u.append(abstractC37412c);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public C36193c(boolean z4, boolean z13, boolean z14, boolean z15, AbstractC30784c abstractC30784c, InterfaceC29873g0 interfaceC29873g0, String str, String str2, String str3, EnumC36196f enumC36196f, EnumC36191a enumC36191a, List list, AbstractC37412c abstractC37412c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) == 0 ? z15 : false, (i13 & 16) != 0 ? new AbstractC30784c.a(C38072d.f163053a.m121951d().getVarious().getPrivacy(), null, null, null, 14, null) : abstractC30784c, (i13 & 32) != 0 ? new C29885s() : interfaceC29873g0, (i13 & 64) != 0 ? null : str, (i13 & 128) != 0 ? null : str2, (i13 & 256) != 0 ? null : str3, (i13 & 512) != 0 ? EnumC36196f.VALID : enumC36196f, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : enumC36191a, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? C25271y.f99162w : list, (i13 & 4096) != 0 ? null : abstractC37412c);
    }
}
