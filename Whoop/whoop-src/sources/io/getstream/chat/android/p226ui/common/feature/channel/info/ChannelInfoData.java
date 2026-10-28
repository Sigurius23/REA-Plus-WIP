package io.getstream.chat.android.p226ui.common.feature.channel.info;

import c13.AbstractC3855a;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Mute;
import java.util.List;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0003JM\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;", "", "channelData", "Lio/getstream/chat/android/models/ChannelData;", QueryChannelRequest.KEY_MEMBERS, "", "Lio/getstream/chat/android/models/Member;", "isMuted", "", "mutedUsers", "Lio/getstream/chat/android/models/Mute;", "blockedUserIds", "", "<init>", "(Lio/getstream/chat/android/models/ChannelData;Ljava/util/List;ZLjava/util/List;Ljava/util/List;)V", "getChannelData", "()Lio/getstream/chat/android/models/ChannelData;", "getMembers", "()Ljava/util/List;", "()Z", "getMutedUsers", "getBlockedUserIds", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final /* data */ class ChannelInfoData {
    private final List<String> blockedUserIds;
    private final ChannelData channelData;
    private final boolean isMuted;
    private final List<Member> members;
    private final List<Mute> mutedUsers;

    public ChannelInfoData(ChannelData channelData, List<Member> members, boolean z4, List<Mute> mutedUsers, List<String> blockedUserIds) {
        AbstractC22676k.m65750j(channelData, "channelData");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(mutedUsers, "mutedUsers");
        AbstractC22676k.m65750j(blockedUserIds, "blockedUserIds");
        this.channelData = channelData;
        this.members = members;
        this.isMuted = z4;
        this.mutedUsers = mutedUsers;
        this.blockedUserIds = blockedUserIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelInfoData copy$default(ChannelInfoData channelInfoData, ChannelData channelData, List list, boolean z4, List list2, List list3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            channelData = channelInfoData.channelData;
        }
        if ((i13 & 2) != 0) {
            list = channelInfoData.members;
        }
        if ((i13 & 4) != 0) {
            z4 = channelInfoData.isMuted;
        }
        if ((i13 & 8) != 0) {
            list2 = channelInfoData.mutedUsers;
        }
        if ((i13 & 16) != 0) {
            list3 = channelInfoData.blockedUserIds;
        }
        List list4 = list3;
        boolean z13 = z4;
        return channelInfoData.copy(channelData, list, z13, list2, list4);
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

    public final List<Mute> component4() {
        return this.mutedUsers;
    }

    public final List<String> component5() {
        return this.blockedUserIds;
    }

    public final ChannelInfoData copy(ChannelData channelData, List<Member> members, boolean isMuted, List<Mute> mutedUsers, List<String> blockedUserIds) {
        AbstractC22676k.m65750j(channelData, "channelData");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(mutedUsers, "mutedUsers");
        AbstractC22676k.m65750j(blockedUserIds, "blockedUserIds");
        return new ChannelInfoData(channelData, members, isMuted, mutedUsers, blockedUserIds);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelInfoData)) {
            return false;
        }
        ChannelInfoData channelInfoData = (ChannelInfoData) other;
        return AbstractC22676k.m65745e(this.channelData, channelInfoData.channelData) && AbstractC22676k.m65745e(this.members, channelInfoData.members) && this.isMuted == channelInfoData.isMuted && AbstractC22676k.m65745e(this.mutedUsers, channelInfoData.mutedUsers) && AbstractC22676k.m65745e(this.blockedUserIds, channelInfoData.blockedUserIds);
    }

    public final List<String> getBlockedUserIds() {
        return this.blockedUserIds;
    }

    public final ChannelData getChannelData() {
        return this.channelData;
    }

    public final List<Member> getMembers() {
        return this.members;
    }

    public final List<Mute> getMutedUsers() {
        return this.mutedUsers;
    }

    public final int hashCode() {
        return this.blockedUserIds.hashCode() + AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC11895b.m31983b(this.channelData.hashCode() * 31, 31, this.members), 31, this.isMuted), 31, this.mutedUsers);
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    public final String toString() {
        ChannelData channelData = this.channelData;
        List<Member> list = this.members;
        boolean z4 = this.isMuted;
        List<Mute> list2 = this.mutedUsers;
        List<String> list3 = this.blockedUserIds;
        StringBuilder sb4 = new StringBuilder("ChannelInfoData(channelData=");
        sb4.append(channelData);
        sb4.append(", members=");
        sb4.append(list);
        sb4.append(", isMuted=");
        AbstractC25012a.m73391x(", mutedUsers=", ", blockedUserIds=", sb4, list2, z4);
        return AbstractC3855a.m11829m(sb4, list3, ")");
    }
}
