package com.whoop.domain.bootstrap.dto;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserState;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BCBC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JL\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b7\u00104\u001a\u0004\b6\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00108\u0012\u0004\b:\u00104\u001a\u0004\b9\u0010!R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010;\u0012\u0004\b=\u00104\u001a\u0004\b<\u0010#R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010>\u0012\u0004\b@\u00104\u001a\u0004\b?\u0010%¨\u0006D"}, m65681d2 = {"Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;", "", "Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;", "accountBootstrapDto", "Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;", "userInfoBootstrapDto", "Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;", "userProfileBootstrapDto", "Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;", "membershipBootstrapDto", "Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;", "userBioDataBootstrapDto", "<init>", "(Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;", "component2", "()Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;", "component3", "()Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;", "component4", "()Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;", "component5", "()Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;", "copy", "(Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;)Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;", "getAccountBootstrapDto", "getAccountBootstrapDto$annotations", "()V", "Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;", "getUserInfoBootstrapDto", "getUserInfoBootstrapDto$annotations", "Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;", "getUserProfileBootstrapDto", "getUserProfileBootstrapDto$annotations", "Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;", "getMembershipBootstrapDto", "getMembershipBootstrapDto$annotations", "Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;", "getUserBioDataBootstrapDto", "getUserBioDataBootstrapDto$annotations", "Companion", "$serializer", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UserBootstrapDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("account")
    private final UserAccountBootstrapDto accountBootstrapDto;

    @SerializedName("membership")
    private final UserMembershipBootstrapDto membershipBootstrapDto;

    @SerializedName("bio_data")
    private final UserBioDataBootstrapDto userBioDataBootstrapDto;

    @SerializedName(UserState.Sources.USER)
    private final UserInfoBootstrapDto userInfoBootstrapDto;

    @SerializedName("profile")
    private final UserProfileBootstrapDto userProfileBootstrapDto;

    /* JADX INFO: renamed from: com.whoop.domain.bootstrap.dto.UserBootstrapDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UserBootstrapDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UserBootstrapDto() {
        this((UserAccountBootstrapDto) null, (UserInfoBootstrapDto) null, (UserProfileBootstrapDto) null, (UserMembershipBootstrapDto) null, (UserBioDataBootstrapDto) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UserBootstrapDto copy$default(UserBootstrapDto userBootstrapDto, UserAccountBootstrapDto userAccountBootstrapDto, UserInfoBootstrapDto userInfoBootstrapDto, UserProfileBootstrapDto userProfileBootstrapDto, UserMembershipBootstrapDto userMembershipBootstrapDto, UserBioDataBootstrapDto userBioDataBootstrapDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            userAccountBootstrapDto = userBootstrapDto.accountBootstrapDto;
        }
        if ((i13 & 2) != 0) {
            userInfoBootstrapDto = userBootstrapDto.userInfoBootstrapDto;
        }
        if ((i13 & 4) != 0) {
            userProfileBootstrapDto = userBootstrapDto.userProfileBootstrapDto;
        }
        if ((i13 & 8) != 0) {
            userMembershipBootstrapDto = userBootstrapDto.membershipBootstrapDto;
        }
        if ((i13 & 16) != 0) {
            userBioDataBootstrapDto = userBootstrapDto.userBioDataBootstrapDto;
        }
        UserBioDataBootstrapDto userBioDataBootstrapDto2 = userBioDataBootstrapDto;
        UserProfileBootstrapDto userProfileBootstrapDto2 = userProfileBootstrapDto;
        return userBootstrapDto.copy(userAccountBootstrapDto, userInfoBootstrapDto, userProfileBootstrapDto2, userMembershipBootstrapDto, userBioDataBootstrapDto2);
    }

    @InterfaceC37143h("account")
    public static /* synthetic */ void getAccountBootstrapDto$annotations() {
    }

    @InterfaceC37143h("membership")
    public static /* synthetic */ void getMembershipBootstrapDto$annotations() {
    }

    @InterfaceC37143h("bio_data")
    public static /* synthetic */ void getUserBioDataBootstrapDto$annotations() {
    }

    @InterfaceC37143h(UserState.Sources.USER)
    public static /* synthetic */ void getUserInfoBootstrapDto$annotations() {
    }

    @InterfaceC37143h("profile")
    public static /* synthetic */ void getUserProfileBootstrapDto$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(UserBootstrapDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.accountBootstrapDto != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, UserAccountBootstrapDto$$serializer.INSTANCE, self.accountBootstrapDto);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.userInfoBootstrapDto != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, UserInfoBootstrapDto$$serializer.INSTANCE, self.userInfoBootstrapDto);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.userProfileBootstrapDto != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, UserProfileBootstrapDto$$serializer.INSTANCE, self.userProfileBootstrapDto);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.membershipBootstrapDto != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, UserMembershipBootstrapDto$$serializer.INSTANCE, self.membershipBootstrapDto);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.userBioDataBootstrapDto == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, UserBioDataBootstrapDto$$serializer.INSTANCE, self.userBioDataBootstrapDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserAccountBootstrapDto getAccountBootstrapDto() {
        return this.accountBootstrapDto;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UserInfoBootstrapDto getUserInfoBootstrapDto() {
        return this.userInfoBootstrapDto;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UserProfileBootstrapDto getUserProfileBootstrapDto() {
        return this.userProfileBootstrapDto;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UserMembershipBootstrapDto getMembershipBootstrapDto() {
        return this.membershipBootstrapDto;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final UserBioDataBootstrapDto getUserBioDataBootstrapDto() {
        return this.userBioDataBootstrapDto;
    }

    public final UserBootstrapDto copy(UserAccountBootstrapDto accountBootstrapDto, UserInfoBootstrapDto userInfoBootstrapDto, UserProfileBootstrapDto userProfileBootstrapDto, UserMembershipBootstrapDto membershipBootstrapDto, UserBioDataBootstrapDto userBioDataBootstrapDto) {
        return new UserBootstrapDto(accountBootstrapDto, userInfoBootstrapDto, userProfileBootstrapDto, membershipBootstrapDto, userBioDataBootstrapDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserBootstrapDto)) {
            return false;
        }
        UserBootstrapDto userBootstrapDto = (UserBootstrapDto) other;
        return AbstractC22676k.m65745e(this.accountBootstrapDto, userBootstrapDto.accountBootstrapDto) && AbstractC22676k.m65745e(this.userInfoBootstrapDto, userBootstrapDto.userInfoBootstrapDto) && AbstractC22676k.m65745e(this.userProfileBootstrapDto, userBootstrapDto.userProfileBootstrapDto) && AbstractC22676k.m65745e(this.membershipBootstrapDto, userBootstrapDto.membershipBootstrapDto) && AbstractC22676k.m65745e(this.userBioDataBootstrapDto, userBootstrapDto.userBioDataBootstrapDto);
    }

    public final UserAccountBootstrapDto getAccountBootstrapDto() {
        return this.accountBootstrapDto;
    }

    public final UserMembershipBootstrapDto getMembershipBootstrapDto() {
        return this.membershipBootstrapDto;
    }

    public final UserBioDataBootstrapDto getUserBioDataBootstrapDto() {
        return this.userBioDataBootstrapDto;
    }

    public final UserInfoBootstrapDto getUserInfoBootstrapDto() {
        return this.userInfoBootstrapDto;
    }

    public final UserProfileBootstrapDto getUserProfileBootstrapDto() {
        return this.userProfileBootstrapDto;
    }

    public int hashCode() {
        UserAccountBootstrapDto userAccountBootstrapDto = this.accountBootstrapDto;
        int iHashCode = (userAccountBootstrapDto == null ? 0 : userAccountBootstrapDto.hashCode()) * 31;
        UserInfoBootstrapDto userInfoBootstrapDto = this.userInfoBootstrapDto;
        int iHashCode2 = (iHashCode + (userInfoBootstrapDto == null ? 0 : userInfoBootstrapDto.hashCode())) * 31;
        UserProfileBootstrapDto userProfileBootstrapDto = this.userProfileBootstrapDto;
        int iHashCode3 = (iHashCode2 + (userProfileBootstrapDto == null ? 0 : userProfileBootstrapDto.hashCode())) * 31;
        UserMembershipBootstrapDto userMembershipBootstrapDto = this.membershipBootstrapDto;
        int iHashCode4 = (iHashCode3 + (userMembershipBootstrapDto == null ? 0 : userMembershipBootstrapDto.hashCode())) * 31;
        UserBioDataBootstrapDto userBioDataBootstrapDto = this.userBioDataBootstrapDto;
        return iHashCode4 + (userBioDataBootstrapDto != null ? userBioDataBootstrapDto.hashCode() : 0);
    }

    public String toString() {
        return "UserBootstrapDto(accountBootstrapDto=" + this.accountBootstrapDto + ", userInfoBootstrapDto=" + this.userInfoBootstrapDto + ", userProfileBootstrapDto=" + this.userProfileBootstrapDto + ", membershipBootstrapDto=" + this.membershipBootstrapDto + ", userBioDataBootstrapDto=" + this.userBioDataBootstrapDto + ")";
    }

    public /* synthetic */ UserBootstrapDto(int i13, UserAccountBootstrapDto userAccountBootstrapDto, UserInfoBootstrapDto userInfoBootstrapDto, UserProfileBootstrapDto userProfileBootstrapDto, UserMembershipBootstrapDto userMembershipBootstrapDto, UserBioDataBootstrapDto userBioDataBootstrapDto, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.accountBootstrapDto = null;
        } else {
            this.accountBootstrapDto = userAccountBootstrapDto;
        }
        if ((i13 & 2) == 0) {
            this.userInfoBootstrapDto = null;
        } else {
            this.userInfoBootstrapDto = userInfoBootstrapDto;
        }
        if ((i13 & 4) == 0) {
            this.userProfileBootstrapDto = null;
        } else {
            this.userProfileBootstrapDto = userProfileBootstrapDto;
        }
        if ((i13 & 8) == 0) {
            this.membershipBootstrapDto = null;
        } else {
            this.membershipBootstrapDto = userMembershipBootstrapDto;
        }
        if ((i13 & 16) == 0) {
            this.userBioDataBootstrapDto = null;
        } else {
            this.userBioDataBootstrapDto = userBioDataBootstrapDto;
        }
    }

    public UserBootstrapDto(UserAccountBootstrapDto userAccountBootstrapDto, UserInfoBootstrapDto userInfoBootstrapDto, UserProfileBootstrapDto userProfileBootstrapDto, UserMembershipBootstrapDto userMembershipBootstrapDto, UserBioDataBootstrapDto userBioDataBootstrapDto) {
        this.accountBootstrapDto = userAccountBootstrapDto;
        this.userInfoBootstrapDto = userInfoBootstrapDto;
        this.userProfileBootstrapDto = userProfileBootstrapDto;
        this.membershipBootstrapDto = userMembershipBootstrapDto;
        this.userBioDataBootstrapDto = userBioDataBootstrapDto;
    }

    public /* synthetic */ UserBootstrapDto(UserAccountBootstrapDto userAccountBootstrapDto, UserInfoBootstrapDto userInfoBootstrapDto, UserProfileBootstrapDto userProfileBootstrapDto, UserMembershipBootstrapDto userMembershipBootstrapDto, UserBioDataBootstrapDto userBioDataBootstrapDto, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : userAccountBootstrapDto, (i13 & 2) != 0 ? null : userInfoBootstrapDto, (i13 & 4) != 0 ? null : userProfileBootstrapDto, (i13 & 8) != 0 ? null : userMembershipBootstrapDto, (i13 & 16) != 0 ? null : userBioDataBootstrapDto);
    }
}
