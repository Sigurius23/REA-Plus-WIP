package com.whoop.domain.model.teams.share;

import com.whoop.data.remote.domain.dto.community.share.SelectTeamDto;
import com.whoop.profile.domain.ProfileApiKt;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/domain/model/teams/share/SelectTeam;", "", ProfileApiKt.COMMUNITY_ID_PARAM, "", "avatarUrl", "", "name", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getCommunityId", "()I", "getAvatarUrl", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class SelectTeam {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String avatarUrl;
    private final int communityId;
    private final String name;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/model/teams/share/SelectTeam$Companion;", "", "<init>", "()V", "fromDto", "Lcom/whoop/domain/model/teams/share/SelectTeam;", "dto", "Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SelectTeam fromDto(SelectTeamDto dto) {
            AbstractC22676k.m65750j(dto, "dto");
            int id4 = dto.getId();
            String avatar = dto.getAvatar();
            if (avatar == null) {
                avatar = "";
            }
            String name = dto.getName();
            return new SelectTeam(id4, avatar, name != null ? name : "");
        }

        private Companion() {
        }
    }

    public SelectTeam(int i13, String avatarUrl, String name) {
        AbstractC22676k.m65750j(avatarUrl, "avatarUrl");
        AbstractC22676k.m65750j(name, "name");
        this.communityId = i13;
        this.avatarUrl = avatarUrl;
        this.name = name;
    }

    public static /* synthetic */ SelectTeam copy$default(SelectTeam selectTeam, int i13, String str, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = selectTeam.communityId;
        }
        if ((i14 & 2) != 0) {
            str = selectTeam.avatarUrl;
        }
        if ((i14 & 4) != 0) {
            str2 = selectTeam.name;
        }
        return selectTeam.copy(i13, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCommunityId() {
        return this.communityId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final SelectTeam copy(int communityId, String avatarUrl, String name) {
        AbstractC22676k.m65750j(avatarUrl, "avatarUrl");
        AbstractC22676k.m65750j(name, "name");
        return new SelectTeam(communityId, avatarUrl, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectTeam)) {
            return false;
        }
        SelectTeam selectTeam = (SelectTeam) other;
        return this.communityId == selectTeam.communityId && AbstractC22676k.m65745e(this.avatarUrl, selectTeam.avatarUrl) && AbstractC22676k.m65745e(this.name, selectTeam.name);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final int getCommunityId() {
        return this.communityId;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + AbstractC11266d.m30450d(Integer.hashCode(this.communityId) * 31, 31, this.avatarUrl);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.name, ")", AbstractC18489d0.m53373n(this.communityId, "SelectTeam(communityId=", ", avatarUrl=", this.avatarUrl, ", name="));
    }
}
