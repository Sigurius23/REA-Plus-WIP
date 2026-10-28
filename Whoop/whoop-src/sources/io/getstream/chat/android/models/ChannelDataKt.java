package io.getstream.chat.android.models;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.Date;
import java.util.List;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0003"}, m65681d2 = {"mergeFromEvent", "Lio/getstream/chat/android/models/ChannelData;", "that", "stream-chat-android-core"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelDataKt {
    @InternalStreamChatApi
    public static final ChannelData mergeFromEvent(ChannelData channelData, ChannelData that) {
        AbstractC22676k.m65750j(channelData, "<this>");
        AbstractC22676k.m65750j(that, "that");
        String name = that.getName();
        String image = that.getImage();
        List<String> filterTags = that.getFilterTags();
        boolean frozen = that.getFrozen();
        int cooldown = that.getCooldown();
        String team = that.getTeam();
        Map<String, Object> extraData = that.getExtraData();
        int memberCount = that.getMemberCount();
        Date createdAt = that.getCreatedAt();
        Date updatedAt = that.getUpdatedAt();
        Date deletedAt = that.getDeletedAt();
        User createdBy = that.getCreatedBy();
        Integer messageCount = that.getMessageCount();
        if (messageCount == null) {
            messageCount = channelData.getMessageCount();
        }
        return ChannelData.copy$default(channelData, null, null, name, image, createdBy, cooldown, frozen, createdAt, updatedAt, deletedAt, memberCount, team, extraData, null, null, null, messageCount, null, filterTags, that.getLastMessageAt(), 188419, null);
    }
}
