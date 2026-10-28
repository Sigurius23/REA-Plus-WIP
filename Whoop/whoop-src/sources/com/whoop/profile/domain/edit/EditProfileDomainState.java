package com.whoop.profile.domain.edit;

import com.whoop.profile.domain.edit.models.EditProfileResponse;
import java.util.Arrays;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005%&'()B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J?\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainState;", "", "response", "Lcom/whoop/profile/domain/edit/models/EditProfileResponse;", "currentDialogType", "Lcom/whoop/profile/domain/edit/EditProfileDialogType;", "avatarState", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;", "emailValidationState", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;", "usernameValidationState", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;", "<init>", "(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;)V", "getResponse", "()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;", "getCurrentDialogType", "()Lcom/whoop/profile/domain/edit/EditProfileDialogType;", "getAvatarState", "()Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;", "getEmailValidationState", "()Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;", "getUsernameValidationState", "()Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "AvatarDomainState", "EmailValidationDomainState", "UsernameValidationDomainState", "EmailValidationResult", "UsernameValidationResult", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class EditProfileDomainState {
    public static final int $stable = 8;
    private final AvatarDomainState avatarState;
    private final EditProfileDialogType currentDialogType;
    private final EmailValidationDomainState emailValidationState;
    private final EditProfileResponse response;
    private final UsernameValidationDomainState usernameValidationState;

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;", "", "isUploading", "", "uploadSuccess", "uploadError", "", "pendingUploadData", "", "<init>", "(ZZLjava/lang/String;[B)V", "()Z", "getUploadSuccess", "getUploadError", "()Ljava/lang/String;", "getPendingUploadData", "()[B", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class AvatarDomainState {
        public static final int $stable = 8;
        private final boolean isUploading;
        private final byte[] pendingUploadData;
        private final String uploadError;
        private final boolean uploadSuccess;

        public AvatarDomainState() {
            this(false, false, null, null, 15, null);
        }

        public static /* synthetic */ AvatarDomainState copy$default(AvatarDomainState avatarDomainState, boolean z4, boolean z13, String str, byte[] bArr, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = avatarDomainState.isUploading;
            }
            if ((i13 & 2) != 0) {
                z13 = avatarDomainState.uploadSuccess;
            }
            if ((i13 & 4) != 0) {
                str = avatarDomainState.uploadError;
            }
            if ((i13 & 8) != 0) {
                bArr = avatarDomainState.pendingUploadData;
            }
            return avatarDomainState.copy(z4, z13, str, bArr);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsUploading() {
            return this.isUploading;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getUploadSuccess() {
            return this.uploadSuccess;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getUploadError() {
            return this.uploadError;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final byte[] getPendingUploadData() {
            return this.pendingUploadData;
        }

        public final AvatarDomainState copy(boolean isUploading, boolean uploadSuccess, String uploadError, byte[] pendingUploadData) {
            return new AvatarDomainState(isUploading, uploadSuccess, uploadError, pendingUploadData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AvatarDomainState)) {
                return false;
            }
            AvatarDomainState avatarDomainState = (AvatarDomainState) other;
            return this.isUploading == avatarDomainState.isUploading && this.uploadSuccess == avatarDomainState.uploadSuccess && AbstractC22676k.m65745e(this.uploadError, avatarDomainState.uploadError) && AbstractC22676k.m65745e(this.pendingUploadData, avatarDomainState.pendingUploadData);
        }

        public final byte[] getPendingUploadData() {
            return this.pendingUploadData;
        }

        public final String getUploadError() {
            return this.uploadError;
        }

        public final boolean getUploadSuccess() {
            return this.uploadSuccess;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isUploading) * 31, 31, this.uploadSuccess);
            String str = this.uploadError;
            int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
            byte[] bArr = this.pendingUploadData;
            return iHashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
        }

        public final boolean isUploading() {
            return this.isUploading;
        }

        public String toString() {
            boolean z4 = this.isUploading;
            boolean z13 = this.uploadSuccess;
            return AbstractC11266d.m30464r(AbstractC11895b.m32002u("AvatarDomainState(isUploading=", ", uploadSuccess=", ", uploadError=", z4, z13), this.uploadError, ", pendingUploadData=", Arrays.toString(this.pendingUploadData), ")");
        }

        public AvatarDomainState(boolean z4, boolean z13, String str, byte[] bArr) {
            this.isUploading = z4;
            this.uploadSuccess = z13;
            this.uploadError = str;
            this.pendingUploadData = bArr;
        }

        public /* synthetic */ AvatarDomainState(boolean z4, boolean z13, String str, byte[] bArr, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : bArr);
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;", "", "isValidating", "", "result", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;", "lastValidatedEmail", "", "<init>", "(ZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;)V", "()Z", "getResult", "()Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;", "getLastValidatedEmail", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class EmailValidationDomainState {
        public static final int $stable = 0;
        private final boolean isValidating;
        private final String lastValidatedEmail;
        private final EmailValidationResult result;

        public EmailValidationDomainState() {
            this(false, null, null, 7, null);
        }

        public static /* synthetic */ EmailValidationDomainState copy$default(EmailValidationDomainState emailValidationDomainState, boolean z4, EmailValidationResult emailValidationResult, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = emailValidationDomainState.isValidating;
            }
            if ((i13 & 2) != 0) {
                emailValidationResult = emailValidationDomainState.result;
            }
            if ((i13 & 4) != 0) {
                str = emailValidationDomainState.lastValidatedEmail;
            }
            return emailValidationDomainState.copy(z4, emailValidationResult, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsValidating() {
            return this.isValidating;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final EmailValidationResult getResult() {
            return this.result;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLastValidatedEmail() {
            return this.lastValidatedEmail;
        }

        public final EmailValidationDomainState copy(boolean isValidating, EmailValidationResult result, String lastValidatedEmail) {
            return new EmailValidationDomainState(isValidating, result, lastValidatedEmail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmailValidationDomainState)) {
                return false;
            }
            EmailValidationDomainState emailValidationDomainState = (EmailValidationDomainState) other;
            return this.isValidating == emailValidationDomainState.isValidating && AbstractC22676k.m65745e(this.result, emailValidationDomainState.result) && AbstractC22676k.m65745e(this.lastValidatedEmail, emailValidationDomainState.lastValidatedEmail);
        }

        public final String getLastValidatedEmail() {
            return this.lastValidatedEmail;
        }

        public final EmailValidationResult getResult() {
            return this.result;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isValidating) * 31;
            EmailValidationResult emailValidationResult = this.result;
            int iHashCode2 = (iHashCode + (emailValidationResult == null ? 0 : emailValidationResult.hashCode())) * 31;
            String str = this.lastValidatedEmail;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final boolean isValidating() {
            return this.isValidating;
        }

        public String toString() {
            boolean z4 = this.isValidating;
            EmailValidationResult emailValidationResult = this.result;
            String str = this.lastValidatedEmail;
            StringBuilder sb4 = new StringBuilder("EmailValidationDomainState(isValidating=");
            sb4.append(z4);
            sb4.append(", result=");
            sb4.append(emailValidationResult);
            sb4.append(", lastValidatedEmail=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }

        public EmailValidationDomainState(boolean z4, EmailValidationResult emailValidationResult, String str) {
            this.isValidating = z4;
            this.result = emailValidationResult;
            this.lastValidatedEmail = str;
        }

        public /* synthetic */ EmailValidationDomainState(boolean z4, EmailValidationResult emailValidationResult, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? null : emailValidationResult, (i13 & 4) != 0 ? null : str);
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;", "", "<init>", "()V", "Available", "NotAvailable", "NetworkError", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult$Available;", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult$NetworkError;", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult$NotAvailable;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class EmailValidationResult {
        public static final int $stable = 0;

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult$Available;", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Available extends EmailValidationResult {
            public static final int $stable = 0;
            public static final Available INSTANCE = new Available();

            private Available() {
                super(null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult$NetworkError;", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class NetworkError extends EmailValidationResult {
            public static final int $stable = 0;
            public static final NetworkError INSTANCE = new NetworkError();

            private NetworkError() {
                super(null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult$NotAvailable;", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class NotAvailable extends EmailValidationResult {
            public static final int $stable = 0;
            public static final NotAvailable INSTANCE = new NotAvailable();

            private NotAvailable() {
                super(null);
            }
        }

        public /* synthetic */ EmailValidationResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private EmailValidationResult() {
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;", "", "isValidating", "", "result", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;", "lastValidatedUsername", "", "<init>", "(ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;)V", "()Z", "getResult", "()Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;", "getLastValidatedUsername", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class UsernameValidationDomainState {
        public static final int $stable = 0;
        private final boolean isValidating;
        private final String lastValidatedUsername;
        private final UsernameValidationResult result;

        public UsernameValidationDomainState() {
            this(false, null, null, 7, null);
        }

        public static /* synthetic */ UsernameValidationDomainState copy$default(UsernameValidationDomainState usernameValidationDomainState, boolean z4, UsernameValidationResult usernameValidationResult, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = usernameValidationDomainState.isValidating;
            }
            if ((i13 & 2) != 0) {
                usernameValidationResult = usernameValidationDomainState.result;
            }
            if ((i13 & 4) != 0) {
                str = usernameValidationDomainState.lastValidatedUsername;
            }
            return usernameValidationDomainState.copy(z4, usernameValidationResult, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsValidating() {
            return this.isValidating;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final UsernameValidationResult getResult() {
            return this.result;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLastValidatedUsername() {
            return this.lastValidatedUsername;
        }

        public final UsernameValidationDomainState copy(boolean isValidating, UsernameValidationResult result, String lastValidatedUsername) {
            return new UsernameValidationDomainState(isValidating, result, lastValidatedUsername);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UsernameValidationDomainState)) {
                return false;
            }
            UsernameValidationDomainState usernameValidationDomainState = (UsernameValidationDomainState) other;
            return this.isValidating == usernameValidationDomainState.isValidating && AbstractC22676k.m65745e(this.result, usernameValidationDomainState.result) && AbstractC22676k.m65745e(this.lastValidatedUsername, usernameValidationDomainState.lastValidatedUsername);
        }

        public final String getLastValidatedUsername() {
            return this.lastValidatedUsername;
        }

        public final UsernameValidationResult getResult() {
            return this.result;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isValidating) * 31;
            UsernameValidationResult usernameValidationResult = this.result;
            int iHashCode2 = (iHashCode + (usernameValidationResult == null ? 0 : usernameValidationResult.hashCode())) * 31;
            String str = this.lastValidatedUsername;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final boolean isValidating() {
            return this.isValidating;
        }

        public String toString() {
            boolean z4 = this.isValidating;
            UsernameValidationResult usernameValidationResult = this.result;
            String str = this.lastValidatedUsername;
            StringBuilder sb4 = new StringBuilder("UsernameValidationDomainState(isValidating=");
            sb4.append(z4);
            sb4.append(", result=");
            sb4.append(usernameValidationResult);
            sb4.append(", lastValidatedUsername=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }

        public UsernameValidationDomainState(boolean z4, UsernameValidationResult usernameValidationResult, String str) {
            this.isValidating = z4;
            this.result = usernameValidationResult;
            this.lastValidatedUsername = str;
        }

        public /* synthetic */ UsernameValidationDomainState(boolean z4, UsernameValidationResult usernameValidationResult, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? null : usernameValidationResult, (i13 & 4) != 0 ? null : str);
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;", "", "<init>", "()V", "Available", "NotAvailable", "NetworkError", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$Available;", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NetworkError;", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NotAvailable;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class UsernameValidationResult {
        public static final int $stable = 0;

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$Available;", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class Available extends UsernameValidationResult {
            public static final int $stable = 0;
            private final String message;

            /* JADX WARN: Multi-variable type inference failed */
            public Available() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Available copy$default(Available available, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = available.message;
                }
                return available.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public final Available copy(String message) {
                return new Available(message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Available) && AbstractC22676k.m65745e(this.message, ((Available) other).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                String str = this.message;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("Available(message=", this.message, ")");
            }

            public Available(String str) {
                super(null);
                this.message = str;
            }

            public /* synthetic */ Available(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this((i13 & 1) != 0 ? null : str);
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NetworkError;", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class NetworkError extends UsernameValidationResult {
            public static final int $stable = 0;
            private final String message;

            /* JADX WARN: Multi-variable type inference failed */
            public NetworkError() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ NetworkError copy$default(NetworkError networkError, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = networkError.message;
                }
                return networkError.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public final NetworkError copy(String message) {
                return new NetworkError(message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NetworkError) && AbstractC22676k.m65745e(this.message, ((NetworkError) other).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                String str = this.message;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("NetworkError(message=", this.message, ")");
            }

            public NetworkError(String str) {
                super(null);
                this.message = str;
            }

            public /* synthetic */ NetworkError(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this((i13 & 1) != 0 ? null : str);
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NotAvailable;", "Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class NotAvailable extends UsernameValidationResult {
            public static final int $stable = 0;
            private final String message;

            /* JADX WARN: Multi-variable type inference failed */
            public NotAvailable() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ NotAvailable copy$default(NotAvailable notAvailable, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = notAvailable.message;
                }
                return notAvailable.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public final NotAvailable copy(String message) {
                return new NotAvailable(message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NotAvailable) && AbstractC22676k.m65745e(this.message, ((NotAvailable) other).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                String str = this.message;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("NotAvailable(message=", this.message, ")");
            }

            public NotAvailable(String str) {
                super(null);
                this.message = str;
            }

            public /* synthetic */ NotAvailable(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this((i13 & 1) != 0 ? null : str);
            }
        }

        public /* synthetic */ UsernameValidationResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private UsernameValidationResult() {
        }
    }

    public EditProfileDomainState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ EditProfileDomainState copy$default(EditProfileDomainState editProfileDomainState, EditProfileResponse editProfileResponse, EditProfileDialogType editProfileDialogType, AvatarDomainState avatarDomainState, EmailValidationDomainState emailValidationDomainState, UsernameValidationDomainState usernameValidationDomainState, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            editProfileResponse = editProfileDomainState.response;
        }
        if ((i13 & 2) != 0) {
            editProfileDialogType = editProfileDomainState.currentDialogType;
        }
        if ((i13 & 4) != 0) {
            avatarDomainState = editProfileDomainState.avatarState;
        }
        if ((i13 & 8) != 0) {
            emailValidationDomainState = editProfileDomainState.emailValidationState;
        }
        if ((i13 & 16) != 0) {
            usernameValidationDomainState = editProfileDomainState.usernameValidationState;
        }
        UsernameValidationDomainState usernameValidationDomainState2 = usernameValidationDomainState;
        AvatarDomainState avatarDomainState2 = avatarDomainState;
        return editProfileDomainState.copy(editProfileResponse, editProfileDialogType, avatarDomainState2, emailValidationDomainState, usernameValidationDomainState2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EditProfileResponse getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EditProfileDialogType getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AvatarDomainState getAvatarState() {
        return this.avatarState;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EmailValidationDomainState getEmailValidationState() {
        return this.emailValidationState;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final UsernameValidationDomainState getUsernameValidationState() {
        return this.usernameValidationState;
    }

    public final EditProfileDomainState copy(EditProfileResponse response, EditProfileDialogType currentDialogType, AvatarDomainState avatarState, EmailValidationDomainState emailValidationState, UsernameValidationDomainState usernameValidationState) {
        AbstractC22676k.m65750j(avatarState, "avatarState");
        AbstractC22676k.m65750j(emailValidationState, "emailValidationState");
        AbstractC22676k.m65750j(usernameValidationState, "usernameValidationState");
        return new EditProfileDomainState(response, currentDialogType, avatarState, emailValidationState, usernameValidationState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditProfileDomainState)) {
            return false;
        }
        EditProfileDomainState editProfileDomainState = (EditProfileDomainState) other;
        return AbstractC22676k.m65745e(this.response, editProfileDomainState.response) && AbstractC22676k.m65745e(this.currentDialogType, editProfileDomainState.currentDialogType) && AbstractC22676k.m65745e(this.avatarState, editProfileDomainState.avatarState) && AbstractC22676k.m65745e(this.emailValidationState, editProfileDomainState.emailValidationState) && AbstractC22676k.m65745e(this.usernameValidationState, editProfileDomainState.usernameValidationState);
    }

    public final AvatarDomainState getAvatarState() {
        return this.avatarState;
    }

    public final EditProfileDialogType getCurrentDialogType() {
        return this.currentDialogType;
    }

    public final EmailValidationDomainState getEmailValidationState() {
        return this.emailValidationState;
    }

    public final EditProfileResponse getResponse() {
        return this.response;
    }

    public final UsernameValidationDomainState getUsernameValidationState() {
        return this.usernameValidationState;
    }

    public int hashCode() {
        EditProfileResponse editProfileResponse = this.response;
        int iHashCode = (editProfileResponse == null ? 0 : editProfileResponse.hashCode()) * 31;
        EditProfileDialogType editProfileDialogType = this.currentDialogType;
        return this.usernameValidationState.hashCode() + ((this.emailValidationState.hashCode() + ((this.avatarState.hashCode() + ((iHashCode + (editProfileDialogType != null ? editProfileDialogType.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "EditProfileDomainState(response=" + this.response + ", currentDialogType=" + this.currentDialogType + ", avatarState=" + this.avatarState + ", emailValidationState=" + this.emailValidationState + ", usernameValidationState=" + this.usernameValidationState + ")";
    }

    public EditProfileDomainState(EditProfileResponse editProfileResponse, EditProfileDialogType editProfileDialogType, AvatarDomainState avatarState, EmailValidationDomainState emailValidationState, UsernameValidationDomainState usernameValidationState) {
        AbstractC22676k.m65750j(avatarState, "avatarState");
        AbstractC22676k.m65750j(emailValidationState, "emailValidationState");
        AbstractC22676k.m65750j(usernameValidationState, "usernameValidationState");
        this.response = editProfileResponse;
        this.currentDialogType = editProfileDialogType;
        this.avatarState = avatarState;
        this.emailValidationState = emailValidationState;
        this.usernameValidationState = usernameValidationState;
    }

    public /* synthetic */ EditProfileDomainState(EditProfileResponse editProfileResponse, EditProfileDialogType editProfileDialogType, AvatarDomainState avatarDomainState, EmailValidationDomainState emailValidationDomainState, UsernameValidationDomainState usernameValidationDomainState, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : editProfileResponse, (i13 & 2) != 0 ? null : editProfileDialogType, (i13 & 4) != 0 ? new AvatarDomainState(false, false, null, null, 15, null) : avatarDomainState, (i13 & 8) != 0 ? new EmailValidationDomainState(false, null, null, 7, null) : emailValidationDomainState, (i13 & 16) != 0 ? new UsernameValidationDomainState(false, null, null, 7, null) : usernameValidationDomainState);
    }
}
