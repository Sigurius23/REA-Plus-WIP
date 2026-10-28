package com.whoop.domain.model.teams;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.profile.domain.ProfileApiKt;
import ih0.AbstractC18489d0;
import java.io.Serializable;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002ONBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012Bs\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJz\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010\u001dJ\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001bJ\u001a\u0010/\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b@\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\bA\u0010\u001bR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\bB\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bF\u0010&R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010<\u0012\u0004\bH\u0010I\u001a\u0004\bG\u0010\u001dR(\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010>\u0012\u0004\bM\u0010I\u001a\u0004\bJ\u0010\u001f\"\u0004\bK\u0010L¨\u0006P"}, m65681d2 = {"Lcom/whoop/domain/model/teams/TeamInviteDto;", "Ljava/io/Serializable;", "", "id", "", NotificationCompat.CATEGORY_STATUS, "", "deleted", ProfileApiKt.COMMUNITY_ID_PARAM, "senderId", "recipientId", "Lcom/whoop/domain/model/teams/CommunityDto;", "community", "Lcom/whoop/domain/model/teams/CommunityMemberDto;", "sender", "inviteCode", "showBadge", "<init>", "(ILjava/lang/String;ZIIILcom/whoop/domain/model/teams/CommunityDto;Lcom/whoop/domain/model/teams/CommunityMemberDto;Ljava/lang/String;Z)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;ZIIILcom/whoop/domain/model/teams/CommunityDto;Lcom/whoop/domain/model/teams/CommunityMemberDto;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/whoop/domain/model/teams/DrawerDisplayInvite;", "toDrawerDisplayInvite", "()Lcom/whoop/domain/model/teams/DrawerDisplayInvite;", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "component5", "component6", "component7", "()Lcom/whoop/domain/model/teams/CommunityDto;", "component8", "()Lcom/whoop/domain/model/teams/CommunityMemberDto;", "component9", "component10", "copy", "(ILjava/lang/String;ZIIILcom/whoop/domain/model/teams/CommunityDto;Lcom/whoop/domain/model/teams/CommunityMemberDto;Ljava/lang/String;Z)Lcom/whoop/domain/model/teams/TeamInviteDto;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/domain/model/teams/TeamInviteDto;Lzc3/c;Lyc3/g;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getStatus", "Z", "getDeleted", "getCommunityId", "getSenderId", "getRecipientId", "Lcom/whoop/domain/model/teams/CommunityDto;", "getCommunity", "Lcom/whoop/domain/model/teams/CommunityMemberDto;", "getSender", "getInviteCode", "getInviteCode$annotations", "()V", "getShowBadge", "setShowBadge", "(Z)V", "getShowBadge$annotations", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TeamInviteDto implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("community")
    private final CommunityDto community;

    @SerializedName("community_id")
    private final int communityId;

    @SerializedName("deleted")
    private final boolean deleted;

    @SerializedName("id")
    private final int id;

    @SerializedName("community_invite_code")
    private final String inviteCode;

    @SerializedName("recipient_id")
    private final int recipientId;

    @SerializedName("sender")
    private final CommunityMemberDto sender;

    @SerializedName("sender_id")
    private final int senderId;

    @SerializedName("showBadge")
    private boolean showBadge;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/model/teams/TeamInviteDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/domain/model/teams/TeamInviteDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TeamInviteDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TeamInviteDto(int i13, int i14, String str, boolean z4, int i15, int i16, int i17, CommunityDto communityDto, CommunityMemberDto communityMemberDto, String str2, boolean z13, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, TeamInviteDto$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i14;
        this.status = str;
        this.deleted = z4;
        this.communityId = i15;
        this.senderId = i16;
        this.recipientId = i17;
        if ((i13 & 64) == 0) {
            this.community = null;
        } else {
            this.community = communityDto;
        }
        if ((i13 & 128) == 0) {
            this.sender = null;
        } else {
            this.sender = communityMemberDto;
        }
        if ((i13 & 256) == 0) {
            this.inviteCode = null;
        } else {
            this.inviteCode = str2;
        }
        if ((i13 & 512) == 0) {
            this.showBadge = true;
        } else {
            this.showBadge = z13;
        }
    }

    public static /* synthetic */ TeamInviteDto copy$default(TeamInviteDto teamInviteDto, int i13, String str, boolean z4, int i14, int i15, int i16, CommunityDto communityDto, CommunityMemberDto communityMemberDto, String str2, boolean z13, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i13 = teamInviteDto.id;
        }
        if ((i17 & 2) != 0) {
            str = teamInviteDto.status;
        }
        if ((i17 & 4) != 0) {
            z4 = teamInviteDto.deleted;
        }
        if ((i17 & 8) != 0) {
            i14 = teamInviteDto.communityId;
        }
        if ((i17 & 16) != 0) {
            i15 = teamInviteDto.senderId;
        }
        if ((i17 & 32) != 0) {
            i16 = teamInviteDto.recipientId;
        }
        if ((i17 & 64) != 0) {
            communityDto = teamInviteDto.community;
        }
        if ((i17 & 128) != 0) {
            communityMemberDto = teamInviteDto.sender;
        }
        if ((i17 & 256) != 0) {
            str2 = teamInviteDto.inviteCode;
        }
        if ((i17 & 512) != 0) {
            z13 = teamInviteDto.showBadge;
        }
        String str3 = str2;
        boolean z14 = z13;
        CommunityDto communityDto2 = communityDto;
        CommunityMemberDto communityMemberDto2 = communityMemberDto;
        int i18 = i15;
        int i19 = i16;
        return teamInviteDto.copy(i13, str, z4, i14, i18, i19, communityDto2, communityMemberDto2, str3, z14);
    }

    @InterfaceC37143h("community_invite_code")
    public static /* synthetic */ void getInviteCode$annotations() {
    }

    @InterfaceC37143h("showBadge")
    public static /* synthetic */ void getShowBadge$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(TeamInviteDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.status);
        output.encodeBooleanElement(serialDesc, 2, self.deleted);
        output.encodeIntElement(serialDesc, 3, self.communityId);
        output.encodeIntElement(serialDesc, 4, self.senderId);
        output.encodeIntElement(serialDesc, 5, self.recipientId);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.community != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, CommunityDto$$serializer.INSTANCE, self.community);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.sender != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, CommunityMemberDto$$serializer.INSTANCE, self.sender);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.inviteCode != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.inviteCode);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.showBadge) {
            return;
        }
        output.encodeBooleanElement(serialDesc, 9, self.showBadge);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getShowBadge() {
        return this.showBadge;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCommunityId() {
        return this.communityId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSenderId() {
        return this.senderId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRecipientId() {
        return this.recipientId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CommunityDto getCommunity() {
        return this.community;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final CommunityMemberDto getSender() {
        return this.sender;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getInviteCode() {
        return this.inviteCode;
    }

    public final TeamInviteDto copy(int id4, String status, boolean deleted, int communityId, int senderId, int recipientId, CommunityDto community, CommunityMemberDto sender, String inviteCode, boolean showBadge) {
        AbstractC22676k.m65750j(status, "status");
        return new TeamInviteDto(id4, status, deleted, communityId, senderId, recipientId, community, sender, inviteCode, showBadge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamInviteDto)) {
            return false;
        }
        TeamInviteDto teamInviteDto = (TeamInviteDto) other;
        return this.id == teamInviteDto.id && AbstractC22676k.m65745e(this.status, teamInviteDto.status) && this.deleted == teamInviteDto.deleted && this.communityId == teamInviteDto.communityId && this.senderId == teamInviteDto.senderId && this.recipientId == teamInviteDto.recipientId && AbstractC22676k.m65745e(this.community, teamInviteDto.community) && AbstractC22676k.m65745e(this.sender, teamInviteDto.sender) && AbstractC22676k.m65745e(this.inviteCode, teamInviteDto.inviteCode) && this.showBadge == teamInviteDto.showBadge;
    }

    public final CommunityDto getCommunity() {
        return this.community;
    }

    public final int getCommunityId() {
        return this.communityId;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final int getId() {
        return this.id;
    }

    public final String getInviteCode() {
        return this.inviteCode;
    }

    public final int getRecipientId() {
        return this.recipientId;
    }

    public final CommunityMemberDto getSender() {
        return this.sender;
    }

    public final int getSenderId() {
        return this.senderId;
    }

    public final boolean getShowBadge() {
        return this.showBadge;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.recipientId, AbstractC11266d.m30448b(this.senderId, AbstractC11266d.m30448b(this.communityId, AbstractC2875y.m8289b(AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.status), 31, this.deleted), 31), 31), 31);
        CommunityDto communityDto = this.community;
        int iHashCode = (iM30448b + (communityDto == null ? 0 : communityDto.hashCode())) * 31;
        CommunityMemberDto communityMemberDto = this.sender;
        int iHashCode2 = (iHashCode + (communityMemberDto == null ? 0 : communityMemberDto.hashCode())) * 31;
        String str = this.inviteCode;
        return Boolean.hashCode(this.showBadge) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final void setShowBadge(boolean z4) {
        this.showBadge = z4;
    }

    public final DrawerDisplayInvite toDrawerDisplayInvite() {
        String name;
        String avatar;
        String username;
        int i13 = this.id;
        String str = this.status;
        int i14 = this.communityId;
        CommunityDto communityDto = this.community;
        String str2 = "???";
        if (communityDto == null || (name = communityDto.getName()) == null) {
            name = "???";
        }
        CommunityDto communityDto2 = this.community;
        if (communityDto2 == null || (avatar = communityDto2.getAvatar()) == null) {
            avatar = "";
        }
        int i15 = this.senderId;
        CommunityMemberDto communityMemberDto = this.sender;
        if (communityMemberDto != null && (username = communityMemberDto.getUsername()) != null) {
            str2 = username;
        }
        return new DrawerDisplayInvite(i13, str, i14, name, avatar, i15, "@".concat(str2), this.inviteCode);
    }

    public String toString() {
        int i13 = this.id;
        String str = this.status;
        boolean z4 = this.deleted;
        int i14 = this.communityId;
        int i15 = this.senderId;
        int i16 = this.recipientId;
        CommunityDto communityDto = this.community;
        CommunityMemberDto communityMemberDto = this.sender;
        String str2 = this.inviteCode;
        boolean z13 = this.showBadge;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "TeamInviteDto(id=", ", status=", str, ", deleted=");
        AbstractC30802r.m94769r(i14, ", communityId=", ", senderId=", sbM53373n, z4);
        AbstractC30802r.m94773v(sbM53373n, i15, ", recipientId=", i16, ", community=");
        sbM53373n.append(communityDto);
        sbM53373n.append(", sender=");
        sbM53373n.append(communityMemberDto);
        sbM53373n.append(", inviteCode=");
        return AbstractC21702c.m61137h(sbM53373n, str2, ", showBadge=", z13, ")");
    }

    public TeamInviteDto(int i13, String status, boolean z4, int i14, int i15, int i16, CommunityDto communityDto, CommunityMemberDto communityMemberDto, String str, boolean z13) {
        AbstractC22676k.m65750j(status, "status");
        this.id = i13;
        this.status = status;
        this.deleted = z4;
        this.communityId = i14;
        this.senderId = i15;
        this.recipientId = i16;
        this.community = communityDto;
        this.sender = communityMemberDto;
        this.inviteCode = str;
        this.showBadge = z13;
    }

    public /* synthetic */ TeamInviteDto(int i13, String str, boolean z4, int i14, int i15, int i16, CommunityDto communityDto, CommunityMemberDto communityMemberDto, String str2, boolean z13, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, z4, i14, i15, i16, (i17 & 64) != 0 ? null : communityDto, (i17 & 128) != 0 ? null : communityMemberDto, (i17 & 256) != 0 ? null : str2, (i17 & 512) != 0 ? true : z13);
    }
}
