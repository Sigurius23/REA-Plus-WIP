package com.whoop.profile.presentation.edit.reducers;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystem;
import com.whoop.domain.model.UnitSystemExtKt;
import com.whoop.profile.C9691R;
import com.whoop.profile.domain.edit.EditProfileDialogType;
import com.whoop.profile.domain.edit.EditProfileDomainState;
import com.whoop.profile.domain.edit.models.CountryOption;
import com.whoop.profile.domain.edit.models.EditProfileResponse;
import com.whoop.profile.domain.edit.models.ProfileLockField;
import com.whoop.profile.domain.edit.models.StateOption;
import com.whoop.profile.domain.models.Gender;
import com.whoop.profile.domain.models.PhysiologicalBaseline;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import gy0.AbstractC16272a;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33208p0;
import p736sz0.C33205o0;
import p736sz0.C33211q0;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ*\u0010\n\u001a\u00020\u0007*\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\"\u0010\u0012\u001a\u00020\u0007*\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\tH\u0002J\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\f\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;", "", "featureFlagChecker", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "reduce", "Lcom/whoop/profile/presentation/edit/EditProfileViewState;", "domainResult", "Lcom/whoop/profile/domain/edit/EditProfileDomainState;", "toFullScreenModal", "Lcom/whoop/profile/domain/edit/EditProfileDialogType$FullScreenModal;", "domainState", "isUsernameFieldEditable", "", "lockedFields", "", "Lcom/whoop/profile/domain/edit/models/ProfileLockField;", "toViewState", "createEditableFields", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;", "mapResponseToProfileData", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;", "response", "Lcom/whoop/profile/domain/edit/models/EditProfileResponse;", "createAvatarState", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;", "createEmailValidationState", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;", "createUsernameValidationState", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;", "createAvatarModal", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EditProfileViewStateReducer {
    public static final int $stable = 8;
    private final FeatureFlagChecker featureFlagChecker;

    public EditProfileViewStateReducer(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
    }

    private final EditProfileViewState.FullScreenModal createAvatarModal(EditProfileDomainState domainState) {
        if (domainState.getAvatarState().isUploading()) {
            return new EditProfileViewState.FullScreenModal(new C33211q0(null, new AbstractC33208p0.e(AbstractC8693b.m21277k(C9691R.string.profile_avatar_uploading_profile_image), AbstractC16272a.f61896B2), null, null, null, false, false, null, false, false, 1021, null), null, null, null, 14, null);
        }
        if (domainState.getAvatarState().getUploadSuccess()) {
            return new EditProfileViewState.FullScreenModal(new C33211q0(null, new AbstractC33208p0.h(AbstractC8693b.m21277k(C9691R.string.profile_avatar_success), 1500L, null, 4, null), AbstractC8693b.m21277k(C9691R.string.profile_avatar_upload_success), null, null, false, false, null, false, false, MessageListItemViewType.START_OF_THE_CHANNEL, null), EditProfileEvent.CloseAvatarModal.INSTANCE, null, null, 12, null);
        }
        if (domainState.getAvatarState().getUploadError() != null) {
            return new EditProfileViewState.FullScreenModal(new C33211q0(null, new AbstractC33208p0.b(AbstractC8693b.m21277k(C9691R.string.profile_avatar_unable_to_upload), true, null, 4, null), AbstractC8693b.m21277k(C9691R.string.profile_avatar_upload_error_message), null, AbstractC8693b.m21277k(C9691R.string.profile_avatar_retry_button), true, false, AbstractC8693b.m21277k(C9691R.string.profile_avatar_close_button), false, false, 841, null), EditProfileEvent.AvatarUploadRetry.INSTANCE, EditProfileEvent.CloseAvatarModal.INSTANCE, null, 8, null);
        }
        return null;
    }

    private final EditProfileViewState.AvatarViewState createAvatarState(EditProfileDomainState domainState) {
        boolean zIsUploading = domainState.getAvatarState().isUploading();
        boolean uploadSuccess = domainState.getAvatarState().getUploadSuccess();
        String uploadError = domainState.getAvatarState().getUploadError();
        EditProfileResponse response = domainState.getResponse();
        return new EditProfileViewState.AvatarViewState(zIsUploading, uploadSuccess, uploadError, response != null ? response.getAvatarUrl() : null, false, null, false, domainState.getAvatarState().isUploading(), domainState.getAvatarState().getUploadSuccess(), domainState.getAvatarState().getUploadError() != null, domainState.getAvatarState().getPendingUploadData(), 112, null);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    private final EditProfileViewState.EditableFields createEditableFields(EditProfileDomainState domainState, Set<? extends ProfileLockField> lockedFields) {
        String email;
        String str;
        String city;
        String birthday;
        String state;
        String country;
        String unitSystem;
        String strValueOf;
        String strValueOf2;
        PhysiologicalBaseline physiologicalBaseline;
        String strName;
        String lastName;
        String firstName;
        String username;
        EditProfileResponse response = domainState.getResponse();
        if (response == null || (email = response.getEmail()) == null) {
            email = "";
        }
        EditProfileViewState.EditableFieldState editableFieldState = new EditProfileViewState.EditableFieldState(email, false, false, null, lockedFields.contains(ProfileLockField.EMAIL), 14, null);
        EditProfileViewState.EditableFieldState editableFieldState2 = new EditProfileViewState.EditableFieldState((response == null || (username = response.getUsername()) == null) ? "" : username, false, false, null, lockedFields.contains(ProfileLockField.USERNAME), 14, null);
        EditProfileViewState.EditableFieldState editableFieldState3 = new EditProfileViewState.EditableFieldState((response == null || (firstName = response.getFirstName()) == null) ? "" : firstName, false, false, null, lockedFields.contains(ProfileLockField.FIRST_NAME), 14, null);
        EditProfileViewState.EditableFieldState editableFieldState4 = new EditProfileViewState.EditableFieldState((response == null || (lastName = response.getLastName()) == null) ? "" : lastName, false, false, null, lockedFields.contains(ProfileLockField.LAST_NAME), 14, null);
        if (response == null) {
            str = "";
        } else {
            Gender gender = response.getGender();
            if (gender == null) {
                gender = Gender.PREFER_NOT;
            }
            String strName2 = gender.name();
            if (strName2 == null) {
                str = "";
            } else {
                str = strName2;
            }
        }
        return new EditProfileViewState.EditableFields(editableFieldState, editableFieldState2, editableFieldState3, editableFieldState4, new EditProfileViewState.EditableFieldState(str, false, false, null, lockedFields.contains(ProfileLockField.GENDER), 14, null), new EditProfileViewState.EditableFieldState((response == null || (physiologicalBaseline = response.getPhysiologicalBaseline()) == null || (strName = physiologicalBaseline.name()) == null) ? "" : strName, false, false, null, lockedFields.contains(ProfileLockField.PHYSIOLOGICAL_BASELINE), 14, null), new EditProfileViewState.EditableFieldState((response == null || (strValueOf2 = String.valueOf(response.getHeight())) == null) ? "" : strValueOf2, false, false, null, lockedFields.contains(ProfileLockField.HEIGHT), 12, null), new EditProfileViewState.EditableFieldState((response == null || (strValueOf = String.valueOf(response.getWeight())) == null) ? "" : strValueOf, false, false, null, lockedFields.contains(ProfileLockField.WEIGHT), 12, null), new EditProfileViewState.EditableFieldState((response == null || (unitSystem = response.getUnitSystem()) == null) ? "" : unitSystem, false, false, null, false, 28, null), new EditProfileViewState.EditableFieldState((response == null || (country = response.getCountry()) == null) ? "" : country, false, false, null, lockedFields.contains(ProfileLockField.COUNTRY), 12, null), new EditProfileViewState.EditableFieldState((response == null || (state = response.getState()) == null) ? "" : state, false, false, null, lockedFields.contains(ProfileLockField.STATE), 12, null), new EditProfileViewState.EditableFieldState((response == null || (birthday = response.getBirthday()) == null) ? "" : birthday, false, false, null, lockedFields.contains(ProfileLockField.BIRTHDAY), 12, null), new EditProfileViewState.EditableFieldState((response == null || (city = response.getCity()) == null) ? "" : city, false, false, null, lockedFields.contains(ProfileLockField.CITY), 12, null));
    }

    private final EditProfileViewState.EmailValidationViewState createEmailValidationState(EditProfileDomainState domainState) {
        Boolean bool;
        EditProfileDomainState.EmailValidationResult result = domainState.getEmailValidationState().getResult();
        boolean zIsValidating = domainState.getEmailValidationState().isValidating();
        boolean z4 = result instanceof EditProfileDomainState.EmailValidationResult.Available;
        TextResource.C8688b c8688bM21277k = null;
        if (z4) {
            bool = Boolean.TRUE;
        } else if ((result instanceof EditProfileDomainState.EmailValidationResult.NotAvailable) || (result instanceof EditProfileDomainState.EmailValidationResult.NetworkError)) {
            bool = Boolean.FALSE;
        } else {
            if (result != null) {
                throw new NoWhenBranchMatchedException();
            }
            bool = null;
        }
        if (result instanceof EditProfileDomainState.EmailValidationResult.NotAvailable) {
            c8688bM21277k = AbstractC8693b.m21277k(C9691R.string.profile_edit_email_cannot_be_used);
        } else if (result instanceof EditProfileDomainState.EmailValidationResult.NetworkError) {
            c8688bM21277k = AbstractC8693b.m21277k(C9691R.string.profile_edit_email_validation_network_error);
        } else if (!z4 && result != null) {
            throw new NoWhenBranchMatchedException();
        }
        return new EditProfileViewState.EmailValidationViewState(zIsValidating, bool, c8688bM21277k, domainState.getEmailValidationState().getLastValidatedEmail());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    private final EditProfileViewState.UsernameValidationViewState createUsernameValidationState(EditProfileDomainState domainState) {
        Boolean bool;
        TextResource textResourceM21278l;
        String message;
        EditProfileDomainState.UsernameValidationResult result = domainState.getUsernameValidationState().getResult();
        boolean zIsValidating = domainState.getUsernameValidationState().isValidating();
        boolean z4 = result instanceof EditProfileDomainState.UsernameValidationResult.Available;
        TextResource textResourceM21278l2 = null;
        if (z4) {
            bool = Boolean.TRUE;
        } else if ((result instanceof EditProfileDomainState.UsernameValidationResult.NotAvailable) || (result instanceof EditProfileDomainState.UsernameValidationResult.NetworkError)) {
            bool = Boolean.FALSE;
        } else {
            if (result != null) {
                throw new NoWhenBranchMatchedException();
            }
            bool = null;
        }
        if (result instanceof EditProfileDomainState.UsernameValidationResult.NotAvailable) {
            String message2 = ((EditProfileDomainState.UsernameValidationResult.NotAvailable) result).getMessage();
            if (message2 == null) {
                textResourceM21278l = null;
            } else {
                if (AbstractC39414r.m125890i0(message2)) {
                    message2 = null;
                }
                if (message2 != null) {
                    textResourceM21278l = AbstractC8693b.m21278l(message2);
                } else {
                    textResourceM21278l = null;
                }
            }
        } else {
            if (result instanceof EditProfileDomainState.UsernameValidationResult.NetworkError) {
                String message3 = ((EditProfileDomainState.UsernameValidationResult.NetworkError) result).getMessage();
                if (message3 != null) {
                    if (AbstractC39414r.m125890i0(message3)) {
                        message3 = null;
                    }
                    if (message3 != null) {
                        textResourceM21278l = AbstractC8693b.m21278l(message3);
                    }
                }
            } else if (!z4 && result != null) {
                throw new NoWhenBranchMatchedException();
            }
            textResourceM21278l = null;
        }
        if (z4 && (message = ((EditProfileDomainState.UsernameValidationResult.Available) result).getMessage()) != null) {
            if (AbstractC39414r.m125890i0(message)) {
                message = null;
            }
            if (message != null) {
                textResourceM21278l2 = AbstractC8693b.m21278l(message);
            }
        }
        return new EditProfileViewState.UsernameValidationViewState(zIsValidating, bool, textResourceM21278l, textResourceM21278l2, domainState.getUsernameValidationState().getLastValidatedUsername());
    }

    private final EditProfileViewState.EditProfileData mapResponseToProfileData(EditProfileResponse response) {
        List arrayList;
        String title = response.getTitle();
        if (title == null) {
            title = "";
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(title);
        String avatarUrl = response.getAvatarUrl();
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(response.getFirstName());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(response.getLastName());
        String username = response.getUsername();
        if (username == null) {
            username = "";
        }
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(username);
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(response.getEmail());
        String city = response.getCity();
        TextResource textResourceM21278l6 = city != null ? AbstractC8693b.m21278l(city) : null;
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l(response.getCountry());
        double memberSince = response.getMemberSince();
        int age = response.getAge();
        Boolean foundingMember = response.getFoundingMember();
        boolean zBooleanValue = foundingMember != null ? foundingMember.booleanValue() : false;
        long userId = response.getUserId();
        float height = response.getHeight();
        double weight = response.getWeight();
        String birthday = response.getBirthday();
        if (birthday == null) {
            birthday = "";
        }
        TextResource textResourceM21278l8 = AbstractC8693b.m21278l(birthday);
        UnitSystem unitSystemUnitSystemFromStringOrDefault$default = UnitSystemExtKt.unitSystemFromStringOrDefault$default(response.getUnitSystem(), null, 2, null);
        Gender gender = response.getGender();
        if (gender == null) {
            gender = Gender.PREFER_NOT;
        }
        TextResource textResourceM21278l9 = AbstractC8693b.m21278l(gender.name());
        PhysiologicalBaseline physiologicalBaseline = response.getPhysiologicalBaseline();
        TextResource textResourceM21278l10 = AbstractC8693b.m21278l(physiologicalBaseline != null ? physiologicalBaseline.name() : null);
        int i13 = 10;
        EditProfileViewState.ValidationRanges validationRanges = new EditProfileViewState.ValidationRanges(response.getHeightFeetMinValue() == 0 ? 3 : response.getHeightFeetMinValue(), response.getHeightFeetMaxValue() == 0 ? 7 : response.getHeightFeetMaxValue(), (response.getHeightMetersMinValue() == null || AbstractC22676k.m65743c(response.getHeightMetersMinValue(), 0.0f)) ? 0.91f : response.getHeightMetersMinValue().floatValue(), (response.getHeightMetersMaxValue() == null || AbstractC22676k.m65743c(response.getHeightMetersMaxValue(), 0.0f)) ? 2.13f : response.getHeightMetersMaxValue().floatValue(), response.getWeightPoundsMinValue() == 0 ? 50 : response.getWeightPoundsMinValue(), response.getWeightPoundsMaxValue() == 0 ? 400 : response.getWeightPoundsMaxValue(), response.getWeightKilogramsMinValue() == 0 ? 10 : response.getWeightKilogramsMinValue(), response.getWeightKilogramsMaxValue() == 0 ? 500 : response.getWeightKilogramsMaxValue());
        List<CountryOption> countries = response.getCountries();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(countries, 10));
        Iterator it = countries.iterator();
        while (it.hasNext()) {
            CountryOption countryOption = (CountryOption) it.next();
            TextResource textResourceM21278l11 = AbstractC8693b.m21278l(countryOption.getName());
            String countryCode = countryOption.getCountryCode();
            String countryFlag = countryOption.getCountryFlag();
            String str = countryFlag == null ? "" : countryFlag;
            String ageLimit = countryOption.getAgeLimit();
            List<StateOption> states = countryOption.getStates();
            if (states != null) {
                List<StateOption> list = states;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list, i13));
                for (Iterator it3 = list.iterator(); it3.hasNext(); it3 = it3) {
                    StateOption stateOption = (StateOption) it3.next();
                    arrayList.add(new EditProfileViewState.State(AbstractC8693b.m21278l(stateOption.getName()), stateOption.getStateCode()));
                }
            } else {
                arrayList = C25271y.f99162w;
            }
            arrayList2.add(new EditProfileViewState.Country(textResourceM21278l11, countryCode, str, ageLimit, arrayList));
            it = it;
            avatarUrl = avatarUrl;
            i13 = 10;
        }
        return new EditProfileViewState.EditProfileData(textResourceM21278l, avatarUrl, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, textResourceM21278l5, textResourceM21278l6, textResourceM21278l7, null, memberSince, age, zBooleanValue, userId, height, weight, textResourceM21278l8, unitSystemUnitSystemFromStringOrDefault$default, textResourceM21278l9, textResourceM21278l10, validationRanges, arrayList2);
    }

    private final EditProfileViewState toFullScreenModal(EditProfileDialogType.FullScreenModal fullScreenModal, EditProfileDomainState editProfileDomainState, boolean z4, Set<? extends ProfileLockField> set) {
        if (fullScreenModal instanceof EditProfileDialogType.Loading) {
            EditProfileViewState.FullScreenModal fullScreenModal2 = new EditProfileViewState.FullScreenModal(C33205o0.f138451a.m105288b(), null, null, null, 14, null);
            EditProfileResponse response = editProfileDomainState.getResponse();
            EditProfileViewState.EditProfileData editProfileDataMapResponseToProfileData = response != null ? mapResponseToProfileData(response) : null;
            EditProfileViewState.EditableFields editableFieldsCreateEditableFields = createEditableFields(editProfileDomainState, set);
            EditProfileViewState.AvatarViewState avatarViewStateCreateAvatarState = createAvatarState(editProfileDomainState);
            EditProfileViewState.EmailValidationViewState emailValidationViewStateCreateEmailValidationState = createEmailValidationState(editProfileDomainState);
            EditProfileViewState.UsernameValidationViewState usernameValidationViewStateCreateUsernameValidationState = createUsernameValidationState(editProfileDomainState);
            EditProfileResponse response2 = editProfileDomainState.getResponse();
            return new EditProfileViewState(null, fullScreenModal2, editProfileDataMapResponseToProfileData, editableFieldsCreateEditableFields, avatarViewStateCreateAvatarState, emailValidationViewStateCreateEmailValidationState, usernameValidationViewStateCreateUsernameValidationState, (response2 != null ? response2.getUsername() : null) != null, z4, 1, null);
        }
        if (fullScreenModal instanceof EditProfileDialogType.Saving) {
            EditProfileViewState.FullScreenModal fullScreenModal3 = new EditProfileViewState.FullScreenModal(C33205o0.f138451a.m105288b(), null, null, null, 14, null);
            EditProfileResponse response3 = editProfileDomainState.getResponse();
            EditProfileViewState.EditProfileData editProfileDataMapResponseToProfileData2 = response3 != null ? mapResponseToProfileData(response3) : null;
            EditProfileViewState.EditableFields editableFieldsCreateEditableFields2 = createEditableFields(editProfileDomainState, set);
            EditProfileViewState.AvatarViewState avatarViewStateCreateAvatarState2 = createAvatarState(editProfileDomainState);
            EditProfileViewState.EmailValidationViewState emailValidationViewStateCreateEmailValidationState2 = createEmailValidationState(editProfileDomainState);
            EditProfileViewState.UsernameValidationViewState usernameValidationViewStateCreateUsernameValidationState2 = createUsernameValidationState(editProfileDomainState);
            EditProfileResponse response4 = editProfileDomainState.getResponse();
            return new EditProfileViewState(null, fullScreenModal3, editProfileDataMapResponseToProfileData2, editableFieldsCreateEditableFields2, avatarViewStateCreateAvatarState2, emailValidationViewStateCreateEmailValidationState2, usernameValidationViewStateCreateUsernameValidationState2, (response4 != null ? response4.getUsername() : null) != null, z4, 1, null);
        }
        if (fullScreenModal instanceof EditProfileDialogType.NetworkError) {
            EditProfileViewState.FullScreenModal fullScreenModal4 = new EditProfileViewState.FullScreenModal(C33205o0.f138451a.m105289c(), EditProfileEvent.Refresh.INSTANCE, null, EditProfileEvent.GoBack.INSTANCE, 4, null);
            EditProfileResponse response5 = editProfileDomainState.getResponse();
            EditProfileViewState.EditProfileData editProfileDataMapResponseToProfileData3 = response5 != null ? mapResponseToProfileData(response5) : null;
            EditProfileViewState.EditableFields editableFieldsCreateEditableFields3 = createEditableFields(editProfileDomainState, set);
            EditProfileViewState.AvatarViewState avatarViewStateCreateAvatarState3 = createAvatarState(editProfileDomainState);
            EditProfileViewState.EmailValidationViewState emailValidationViewStateCreateEmailValidationState3 = createEmailValidationState(editProfileDomainState);
            EditProfileViewState.UsernameValidationViewState usernameValidationViewStateCreateUsernameValidationState3 = createUsernameValidationState(editProfileDomainState);
            EditProfileResponse response6 = editProfileDomainState.getResponse();
            return new EditProfileViewState(null, fullScreenModal4, editProfileDataMapResponseToProfileData3, editableFieldsCreateEditableFields3, avatarViewStateCreateAvatarState3, emailValidationViewStateCreateEmailValidationState3, usernameValidationViewStateCreateUsernameValidationState3, (response6 != null ? response6.getUsername() : null) != null, z4, 1, null);
        }
        if (fullScreenModal instanceof EditProfileDialogType.RequestFailed) {
            EditProfileViewState.FullScreenModal fullScreenModal5 = new EditProfileViewState.FullScreenModal(C33205o0.f138451a.m105291e(), EditProfileEvent.Refresh.INSTANCE, null, EditProfileEvent.GoBack.INSTANCE, 4, null);
            EditProfileResponse response7 = editProfileDomainState.getResponse();
            EditProfileViewState.EditProfileData editProfileDataMapResponseToProfileData4 = response7 != null ? mapResponseToProfileData(response7) : null;
            EditProfileViewState.EditableFields editableFieldsCreateEditableFields4 = createEditableFields(editProfileDomainState, set);
            EditProfileViewState.AvatarViewState avatarViewStateCreateAvatarState4 = createAvatarState(editProfileDomainState);
            EditProfileViewState.EmailValidationViewState emailValidationViewStateCreateEmailValidationState4 = createEmailValidationState(editProfileDomainState);
            EditProfileViewState.UsernameValidationViewState usernameValidationViewStateCreateUsernameValidationState4 = createUsernameValidationState(editProfileDomainState);
            EditProfileResponse response8 = editProfileDomainState.getResponse();
            return new EditProfileViewState(null, fullScreenModal5, editProfileDataMapResponseToProfileData4, editableFieldsCreateEditableFields4, avatarViewStateCreateAvatarState4, emailValidationViewStateCreateEmailValidationState4, usernameValidationViewStateCreateUsernameValidationState4, (response8 != null ? response8.getUsername() : null) != null, z4, 1, null);
        }
        if (fullScreenModal instanceof EditProfileDialogType.Success) {
            EditProfileViewState.FullScreenModal fullScreenModal6 = new EditProfileViewState.FullScreenModal(C33205o0.f138451a.m105293g(), null, null, null, 14, null);
            EditProfileResponse response9 = editProfileDomainState.getResponse();
            EditProfileViewState.EditProfileData editProfileDataMapResponseToProfileData5 = response9 != null ? mapResponseToProfileData(response9) : null;
            EditProfileViewState.EditableFields editableFieldsCreateEditableFields5 = createEditableFields(editProfileDomainState, set);
            EditProfileViewState.AvatarViewState avatarViewStateCreateAvatarState5 = createAvatarState(editProfileDomainState);
            EditProfileViewState.EmailValidationViewState emailValidationViewStateCreateEmailValidationState5 = createEmailValidationState(editProfileDomainState);
            EditProfileViewState.UsernameValidationViewState usernameValidationViewStateCreateUsernameValidationState5 = createUsernameValidationState(editProfileDomainState);
            EditProfileResponse response10 = editProfileDomainState.getResponse();
            return new EditProfileViewState(null, fullScreenModal6, editProfileDataMapResponseToProfileData5, editableFieldsCreateEditableFields5, avatarViewStateCreateAvatarState5, emailValidationViewStateCreateEmailValidationState5, usernameValidationViewStateCreateUsernameValidationState5, (response10 != null ? response10.getUsername() : null) != null, z4, 1, null);
        }
        if (!(fullScreenModal instanceof EditProfileDialogType.SaveError)) {
            throw new NoWhenBranchMatchedException();
        }
        C33211q0 c33211q0M105291e = C33205o0.f138451a.m105291e();
        EditProfileEvent.GoBack goBack = EditProfileEvent.GoBack.INSTANCE;
        EditProfileViewState.FullScreenModal fullScreenModal7 = new EditProfileViewState.FullScreenModal(c33211q0M105291e, goBack, null, goBack, 4, null);
        EditProfileResponse response11 = editProfileDomainState.getResponse();
        EditProfileViewState.EditProfileData editProfileDataMapResponseToProfileData6 = response11 != null ? mapResponseToProfileData(response11) : null;
        EditProfileViewState.EditableFields editableFieldsCreateEditableFields6 = createEditableFields(editProfileDomainState, set);
        EditProfileViewState.AvatarViewState avatarViewStateCreateAvatarState6 = createAvatarState(editProfileDomainState);
        EditProfileViewState.EmailValidationViewState emailValidationViewStateCreateEmailValidationState6 = createEmailValidationState(editProfileDomainState);
        EditProfileViewState.UsernameValidationViewState usernameValidationViewStateCreateUsernameValidationState6 = createUsernameValidationState(editProfileDomainState);
        EditProfileResponse response12 = editProfileDomainState.getResponse();
        return new EditProfileViewState(null, fullScreenModal7, editProfileDataMapResponseToProfileData6, editableFieldsCreateEditableFields6, avatarViewStateCreateAvatarState6, emailValidationViewStateCreateEmailValidationState6, usernameValidationViewStateCreateUsernameValidationState6, (response12 != null ? response12.getUsername() : null) != null, z4, 1, null);
    }

    private final EditProfileViewState toViewState(EditProfileDomainState editProfileDomainState, boolean z4, Set<? extends ProfileLockField> set) {
        EditProfileViewState.FullScreenModal fullScreenModalCreateAvatarModal = createAvatarModal(editProfileDomainState);
        EditProfileResponse response = editProfileDomainState.getResponse();
        if (response == null) {
            return new EditProfileViewState(null, fullScreenModalCreateAvatarModal == null ? new EditProfileViewState.FullScreenModal(C33205o0.f138451a.m105291e(), EditProfileEvent.Refresh.INSTANCE, null, EditProfileEvent.GoBack.INSTANCE, 4, null) : fullScreenModalCreateAvatarModal, null, null, createAvatarState(editProfileDomainState), createEmailValidationState(editProfileDomainState), createUsernameValidationState(editProfileDomainState), false, z4, 13, null);
        }
        EditProfileViewState.EditProfileData editProfileDataMapResponseToProfileData = mapResponseToProfileData(response);
        EditProfileViewState.EditableFields editableFieldsCreateEditableFields = createEditableFields(editProfileDomainState, set);
        EditProfileViewState.AvatarViewState avatarViewStateCreateAvatarState = createAvatarState(editProfileDomainState);
        EditProfileViewState.EmailValidationViewState emailValidationViewStateCreateEmailValidationState = createEmailValidationState(editProfileDomainState);
        EditProfileViewState.UsernameValidationViewState usernameValidationViewStateCreateUsernameValidationState = createUsernameValidationState(editProfileDomainState);
        EditProfileResponse response2 = editProfileDomainState.getResponse();
        return new EditProfileViewState(null, fullScreenModalCreateAvatarModal, editProfileDataMapResponseToProfileData, editableFieldsCreateEditableFields, avatarViewStateCreateAvatarState, emailValidationViewStateCreateEmailValidationState, usernameValidationViewStateCreateUsernameValidationState, (response2 != null ? response2.getUsername() : null) != null, z4, 1, null);
    }

    public final EditProfileViewState reduce(EditProfileDomainState domainResult) {
        Set<? extends ProfileLockField> setM74103I1;
        List<String> lockedFields;
        Object next;
        AbstractC22676k.m65750j(domainResult, "domainResult");
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.PROFILE_USERNAME_FIELD);
        EditProfileResponse response = domainResult.getResponse();
        if (response == null || (lockedFields = response.getLockedFields()) == null) {
            setM74103I1 = C25235a0.f99113w;
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str : lockedFields) {
                Iterator<E> it = ProfileLockField.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC22676k.m65745e(((ProfileLockField) next).name(), str));
                ProfileLockField profileLockField = (ProfileLockField) next;
                if (profileLockField != null) {
                    arrayList.add(profileLockField);
                }
            }
            setM74103I1 = AbstractC25265s.m74103I1(arrayList);
        }
        EditProfileDialogType currentDialogType = domainResult.getCurrentDialogType();
        if (currentDialogType instanceof EditProfileDialogType.FullScreenModal) {
            return toFullScreenModal((EditProfileDialogType.FullScreenModal) domainResult.getCurrentDialogType(), domainResult, zIsFeatureEnabled, setM74103I1);
        }
        return currentDialogType instanceof EditProfileDialogType.NoChangesToSave ? toViewState(domainResult, zIsFeatureEnabled, setM74103I1) : toViewState(domainResult, zIsFeatureEnabled, setM74103I1);
    }
}
