package io.getstream.chat.android.client.api2.model.dto;

import live.hms.video.utils.HMSFieldTrials;
import p031b9.AbstractC2875y;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelCustomDto;", "", "name", "", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getImage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamChannelCustomDto {
    private final String image;
    private final String name;

    public DownstreamChannelCustomDto(String str, String str2) {
        this.name = str;
        this.image = str2;
    }

    public static /* synthetic */ DownstreamChannelCustomDto copy$default(DownstreamChannelCustomDto downstreamChannelCustomDto, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = downstreamChannelCustomDto.name;
        }
        if ((i13 & 2) != 0) {
            str2 = downstreamChannelCustomDto.image;
        }
        return downstreamChannelCustomDto.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final DownstreamChannelCustomDto copy(String name, String image) {
        return new DownstreamChannelCustomDto(name, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamChannelCustomDto)) {
            return false;
        }
        DownstreamChannelCustomDto downstreamChannelCustomDto = (DownstreamChannelCustomDto) other;
        return AbstractC22676k.m65745e(this.name, downstreamChannelCustomDto.name) && AbstractC22676k.m65745e(this.image, downstreamChannelCustomDto.image);
    }

    public final String getImage() {
        return this.image;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.image;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return AbstractC2875y.m8300m("DownstreamChannelCustomDto(name=", this.name, ", image=", this.image, ")");
    }
}
