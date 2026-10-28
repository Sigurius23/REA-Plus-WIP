package com.whoop.universalcheckout.features.shippingaddress.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEB\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u009d\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0018J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0018J\u009c\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b:\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b;\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b<\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b=\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b>\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b?\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b@\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\bA\u0010\u0018R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\bB\u0010\u0018R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\bC\u0010\u0018R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\bD\u0010\u0018¨\u0006G"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;", "", "", "firstName", "lastName", "line1", "line2", "line3", "country", "city", "province", "state", "postalCode", "phone", "identificationNumber", "shortAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getFirstName", "getLastName", "getLine1", "getLine2", "getLine3", "getCountry", "getCity", "getProvince", "getState", "getPostalCode", "getPhone", "getIdentificationNumber", "getShortAddress", "Companion", "$serializer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShippingAddressRequestBody {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String city;
    private final String country;
    private final String firstName;
    private final String identificationNumber;
    private final String lastName;
    private final String line1;
    private final String line2;
    private final String line3;
    private final String phone;
    private final String postalCode;
    private final String province;
    private final String shortAddress;
    private final String state;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShippingAddressRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShippingAddressRequestBody(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if (1767 != (i13 & 1767)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1767, ShippingAddressRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.firstName = str;
        this.lastName = str2;
        this.line1 = str3;
        if ((i13 & 8) == 0) {
            this.line2 = null;
        } else {
            this.line2 = str4;
        }
        if ((i13 & 16) == 0) {
            this.line3 = null;
        } else {
            this.line3 = str5;
        }
        this.country = str6;
        this.city = str7;
        this.province = str8;
        if ((i13 & 256) == 0) {
            this.state = null;
        } else {
            this.state = str9;
        }
        this.postalCode = str10;
        this.phone = str11;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.identificationNumber = null;
        } else {
            this.identificationNumber = str12;
        }
        if ((i13 & 4096) == 0) {
            this.shortAddress = null;
        } else {
            this.shortAddress = str13;
        }
    }

    public static /* synthetic */ ShippingAddressRequestBody copy$default(ShippingAddressRequestBody shippingAddressRequestBody, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shippingAddressRequestBody.firstName;
        }
        return shippingAddressRequestBody.copy(str, (i13 & 2) != 0 ? shippingAddressRequestBody.lastName : str2, (i13 & 4) != 0 ? shippingAddressRequestBody.line1 : str3, (i13 & 8) != 0 ? shippingAddressRequestBody.line2 : str4, (i13 & 16) != 0 ? shippingAddressRequestBody.line3 : str5, (i13 & 32) != 0 ? shippingAddressRequestBody.country : str6, (i13 & 64) != 0 ? shippingAddressRequestBody.city : str7, (i13 & 128) != 0 ? shippingAddressRequestBody.province : str8, (i13 & 256) != 0 ? shippingAddressRequestBody.state : str9, (i13 & 512) != 0 ? shippingAddressRequestBody.postalCode : str10, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? shippingAddressRequestBody.phone : str11, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? shippingAddressRequestBody.identificationNumber : str12, (i13 & 4096) != 0 ? shippingAddressRequestBody.shortAddress : str13);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(ShippingAddressRequestBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.firstName);
        output.encodeStringElement(serialDesc, 1, self.lastName);
        output.encodeStringElement(serialDesc, 2, self.line1);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.line2 != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.line2);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.line3 != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.line3);
        }
        output.encodeStringElement(serialDesc, 5, self.country);
        output.encodeStringElement(serialDesc, 6, self.city);
        output.encodeStringElement(serialDesc, 7, self.province);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.state != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.state);
        }
        output.encodeStringElement(serialDesc, 9, self.postalCode);
        output.encodeStringElement(serialDesc, 10, self.phone);
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.identificationNumber != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.identificationNumber);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 12) && self.shortAddress == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, self.shortAddress);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getIdentificationNumber() {
        return this.identificationNumber;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getShortAddress() {
        return this.shortAddress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLine1() {
        return this.line1;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLine2() {
        return this.line2;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLine3() {
        return this.line3;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getProvince() {
        return this.province;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final ShippingAddressRequestBody copy(String firstName, String lastName, String line1, String line2, String line3, String country, String city, String province, String state, String postalCode, String phone, String identificationNumber, String shortAddress) {
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(line1, "line1");
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(city, "city");
        AbstractC22676k.m65750j(province, "province");
        AbstractC22676k.m65750j(postalCode, "postalCode");
        AbstractC22676k.m65750j(phone, "phone");
        return new ShippingAddressRequestBody(firstName, lastName, line1, line2, line3, country, city, province, state, postalCode, phone, identificationNumber, shortAddress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShippingAddressRequestBody)) {
            return false;
        }
        ShippingAddressRequestBody shippingAddressRequestBody = (ShippingAddressRequestBody) other;
        return AbstractC22676k.m65745e(this.firstName, shippingAddressRequestBody.firstName) && AbstractC22676k.m65745e(this.lastName, shippingAddressRequestBody.lastName) && AbstractC22676k.m65745e(this.line1, shippingAddressRequestBody.line1) && AbstractC22676k.m65745e(this.line2, shippingAddressRequestBody.line2) && AbstractC22676k.m65745e(this.line3, shippingAddressRequestBody.line3) && AbstractC22676k.m65745e(this.country, shippingAddressRequestBody.country) && AbstractC22676k.m65745e(this.city, shippingAddressRequestBody.city) && AbstractC22676k.m65745e(this.province, shippingAddressRequestBody.province) && AbstractC22676k.m65745e(this.state, shippingAddressRequestBody.state) && AbstractC22676k.m65745e(this.postalCode, shippingAddressRequestBody.postalCode) && AbstractC22676k.m65745e(this.phone, shippingAddressRequestBody.phone) && AbstractC22676k.m65745e(this.identificationNumber, shippingAddressRequestBody.identificationNumber) && AbstractC22676k.m65745e(this.shortAddress, shippingAddressRequestBody.shortAddress);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getIdentificationNumber() {
        return this.identificationNumber;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getLine1() {
        return this.line1;
    }

    public final String getLine2() {
        return this.line2;
    }

    public final String getLine3() {
        return this.line3;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getProvince() {
        return this.province;
    }

    public final String getShortAddress() {
        return this.shortAddress;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.firstName.hashCode() * 31, 31, this.lastName), 31, this.line1);
        String str = this.line2;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.line3;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.country), 31, this.city), 31, this.province);
        String str3 = this.state;
        int iM30450d3 = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.postalCode), 31, this.phone);
        String str4 = this.identificationNumber;
        int iHashCode2 = (iM30450d3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.shortAddress;
        return iHashCode2 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.line1;
        String str4 = this.line2;
        String str5 = this.line3;
        String str6 = this.country;
        String str7 = this.city;
        String str8 = this.province;
        String str9 = this.state;
        String str10 = this.postalCode;
        String str11 = this.phone;
        String str12 = this.identificationNumber;
        String str13 = this.shortAddress;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ShippingAddressRequestBody(firstName=", str, ", lastName=", str2, ", line1=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", line2=", str4, ", line3=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", country=", str6, ", city=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", province=", str8, ", state=");
        AbstractC11266d.m30444B(sbM32001t, str9, ", postalCode=", str10, ", phone=");
        AbstractC11266d.m30444B(sbM32001t, str11, ", identificationNumber=", str12, ", shortAddress=");
        return AbstractC25012a.m73376i(str13, ")", sbM32001t);
    }

    public ShippingAddressRequestBody(String firstName, String lastName, String line1, String str, String str2, String country, String city, String province, String str3, String postalCode, String phone, String str4, String str5) {
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(line1, "line1");
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(city, "city");
        AbstractC22676k.m65750j(province, "province");
        AbstractC22676k.m65750j(postalCode, "postalCode");
        AbstractC22676k.m65750j(phone, "phone");
        this.firstName = firstName;
        this.lastName = lastName;
        this.line1 = line1;
        this.line2 = str;
        this.line3 = str2;
        this.country = country;
        this.city = city;
        this.province = province;
        this.state = str3;
        this.postalCode = postalCode;
        this.phone = phone;
        this.identificationNumber = str4;
        this.shortAddress = str5;
    }

    public /* synthetic */ ShippingAddressRequestBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, str6, str7, str8, (i13 & 256) != 0 ? null : str9, str10, str11, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str12, (i13 & 4096) != 0 ? null : str13);
    }
}
