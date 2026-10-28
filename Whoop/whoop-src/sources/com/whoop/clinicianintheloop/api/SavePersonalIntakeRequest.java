package com.whoop.clinicianintheloop.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@ABY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eB\u007f\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015Jv\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u0015R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010\u0015R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b9\u00107\u001a\u0004\b8\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b:\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b;\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b<\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b=\u0010\u0015R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b>\u0010\u0015¨\u0006B"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;", "", "", "firstName", "lastName", "dateOfBirth", "addressLine1", "addressLine2", "city", "state", "zipCode", "country", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "toString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$clinician_in_the_loop_release", "(Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getFirstName", "getLastName", "getDateOfBirth", "getAddressLine1", "getAddressLine1$annotations", "()V", "getAddressLine2", "getAddressLine2$annotations", "getCity", "getState", "getZipCode", "getCountry", "getPhoneNumber", "Companion", "$serializer", "a", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SavePersonalIntakeRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String addressLine1;
    private final String addressLine2;
    private final String city;
    private final String country;
    private final String dateOfBirth;
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final String state;
    private final String zipCode;

    /* JADX INFO: renamed from: com.whoop.clinicianintheloop.api.SavePersonalIntakeRequest$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;", "serializer", "()Lwc3/c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SavePersonalIntakeRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SavePersonalIntakeRequest(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i13 & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1023, SavePersonalIntakeRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.firstName = str;
        this.lastName = str2;
        this.dateOfBirth = str3;
        this.addressLine1 = str4;
        this.addressLine2 = str5;
        this.city = str6;
        this.state = str7;
        this.zipCode = str8;
        this.country = str9;
        this.phoneNumber = str10;
    }

    public static /* synthetic */ SavePersonalIntakeRequest copy$default(SavePersonalIntakeRequest savePersonalIntakeRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = savePersonalIntakeRequest.firstName;
        }
        if ((i13 & 2) != 0) {
            str2 = savePersonalIntakeRequest.lastName;
        }
        if ((i13 & 4) != 0) {
            str3 = savePersonalIntakeRequest.dateOfBirth;
        }
        if ((i13 & 8) != 0) {
            str4 = savePersonalIntakeRequest.addressLine1;
        }
        if ((i13 & 16) != 0) {
            str5 = savePersonalIntakeRequest.addressLine2;
        }
        if ((i13 & 32) != 0) {
            str6 = savePersonalIntakeRequest.city;
        }
        if ((i13 & 64) != 0) {
            str7 = savePersonalIntakeRequest.state;
        }
        if ((i13 & 128) != 0) {
            str8 = savePersonalIntakeRequest.zipCode;
        }
        if ((i13 & 256) != 0) {
            str9 = savePersonalIntakeRequest.country;
        }
        if ((i13 & 512) != 0) {
            str10 = savePersonalIntakeRequest.phoneNumber;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        return savePersonalIntakeRequest.copy(str, str2, str3, str4, str15, str16, str13, str14, str11, str12);
    }

    @InterfaceC37143h("address_line_1")
    public static /* synthetic */ void getAddressLine1$annotations() {
    }

    @InterfaceC37143h("address_line_2")
    public static /* synthetic */ void getAddressLine2$annotations() {
    }

    public static final /* synthetic */ void write$Self$clinician_in_the_loop_release(SavePersonalIntakeRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.firstName);
        output.encodeStringElement(serialDesc, 1, self.lastName);
        output.encodeStringElement(serialDesc, 2, self.dateOfBirth);
        output.encodeStringElement(serialDesc, 3, self.addressLine1);
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.addressLine2);
        output.encodeStringElement(serialDesc, 5, self.city);
        output.encodeStringElement(serialDesc, 6, self.state);
        output.encodeStringElement(serialDesc, 7, self.zipCode);
        output.encodeStringElement(serialDesc, 8, self.country);
        output.encodeStringElement(serialDesc, 9, self.phoneNumber);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getZipCode() {
        return this.zipCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public final SavePersonalIntakeRequest copy(String firstName, String lastName, String dateOfBirth, String addressLine1, String addressLine2, String city, String state, String zipCode, String country, String phoneNumber) {
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(dateOfBirth, "dateOfBirth");
        AbstractC22676k.m65750j(addressLine1, "addressLine1");
        AbstractC22676k.m65750j(city, "city");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(zipCode, "zipCode");
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(phoneNumber, "phoneNumber");
        return new SavePersonalIntakeRequest(firstName, lastName, dateOfBirth, addressLine1, addressLine2, city, state, zipCode, country, phoneNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavePersonalIntakeRequest)) {
            return false;
        }
        SavePersonalIntakeRequest savePersonalIntakeRequest = (SavePersonalIntakeRequest) other;
        return AbstractC22676k.m65745e(this.firstName, savePersonalIntakeRequest.firstName) && AbstractC22676k.m65745e(this.lastName, savePersonalIntakeRequest.lastName) && AbstractC22676k.m65745e(this.dateOfBirth, savePersonalIntakeRequest.dateOfBirth) && AbstractC22676k.m65745e(this.addressLine1, savePersonalIntakeRequest.addressLine1) && AbstractC22676k.m65745e(this.addressLine2, savePersonalIntakeRequest.addressLine2) && AbstractC22676k.m65745e(this.city, savePersonalIntakeRequest.city) && AbstractC22676k.m65745e(this.state, savePersonalIntakeRequest.state) && AbstractC22676k.m65745e(this.zipCode, savePersonalIntakeRequest.zipCode) && AbstractC22676k.m65745e(this.country, savePersonalIntakeRequest.country) && AbstractC22676k.m65745e(this.phoneNumber, savePersonalIntakeRequest.phoneNumber);
    }

    public final String getAddressLine1() {
        return this.addressLine1;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getState() {
        return this.state;
    }

    public final String getZipCode() {
        return this.zipCode;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.firstName.hashCode() * 31, 31, this.lastName), 31, this.dateOfBirth), 31, this.addressLine1);
        String str = this.addressLine2;
        return this.phoneNumber.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.city), 31, this.state), 31, this.zipCode), 31, this.country);
    }

    public String toString() {
        return "SavePersonalIntakeRequest(REDACTED)";
    }

    public SavePersonalIntakeRequest(String firstName, String lastName, String dateOfBirth, String addressLine1, String str, String city, String state, String zipCode, String country, String phoneNumber) {
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(dateOfBirth, "dateOfBirth");
        AbstractC22676k.m65750j(addressLine1, "addressLine1");
        AbstractC22676k.m65750j(city, "city");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(zipCode, "zipCode");
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(phoneNumber, "phoneNumber");
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.addressLine1 = addressLine1;
        this.addressLine2 = str;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }
}
