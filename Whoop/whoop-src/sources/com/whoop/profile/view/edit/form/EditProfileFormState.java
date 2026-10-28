package com.whoop.profile.view.edit.form;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020!J\u0006\u0010%\u001a\u00020!J\u0010\u0010&\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020!J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u008b\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0014\u00105\u001a\u00020!2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00107\u001a\u000208HÖ\u0081\u0004J\n\u00109\u001a\u00020:HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u0006;"}, m65681d2 = {"Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "", NotificationCompat.CATEGORY_EMAIL, "Lcom/whoop/profile/view/edit/form/FieldState;", "username", "firstName", "lastName", "height", "weight", "unitSystem", "gender", "physiologicalBaseline", "country", "state", "birthday", "city", "<init>", "(Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;)V", "getEmail", "()Lcom/whoop/profile/view/edit/form/FieldState;", "getUsername", "getFirstName", "getLastName", "getHeight", "getWeight", "getUnitSystem", "getGender", "getPhysiologicalBaseline", "getCountry", "getState", "getBirthday", "getCity", "isAnyFieldDirty", "", "original", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;", "includeUsername", "anyFieldValidating", "hasErrors", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class EditProfileFormState {
    public static final int $stable = TextResource.$stable;
    private final FieldState birthday;
    private final FieldState city;
    private final FieldState country;
    private final FieldState email;
    private final FieldState firstName;
    private final FieldState gender;
    private final FieldState height;
    private final FieldState lastName;
    private final FieldState physiologicalBaseline;
    private final FieldState state;
    private final FieldState unitSystem;
    private final FieldState username;
    private final FieldState weight;

    public EditProfileFormState(FieldState email, FieldState username, FieldState firstName, FieldState lastName, FieldState height, FieldState weight, FieldState unitSystem, FieldState gender, FieldState physiologicalBaseline, FieldState country, FieldState state, FieldState birthday, FieldState city) {
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(username, "username");
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(height, "height");
        AbstractC22676k.m65750j(weight, "weight");
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        AbstractC22676k.m65750j(gender, "gender");
        AbstractC22676k.m65750j(physiologicalBaseline, "physiologicalBaseline");
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(birthday, "birthday");
        AbstractC22676k.m65750j(city, "city");
        this.email = email;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
        this.unitSystem = unitSystem;
        this.gender = gender;
        this.physiologicalBaseline = physiologicalBaseline;
        this.country = country;
        this.state = state;
        this.birthday = birthday;
        this.city = city;
    }

    public static /* synthetic */ EditProfileFormState copy$default(EditProfileFormState editProfileFormState, FieldState fieldState, FieldState fieldState2, FieldState fieldState3, FieldState fieldState4, FieldState fieldState5, FieldState fieldState6, FieldState fieldState7, FieldState fieldState8, FieldState fieldState9, FieldState fieldState10, FieldState fieldState11, FieldState fieldState12, FieldState fieldState13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            fieldState = editProfileFormState.email;
        }
        return editProfileFormState.copy(fieldState, (i13 & 2) != 0 ? editProfileFormState.username : fieldState2, (i13 & 4) != 0 ? editProfileFormState.firstName : fieldState3, (i13 & 8) != 0 ? editProfileFormState.lastName : fieldState4, (i13 & 16) != 0 ? editProfileFormState.height : fieldState5, (i13 & 32) != 0 ? editProfileFormState.weight : fieldState6, (i13 & 64) != 0 ? editProfileFormState.unitSystem : fieldState7, (i13 & 128) != 0 ? editProfileFormState.gender : fieldState8, (i13 & 256) != 0 ? editProfileFormState.physiologicalBaseline : fieldState9, (i13 & 512) != 0 ? editProfileFormState.country : fieldState10, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? editProfileFormState.state : fieldState11, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? editProfileFormState.birthday : fieldState12, (i13 & 4096) != 0 ? editProfileFormState.city : fieldState13);
    }

    public static /* synthetic */ boolean hasErrors$default(EditProfileFormState editProfileFormState, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = true;
        }
        return editProfileFormState.hasErrors(z4);
    }

    public static /* synthetic */ boolean isAnyFieldDirty$default(EditProfileFormState editProfileFormState, EditProfileViewState.EditableFields editableFields, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = true;
        }
        return editProfileFormState.isAnyFieldDirty(editableFields, z4);
    }

    public final boolean anyFieldValidating() {
        List listM118959K = AbstractC37056f.m118959K(this.email, this.username, this.firstName, this.lastName, this.height, this.weight, this.unitSystem, this.gender, this.physiologicalBaseline, this.country, this.state, this.birthday, this.city);
        if ((listM118959K instanceof Collection) && listM118959K.isEmpty()) {
            return false;
        }
        Iterator it = listM118959K.iterator();
        while (it.hasNext()) {
            if (((FieldState) it.next()).isValidating()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FieldState getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final FieldState getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final FieldState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final FieldState getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final FieldState getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FieldState getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FieldState getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FieldState getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final FieldState getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final FieldState getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final FieldState getUnitSystem() {
        return this.unitSystem;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final FieldState getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final FieldState getPhysiologicalBaseline() {
        return this.physiologicalBaseline;
    }

    public final EditProfileFormState copy(FieldState email, FieldState username, FieldState firstName, FieldState lastName, FieldState height, FieldState weight, FieldState unitSystem, FieldState gender, FieldState physiologicalBaseline, FieldState country, FieldState state, FieldState birthday, FieldState city) {
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(username, "username");
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(height, "height");
        AbstractC22676k.m65750j(weight, "weight");
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        AbstractC22676k.m65750j(gender, "gender");
        AbstractC22676k.m65750j(physiologicalBaseline, "physiologicalBaseline");
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(birthday, "birthday");
        AbstractC22676k.m65750j(city, "city");
        return new EditProfileFormState(email, username, firstName, lastName, height, weight, unitSystem, gender, physiologicalBaseline, country, state, birthday, city);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditProfileFormState)) {
            return false;
        }
        EditProfileFormState editProfileFormState = (EditProfileFormState) other;
        return AbstractC22676k.m65745e(this.email, editProfileFormState.email) && AbstractC22676k.m65745e(this.username, editProfileFormState.username) && AbstractC22676k.m65745e(this.firstName, editProfileFormState.firstName) && AbstractC22676k.m65745e(this.lastName, editProfileFormState.lastName) && AbstractC22676k.m65745e(this.height, editProfileFormState.height) && AbstractC22676k.m65745e(this.weight, editProfileFormState.weight) && AbstractC22676k.m65745e(this.unitSystem, editProfileFormState.unitSystem) && AbstractC22676k.m65745e(this.gender, editProfileFormState.gender) && AbstractC22676k.m65745e(this.physiologicalBaseline, editProfileFormState.physiologicalBaseline) && AbstractC22676k.m65745e(this.country, editProfileFormState.country) && AbstractC22676k.m65745e(this.state, editProfileFormState.state) && AbstractC22676k.m65745e(this.birthday, editProfileFormState.birthday) && AbstractC22676k.m65745e(this.city, editProfileFormState.city);
    }

    public final FieldState getBirthday() {
        return this.birthday;
    }

    public final FieldState getCity() {
        return this.city;
    }

    public final FieldState getCountry() {
        return this.country;
    }

    public final FieldState getEmail() {
        return this.email;
    }

    public final FieldState getFirstName() {
        return this.firstName;
    }

    public final FieldState getGender() {
        return this.gender;
    }

    public final FieldState getHeight() {
        return this.height;
    }

    public final FieldState getLastName() {
        return this.lastName;
    }

    public final FieldState getPhysiologicalBaseline() {
        return this.physiologicalBaseline;
    }

    public final FieldState getState() {
        return this.state;
    }

    public final FieldState getUnitSystem() {
        return this.unitSystem;
    }

    public final FieldState getUsername() {
        return this.username;
    }

    public final FieldState getWeight() {
        return this.weight;
    }

    public final boolean hasErrors(boolean includeUsername) {
        return AbstractC8693b.m21270d(this.email.getError()) || this.email.isValidating() || (this.email.getHasBeenInteractedWith() && !this.email.getHasBeenValidated() && this.email.getValue().length() > 0) || (includeUsername && (AbstractC8693b.m21270d(this.username.getError()) || this.username.isValidating() || (this.username.getHasBeenInteractedWith() && !this.username.getHasBeenValidated() && this.username.getValue().length() > 0))) || AbstractC8693b.m21270d(this.firstName.getError()) || AbstractC8693b.m21270d(this.lastName.getError()) || AbstractC8693b.m21270d(this.height.getError()) || AbstractC8693b.m21270d(this.weight.getError()) || AbstractC8693b.m21270d(this.gender.getError()) || AbstractC8693b.m21270d(this.physiologicalBaseline.getError()) || AbstractC8693b.m21270d(this.country.getError()) || AbstractC8693b.m21270d(this.state.getError()) || AbstractC8693b.m21270d(this.birthday.getError()) || AbstractC8693b.m21270d(this.city.getError());
    }

    public int hashCode() {
        return this.city.hashCode() + ((this.birthday.hashCode() + ((this.state.hashCode() + ((this.country.hashCode() + ((this.physiologicalBaseline.hashCode() + ((this.gender.hashCode() + ((this.unitSystem.hashCode() + ((this.weight.hashCode() + ((this.height.hashCode() + ((this.lastName.hashCode() + ((this.firstName.hashCode() + ((this.username.hashCode() + (this.email.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean isAnyFieldDirty(EditProfileViewState.EditableFields original, boolean includeUsername) {
        AbstractC22676k.m65750j(original, "original");
        return (AbstractC22676k.m65745e(this.email.getValue(), original.getEmail().getValue()) && !(includeUsername && !AbstractC22676k.m65745e(this.username.getValue(), original.getUsername().getValue())) && AbstractC22676k.m65745e(this.firstName.getValue(), original.getFirstName().getValue()) && AbstractC22676k.m65745e(this.lastName.getValue(), original.getLastName().getValue()) && AbstractC22676k.m65745e(this.height.getValue(), original.getHeight().getValue()) && AbstractC22676k.m65745e(this.weight.getValue(), original.getWeight().getValue()) && AbstractC22676k.m65745e(this.unitSystem.getValue(), original.getUnitSystem().getValue()) && AbstractC22676k.m65745e(this.gender.getValue(), original.getGender().getValue()) && AbstractC22676k.m65745e(this.physiologicalBaseline.getValue(), original.getPhysiologicalBaseline().getValue()) && AbstractC22676k.m65745e(this.country.getValue(), original.getCountry().getValue()) && AbstractC22676k.m65745e(this.state.getValue(), original.getState().getValue()) && AbstractC22676k.m65745e(this.birthday.getValue(), original.getBirthday().getValue()) && AbstractC22676k.m65745e(this.city.getValue(), original.getCity().getValue())) ? false : true;
    }

    public String toString() {
        return "EditProfileFormState(email=" + this.email + ", username=" + this.username + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", height=" + this.height + ", weight=" + this.weight + ", unitSystem=" + this.unitSystem + ", gender=" + this.gender + ", physiologicalBaseline=" + this.physiologicalBaseline + ", country=" + this.country + ", state=" + this.state + ", birthday=" + this.birthday + ", city=" + this.city + ")";
    }
}
