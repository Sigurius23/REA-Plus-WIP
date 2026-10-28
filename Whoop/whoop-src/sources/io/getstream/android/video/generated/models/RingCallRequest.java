package io.getstream.android.video.generated.models;

import java.util.List;
import m83.C25271y;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RingCallRequest;", "", "video", "", "membersIds", "", "", "(Ljava/lang/Boolean;Ljava/util/List;)V", "getMembersIds", "()Ljava/util/List;", "getVideo", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/util/List;)Lio/getstream/android/video/generated/models/RingCallRequest;", "equals", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class RingCallRequest {
    private final List<String> membersIds;
    private final Boolean video;

    /* JADX WARN: Multi-variable type inference failed */
    public RingCallRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RingCallRequest copy$default(RingCallRequest ringCallRequest, Boolean bool, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = ringCallRequest.video;
        }
        if ((i13 & 2) != 0) {
            list = ringCallRequest.membersIds;
        }
        return ringCallRequest.copy(bool, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getVideo() {
        return this.video;
    }

    public final List<String> component2() {
        return this.membersIds;
    }

    public final RingCallRequest copy(@InterfaceC30731q(name = "video") Boolean video, @InterfaceC30731q(name = "members_ids") List<String> membersIds) {
        return new RingCallRequest(video, membersIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RingCallRequest)) {
            return false;
        }
        RingCallRequest ringCallRequest = (RingCallRequest) other;
        return AbstractC22676k.m65745e(this.video, ringCallRequest.video) && AbstractC22676k.m65745e(this.membersIds, ringCallRequest.membersIds);
    }

    public final List<String> getMembersIds() {
        return this.membersIds;
    }

    public final Boolean getVideo() {
        return this.video;
    }

    public int hashCode() {
        Boolean bool = this.video;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<String> list = this.membersIds;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "RingCallRequest(video=" + this.video + ", membersIds=" + this.membersIds + ")";
    }

    public RingCallRequest(@InterfaceC30731q(name = "video") Boolean bool, @InterfaceC30731q(name = "members_ids") List<String> list) {
        this.video = bool;
        this.membersIds = list;
    }

    public /* synthetic */ RingCallRequest(Boolean bool, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? C25271y.f99162w : list);
    }
}
