package io.getstream.chat.android.client.api2.model.response;

import androidx.core.app.NotificationCompat;
import io.getstream.chat.android.client.api2.model.dto.VideoCallInfoDto;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p441qx.InterfaceC30731q;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J:\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;", "", NotificationCompat.CATEGORY_CALL, "Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;", "token", "", "agoraUid", "", "agoraAppId", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getCall", "()Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;", "getToken", "()Ljava/lang/String;", "getAgoraUid", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAgoraAppId", "component1", "component2", "component3", "component4", "copy", "(Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class CreateVideoCallResponse {

    @InterfaceC30731q(name = "agora_app_id")
    private final String agoraAppId;

    @InterfaceC30731q(name = "agora_uid")
    private final Integer agoraUid;
    private final VideoCallInfoDto call;
    private final String token;

    public CreateVideoCallResponse(VideoCallInfoDto call, String token, Integer num, String str) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(token, "token");
        this.call = call;
        this.token = token;
        this.agoraUid = num;
        this.agoraAppId = str;
    }

    public static /* synthetic */ CreateVideoCallResponse copy$default(CreateVideoCallResponse createVideoCallResponse, VideoCallInfoDto videoCallInfoDto, String str, Integer num, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            videoCallInfoDto = createVideoCallResponse.call;
        }
        if ((i13 & 2) != 0) {
            str = createVideoCallResponse.token;
        }
        if ((i13 & 4) != 0) {
            num = createVideoCallResponse.agoraUid;
        }
        if ((i13 & 8) != 0) {
            str2 = createVideoCallResponse.agoraAppId;
        }
        return createVideoCallResponse.copy(videoCallInfoDto, str, num, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VideoCallInfoDto getCall() {
        return this.call;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getAgoraUid() {
        return this.agoraUid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAgoraAppId() {
        return this.agoraAppId;
    }

    public final CreateVideoCallResponse copy(VideoCallInfoDto call, String token, Integer agoraUid, String agoraAppId) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(token, "token");
        return new CreateVideoCallResponse(call, token, agoraUid, agoraAppId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateVideoCallResponse)) {
            return false;
        }
        CreateVideoCallResponse createVideoCallResponse = (CreateVideoCallResponse) other;
        return AbstractC22676k.m65745e(this.call, createVideoCallResponse.call) && AbstractC22676k.m65745e(this.token, createVideoCallResponse.token) && AbstractC22676k.m65745e(this.agoraUid, createVideoCallResponse.agoraUid) && AbstractC22676k.m65745e(this.agoraAppId, createVideoCallResponse.agoraAppId);
    }

    public final String getAgoraAppId() {
        return this.agoraAppId;
    }

    public final Integer getAgoraUid() {
        return this.agoraUid;
    }

    public final VideoCallInfoDto getCall() {
        return this.call;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.call.hashCode() * 31, 31, this.token);
        Integer num = this.agoraUid;
        int iHashCode = (iM30450d + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.agoraAppId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CreateVideoCallResponse(call=" + this.call + ", token=" + this.token + ", agoraUid=" + this.agoraUid + ", agoraAppId=" + this.agoraAppId + ")";
    }
}
