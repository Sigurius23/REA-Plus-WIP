package com.whoop.data.local.room.entity;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import com.whoop.domain.model.teams.ChatChannel;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamPrivacyProfile;
import com.whoop.domain.model.teams.TeamType;
import com.whoop.p069ui.ScoreContext;
import d13.AbstractC11478a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0010\u0010*\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b-\u0010+J\u0010\u0010.\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b.\u0010+J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010 J\u0010\u00100\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b0\u00101J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010 J\u0010\u00105\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b7\u0010 J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u0010 J\u0012\u00109\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b=\u0010 J¼\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0003\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0003\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b@\u0010+J\u0010\u0010A\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bA\u0010 J\u001a\u0010D\u001a\u00020\u00172\b\u0010C\u001a\u0004\u0018\u00010BHÖ\u0003¢\u0006\u0004\bD\u0010ER$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010(\"\u0004\bH\u0010IR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010J\u001a\u0004\bK\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010L\u001a\u0004\bM\u0010+R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010L\u001a\u0004\bN\u0010+R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010L\u001a\u0004\bO\u0010+R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\bP\u0010+R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\bQ\u0010 R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010R\u001a\u0004\bS\u00101R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010T\u001a\u0004\bU\u00103R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bV\u0010 R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010W\u001a\u0004\bX\u00106R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010J\u001a\u0004\bY\u0010 R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010J\u001a\u0004\bZ\u0010 R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010[\u001a\u0004\b\\\u0010:R\u001a\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010]\u001a\u0004\b^\u0010<R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010J\u001a\u0004\b_\u0010 ¨\u0006`"}, m65681d2 = {"Lcom/whoop/data/local/room/entity/TeamsDto;", "Landroid/os/Parcelable;", "", "userId", "id", "", "name", "description", "iconUrl", "bannerUrl", "athletePrivacyId", "Lcom/whoop/domain/model/teams/TeamPrivacyProfile;", "privacyProfile", "", "Lcom/whoop/ui/ScoreContext;", "enabledTabs", "adminId", "Lcom/whoop/domain/model/teams/TeamType;", "teamType", "memberCount", "rank", "Lcom/whoop/domain/model/teams/ChatChannel;", "chatChannel", "", "chatEnabled", "unreadCount", "<init>", "(Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)V", "Lcom/whoop/domain/model/teams/Team;", "toTeam", "()Lcom/whoop/domain/model/teams/Team;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "()Lcom/whoop/domain/model/teams/TeamPrivacyProfile;", "component9", "()Ljava/util/List;", "component10", "component11", "()Lcom/whoop/domain/model/teams/TeamType;", "component12", "component13", "component14", "()Lcom/whoop/domain/model/teams/ChatChannel;", "component15", "()Z", "component16", "copy", "(Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)Lcom/whoop/data/local/room/entity/TeamsDto;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getUserId", "setUserId", "(Ljava/lang/Integer;)V", "I", "getId", "Ljava/lang/String;", "getName", "getDescription", "getIconUrl", "getBannerUrl", "getAthletePrivacyId", "Lcom/whoop/domain/model/teams/TeamPrivacyProfile;", "getPrivacyProfile", "Ljava/util/List;", "getEnabledTabs", "getAdminId", "Lcom/whoop/domain/model/teams/TeamType;", "getTeamType", "getMemberCount", "getRank", "Lcom/whoop/domain/model/teams/ChatChannel;", "getChatChannel", "Z", "getChatEnabled", "getUnreadCount", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class TeamsDto implements Parcelable {
    public static final Parcelable.Creator<TeamsDto> CREATOR = new Creator();
    private final int adminId;
    private final int athletePrivacyId;
    private final String bannerUrl;
    private final ChatChannel chatChannel;
    private final boolean chatEnabled;
    private final String description;
    private final List<ScoreContext> enabledTabs;
    private final String iconUrl;
    private final int id;
    private final int memberCount;
    private final String name;
    private final TeamPrivacyProfile privacyProfile;
    private final int rank;
    private final TeamType teamType;
    private final int unreadCount;
    private Integer userId;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<TeamsDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeamsDto createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i13 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i14 = parcel.readInt();
            TeamPrivacyProfile teamPrivacyProfileCreateFromParcel = TeamPrivacyProfile.CREATOR.createFromParcel(parcel);
            int i15 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList.add(ScoreContext.valueOf(parcel.readString()));
            }
            return new TeamsDto(numValueOf, i13, string, string2, string3, string4, i14, teamPrivacyProfileCreateFromParcel, arrayList, parcel.readInt(), TeamType.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? ChatChannel.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeamsDto[] newArray(int i13) {
            return new TeamsDto[i13];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TeamsDto(Integer num, int i13, String name, String str, String iconUrl, String bannerUrl, int i14, TeamPrivacyProfile privacyProfile, List<? extends ScoreContext> enabledTabs, int i15, TeamType teamType, int i16, int i17, ChatChannel chatChannel, boolean z4, int i18) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(bannerUrl, "bannerUrl");
        AbstractC22676k.m65750j(privacyProfile, "privacyProfile");
        AbstractC22676k.m65750j(enabledTabs, "enabledTabs");
        AbstractC22676k.m65750j(teamType, "teamType");
        this.userId = num;
        this.id = i13;
        this.name = name;
        this.description = str;
        this.iconUrl = iconUrl;
        this.bannerUrl = bannerUrl;
        this.athletePrivacyId = i14;
        this.privacyProfile = privacyProfile;
        this.enabledTabs = enabledTabs;
        this.adminId = i15;
        this.teamType = teamType;
        this.memberCount = i16;
        this.rank = i17;
        this.chatChannel = chatChannel;
        this.chatEnabled = z4;
        this.unreadCount = i18;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getAdminId() {
        return this.adminId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final TeamType getTeamType() {
        return this.teamType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getMemberCount() {
        return this.memberCount;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final ChatChannel getChatChannel() {
        return this.chatChannel;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getChatEnabled() {
        return this.chatEnabled;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getUnreadCount() {
        return this.unreadCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getAthletePrivacyId() {
        return this.athletePrivacyId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TeamPrivacyProfile getPrivacyProfile() {
        return this.privacyProfile;
    }

    public final List<ScoreContext> component9() {
        return this.enabledTabs;
    }

    public final TeamsDto copy(Integer userId, int id4, String name, String description, String iconUrl, String bannerUrl, int athletePrivacyId, TeamPrivacyProfile privacyProfile, List<? extends ScoreContext> enabledTabs, int adminId, TeamType teamType, int memberCount, int rank, ChatChannel chatChannel, boolean chatEnabled, int unreadCount) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(bannerUrl, "bannerUrl");
        AbstractC22676k.m65750j(privacyProfile, "privacyProfile");
        AbstractC22676k.m65750j(enabledTabs, "enabledTabs");
        AbstractC22676k.m65750j(teamType, "teamType");
        return new TeamsDto(userId, id4, name, description, iconUrl, bannerUrl, athletePrivacyId, privacyProfile, enabledTabs, adminId, teamType, memberCount, rank, chatChannel, chatEnabled, unreadCount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamsDto)) {
            return false;
        }
        TeamsDto teamsDto = (TeamsDto) other;
        return AbstractC22676k.m65745e(this.userId, teamsDto.userId) && this.id == teamsDto.id && AbstractC22676k.m65745e(this.name, teamsDto.name) && AbstractC22676k.m65745e(this.description, teamsDto.description) && AbstractC22676k.m65745e(this.iconUrl, teamsDto.iconUrl) && AbstractC22676k.m65745e(this.bannerUrl, teamsDto.bannerUrl) && this.athletePrivacyId == teamsDto.athletePrivacyId && AbstractC22676k.m65745e(this.privacyProfile, teamsDto.privacyProfile) && AbstractC22676k.m65745e(this.enabledTabs, teamsDto.enabledTabs) && this.adminId == teamsDto.adminId && this.teamType == teamsDto.teamType && this.memberCount == teamsDto.memberCount && this.rank == teamsDto.rank && AbstractC22676k.m65745e(this.chatChannel, teamsDto.chatChannel) && this.chatEnabled == teamsDto.chatEnabled && this.unreadCount == teamsDto.unreadCount;
    }

    public final int getAdminId() {
        return this.adminId;
    }

    public final int getAthletePrivacyId() {
        return this.athletePrivacyId;
    }

    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    public final ChatChannel getChatChannel() {
        return this.chatChannel;
    }

    public final boolean getChatEnabled() {
        return this.chatEnabled;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<ScoreContext> getEnabledTabs() {
        return this.enabledTabs;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getId() {
        return this.id;
    }

    public final int getMemberCount() {
        return this.memberCount;
    }

    public final String getName() {
        return this.name;
    }

    public final TeamPrivacyProfile getPrivacyProfile() {
        return this.privacyProfile;
    }

    public final int getRank() {
        return this.rank;
    }

    public final TeamType getTeamType() {
        return this.teamType;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public final Integer getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Integer num = this.userId;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.id, (num == null ? 0 : num.hashCode()) * 31, 31), 31, this.name);
        String str = this.description;
        int iM30448b = AbstractC11266d.m30448b(this.rank, AbstractC11266d.m30448b(this.memberCount, (this.teamType.hashCode() + AbstractC11266d.m30448b(this.adminId, AbstractC11895b.m31983b((this.privacyProfile.hashCode() + AbstractC11266d.m30448b(this.athletePrivacyId, AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.iconUrl), 31, this.bannerUrl), 31)) * 31, 31, this.enabledTabs), 31)) * 31, 31), 31);
        ChatChannel chatChannel = this.chatChannel;
        return Integer.hashCode(this.unreadCount) + AbstractC2875y.m8289b((iM30448b + (chatChannel != null ? chatChannel.hashCode() : 0)) * 31, 31, this.chatEnabled);
    }

    public final void setUserId(Integer num) {
        this.userId = num;
    }

    public String toString() {
        Integer num = this.userId;
        int i13 = this.id;
        String str = this.name;
        String str2 = this.description;
        String str3 = this.iconUrl;
        String str4 = this.bannerUrl;
        int i14 = this.athletePrivacyId;
        TeamPrivacyProfile teamPrivacyProfile = this.privacyProfile;
        List<ScoreContext> list = this.enabledTabs;
        int i15 = this.adminId;
        TeamType teamType = this.teamType;
        int i16 = this.memberCount;
        int i17 = this.rank;
        ChatChannel chatChannel = this.chatChannel;
        boolean z4 = this.chatEnabled;
        int i18 = this.unreadCount;
        StringBuilder sb4 = new StringBuilder("TeamsDto(userId=");
        sb4.append(num);
        sb4.append(", id=");
        sb4.append(i13);
        sb4.append(", name=");
        AbstractC11266d.m30444B(sb4, str, ", description=", str2, ", iconUrl=");
        AbstractC11266d.m30444B(sb4, str3, ", bannerUrl=", str4, ", athletePrivacyId=");
        sb4.append(i14);
        sb4.append(", privacyProfile=");
        sb4.append(teamPrivacyProfile);
        sb4.append(", enabledTabs=");
        sb4.append(list);
        sb4.append(", adminId=");
        sb4.append(i15);
        sb4.append(", teamType=");
        sb4.append(teamType);
        sb4.append(", memberCount=");
        sb4.append(i16);
        sb4.append(", rank=");
        sb4.append(i17);
        sb4.append(", chatChannel=");
        sb4.append(chatChannel);
        sb4.append(", chatEnabled=");
        sb4.append(z4);
        sb4.append(", unreadCount=");
        sb4.append(i18);
        sb4.append(")");
        return sb4.toString();
    }

    public final Team toTeam() {
        return new Team(this.id, this.name, this.description, this.iconUrl, this.bannerUrl, this.athletePrivacyId, this.privacyProfile, this.enabledTabs, this.adminId, this.teamType, this.memberCount, this.rank, this.chatChannel, this.chatEnabled, this.unreadCount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        Integer num = this.userId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeString(this.iconUrl);
        dest.writeString(this.bannerUrl);
        dest.writeInt(this.athletePrivacyId);
        this.privacyProfile.writeToParcel(dest, flags);
        Iterator itM30863o = AbstractC11478a.m30863o(this.enabledTabs, dest);
        while (itM30863o.hasNext()) {
            dest.writeString(((ScoreContext) itM30863o.next()).name());
        }
        dest.writeInt(this.adminId);
        this.teamType.writeToParcel(dest, flags);
        dest.writeInt(this.memberCount);
        dest.writeInt(this.rank);
        ChatChannel chatChannel = this.chatChannel;
        if (chatChannel == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            chatChannel.writeToParcel(dest, flags);
        }
        dest.writeInt(this.chatEnabled ? 1 : 0);
        dest.writeInt(this.unreadCount);
    }

    public /* synthetic */ TeamsDto(Integer num, int i13, String str, String str2, String str3, String str4, int i14, TeamPrivacyProfile teamPrivacyProfile, List list, int i15, TeamType teamType, int i16, int i17, ChatChannel chatChannel, boolean z4, int i18, int i19, DefaultConstructorMarker defaultConstructorMarker) {
        this((i19 & 1) != 0 ? 0 : num, i13, str, str2, str3, str4, i14, teamPrivacyProfile, list, (i19 & 512) != 0 ? 0 : i15, teamType, i16, i17, chatChannel, z4, i18);
    }
}
