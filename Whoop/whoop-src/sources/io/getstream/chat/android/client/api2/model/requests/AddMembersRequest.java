package io.getstream.chat.android.client.api2.model.requests;

import d13.AbstractC11478a;
import io.getstream.chat.android.client.api2.model.dto.UpstreamMemberDataDto;
import io.getstream.chat.android.client.api2.model.dto.UpstreamMessageDto;
import java.util.Date;
import java.util.List;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013JN\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0013¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/AddMembersRequest;", "", "add_members", "", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMemberDataDto;", "message", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;", "hide_history", "", "hide_history_before", "Ljava/util/Date;", "skip_push", "<init>", "(Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;)V", "getAdd_members", "()Ljava/util/List;", "getMessage", "()Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;", "getHide_history", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHide_history_before", "()Ljava/util/Date;", "getSkip_push", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;)Lio/getstream/chat/android/client/api2/model/requests/AddMembersRequest;", "equals", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AddMembersRequest {
    private final List<UpstreamMemberDataDto> add_members;
    private final Boolean hide_history;
    private final Date hide_history_before;
    private final UpstreamMessageDto message;
    private final Boolean skip_push;

    public AddMembersRequest(List<UpstreamMemberDataDto> add_members, UpstreamMessageDto upstreamMessageDto, Boolean bool, Date date, Boolean bool2) {
        AbstractC22676k.m65750j(add_members, "add_members");
        this.add_members = add_members;
        this.message = upstreamMessageDto;
        this.hide_history = bool;
        this.hide_history_before = date;
        this.skip_push = bool2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddMembersRequest copy$default(AddMembersRequest addMembersRequest, List list, UpstreamMessageDto upstreamMessageDto, Boolean bool, Date date, Boolean bool2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = addMembersRequest.add_members;
        }
        if ((i13 & 2) != 0) {
            upstreamMessageDto = addMembersRequest.message;
        }
        if ((i13 & 4) != 0) {
            bool = addMembersRequest.hide_history;
        }
        if ((i13 & 8) != 0) {
            date = addMembersRequest.hide_history_before;
        }
        if ((i13 & 16) != 0) {
            bool2 = addMembersRequest.skip_push;
        }
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        return addMembersRequest.copy(list, upstreamMessageDto, bool4, date, bool3);
    }

    public final List<UpstreamMemberDataDto> component1() {
        return this.add_members;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UpstreamMessageDto getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getHide_history() {
        return this.hide_history;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getHide_history_before() {
        return this.hide_history_before;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getSkip_push() {
        return this.skip_push;
    }

    public final AddMembersRequest copy(List<UpstreamMemberDataDto> add_members, UpstreamMessageDto message, Boolean hide_history, Date hide_history_before, Boolean skip_push) {
        AbstractC22676k.m65750j(add_members, "add_members");
        return new AddMembersRequest(add_members, message, hide_history, hide_history_before, skip_push);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddMembersRequest)) {
            return false;
        }
        AddMembersRequest addMembersRequest = (AddMembersRequest) other;
        return AbstractC22676k.m65745e(this.add_members, addMembersRequest.add_members) && AbstractC22676k.m65745e(this.message, addMembersRequest.message) && AbstractC22676k.m65745e(this.hide_history, addMembersRequest.hide_history) && AbstractC22676k.m65745e(this.hide_history_before, addMembersRequest.hide_history_before) && AbstractC22676k.m65745e(this.skip_push, addMembersRequest.skip_push);
    }

    public final List<UpstreamMemberDataDto> getAdd_members() {
        return this.add_members;
    }

    public final Boolean getHide_history() {
        return this.hide_history;
    }

    public final Date getHide_history_before() {
        return this.hide_history_before;
    }

    public final UpstreamMessageDto getMessage() {
        return this.message;
    }

    public final Boolean getSkip_push() {
        return this.skip_push;
    }

    public int hashCode() {
        int iHashCode = this.add_members.hashCode() * 31;
        UpstreamMessageDto upstreamMessageDto = this.message;
        int iHashCode2 = (iHashCode + (upstreamMessageDto == null ? 0 : upstreamMessageDto.hashCode())) * 31;
        Boolean bool = this.hide_history;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Date date = this.hide_history_before;
        int iHashCode4 = (iHashCode3 + (date == null ? 0 : date.hashCode())) * 31;
        Boolean bool2 = this.skip_push;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        List<UpstreamMemberDataDto> list = this.add_members;
        UpstreamMessageDto upstreamMessageDto = this.message;
        Boolean bool = this.hide_history;
        Date date = this.hide_history_before;
        Boolean bool2 = this.skip_push;
        StringBuilder sb4 = new StringBuilder("AddMembersRequest(add_members=");
        sb4.append(list);
        sb4.append(", message=");
        sb4.append(upstreamMessageDto);
        sb4.append(", hide_history=");
        sb4.append(bool);
        sb4.append(", hide_history_before=");
        sb4.append(date);
        sb4.append(", skip_push=");
        return AbstractC11478a.m30858j(sb4, bool2, ")");
    }
}
