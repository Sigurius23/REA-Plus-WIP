package com.whoop.profile.view.edit.form;

import b30.C2663y4;
import com.whoop.data.local.room.dao.persistent.C6498i;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystemExtKt;
import com.whoop.profile.C9691R;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import com.whoop.profile.presentation.edit.EditProfileFieldValidator;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import d21.C11503a;
import e93.AbstractC12889b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u000256B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\nJ\u001e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ4\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\nJ;\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010\u001bJ(\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\bJ\u0016\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bJ\u0016\u0010#\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bJ(\u0010$\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(J\u0016\u0010)\u001a\u00020*2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eJ4\u0010+\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\nJ;\u0010-\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010\u001bJ,\u0010.\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*00H\u0002J.\u00101\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\bJ$\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002¨\u00067"}, m65681d2 = {"Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;", "", "<init>", "()V", "updateEmailField", "Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "formState", "newValue", "", "emailValidationCache", "", "", "updateNonEmailField", "fieldType", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;", "updateUsernameField", "updateFieldValue", "Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;", "currentFormState", "value", "applyEmailValidationResult", "lastValidatedEmail", "isValid", "validationError", "Lcom/whoop/design/util/TextResource;", "profileData", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;", "(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "handleUsernameFieldBlur", "originalUsername", "showUsernameField", "lastValidatedUsername", "isUsernameFieldValidating", "formStateUsernameValidating", "viewStateUsernameValidating", "shouldTriggerUsernameValidation", "isSaveButtonEnabled", "editableFields", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;", "usernameValidationState", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;", "getFieldByType", "Lcom/whoop/profile/view/edit/form/FieldState;", "handleEmailValidation", "Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;", "applyUsernameValidationResult", "updateField", "transform", "Lkotlin/Function1;", "validateField", "countryCode", "validateStateField", "state", "EmailValidationResult", "UpdateFieldValueResult", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EditProfileFormUtils {
    public static final int $stable = 0;
    public static final EditProfileFormUtils INSTANCE = new EditProfileFormUtils();

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EditProfileEvent.FieldType.values().length];
            try {
                iArr[EditProfileEvent.FieldType.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EditProfileEvent.FieldType.USERNAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EditProfileEvent.FieldType.FIRST_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EditProfileEvent.FieldType.LAST_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EditProfileEvent.FieldType.HEIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EditProfileEvent.FieldType.WEIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EditProfileEvent.FieldType.UNIT_SYSTEM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EditProfileEvent.FieldType.GENDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EditProfileEvent.FieldType.PHYSIOLOGICAL_BASELINE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EditProfileEvent.FieldType.COUNTRY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EditProfileEvent.FieldType.STATE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EditProfileEvent.FieldType.BIRTHDAY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EditProfileEvent.FieldType.CITY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private EditProfileFormUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldState applyEmailValidationResult$lambda$0(TextResource textResource, FieldState field) {
        AbstractC22676k.m65750j(field, "field");
        return FieldState.copy$default(field, null, textResource, false, true, false, false, 21, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldState applyUsernameValidationResult$lambda$0(TextResource textResource, FieldState field) {
        AbstractC22676k.m65750j(field, "field");
        return FieldState.copy$default(field, null, textResource, false, true, false, false, 21, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldState handleEmailValidation$lambda$0(TextResource textResource, FieldState field) {
        AbstractC22676k.m65750j(field, "field");
        return FieldState.copy$default(field, null, textResource, false, true, false, false, 21, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldState handleEmailValidation$lambda$1(FieldState field) {
        AbstractC22676k.m65750j(field, "field");
        return FieldState.copy$default(field, null, AbstractC8693b.m21267a(), false, true, false, true, 21, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldState handleEmailValidation$lambda$2(TextResource textResource, FieldState field) {
        AbstractC22676k.m65750j(field, "field");
        return FieldState.copy$default(field, null, textResource, false, true, false, false, 21, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldState handleUsernameFieldBlur$lambda$0(TextResource textResource, FieldState field) {
        AbstractC22676k.m65750j(field, "field");
        return FieldState.copy$default(field, null, textResource, false, true, false, false, 21, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldState handleUsernameFieldBlur$lambda$1(FieldState field) {
        AbstractC22676k.m65750j(field, "field");
        return FieldState.copy$default(field, null, null, false, true, false, false, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldState handleUsernameFieldBlur$lambda$2(FieldState field) {
        AbstractC22676k.m65750j(field, "field");
        return FieldState.copy$default(field, null, AbstractC8693b.m21267a(), false, true, false, false, 21, null);
    }

    public static /* synthetic */ boolean isSaveButtonEnabled$default(EditProfileFormUtils editProfileFormUtils, EditProfileFormState editProfileFormState, EditProfileViewState.EditableFields editableFields, boolean z4, EditProfileViewState.UsernameValidationViewState usernameValidationViewState, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            usernameValidationViewState = new EditProfileViewState.UsernameValidationViewState(false, null, null, null, null, 31, null);
        }
        return editProfileFormUtils.isSaveButtonEnabled(editProfileFormState, editableFields, z4, usernameValidationViewState);
    }

    private static final boolean updateEmailField$lambda$0(String str, String it) {
        AbstractC22676k.m65750j(it, "it");
        return !it.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldState updateEmailField$lambda$1(String str, FieldState field) {
        AbstractC22676k.m65750j(field, "field");
        return FieldState.copy$default(field, str, AbstractC8693b.m21267a(), false, false, true, false, 4, null);
    }

    private final EditProfileFormState updateField(EditProfileFormState formState, EditProfileEvent.FieldType fieldType, Function1 transform) {
        switch (WhenMappings.$EnumSwitchMapping$0[fieldType.ordinal()]) {
            case 1:
                return EditProfileFormState.copy$default(formState, (FieldState) transform.invoke(formState.getEmail()), null, null, null, null, null, null, null, null, null, null, null, null, 8190, null);
            case 2:
                return EditProfileFormState.copy$default(formState, null, (FieldState) transform.invoke(formState.getUsername()), null, null, null, null, null, null, null, null, null, null, null, 8189, null);
            case 3:
                return EditProfileFormState.copy$default(formState, null, null, (FieldState) transform.invoke(formState.getFirstName()), null, null, null, null, null, null, null, null, null, null, 8187, null);
            case 4:
                return EditProfileFormState.copy$default(formState, null, null, null, (FieldState) transform.invoke(formState.getLastName()), null, null, null, null, null, null, null, null, null, 8183, null);
            case 5:
                return EditProfileFormState.copy$default(formState, null, null, null, null, (FieldState) transform.invoke(formState.getHeight()), null, null, null, null, null, null, null, null, 8175, null);
            case 6:
                return EditProfileFormState.copy$default(formState, null, null, null, null, null, (FieldState) transform.invoke(formState.getWeight()), null, null, null, null, null, null, null, 8159, null);
            case 7:
                return EditProfileFormState.copy$default(formState, null, null, null, null, null, null, (FieldState) transform.invoke(formState.getUnitSystem()), null, null, null, null, null, null, 8127, null);
            case 8:
                return EditProfileFormState.copy$default(formState, null, null, null, null, null, null, null, (FieldState) transform.invoke(formState.getGender()), null, null, null, null, null, 8063, null);
            case 9:
                return EditProfileFormState.copy$default(formState, null, null, null, null, null, null, null, null, (FieldState) transform.invoke(formState.getPhysiologicalBaseline()), null, null, null, null, 7935, null);
            case 10:
                return EditProfileFormState.copy$default(formState, null, null, null, null, null, null, null, null, null, (FieldState) transform.invoke(formState.getCountry()), null, null, null, 7679, null);
            case 11:
                return EditProfileFormState.copy$default(formState, null, null, null, null, null, null, null, null, null, null, (FieldState) transform.invoke(formState.getState()), null, null, 7167, null);
            case 12:
                return EditProfileFormState.copy$default(formState, null, null, null, null, null, null, null, null, null, null, null, (FieldState) transform.invoke(formState.getBirthday()), null, 6143, null);
            case 13:
                return EditProfileFormState.copy$default(formState, null, null, null, null, null, null, null, null, null, null, null, null, (FieldState) transform.invoke(formState.getCity()), 4095, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldState updateNonEmailField$lambda$0(String str, FieldState field) {
        AbstractC22676k.m65750j(field, "field");
        return FieldState.copy$default(field, str, null, false, false, true, false, 46, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldState updateUsernameField$lambda$0(String str, TextResource textResource, FieldState field) {
        AbstractC22676k.m65750j(field, "field");
        return FieldState.copy$default(field, str, textResource, false, true, true, false, 4, null);
    }

    public static /* synthetic */ TextResource validateField$default(EditProfileFormUtils editProfileFormUtils, EditProfileEvent.FieldType fieldType, String str, EditProfileViewState.EditProfileData editProfileData, String str2, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            editProfileData = null;
        }
        if ((i13 & 8) != 0) {
            str2 = null;
        }
        return editProfileFormUtils.validateField(fieldType, str, editProfileData, str2);
    }

    private final TextResource validateStateField(String state, String countryCode, EditProfileViewState.EditProfileData profileData) {
        Object next;
        List<EditProfileViewState.State> states;
        if (profileData == null || countryCode == null) {
            return AbstractC8693b.m21267a();
        }
        Iterator<T> it = profileData.getCountries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((EditProfileViewState.Country) next).getCountryCode(), countryCode));
        EditProfileViewState.Country country = (EditProfileViewState.Country) next;
        return (country == null || (states = country.getStates()) == null || !(states.isEmpty() ^ true) || !AbstractC39414r.m125890i0(state)) ? AbstractC8693b.m21267a() : AbstractC8693b.m21277k(C9691R.string.profile_edit_state_required_for_selected_country);
    }

    public final EditProfileFormState applyEmailValidationResult(EditProfileFormState currentFormState, String lastValidatedEmail, Boolean isValid, TextResource validationError, EditProfileViewState.EditProfileData profileData) {
        AbstractC22676k.m65750j(currentFormState, "currentFormState");
        if (!AbstractC22676k.m65745e(currentFormState.getEmail().getValue(), lastValidatedEmail) || !currentFormState.getEmail().getHasBeenInteractedWith() || isValid == null) {
            return currentFormState;
        }
        EditProfileEvent.FieldType fieldType = EditProfileEvent.FieldType.EMAIL;
        if (!AbstractC8693b.m21269c(validateField(fieldType, currentFormState.getEmail().getValue(), profileData, null))) {
            return currentFormState;
        }
        if (isValid.equals(Boolean.TRUE)) {
            validationError = AbstractC8693b.m21267a();
        } else if (validationError == null) {
            validationError = AbstractC8693b.m21277k(C9691R.string.profile_edit_email_cannot_be_used);
        }
        return updateField(currentFormState, fieldType, new C9777a(validationError, 1));
    }

    public final EditProfileFormState applyUsernameValidationResult(EditProfileFormState currentFormState, String lastValidatedUsername, Boolean isValid, TextResource validationError, EditProfileViewState.EditProfileData profileData) {
        AbstractC22676k.m65750j(currentFormState, "currentFormState");
        if (lastValidatedUsername == null || !AbstractC22676k.m65745e(currentFormState.getUsername().getValue(), lastValidatedUsername) || !currentFormState.getUsername().getHasBeenInteractedWith() || isValid == null) {
            return currentFormState;
        }
        EditProfileEvent.FieldType fieldType = EditProfileEvent.FieldType.USERNAME;
        if (!AbstractC8693b.m21269c(validateField(fieldType, currentFormState.getUsername().getValue(), profileData, null))) {
            return currentFormState;
        }
        if (isValid.equals(Boolean.TRUE) || validationError == null) {
            validationError = AbstractC8693b.m21267a();
        }
        return updateField(currentFormState, fieldType, new C9777a(validationError, 0));
    }

    public final FieldState getFieldByType(EditProfileFormState formState, EditProfileEvent.FieldType fieldType) {
        AbstractC22676k.m65750j(formState, "formState");
        AbstractC22676k.m65750j(fieldType, "fieldType");
        switch (WhenMappings.$EnumSwitchMapping$0[fieldType.ordinal()]) {
            case 1:
                return formState.getEmail();
            case 2:
                return formState.getUsername();
            case 3:
                return formState.getFirstName();
            case 4:
                return formState.getLastName();
            case 5:
                return formState.getHeight();
            case 6:
                return formState.getWeight();
            case 7:
                return formState.getUnitSystem();
            case 8:
                return formState.getGender();
            case 9:
                return formState.getPhysiologicalBaseline();
            case 10:
                return formState.getCountry();
            case 11:
                return formState.getState();
            case 12:
                return formState.getBirthday();
            case 13:
                return formState.getCity();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final EmailValidationResult handleEmailValidation(EditProfileFormState currentFormState, EditProfileEvent.FieldType fieldType, EditProfileViewState.EditProfileData profileData, Map<String, Boolean> emailValidationCache) {
        AbstractC22676k.m65750j(currentFormState, "currentFormState");
        AbstractC22676k.m65750j(fieldType, "fieldType");
        AbstractC22676k.m65750j(emailValidationCache, "emailValidationCache");
        FieldState fieldByType = getFieldByType(currentFormState, fieldType);
        TextResource textResourceValidateField = validateField(fieldType, fieldByType.getValue(), profileData, currentFormState.getCountry().getValue());
        if (fieldType != EditProfileEvent.FieldType.EMAIL || !AbstractC8693b.m21269c(textResourceValidateField) || !fieldByType.getHasBeenInteractedWith()) {
            return new EmailValidationResult(updateField(currentFormState, fieldType, new C9777a(textResourceValidateField, 3)), false, null, 6, null);
        }
        String value = fieldByType.getValue();
        if (emailValidationCache.containsKey(value)) {
            return new EmailValidationResult(updateField(currentFormState, fieldType, new C9777a(AbstractC22676k.m65745e(emailValidationCache.get(value), Boolean.TRUE) ? AbstractC8693b.m21267a() : AbstractC8693b.m21277k(C9691R.string.profile_edit_email_cannot_be_used), 2)), false, null, 6, null);
        }
        return new EmailValidationResult(updateField(currentFormState, fieldType, new C6498i(29)), true, value);
    }

    public final EditProfileFormState handleUsernameFieldBlur(EditProfileFormState currentFormState, String originalUsername, boolean showUsernameField, String lastValidatedUsername) {
        AbstractC22676k.m65750j(currentFormState, "currentFormState");
        AbstractC22676k.m65750j(originalUsername, "originalUsername");
        FieldState username = currentFormState.getUsername();
        TextResource textResourceValidateUsername = EditProfileFieldValidator.INSTANCE.validateUsername(username.getValue());
        boolean z4 = showUsernameField && !AbstractC22676k.m65745e(username.getValue(), originalUsername);
        if (AbstractC8693b.m21270d(textResourceValidateUsername)) {
            return updateField(currentFormState, EditProfileEvent.FieldType.USERNAME, new C9777a(textResourceValidateUsername, 4));
        }
        return (z4 && (AbstractC8693b.m21270d(username.getError()) || AbstractC22676k.m65745e(lastValidatedUsername, username.getValue()))) ? updateField(currentFormState, EditProfileEvent.FieldType.USERNAME, new C9779c(0)) : updateField(currentFormState, EditProfileEvent.FieldType.USERNAME, new C9779c(1));
    }

    public final boolean isSaveButtonEnabled(EditProfileFormState formState, EditProfileViewState.EditableFields editableFields, boolean showUsernameField, EditProfileViewState.UsernameValidationViewState usernameValidationState) {
        AbstractC22676k.m65750j(formState, "formState");
        AbstractC22676k.m65750j(editableFields, "editableFields");
        AbstractC22676k.m65750j(usernameValidationState, "usernameValidationState");
        if (formState.anyFieldValidating()) {
            return false;
        }
        if (!showUsernameField || AbstractC22676k.m65745e(formState.getUsername().getValue(), editableFields.getUsername().getValue())) {
            return formState.isAnyFieldDirty(editableFields, false) && !formState.hasErrors(false);
        }
        return !formState.getUsername().isValidating() && AbstractC8693b.m21269c(formState.getUsername().getError()) && (AbstractC22676k.m65745e(usernameValidationState.isValid(), Boolean.TRUE) && AbstractC22676k.m65745e(usernameValidationState.getLastValidatedUsername(), formState.getUsername().getValue())) && !formState.hasErrors(true);
    }

    public final boolean isUsernameFieldValidating(boolean formStateUsernameValidating, boolean viewStateUsernameValidating) {
        return formStateUsernameValidating || viewStateUsernameValidating;
    }

    public final boolean shouldTriggerUsernameValidation(String value, String originalUsername) {
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(originalUsername, "originalUsername");
        return (!AbstractC8693b.m21269c(EditProfileFieldValidator.INSTANCE.validateUsername(value)) || AbstractC39414r.m125890i0(value) || value.equals(originalUsername)) ? false : true;
    }

    public final EditProfileFormState updateEmailField(EditProfileFormState formState, String newValue, Map<String, Boolean> emailValidationCache) {
        AbstractC22676k.m65750j(formState, "formState");
        AbstractC22676k.m65750j(newValue, "newValue");
        AbstractC22676k.m65750j(emailValidationCache, "emailValidationCache");
        Set<String> setKeySet = emailValidationCache.keySet();
        AbstractC22676k.m65750j(setKeySet, "<this>");
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            if (updateEmailField$lambda$0(newValue, (String) it.next())) {
                it.remove();
            }
        }
        return updateField(formState, EditProfileEvent.FieldType.EMAIL, new C2663y4(newValue, 10));
    }

    public final UpdateFieldValueResult updateFieldValue(EditProfileFormState currentFormState, EditProfileEvent.FieldType fieldType, String value, Map<String, Boolean> emailValidationCache) {
        EditProfileFormState editProfileFormStateUpdateUsernameField;
        AbstractC22676k.m65750j(currentFormState, "currentFormState");
        AbstractC22676k.m65750j(fieldType, "fieldType");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(emailValidationCache, "emailValidationCache");
        if (AbstractC22676k.m65745e(getFieldByType(currentFormState, fieldType).getValue(), value)) {
            return null;
        }
        if (fieldType == EditProfileEvent.FieldType.EMAIL) {
            editProfileFormStateUpdateUsernameField = updateEmailField(currentFormState, value, emailValidationCache);
        } else {
            editProfileFormStateUpdateUsernameField = fieldType == EditProfileEvent.FieldType.USERNAME ? updateUsernameField(currentFormState, value) : updateNonEmailField(currentFormState, fieldType, value);
        }
        return new UpdateFieldValueResult(editProfileFormStateUpdateUsernameField, fieldType == EditProfileEvent.FieldType.COUNTRY || fieldType == EditProfileEvent.FieldType.STATE);
    }

    public final EditProfileFormState updateNonEmailField(EditProfileFormState formState, EditProfileEvent.FieldType fieldType, String newValue) {
        AbstractC22676k.m65750j(formState, "formState");
        AbstractC22676k.m65750j(fieldType, "fieldType");
        AbstractC22676k.m65750j(newValue, "newValue");
        return updateField(formState, fieldType, new C2663y4(newValue, 9));
    }

    public final EditProfileFormState updateUsernameField(EditProfileFormState formState, String newValue) {
        AbstractC22676k.m65750j(formState, "formState");
        AbstractC22676k.m65750j(newValue, "newValue");
        return updateField(formState, EditProfileEvent.FieldType.USERNAME, new C9778b(newValue, EditProfileFieldValidator.INSTANCE.validateUsername(newValue), 0));
    }

    public final TextResource validateField(EditProfileEvent.FieldType fieldType, String value, EditProfileViewState.EditProfileData profileData, String countryCode) {
        AbstractC22676k.m65750j(fieldType, "fieldType");
        AbstractC22676k.m65750j(value, "value");
        switch (WhenMappings.$EnumSwitchMapping$0[fieldType.ordinal()]) {
            case 1:
                return EditProfileFieldValidator.INSTANCE.validateEmail(value);
            case 2:
                return EditProfileFieldValidator.INSTANCE.validateUsername(value);
            case 3:
                return EditProfileFieldValidator.INSTANCE.validateFirstName(value);
            case 4:
                return EditProfileFieldValidator.INSTANCE.validateLastName(value);
            case 5:
                if (profileData == null) {
                    return AbstractC8693b.m21267a();
                }
                Float fM125915y = AbstractC39420x.m125915y(value);
                return EditProfileFieldValidator.INSTANCE.validateHeight(fM125915y != null ? fM125915y.floatValue() : 0.0f, UnitSystemExtKt.isImperial(profileData.getUnitSystem()), profileData.getValidationRanges());
            case 6:
                if (profileData == null) {
                    return AbstractC8693b.m21267a();
                }
                boolean zIsImperial = UnitSystemExtKt.isImperial(profileData.getUnitSystem());
                Float fM125915y2 = AbstractC39420x.m125915y(value);
                float fFloatValue = fM125915y2 != null ? fM125915y2.floatValue() : 0.0f;
                return EditProfileFieldValidator.INSTANCE.validateWeight(String.valueOf(zIsImperial ? C11503a.f37005a.m30924m(fFloatValue) : AbstractC12889b.m36258X(fFloatValue)), zIsImperial, profileData.getValidationRanges());
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
                return AbstractC8693b.m21267a();
            case 11:
                return validateStateField(value, countryCode, profileData);
            case 13:
                return EditProfileFieldValidator.INSTANCE.validateCity(value);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;", "", "formState", "Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "shouldValidateState", "", "<init>", "(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Z)V", "getFormState", "()Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "getShouldValidateState", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class UpdateFieldValueResult {
        public static final int $stable = TextResource.$stable;
        private final EditProfileFormState formState;
        private final boolean shouldValidateState;

        public UpdateFieldValueResult(EditProfileFormState formState, boolean z4) {
            AbstractC22676k.m65750j(formState, "formState");
            this.formState = formState;
            this.shouldValidateState = z4;
        }

        public static /* synthetic */ UpdateFieldValueResult copy$default(UpdateFieldValueResult updateFieldValueResult, EditProfileFormState editProfileFormState, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                editProfileFormState = updateFieldValueResult.formState;
            }
            if ((i13 & 2) != 0) {
                z4 = updateFieldValueResult.shouldValidateState;
            }
            return updateFieldValueResult.copy(editProfileFormState, z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final EditProfileFormState getFormState() {
            return this.formState;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getShouldValidateState() {
            return this.shouldValidateState;
        }

        public final UpdateFieldValueResult copy(EditProfileFormState formState, boolean shouldValidateState) {
            AbstractC22676k.m65750j(formState, "formState");
            return new UpdateFieldValueResult(formState, shouldValidateState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateFieldValueResult)) {
                return false;
            }
            UpdateFieldValueResult updateFieldValueResult = (UpdateFieldValueResult) other;
            return AbstractC22676k.m65745e(this.formState, updateFieldValueResult.formState) && this.shouldValidateState == updateFieldValueResult.shouldValidateState;
        }

        public final EditProfileFormState getFormState() {
            return this.formState;
        }

        public final boolean getShouldValidateState() {
            return this.shouldValidateState;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldValidateState) + (this.formState.hashCode() * 31);
        }

        public String toString() {
            return "UpdateFieldValueResult(formState=" + this.formState + ", shouldValidateState=" + this.shouldValidateState + ")";
        }

        public /* synthetic */ UpdateFieldValueResult(EditProfileFormState editProfileFormState, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(editProfileFormState, (i13 & 2) != 0 ? false : z4);
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;", "", "formState", "Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "shouldTriggerApiValidation", "", "emailToValidate", "", "<init>", "(Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZLjava/lang/String;)V", "getFormState", "()Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "getShouldTriggerApiValidation", "()Z", "getEmailToValidate", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class EmailValidationResult {
        public static final int $stable = TextResource.$stable;
        private final String emailToValidate;
        private final EditProfileFormState formState;
        private final boolean shouldTriggerApiValidation;

        public EmailValidationResult(EditProfileFormState formState, boolean z4, String str) {
            AbstractC22676k.m65750j(formState, "formState");
            this.formState = formState;
            this.shouldTriggerApiValidation = z4;
            this.emailToValidate = str;
        }

        public static /* synthetic */ EmailValidationResult copy$default(EmailValidationResult emailValidationResult, EditProfileFormState editProfileFormState, boolean z4, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                editProfileFormState = emailValidationResult.formState;
            }
            if ((i13 & 2) != 0) {
                z4 = emailValidationResult.shouldTriggerApiValidation;
            }
            if ((i13 & 4) != 0) {
                str = emailValidationResult.emailToValidate;
            }
            return emailValidationResult.copy(editProfileFormState, z4, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final EditProfileFormState getFormState() {
            return this.formState;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getShouldTriggerApiValidation() {
            return this.shouldTriggerApiValidation;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getEmailToValidate() {
            return this.emailToValidate;
        }

        public final EmailValidationResult copy(EditProfileFormState formState, boolean shouldTriggerApiValidation, String emailToValidate) {
            AbstractC22676k.m65750j(formState, "formState");
            return new EmailValidationResult(formState, shouldTriggerApiValidation, emailToValidate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmailValidationResult)) {
                return false;
            }
            EmailValidationResult emailValidationResult = (EmailValidationResult) other;
            return AbstractC22676k.m65745e(this.formState, emailValidationResult.formState) && this.shouldTriggerApiValidation == emailValidationResult.shouldTriggerApiValidation && AbstractC22676k.m65745e(this.emailToValidate, emailValidationResult.emailToValidate);
        }

        public final String getEmailToValidate() {
            return this.emailToValidate;
        }

        public final EditProfileFormState getFormState() {
            return this.formState;
        }

        public final boolean getShouldTriggerApiValidation() {
            return this.shouldTriggerApiValidation;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(this.formState.hashCode() * 31, 31, this.shouldTriggerApiValidation);
            String str = this.emailToValidate;
            return iM8289b + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            EditProfileFormState editProfileFormState = this.formState;
            boolean z4 = this.shouldTriggerApiValidation;
            String str = this.emailToValidate;
            StringBuilder sb4 = new StringBuilder("EmailValidationResult(formState=");
            sb4.append(editProfileFormState);
            sb4.append(", shouldTriggerApiValidation=");
            sb4.append(z4);
            sb4.append(", emailToValidate=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }

        public /* synthetic */ EmailValidationResult(EditProfileFormState editProfileFormState, boolean z4, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(editProfileFormState, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? null : str);
        }
    }
}
