package io.getstream.chat.android.client.api2.model.requests;

import live.hms.video.utils.HMSFieldTrials;
import p031b9.AbstractC2875y;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/VideoCallCreateRequest;", "", "id", "", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class VideoCallCreateRequest {
    private final String id;
    private final String type;

    public VideoCallCreateRequest(String id4, String type) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        this.id = id4;
        this.type = type;
    }

    public static /* synthetic */ VideoCallCreateRequest copy$default(VideoCallCreateRequest videoCallCreateRequest, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = videoCallCreateRequest.id;
        }
        if ((i13 & 2) != 0) {
            str2 = videoCallCreateRequest.type;
        }
        return videoCallCreateRequest.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final VideoCallCreateRequest copy(String id4, String type) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        return new VideoCallCreateRequest(id4, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCallCreateRequest)) {
            return false;
        }
        VideoCallCreateRequest videoCallCreateRequest = (VideoCallCreateRequest) other;
        return AbstractC22676k.m65745e(this.id, videoCallCreateRequest.id) && AbstractC22676k.m65745e(this.type, videoCallCreateRequest.type);
    }

    public final String getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("VideoCallCreateRequest(id=", this.id, ", type=", this.type, ")");
    }
}
