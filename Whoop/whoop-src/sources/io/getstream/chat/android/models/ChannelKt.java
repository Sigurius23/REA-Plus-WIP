package io.getstream.chat.android.models;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.Date;
import java.util.List;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001¨\u0006\u0005"}, m65681d2 = {"mergeChannelFromEvent", "Lio/getstream/chat/android/models/Channel;", "that", "toChannelData", "Lio/getstream/chat/android/models/ChannelData;", "stream-chat-android-core"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelKt {
    @InternalStreamChatApi
    public static final Channel mergeChannelFromEvent(Channel channel, Channel that) {
        AbstractC22676k.m65750j(channel, "<this>");
        AbstractC22676k.m65750j(that, "that");
        String name = that.getName();
        String image = that.getImage();
        Boolean hidden = that.getHidden();
        boolean frozen = that.getFrozen();
        List<String> filterTags = that.getFilterTags();
        String team = that.getTeam();
        Config config = that.getConfig();
        Map<String, Object> extraData = that.getExtraData();
        SyncStatus syncStatus = that.getSyncStatus();
        Date hiddenMessagesBefore = that.getHiddenMessagesBefore();
        int memberCount = that.getMemberCount();
        List<Member> members = that.getMembers();
        Date createdAt = that.getCreatedAt();
        Date updatedAt = that.getUpdatedAt();
        Date deletedAt = that.getDeletedAt();
        Integer messageCount = that.getMessageCount();
        if (messageCount == null) {
            messageCount = channel.getMessageCount();
        }
        return Channel.copy$default(channel, null, null, name, image, 0, frozen, createdAt, deletedAt, updatedAt, syncStatus, memberCount, null, members, null, null, config, null, 0, team, hidden, hiddenMessagesBefore, 0, null, null, null, null, null, false, null, null, messageCount, null, filterTags, that.getLastMessageAt(), extraData, -1075615725, 0, null);
    }

    public static final ChannelData toChannelData(Channel channel) {
        AbstractC22676k.m65750j(channel, "<this>");
        String type = channel.getType();
        String id4 = channel.getId();
        String name = channel.getName();
        String image = channel.getImage();
        List<String> filterTags = channel.getFilterTags();
        boolean frozen = channel.getFrozen();
        return new ChannelData(id4, type, name, image, channel.getCreatedBy(), channel.getCooldown(), frozen, channel.getCreatedAt(), channel.getUpdatedAt(), channel.getDeletedAt(), channel.getMemberCount(), channel.getTeam(), channel.getExtraData(), channel.getOwnCapabilities(), channel.getMembership(), channel.getDraftMessage(), channel.getMessageCount(), channel.getPushPreference(), filterTags, channel.getLastMessageAt());
    }
}
