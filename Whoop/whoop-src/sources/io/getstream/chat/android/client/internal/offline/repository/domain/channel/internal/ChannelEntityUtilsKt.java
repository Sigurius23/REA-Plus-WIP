package io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal;

import c13.AbstractC3855a;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m65681d2 = {"lastMessageInfo", "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelEntityUtilsKt {
    public static final String lastMessageInfo(ChannelEntity channelEntity) {
        AbstractC22676k.m65750j(channelEntity, "<this>");
        return AbstractC25012a.m73376i(channelEntity.getCid(), ")", AbstractC3855a.m11830n("ChannelEntity(lastMessageId: ", channelEntity.getLastMessageId(), ", lastMessageAt: ", channelEntity.getLastMessageAt(), ", cid: "));
    }
}
