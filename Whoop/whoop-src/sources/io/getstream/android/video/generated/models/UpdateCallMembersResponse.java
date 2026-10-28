package io.getstream.android.video.generated.models;

import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import m83.C25271y;
import p441qx.InterfaceC30731q;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/android/video/generated/models/UpdateCallMembersResponse;", "", AttachmentExtensionsKt.EXTRA_DURATION, "", QueryChannelRequest.KEY_MEMBERS, "", "Lio/getstream/android/video/generated/models/MemberResponse;", "(Ljava/lang/String;Ljava/util/List;)V", "getDuration", "()Ljava/lang/String;", "getMembers", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class UpdateCallMembersResponse {
    private final String duration;
    private final List<MemberResponse> members;

    public UpdateCallMembersResponse(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = QueryChannelRequest.KEY_MEMBERS) List<MemberResponse> members) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(members, "members");
        this.duration = duration;
        this.members = members;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateCallMembersResponse copy$default(UpdateCallMembersResponse updateCallMembersResponse, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = updateCallMembersResponse.duration;
        }
        if ((i13 & 2) != 0) {
            list = updateCallMembersResponse.members;
        }
        return updateCallMembersResponse.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    public final List<MemberResponse> component2() {
        return this.members;
    }

    public final UpdateCallMembersResponse copy(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = QueryChannelRequest.KEY_MEMBERS) List<MemberResponse> members) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(members, "members");
        return new UpdateCallMembersResponse(duration, members);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateCallMembersResponse)) {
            return false;
        }
        UpdateCallMembersResponse updateCallMembersResponse = (UpdateCallMembersResponse) other;
        return AbstractC22676k.m65745e(this.duration, updateCallMembersResponse.duration) && AbstractC22676k.m65745e(this.members, updateCallMembersResponse.members);
    }

    public final String getDuration() {
        return this.duration;
    }

    public final List<MemberResponse> getMembers() {
        return this.members;
    }

    public int hashCode() {
        return this.members.hashCode() + (this.duration.hashCode() * 31);
    }

    public String toString() {
        return AbstractC36095b.m114679g("UpdateCallMembersResponse(duration=", this.duration, ", members=", ")", this.members);
    }

    public /* synthetic */ UpdateCallMembersResponse(String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C25271y.f99162w : list);
    }
}
