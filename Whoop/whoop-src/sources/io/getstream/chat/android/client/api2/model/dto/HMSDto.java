package io.getstream.chat.android.client.api2.model.dto;

import live.hms.video.utils.HMSFieldTrials;
import p031b9.AbstractC2875y;
import p441qx.InterfaceC30731q;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/HMSDto;", "Lio/getstream/chat/android/client/api2/model/dto/VideoCallDto;", "roomId", "", "roomName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRoomId", "()Ljava/lang/String;", "getRoomName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class HMSDto implements VideoCallDto {

    @InterfaceC30731q(name = "room_id")
    private final String roomId;

    @InterfaceC30731q(name = "room_name")
    private final String roomName;

    public HMSDto(String roomId, String roomName) {
        AbstractC22676k.m65750j(roomId, "roomId");
        AbstractC22676k.m65750j(roomName, "roomName");
        this.roomId = roomId;
        this.roomName = roomName;
    }

    public static /* synthetic */ HMSDto copy$default(HMSDto hMSDto, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hMSDto.roomId;
        }
        if ((i13 & 2) != 0) {
            str2 = hMSDto.roomName;
        }
        return hMSDto.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoomId() {
        return this.roomId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRoomName() {
        return this.roomName;
    }

    public final HMSDto copy(String roomId, String roomName) {
        AbstractC22676k.m65750j(roomId, "roomId");
        AbstractC22676k.m65750j(roomName, "roomName");
        return new HMSDto(roomId, roomName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSDto)) {
            return false;
        }
        HMSDto hMSDto = (HMSDto) other;
        return AbstractC22676k.m65745e(this.roomId, hMSDto.roomId) && AbstractC22676k.m65745e(this.roomName, hMSDto.roomName);
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final String getRoomName() {
        return this.roomName;
    }

    public int hashCode() {
        return this.roomName.hashCode() + (this.roomId.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("HMSDto(roomId=", this.roomId, ", roomName=", this.roomName, ")");
    }
}
