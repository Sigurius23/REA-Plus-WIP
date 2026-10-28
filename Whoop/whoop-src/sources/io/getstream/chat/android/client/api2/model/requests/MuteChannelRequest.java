package io.getstream.chat.android.client.api2.model.requests;

import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/MuteChannelRequest;", "", "channel_cid", "", "expiration", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getChannel_cid", "()Ljava/lang/String;", "getExpiration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lio/getstream/chat/android/client/api2/model/requests/MuteChannelRequest;", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MuteChannelRequest {
    private final String channel_cid;
    private final Integer expiration;

    public MuteChannelRequest(String channel_cid, Integer num) {
        AbstractC22676k.m65750j(channel_cid, "channel_cid");
        this.channel_cid = channel_cid;
        this.expiration = num;
    }

    public static /* synthetic */ MuteChannelRequest copy$default(MuteChannelRequest muteChannelRequest, String str, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = muteChannelRequest.channel_cid;
        }
        if ((i13 & 2) != 0) {
            num = muteChannelRequest.expiration;
        }
        return muteChannelRequest.copy(str, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel_cid() {
        return this.channel_cid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getExpiration() {
        return this.expiration;
    }

    public final MuteChannelRequest copy(String channel_cid, Integer expiration) {
        AbstractC22676k.m65750j(channel_cid, "channel_cid");
        return new MuteChannelRequest(channel_cid, expiration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MuteChannelRequest)) {
            return false;
        }
        MuteChannelRequest muteChannelRequest = (MuteChannelRequest) other;
        return AbstractC22676k.m65745e(this.channel_cid, muteChannelRequest.channel_cid) && AbstractC22676k.m65745e(this.expiration, muteChannelRequest.expiration);
    }

    public final String getChannel_cid() {
        return this.channel_cid;
    }

    public final Integer getExpiration() {
        return this.expiration;
    }

    public int hashCode() {
        int iHashCode = this.channel_cid.hashCode() * 31;
        Integer num = this.expiration;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "MuteChannelRequest(channel_cid=" + this.channel_cid + ", expiration=" + this.expiration + ")";
    }
}
