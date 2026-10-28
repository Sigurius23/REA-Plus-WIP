package com.whoop.domain.model;

import com.mapbox.common.HttpHeaders;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.AbstractC28177l;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Years;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\b\u0018\u0000 Y2\u00020\u0001:\u0001YB¥\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0019\u001a\u0004\u0018\u00010+J\u0014\u0010D\u001a\u00020\u00132\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010F\u001a\u00020\u0003H\u0096\u0080\u0004J\n\u0010G\u001a\u00020\u0005H\u0096\u0080\u0004J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010(J\t\u0010V\u001a\u00020\u0003HÆ\u0003J¬\u0001\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010XR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018R\u0011\u0010,\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b-\u0010\u0018R\u0011\u0010.\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b/\u0010\u0018R\u0011\u00100\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b1\u0010\u0018R\u0011\u00102\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b7\u00105R\u0011\u00108\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b9\u00105R\u0011\u0010:\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b;\u00105R\u0011\u0010<\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b=\u00105R\u0011\u0010>\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0013\u0010@\u001a\u0004\u0018\u00010A8F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006Z"}, m65681d2 = {"Lcom/whoop/domain/model/User;", "", "id", "", "createdAt", "", "firstName", "lastName", "fullName", "emailAddress", "password", "username", "avatarUrl", "city", "adminDivision", "country", "profile", "Lcom/whoop/domain/model/UserProfile;", "concealed", "", HttpHeaders.AGE, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/UserProfile;Ljava/lang/Boolean;I)V", "getId", "()I", "getCreatedAt", "()Ljava/lang/String;", "getFirstName", "getLastName", "getFullName", "getEmailAddress", "getPassword", "getUsername", "getAvatarUrl", "getCity", "getAdminDivision", "getCountry", "getProfile", "()Lcom/whoop/domain/model/UserProfile;", "getConcealed", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAge", "Lorg/joda/time/DateTime;", "ageYrs", "getAgeYrs", "maxHeartRate", "getMaxHeartRate", "minHeartRate", "getMinHeartRate", "weightLbs", "", "getWeightLbs", "()F", "heightIns", "getHeightIns", "weightKg", "getWeightKg", "heightCm", "getHeightCm", "heightMeters", "getHeightMeters", "canUploadData", "()Z", "fitnessLevel", "Lcom/whoop/domain/model/FitnessLevel;", "getFitnessLevel", "()Lcom/whoop/domain/model/FitnessLevel;", "equals", "other", "hashCode", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/UserProfile;Ljava/lang/Boolean;I)Lcom/whoop/domain/model/User;", "Companion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class User {
    private static final int DEFAULT_MAX_HR = 180;
    private final String adminDivision;
    private final int age;
    private final String avatarUrl;
    private final String city;
    private final Boolean concealed;
    private final String country;
    private final String createdAt;
    private final String emailAddress;
    private final String firstName;
    private final String fullName;
    private final int id;
    private final String lastName;
    private final String password;
    private final UserProfile profile;
    private final String username;

    public User() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 32767, null);
    }

    public final boolean canUploadData() {
        UserProfile userProfile = this.profile;
        return userProfile != null && userProfile.getCanUploadData();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAdminDivision() {
        return this.adminDivision;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final UserProfile getProfile() {
        return this.profile;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getConcealed() {
        return this.concealed;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final User copy(int id4, String createdAt, String firstName, String lastName, String fullName, String emailAddress, String password, String username, String avatarUrl, String city, String adminDivision, String country, UserProfile profile, Boolean concealed, int age) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(fullName, "fullName");
        AbstractC22676k.m65750j(emailAddress, "emailAddress");
        AbstractC22676k.m65750j(password, "password");
        AbstractC22676k.m65750j(username, "username");
        AbstractC22676k.m65750j(avatarUrl, "avatarUrl");
        AbstractC22676k.m65750j(country, "country");
        return new User(id4, createdAt, firstName, lastName, fullName, emailAddress, password, username, avatarUrl, city, adminDivision, country, profile, concealed, age);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!User.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(other, "null cannot be cast to non-null type com.whoop.domain.model.User");
        return this.id == ((User) other).id;
    }

    public final String getAdminDivision() {
        return this.adminDivision;
    }

    public final int getAge() {
        return this.age;
    }

    public final int getAgeYrs() {
        UserProfile userProfile = this.profile;
        if (userProfile != null) {
            return Years.yearsBetween(userProfile.getBirthday(), LocalDate.now()).getYears();
        }
        return 0;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getCity() {
        return this.city;
    }

    public final Boolean getConcealed() {
        return this.concealed;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final FitnessLevel getFitnessLevel() {
        UserProfile userProfile = this.profile;
        if (userProfile != null) {
            return userProfile.getFitnessLevel();
        }
        return null;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final float getHeightCm() {
        UserProfile userProfile = this.profile;
        return (userProfile != null ? userProfile.getHeight() : 0.0f) * 100;
    }

    public final float getHeightIns() {
        UserProfile userProfile = this.profile;
        if (userProfile != null) {
            return AbstractC28177l.m85291a(userProfile.getHeight() * 100);
        }
        return 0.0f;
    }

    public final float getHeightMeters() {
        UserProfile userProfile = this.profile;
        if (userProfile != null) {
            return userProfile.getHeight();
        }
        return 0.0f;
    }

    public final int getId() {
        return this.id;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final int getMaxHeartRate() {
        UserProfile userProfile = this.profile;
        if (userProfile == null) {
            return DEFAULT_MAX_HR;
        }
        if (userProfile.getMaxHeartRate() == 0) {
            return getAgeYrs() > 0 ? 208 - ((int) (((double) getAgeYrs()) * 0.7d)) : DEFAULT_MAX_HR;
        }
        return this.profile.getMaxHeartRate();
    }

    public final int getMinHeartRate() {
        UserProfile userProfile = this.profile;
        if (userProfile != null) {
            return userProfile.getMinHeartRate();
        }
        return 0;
    }

    public final String getPassword() {
        return this.password;
    }

    public final UserProfile getProfile() {
        return this.profile;
    }

    public final String getUsername() {
        return this.username;
    }

    public final float getWeightKg() {
        UserProfile userProfile = this.profile;
        if (userProfile != null) {
            return userProfile.getWeight();
        }
        return 0.0f;
    }

    public final float getWeightLbs() {
        UserProfile userProfile = this.profile;
        if (userProfile != null) {
            return AbstractC28177l.m85292b(userProfile.getWeight());
        }
        return 0.0f;
    }

    public int hashCode() {
        return this.id + 527;
    }

    public String toString() {
        return AbstractC2875y.m8296i(this.id, "User(id=", ")");
    }

    public User(int i13, String createdAt, String firstName, String lastName, String fullName, String emailAddress, String password, String username, String avatarUrl, String str, String str2, String country, UserProfile userProfile, Boolean bool, int i14) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(fullName, "fullName");
        AbstractC22676k.m65750j(emailAddress, "emailAddress");
        AbstractC22676k.m65750j(password, "password");
        AbstractC22676k.m65750j(username, "username");
        AbstractC22676k.m65750j(avatarUrl, "avatarUrl");
        AbstractC22676k.m65750j(country, "country");
        this.id = i13;
        this.createdAt = createdAt;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.username = username;
        this.avatarUrl = avatarUrl;
        this.city = str;
        this.adminDivision = str2;
        this.country = country;
        this.profile = userProfile;
        this.concealed = bool;
        this.age = i14;
    }

    /* JADX INFO: renamed from: getCreatedAt, reason: collision with other method in class */
    public final DateTime m134165getCreatedAt() {
        if (this.createdAt.length() == 0) {
            return null;
        }
        return new DateTime(this.createdAt);
    }

    public /* synthetic */ User(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, UserProfile userProfile, Boolean bool, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i13, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? "" : str2, (i15 & 8) != 0 ? "" : str3, (i15 & 16) != 0 ? "" : str4, (i15 & 32) != 0 ? "" : str5, (i15 & 64) != 0 ? "" : str6, (i15 & 128) != 0 ? "" : str7, (i15 & 256) != 0 ? "" : str8, (i15 & 512) != 0 ? "" : str9, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? "" : str10, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 ? str11 : "", (i15 & 4096) != 0 ? null : userProfile, (i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? bool : null, (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? 0 : i14);
    }
}
