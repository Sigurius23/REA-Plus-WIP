package io.getstream.chat.android.models;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/models/UnreadChannelByType;", "", "channelType", "", "channelsCount", "", "messagesCount", "<init>", "(Ljava/lang/String;II)V", "getChannelType", "()Ljava/lang/String;", "getChannelsCount", "()I", "getMessagesCount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UnreadChannelByType {
    private final String channelType;
    private final int channelsCount;
    private final int messagesCount;

    public UnreadChannelByType(String channelType, int i13, int i14) {
        AbstractC22676k.m65750j(channelType, "channelType");
        this.channelType = channelType;
        this.channelsCount = i13;
        this.messagesCount = i14;
    }

    public static /* synthetic */ UnreadChannelByType copy$default(UnreadChannelByType unreadChannelByType, String str, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = unreadChannelByType.channelType;
        }
        if ((i15 & 2) != 0) {
            i13 = unreadChannelByType.channelsCount;
        }
        if ((i15 & 4) != 0) {
            i14 = unreadChannelByType.messagesCount;
        }
        return unreadChannelByType.copy(str, i13, i14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getChannelsCount() {
        return this.channelsCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMessagesCount() {
        return this.messagesCount;
    }

    public final UnreadChannelByType copy(String channelType, int channelsCount, int messagesCount) {
        AbstractC22676k.m65750j(channelType, "channelType");
        return new UnreadChannelByType(channelType, channelsCount, messagesCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnreadChannelByType)) {
            return false;
        }
        UnreadChannelByType unreadChannelByType = (UnreadChannelByType) other;
        return AbstractC22676k.m65745e(this.channelType, unreadChannelByType.channelType) && this.channelsCount == unreadChannelByType.channelsCount && this.messagesCount == unreadChannelByType.messagesCount;
    }

    public final String getChannelType() {
        return this.channelType;
    }

    public final int getChannelsCount() {
        return this.channelsCount;
    }

    public final int getMessagesCount() {
        return this.messagesCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.messagesCount) + AbstractC11266d.m30448b(this.channelsCount, this.channelType.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.channelType;
        int i13 = this.channelsCount;
        return AbstractC18489d0.m53371l(AbstractC11266d.m30467u(i13, "UnreadChannelByType(channelType=", str, ", channelsCount=", ", messagesCount="), this.messagesCount, ")");
    }
}
