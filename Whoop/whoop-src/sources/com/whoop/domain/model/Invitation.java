package com.whoop.domain.model;

import ge3.AbstractC15751g;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/domain/model/Invitation;", "", "inviteCode", "", "type", "Lcom/whoop/domain/model/Invitation$Type;", "teamName", "teamIcon", "<init>", "(Ljava/lang/String;Lcom/whoop/domain/model/Invitation$Type;Ljava/lang/String;Ljava/lang/String;)V", "getInviteCode", "()Ljava/lang/String;", "getType", "()Lcom/whoop/domain/model/Invitation$Type;", "getTeamName", "getTeamIcon", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Type", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class Invitation {
    private final String inviteCode;
    private final String teamIcon;
    private final String teamName;
    private final Type type;

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/domain/model/Invitation$Type;", "", "<init>", "(Ljava/lang/String;I)V", "USER", "STAFF", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum Type {
        USER,
        STAFF;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    public Invitation(String inviteCode, Type type, String str, String str2) {
        AbstractC22676k.m65750j(inviteCode, "inviteCode");
        AbstractC22676k.m65750j(type, "type");
        this.inviteCode = inviteCode;
        this.type = type;
        this.teamName = str;
        this.teamIcon = str2;
    }

    public static /* synthetic */ Invitation copy$default(Invitation invitation, String str, Type type, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = invitation.inviteCode;
        }
        if ((i13 & 2) != 0) {
            type = invitation.type;
        }
        if ((i13 & 4) != 0) {
            str2 = invitation.teamName;
        }
        if ((i13 & 8) != 0) {
            str3 = invitation.teamIcon;
        }
        return invitation.copy(str, type, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInviteCode() {
        return this.inviteCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTeamName() {
        return this.teamName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTeamIcon() {
        return this.teamIcon;
    }

    public final Invitation copy(String inviteCode, Type type, String teamName, String teamIcon) {
        AbstractC22676k.m65750j(inviteCode, "inviteCode");
        AbstractC22676k.m65750j(type, "type");
        return new Invitation(inviteCode, type, teamName, teamIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Invitation)) {
            return false;
        }
        Invitation invitation = (Invitation) other;
        return AbstractC22676k.m65745e(this.inviteCode, invitation.inviteCode) && this.type == invitation.type && AbstractC22676k.m65745e(this.teamName, invitation.teamName) && AbstractC22676k.m65745e(this.teamIcon, invitation.teamIcon);
    }

    public final String getInviteCode() {
        return this.inviteCode;
    }

    public final String getTeamIcon() {
        return this.teamIcon;
    }

    public final String getTeamName() {
        return this.teamName;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + (this.inviteCode.hashCode() * 31)) * 31;
        String str = this.teamName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.teamIcon;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.inviteCode;
        Type type = this.type;
        String str2 = this.teamName;
        String str3 = this.teamIcon;
        StringBuilder sb4 = new StringBuilder("Invitation(inviteCode=");
        sb4.append(str);
        sb4.append(", type=");
        sb4.append(type);
        sb4.append(", teamName=");
        return AbstractC11266d.m30464r(sb4, str2, ", teamIcon=", str3, ")");
    }

    public /* synthetic */ Invitation(String str, Type type, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, type, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3);
    }
}
