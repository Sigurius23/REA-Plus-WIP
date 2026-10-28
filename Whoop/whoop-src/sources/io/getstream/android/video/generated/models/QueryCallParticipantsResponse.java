package io.getstream.android.video.generated.models;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import jh3.AbstractC21702c;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u000eHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0003\u0010\r\u001a\u00020\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, m65681d2 = {"Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;", "", AttachmentExtensionsKt.EXTRA_DURATION, "", "totalParticipants", "", QueryChannelRequest.KEY_MEMBERS, "", "Lio/getstream/android/video/generated/models/MemberResponse;", "ownCapabilities", "Lio/getstream/android/video/generated/models/OwnCapability;", "participants", "Lio/getstream/android/video/generated/models/CallParticipantResponse;", NotificationCompat.CATEGORY_CALL, "Lio/getstream/android/video/generated/models/CallResponse;", "membership", "(Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/MemberResponse;)V", "getCall", "()Lio/getstream/android/video/generated/models/CallResponse;", "getDuration", "()Ljava/lang/String;", "getMembers", "()Ljava/util/List;", "getMembership", "()Lio/getstream/android/video/generated/models/MemberResponse;", "getOwnCapabilities", "getParticipants", "getTotalParticipants", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class QueryCallParticipantsResponse {
    private final CallResponse call;
    private final String duration;
    private final List<MemberResponse> members;
    private final MemberResponse membership;
    private final List<OwnCapability> ownCapabilities;
    private final List<CallParticipantResponse> participants;
    private final int totalParticipants;

    /* JADX WARN: Multi-variable type inference failed */
    public QueryCallParticipantsResponse(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "total_participants") int i13, @InterfaceC30731q(name = QueryChannelRequest.KEY_MEMBERS) List<MemberResponse> members, @InterfaceC30731q(name = "own_capabilities") List<? extends OwnCapability> ownCapabilities, @InterfaceC30731q(name = "participants") List<CallParticipantResponse> participants, @InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallResponse call, @InterfaceC30731q(name = "membership") MemberResponse memberResponse) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(participants, "participants");
        AbstractC22676k.m65750j(call, "call");
        this.duration = duration;
        this.totalParticipants = i13;
        this.members = members;
        this.ownCapabilities = ownCapabilities;
        this.participants = participants;
        this.call = call;
        this.membership = memberResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryCallParticipantsResponse copy$default(QueryCallParticipantsResponse queryCallParticipantsResponse, String str, int i13, List list, List list2, List list3, CallResponse callResponse, MemberResponse memberResponse, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = queryCallParticipantsResponse.duration;
        }
        if ((i14 & 2) != 0) {
            i13 = queryCallParticipantsResponse.totalParticipants;
        }
        if ((i14 & 4) != 0) {
            list = queryCallParticipantsResponse.members;
        }
        if ((i14 & 8) != 0) {
            list2 = queryCallParticipantsResponse.ownCapabilities;
        }
        if ((i14 & 16) != 0) {
            list3 = queryCallParticipantsResponse.participants;
        }
        if ((i14 & 32) != 0) {
            callResponse = queryCallParticipantsResponse.call;
        }
        if ((i14 & 64) != 0) {
            memberResponse = queryCallParticipantsResponse.membership;
        }
        CallResponse callResponse2 = callResponse;
        MemberResponse memberResponse2 = memberResponse;
        List list4 = list3;
        List list5 = list;
        return queryCallParticipantsResponse.copy(str, i13, list5, list2, list4, callResponse2, memberResponse2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotalParticipants() {
        return this.totalParticipants;
    }

    public final List<MemberResponse> component3() {
        return this.members;
    }

    public final List<OwnCapability> component4() {
        return this.ownCapabilities;
    }

    public final List<CallParticipantResponse> component5() {
        return this.participants;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CallResponse getCall() {
        return this.call;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final MemberResponse getMembership() {
        return this.membership;
    }

    public final QueryCallParticipantsResponse copy(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "total_participants") int totalParticipants, @InterfaceC30731q(name = QueryChannelRequest.KEY_MEMBERS) List<MemberResponse> members, @InterfaceC30731q(name = "own_capabilities") List<? extends OwnCapability> ownCapabilities, @InterfaceC30731q(name = "participants") List<CallParticipantResponse> participants, @InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallResponse call, @InterfaceC30731q(name = "membership") MemberResponse membership) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(participants, "participants");
        AbstractC22676k.m65750j(call, "call");
        return new QueryCallParticipantsResponse(duration, totalParticipants, members, ownCapabilities, participants, call, membership);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryCallParticipantsResponse)) {
            return false;
        }
        QueryCallParticipantsResponse queryCallParticipantsResponse = (QueryCallParticipantsResponse) other;
        return AbstractC22676k.m65745e(this.duration, queryCallParticipantsResponse.duration) && this.totalParticipants == queryCallParticipantsResponse.totalParticipants && AbstractC22676k.m65745e(this.members, queryCallParticipantsResponse.members) && AbstractC22676k.m65745e(this.ownCapabilities, queryCallParticipantsResponse.ownCapabilities) && AbstractC22676k.m65745e(this.participants, queryCallParticipantsResponse.participants) && AbstractC22676k.m65745e(this.call, queryCallParticipantsResponse.call) && AbstractC22676k.m65745e(this.membership, queryCallParticipantsResponse.membership);
    }

    public final CallResponse getCall() {
        return this.call;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final List<MemberResponse> getMembers() {
        return this.members;
    }

    public final MemberResponse getMembership() {
        return this.membership;
    }

    public final List<OwnCapability> getOwnCapabilities() {
        return this.ownCapabilities;
    }

    public final List<CallParticipantResponse> getParticipants() {
        return this.participants;
    }

    public final int getTotalParticipants() {
        return this.totalParticipants;
    }

    public int hashCode() {
        int iM11818b = AbstractC3855a.m11818b(this.call, AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.totalParticipants, this.duration.hashCode() * 31, 31), 31, this.members), 31, this.ownCapabilities), 31, this.participants), 31);
        MemberResponse memberResponse = this.membership;
        return iM11818b + (memberResponse == null ? 0 : memberResponse.hashCode());
    }

    public String toString() {
        String str = this.duration;
        int i13 = this.totalParticipants;
        List<MemberResponse> list = this.members;
        List<OwnCapability> list2 = this.ownCapabilities;
        List<CallParticipantResponse> list3 = this.participants;
        CallResponse callResponse = this.call;
        MemberResponse memberResponse = this.membership;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "QueryCallParticipantsResponse(duration=", str, ", totalParticipants=", ", members=");
        AbstractC21702c.m61148s(sbM30467u, list, ", ownCapabilities=", list2, ", participants=");
        sbM30467u.append(list3);
        sbM30467u.append(", call=");
        sbM30467u.append(callResponse);
        sbM30467u.append(", membership=");
        sbM30467u.append(memberResponse);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ QueryCallParticipantsResponse(String str, int i13, List list, List list2, List list3, CallResponse callResponse, MemberResponse memberResponse, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        int i15 = i14 & 4;
        C25271y c25271y = C25271y.f99162w;
        this(str, i13, i15 != 0 ? c25271y : list, (i14 & 8) != 0 ? c25271y : list2, (i14 & 16) != 0 ? c25271y : list3, callResponse, (i14 & 64) != 0 ? null : memberResponse);
    }
}
