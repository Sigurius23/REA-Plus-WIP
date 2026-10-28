package io.getstream.chat.android.client.api2.model.dto;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import hc3.AbstractC17176i;
import io.getstream.chat.android.core.internal.StreamHandsOff;
import java.util.Date;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@StreamHandsOff(reason = "Field names can't be changed because [CustomObjectDtoAdapter] class uses reflections to add/remove content of [extraData] map")
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00106\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00108\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003JÊ\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020\b2\b\u0010@\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b#\u0010\u001fR\u0015\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b$\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b'\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006D"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UpstreamMemberDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;", "created_at", "Ljava/util/Date;", "updated_at", "invited", "", "invite_accepted_at", "invite_rejected_at", "shadow_banned", "banned", "channel_role", "", "notifications_muted", NotificationCompat.CATEGORY_STATUS, "ban_expires", "pinned_at", "archived_at", "extraData", "", "", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;)V", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;", "getCreated_at", "()Ljava/util/Date;", "getUpdated_at", "getInvited", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInvite_accepted_at", "getInvite_rejected_at", "getShadow_banned", "getBanned", "getChannel_role", "()Ljava/lang/String;", "getNotifications_muted", "getStatus", "getBan_expires", "getPinned_at", "getArchived_at", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamMemberDto;", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UpstreamMemberDto implements ExtraDataDto {
    private final Date archived_at;
    private final Date ban_expires;
    private final Boolean banned;
    private final String channel_role;
    private final Date created_at;
    private final Map<String, Object> extraData;
    private final Date invite_accepted_at;
    private final Date invite_rejected_at;
    private final Boolean invited;
    private final Boolean notifications_muted;
    private final Date pinned_at;
    private final Boolean shadow_banned;
    private final String status;
    private final Date updated_at;
    private final UpstreamUserDto user;

    public UpstreamMemberDto(UpstreamUserDto user, Date date, Date date2, Boolean bool, Date date3, Date date4, Boolean bool2, Boolean bool3, String str, Boolean bool4, String str2, Date date5, Date date6, Date date7, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.user = user;
        this.created_at = date;
        this.updated_at = date2;
        this.invited = bool;
        this.invite_accepted_at = date3;
        this.invite_rejected_at = date4;
        this.shadow_banned = bool2;
        this.banned = bool3;
        this.channel_role = str;
        this.notifications_muted = bool4;
        this.status = str2;
        this.ban_expires = date5;
        this.pinned_at = date6;
        this.archived_at = date7;
        this.extraData = extraData;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UpstreamUserDto getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getNotifications_muted() {
        return this.notifications_muted;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Date getBan_expires() {
        return this.ban_expires;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Date getPinned_at() {
        return this.pinned_at;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Date getArchived_at() {
        return this.archived_at;
    }

    public final Map<String, Object> component15() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getInvited() {
        return this.invited;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getInvite_accepted_at() {
        return this.invite_accepted_at;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getInvite_rejected_at() {
        return this.invite_rejected_at;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getShadow_banned() {
        return this.shadow_banned;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getBanned() {
        return this.banned;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getChannel_role() {
        return this.channel_role;
    }

    public final UpstreamMemberDto copy(UpstreamUserDto user, Date created_at, Date updated_at, Boolean invited, Date invite_accepted_at, Date invite_rejected_at, Boolean shadow_banned, Boolean banned, String channel_role, Boolean notifications_muted, String status, Date ban_expires, Date pinned_at, Date archived_at, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new UpstreamMemberDto(user, created_at, updated_at, invited, invite_accepted_at, invite_rejected_at, shadow_banned, banned, channel_role, notifications_muted, status, ban_expires, pinned_at, archived_at, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpstreamMemberDto)) {
            return false;
        }
        UpstreamMemberDto upstreamMemberDto = (UpstreamMemberDto) other;
        return AbstractC22676k.m65745e(this.user, upstreamMemberDto.user) && AbstractC22676k.m65745e(this.created_at, upstreamMemberDto.created_at) && AbstractC22676k.m65745e(this.updated_at, upstreamMemberDto.updated_at) && AbstractC22676k.m65745e(this.invited, upstreamMemberDto.invited) && AbstractC22676k.m65745e(this.invite_accepted_at, upstreamMemberDto.invite_accepted_at) && AbstractC22676k.m65745e(this.invite_rejected_at, upstreamMemberDto.invite_rejected_at) && AbstractC22676k.m65745e(this.shadow_banned, upstreamMemberDto.shadow_banned) && AbstractC22676k.m65745e(this.banned, upstreamMemberDto.banned) && AbstractC22676k.m65745e(this.channel_role, upstreamMemberDto.channel_role) && AbstractC22676k.m65745e(this.notifications_muted, upstreamMemberDto.notifications_muted) && AbstractC22676k.m65745e(this.status, upstreamMemberDto.status) && AbstractC22676k.m65745e(this.ban_expires, upstreamMemberDto.ban_expires) && AbstractC22676k.m65745e(this.pinned_at, upstreamMemberDto.pinned_at) && AbstractC22676k.m65745e(this.archived_at, upstreamMemberDto.archived_at) && AbstractC22676k.m65745e(this.extraData, upstreamMemberDto.extraData);
    }

    public final Date getArchived_at() {
        return this.archived_at;
    }

    public final Date getBan_expires() {
        return this.ban_expires;
    }

    public final Boolean getBanned() {
        return this.banned;
    }

    public final String getChannel_role() {
        return this.channel_role;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final Date getInvite_accepted_at() {
        return this.invite_accepted_at;
    }

    public final Date getInvite_rejected_at() {
        return this.invite_rejected_at;
    }

    public final Boolean getInvited() {
        return this.invited;
    }

    public final Boolean getNotifications_muted() {
        return this.notifications_muted;
    }

    public final Date getPinned_at() {
        return this.pinned_at;
    }

    public final Boolean getShadow_banned() {
        return this.shadow_banned;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final UpstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.user.hashCode() * 31;
        Date date = this.created_at;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.updated_at;
        int iHashCode3 = (iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Boolean bool = this.invited;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Date date3 = this.invite_accepted_at;
        int iHashCode5 = (iHashCode4 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.invite_rejected_at;
        int iHashCode6 = (iHashCode5 + (date4 == null ? 0 : date4.hashCode())) * 31;
        Boolean bool2 = this.shadow_banned;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.banned;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.channel_role;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool4 = this.notifications_muted;
        int iHashCode10 = (iHashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date5 = this.ban_expires;
        int iHashCode12 = (iHashCode11 + (date5 == null ? 0 : date5.hashCode())) * 31;
        Date date6 = this.pinned_at;
        int iHashCode13 = (iHashCode12 + (date6 == null ? 0 : date6.hashCode())) * 31;
        Date date7 = this.archived_at;
        return this.extraData.hashCode() + ((iHashCode13 + (date7 != null ? date7.hashCode() : 0)) * 31);
    }

    public String toString() {
        UpstreamUserDto upstreamUserDto = this.user;
        Date date = this.created_at;
        Date date2 = this.updated_at;
        Boolean bool = this.invited;
        Date date3 = this.invite_accepted_at;
        Date date4 = this.invite_rejected_at;
        Boolean bool2 = this.shadow_banned;
        Boolean bool3 = this.banned;
        String str = this.channel_role;
        Boolean bool4 = this.notifications_muted;
        String str2 = this.status;
        Date date5 = this.ban_expires;
        Date date6 = this.pinned_at;
        Date date7 = this.archived_at;
        Map<String, Object> map = this.extraData;
        StringBuilder sb4 = new StringBuilder("UpstreamMemberDto(user=");
        sb4.append(upstreamUserDto);
        sb4.append(", created_at=");
        sb4.append(date);
        sb4.append(", updated_at=");
        sb4.append(date2);
        sb4.append(", invited=");
        sb4.append(bool);
        sb4.append(", invite_accepted_at=");
        AbstractC17176i.m48512n(sb4, date3, ", invite_rejected_at=", date4, ", shadow_banned=");
        AbstractC3855a.m11839w(sb4, bool2, ", banned=", bool3, ", channel_role=");
        AbstractC36095b.m114692t(bool4, str, ", notifications_muted=", ", status=", sb4);
        AbstractC13673n.m38579z(sb4, str2, ", ban_expires=", date5, ", pinned_at=");
        AbstractC17176i.m48512n(sb4, date6, ", archived_at=", date7, ", extraData=");
        return AbstractC13673n.m38565l(sb4, map, ")");
    }

    public /* synthetic */ UpstreamMemberDto(UpstreamUserDto upstreamUserDto, Date date, Date date2, Boolean bool, Date date3, Date date4, Boolean bool2, Boolean bool3, String str, Boolean bool4, String str2, Date date5, Date date6, Date date7, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(upstreamUserDto, date, date2, bool, date3, date4, bool2, (i13 & 128) != 0 ? Boolean.FALSE : bool3, str, bool4, str2, date5, date6, date7, map);
    }
}
