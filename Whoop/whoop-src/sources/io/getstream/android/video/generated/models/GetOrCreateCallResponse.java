package io.getstream.android.video.generated.models;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import jh3.AbstractC21702c;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003JS\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0003\u0010\u000b\u001a\u00020\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006&"}, m65681d2 = {"Lio/getstream/android/video/generated/models/GetOrCreateCallResponse;", "", AnalyticsRequestV2.PARAM_CREATED, "", AttachmentExtensionsKt.EXTRA_DURATION, "", QueryChannelRequest.KEY_MEMBERS, "", "Lio/getstream/android/video/generated/models/MemberResponse;", "ownCapabilities", "Lio/getstream/android/video/generated/models/OwnCapability;", NotificationCompat.CATEGORY_CALL, "Lio/getstream/android/video/generated/models/CallResponse;", "membership", "(ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/MemberResponse;)V", "getCall", "()Lio/getstream/android/video/generated/models/CallResponse;", "getCreated", "()Z", "getDuration", "()Ljava/lang/String;", "getMembers", "()Ljava/util/List;", "getMembership", "()Lio/getstream/android/video/generated/models/MemberResponse;", "getOwnCapabilities", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class GetOrCreateCallResponse {
    private final CallResponse call;
    private final boolean created;
    private final String duration;
    private final List<MemberResponse> members;
    private final MemberResponse membership;
    private final List<OwnCapability> ownCapabilities;

    /* JADX WARN: Multi-variable type inference failed */
    public GetOrCreateCallResponse(@InterfaceC30731q(name = AnalyticsRequestV2.PARAM_CREATED) boolean z4, @InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = QueryChannelRequest.KEY_MEMBERS) List<MemberResponse> members, @InterfaceC30731q(name = "own_capabilities") List<? extends OwnCapability> ownCapabilities, @InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallResponse call, @InterfaceC30731q(name = "membership") MemberResponse memberResponse) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(call, "call");
        this.created = z4;
        this.duration = duration;
        this.members = members;
        this.ownCapabilities = ownCapabilities;
        this.call = call;
        this.membership = memberResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetOrCreateCallResponse copy$default(GetOrCreateCallResponse getOrCreateCallResponse, boolean z4, String str, List list, List list2, CallResponse callResponse, MemberResponse memberResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = getOrCreateCallResponse.created;
        }
        if ((i13 & 2) != 0) {
            str = getOrCreateCallResponse.duration;
        }
        if ((i13 & 4) != 0) {
            list = getOrCreateCallResponse.members;
        }
        if ((i13 & 8) != 0) {
            list2 = getOrCreateCallResponse.ownCapabilities;
        }
        if ((i13 & 16) != 0) {
            callResponse = getOrCreateCallResponse.call;
        }
        if ((i13 & 32) != 0) {
            memberResponse = getOrCreateCallResponse.membership;
        }
        CallResponse callResponse2 = callResponse;
        MemberResponse memberResponse2 = memberResponse;
        return getOrCreateCallResponse.copy(z4, str, list, list2, callResponse2, memberResponse2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCreated() {
        return this.created;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    public final List<MemberResponse> component3() {
        return this.members;
    }

    public final List<OwnCapability> component4() {
        return this.ownCapabilities;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CallResponse getCall() {
        return this.call;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MemberResponse getMembership() {
        return this.membership;
    }

    public final GetOrCreateCallResponse copy(@InterfaceC30731q(name = AnalyticsRequestV2.PARAM_CREATED) boolean created, @InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = QueryChannelRequest.KEY_MEMBERS) List<MemberResponse> members, @InterfaceC30731q(name = "own_capabilities") List<? extends OwnCapability> ownCapabilities, @InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallResponse call, @InterfaceC30731q(name = "membership") MemberResponse membership) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(call, "call");
        return new GetOrCreateCallResponse(created, duration, members, ownCapabilities, call, membership);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetOrCreateCallResponse)) {
            return false;
        }
        GetOrCreateCallResponse getOrCreateCallResponse = (GetOrCreateCallResponse) other;
        return this.created == getOrCreateCallResponse.created && AbstractC22676k.m65745e(this.duration, getOrCreateCallResponse.duration) && AbstractC22676k.m65745e(this.members, getOrCreateCallResponse.members) && AbstractC22676k.m65745e(this.ownCapabilities, getOrCreateCallResponse.ownCapabilities) && AbstractC22676k.m65745e(this.call, getOrCreateCallResponse.call) && AbstractC22676k.m65745e(this.membership, getOrCreateCallResponse.membership);
    }

    public final CallResponse getCall() {
        return this.call;
    }

    public final boolean getCreated() {
        return this.created;
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
        int iM11818b = AbstractC3855a.m11818b(this.call, AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30450d(Boolean.hashCode(this.created) * 31, 31, this.duration), 31, this.members), 31, this.ownCapabilities), 31);
        MemberResponse memberResponse = this.membership;
        return iM11818b + (memberResponse == null ? 0 : memberResponse.hashCode());
    }

    public String toString() {
        boolean z4 = this.created;
        String str = this.duration;
        List<MemberResponse> list = this.members;
        List<OwnCapability> list2 = this.ownCapabilities;
        CallResponse callResponse = this.call;
        MemberResponse memberResponse = this.membership;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("GetOrCreateCallResponse(created=", ", duration=", str, ", members=", z4);
        AbstractC21702c.m61148s(sbM38567n, list, ", ownCapabilities=", list2, ", call=");
        sbM38567n.append(callResponse);
        sbM38567n.append(", membership=");
        sbM38567n.append(memberResponse);
        sbM38567n.append(")");
        return sbM38567n.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GetOrCreateCallResponse(boolean z4, String str, List list, List list2, CallResponse callResponse, MemberResponse memberResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 4;
        C25271y c25271y = C25271y.f99162w;
        this(z4, str, i14 != 0 ? c25271y : list, (i13 & 8) != 0 ? c25271y : list2, callResponse, (i13 & 32) != 0 ? null : memberResponse);
    }
}
