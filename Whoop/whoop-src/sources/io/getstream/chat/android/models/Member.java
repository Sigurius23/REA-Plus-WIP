package io.getstream.chat.android.models;

import androidx.core.app.NotificationCompat;
import com.whoop.service.network.model.UserState;
import hc3.AbstractC17176i;
import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import java.util.Date;
import java.util.Map;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0010\u000f\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B½\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u0001012\u0006\u00102\u001a\u00020\u0010H\u0016J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00109\u001a\u00020\nHÆ\u0003J\t\u0010:\u001a\u00020\nHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010=\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0015\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0003JÆ\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\t\u0010H\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\t\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010!\u001a\u0004\b)\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006I"}, m65681d2 = {"Lio/getstream/chat/android/models/Member;", "Lio/getstream/chat/android/models/UserEntity;", "Lio/getstream/chat/android/models/CustomObject;", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "createdAt", "Ljava/util/Date;", "updatedAt", "isInvited", "", "inviteAcceptedAt", "inviteRejectedAt", "shadowBanned", "banned", "channelRole", "", "notificationsMuted", NotificationCompat.CATEGORY_STATUS, "banExpires", "pinnedAt", "archivedAt", "extraData", "", "", "<init>", "(Lio/getstream/chat/android/models/User;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInviteAcceptedAt", "getInviteRejectedAt", "getShadowBanned", "()Z", "getBanned", "getChannelRole", "()Ljava/lang/String;", "getNotificationsMuted", "getStatus", "getBanExpires", "getPinnedAt", "getArchivedAt", "getExtraData", "()Ljava/util/Map;", "getComparableField", "", "fieldName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Lio/getstream/chat/android/models/User;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;)Lio/getstream/chat/android/models/Member;", "equals", "other", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class Member implements UserEntity, CustomObject, ComparableFieldProvider {
    private final Date archivedAt;
    private final Date banExpires;
    private final boolean banned;
    private final String channelRole;
    private final Date createdAt;
    private final Map<String, Object> extraData;
    private final Date inviteAcceptedAt;
    private final Date inviteRejectedAt;
    private final Boolean isInvited;
    private final Boolean notificationsMuted;
    private final Date pinnedAt;
    private final boolean shadowBanned;
    private final String status;
    private final Date updatedAt;
    private final User user;

    public Member(User user, Date date, Date date2, Boolean bool, Date date3, Date date4, boolean z4, boolean z13, String str, Boolean bool2, String str2, Date date5, Date date6, Date date7, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.user = user;
        this.createdAt = date;
        this.updatedAt = date2;
        this.isInvited = bool;
        this.inviteAcceptedAt = date3;
        this.inviteRejectedAt = date4;
        this.shadowBanned = z4;
        this.banned = z13;
        this.channelRole = str;
        this.notificationsMuted = bool2;
        this.status = str2;
        this.banExpires = date5;
        this.pinnedAt = date6;
        this.archivedAt = date7;
        this.extraData = extraData;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getNotificationsMuted() {
        return this.notificationsMuted;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Date getBanExpires() {
        return this.banExpires;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Date getPinnedAt() {
        return this.pinnedAt;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Date getArchivedAt() {
        return this.archivedAt;
    }

    public final Map<String, Object> component15() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsInvited() {
        return this.isInvited;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getInviteAcceptedAt() {
        return this.inviteAcceptedAt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getInviteRejectedAt() {
        return this.inviteRejectedAt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShadowBanned() {
        return this.shadowBanned;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getBanned() {
        return this.banned;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getChannelRole() {
        return this.channelRole;
    }

    public final Member copy(User user, Date createdAt, Date updatedAt, Boolean isInvited, Date inviteAcceptedAt, Date inviteRejectedAt, boolean shadowBanned, boolean banned, String channelRole, Boolean notificationsMuted, String status, Date banExpires, Date pinnedAt, Date archivedAt, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new Member(user, createdAt, updatedAt, isInvited, inviteAcceptedAt, inviteRejectedAt, shadowBanned, banned, channelRole, notificationsMuted, status, banExpires, pinnedAt, archivedAt, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Member)) {
            return false;
        }
        Member member = (Member) other;
        return AbstractC22676k.m65745e(this.user, member.user) && AbstractC22676k.m65745e(this.createdAt, member.createdAt) && AbstractC22676k.m65745e(this.updatedAt, member.updatedAt) && AbstractC22676k.m65745e(this.isInvited, member.isInvited) && AbstractC22676k.m65745e(this.inviteAcceptedAt, member.inviteAcceptedAt) && AbstractC22676k.m65745e(this.inviteRejectedAt, member.inviteRejectedAt) && this.shadowBanned == member.shadowBanned && this.banned == member.banned && AbstractC22676k.m65745e(this.channelRole, member.channelRole) && AbstractC22676k.m65745e(this.notificationsMuted, member.notificationsMuted) && AbstractC22676k.m65745e(this.status, member.status) && AbstractC22676k.m65745e(this.banExpires, member.banExpires) && AbstractC22676k.m65745e(this.pinnedAt, member.pinnedAt) && AbstractC22676k.m65745e(this.archivedAt, member.archivedAt) && AbstractC22676k.m65745e(this.extraData, member.extraData);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x0145  */
    /* JADX WARN: Code duplicated, block: B:112:0x0148 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0120, code lost:
    
        return r1.updatedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0127, code lost:
    
        if (r2.equals("shadowBanned") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0130, code lost:
    
        return java.lang.Boolean.valueOf(r1.shadowBanned);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0137, code lost:
    
        if (r2.equals("ban_expires") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x014c, code lost:
    
        return r1.banExpires;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r2.equals("isInvited") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r2.equals("created_at") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r2.equals("notifications_muted") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r2.equals("archived_at") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r2.equals("createdAt") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        return r1.createdAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if (r2.equals("channelRole") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r2.equals("shadow_banned") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (r2.equals("channel_role") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
    
        return r1.channelRole;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        if (r2.equals("archivedAt") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
    
        return r1.archivedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (r2.equals("user_id") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0095, code lost:
    
        if (r2.equals("pinned_at") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009f, code lost:
    
        if (r2.equals("updated_at") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
    
        if (r2.equals("pinnedAt") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00af, code lost:
    
        return r1.pinnedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b6, code lost:
    
        if (r2.equals("is_invited") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bc, code lost:
    
        return r1.isInvited;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c3, code lost:
    
        if (r2.equals("userId") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cb, code lost:
    
        return getUserId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r2.equals("inviteAcceptedAt") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00de, code lost:
    
        if (r2.equals("notificationsMuted") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e3, code lost:
    
        return r1.notificationsMuted;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ea, code lost:
    
        if (r2.equals("invite_rejected_at") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0103, code lost:
    
        if (r2.equals("inviteRejectedAt") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0108, code lost:
    
        return r1.inviteRejectedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x010f, code lost:
    
        if (r2.equals("invite_accepted_at") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0114, code lost:
    
        return r1.inviteAcceptedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x011b, code lost:
    
        if (r2.equals("updatedAt") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r2.equals("banExpires") == false) goto L108;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.getstream.chat.android.models.querysort.ComparableFieldProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Comparable<?> getComparableField(java.lang.String r2) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.models.Member.getComparableField(java.lang.String):java.lang.Comparable");
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public <T> T getExtraValue(String str, T t14) {
        return (T) super.getExtraValue(str, t14);
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

    public final boolean getShadowBanned() {
        return this.shadowBanned;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    @Override // io.getstream.chat.android.models.UserEntity
    public User getUser() {
        return this.user;
    }

    @Override // io.getstream.chat.android.models.UserEntity
    public String getUserId() {
        return super.getUserId();
    }

    public int hashCode() {
        int iHashCode = this.user.hashCode() * 31;
        Date date = this.createdAt;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.updatedAt;
        int iHashCode3 = (iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Boolean bool = this.isInvited;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Date date3 = this.inviteAcceptedAt;
        int iHashCode5 = (iHashCode4 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.inviteRejectedAt;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode5 + (date4 == null ? 0 : date4.hashCode())) * 31, 31, this.shadowBanned), 31, this.banned);
        String str = this.channelRole;
        int iHashCode6 = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.notificationsMuted;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date5 = this.banExpires;
        int iHashCode9 = (iHashCode8 + (date5 == null ? 0 : date5.hashCode())) * 31;
        Date date6 = this.pinnedAt;
        int iHashCode10 = (iHashCode9 + (date6 == null ? 0 : date6.hashCode())) * 31;
        Date date7 = this.archivedAt;
        return this.extraData.hashCode() + ((iHashCode10 + (date7 != null ? date7.hashCode() : 0)) * 31);
    }

    public final Boolean isInvited() {
        return this.isInvited;
    }

    public String toString() {
        User user = this.user;
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        Boolean bool = this.isInvited;
        Date date3 = this.inviteAcceptedAt;
        Date date4 = this.inviteRejectedAt;
        boolean z4 = this.shadowBanned;
        boolean z13 = this.banned;
        String str = this.channelRole;
        Boolean bool2 = this.notificationsMuted;
        String str2 = this.status;
        Date date5 = this.banExpires;
        Date date6 = this.pinnedAt;
        Date date7 = this.archivedAt;
        Map<String, Object> map = this.extraData;
        StringBuilder sb4 = new StringBuilder("Member(user=");
        sb4.append(user);
        sb4.append(", createdAt=");
        sb4.append(date);
        sb4.append(", updatedAt=");
        sb4.append(date2);
        sb4.append(", isInvited=");
        sb4.append(bool);
        sb4.append(", inviteAcceptedAt=");
        AbstractC17176i.m48512n(sb4, date3, ", inviteRejectedAt=", date4, ", shadowBanned=");
        AbstractC38963t7.m124392v(sb4, z4, ", banned=", z13, ", channelRole=");
        AbstractC36095b.m114692t(bool2, str, ", notificationsMuted=", ", status=", sb4);
        AbstractC13673n.m38579z(sb4, str2, ", banExpires=", date5, ", pinnedAt=");
        AbstractC17176i.m48512n(sb4, date6, ", archivedAt=", date7, ", extraData=");
        return AbstractC13673n.m38565l(sb4, map, ")");
    }

    public /* synthetic */ Member(User user, Date date, Date date2, Boolean bool, Date date3, Date date4, boolean z4, boolean z13, String str, Boolean bool2, String str2, Date date5, Date date6, Date date7, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(user, (i13 & 2) != 0 ? null : date, (i13 & 4) != 0 ? null : date2, (i13 & 8) != 0 ? null : bool, (i13 & 16) != 0 ? null : date3, (i13 & 32) != 0 ? null : date4, (i13 & 64) != 0 ? false : z4, (i13 & 128) == 0 ? z13 : false, (i13 & 256) != 0 ? null : str, (i13 & 512) != 0 ? null : bool2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : date5, (i13 & 4096) != 0 ? null : date6, (i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? date7 : null, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? C25272z.f99163w : map);
    }
}
