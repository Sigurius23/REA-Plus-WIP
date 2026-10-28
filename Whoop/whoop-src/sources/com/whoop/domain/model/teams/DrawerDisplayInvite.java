package com.whoop.domain.model.teams;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.whoop.profile.domain.ProfileApiKt;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u000fJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018Jb\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0018J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b-\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b.\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b/\u0010\u000fR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b0\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b1\u0010\u0018¨\u00062"}, m65681d2 = {"Lcom/whoop/domain/model/teams/DrawerDisplayInvite;", "Landroid/os/Parcelable;", "", "id", "", NotificationCompat.CATEGORY_STATUS, ProfileApiKt.COMMUNITY_ID_PARAM, "communityName", "communityIconUrl", "senderId", "senderUsername", "inviteCode", "<init>", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/whoop/domain/model/teams/DrawerDisplayInvite;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getStatus", "getCommunityId", "getCommunityName", "getCommunityIconUrl", "getSenderId", "getSenderUsername", "getInviteCode", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class DrawerDisplayInvite implements Parcelable {
    public static final Parcelable.Creator<DrawerDisplayInvite> CREATOR = new Creator();
    private final String communityIconUrl;
    private final int communityId;
    private final String communityName;
    private final int id;
    private final String inviteCode;
    private final int senderId;
    private final String senderUsername;
    private final String status;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<DrawerDisplayInvite> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DrawerDisplayInvite createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new DrawerDisplayInvite(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DrawerDisplayInvite[] newArray(int i13) {
            return new DrawerDisplayInvite[i13];
        }
    }

    public DrawerDisplayInvite(int i13, String status, int i14, String communityName, String communityIconUrl, int i15, String senderUsername, String str) {
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(communityName, "communityName");
        AbstractC22676k.m65750j(communityIconUrl, "communityIconUrl");
        AbstractC22676k.m65750j(senderUsername, "senderUsername");
        this.id = i13;
        this.status = status;
        this.communityId = i14;
        this.communityName = communityName;
        this.communityIconUrl = communityIconUrl;
        this.senderId = i15;
        this.senderUsername = senderUsername;
        this.inviteCode = str;
    }

    public static /* synthetic */ DrawerDisplayInvite copy$default(DrawerDisplayInvite drawerDisplayInvite, int i13, String str, int i14, String str2, String str3, int i15, String str4, String str5, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i13 = drawerDisplayInvite.id;
        }
        if ((i16 & 2) != 0) {
            str = drawerDisplayInvite.status;
        }
        if ((i16 & 4) != 0) {
            i14 = drawerDisplayInvite.communityId;
        }
        if ((i16 & 8) != 0) {
            str2 = drawerDisplayInvite.communityName;
        }
        if ((i16 & 16) != 0) {
            str3 = drawerDisplayInvite.communityIconUrl;
        }
        if ((i16 & 32) != 0) {
            i15 = drawerDisplayInvite.senderId;
        }
        if ((i16 & 64) != 0) {
            str4 = drawerDisplayInvite.senderUsername;
        }
        if ((i16 & 128) != 0) {
            str5 = drawerDisplayInvite.inviteCode;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        int i17 = i15;
        return drawerDisplayInvite.copy(i13, str, i14, str2, str8, i17, str6, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCommunityId() {
        return this.communityId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCommunityName() {
        return this.communityName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCommunityIconUrl() {
        return this.communityIconUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getSenderId() {
        return this.senderId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSenderUsername() {
        return this.senderUsername;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getInviteCode() {
        return this.inviteCode;
    }

    public final DrawerDisplayInvite copy(int id4, String status, int communityId, String communityName, String communityIconUrl, int senderId, String senderUsername, String inviteCode) {
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(communityName, "communityName");
        AbstractC22676k.m65750j(communityIconUrl, "communityIconUrl");
        AbstractC22676k.m65750j(senderUsername, "senderUsername");
        return new DrawerDisplayInvite(id4, status, communityId, communityName, communityIconUrl, senderId, senderUsername, inviteCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawerDisplayInvite)) {
            return false;
        }
        DrawerDisplayInvite drawerDisplayInvite = (DrawerDisplayInvite) other;
        return this.id == drawerDisplayInvite.id && AbstractC22676k.m65745e(this.status, drawerDisplayInvite.status) && this.communityId == drawerDisplayInvite.communityId && AbstractC22676k.m65745e(this.communityName, drawerDisplayInvite.communityName) && AbstractC22676k.m65745e(this.communityIconUrl, drawerDisplayInvite.communityIconUrl) && this.senderId == drawerDisplayInvite.senderId && AbstractC22676k.m65745e(this.senderUsername, drawerDisplayInvite.senderUsername) && AbstractC22676k.m65745e(this.inviteCode, drawerDisplayInvite.inviteCode);
    }

    public final String getCommunityIconUrl() {
        return this.communityIconUrl;
    }

    public final int getCommunityId() {
        return this.communityId;
    }

    public final String getCommunityName() {
        return this.communityName;
    }

    public final int getId() {
        return this.id;
    }

    public final String getInviteCode() {
        return this.inviteCode;
    }

    public final int getSenderId() {
        return this.senderId;
    }

    public final String getSenderUsername() {
        return this.senderUsername;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.senderId, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.communityId, AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.status), 31), 31, this.communityName), 31, this.communityIconUrl), 31), 31, this.senderUsername);
        String str = this.inviteCode;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i13 = this.id;
        String str = this.status;
        int i14 = this.communityId;
        String str2 = this.communityName;
        String str3 = this.communityIconUrl;
        int i15 = this.senderId;
        String str4 = this.senderUsername;
        String str5 = this.inviteCode;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "DrawerDisplayInvite(id=", ", status=", str, ", communityId=");
        AbstractC11895b.m31979B(i14, ", communityName=", str2, ", communityIconUrl=", sbM53373n);
        AbstractC11266d.m30470x(i15, str3, ", senderId=", ", senderUsername=", sbM53373n);
        return AbstractC11266d.m30464r(sbM53373n, str4, ", inviteCode=", str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.status);
        dest.writeInt(this.communityId);
        dest.writeString(this.communityName);
        dest.writeString(this.communityIconUrl);
        dest.writeInt(this.senderId);
        dest.writeString(this.senderUsername);
        dest.writeString(this.inviteCode);
    }
}
