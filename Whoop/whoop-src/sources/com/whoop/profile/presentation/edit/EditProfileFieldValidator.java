package com.whoop.profile.presentation.edit;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.C9691R;
import d21.C11503a;
import l83.C23465k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;
import yb3.C39412p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\bJ%\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010\bJ\u0015\u0010!\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\"J\u0015\u0010%\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\"J%\u0010&\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b(\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020,8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00100\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010+R\u0014\u00101\u001a\u00020,8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010.R\u0014\u00102\u001a\u00020,8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010.R\u0014\u00103\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010+¨\u00064"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;", "", "<init>", "()V", "", NotificationCompat.CATEGORY_EMAIL, "Lcom/whoop/design/util/TextResource;", "validateEmail", "(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;", "username", "validateUsername", "firstName", "validateFirstName", "lastName", "validateLastName", "city", "validateCity", "", "heightValue", "", "isImperial", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;", "validationRanges", "validateHeight", "(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;)Lcom/whoop/design/util/TextResource;", "weightValue", "validateWeight", "(Ljava/lang/String;ZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;)Lcom/whoop/design/util/TextResource;", "feetValue", "validateFeet", "(Ljava/lang/String;Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;)Lcom/whoop/design/util/TextResource;", "inchesValue", "validateInches", "isEmailValid", "(Ljava/lang/String;)Z", "isUsernameValid", "name", "isNameValid", "isHeightValid", "(Ljava/lang/String;ZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;)Z", "isWeightValid", "Lyb3/p;", "EMAIL_PATTERN", "Lyb3/p;", "", "USERNAME_MIN_LENGTH", "I", "USERNAME_MAX_LENGTH", "USERNAME_PATTERN", "NAME_MIN_LENGTH", "NAME_MAX_LENGTH", "NAME_PATTERN", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EditProfileFieldValidator {
    private static final int NAME_MAX_LENGTH = 50;
    private static final int NAME_MIN_LENGTH = 1;
    private static final int USERNAME_MAX_LENGTH = 30;
    private static final int USERNAME_MIN_LENGTH = 3;
    public static final EditProfileFieldValidator INSTANCE = new EditProfileFieldValidator();
    private static final C39412p EMAIL_PATTERN = new C39412p("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    private static final C39412p USERNAME_PATTERN = new C39412p("^[a-zA-Z0-9_]+$");
    private static final C39412p NAME_PATTERN = new C39412p("^[\\p{L}\\s'-]+$");
    public static final int $stable = 8;

    private EditProfileFieldValidator() {
    }

    public final boolean isEmailValid(String email) {
        AbstractC22676k.m65750j(email, "email");
        return !AbstractC39414r.m125890i0(email) && EMAIL_PATTERN.m125851e(email);
    }

    public final boolean isHeightValid(String heightValue, boolean isImperial, EditProfileViewState.ValidationRanges validationRanges) {
        AbstractC22676k.m65750j(heightValue, "heightValue");
        AbstractC22676k.m65750j(validationRanges, "validationRanges");
        Float fM125915y = AbstractC39420x.m125915y(heightValue);
        if (fM125915y != null) {
            return AbstractC8693b.m21269c(validateHeight(fM125915y.floatValue(), isImperial, validationRanges));
        }
        return false;
    }

    public final boolean isNameValid(String name) {
        int length;
        AbstractC22676k.m65750j(name, "name");
        return !AbstractC39414r.m125890i0(name) && 1 <= (length = name.length()) && length < 51 && NAME_PATTERN.m125851e(name);
    }

    public final boolean isUsernameValid(String username) {
        int length;
        AbstractC22676k.m65750j(username, "username");
        return !AbstractC39414r.m125890i0(username) && 3 <= (length = username.length()) && length < 31 && USERNAME_PATTERN.m125851e(username);
    }

    public final boolean isWeightValid(String weightValue, boolean isImperial, EditProfileViewState.ValidationRanges validationRanges) {
        AbstractC22676k.m65750j(weightValue, "weightValue");
        AbstractC22676k.m65750j(validationRanges, "validationRanges");
        return AbstractC8693b.m21269c(validateWeight(weightValue, isImperial, validationRanges));
    }

    public final TextResource validateCity(String city) {
        AbstractC22676k.m65750j(city, "city");
        if (AbstractC39414r.m125890i0(city)) {
            return AbstractC8693b.m21267a();
        }
        if (city.length() < 1) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_city_too_short);
        }
        if (city.length() > NAME_MAX_LENGTH) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_city_too_long);
        }
        return !NAME_PATTERN.m125851e(city) ? AbstractC8693b.m21277k(C9691R.string.profile_edit_city_invalid_characters) : AbstractC8693b.m21267a();
    }

    public final TextResource validateEmail(String email) {
        AbstractC22676k.m65750j(email, "email");
        if (AbstractC39414r.m125890i0(email)) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_email_required);
        }
        return !EMAIL_PATTERN.m125851e(email) ? AbstractC8693b.m21277k(C9691R.string.profile_edit_email_invalid) : AbstractC8693b.m21267a();
    }

    public final TextResource validateFeet(String feetValue, EditProfileViewState.ValidationRanges validationRanges) {
        AbstractC22676k.m65750j(feetValue, "feetValue");
        AbstractC22676k.m65750j(validationRanges, "validationRanges");
        if (AbstractC39414r.m125890i0(feetValue)) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_feet_required);
        }
        Integer numM125932Q = AbstractC39421y.m125932Q(feetValue);
        if (numM125932Q == null || numM125932Q.intValue() < 0) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_feet_invalid);
        }
        if (numM125932Q.intValue() < validationRanges.getHeightFeetMin()) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_feet_too_short);
        }
        return numM125932Q.intValue() > validationRanges.getHeightFeetMax() ? AbstractC8693b.m21277k(C9691R.string.profile_edit_feet_too_tall) : AbstractC8693b.m21267a();
    }

    public final TextResource validateFirstName(String firstName) {
        AbstractC22676k.m65750j(firstName, "firstName");
        if (AbstractC39414r.m125890i0(firstName)) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_first_name_required);
        }
        if (firstName.length() < 1) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_first_name_too_short);
        }
        if (firstName.length() > NAME_MAX_LENGTH) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_first_name_too_long);
        }
        return !NAME_PATTERN.m125851e(firstName) ? AbstractC8693b.m21277k(C9691R.string.profile_edit_name_invalid_characters) : AbstractC8693b.m21267a();
    }

    public final TextResource validateHeight(float heightValue, boolean isImperial, EditProfileViewState.ValidationRanges validationRanges) {
        C23465k c23465k;
        AbstractC22676k.m65750j(validationRanges, "validationRanges");
        if (heightValue <= 0.0f) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_height_invalid);
        }
        if (isImperial) {
            C11503a c11503a = C11503a.f37005a;
            c23465k = new C23465k(Float.valueOf(c11503a.m30914c(validationRanges.getHeightFeetMin(), 0)), Float.valueOf(c11503a.m30914c(validationRanges.getHeightFeetMax(), 11)));
        } else {
            c23465k = new C23465k(Float.valueOf(validationRanges.getHeightMetersMin()), Float.valueOf(validationRanges.getHeightMetersMax()));
        }
        float fFloatValue = ((Number) c23465k.f92937w).floatValue();
        float fFloatValue2 = ((Number) c23465k.f92938x).floatValue();
        if (heightValue < fFloatValue) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_height_too_short);
        }
        return heightValue > fFloatValue2 ? AbstractC8693b.m21277k(C9691R.string.profile_edit_height_too_tall) : AbstractC8693b.m21267a();
    }

    public final TextResource validateInches(String inchesValue) {
        AbstractC22676k.m65750j(inchesValue, "inchesValue");
        if (AbstractC39414r.m125890i0(inchesValue)) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_inches_required);
        }
        Integer numM125932Q = AbstractC39421y.m125932Q(inchesValue);
        if (numM125932Q == null || numM125932Q.intValue() < 0) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_inches_invalid);
        }
        return numM125932Q.intValue() >= 12 ? AbstractC8693b.m21277k(C9691R.string.profile_edit_inches_too_many) : AbstractC8693b.m21267a();
    }

    public final TextResource validateLastName(String lastName) {
        AbstractC22676k.m65750j(lastName, "lastName");
        if (AbstractC39414r.m125890i0(lastName)) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_last_name_required);
        }
        if (lastName.length() < 1) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_last_name_too_short);
        }
        if (lastName.length() > NAME_MAX_LENGTH) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_last_name_too_long);
        }
        return !NAME_PATTERN.m125851e(lastName) ? AbstractC8693b.m21277k(C9691R.string.profile_edit_name_invalid_characters) : AbstractC8693b.m21267a();
    }

    public final TextResource validateUsername(String username) {
        AbstractC22676k.m65750j(username, "username");
        if (AbstractC39414r.m125890i0(username)) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_username_required);
        }
        if (username.length() < 3) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_username_too_short);
        }
        if (username.length() > 30) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_username_too_long);
        }
        return !USERNAME_PATTERN.m125851e(username) ? AbstractC8693b.m21277k(C9691R.string.profile_edit_username_invalid_characters) : AbstractC8693b.m21267a();
    }

    public final TextResource validateWeight(String weightValue, boolean isImperial, EditProfileViewState.ValidationRanges validationRanges) {
        AbstractC22676k.m65750j(weightValue, "weightValue");
        AbstractC22676k.m65750j(validationRanges, "validationRanges");
        if (AbstractC39414r.m125890i0(weightValue)) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_weight_required);
        }
        Integer numM125932Q = AbstractC39421y.m125932Q(weightValue);
        if (numM125932Q == null || numM125932Q.intValue() <= 0) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_weight_invalid);
        }
        if (isImperial) {
            if (numM125932Q.intValue() < validationRanges.getWeightPoundsMin()) {
                return AbstractC8693b.m21277k(C9691R.string.profile_edit_weight_too_light);
            }
            return numM125932Q.intValue() > validationRanges.getWeightPoundsMax() ? AbstractC8693b.m21277k(C9691R.string.profile_edit_weight_too_heavy) : AbstractC8693b.m21267a();
        }
        if (numM125932Q.intValue() < validationRanges.getWeightKilogramsMin()) {
            return AbstractC8693b.m21277k(C9691R.string.profile_edit_weight_too_light);
        }
        return numM125932Q.intValue() > validationRanges.getWeightKilogramsMax() ? AbstractC8693b.m21277k(C9691R.string.profile_edit_weight_too_heavy) : AbstractC8693b.m21267a();
    }
}
