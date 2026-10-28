package io.getstream.android.video.generated.models;

import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import java.util.List;
import java.util.Map;
import jg3.C21682i;
import m83.C25271y;
import m83.C25272z;
import p000.AbstractC30802r;
import p441qx.InterfaceC30731q;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0018\b\u0003\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJx\u0010\u001f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0018\b\u0003\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0013J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0018R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u001aR'\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u0010\u001e¨\u00065"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallRequest;", "", "", "channelCid", "Ljg3/i;", "startsAt", "team", "", "video", "", "Lio/getstream/android/video/generated/models/MemberRequest;", QueryChannelRequest.KEY_MEMBERS, "", "custom", "Lio/getstream/android/video/generated/models/CallSettingsRequest;", "settingsOverride", "<init>", "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Lio/getstream/android/video/generated/models/CallSettingsRequest;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljg3/i;", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "()Ljava/util/List;", "component6", "()Ljava/util/Map;", "component7", "()Lio/getstream/android/video/generated/models/CallSettingsRequest;", "copy", "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Lio/getstream/android/video/generated/models/CallSettingsRequest;)Lio/getstream/android/video/generated/models/CallRequest;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getChannelCid", "Ljg3/i;", "getStartsAt", "getTeam", "Ljava/lang/Boolean;", "getVideo", "Ljava/util/List;", "getMembers", "Ljava/util/Map;", "getCustom", "Lio/getstream/android/video/generated/models/CallSettingsRequest;", "getSettingsOverride", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallRequest {
    private final String channelCid;
    private final Map<String, Object> custom;
    private final List<MemberRequest> members;
    private final CallSettingsRequest settingsOverride;
    private final C21682i startsAt;
    private final String team;
    private final Boolean video;

    public CallRequest() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallRequest copy$default(CallRequest callRequest, String str, C21682i c21682i, String str2, Boolean bool, List list, Map map, CallSettingsRequest callSettingsRequest, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = callRequest.channelCid;
        }
        if ((i13 & 2) != 0) {
            c21682i = callRequest.startsAt;
        }
        if ((i13 & 4) != 0) {
            str2 = callRequest.team;
        }
        if ((i13 & 8) != 0) {
            bool = callRequest.video;
        }
        if ((i13 & 16) != 0) {
            list = callRequest.members;
        }
        if ((i13 & 32) != 0) {
            map = callRequest.custom;
        }
        if ((i13 & 64) != 0) {
            callSettingsRequest = callRequest.settingsOverride;
        }
        Map map2 = map;
        CallSettingsRequest callSettingsRequest2 = callSettingsRequest;
        List list2 = list;
        String str3 = str2;
        return callRequest.copy(str, c21682i, str3, bool, list2, map2, callSettingsRequest2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelCid() {
        return this.channelCid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C21682i getStartsAt() {
        return this.startsAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTeam() {
        return this.team;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getVideo() {
        return this.video;
    }

    public final List<MemberRequest> component5() {
        return this.members;
    }

    public final Map<String, Object> component6() {
        return this.custom;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CallSettingsRequest getSettingsOverride() {
        return this.settingsOverride;
    }

    public final CallRequest copy(@InterfaceC30731q(name = "channel_cid") String channelCid, @InterfaceC30731q(name = "starts_at") C21682i startsAt, @InterfaceC30731q(name = "team") String team, @InterfaceC30731q(name = "video") Boolean video, @InterfaceC30731q(name = QueryChannelRequest.KEY_MEMBERS) List<MemberRequest> members, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom, @InterfaceC30731q(name = "settings_override") CallSettingsRequest settingsOverride) {
        return new CallRequest(channelCid, startsAt, team, video, members, custom, settingsOverride);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallRequest)) {
            return false;
        }
        CallRequest callRequest = (CallRequest) other;
        return AbstractC22676k.m65745e(this.channelCid, callRequest.channelCid) && AbstractC22676k.m65745e(this.startsAt, callRequest.startsAt) && AbstractC22676k.m65745e(this.team, callRequest.team) && AbstractC22676k.m65745e(this.video, callRequest.video) && AbstractC22676k.m65745e(this.members, callRequest.members) && AbstractC22676k.m65745e(this.custom, callRequest.custom) && AbstractC22676k.m65745e(this.settingsOverride, callRequest.settingsOverride);
    }

    public final String getChannelCid() {
        return this.channelCid;
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public final List<MemberRequest> getMembers() {
        return this.members;
    }

    public final CallSettingsRequest getSettingsOverride() {
        return this.settingsOverride;
    }

    public final C21682i getStartsAt() {
        return this.startsAt;
    }

    public final String getTeam() {
        return this.team;
    }

    public final Boolean getVideo() {
        return this.video;
    }

    public int hashCode() {
        String str = this.channelCid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C21682i c21682i = this.startsAt;
        int iHashCode2 = (iHashCode + (c21682i == null ? 0 : c21682i.hashCode())) * 31;
        String str2 = this.team;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.video;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<MemberRequest> list = this.members;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, Object> map = this.custom;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        CallSettingsRequest callSettingsRequest = this.settingsOverride;
        return iHashCode6 + (callSettingsRequest != null ? callSettingsRequest.hashCode() : 0);
    }

    public String toString() {
        String str = this.channelCid;
        C21682i c21682i = this.startsAt;
        String str2 = this.team;
        Boolean bool = this.video;
        List<MemberRequest> list = this.members;
        Map<String, Object> map = this.custom;
        CallSettingsRequest callSettingsRequest = this.settingsOverride;
        StringBuilder sbM94767p = AbstractC30802r.m94767p("CallRequest(channelCid=", c21682i, str, ", startsAt=", ", team=");
        AbstractC36095b.m114692t(bool, str2, ", video=", ", members=", sbM94767p);
        sbM94767p.append(list);
        sbM94767p.append(", custom=");
        sbM94767p.append(map);
        sbM94767p.append(", settingsOverride=");
        sbM94767p.append(callSettingsRequest);
        sbM94767p.append(")");
        return sbM94767p.toString();
    }

    public CallRequest(@InterfaceC30731q(name = "channel_cid") String str, @InterfaceC30731q(name = "starts_at") C21682i c21682i, @InterfaceC30731q(name = "team") String str2, @InterfaceC30731q(name = "video") Boolean bool, @InterfaceC30731q(name = QueryChannelRequest.KEY_MEMBERS) List<MemberRequest> list, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> map, @InterfaceC30731q(name = "settings_override") CallSettingsRequest callSettingsRequest) {
        this.channelCid = str;
        this.startsAt = c21682i;
        this.team = str2;
        this.video = bool;
        this.members = list;
        this.custom = map;
        this.settingsOverride = callSettingsRequest;
    }

    public /* synthetic */ CallRequest(String str, C21682i c21682i, String str2, Boolean bool, List list, Map map, CallSettingsRequest callSettingsRequest, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : c21682i, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : bool, (i13 & 16) != 0 ? C25271y.f99162w : list, (i13 & 32) != 0 ? C25272z.f99163w : map, (i13 & 64) != 0 ? null : callSettingsRequest);
    }
}
