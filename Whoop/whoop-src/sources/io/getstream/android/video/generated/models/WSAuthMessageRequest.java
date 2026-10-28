package io.getstream.android.video.generated.models;

import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/android/video/generated/models/WSAuthMessageRequest;", "Lio/getstream/android/video/generated/models/VideoEvent;", "token", "", "userDetails", "Lio/getstream/android/video/generated/models/ConnectUserDetailsRequest;", "(Ljava/lang/String;Lio/getstream/android/video/generated/models/ConnectUserDetailsRequest;)V", "getToken", "()Ljava/lang/String;", "getUserDetails", "()Lio/getstream/android/video/generated/models/ConnectUserDetailsRequest;", "component1", "component2", "copy", "equals", "", "other", "", "getEventType", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class WSAuthMessageRequest extends VideoEvent {
    private final String token;
    private final ConnectUserDetailsRequest userDetails;

    public WSAuthMessageRequest(@InterfaceC30731q(name = "token") String token, @InterfaceC30731q(name = "user_details") ConnectUserDetailsRequest userDetails) {
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(userDetails, "userDetails");
        this.token = token;
        this.userDetails = userDetails;
    }

    public static /* synthetic */ WSAuthMessageRequest copy$default(WSAuthMessageRequest wSAuthMessageRequest, String str, ConnectUserDetailsRequest connectUserDetailsRequest, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = wSAuthMessageRequest.token;
        }
        if ((i13 & 2) != 0) {
            connectUserDetailsRequest = wSAuthMessageRequest.userDetails;
        }
        return wSAuthMessageRequest.copy(str, connectUserDetailsRequest);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConnectUserDetailsRequest getUserDetails() {
        return this.userDetails;
    }

    public final WSAuthMessageRequest copy(@InterfaceC30731q(name = "token") String token, @InterfaceC30731q(name = "user_details") ConnectUserDetailsRequest userDetails) {
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(userDetails, "userDetails");
        return new WSAuthMessageRequest(token, userDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WSAuthMessageRequest)) {
            return false;
        }
        WSAuthMessageRequest wSAuthMessageRequest = (WSAuthMessageRequest) other;
        return AbstractC22676k.m65745e(this.token, wSAuthMessageRequest.token) && AbstractC22676k.m65745e(this.userDetails, wSAuthMessageRequest.userDetails);
    }

    @Override // io.getstream.android.video.generated.models.VideoEvent
    /* JADX INFO: renamed from: getEventType */
    public String getType() {
        return "authenticate";
    }

    public final String getToken() {
        return this.token;
    }

    public final ConnectUserDetailsRequest getUserDetails() {
        return this.userDetails;
    }

    public int hashCode() {
        return this.userDetails.hashCode() + (this.token.hashCode() * 31);
    }

    public String toString() {
        return "WSAuthMessageRequest(token=" + this.token + ", userDetails=" + this.userDetails + ")";
    }
}
