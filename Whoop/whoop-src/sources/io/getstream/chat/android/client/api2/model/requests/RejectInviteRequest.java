package io.getstream.chat.android.client.api2.model.requests;

import c13.AbstractC3855a;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/RejectInviteRequest;", "", "reject_invite", "", "<init>", "(Z)V", "getReject_invite", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class RejectInviteRequest {
    private final boolean reject_invite;

    public RejectInviteRequest() {
        this(false, 1, null);
    }

    public static /* synthetic */ RejectInviteRequest copy$default(RejectInviteRequest rejectInviteRequest, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = rejectInviteRequest.reject_invite;
        }
        return rejectInviteRequest.copy(z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getReject_invite() {
        return this.reject_invite;
    }

    public final RejectInviteRequest copy(boolean reject_invite) {
        return new RejectInviteRequest(reject_invite);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RejectInviteRequest) && this.reject_invite == ((RejectInviteRequest) other).reject_invite;
    }

    public final boolean getReject_invite() {
        return this.reject_invite;
    }

    public int hashCode() {
        return Boolean.hashCode(this.reject_invite);
    }

    public String toString() {
        return AbstractC3855a.m11827k("RejectInviteRequest(reject_invite=", ")", this.reject_invite);
    }

    public RejectInviteRequest(boolean z4) {
        this.reject_invite = z4;
    }

    public /* synthetic */ RejectInviteRequest(boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4);
    }
}
