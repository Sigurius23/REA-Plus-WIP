package io.getstream.chat.android.client.api;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/client/api/ChannelMessageLimit;", "", "channelType", "", "baseLimit", "", "<init>", "(Ljava/lang/String;I)V", "getChannelType", "()Ljava/lang/String;", "getBaseLimit", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelMessageLimit {
    private final int baseLimit;
    private final String channelType;

    public ChannelMessageLimit(String channelType, int i13) {
        AbstractC22676k.m65750j(channelType, "channelType");
        this.channelType = channelType;
        this.baseLimit = i13;
    }

    public static /* synthetic */ ChannelMessageLimit copy$default(ChannelMessageLimit channelMessageLimit, String str, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = channelMessageLimit.channelType;
        }
        if ((i14 & 2) != 0) {
            i13 = channelMessageLimit.baseLimit;
        }
        return channelMessageLimit.copy(str, i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBaseLimit() {
        return this.baseLimit;
    }

    public final ChannelMessageLimit copy(String channelType, int baseLimit) {
        AbstractC22676k.m65750j(channelType, "channelType");
        return new ChannelMessageLimit(channelType, baseLimit);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelMessageLimit)) {
            return false;
        }
        ChannelMessageLimit channelMessageLimit = (ChannelMessageLimit) other;
        return AbstractC22676k.m65745e(this.channelType, channelMessageLimit.channelType) && this.baseLimit == channelMessageLimit.baseLimit;
    }

    public final int getBaseLimit() {
        return this.baseLimit;
    }

    public final String getChannelType() {
        return this.channelType;
    }

    public final int hashCode() {
        return Integer.hashCode(this.baseLimit) + (this.channelType.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC11895b.m31993l(this.baseLimit, "ChannelMessageLimit(channelType=", this.channelType, ", baseLimit=", ")");
    }
}
