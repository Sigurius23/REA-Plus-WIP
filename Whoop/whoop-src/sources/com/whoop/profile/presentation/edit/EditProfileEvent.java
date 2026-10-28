package com.whoop.profile.presentation.edit;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.form.EditProfileFormState;
import ge3.AbstractC15751g;
import java.util.Arrays;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileEvent;", "", "ViewEvent", "Refresh", "UsernameFieldTapped", "SaveProfile", "ValidateEmailField", "ValidateUsernameField", "ClearUsernameValidation", "HelpIconClicked", "UploadAvatar", "DeleteAvatar", "AvatarUploadRetry", "CloseAvatarModal", "FieldType", "NavigationEvent", "GoBack", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$NavigationEvent;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface EditProfileEvent {

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileEvent$AvatarUploadRetry;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class AvatarUploadRetry implements ViewEvent {
        public static final int $stable = 0;
        public static final AvatarUploadRetry INSTANCE = new AvatarUploadRetry();

        private AvatarUploadRetry() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileEvent$ClearUsernameValidation;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class ClearUsernameValidation implements ViewEvent {
        public static final int $stable = 0;
        public static final ClearUsernameValidation INSTANCE = new ClearUsernameValidation();

        private ClearUsernameValidation() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileEvent$CloseAvatarModal;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class CloseAvatarModal implements ViewEvent {
        public static final int $stable = 0;
        public static final CloseAvatarModal INSTANCE = new CloseAvatarModal();

        private CloseAvatarModal() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileEvent$DeleteAvatar;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DeleteAvatar implements ViewEvent {
        public static final int $stable = 0;
        public static final DeleteAvatar INSTANCE = new DeleteAvatar();

        private DeleteAvatar() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;", "", "<init>", "(Ljava/lang/String;I)V", "EMAIL", "USERNAME", "FIRST_NAME", "LAST_NAME", "GENDER", "PHYSIOLOGICAL_BASELINE", "HEIGHT", "WEIGHT", "UNIT_SYSTEM", "COUNTRY", "STATE", "BIRTHDAY", "CITY", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum FieldType {
        EMAIL,
        USERNAME,
        FIRST_NAME,
        LAST_NAME,
        GENDER,
        PHYSIOLOGICAL_BASELINE,
        HEIGHT,
        WEIGHT,
        UNIT_SYSTEM,
        COUNTRY,
        STATE,
        BIRTHDAY,
        CITY;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileEvent$GoBack;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$NavigationEvent;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class GoBack implements NavigationEvent {
        public static final int $stable = 0;
        public static final GoBack INSTANCE = new GoBack();

        private GoBack() {
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileEvent$HelpIconClicked;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;", "field", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;", "<init>", "(Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;)V", "getField", "()Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class HelpIconClicked implements ViewEvent {
        public static final int $stable = 0;
        private final FieldType field;

        public HelpIconClicked(FieldType field) {
            AbstractC22676k.m65750j(field, "field");
            this.field = field;
        }

        public static /* synthetic */ HelpIconClicked copy$default(HelpIconClicked helpIconClicked, FieldType fieldType, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                fieldType = helpIconClicked.field;
            }
            return helpIconClicked.copy(fieldType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FieldType getField() {
            return this.field;
        }

        public final HelpIconClicked copy(FieldType field) {
            AbstractC22676k.m65750j(field, "field");
            return new HelpIconClicked(field);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HelpIconClicked) && this.field == ((HelpIconClicked) other).field;
        }

        public final FieldType getField() {
            return this.field;
        }

        public int hashCode() {
            return this.field.hashCode();
        }

        public String toString() {
            return "HelpIconClicked(field=" + this.field + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileEvent$NavigationEvent;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$GoBack;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface NavigationEvent extends EditProfileEvent {
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileEvent$Refresh;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Refresh implements ViewEvent {
        public static final int $stable = 0;
        public static final Refresh INSTANCE = new Refresh();

        private Refresh() {
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileEvent$SaveProfile;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;", "formState", "Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "<init>", "(Lcom/whoop/profile/view/edit/form/EditProfileFormState;)V", "getFormState", "()Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class SaveProfile implements ViewEvent {
        public static final int $stable = TextResource.$stable;
        private final EditProfileFormState formState;

        public SaveProfile(EditProfileFormState editProfileFormState) {
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

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileEvent$UploadAvatar;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;", "imageData", "", "<init>", "([B)V", "getImageData", "()[B", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class UploadAvatar implements ViewEvent {
        public static final int $stable = 8;
        private final byte[] imageData;

        public UploadAvatar(byte[] imageData) {
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

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileEvent$UsernameFieldTapped;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class UsernameFieldTapped implements ViewEvent {
        public static final int $stable = 0;
        public static final UsernameFieldTapped INSTANCE = new UsernameFieldTapped();

        private UsernameFieldTapped() {
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileEvent$ValidateEmailField;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;", NotificationCompat.CATEGORY_EMAIL, "", "<init>", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class ValidateEmailField implements ViewEvent {
        public static final int $stable = 0;
        private final String email;

        public ValidateEmailField(String email) {
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

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileEvent$ValidateUsernameField;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;", "username", "", "<init>", "(Ljava/lang/String;)V", "getUsername", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class ValidateUsernameField implements ViewEvent {
        public static final int $stable = 0;
        private final String username;

        public ValidateUsernameField(String username) {
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

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$AvatarUploadRetry;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ClearUsernameValidation;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$CloseAvatarModal;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$DeleteAvatar;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$HelpIconClicked;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$Refresh;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$SaveProfile;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$UploadAvatar;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$UsernameFieldTapped;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ValidateEmailField;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ValidateUsernameField;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface ViewEvent extends EditProfileEvent {
    }
}
