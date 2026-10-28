package com.whoop.profile.domain.models;

import com.mapbox.common.HttpHeaders;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJR\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b1\u0010\u001a¨\u00064"}, m65681d2 = {"Lcom/whoop/profile/domain/models/UserData;", "", "", "profileImageUrl", "firstName", "lastName", "username", "", HttpHeaders.AGE, "location", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$profile_release", "(Lcom/whoop/profile/domain/models/UserData;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Integer;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/whoop/profile/domain/models/UserData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProfileImageUrl", "getFirstName", "getLastName", "getUsername", "Ljava/lang/Integer;", "getAge", "getLocation", "Companion", "$serializer", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UserData {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer age;
    private final String firstName;
    private final String lastName;
    private final String location;
    private final String profileImageUrl;
    private final String username;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/profile/domain/models/UserData$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/profile/domain/models/UserData;", "serializer", "()Lwc3/c;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UserData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UserData(int i13, String str, String str2, String str3, String str4, Integer num, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i13 & 14)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 14, UserData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.profileImageUrl = null;
        } else {
            this.profileImageUrl = str;
        }
        this.firstName = str2;
        this.lastName = str3;
        this.username = str4;
        if ((i13 & 16) == 0) {
            this.age = null;
        } else {
            this.age = num;
        }
        if ((i13 & 32) == 0) {
            this.location = null;
        } else {
            this.location = str5;
        }
    }

    public static /* synthetic */ UserData copy$default(UserData userData, String str, String str2, String str3, String str4, Integer num, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = userData.profileImageUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = userData.firstName;
        }
        if ((i13 & 4) != 0) {
            str3 = userData.lastName;
        }
        if ((i13 & 8) != 0) {
            str4 = userData.username;
        }
        if ((i13 & 16) != 0) {
            num = userData.age;
        }
        if ((i13 & 32) != 0) {
            str5 = userData.location;
        }
        Integer num2 = num;
        String str6 = str5;
        return userData.copy(str, str2, str3, str4, num2, str6);
    }

    public static final /* synthetic */ void write$Self$profile_release(UserData self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.profileImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.profileImageUrl);
        }
        output.encodeStringElement(serialDesc, 1, self.firstName);
        output.encodeStringElement(serialDesc, 2, self.lastName);
        output.encodeStringElement(serialDesc, 3, self.username);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.age != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.age);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.location == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.location);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    public final UserData copy(String profileImageUrl, String firstName, String lastName, String username, Integer age, String location) {
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(username, "username");
        return new UserData(profileImageUrl, firstName, lastName, username, age, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserData)) {
            return false;
        }
        UserData userData = (UserData) other;
        return AbstractC22676k.m65745e(this.profileImageUrl, userData.profileImageUrl) && AbstractC22676k.m65745e(this.firstName, userData.firstName) && AbstractC22676k.m65745e(this.lastName, userData.lastName) && AbstractC22676k.m65745e(this.username, userData.username) && AbstractC22676k.m65745e(this.age, userData.age) && AbstractC22676k.m65745e(this.location, userData.location);
    }

    public final Integer getAge() {
        return this.age;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.profileImageUrl;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.firstName), 31, this.lastName), 31, this.username);
        Integer num = this.age;
        int iHashCode = (iM30450d + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.location;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.profileImageUrl;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.username;
        Integer num = this.age;
        String str5 = this.location;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("UserData(profileImageUrl=", str, ", firstName=", str2, ", lastName=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", username=", str4, ", age=");
        sbM32001t.append(num);
        sbM32001t.append(", location=");
        sbM32001t.append(str5);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public UserData(String str, String firstName, String lastName, String username, Integer num, String str2) {
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(username, "username");
        this.profileImageUrl = str;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.age = num;
        this.location = str2;
    }

    public /* synthetic */ UserData(String str, String str2, String str3, String str4, Integer num, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, str2, str3, str4, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? null : str5);
    }
}
