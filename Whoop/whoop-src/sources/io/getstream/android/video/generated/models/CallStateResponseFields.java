package io.getstream.android.video.generated.models;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import java.util.List;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallStateResponseFields;", "", QueryChannelRequest.KEY_MEMBERS, "", "Lio/getstream/android/video/generated/models/MemberResponse;", "ownCapabilities", "Lio/getstream/android/video/generated/models/OwnCapability;", NotificationCompat.CATEGORY_CALL, "Lio/getstream/android/video/generated/models/CallResponse;", "membership", "(Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/MemberResponse;)V", "getCall", "()Lio/getstream/android/video/generated/models/CallResponse;", "getMembers", "()Ljava/util/List;", "getMembership", "()Lio/getstream/android/video/generated/models/MemberResponse;", "getOwnCapabilities", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallStateResponseFields {
    private final CallResponse call;
    private final List<MemberResponse> members;
    private final MemberResponse membership;
    private final List<OwnCapability> ownCapabilities;

    /* JADX WARN: Multi-variable type inference failed */
    public CallStateResponseFields(@InterfaceC30731q(name = QueryChannelRequest.KEY_MEMBERS) List<MemberResponse> members, @InterfaceC30731q(name = "own_capabilities") List<? extends OwnCapability> ownCapabilities, @InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallResponse call, @InterfaceC30731q(name = "membership") MemberResponse memberResponse) {
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(call, "call");
        this.members = members;
        this.ownCapabilities = ownCapabilities;
        this.call = call;
        this.membership = memberResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallStateResponseFields copy$default(CallStateResponseFields callStateResponseFields, List list, List list2, CallResponse callResponse, MemberResponse memberResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = callStateResponseFields.members;
        }
        if ((i13 & 2) != 0) {
            list2 = callStateResponseFields.ownCapabilities;
        }
        if ((i13 & 4) != 0) {
            callResponse = callStateResponseFields.call;
        }
        if ((i13 & 8) != 0) {
            memberResponse = callStateResponseFields.membership;
        }
        return callStateResponseFields.copy(list, list2, callResponse, memberResponse);
    }

    public final List<MemberResponse> component1() {
        return this.members;
    }

    public final List<OwnCapability> component2() {
        return this.ownCapabilities;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CallResponse getCall() {
        return this.call;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MemberResponse getMembership() {
        return this.membership;
    }

    public final CallStateResponseFields copy(@InterfaceC30731q(name = QueryChannelRequest.KEY_MEMBERS) List<MemberResponse> members, @InterfaceC30731q(name = "own_capabilities") List<? extends OwnCapability> ownCapabilities, @InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallResponse call, @InterfaceC30731q(name = "membership") MemberResponse membership) {
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(call, "call");
        return new CallStateResponseFields(members, ownCapabilities, call, membership);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallStateResponseFields)) {
            return false;
        }
        CallStateResponseFields callStateResponseFields = (CallStateResponseFields) other;
        return AbstractC22676k.m65745e(this.members, callStateResponseFields.members) && AbstractC22676k.m65745e(this.ownCapabilities, callStateResponseFields.ownCapabilities) && AbstractC22676k.m65745e(this.call, callStateResponseFields.call) && AbstractC22676k.m65745e(this.membership, callStateResponseFields.membership);
    }

    public final CallResponse getCall() {
        return this.call;
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
        int iM11818b = AbstractC3855a.m11818b(this.call, AbstractC11895b.m31983b(this.members.hashCode() * 31, 31, this.ownCapabilities), 31);
        MemberResponse memberResponse = this.membership;
        return iM11818b + (memberResponse == null ? 0 : memberResponse.hashCode());
    }

    public String toString() {
        List<MemberResponse> list = this.members;
        List<OwnCapability> list2 = this.ownCapabilities;
        CallResponse callResponse = this.call;
        MemberResponse memberResponse = this.membership;
        StringBuilder sbM124380j = AbstractC38963t7.m124380j("CallStateResponseFields(members=", ", ownCapabilities=", list, ", call=", list2);
        sbM124380j.append(callResponse);
        sbM124380j.append(", membership=");
        sbM124380j.append(memberResponse);
        sbM124380j.append(")");
        return sbM124380j.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CallStateResponseFields(List list, List list2, CallResponse callResponse, MemberResponse memberResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 1;
        C25271y c25271y = C25271y.f99162w;
        this(i14 != 0 ? c25271y : list, (i13 & 2) != 0 ? c25271y : list2, callResponse, (i13 & 8) != 0 ? null : memberResponse);
    }
}
