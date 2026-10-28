package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011¨\u0006!"}, m65681d2 = {"Lio/getstream/android/video/generated/models/GetOrCreateCallRequest;", "", "membersLimit", "", "notify", "", "ring", "video", "data", "Lio/getstream/android/video/generated/models/CallRequest;", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/CallRequest;)V", "getData", "()Lio/getstream/android/video/generated/models/CallRequest;", "getMembersLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNotify", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRing", "getVideo", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/CallRequest;)Lio/getstream/android/video/generated/models/GetOrCreateCallRequest;", "equals", "other", "hashCode", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class GetOrCreateCallRequest {
    private final CallRequest data;
    private final Integer membersLimit;
    private final Boolean notify;
    private final Boolean ring;
    private final Boolean video;

    public GetOrCreateCallRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ GetOrCreateCallRequest copy$default(GetOrCreateCallRequest getOrCreateCallRequest, Integer num, Boolean bool, Boolean bool2, Boolean bool3, CallRequest callRequest, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = getOrCreateCallRequest.membersLimit;
        }
        if ((i13 & 2) != 0) {
            bool = getOrCreateCallRequest.notify;
        }
        if ((i13 & 4) != 0) {
            bool2 = getOrCreateCallRequest.ring;
        }
        if ((i13 & 8) != 0) {
            bool3 = getOrCreateCallRequest.video;
        }
        if ((i13 & 16) != 0) {
            callRequest = getOrCreateCallRequest.data;
        }
        CallRequest callRequest2 = callRequest;
        Boolean bool4 = bool2;
        return getOrCreateCallRequest.copy(num, bool, bool4, bool3, callRequest2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getMembersLimit() {
        return this.membersLimit;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getNotify() {
        return this.notify;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getRing() {
        return this.ring;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getVideo() {
        return this.video;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CallRequest getData() {
        return this.data;
    }

    public final GetOrCreateCallRequest copy(@InterfaceC30731q(name = "members_limit") Integer membersLimit, @InterfaceC30731q(name = "notify") Boolean notify, @InterfaceC30731q(name = "ring") Boolean ring, @InterfaceC30731q(name = "video") Boolean video, @InterfaceC30731q(name = "data") CallRequest data) {
        return new GetOrCreateCallRequest(membersLimit, notify, ring, video, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetOrCreateCallRequest)) {
            return false;
        }
        GetOrCreateCallRequest getOrCreateCallRequest = (GetOrCreateCallRequest) other;
        return AbstractC22676k.m65745e(this.membersLimit, getOrCreateCallRequest.membersLimit) && AbstractC22676k.m65745e(this.notify, getOrCreateCallRequest.notify) && AbstractC22676k.m65745e(this.ring, getOrCreateCallRequest.ring) && AbstractC22676k.m65745e(this.video, getOrCreateCallRequest.video) && AbstractC22676k.m65745e(this.data, getOrCreateCallRequest.data);
    }

    public final CallRequest getData() {
        return this.data;
    }

    public final Integer getMembersLimit() {
        return this.membersLimit;
    }

    public final Boolean getNotify() {
        return this.notify;
    }

    public final Boolean getRing() {
        return this.ring;
    }

    public final Boolean getVideo() {
        return this.video;
    }

    public int hashCode() {
        Integer num = this.membersLimit;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.notify;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.ring;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.video;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        CallRequest callRequest = this.data;
        return iHashCode4 + (callRequest != null ? callRequest.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.membersLimit;
        Boolean bool = this.notify;
        Boolean bool2 = this.ring;
        Boolean bool3 = this.video;
        CallRequest callRequest = this.data;
        StringBuilder sb4 = new StringBuilder("GetOrCreateCallRequest(membersLimit=");
        sb4.append(num);
        sb4.append(", notify=");
        sb4.append(bool);
        sb4.append(", ring=");
        AbstractC3855a.m11839w(sb4, bool2, ", video=", bool3, ", data=");
        sb4.append(callRequest);
        sb4.append(")");
        return sb4.toString();
    }

    public GetOrCreateCallRequest(@InterfaceC30731q(name = "members_limit") Integer num, @InterfaceC30731q(name = "notify") Boolean bool, @InterfaceC30731q(name = "ring") Boolean bool2, @InterfaceC30731q(name = "video") Boolean bool3, @InterfaceC30731q(name = "data") CallRequest callRequest) {
        this.membersLimit = num;
        this.notify = bool;
        this.ring = bool2;
        this.video = bool3;
        this.data = callRequest;
    }

    public /* synthetic */ GetOrCreateCallRequest(Integer num, Boolean bool, Boolean bool2, Boolean bool3, CallRequest callRequest, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? null : bool2, (i13 & 8) != 0 ? null : bool3, (i13 & 16) != 0 ? null : callRequest);
    }
}
