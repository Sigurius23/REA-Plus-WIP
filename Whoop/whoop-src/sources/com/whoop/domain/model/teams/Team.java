package com.whoop.domain.model.teams;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.p069ui.ScoreContext;
import d13.AbstractC11478a;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010(J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\u001fJ\u0010\u00102\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010\u001fJ\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010\u001fJ\u0012\u00106\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u0010\u001fJ°\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b=\u0010(J\u0010\u0010>\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b>\u0010\u001fJ\u001a\u0010A\u001a\u00020\u00162\b\u0010@\u001a\u0004\u0018\u00010?HÖ\u0003¢\u0006\u0004\bA\u0010BR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bF\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010E\u001a\u0004\bG\u0010(R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bH\u0010(R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bI\u0010(R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bJ\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010K\u001a\u0004\bL\u0010.R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bN\u00100R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bO\u0010\u001fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010P\u001a\u0004\bQ\u00103R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\bR\u0010\u001fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bS\u0010\u001fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010T\u001a\u0004\bU\u00107R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010V\u001a\u0004\bW\u00109R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010C\u001a\u0004\bX\u0010\u001f\"\u0004\bY\u0010Z¨\u0006["}, m65681d2 = {"Lcom/whoop/domain/model/teams/Team;", "Landroid/os/Parcelable;", "", "id", "", "name", "description", "iconUrl", "bannerUrl", "athletePrivacyId", "Lcom/whoop/domain/model/teams/TeamPrivacyProfile;", "privacyProfile", "", "Lcom/whoop/ui/ScoreContext;", "enabledTabs", "adminId", "Lcom/whoop/domain/model/teams/TeamType;", "teamType", "memberCount", "rank", "Lcom/whoop/domain/model/teams/ChatChannel;", "chatChannel", "", "chatEnabled", "unreadCount", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)V", "Lcom/whoop/domain/model/teams/CommunityDto;", "toCommunityDto", "()Lcom/whoop/domain/model/teams/CommunityDto;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Lcom/whoop/domain/model/teams/TeamPrivacyProfile;", "component8", "()Ljava/util/List;", "component9", "component10", "()Lcom/whoop/domain/model/teams/TeamType;", "component11", "component12", "component13", "()Lcom/whoop/domain/model/teams/ChatChannel;", "component14", "()Z", "component15", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)Lcom/whoop/domain/model/teams/Team;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "getDescription", "getIconUrl", "getBannerUrl", "getAthletePrivacyId", "Lcom/whoop/domain/model/teams/TeamPrivacyProfile;", "getPrivacyProfile", "Ljava/util/List;", "getEnabledTabs", "getAdminId", "Lcom/whoop/domain/model/teams/TeamType;", "getTeamType", "getMemberCount", "getRank", "Lcom/whoop/domain/model/teams/ChatChannel;", "getChatChannel", "Z", "getChatEnabled", "getUnreadCount", "setUnreadCount", "(I)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class Team implements Parcelable {
    public static final Parcelable.Creator<Team> CREATOR = new Creator();
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
    private int unreadCount;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<Team> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Team createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
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
            return new Team(i13, string, string2, string3, string4, i14, teamPrivacyProfileCreateFromParcel, arrayList, parcel.readInt(), TeamType.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : ChatChannel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Team[] newArray(int i13) {
            return new Team[i13];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Team(int i13, String name, String str, String iconUrl, String bannerUrl, int i14, TeamPrivacyProfile privacyProfile, List<? extends ScoreContext> enabledTabs, int i15, TeamType teamType, int i16, int i17, ChatChannel chatChannel, boolean z4, int i18) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(bannerUrl, "bannerUrl");
        AbstractC22676k.m65750j(privacyProfile, "privacyProfile");
        AbstractC22676k.m65750j(enabledTabs, "enabledTabs");
        AbstractC22676k.m65750j(teamType, "teamType");
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
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final TeamType getTeamType() {
        return this.teamType;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getMemberCount() {
        return this.memberCount;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final ChatChannel getChatChannel() {
        return this.chatChannel;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getChatEnabled() {
        return this.chatEnabled;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getUnreadCount() {
        return this.unreadCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getAthletePrivacyId() {
        return this.athletePrivacyId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TeamPrivacyProfile getPrivacyProfile() {
        return this.privacyProfile;
    }

    public final List<ScoreContext> component8() {
        return this.enabledTabs;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getAdminId() {
        return this.adminId;
    }

    public final Team copy(int id4, String name, String description, String iconUrl, String bannerUrl, int athletePrivacyId, TeamPrivacyProfile privacyProfile, List<? extends ScoreContext> enabledTabs, int adminId, TeamType teamType, int memberCount, int rank, ChatChannel chatChannel, boolean chatEnabled, int unreadCount) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(bannerUrl, "bannerUrl");
        AbstractC22676k.m65750j(privacyProfile, "privacyProfile");
        AbstractC22676k.m65750j(enabledTabs, "enabledTabs");
        AbstractC22676k.m65750j(teamType, "teamType");
        return new Team(id4, name, description, iconUrl, bannerUrl, athletePrivacyId, privacyProfile, enabledTabs, adminId, teamType, memberCount, rank, chatChannel, chatEnabled, unreadCount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Team)) {
            return false;
        }
        Team team = (Team) other;
        return this.id == team.id && AbstractC22676k.m65745e(this.name, team.name) && AbstractC22676k.m65745e(this.description, team.description) && AbstractC22676k.m65745e(this.iconUrl, team.iconUrl) && AbstractC22676k.m65745e(this.bannerUrl, team.bannerUrl) && this.athletePrivacyId == team.athletePrivacyId && AbstractC22676k.m65745e(this.privacyProfile, team.privacyProfile) && AbstractC22676k.m65745e(this.enabledTabs, team.enabledTabs) && this.adminId == team.adminId && this.teamType == team.teamType && this.memberCount == team.memberCount && this.rank == team.rank && AbstractC22676k.m65745e(this.chatChannel, team.chatChannel) && this.chatEnabled == team.chatEnabled && this.unreadCount == team.unreadCount;
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

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.name);
        String str = this.description;
        int iM30448b = AbstractC11266d.m30448b(this.rank, AbstractC11266d.m30448b(this.memberCount, (this.teamType.hashCode() + AbstractC11266d.m30448b(this.adminId, AbstractC11895b.m31983b((this.privacyProfile.hashCode() + AbstractC11266d.m30448b(this.athletePrivacyId, AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.iconUrl), 31, this.bannerUrl), 31)) * 31, 31, this.enabledTabs), 31)) * 31, 31), 31);
        ChatChannel chatChannel = this.chatChannel;
        return Integer.hashCode(this.unreadCount) + AbstractC2875y.m8289b((iM30448b + (chatChannel != null ? chatChannel.hashCode() : 0)) * 31, 31, this.chatEnabled);
    }

    public final void setUnreadCount(int i13) {
        this.unreadCount = i13;
    }

    public final CommunityDto toCommunityDto() {
        int i13 = this.id;
        String str = this.name;
        int i14 = this.adminId;
        boolean zContains = this.enabledTabs.contains(ScoreContext.STRAIN);
        boolean zContains2 = this.enabledTabs.contains(ScoreContext.RECOVERY);
        boolean zContains3 = this.enabledTabs.contains(ScoreContext.SLEEP);
        String str2 = this.description;
        String str3 = this.bannerUrl;
        String str4 = this.iconUrl;
        TeamType teamType = this.teamType;
        ArrayList arrayList = new ArrayList();
        return new CommunityDto(i13, false, str, i14, zContains, zContains2, zContains3, str2, str3, str4, true, teamType, null, null, Integer.valueOf(this.unreadCount), this.chatEnabled, arrayList);
    }

    public String toString() {
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
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "Team(id=", ", name=", str, ", description=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", iconUrl=", str3, ", bannerUrl=");
        AbstractC11266d.m30470x(i14, str4, ", athletePrivacyId=", ", privacyProfile=", sbM53373n);
        sbM53373n.append(teamPrivacyProfile);
        sbM53373n.append(", enabledTabs=");
        sbM53373n.append(list);
        sbM53373n.append(", adminId=");
        sbM53373n.append(i15);
        sbM53373n.append(", teamType=");
        sbM53373n.append(teamType);
        sbM53373n.append(", memberCount=");
        AbstractC30802r.m94773v(sbM53373n, i16, ", rank=", i17, ", chatChannel=");
        sbM53373n.append(chatChannel);
        sbM53373n.append(", chatEnabled=");
        sbM53373n.append(z4);
        sbM53373n.append(", unreadCount=");
        return AbstractC18489d0.m53371l(sbM53373n, i18, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
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

    public /* synthetic */ Team(int i13, String str, String str2, String str3, String str4, int i14, TeamPrivacyProfile teamPrivacyProfile, List list, int i15, TeamType teamType, int i16, int i17, ChatChannel chatChannel, boolean z4, int i18, int i19, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, str2, str3, str4, i14, teamPrivacyProfile, list, (i19 & 256) != 0 ? 0 : i15, teamType, i16, i17, chatChannel, z4, i18);
    }
}
