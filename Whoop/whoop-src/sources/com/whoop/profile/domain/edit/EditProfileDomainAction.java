package com.whoop.profile.domain.edit;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.form.EditProfileFormState;
import java.util.Arrays;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainAction;", "", "<init>", "()V", "Refresh", "SaveProfile", "ValidateEmailField", "ValidateUsernameField", "ClearUsernameValidation", "UploadAvatar", "DeleteAvatar", "RetryAvatarUpload", "RefreshAfterAvatarUpload", "NoOp", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ClearUsernameValidation;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$DeleteAvatar;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$NoOp;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$Refresh;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$RefreshAfterAvatarUpload;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$RetryAvatarUpload;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$SaveProfile;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$UploadAvatar;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ValidateEmailField;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ValidateUsernameField;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class EditProfileDomainAction {
    public static final int $stable = 0;

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ClearUsernameValidation;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class ClearUsernameValidation extends EditProfileDomainAction {
        public static final int $stable = 0;
        public static final ClearUsernameValidation INSTANCE = new ClearUsernameValidation();

        private ClearUsernameValidation() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainAction$DeleteAvatar;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DeleteAvatar extends EditProfileDomainAction {
        public static final int $stable = 0;
        public static final DeleteAvatar INSTANCE = new DeleteAvatar();

        private DeleteAvatar() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainAction$NoOp;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class NoOp extends EditProfileDomainAction {
        public static final int $stable = 0;
        public static final NoOp INSTANCE = new NoOp();

        private NoOp() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainAction$Refresh;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Refresh extends EditProfileDomainAction {
        public static final int $stable = 0;
        public static final Refresh INSTANCE = new Refresh();

        private Refresh() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainAction$RefreshAfterAvatarUpload;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class RefreshAfterAvatarUpload extends EditProfileDomainAction {
        public static final int $stable = 0;
        public static final RefreshAfterAvatarUpload INSTANCE = new RefreshAfterAvatarUpload();

        private RefreshAfterAvatarUpload() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainAction$RetryAvatarUpload;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class RetryAvatarUpload extends EditProfileDomainAction {
        public static final int $stable = 0;
        public static final RetryAvatarUpload INSTANCE = new RetryAvatarUpload();

        private RetryAvatarUpload() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainAction$SaveProfile;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction;", "formState", "Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "<init>", "(Lcom/whoop/profile/view/edit/form/EditProfileFormState;)V", "getFormState", "()Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class SaveProfile extends EditProfileDomainAction {
        public static final int $stable = TextResource.$stable;
        private final EditProfileFormState formState;

        public SaveProfile(EditProfileFormState editProfileFormState) {
            super(null);
            this.formState = editProfileFormState;
        }

        public static /* synthetic */ SaveProfile copy$default(SaveProfile saveProfile, EditProfileFormState editProfileFormState, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                editProfileFormState = saveProfile.formState;
            }
            return saveProfile.copy(editProfileFormState);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final EditProfileFormState getFormState() {
            return this.formState;
        }

        public final SaveProfile copy(EditProfileFormState formState) {
            return new SaveProfile(formState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SaveProfile) && AbstractC22676k.m65745e(this.formState, ((SaveProfile) other).formState);
        }

        public final EditProfileFormState getFormState() {
            return this.formState;
        }

        public int hashCode() {
            EditProfileFormState editProfileFormState = this.formState;
            if (editProfileFormState == null) {
                return 0;
            }
            return editProfileFormState.hashCode();
        }

        public String toString() {
            return "SaveProfile(formState=" + this.formState + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainAction$UploadAvatar;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction;", "imageData", "", "<init>", "([B)V", "getImageData", "()[B", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class UploadAvatar extends EditProfileDomainAction {
        public static final int $stable = 8;
        private final byte[] imageData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UploadAvatar(byte[] imageData) {
            super(null);
            AbstractC22676k.m65750j(imageData, "imageData");
            this.imageData = imageData;
        }

        public static /* synthetic */ UploadAvatar copy$default(UploadAvatar uploadAvatar, byte[] bArr, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                bArr = uploadAvatar.imageData;
            }
            return uploadAvatar.copy(bArr);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final byte[] getImageData() {
            return this.imageData;
        }

        public final UploadAvatar copy(byte[] imageData) {
            AbstractC22676k.m65750j(imageData, "imageData");
            return new UploadAvatar(imageData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UploadAvatar) && AbstractC22676k.m65745e(this.imageData, ((UploadAvatar) other).imageData);
        }

        public final byte[] getImageData() {
            return this.imageData;
        }

        public int hashCode() {
            return Arrays.hashCode(this.imageData);
        }

        public String toString() {
            return AbstractC11895b.m31996o("UploadAvatar(imageData=", Arrays.toString(this.imageData), ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ValidateEmailField;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction;", NotificationCompat.CATEGORY_EMAIL, "", "<init>", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class ValidateEmailField extends EditProfileDomainAction {
        public static final int $stable = 0;
        private final String email;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidateEmailField(String email) {
            super(null);
            AbstractC22676k.m65750j(email, "email");
            this.email = email;
        }

        public static /* synthetic */ ValidateEmailField copy$default(ValidateEmailField validateEmailField, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = validateEmailField.email;
            }
            return validateEmailField.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final ValidateEmailField copy(String email) {
            AbstractC22676k.m65750j(email, "email");
            return new ValidateEmailField(email);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ValidateEmailField) && AbstractC22676k.m65745e(this.email, ((ValidateEmailField) other).email);
        }

        public final String getEmail() {
            return this.email;
        }

        public int hashCode() {
            return this.email.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ValidateEmailField(email=", this.email, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ValidateUsernameField;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction;", "username", "", "<init>", "(Ljava/lang/String;)V", "getUsername", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class ValidateUsernameField extends EditProfileDomainAction {
        public static final int $stable = 0;
        private final String username;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidateUsernameField(String username) {
            super(null);
            AbstractC22676k.m65750j(username, "username");
            this.username = username;
        }

        public static /* synthetic */ ValidateUsernameField copy$default(ValidateUsernameField validateUsernameField, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = validateUsernameField.username;
            }
            return validateUsernameField.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        public final ValidateUsernameField copy(String username) {
            AbstractC22676k.m65750j(username, "username");
            return new ValidateUsernameField(username);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ValidateUsernameField) && AbstractC22676k.m65745e(this.username, ((ValidateUsernameField) other).username);
        }

        public final String getUsername() {
            return this.username;
        }

        public int hashCode() {
            return this.username.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ValidateUsernameField(username=", this.username, ")");
        }
    }

    public /* synthetic */ EditProfileDomainAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private EditProfileDomainAction() {
    }
}
