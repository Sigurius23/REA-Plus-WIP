package com.whoop.service.network.model;

import androidx.core.app.NotificationCompat;
import ih0.AbstractC18489d0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010+\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010-\u001a\u00020\u0003H\u0096\u0080\u0004J\n\u0010.\u001a\u00020\u0005H\u0096\u0080\u0004J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010;\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0014HÆ\u0003J¦\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u0010>R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006?"}, m65681d2 = {"Lcom/whoop/service/network/model/UserDto;", "", "id", "", "avatarUrl", "", "createdAt", "firstName", "lastName", "city", "country", "adminDivision", "fullName", NotificationCompat.CATEGORY_EMAIL, "username", "concealed", "", "profile", "Lcom/whoop/service/network/model/ProfileDto;", "statistics", "Lcom/whoop/service/network/model/UserProfileStatistics;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/service/network/model/ProfileDto;Lcom/whoop/service/network/model/UserProfileStatistics;)V", "getId", "()I", "getAvatarUrl", "()Ljava/lang/String;", "getCreatedAt", "getFirstName", "getLastName", "getCity", "getCountry", "getAdminDivision", "getFullName", "getEmail", "getUsername", "getConcealed", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProfile", "()Lcom/whoop/service/network/model/ProfileDto;", "getStatistics", "()Lcom/whoop/service/network/model/UserProfileStatistics;", "equals", "other", "hashCode", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/service/network/model/ProfileDto;Lcom/whoop/service/network/model/UserProfileStatistics;)Lcom/whoop/service/network/model/UserDto;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class UserDto {
    private final String adminDivision;
    private final String avatarUrl;
    private final String city;
    private final Boolean concealed;
    private final String country;
    private final String createdAt;
    private final String email;
    private final String firstName;
    private final String fullName;
    private final int id;
    private final String lastName;
    private final ProfileDto profile;
    private final UserProfileStatistics statistics;
    private final String username;

    public UserDto() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getConcealed() {
        return this.concealed;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final ProfileDto getProfile() {
        return this.profile;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final UserProfileStatistics getStatistics() {
        return this.statistics;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAdminDivision() {
        return this.adminDivision;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    public final UserDto copy(int id4, String avatarUrl, String createdAt, String firstName, String lastName, String city, String country, String adminDivision, String fullName, String email, String username, Boolean concealed, ProfileDto profile, UserProfileStatistics statistics) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(fullName, "fullName");
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(username, "username");
        return new UserDto(id4, avatarUrl, createdAt, firstName, lastName, city, country, adminDivision, fullName, email, username, concealed, profile, statistics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!UserDto.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(other, "null cannot be cast to non-null type com.whoop.service.network.model.UserDto");
        return this.id == ((UserDto) other).id;
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

    public final Boolean getConcealed() {
        return this.concealed;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final int getId() {
        return this.id;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final ProfileDto getProfile() {
        return this.profile;
    }

    public final UserProfileStatistics getStatistics() {
        return this.statistics;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return this.id + 527;
    }

    public String toString() {
        int i13 = this.id;
        String str = this.avatarUrl;
        String str2 = this.createdAt;
        String str3 = this.city;
        String str4 = this.country;
        String str5 = this.adminDivision;
        String str6 = this.username;
        Boolean bool = this.concealed;
        ProfileDto profileDto = this.profile;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "UserDto(id=", ", avatarUrl=", str, ", createdAt='");
        AbstractC11266d.m30444B(sbM53373n, str2, "', city=", str3, ", country='");
        AbstractC11266d.m30444B(sbM53373n, str4, "', adminDivision=", str5, ", username='");
        AbstractC36095b.m114692t(bool, str6, "', concealed=", ", profile=", sbM53373n);
        sbM53373n.append(profileDto);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    public UserDto(int i13, String str, String createdAt, String firstName, String lastName, String str2, String country, String str3, String fullName, String email, String username, Boolean bool, ProfileDto profileDto, UserProfileStatistics userProfileStatistics) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(fullName, "fullName");
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(username, "username");
        this.id = i13;
        this.avatarUrl = str;
        this.createdAt = createdAt;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = str2;
        this.country = country;
        this.adminDivision = str3;
        this.fullName = fullName;
        this.email = email;
        this.username = username;
        this.concealed = bool;
        this.profile = profileDto;
        this.statistics = userProfileStatistics;
    }

    public /* synthetic */ UserDto(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, ProfileDto profileDto, UserProfileStatistics userProfileStatistics, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? "" : str3, (i14 & 16) != 0 ? "" : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? "" : str6, (i14 & 128) != 0 ? null : str7, (i14 & 256) != 0 ? "" : str8, (i14 & 512) != 0 ? "" : str9, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 ? str10 : "", (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : bool, (i14 & 4096) != 0 ? null : profileDto, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : userProfileStatistics);
    }
}
