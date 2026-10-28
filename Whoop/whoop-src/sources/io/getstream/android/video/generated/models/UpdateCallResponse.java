package io.getstream.android.video.generated.models;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import m83.C25271y;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0003\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006\""}, m65681d2 = {"Lio/getstream/android/video/generated/models/UpdateCallResponse;", "", AttachmentExtensionsKt.EXTRA_DURATION, "", QueryChannelRequest.KEY_MEMBERS, "", "Lio/getstream/android/video/generated/models/MemberResponse;", "ownCapabilities", "Lio/getstream/android/video/generated/models/OwnCapability;", NotificationCompat.CATEGORY_CALL, "Lio/getstream/android/video/generated/models/CallResponse;", "membership", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/MemberResponse;)V", "getCall", "()Lio/getstream/android/video/generated/models/CallResponse;", "getDuration", "()Ljava/lang/String;", "getMembers", "()Ljava/util/List;", "getMembership", "()Lio/getstream/android/video/generated/models/MemberResponse;", "getOwnCapabilities", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class UpdateCallResponse {
    private final CallResponse call;
    private final String duration;
    private final List<MemberResponse> members;
    private final MemberResponse membership;
    private final List<OwnCapability> ownCapabilities;

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateCallResponse(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = QueryChannelRequest.KEY_MEMBERS) List<MemberResponse> members, @InterfaceC30731q(name = "own_capabilities") List<? extends OwnCapability> ownCapabilities, @InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallResponse call, @InterfaceC30731q(name = "membership") MemberResponse memberResponse) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(call, "call");
        this.duration = duration;
        this.members = members;
        this.ownCapabilities = ownCapabilities;
        this.call = call;
        this.membership = memberResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateCallResponse copy$default(UpdateCallResponse updateCallResponse, String str, List list, List list2, CallResponse callResponse, MemberResponse memberResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = updateCallResponse.duration;
        }
        if ((i13 & 2) != 0) {
            list = updateCallResponse.members;
        }
        if ((i13 & 4) != 0) {
            list2 = updateCallResponse.ownCapabilities;
        }
        if ((i13 & 8) != 0) {
            callResponse = updateCallResponse.call;
        }
        if ((i13 & 16) != 0) {
            memberResponse = updateCallResponse.membership;
        }
        MemberResponse memberResponse2 = memberResponse;
        List list3 = list2;
        return updateCallResponse.copy(str, list, list3, callResponse, memberResponse2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    public final List<MemberResponse> component2() {
        return this.members;
    }

    public final List<OwnCapability> component3() {
        return this.ownCapabilities;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CallResponse getCall() {
        return this.call;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MemberResponse getMembership() {
        return this.membership;
    }

    public final UpdateCallResponse copy(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = QueryChannelRequest.KEY_MEMBERS) List<MemberResponse> members, @InterfaceC30731q(name = "own_capabilities") List<? extends OwnCapability> ownCapabilities, @InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallResponse call, @InterfaceC30731q(name = "membership") MemberResponse membership) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(call, "call");
        return new UpdateCallResponse(duration, members, ownCapabilities, call, membership);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateCallResponse)) {
            return false;
        }
        UpdateCallResponse updateCallResponse = (UpdateCallResponse) other;
        return AbstractC22676k.m65745e(this.duration, updateCallResponse.duration) && AbstractC22676k.m65745e(this.members, updateCallResponse.members) && AbstractC22676k.m65745e(this.ownCapabilities, updateCallResponse.ownCapabilities) && AbstractC22676k.m65745e(this.call, updateCallResponse.call) && AbstractC22676k.m65745e(this.membership, updateCallResponse.membership);
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

    public int hashCode() {
        int iM11818b = AbstractC3855a.m11818b(this.call, AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.duration.hashCode() * 31, 31, this.members), 31, this.ownCapabilities), 31);
        MemberResponse memberResponse = this.membership;
        return iM11818b + (memberResponse == null ? 0 : memberResponse.hashCode());
    }

    public String toString() {
        String str = this.duration;
        List<MemberResponse> list = this.members;
        List<OwnCapability> list2 = this.ownCapabilities;
        CallResponse callResponse = this.call;
        MemberResponse memberResponse = this.membership;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("UpdateCallResponse(duration=", str, ", members=", ", ownCapabilities=", list);
        sbM94766o.append(list2);
        sbM94766o.append(", call=");
        sbM94766o.append(callResponse);
        sbM94766o.append(", membership=");
        sbM94766o.append(memberResponse);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UpdateCallResponse(String str, List list, List list2, CallResponse callResponse, MemberResponse memberResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        this(str, i14 != 0 ? c25271y : list, (i13 & 4) != 0 ? c25271y : list2, callResponse, (i13 & 16) != 0 ? null : memberResponse);
    }
}
