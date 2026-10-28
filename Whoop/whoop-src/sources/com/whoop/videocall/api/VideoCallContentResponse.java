package com.whoop.videocall.api;

import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.items.ImageUrlModel;
import com.whoop.design.models.items.NavigationBarModel;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.modal.DialogModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J8\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!¨\u00066"}, m65681d2 = {"Lcom/whoop/videocall/api/VideoCallContentResponse;", "", "", "callId", "Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;", "waitingRoom", "Lcom/whoop/videocall/api/VideoCallParticipantsModel;", "participants", "Lcom/whoop/videocall/api/VideoCallPermissionsModel;", "permissions", "<init>", "(Ljava/lang/String;Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;Lcom/whoop/videocall/api/VideoCallParticipantsModel;Lcom/whoop/videocall/api/VideoCallPermissionsModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;Lcom/whoop/videocall/api/VideoCallParticipantsModel;Lcom/whoop/videocall/api/VideoCallPermissionsModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$video_call_release", "(Lcom/whoop/videocall/api/VideoCallContentResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;", "component3", "()Lcom/whoop/videocall/api/VideoCallParticipantsModel;", "component4", "()Lcom/whoop/videocall/api/VideoCallPermissionsModel;", "copy", "(Ljava/lang/String;Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;Lcom/whoop/videocall/api/VideoCallParticipantsModel;Lcom/whoop/videocall/api/VideoCallPermissionsModel;)Lcom/whoop/videocall/api/VideoCallContentResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallId", "Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;", "getWaitingRoom", "Lcom/whoop/videocall/api/VideoCallParticipantsModel;", "getParticipants", "Lcom/whoop/videocall/api/VideoCallPermissionsModel;", "getPermissions", "Companion", "$serializer", "a", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class VideoCallContentResponse {
    public static final int $stable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String callId;
    private final VideoCallParticipantsModel participants;
    private final VideoCallPermissionsModel permissions;
    private final VideoCallWaitingRoomModel waitingRoom;

    /* JADX INFO: renamed from: com.whoop.videocall.api.VideoCallContentResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/videocall/api/VideoCallContentResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/videocall/api/VideoCallContentResponse;", "serializer", "()Lwc3/c;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return VideoCallContentResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        int i13 = DialogModel.$stable | SecondaryButtonModel.$stable | InfoCalloutTileModel.$stable;
        int i14 = ImageUrlModel.$stable;
        $stable = i13 | i14 | i14 | NavigationBarModel.$stable;
    }

    public /* synthetic */ VideoCallContentResponse(int i13, String str, VideoCallWaitingRoomModel videoCallWaitingRoomModel, VideoCallParticipantsModel videoCallParticipantsModel, VideoCallPermissionsModel videoCallPermissionsModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, VideoCallContentResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.callId = str;
        this.waitingRoom = videoCallWaitingRoomModel;
        this.participants = videoCallParticipantsModel;
        this.permissions = videoCallPermissionsModel;
    }

    public static /* synthetic */ VideoCallContentResponse copy$default(VideoCallContentResponse videoCallContentResponse, String str, VideoCallWaitingRoomModel videoCallWaitingRoomModel, VideoCallParticipantsModel videoCallParticipantsModel, VideoCallPermissionsModel videoCallPermissionsModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = videoCallContentResponse.callId;
        }
        if ((i13 & 2) != 0) {
            videoCallWaitingRoomModel = videoCallContentResponse.waitingRoom;
        }
        if ((i13 & 4) != 0) {
            videoCallParticipantsModel = videoCallContentResponse.participants;
        }
        if ((i13 & 8) != 0) {
            videoCallPermissionsModel = videoCallContentResponse.permissions;
        }
        return videoCallContentResponse.copy(str, videoCallWaitingRoomModel, videoCallParticipantsModel, videoCallPermissionsModel);
    }

    public static final /* synthetic */ void write$Self$video_call_release(VideoCallContentResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.callId);
        output.encodeSerializableElement(serialDesc, 1, VideoCallWaitingRoomModel$$serializer.INSTANCE, self.waitingRoom);
        output.encodeSerializableElement(serialDesc, 2, VideoCallParticipantsModel$$serializer.INSTANCE, self.participants);
        output.encodeSerializableElement(serialDesc, 3, VideoCallPermissionsModel$$serializer.INSTANCE, self.permissions);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VideoCallWaitingRoomModel getWaitingRoom() {
        return this.waitingRoom;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VideoCallParticipantsModel getParticipants() {
        return this.participants;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final VideoCallPermissionsModel getPermissions() {
        return this.permissions;
    }

    public final VideoCallContentResponse copy(String callId, VideoCallWaitingRoomModel waitingRoom, VideoCallParticipantsModel participants, VideoCallPermissionsModel permissions) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(waitingRoom, "waitingRoom");
        AbstractC22676k.m65750j(participants, "participants");
        AbstractC22676k.m65750j(permissions, "permissions");
        return new VideoCallContentResponse(callId, waitingRoom, participants, permissions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCallContentResponse)) {
            return false;
        }
        VideoCallContentResponse videoCallContentResponse = (VideoCallContentResponse) other;
        return AbstractC22676k.m65745e(this.callId, videoCallContentResponse.callId) && AbstractC22676k.m65745e(this.waitingRoom, videoCallContentResponse.waitingRoom) && AbstractC22676k.m65745e(this.participants, videoCallContentResponse.participants) && AbstractC22676k.m65745e(this.permissions, videoCallContentResponse.permissions);
    }

    public final String getCallId() {
        return this.callId;
    }

    public final VideoCallParticipantsModel getParticipants() {
        return this.participants;
    }

    public final VideoCallPermissionsModel getPermissions() {
        return this.permissions;
    }

    public final VideoCallWaitingRoomModel getWaitingRoom() {
        return this.waitingRoom;
    }

    public int hashCode() {
        return this.permissions.hashCode() + ((this.participants.hashCode() + ((this.waitingRoom.hashCode() + (this.callId.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "VideoCallContentResponse(callId=" + this.callId + ", waitingRoom=" + this.waitingRoom + ", participants=" + this.participants + ", permissions=" + this.permissions + ")";
    }

    public VideoCallContentResponse(String callId, VideoCallWaitingRoomModel waitingRoom, VideoCallParticipantsModel participants, VideoCallPermissionsModel permissions) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(waitingRoom, "waitingRoom");
        AbstractC22676k.m65750j(participants, "participants");
        AbstractC22676k.m65750j(permissions, "permissions");
        this.callId = callId;
        this.waitingRoom = waitingRoom;
        this.participants = participants;
        this.permissions = permissions;
    }
}
