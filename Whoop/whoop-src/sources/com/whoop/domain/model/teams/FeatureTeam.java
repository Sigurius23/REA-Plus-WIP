package com.whoop.domain.model.teams;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.profile.domain.ProfileApiKt;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010\u0016J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\u0016J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b'\u0010\u0016J\u0010\u0010(\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)Jv\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001eJ\u0010\u0010-\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b-\u0010\u0016J\u001a\u00100\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b9\u0010\u0016R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b:\u0010\u001eR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010&R\u001a\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b=\u0010\u0016R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010)\"\u0004\b@\u0010AR\"\u0010C\u001a\u00020B8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006I"}, m65681d2 = {"Lcom/whoop/domain/model/teams/FeatureTeam;", "Landroid/os/Parcelable;", "", "name", "description", "iconUrl", "bannerUrl", "", "athletePrivacyId", "memberCount", "inviteCode", "Lcom/whoop/domain/model/teams/TeamType;", "teamType", ProfileApiKt.COMMUNITY_ID_PARAM, "", "showBadge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lcom/whoop/domain/model/teams/TeamType;IZ)V", "Lcom/whoop/domain/model/teams/DrawerDisplayInvite;", "toDrawerDisplayInvite", "()Lcom/whoop/domain/model/teams/DrawerDisplayInvite;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/whoop/domain/model/teams/TeamType;", "component9", "component10", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lcom/whoop/domain/model/teams/TeamType;IZ)Lcom/whoop/domain/model/teams/FeatureTeam;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getDescription", "getIconUrl", "getBannerUrl", "I", "getAthletePrivacyId", "getMemberCount", "getInviteCode", "Lcom/whoop/domain/model/teams/TeamType;", "getTeamType", "getCommunityId", "Z", "getShowBadge", "setShowBadge", "(Z)V", "", "id", "J", "getId", "()J", "setId", "(J)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class FeatureTeam implements Parcelable {
    public static final Parcelable.Creator<FeatureTeam> CREATOR = new Creator();
    private final int athletePrivacyId;
    private final String bannerUrl;
    private final int communityId;
    private final String description;
    private final String iconUrl;
    private long id;
    private final String inviteCode;
    private final int memberCount;
    private final String name;
    private boolean showBadge;
    private final TeamType teamType;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<FeatureTeam> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeatureTeam createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new FeatureTeam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), TeamType.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeatureTeam[] newArray(int i13) {
            return new FeatureTeam[i13];
        }
    }

    public FeatureTeam(String name, String str, String iconUrl, String bannerUrl, int i13, int i14, String inviteCode, TeamType teamType, int i15, boolean z4) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(bannerUrl, "bannerUrl");
        AbstractC22676k.m65750j(inviteCode, "inviteCode");
        AbstractC22676k.m65750j(teamType, "teamType");
        this.name = name;
        this.description = str;
        this.iconUrl = iconUrl;
        this.bannerUrl = bannerUrl;
        this.athletePrivacyId = i13;
        this.memberCount = i14;
        this.inviteCode = inviteCode;
        this.teamType = teamType;
        this.communityId = i15;
        this.showBadge = z4;
    }

    public static /* synthetic */ FeatureTeam copy$default(FeatureTeam featureTeam, String str, String str2, String str3, String str4, int i13, int i14, String str5, TeamType teamType, int i15, boolean z4, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            str = featureTeam.name;
        }
        if ((i16 & 2) != 0) {
            str2 = featureTeam.description;
        }
        if ((i16 & 4) != 0) {
            str3 = featureTeam.iconUrl;
        }
        if ((i16 & 8) != 0) {
            str4 = featureTeam.bannerUrl;
        }
        if ((i16 & 16) != 0) {
            i13 = featureTeam.athletePrivacyId;
        }
        if ((i16 & 32) != 0) {
            i14 = featureTeam.memberCount;
        }
        if ((i16 & 64) != 0) {
            str5 = featureTeam.inviteCode;
        }
        if ((i16 & 128) != 0) {
            teamType = featureTeam.teamType;
        }
        if ((i16 & 256) != 0) {
            i15 = featureTeam.communityId;
        }
        if ((i16 & 512) != 0) {
            z4 = featureTeam.showBadge;
        }
        int i17 = i15;
        boolean z13 = z4;
        String str6 = str5;
        TeamType teamType2 = teamType;
        int i18 = i13;
        int i19 = i14;
        return featureTeam.copy(str, str2, str3, str4, i18, i19, str6, teamType2, i17, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getShowBadge() {
        return this.showBadge;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAthletePrivacyId() {
        return this.athletePrivacyId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMemberCount() {
        return this.memberCount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getInviteCode() {
        return this.inviteCode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TeamType getTeamType() {
        return this.teamType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getCommunityId() {
        return this.communityId;
    }

    public final FeatureTeam copy(String name, String description, String iconUrl, String bannerUrl, int athletePrivacyId, int memberCount, String inviteCode, TeamType teamType, int communityId, boolean showBadge) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(bannerUrl, "bannerUrl");
        AbstractC22676k.m65750j(inviteCode, "inviteCode");
        AbstractC22676k.m65750j(teamType, "teamType");
        return new FeatureTeam(name, description, iconUrl, bannerUrl, athletePrivacyId, memberCount, inviteCode, teamType, communityId, showBadge);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureTeam)) {
            return false;
        }
        FeatureTeam featureTeam = (FeatureTeam) other;
        return AbstractC22676k.m65745e(this.name, featureTeam.name) && AbstractC22676k.m65745e(this.description, featureTeam.description) && AbstractC22676k.m65745e(this.iconUrl, featureTeam.iconUrl) && AbstractC22676k.m65745e(this.bannerUrl, featureTeam.bannerUrl) && this.athletePrivacyId == featureTeam.athletePrivacyId && this.memberCount == featureTeam.memberCount && AbstractC22676k.m65745e(this.inviteCode, featureTeam.inviteCode) && this.teamType == featureTeam.teamType && this.communityId == featureTeam.communityId && this.showBadge == featureTeam.showBadge;
    }

    public final int getAthletePrivacyId() {
        return this.athletePrivacyId;
    }

    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    public final int getCommunityId() {
        return this.communityId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final long getId() {
        return this.id;
    }

    public final String getInviteCode() {
        return this.inviteCode;
    }

    public final int getMemberCount() {
        return this.memberCount;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getShowBadge() {
        return this.showBadge;
    }

    public final TeamType getTeamType() {
        return this.teamType;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.description;
        return Boolean.hashCode(this.showBadge) + AbstractC11266d.m30448b(this.communityId, (this.teamType.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.memberCount, AbstractC11266d.m30448b(this.athletePrivacyId, AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.iconUrl), 31, this.bannerUrl), 31), 31), 31, this.inviteCode)) * 31, 31);
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setShowBadge(boolean z4) {
        this.showBadge = z4;
    }

    public final DrawerDisplayInvite toDrawerDisplayInvite() {
        int i13 = this.communityId;
        return new DrawerDisplayInvite(i13, "", i13, this.name, this.iconUrl, 0, "", this.inviteCode);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.description;
        String str3 = this.iconUrl;
        String str4 = this.bannerUrl;
        int i13 = this.athletePrivacyId;
        int i14 = this.memberCount;
        String str5 = this.inviteCode;
        TeamType teamType = this.teamType;
        int i15 = this.communityId;
        boolean z4 = this.showBadge;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("FeatureTeam(name=", str, ", description=", str2, ", iconUrl=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", bannerUrl=", str4, ", athletePrivacyId=");
        AbstractC30802r.m94773v(sbM32001t, i13, ", memberCount=", i14, ", inviteCode=");
        sbM32001t.append(str5);
        sbM32001t.append(", teamType=");
        sbM32001t.append(teamType);
        sbM32001t.append(", communityId=");
        sbM32001t.append(i15);
        sbM32001t.append(", showBadge=");
        sbM32001t.append(z4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeString(this.iconUrl);
        dest.writeString(this.bannerUrl);
        dest.writeInt(this.athletePrivacyId);
        dest.writeInt(this.memberCount);
        dest.writeString(this.inviteCode);
        this.teamType.writeToParcel(dest, flags);
        dest.writeInt(this.communityId);
        dest.writeInt(this.showBadge ? 1 : 0);
    }

    public /* synthetic */ FeatureTeam(String str, String str2, String str3, String str4, int i13, int i14, String str5, TeamType teamType, int i15, boolean z4, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i13, i14, str5, teamType, i15, (i16 & 512) != 0 ? true : z4);
    }
}
