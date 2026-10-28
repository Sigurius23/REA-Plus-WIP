package com.whoop.domain.model.teams;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/domain/model/teams/TeamUser;", "", "id", "", "avatarUrl", "", "fullName", "userName", "privacyProfile", "Lcom/whoop/domain/model/teams/TeamPrivacyProfile;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/teams/TeamPrivacyProfile;)V", "getId", "()I", "getAvatarUrl", "()Ljava/lang/String;", "getFullName", "getUserName", "getPrivacyProfile", "()Lcom/whoop/domain/model/teams/TeamPrivacyProfile;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class TeamUser {
    private final String avatarUrl;
    private final String fullName;
    private final int id;
    private final TeamPrivacyProfile privacyProfile;
    private final String userName;

    public TeamUser(int i13, String str, String fullName, String userName, TeamPrivacyProfile privacyProfile) {
        AbstractC22676k.m65750j(fullName, "fullName");
        AbstractC22676k.m65750j(userName, "userName");
        AbstractC22676k.m65750j(privacyProfile, "privacyProfile");
        this.id = i13;
        this.avatarUrl = str;
        this.fullName = fullName;
        this.userName = userName;
        this.privacyProfile = privacyProfile;
    }

    public static /* synthetic */ TeamUser copy$default(TeamUser teamUser, int i13, String str, String str2, String str3, TeamPrivacyProfile teamPrivacyProfile, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = teamUser.id;
        }
        if ((i14 & 2) != 0) {
            str = teamUser.avatarUrl;
        }
        if ((i14 & 4) != 0) {
            str2 = teamUser.fullName;
        }
        if ((i14 & 8) != 0) {
            str3 = teamUser.userName;
        }
        if ((i14 & 16) != 0) {
            teamPrivacyProfile = teamUser.privacyProfile;
        }
        TeamPrivacyProfile teamPrivacyProfile2 = teamPrivacyProfile;
        String str4 = str2;
        return teamUser.copy(i13, str, str4, str3, teamPrivacyProfile2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TeamPrivacyProfile getPrivacyProfile() {
        return this.privacyProfile;
    }

    public final TeamUser copy(int id4, String avatarUrl, String fullName, String userName, TeamPrivacyProfile privacyProfile) {
        AbstractC22676k.m65750j(fullName, "fullName");
        AbstractC22676k.m65750j(userName, "userName");
        AbstractC22676k.m65750j(privacyProfile, "privacyProfile");
        return new TeamUser(id4, avatarUrl, fullName, userName, privacyProfile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamUser)) {
            return false;
        }
        TeamUser teamUser = (TeamUser) other;
        return this.id == teamUser.id && AbstractC22676k.m65745e(this.avatarUrl, teamUser.avatarUrl) && AbstractC22676k.m65745e(this.fullName, teamUser.fullName) && AbstractC22676k.m65745e(this.userName, teamUser.userName) && AbstractC22676k.m65745e(this.privacyProfile, teamUser.privacyProfile);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final int getId() {
        return this.id;
    }

    public final TeamPrivacyProfile getPrivacyProfile() {
        return this.privacyProfile;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.avatarUrl;
        return this.privacyProfile.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.fullName), 31, this.userName);
    }

    public String toString() {
        int i13 = this.id;
        String str = this.avatarUrl;
        String str2 = this.fullName;
        String str3 = this.userName;
        TeamPrivacyProfile teamPrivacyProfile = this.privacyProfile;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "TeamUser(id=", ", avatarUrl=", str, ", fullName=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", userName=", str3, ", privacyProfile=");
        sbM53373n.append(teamPrivacyProfile);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }
}
