package com.whoop.domain.bootstrap.dto;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJR\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001a¨\u00063"}, m65681d2 = {"Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;", "", "", "firstName", "lastName", "country", "avatarUrl", "city", "adminDivision", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFirstName", "getLastName", "getCountry", "getAvatarUrl", "getCity", "getAdminDivision", "Companion", "$serializer", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UserInfoBootstrapDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("admin_division")
    private final String adminDivision;

    @SerializedName("avatar_url")
    private final String avatarUrl;
    private final String city;
    private final String country;

    @SerializedName("first_name")
    private final String firstName;

    @SerializedName("last_name")
    private final String lastName;

    /* JADX INFO: renamed from: com.whoop.domain.bootstrap.dto.UserInfoBootstrapDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UserInfoBootstrapDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UserInfoBootstrapDto() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UserInfoBootstrapDto copy$default(UserInfoBootstrapDto userInfoBootstrapDto, String str, String str2, String str3, String str4, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = userInfoBootstrapDto.firstName;
        }
        if ((i13 & 2) != 0) {
            str2 = userInfoBootstrapDto.lastName;
        }
        if ((i13 & 4) != 0) {
            str3 = userInfoBootstrapDto.country;
        }
        if ((i13 & 8) != 0) {
            str4 = userInfoBootstrapDto.avatarUrl;
        }
        if ((i13 & 16) != 0) {
            str5 = userInfoBootstrapDto.city;
        }
        if ((i13 & 32) != 0) {
            str6 = userInfoBootstrapDto.adminDivision;
        }
        String str7 = str5;
        String str8 = str6;
        return userInfoBootstrapDto.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$core_release(UserInfoBootstrapDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.firstName, "")) {
            output.encodeStringElement(serialDesc, 0, self.firstName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.lastName, "")) {
            output.encodeStringElement(serialDesc, 1, self.lastName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.country, "")) {
            output.encodeStringElement(serialDesc, 2, self.country);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.avatarUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.avatarUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.city != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.city);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.adminDivision == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.adminDivision);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAdminDivision() {
        return this.adminDivision;
    }

    public final UserInfoBootstrapDto copy(String firstName, String lastName, String country, String avatarUrl, String city, String adminDivision) {
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(country, "country");
        return new UserInfoBootstrapDto(firstName, lastName, country, avatarUrl, city, adminDivision);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfoBootstrapDto)) {
            return false;
        }
        UserInfoBootstrapDto userInfoBootstrapDto = (UserInfoBootstrapDto) other;
        return AbstractC22676k.m65745e(this.firstName, userInfoBootstrapDto.firstName) && AbstractC22676k.m65745e(this.lastName, userInfoBootstrapDto.lastName) && AbstractC22676k.m65745e(this.country, userInfoBootstrapDto.country) && AbstractC22676k.m65745e(this.avatarUrl, userInfoBootstrapDto.avatarUrl) && AbstractC22676k.m65745e(this.city, userInfoBootstrapDto.city) && AbstractC22676k.m65745e(this.adminDivision, userInfoBootstrapDto.adminDivision);
    }

    public final String getAdminDivision() {
        return this.adminDivision;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
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

    public final String getLastName() {
        return this.lastName;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.firstName.hashCode() * 31, 31, this.lastName), 31, this.country);
        String str = this.avatarUrl;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.city;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.adminDivision;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.country;
        String str4 = this.avatarUrl;
        String str5 = this.city;
        String str6 = this.adminDivision;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("UserInfoBootstrapDto(firstName=", str, ", lastName=", str2, ", country=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", avatarUrl=", str4, ", city=");
        return AbstractC11266d.m30464r(sbM32001t, str5, ", adminDivision=", str6, ")");
    }

    public /* synthetic */ UserInfoBootstrapDto(int i13, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.firstName = "";
        } else {
            this.firstName = str;
        }
        if ((i13 & 2) == 0) {
            this.lastName = "";
        } else {
            this.lastName = str2;
        }
        if ((i13 & 4) == 0) {
            this.country = "";
        } else {
            this.country = str3;
        }
        if ((i13 & 8) == 0) {
            this.avatarUrl = null;
        } else {
            this.avatarUrl = str4;
        }
        if ((i13 & 16) == 0) {
            this.city = null;
        } else {
            this.city = str5;
        }
        if ((i13 & 32) == 0) {
            this.adminDivision = null;
        } else {
            this.adminDivision = str6;
        }
    }

    public UserInfoBootstrapDto(String firstName, String lastName, String country, String str, String str2, String str3) {
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(country, "country");
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.avatarUrl = str;
        this.city = str2;
        this.adminDivision = str3;
    }

    public /* synthetic */ UserInfoBootstrapDto(String str, String str2, String str3, String str4, String str5, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6);
    }
}
