package io.getstream.chat.android.client.api.state;

import androidx.health.platform.client.proto.C1533u;
import bc3.InterfaceC3027k1;
import io.getstream.chat.android.client.api2.mapping.FilterDomainMappingKt;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.QueryChannelsDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal.SyncStateDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadOrderDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserDao_Impl;
import io.getstream.chat.android.client.internal.state.event.handler.internal.EventBatchUpdate;
import io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential;
import io.getstream.chat.android.client.internal.state.event.handler.internal.batch.SocketEventCollector;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelEventHandlerImpl;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelStateLogic;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateLegacyImpl;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.ChannelUserRead;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Message;
import java.util.Map;
import l83.C23454a0;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.api.state.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19031a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73738w;

    public /* synthetic */ C19031a(int i13) {
        this.f73738w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        switch (this.f73738w) {
            case 0:
                return ChatClientExtensions.m54559g((InterfaceC3027k1) obj);
            case 1:
                return ChatClientExtensions.m54556d((InterfaceC3027k1) obj);
            case 2:
                return ChatClientExtensions.m54554b((InterfaceC3027k1) obj);
            case 3:
                return FilterDomainMappingKt.parseSingleEntry$lambda$1((FilterObject[]) obj);
            case 4:
                return FilterDomainMappingKt.parseSingleEntry$lambda$2((FilterObject[]) obj);
            case 5:
                return FilterDomainMappingKt.parseSingleEntry$lambda$3((FilterObject[]) obj);
            case 6:
                return ChannelDao_Impl.m54679e((InterfaceC33687a) obj);
            case 7:
                ChannelDao_Impl.deleteAll$lambda$14("DELETE FROM stream_chat_channel_state", (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 8:
                ChannelConfigDao_Impl.deleteConfigs$lambda$5("DELETE FROM stream_chat_channel_config", (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 9:
                ChannelConfigDao_Impl.deleteCommands$lambda$4("DELETE FROM command_inner_entity", (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 10:
                MessageDao_Impl.deleteAll$lambda$30("DELETE FROM stream_chat_message", (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 11:
                MessageDao_Impl.deleteAllDrafts$lambda$31("DELETE FROM stream_chat_draft_message_entity", (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 12:
                ReplyMessageDao_Impl.deleteAll$lambda$4("DELETE FROM stream_chat_reply_message", (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 13:
                QueryChannelsDao_Impl.deleteAll$lambda$2("DELETE FROM stream_channel_query", (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 14:
                ReactionDao_Impl.deleteAll$lambda$9("DELETE FROM stream_chat_reaction", (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 15:
                SyncStateDao_Impl.deleteAll$lambda$2("DELETE FROM stream_sync_state", (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 16:
                ThreadDao_Impl.deleteAll$lambda$5("DELETE from stream_chat_thread", (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                ThreadOrderDao_Impl.deleteAll$lambda$2("DELETE from stream_chat_thread_order", (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                UserDao_Impl.deleteAll$lambda$6("DELETE FROM stream_chat_user", (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return EventBatchUpdate.getPoll$lambda$2((Message) obj);
            case 20:
                return EventHandlerSequential.m54782c((ChatEvent) obj);
            case 21:
                return SocketEventCollector.doFire$lambda$12((ChatEvent) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ChannelEventHandlerImpl.deleteReminder$lambda$5((Message) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ChannelStateLogic.removeMembership$lambda$7((ChannelData) obj);
            case 24:
                return ChannelStateImpl.messageCount$lambda$20((ChannelData) obj);
            case 25:
                return ChannelStateImpl.m54824m((Map) obj);
            case 26:
                return ChannelStateImpl.reads$lambda$9((Map) obj);
            case 27:
                return Integer.valueOf(ChannelStateImpl.unreadCount$lambda$12((ChannelUserRead) obj));
            case 28:
                return ChannelStateImpl.deleteMembership$lambda$129((ChannelData) obj);
            default:
                ChannelStateLegacyImpl.messagesTransformation$lambda$11((Message) obj);
                return Boolean.TRUE;
        }
    }
}
