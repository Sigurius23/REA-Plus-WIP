package io.getstream.chat.android.client.api2.model.dto;

import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;", "", "id", "", "provider", "type", "agora", "Lio/getstream/chat/android/client/api2/model/dto/AgoraDto;", "hms", "Lio/getstream/chat/android/client/api2/model/dto/HMSDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/AgoraDto;Lio/getstream/chat/android/client/api2/model/dto/HMSDto;)V", "getId", "()Ljava/lang/String;", "getProvider", "getType", "getAgora", "()Lio/getstream/chat/android/client/api2/model/dto/AgoraDto;", "getHms", "()Lio/getstream/chat/android/client/api2/model/dto/HMSDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class VideoCallInfoDto {
    private final AgoraDto agora;
    private final HMSDto hms;
    private final String id;
    private final String provider;
    private final String type;

    public VideoCallInfoDto(String id4, String provider, String type, AgoraDto agora, HMSDto hms2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(provider, "provider");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(agora, "agora");
        AbstractC22676k.m65750j(hms2, "hms");
        this.id = id4;
        this.provider = provider;
        this.type = type;
        this.agora = agora;
        this.hms = hms2;
    }

    public static /* synthetic */ VideoCallInfoDto copy$default(VideoCallInfoDto videoCallInfoDto, String str, String str2, String str3, AgoraDto agoraDto, HMSDto hMSDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = videoCallInfoDto.id;
        }
        if ((i13 & 2) != 0) {
            str2 = videoCallInfoDto.provider;
        }
        if ((i13 & 4) != 0) {
            str3 = videoCallInfoDto.type;
        }
        if ((i13 & 8) != 0) {
            agoraDto = videoCallInfoDto.agora;
        }
        if ((i13 & 16) != 0) {
            hMSDto = videoCallInfoDto.hms;
        }
        HMSDto hMSDto2 = hMSDto;
        String str4 = str3;
        return videoCallInfoDto.copy(str, str2, str4, agoraDto, hMSDto2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AgoraDto getAgora() {
        return this.agora;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HMSDto getHms() {
        return this.hms;
    }

    public final VideoCallInfoDto copy(String id4, String provider, String type, AgoraDto agora, HMSDto hms2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(provider, "provider");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(agora, "agora");
        AbstractC22676k.m65750j(hms2, "hms");
        return new VideoCallInfoDto(id4, provider, type, agora, hms2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCallInfoDto)) {
            return false;
        }
        VideoCallInfoDto videoCallInfoDto = (VideoCallInfoDto) other;
        return AbstractC22676k.m65745e(this.id, videoCallInfoDto.id) && AbstractC22676k.m65745e(this.provider, videoCallInfoDto.provider) && AbstractC22676k.m65745e(this.type, videoCallInfoDto.type) && AbstractC22676k.m65745e(this.agora, videoCallInfoDto.agora) && AbstractC22676k.m65745e(this.hms, videoCallInfoDto.hms);
    }

    public final AgoraDto getAgora() {
        return this.agora;
    }

    public final HMSDto getHms() {
        return this.hms;
    }

    public final String getId() {
        return this.id;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.hms.hashCode() + ((this.agora.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.provider), 31, this.type)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.provider;
        String str3 = this.type;
        AgoraDto agoraDto = this.agora;
        HMSDto hMSDto = this.hms;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("VideoCallInfoDto(id=", str, ", provider=", str2, ", type=");
        sbM32001t.append(str3);
        sbM32001t.append(", agora=");
        sbM32001t.append(agoraDto);
        sbM32001t.append(", hms=");
        sbM32001t.append(hMSDto);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
