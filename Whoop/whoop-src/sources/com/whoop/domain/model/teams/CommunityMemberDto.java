package com.whoop.domain.model.teams;

import androidx.core.app.FrameMetricsAggregator;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rB[\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010&JZ\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010!J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001fJ\u001a\u0010-\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b3\u0010!R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b4\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b5\u0010!R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010&R\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b8\u0010&¨\u0006;"}, m65681d2 = {"Lcom/whoop/domain/model/teams/CommunityMemberDto;", "", "", "userId", "", "name", "username", NotificationCompat.CATEGORY_EMAIL, "avatarUrl", "", "disabled", "canUploadData", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/domain/model/teams/CommunityMemberDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/domain/model/teams/TeamUser;", "toTeamUser", "()Lcom/whoop/domain/model/teams/TeamUser;", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Z", "component7", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/whoop/domain/model/teams/CommunityMemberDto;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getUserId", "Ljava/lang/String;", "getName", "getUsername", "getEmail", "getAvatarUrl", "Z", "getDisabled", "getCanUploadData", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CommunityMemberDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("avatar_url")
    private final String avatarUrl;

    @SerializedName("can_upload_data")
    private final boolean canUploadData;

    @SerializedName("disabled")
    private final boolean disabled;

    @SerializedName(NotificationCompat.CATEGORY_EMAIL)
    private final String email;

    @SerializedName("name")
    private final String name;

    @SerializedName("user_id")
    private final int userId;

    @SerializedName("username")
    private final String username;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/model/teams/CommunityMemberDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/domain/model/teams/CommunityMemberDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CommunityMemberDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CommunityMemberDto(int i13, int i14, String str, String str2, String str3, String str4, boolean z4, boolean z13, SerializationConstructorMarker serializationConstructorMarker) {
        if (21 != (i13 & 21)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 21, CommunityMemberDto$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = i14;
        if ((i13 & 2) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        this.username = str2;
        if ((i13 & 8) == 0) {
            this.email = "";
        } else {
            this.email = str3;
        }
        this.avatarUrl = str4;
        if ((i13 & 32) == 0) {
            this.disabled = false;
        } else {
            this.disabled = z4;
        }
        if ((i13 & 64) == 0) {
            this.canUploadData = false;
        } else {
            this.canUploadData = z13;
        }
    }

    public static /* synthetic */ CommunityMemberDto copy$default(CommunityMemberDto communityMemberDto, int i13, String str, String str2, String str3, String str4, boolean z4, boolean z13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = communityMemberDto.userId;
        }
        if ((i14 & 2) != 0) {
            str = communityMemberDto.name;
        }
        if ((i14 & 4) != 0) {
            str2 = communityMemberDto.username;
        }
        if ((i14 & 8) != 0) {
            str3 = communityMemberDto.email;
        }
        if ((i14 & 16) != 0) {
            str4 = communityMemberDto.avatarUrl;
        }
        if ((i14 & 32) != 0) {
            z4 = communityMemberDto.disabled;
        }
        if ((i14 & 64) != 0) {
            z13 = communityMemberDto.canUploadData;
        }
        boolean z14 = z4;
        boolean z15 = z13;
        String str5 = str4;
        String str6 = str2;
        return communityMemberDto.copy(i13, str, str6, str3, str5, z14, z15);
    }

    public static final /* synthetic */ void write$Self$core_release(CommunityMemberDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.userId);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.name, "")) {
            output.encodeStringElement(serialDesc, 1, self.name);
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.username);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.email, "")) {
            output.encodeStringElement(serialDesc, 3, self.email);
        }
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.avatarUrl);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.disabled) {
            output.encodeBooleanElement(serialDesc, 5, self.disabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.canUploadData) {
            output.encodeBooleanElement(serialDesc, 6, self.canUploadData);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getCanUploadData() {
        return this.canUploadData;
    }

    public final CommunityMemberDto copy(int userId, String name, String username, String email, String avatarUrl, boolean disabled, boolean canUploadData) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(email, "email");
        return new CommunityMemberDto(userId, name, username, email, avatarUrl, disabled, canUploadData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunityMemberDto)) {
            return false;
        }
        CommunityMemberDto communityMemberDto = (CommunityMemberDto) other;
        return this.userId == communityMemberDto.userId && AbstractC22676k.m65745e(this.name, communityMemberDto.name) && AbstractC22676k.m65745e(this.username, communityMemberDto.username) && AbstractC22676k.m65745e(this.email, communityMemberDto.email) && AbstractC22676k.m65745e(this.avatarUrl, communityMemberDto.avatarUrl) && this.disabled == communityMemberDto.disabled && this.canUploadData == communityMemberDto.canUploadData;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final boolean getCanUploadData() {
        return this.canUploadData;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getName() {
        return this.name;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Integer.hashCode(this.userId) * 31, 31, this.name);
        String str = this.username;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.email);
        String str2 = this.avatarUrl;
        return Boolean.hashCode(this.canUploadData) + AbstractC2875y.m8289b((iM30450d2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.disabled);
    }

    public String toString() {
        int i13 = this.userId;
        String str = this.name;
        String str2 = this.username;
        String str3 = this.email;
        String str4 = this.avatarUrl;
        boolean z4 = this.disabled;
        boolean z13 = this.canUploadData;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "CommunityMemberDto(userId=", ", name=", str, ", username=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", email=", str3, ", avatarUrl=");
        AbstractC38963t7.m124390t(sbM53373n, str4, ", disabled=", z4, ", canUploadData=");
        return AbstractC18489d0.m53372m(sbM53373n, z13, ")");
    }

    public final TeamUser toTeamUser() {
        int i13 = this.userId;
        String str = this.avatarUrl;
        String str2 = this.name;
        String str3 = this.username;
        if (str3 == null) {
            str3 = "";
        }
        return new TeamUser(i13, str, str2, str3, new TeamPrivacyProfile(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null));
    }

    public CommunityMemberDto(int i13, String name, String str, String email, String str2, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(email, "email");
        this.userId = i13;
        this.name = name;
        this.username = str;
        this.email = email;
        this.avatarUrl = str2;
        this.disabled = z4;
        this.canUploadData = z13;
    }

    public /* synthetic */ CommunityMemberDto(int i13, String str, String str2, String str3, String str4, boolean z4, boolean z13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, (i14 & 2) != 0 ? "" : str, str2, (i14 & 8) != 0 ? "" : str3, str4, (i14 & 32) != 0 ? false : z4, (i14 & 64) != 0 ? false : z13);
    }
}
