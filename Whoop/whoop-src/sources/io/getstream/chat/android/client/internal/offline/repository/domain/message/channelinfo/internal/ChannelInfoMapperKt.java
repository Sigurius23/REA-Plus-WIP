package io.getstream.chat.android.client.internal.offline.repository.domain.message.channelinfo.internal;

import io.getstream.chat.android.models.ChannelInfo;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, m65681d2 = {"toEntity", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;", "Lio/getstream/chat/android/models/ChannelInfo;", "toModel", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelInfoMapperKt {
    public static final ChannelInfoEntity toEntity(ChannelInfo channelInfo) {
        AbstractC22676k.m65750j(channelInfo, "<this>");
        return new ChannelInfoEntity(channelInfo.getCid(), channelInfo.getId(), channelInfo.getType(), Integer.valueOf(channelInfo.getMemberCount()), channelInfo.getName());
    }

    public static final ChannelInfo toModel(ChannelInfoEntity channelInfoEntity) {
        AbstractC22676k.m65750j(channelInfoEntity, "<this>");
        String cid = channelInfoEntity.getCid();
        String id4 = channelInfoEntity.getId();
        String type = channelInfoEntity.getType();
        Integer memberCount = channelInfoEntity.getMemberCount();
        return new ChannelInfo(cid, id4, type, memberCount != null ? memberCount.intValue() : 0, channelInfoEntity.getName(), null, 32, null);
    }
}
