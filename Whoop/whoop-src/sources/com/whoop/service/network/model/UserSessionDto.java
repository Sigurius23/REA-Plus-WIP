package com.whoop.service.network.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.domain.model.AuthToken;
import com.whoop.domain.model.Session;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001)B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0002J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010%\u001a\u00020\u00172\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010(\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/service/network/model/UserSessionDto;", "", "accessToken", "", "refreshToken", "expiresIn", "", UserState.Sources.USER, "Lcom/whoop/service/network/model/UserDto;", "membershipStatus", "needsProfileCompletionRaw", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/service/network/model/UserDto;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getRefreshToken", "getExpiresIn", "()I", "getUser", "()Lcom/whoop/service/network/model/UserDto;", "getMembershipStatus", "getNeedsProfileCompletionRaw", "needsProfileCompletion", "", "getNeedsProfileCompletion", "()Z", "toSession", "Lcom/whoop/domain/model/Session;", "toAuthToken", "Lcom/whoop/domain/model/AuthToken;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "Companion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class UserSessionDto {
    public static final String NEEDS_PROFILE_COMPLETION_FALSE = "0";
    public static final String NEEDS_PROFILE_COMPLETION_TRUE = "1";

    @SerializedName(UserSessionDtoKt.ACCESS_TOKEN)
    private final String accessToken;

    @SerializedName("expires_in")
    private final int expiresIn;

    @SerializedName("membershipStatus")
    private final String membershipStatus;

    @SerializedName("needsProfileCompletion")
    private final String needsProfileCompletionRaw;

    @SerializedName(UserSessionDtoKt.REFRESH_TOKEN)
    private final String refreshToken;

    @SerializedName(UserState.Sources.USER)
    private final UserDto user;

    public UserSessionDto(String accessToken, String refreshToken, int i13, UserDto user, String membershipStatus, String str) {
        AbstractC22676k.m65750j(accessToken, "accessToken");
        AbstractC22676k.m65750j(refreshToken, "refreshToken");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(membershipStatus, "membershipStatus");
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.expiresIn = i13;
        this.user = user;
        this.membershipStatus = membershipStatus;
        this.needsProfileCompletionRaw = str;
    }

    public static /* synthetic */ UserSessionDto copy$default(UserSessionDto userSessionDto, String str, String str2, int i13, UserDto userDto, String str3, String str4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = userSessionDto.accessToken;
        }
        if ((i14 & 2) != 0) {
            str2 = userSessionDto.refreshToken;
        }
        if ((i14 & 4) != 0) {
            i13 = userSessionDto.expiresIn;
        }
        if ((i14 & 8) != 0) {
            userDto = userSessionDto.user;
        }
        if ((i14 & 16) != 0) {
            str3 = userSessionDto.membershipStatus;
        }
        if ((i14 & 32) != 0) {
            str4 = userSessionDto.needsProfileCompletionRaw;
        }
        String str5 = str3;
        String str6 = str4;
        return userSessionDto.copy(str, str2, i13, userDto, str5, str6);
    }

    private final AuthToken toAuthToken() {
        return new AuthToken(this.accessToken, this.refreshToken, this.expiresIn);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getExpiresIn() {
        return this.expiresIn;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UserDto getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMembershipStatus() {
        return this.membershipStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNeedsProfileCompletionRaw() {
        return this.needsProfileCompletionRaw;
    }

    public final UserSessionDto copy(String accessToken, String refreshToken, int expiresIn, UserDto user, String membershipStatus, String needsProfileCompletionRaw) {
        AbstractC22676k.m65750j(accessToken, "accessToken");
        AbstractC22676k.m65750j(refreshToken, "refreshToken");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(membershipStatus, "membershipStatus");
        return new UserSessionDto(accessToken, refreshToken, expiresIn, user, membershipStatus, needsProfileCompletionRaw);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSessionDto)) {
            return false;
        }
        UserSessionDto userSessionDto = (UserSessionDto) other;
        return AbstractC22676k.m65745e(this.accessToken, userSessionDto.accessToken) && AbstractC22676k.m65745e(this.refreshToken, userSessionDto.refreshToken) && this.expiresIn == userSessionDto.expiresIn && AbstractC22676k.m65745e(this.user, userSessionDto.user) && AbstractC22676k.m65745e(this.membershipStatus, userSessionDto.membershipStatus) && AbstractC22676k.m65745e(this.needsProfileCompletionRaw, userSessionDto.needsProfileCompletionRaw);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final int getExpiresIn() {
        return this.expiresIn;
    }

    public final String getMembershipStatus() {
        return this.membershipStatus;
    }

    public final boolean getNeedsProfileCompletion() {
        return AbstractC22676k.m65745e(this.needsProfileCompletionRaw, NEEDS_PROFILE_COMPLETION_TRUE);
    }

    public final String getNeedsProfileCompletionRaw() {
        return this.needsProfileCompletionRaw;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final UserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.user.hashCode() + AbstractC11266d.m30448b(this.expiresIn, AbstractC11266d.m30450d(this.accessToken.hashCode() * 31, 31, this.refreshToken), 31)) * 31, 31, this.membershipStatus);
        String str = this.needsProfileCompletionRaw;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public final Session toSession() {
        return new Session(toAuthToken(), UserDtoKt.toUser(this.user));
    }

    public String toString() {
        String str = this.accessToken;
        String str2 = this.refreshToken;
        int i13 = this.expiresIn;
        UserDto userDto = this.user;
        String str3 = this.membershipStatus;
        String str4 = this.needsProfileCompletionRaw;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("UserSessionDto(accessToken=", str, ", refreshToken=", str2, ", expiresIn=");
        sbM32001t.append(i13);
        sbM32001t.append(", user=");
        sbM32001t.append(userDto);
        sbM32001t.append(", membershipStatus=");
        return AbstractC11266d.m30464r(sbM32001t, str3, ", needsProfileCompletionRaw=", str4, ")");
    }
}
