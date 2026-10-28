package io.getstream.chat.android.client.internal.offline.repository.domain.channel.member.internal;

import androidx.core.app.NotificationCompat;
import hc3.AbstractC17176i;
import java.util.Date;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b9\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010A\u001a\u00020\tHÆ\u0003J\t\u0010B\u001a\u00020\tHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00101J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0015\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0015HÆ\u0003JÎ\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020\t2\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010N\u001a\u00020OHÖ\u0001J\t\u0010P\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010$\"\u0004\b%\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\u001a\u0010\f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001a\u0010\r\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0019R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0019R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001fR\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006Q"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;", "", "userId", "", "role", "createdAt", "Ljava/util/Date;", "updatedAt", "isInvited", "", "inviteAcceptedAt", "inviteRejectedAt", "shadowBanned", "banned", "channelRole", "notificationsMuted", NotificationCompat.CATEGORY_STATUS, "banExpires", "pinnedAt", "archivedAt", "extraData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;)V", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "getRole", "setRole", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "getUpdatedAt", "setUpdatedAt", "()Z", "setInvited", "(Z)V", "getInviteAcceptedAt", "setInviteAcceptedAt", "getInviteRejectedAt", "setInviteRejectedAt", "getShadowBanned", "setShadowBanned", "getBanned", "setBanned", "getChannelRole", "getNotificationsMuted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStatus", "getBanExpires", "setBanExpires", "getPinnedAt", "getArchivedAt", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MemberEntity {
    private final Date archivedAt;
    private Date banExpires;
    private boolean banned;
    private final String channelRole;
    private Date createdAt;
    private final Map<String, Object> extraData;
    private Date inviteAcceptedAt;
    private Date inviteRejectedAt;
    private boolean isInvited;
    private final Boolean notificationsMuted;
    private final Date pinnedAt;
    private String role;
    private boolean shadowBanned;
    private final String status;
    private Date updatedAt;
    private String userId;

    public MemberEntity(String userId, String role, Date date, Date date2, boolean z4, Date date3, Date date4, boolean z13, boolean z14, String str, Boolean bool, String str2, Date date5, Date date6, Date date7, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.userId = userId;
        this.role = role;
        this.createdAt = date;
        this.updatedAt = date2;
        this.isInvited = z4;
        this.inviteAcceptedAt = date3;
        this.inviteRejectedAt = date4;
        this.shadowBanned = z13;
        this.banned = z14;
        this.channelRole = str;
        this.notificationsMuted = bool;
        this.status = str2;
        this.banExpires = date5;
        this.pinnedAt = date6;
        this.archivedAt = date7;
        this.extraData = extraData;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getChannelRole() {
        return this.channelRole;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getNotificationsMuted() {
        return this.notificationsMuted;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Date getBanExpires() {
        return this.banExpires;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Date getPinnedAt() {
        return this.pinnedAt;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Date getArchivedAt() {
        return this.archivedAt;
    }

    public final Map<String, Object> component16() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsInvited() {
        return this.isInvited;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getInviteAcceptedAt() {
        return this.inviteAcceptedAt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getInviteRejectedAt() {
        return this.inviteRejectedAt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShadowBanned() {
        return this.shadowBanned;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getBanned() {
        return this.banned;
    }

    public final MemberEntity copy(String userId, String role, Date createdAt, Date updatedAt, boolean isInvited, Date inviteAcceptedAt, Date inviteRejectedAt, boolean shadowBanned, boolean banned, String channelRole, Boolean notificationsMuted, String status, Date banExpires, Date pinnedAt, Date archivedAt, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new MemberEntity(userId, role, createdAt, updatedAt, isInvited, inviteAcceptedAt, inviteRejectedAt, shadowBanned, banned, channelRole, notificationsMuted, status, banExpires, pinnedAt, archivedAt, extraData);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemberEntity)) {
            return false;
        }
        MemberEntity memberEntity = (MemberEntity) other;
        return AbstractC22676k.m65745e(this.userId, memberEntity.userId) && AbstractC22676k.m65745e(this.role, memberEntity.role) && AbstractC22676k.m65745e(this.createdAt, memberEntity.createdAt) && AbstractC22676k.m65745e(this.updatedAt, memberEntity.updatedAt) && this.isInvited == memberEntity.isInvited && AbstractC22676k.m65745e(this.inviteAcceptedAt, memberEntity.inviteAcceptedAt) && AbstractC22676k.m65745e(this.inviteRejectedAt, memberEntity.inviteRejectedAt) && this.shadowBanned == memberEntity.shadowBanned && this.banned == memberEntity.banned && AbstractC22676k.m65745e(this.channelRole, memberEntity.channelRole) && AbstractC22676k.m65745e(this.notificationsMuted, memberEntity.notificationsMuted) && AbstractC22676k.m65745e(this.status, memberEntity.status) && AbstractC22676k.m65745e(this.banExpires, memberEntity.banExpires) && AbstractC22676k.m65745e(this.pinnedAt, memberEntity.pinnedAt) && AbstractC22676k.m65745e(this.archivedAt, memberEntity.archivedAt) && AbstractC22676k.m65745e(this.extraData, memberEntity.extraData);
    }

    public final Date getArchivedAt() {
        return this.archivedAt;
    }

    public final Date getBanExpires() {
        return this.banExpires;
    }

    public final boolean getBanned() {
        return this.banned;
    }

    public final String getChannelRole() {
        return this.channelRole;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final Date getInviteAcceptedAt() {
        return this.inviteAcceptedAt;
    }

    public final Date getInviteRejectedAt() {
        return this.inviteRejectedAt;
    }

    public final Boolean getNotificationsMuted() {
        return this.notificationsMuted;
    }

    public final Date getPinnedAt() {
        return this.pinnedAt;
    }

    public final String getRole() {
        return this.role;
    }

    public final boolean getShadowBanned() {
        return this.shadowBanned;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.userId.hashCode() * 31, 31, this.role);
        Date date = this.createdAt;
        int iHashCode = (iM30450d + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.updatedAt;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31, 31, this.isInvited);
        Date date3 = this.inviteAcceptedAt;
        int iHashCode2 = (iM8289b + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.inviteRejectedAt;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode2 + (date4 == null ? 0 : date4.hashCode())) * 31, 31, this.shadowBanned), 31, this.banned);
        String str = this.channelRole;
        int iHashCode3 = (iM8289b2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.notificationsMuted;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date5 = this.banExpires;
        int iHashCode6 = (iHashCode5 + (date5 == null ? 0 : date5.hashCode())) * 31;
        Date date6 = this.pinnedAt;
        int iHashCode7 = (iHashCode6 + (date6 == null ? 0 : date6.hashCode())) * 31;
        Date date7 = this.archivedAt;
        return this.extraData.hashCode() + ((iHashCode7 + (date7 != null ? date7.hashCode() : 0)) * 31);
    }

    public final boolean isInvited() {
        return this.isInvited;
    }

    public final void setBanExpires(Date date) {
        this.banExpires = date;
    }

    public final void setBanned(boolean z4) {
        this.banned = z4;
    }

    public final void setCreatedAt(Date date) {
        this.createdAt = date;
    }

    public final void setInviteAcceptedAt(Date date) {
        this.inviteAcceptedAt = date;
    }

    public final void setInviteRejectedAt(Date date) {
        this.inviteRejectedAt = date;
    }

    public final void setInvited(boolean z4) {
        this.isInvited = z4;
    }

    public final void setRole(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.role = str;
    }

    public final void setShadowBanned(boolean z4) {
        this.shadowBanned = z4;
    }

    public final void setUpdatedAt(Date date) {
        this.updatedAt = date;
    }

    public final void setUserId(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.userId = str;
    }

    public final String toString() {
        String str = this.userId;
        String str2 = this.role;
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        boolean z4 = this.isInvited;
        Date date3 = this.inviteAcceptedAt;
        Date date4 = this.inviteRejectedAt;
        boolean z13 = this.shadowBanned;
        boolean z14 = this.banned;
        String str3 = this.channelRole;
        Boolean bool = this.notificationsMuted;
        String str4 = this.status;
        Date date5 = this.banExpires;
        Date date6 = this.pinnedAt;
        Date date7 = this.archivedAt;
        Map<String, Object> map = this.extraData;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MemberEntity(userId=", str, ", role=", str2, ", createdAt=");
        AbstractC17176i.m48512n(sbM32001t, date, ", updatedAt=", date2, ", isInvited=");
        sbM32001t.append(z4);
        sbM32001t.append(", inviteAcceptedAt=");
        sbM32001t.append(date3);
        sbM32001t.append(", inviteRejectedAt=");
        sbM32001t.append(date4);
        sbM32001t.append(", shadowBanned=");
        sbM32001t.append(z13);
        sbM32001t.append(", banned=");
        AbstractC38963t7.m124391u(sbM32001t, z14, ", channelRole=", str3, ", notificationsMuted=");
        AbstractC13673n.m38576w(bool, ", status=", str4, ", banExpires=", sbM32001t);
        AbstractC17176i.m48512n(sbM32001t, date5, ", pinnedAt=", date6, ", archivedAt=");
        sbM32001t.append(date7);
        sbM32001t.append(", extraData=");
        sbM32001t.append(map);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ MemberEntity(String str, String str2, Date date, Date date2, boolean z4, Date date3, Date date4, boolean z13, boolean z14, String str3, Boolean bool, String str4, Date date5, Date date6, Date date7, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? null : date, (i13 & 8) != 0 ? null : date2, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? null : date3, (i13 & 64) != 0 ? null : date4, (i13 & 128) != 0 ? false : z13, (i13 & 256) == 0 ? z14 : false, (i13 & 512) != 0 ? null : str3, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : bool, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str4, (i13 & 4096) != 0 ? null : date5, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : date6, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0 ? date7 : null, (i13 & 32768) != 0 ? C25272z.f99163w : map);
    }
}
