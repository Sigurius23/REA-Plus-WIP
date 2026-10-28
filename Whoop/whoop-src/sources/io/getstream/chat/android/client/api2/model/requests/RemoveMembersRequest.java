package io.getstream.chat.android.client.api2.model.requests;

import d13.AbstractC11478a;
import io.getstream.chat.android.client.api2.model.dto.UpstreamMessageDto;
import java.util.List;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J6\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/RemoveMembersRequest;", "", "remove_members", "", "", "message", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;", "skip_push", "", "<init>", "(Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;Ljava/lang/Boolean;)V", "getRemove_members", "()Ljava/util/List;", "getMessage", "()Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;", "getSkip_push", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;Ljava/lang/Boolean;)Lio/getstream/chat/android/client/api2/model/requests/RemoveMembersRequest;", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class RemoveMembersRequest {
    private final UpstreamMessageDto message;
    private final List<String> remove_members;
    private final Boolean skip_push;

    public RemoveMembersRequest(List<String> remove_members, UpstreamMessageDto upstreamMessageDto, Boolean bool) {
        AbstractC22676k.m65750j(remove_members, "remove_members");
        this.remove_members = remove_members;
        this.message = upstreamMessageDto;
        this.skip_push = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RemoveMembersRequest copy$default(RemoveMembersRequest removeMembersRequest, List list, UpstreamMessageDto upstreamMessageDto, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = removeMembersRequest.remove_members;
        }
        if ((i13 & 2) != 0) {
            upstreamMessageDto = removeMembersRequest.message;
        }
        if ((i13 & 4) != 0) {
            bool = removeMembersRequest.skip_push;
        }
        return removeMembersRequest.copy(list, upstreamMessageDto, bool);
    }

    public final List<String> component1() {
        return this.remove_members;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UpstreamMessageDto getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getSkip_push() {
        return this.skip_push;
    }

    public final RemoveMembersRequest copy(List<String> remove_members, UpstreamMessageDto message, Boolean skip_push) {
        AbstractC22676k.m65750j(remove_members, "remove_members");
        return new RemoveMembersRequest(remove_members, message, skip_push);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoveMembersRequest)) {
            return false;
        }
        RemoveMembersRequest removeMembersRequest = (RemoveMembersRequest) other;
        return AbstractC22676k.m65745e(this.remove_members, removeMembersRequest.remove_members) && AbstractC22676k.m65745e(this.message, removeMembersRequest.message) && AbstractC22676k.m65745e(this.skip_push, removeMembersRequest.skip_push);
    }

    public final UpstreamMessageDto getMessage() {
        return this.message;
    }

    public final List<String> getRemove_members() {
        return this.remove_members;
    }

    public final Boolean getSkip_push() {
        return this.skip_push;
    }

    public int hashCode() {
        int iHashCode = this.remove_members.hashCode() * 31;
        UpstreamMessageDto upstreamMessageDto = this.message;
        int iHashCode2 = (iHashCode + (upstreamMessageDto == null ? 0 : upstreamMessageDto.hashCode())) * 31;
        Boolean bool = this.skip_push;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        List<String> list = this.remove_members;
        UpstreamMessageDto upstreamMessageDto = this.message;
        Boolean bool = this.skip_push;
        StringBuilder sb4 = new StringBuilder("RemoveMembersRequest(remove_members=");
        sb4.append(list);
        sb4.append(", message=");
        sb4.append(upstreamMessageDto);
        sb4.append(", skip_push=");
        return AbstractC11478a.m30858j(sb4, bool, ")");
    }
}
