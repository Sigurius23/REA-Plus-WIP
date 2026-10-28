package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import java.util.Map;
import jg3.C21682i;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b8\b\u0086\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u0018\b\u0003\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b+\u0010\u001aJ \u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010\u001eJ\u0012\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b-\u0010 JÌ\u0001\u0010.\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0018\b\u0003\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00042\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b0\u0010\u001aJ\u0010\u00101\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u00020\u00122\b\u00103\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u001cR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010 R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b>\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\bA\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\bB\u0010\u001aR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bC\u0010\u001aR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\bD\u0010\u001cR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bF\u0010*R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\bG\u0010\u001aR'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\bH\u0010\u001eR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010:\u001a\u0004\bI\u0010 ¨\u0006J"}, m65681d2 = {"Lio/getstream/android/video/generated/models/UserUnbannedEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "Ljg3/i;", "createdAt", "", "", "", "custom", "Lio/getstream/android/video/generated/models/UserResponseCommonFields;", UserState.Sources.USER, "type", "channelId", "", "channelMemberCount", "channelMessageCount", "channelType", "cid", "receivedAt", "", "shadow", "team", "channelCustom", "createdBy", "<init>", "(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;)V", "getEventType", "()Ljava/lang/String;", "component1", "()Ljg3/i;", "component2", "()Ljava/util/Map;", "component3", "()Lio/getstream/android/video/generated/models/UserResponseCommonFields;", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "component10", "component11", "()Ljava/lang/Boolean;", "component12", "component13", "component14", "copy", "(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;)Lio/getstream/android/video/generated/models/UserUnbannedEvent;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljg3/i;", "getCreatedAt", "Ljava/util/Map;", "getCustom", "Lio/getstream/android/video/generated/models/UserResponseCommonFields;", "getUser", "Ljava/lang/String;", "getType", "getChannelId", "Ljava/lang/Integer;", "getChannelMemberCount", "getChannelMessageCount", "getChannelType", "getCid", "getReceivedAt", "Ljava/lang/Boolean;", "getShadow", "getTeam", "getChannelCustom", "getCreatedBy", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class UserUnbannedEvent extends VideoEvent {
    private final Map<String, Object> channelCustom;
    private final String channelId;
    private final Integer channelMemberCount;
    private final Integer channelMessageCount;
    private final String channelType;
    private final String cid;
    private final C21682i createdAt;
    private final UserResponseCommonFields createdBy;
    private final Map<String, Object> custom;
    private final C21682i receivedAt;
    private final Boolean shadow;
    private final String team;
    private final String type;
    private final UserResponseCommonFields user;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UserUnbannedEvent(C21682i c21682i, Map map, UserResponseCommonFields userResponseCommonFields, String str, String str2, Integer num, Integer num2, String str3, String str4, C21682i c21682i2, Boolean bool, String str5, Map map2, UserResponseCommonFields userResponseCommonFields2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 2;
        C25272z c25272z = C25272z.f99163w;
        this(c21682i, i14 != 0 ? c25272z : map, userResponseCommonFields, str, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? null : num, (i13 & 64) != 0 ? null : num2, (i13 & 128) != 0 ? null : str3, (i13 & 256) != 0 ? null : str4, (i13 & 512) != 0 ? null : c21682i2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : bool, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str5, (i13 & 4096) != 0 ? c25272z : map2, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : userResponseCommonFields2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final C21682i getReceivedAt() {
        return this.receivedAt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getShadow() {
        return this.shadow;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTeam() {
        return this.team;
    }

    public final Map<String, Object> component13() {
        return this.channelCustom;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final UserResponseCommonFields getCreatedBy() {
        return this.createdBy;
    }

    public final Map<String, Object> component2() {
        return this.custom;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UserResponseCommonFields getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getChannelMemberCount() {
        return this.channelMemberCount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getChannelMessageCount() {
        return this.channelMessageCount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    public final UserUnbannedEvent copy(@InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom, @InterfaceC30731q(name = UserState.Sources.USER) UserResponseCommonFields user, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "channel_id") String channelId, @InterfaceC30731q(name = "channel_member_count") Integer channelMemberCount, @InterfaceC30731q(name = "channel_message_count") Integer channelMessageCount, @InterfaceC30731q(name = "channel_type") String channelType, @InterfaceC30731q(name = "cid") String cid, @InterfaceC30731q(name = "received_at") C21682i receivedAt, @InterfaceC30731q(name = "shadow") Boolean shadow, @InterfaceC30731q(name = "team") String team, @InterfaceC30731q(name = "channel_custom") Map<String, ? extends Object> channelCustom, @InterfaceC30731q(name = "created_by") UserResponseCommonFields createdBy) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(custom, "custom");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(type, "type");
        return new UserUnbannedEvent(createdAt, custom, user, type, channelId, channelMemberCount, channelMessageCount, channelType, cid, receivedAt, shadow, team, channelCustom, createdBy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserUnbannedEvent)) {
            return false;
        }
        UserUnbannedEvent userUnbannedEvent = (UserUnbannedEvent) other;
        return AbstractC22676k.m65745e(this.createdAt, userUnbannedEvent.createdAt) && AbstractC22676k.m65745e(this.custom, userUnbannedEvent.custom) && AbstractC22676k.m65745e(this.user, userUnbannedEvent.user) && AbstractC22676k.m65745e(this.type, userUnbannedEvent.type) && AbstractC22676k.m65745e(this.channelId, userUnbannedEvent.channelId) && AbstractC22676k.m65745e(this.channelMemberCount, userUnbannedEvent.channelMemberCount) && AbstractC22676k.m65745e(this.channelMessageCount, userUnbannedEvent.channelMessageCount) && AbstractC22676k.m65745e(this.channelType, userUnbannedEvent.channelType) && AbstractC22676k.m65745e(this.cid, userUnbannedEvent.cid) && AbstractC22676k.m65745e(this.receivedAt, userUnbannedEvent.receivedAt) && AbstractC22676k.m65745e(this.shadow, userUnbannedEvent.shadow) && AbstractC22676k.m65745e(this.team, userUnbannedEvent.team) && AbstractC22676k.m65745e(this.channelCustom, userUnbannedEvent.channelCustom) && AbstractC22676k.m65745e(this.createdBy, userUnbannedEvent.createdBy);
    }

    public final Map<String, Object> getChannelCustom() {
        return this.channelCustom;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final Integer getChannelMemberCount() {
        return this.channelMemberCount;
    }

    public final Integer getChannelMessageCount() {
        return this.channelMessageCount;
    }

    public final String getChannelType() {
        return this.channelType;
    }

    public final String getCid() {
        return this.cid;
    }

    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    public final UserResponseCommonFields getCreatedBy() {
        return this.createdBy;
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    @Override // io.getstream.android.video.generated.models.VideoEvent
    /* JADX INFO: renamed from: getEventType */
    public String getType() {
        return this.type;
    }

    public final C21682i getReceivedAt() {
        return this.receivedAt;
    }

    public final Boolean getShadow() {
        return this.shadow;
    }

    public final String getTeam() {
        return this.team;
    }

    public final String getType() {
        return this.type;
    }

    public final UserResponseCommonFields getUser() {
        return this.user;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.user.hashCode() + AbstractC3855a.m11821e(this.custom, this.createdAt.hashCode() * 31, 31)) * 31, 31, this.type);
        String str = this.channelId;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.channelMemberCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.channelMessageCount;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.channelType;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cid;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C21682i c21682i = this.receivedAt;
        int iHashCode6 = (iHashCode5 + (c21682i == null ? 0 : c21682i.hashCode())) * 31;
        Boolean bool = this.shadow;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.team;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, Object> map = this.channelCustom;
        int iHashCode9 = (iHashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        UserResponseCommonFields userResponseCommonFields = this.createdBy;
        return iHashCode9 + (userResponseCommonFields != null ? userResponseCommonFields.hashCode() : 0);
    }

    public String toString() {
        C21682i c21682i = this.createdAt;
        Map<String, Object> map = this.custom;
        UserResponseCommonFields userResponseCommonFields = this.user;
        String str = this.type;
        String str2 = this.channelId;
        Integer num = this.channelMemberCount;
        Integer num2 = this.channelMessageCount;
        String str3 = this.channelType;
        String str4 = this.cid;
        C21682i c21682i2 = this.receivedAt;
        Boolean bool = this.shadow;
        String str5 = this.team;
        Map<String, Object> map2 = this.channelCustom;
        UserResponseCommonFields userResponseCommonFields2 = this.createdBy;
        StringBuilder sb4 = new StringBuilder("UserUnbannedEvent(createdAt=");
        sb4.append(c21682i);
        sb4.append(", custom=");
        sb4.append(map);
        sb4.append(", user=");
        sb4.append(userResponseCommonFields);
        sb4.append(", type=");
        sb4.append(str);
        sb4.append(", channelId=");
        AbstractC30007c.m91853w(num, str2, ", channelMemberCount=", ", channelMessageCount=", sb4);
        AbstractC13673n.m38577x(num2, ", channelType=", str3, ", cid=", sb4);
        sb4.append(str4);
        sb4.append(", receivedAt=");
        sb4.append(c21682i2);
        sb4.append(", shadow=");
        AbstractC13673n.m38576w(bool, ", team=", str5, ", channelCustom=", sb4);
        sb4.append(map2);
        sb4.append(", createdBy=");
        sb4.append(userResponseCommonFields2);
        sb4.append(")");
        return sb4.toString();
    }

    public UserUnbannedEvent(@InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom, @InterfaceC30731q(name = UserState.Sources.USER) UserResponseCommonFields user, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "channel_id") String str, @InterfaceC30731q(name = "channel_member_count") Integer num, @InterfaceC30731q(name = "channel_message_count") Integer num2, @InterfaceC30731q(name = "channel_type") String str2, @InterfaceC30731q(name = "cid") String str3, @InterfaceC30731q(name = "received_at") C21682i c21682i, @InterfaceC30731q(name = "shadow") Boolean bool, @InterfaceC30731q(name = "team") String str4, @InterfaceC30731q(name = "channel_custom") Map<String, ? extends Object> map, @InterfaceC30731q(name = "created_by") UserResponseCommonFields userResponseCommonFields) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(custom, "custom");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(type, "type");
        this.createdAt = createdAt;
        this.custom = custom;
        this.user = user;
        this.type = type;
        this.channelId = str;
        this.channelMemberCount = num;
        this.channelMessageCount = num2;
        this.channelType = str2;
        this.cid = str3;
        this.receivedAt = c21682i;
        this.shadow = bool;
        this.team = str4;
        this.channelCustom = map;
        this.createdBy = userResponseCommonFields;
    }
}
