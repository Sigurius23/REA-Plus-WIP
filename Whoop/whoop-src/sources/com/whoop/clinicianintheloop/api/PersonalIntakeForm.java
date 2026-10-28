package com.whoop.clinicianintheloop.api;

import com.whoop.design.models.items.form.FormTextFieldModel;
import com.whoop.design.models.items.form.FormTextFieldModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BCBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eB\u007f\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015Jt\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b6\u0010\u0015R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00103\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010\u0015R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00103\u0012\u0004\b;\u00109\u001a\u0004\b:\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b<\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b=\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b>\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b?\u0010\u0015R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b@\u0010\u0015¨\u0006D"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;", "", "Lcom/whoop/design/models/items/form/FormTextFieldModel;", "firstName", "lastName", "dateOfBirth", "addressLine1", "addressLine2", "city", "state", "zipCode", "country", "phoneNumber", "<init>", "(Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/models/items/form/FormTextFieldModel;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;)Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$clinician_in_the_loop_release", "(Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/models/items/form/FormTextFieldModel;", "getFirstName", "getLastName", "getDateOfBirth", "getAddressLine1", "getAddressLine1$annotations", "()V", "getAddressLine2", "getAddressLine2$annotations", "getCity", "getState", "getZipCode", "getCountry", "getPhoneNumber", "Companion", "$serializer", "a", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PersonalIntakeForm {
    private final FormTextFieldModel addressLine1;
    private final FormTextFieldModel addressLine2;
    private final FormTextFieldModel city;
    private final FormTextFieldModel country;
    private final FormTextFieldModel dateOfBirth;
    private final FormTextFieldModel firstName;
    private final FormTextFieldModel lastName;
    private final FormTextFieldModel phoneNumber;
    private final FormTextFieldModel state;
    private final FormTextFieldModel zipCode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = FormTextFieldModel.$stable;

    /* JADX INFO: renamed from: com.whoop.clinicianintheloop.api.PersonalIntakeForm$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;", "serializer", "()Lwc3/c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PersonalIntakeForm$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PersonalIntakeForm(int i13, FormTextFieldModel formTextFieldModel, FormTextFieldModel formTextFieldModel2, FormTextFieldModel formTextFieldModel3, FormTextFieldModel formTextFieldModel4, FormTextFieldModel formTextFieldModel5, FormTextFieldModel formTextFieldModel6, FormTextFieldModel formTextFieldModel7, FormTextFieldModel formTextFieldModel8, FormTextFieldModel formTextFieldModel9, FormTextFieldModel formTextFieldModel10, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i13 & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1023, PersonalIntakeForm$$serializer.INSTANCE.getDescriptor());
        }
        this.firstName = formTextFieldModel;
        this.lastName = formTextFieldModel2;
        this.dateOfBirth = formTextFieldModel3;
        this.addressLine1 = formTextFieldModel4;
        this.addressLine2 = formTextFieldModel5;
        this.city = formTextFieldModel6;
        this.state = formTextFieldModel7;
        this.zipCode = formTextFieldModel8;
        this.country = formTextFieldModel9;
        this.phoneNumber = formTextFieldModel10;
    }

    public static /* synthetic */ PersonalIntakeForm copy$default(PersonalIntakeForm personalIntakeForm, FormTextFieldModel formTextFieldModel, FormTextFieldModel formTextFieldModel2, FormTextFieldModel formTextFieldModel3, FormTextFieldModel formTextFieldModel4, FormTextFieldModel formTextFieldModel5, FormTextFieldModel formTextFieldModel6, FormTextFieldModel formTextFieldModel7, FormTextFieldModel formTextFieldModel8, FormTextFieldModel formTextFieldModel9, FormTextFieldModel formTextFieldModel10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            formTextFieldModel = personalIntakeForm.firstName;
        }
        if ((i13 & 2) != 0) {
            formTextFieldModel2 = personalIntakeForm.lastName;
        }
        if ((i13 & 4) != 0) {
            formTextFieldModel3 = personalIntakeForm.dateOfBirth;
        }
        if ((i13 & 8) != 0) {
            formTextFieldModel4 = personalIntakeForm.addressLine1;
        }
        if ((i13 & 16) != 0) {
            formTextFieldModel5 = personalIntakeForm.addressLine2;
        }
        if ((i13 & 32) != 0) {
            formTextFieldModel6 = personalIntakeForm.city;
        }
        if ((i13 & 64) != 0) {
            formTextFieldModel7 = personalIntakeForm.state;
        }
        if ((i13 & 128) != 0) {
            formTextFieldModel8 = personalIntakeForm.zipCode;
        }
        if ((i13 & 256) != 0) {
            formTextFieldModel9 = personalIntakeForm.country;
        }
        if ((i13 & 512) != 0) {
            formTextFieldModel10 = personalIntakeForm.phoneNumber;
        }
        FormTextFieldModel formTextFieldModel11 = formTextFieldModel9;
        FormTextFieldModel formTextFieldModel12 = formTextFieldModel10;
        FormTextFieldModel formTextFieldModel13 = formTextFieldModel7;
        FormTextFieldModel formTextFieldModel14 = formTextFieldModel8;
        FormTextFieldModel formTextFieldModel15 = formTextFieldModel5;
        FormTextFieldModel formTextFieldModel16 = formTextFieldModel6;
        return personalIntakeForm.copy(formTextFieldModel, formTextFieldModel2, formTextFieldModel3, formTextFieldModel4, formTextFieldModel15, formTextFieldModel16, formTextFieldModel13, formTextFieldModel14, formTextFieldModel11, formTextFieldModel12);
    }

    @InterfaceC37143h("address_line_1")
    public static /* synthetic */ void getAddressLine1$annotations() {
    }

    @InterfaceC37143h("address_line_2")
    public static /* synthetic */ void getAddressLine2$annotations() {
    }

    public static final /* synthetic */ void write$Self$clinician_in_the_loop_release(PersonalIntakeForm self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        FormTextFieldModel$$serializer formTextFieldModel$$serializer = FormTextFieldModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, formTextFieldModel$$serializer, self.firstName);
        output.encodeSerializableElement(serialDesc, 1, formTextFieldModel$$serializer, self.lastName);
        output.encodeSerializableElement(serialDesc, 2, formTextFieldModel$$serializer, self.dateOfBirth);
        output.encodeSerializableElement(serialDesc, 3, formTextFieldModel$$serializer, self.addressLine1);
        output.encodeSerializableElement(serialDesc, 4, formTextFieldModel$$serializer, self.addressLine2);
        output.encodeSerializableElement(serialDesc, 5, formTextFieldModel$$serializer, self.city);
        output.encodeSerializableElement(serialDesc, 6, formTextFieldModel$$serializer, self.state);
        output.encodeSerializableElement(serialDesc, 7, formTextFieldModel$$serializer, self.zipCode);
        output.encodeSerializableElement(serialDesc, 8, formTextFieldModel$$serializer, self.country);
        output.encodeSerializableElement(serialDesc, 9, formTextFieldModel$$serializer, self.phoneNumber);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FormTextFieldModel getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final FormTextFieldModel getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FormTextFieldModel getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FormTextFieldModel getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FormTextFieldModel getAddressLine1() {
        return this.addressLine1;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final FormTextFieldModel getAddressLine2() {
        return this.addressLine2;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final FormTextFieldModel getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final FormTextFieldModel getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final FormTextFieldModel getZipCode() {
        return this.zipCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final FormTextFieldModel getCountry() {
        return this.country;
    }

    public final PersonalIntakeForm copy(FormTextFieldModel firstName, FormTextFieldModel lastName, FormTextFieldModel dateOfBirth, FormTextFieldModel addressLine1, FormTextFieldModel addressLine2, FormTextFieldModel city, FormTextFieldModel state, FormTextFieldModel zipCode, FormTextFieldModel country, FormTextFieldModel phoneNumber) {
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(dateOfBirth, "dateOfBirth");
        AbstractC22676k.m65750j(addressLine1, "addressLine1");
        AbstractC22676k.m65750j(addressLine2, "addressLine2");
        AbstractC22676k.m65750j(city, "city");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(zipCode, "zipCode");
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(phoneNumber, "phoneNumber");
        return new PersonalIntakeForm(firstName, lastName, dateOfBirth, addressLine1, addressLine2, city, state, zipCode, country, phoneNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalIntakeForm)) {
            return false;
        }
        PersonalIntakeForm personalIntakeForm = (PersonalIntakeForm) other;
        return AbstractC22676k.m65745e(this.firstName, personalIntakeForm.firstName) && AbstractC22676k.m65745e(this.lastName, personalIntakeForm.lastName) && AbstractC22676k.m65745e(this.dateOfBirth, personalIntakeForm.dateOfBirth) && AbstractC22676k.m65745e(this.addressLine1, personalIntakeForm.addressLine1) && AbstractC22676k.m65745e(this.addressLine2, personalIntakeForm.addressLine2) && AbstractC22676k.m65745e(this.city, personalIntakeForm.city) && AbstractC22676k.m65745e(this.state, personalIntakeForm.state) && AbstractC22676k.m65745e(this.zipCode, personalIntakeForm.zipCode) && AbstractC22676k.m65745e(this.country, personalIntakeForm.country) && AbstractC22676k.m65745e(this.phoneNumber, personalIntakeForm.phoneNumber);
    }

    public final FormTextFieldModel getAddressLine1() {
        return this.addressLine1;
    }

    public final FormTextFieldModel getAddressLine2() {
        return this.addressLine2;
    }

    public final FormTextFieldModel getCity() {
        return this.city;
    }

    public final FormTextFieldModel getCountry() {
        return this.country;
    }

    public final FormTextFieldModel getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final FormTextFieldModel getFirstName() {
        return this.firstName;
    }

    public final FormTextFieldModel getLastName() {
        return this.lastName;
    }

    public final FormTextFieldModel getPhoneNumber() {
        return this.phoneNumber;
    }

    public final FormTextFieldModel getState() {
        return this.state;
    }

    public final FormTextFieldModel getZipCode() {
        return this.zipCode;
    }

    public int hashCode() {
        return this.phoneNumber.hashCode() + ((this.country.hashCode() + ((this.zipCode.hashCode() + ((this.state.hashCode() + ((this.city.hashCode() + ((this.addressLine2.hashCode() + ((this.addressLine1.hashCode() + ((this.dateOfBirth.hashCode() + ((this.lastName.hashCode() + (this.firstName.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "PersonalIntakeForm(firstName=" + this.firstName + ", lastName=" + this.lastName + ", dateOfBirth=" + this.dateOfBirth + ", addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ", country=" + this.country + ", phoneNumber=" + this.phoneNumber + ")";
    }

    public PersonalIntakeForm(FormTextFieldModel firstName, FormTextFieldModel lastName, FormTextFieldModel dateOfBirth, FormTextFieldModel addressLine1, FormTextFieldModel addressLine2, FormTextFieldModel city, FormTextFieldModel state, FormTextFieldModel zipCode, FormTextFieldModel country, FormTextFieldModel phoneNumber) {
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(dateOfBirth, "dateOfBirth");
        AbstractC22676k.m65750j(addressLine1, "addressLine1");
        AbstractC22676k.m65750j(addressLine2, "addressLine2");
        AbstractC22676k.m65750j(city, "city");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(zipCode, "zipCode");
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(phoneNumber, "phoneNumber");
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }
}
