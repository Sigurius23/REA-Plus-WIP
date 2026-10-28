package io.getstream.chat.android.client.api2.model.dto;

import live.hms.video.utils.HMSFieldTrials;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;", "", "channel_role", "", "<init>", "(Ljava/lang/String;)V", "getChannel_role", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamMemberInfoDto {
    private final String channel_role;

    public DownstreamMemberInfoDto(String str) {
        this.channel_role = str;
    }

    public static /* synthetic */ DownstreamMemberInfoDto copy$default(DownstreamMemberInfoDto downstreamMemberInfoDto, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = downstreamMemberInfoDto.channel_role;
        }
        return downstreamMemberInfoDto.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel_role() {
        return this.channel_role;
    }

    public final DownstreamMemberInfoDto copy(String channel_role) {
        return new DownstreamMemberInfoDto(channel_role);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DownstreamMemberInfoDto) && AbstractC22676k.m65745e(this.channel_role, ((DownstreamMemberInfoDto) other).channel_role);
    }

    public final String getChannel_role() {
        return this.channel_role;
    }

    public int hashCode() {
        String str = this.channel_role;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return AbstractC11895b.m31996o("DownstreamMemberInfoDto(channel_role=", this.channel_role, ")");
    }
}
