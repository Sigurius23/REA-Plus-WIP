package io.getstream.chat.android.p226ui.common.feature.channel.info;

import c13.AbstractC3855a;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Mute;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006$"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;", "", "channelData", "Lio/getstream/chat/android/models/ChannelData;", "member", "Lio/getstream/chat/android/models/Member;", "distinctChannel", "Lio/getstream/chat/android/models/Channel;", "mutedUsers", "", "Lio/getstream/chat/android/models/Mute;", "blockedUserIds", "", "<init>", "(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/List;)V", "getChannelData", "()Lio/getstream/chat/android/models/ChannelData;", "getMember", "()Lio/getstream/chat/android/models/Member;", "getDistinctChannel", "()Lio/getstream/chat/android/models/Channel;", "getMutedUsers", "()Ljava/util/List;", "getBlockedUserIds", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final /* data */ class ChannelInfoMemberData {
    private final List<String> blockedUserIds;
    private final ChannelData channelData;
    private final Channel distinctChannel;
    private final Member member;
    private final List<Mute> mutedUsers;

    public ChannelInfoMemberData(ChannelData channelData, Member member, Channel channel, List<Mute> mutedUsers, List<String> blockedUserIds) {
        AbstractC22676k.m65750j(channelData, "channelData");
        AbstractC22676k.m65750j(member, "member");
        AbstractC22676k.m65750j(mutedUsers, "mutedUsers");
        AbstractC22676k.m65750j(blockedUserIds, "blockedUserIds");
        this.channelData = channelData;
        this.member = member;
        this.distinctChannel = channel;
        this.mutedUsers = mutedUsers;
        this.blockedUserIds = blockedUserIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelInfoMemberData copy$default(ChannelInfoMemberData channelInfoMemberData, ChannelData channelData, Member member, Channel channel, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            channelData = channelInfoMemberData.channelData;
        }
        if ((i13 & 2) != 0) {
            member = channelInfoMemberData.member;
        }
        if ((i13 & 4) != 0) {
            channel = channelInfoMemberData.distinctChannel;
        }
        if ((i13 & 8) != 0) {
            list = channelInfoMemberData.mutedUsers;
        }
        if ((i13 & 16) != 0) {
            list2 = channelInfoMemberData.blockedUserIds;
        }
        List list3 = list2;
        Channel channel2 = channel;
        return channelInfoMemberData.copy(channelData, member, channel2, list, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChannelData getChannelData() {
        return this.channelData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Member getMember() {
        return this.member;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Channel getDistinctChannel() {
        return this.distinctChannel;
    }

    public final List<Mute> component4() {
        return this.mutedUsers;
    }

    public final List<String> component5() {
        return this.blockedUserIds;
    }

    public final ChannelInfoMemberData copy(ChannelData channelData, Member member, Channel distinctChannel, List<Mute> mutedUsers, List<String> blockedUserIds) {
        AbstractC22676k.m65750j(channelData, "channelData");
        AbstractC22676k.m65750j(member, "member");
        AbstractC22676k.m65750j(mutedUsers, "mutedUsers");
        AbstractC22676k.m65750j(blockedUserIds, "blockedUserIds");
        return new ChannelInfoMemberData(channelData, member, distinctChannel, mutedUsers, blockedUserIds);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelInfoMemberData)) {
            return false;
        }
        ChannelInfoMemberData channelInfoMemberData = (ChannelInfoMemberData) other;
        return AbstractC22676k.m65745e(this.channelData, channelInfoMemberData.channelData) && AbstractC22676k.m65745e(this.member, channelInfoMemberData.member) && AbstractC22676k.m65745e(this.distinctChannel, channelInfoMemberData.distinctChannel) && AbstractC22676k.m65745e(this.mutedUsers, channelInfoMemberData.mutedUsers) && AbstractC22676k.m65745e(this.blockedUserIds, channelInfoMemberData.blockedUserIds);
    }

    public final List<String> getBlockedUserIds() {
        return this.blockedUserIds;
    }

    public final ChannelData getChannelData() {
        return this.channelData;
    }

    public final Channel getDistinctChannel() {
        return this.distinctChannel;
    }

    public final Member getMember() {
        return this.member;
    }

    public final List<Mute> getMutedUsers() {
        return this.mutedUsers;
    }

    public final int hashCode() {
        int iHashCode = (this.member.hashCode() + (this.channelData.hashCode() * 31)) * 31;
        Channel channel = this.distinctChannel;
        return this.blockedUserIds.hashCode() + AbstractC11895b.m31983b((iHashCode + (channel == null ? 0 : channel.hashCode())) * 31, 31, this.mutedUsers);
    }

    public final String toString() {
        ChannelData channelData = this.channelData;
        Member member = this.member;
        Channel channel = this.distinctChannel;
        List<Mute> list = this.mutedUsers;
        List<String> list2 = this.blockedUserIds;
        StringBuilder sb4 = new StringBuilder("ChannelInfoMemberData(channelData=");
        sb4.append(channelData);
        sb4.append(", member=");
        sb4.append(member);
        sb4.append(", distinctChannel=");
        sb4.append(channel);
        sb4.append(", mutedUsers=");
        sb4.append(list);
        sb4.append(", blockedUserIds=");
        return AbstractC3855a.m11829m(sb4, list2, ")");
    }
}
