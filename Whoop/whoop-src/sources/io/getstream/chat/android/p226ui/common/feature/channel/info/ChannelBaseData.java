package io.getstream.chat.android.p226ui.common.feature.channel.info;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.Member;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;", "", "channelData", "Lio/getstream/chat/android/models/ChannelData;", QueryChannelRequest.KEY_MEMBERS, "", "Lio/getstream/chat/android/models/Member;", "isMuted", "", "<init>", "(Lio/getstream/chat/android/models/ChannelData;Ljava/util/List;Z)V", "getChannelData", "()Lio/getstream/chat/android/models/ChannelData;", "getMembers", "()Ljava/util/List;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final /* data */ class ChannelBaseData {
    private final ChannelData channelData;
    private final boolean isMuted;
    private final List<Member> members;

    public ChannelBaseData(ChannelData channelData, List<Member> members, boolean z4) {
        AbstractC22676k.m65750j(channelData, "channelData");
        AbstractC22676k.m65750j(members, "members");
        this.channelData = channelData;
        this.members = members;
        this.isMuted = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelBaseData copy$default(ChannelBaseData channelBaseData, ChannelData channelData, List list, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            channelData = channelBaseData.channelData;
        }
        if ((i13 & 2) != 0) {
            list = channelBaseData.members;
        }
        if ((i13 & 4) != 0) {
            z4 = channelBaseData.isMuted;
        }
        return channelBaseData.copy(channelData, list, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChannelData getChannelData() {
        return this.channelData;
    }

    public final List<Member> component2() {
        return this.members;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsMuted() {
        return this.isMuted;
    }

    public final ChannelBaseData copy(ChannelData channelData, List<Member> members, boolean isMuted) {
        AbstractC22676k.m65750j(channelData, "channelData");
        AbstractC22676k.m65750j(members, "members");
        return new ChannelBaseData(channelData, members, isMuted);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelBaseData)) {
            return false;
        }
        ChannelBaseData channelBaseData = (ChannelBaseData) other;
        return AbstractC22676k.m65745e(this.channelData, channelBaseData.channelData) && AbstractC22676k.m65745e(this.members, channelBaseData.members) && this.isMuted == channelBaseData.isMuted;
    }

    public final ChannelData getChannelData() {
        return this.channelData;
    }

    public final List<Member> getMembers() {
        return this.members;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isMuted) + AbstractC11895b.m31983b(this.channelData.hashCode() * 31, 31, this.members);
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    public final String toString() {
        ChannelData channelData = this.channelData;
        List<Member> list = this.members;
        boolean z4 = this.isMuted;
        StringBuilder sb4 = new StringBuilder("ChannelBaseData(channelData=");
        sb4.append(channelData);
        sb4.append(", members=");
        sb4.append(list);
        sb4.append(", isMuted=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }
}
