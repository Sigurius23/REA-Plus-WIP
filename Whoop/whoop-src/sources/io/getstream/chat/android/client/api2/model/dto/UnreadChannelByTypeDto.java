package io.getstream.chat.android.client.api2.model.dto;

import ih0.AbstractC18489d0;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UnreadChannelByTypeDto;", "", "channel_type", "", "channel_count", "", "unread_count", "<init>", "(Ljava/lang/String;II)V", "getChannel_type", "()Ljava/lang/String;", "getChannel_count", "()I", "getUnread_count", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UnreadChannelByTypeDto {
    private final int channel_count;
    private final String channel_type;
    private final int unread_count;

    public UnreadChannelByTypeDto(String channel_type, int i13, int i14) {
        AbstractC22676k.m65750j(channel_type, "channel_type");
        this.channel_type = channel_type;
        this.channel_count = i13;
        this.unread_count = i14;
    }

    public static /* synthetic */ UnreadChannelByTypeDto copy$default(UnreadChannelByTypeDto unreadChannelByTypeDto, String str, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = unreadChannelByTypeDto.channel_type;
        }
        if ((i15 & 2) != 0) {
            i13 = unreadChannelByTypeDto.channel_count;
        }
        if ((i15 & 4) != 0) {
            i14 = unreadChannelByTypeDto.unread_count;
        }
        return unreadChannelByTypeDto.copy(str, i13, i14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel_type() {
        return this.channel_type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getChannel_count() {
        return this.channel_count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUnread_count() {
        return this.unread_count;
    }

    public final UnreadChannelByTypeDto copy(String channel_type, int channel_count, int unread_count) {
        AbstractC22676k.m65750j(channel_type, "channel_type");
        return new UnreadChannelByTypeDto(channel_type, channel_count, unread_count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnreadChannelByTypeDto)) {
            return false;
        }
        UnreadChannelByTypeDto unreadChannelByTypeDto = (UnreadChannelByTypeDto) other;
        return AbstractC22676k.m65745e(this.channel_type, unreadChannelByTypeDto.channel_type) && this.channel_count == unreadChannelByTypeDto.channel_count && this.unread_count == unreadChannelByTypeDto.unread_count;
    }

    public final int getChannel_count() {
        return this.channel_count;
    }

    public final String getChannel_type() {
        return this.channel_type;
    }

    public final int getUnread_count() {
        return this.unread_count;
    }

    public int hashCode() {
        return Integer.hashCode(this.unread_count) + AbstractC11266d.m30448b(this.channel_count, this.channel_type.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.channel_type;
        int i13 = this.channel_count;
        return AbstractC18489d0.m53371l(AbstractC11266d.m30467u(i13, "UnreadChannelByTypeDto(channel_type=", str, ", channel_count=", ", unread_count="), this.unread_count, ")");
    }
}
